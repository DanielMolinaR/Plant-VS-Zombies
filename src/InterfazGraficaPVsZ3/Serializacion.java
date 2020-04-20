/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGraficaPVsZ3;

import Clases.User;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daniel
 */
public class Serializacion {

    private static HashMap<User, Integer> usuarios; // Clave: Usuario, Valor: Puntuación. Aquí almacenaremos a los jugadores y sus puntuaciones respectivas.
    private static ArrayList<User> clasificacion = new ArrayList<>();

    public static HashMap<User, Integer> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(HashMap<User, Integer> USUARIOS) {
        usuarios = USUARIOS;
    }

    public static ArrayList<User> getClasificacion() {
        return clasificacion;
    }

    public static void setClasificacion(ArrayList<User> CLASIFICACION) {
        clasificacion = CLASIFICACION;
    }

    public static void cargarDatos() {
        /**
         * Recuperará el HashMap si había usuarios registrados o creará un nuevo
         * registro.
         */
        try {
            ObjectInputStream recuperandoFichero = new ObjectInputStream(new FileInputStream("GuardadoDatos.txt"));
            usuarios = (HashMap) recuperandoFichero.readObject();
            for (User u : usuarios.keySet()) {
                clasificacion.add(u);
            }
            recuperandoFichero.close();
        } catch (IOException | ClassNotFoundException e) {
            usuarios = new HashMap<>();
            JOptionPane.showMessageDialog(new JFrame(), "Registro usuarios vacío");
        }
    }

    public static void guardarUsuario(User u) {
        /**
         * Añade un usuario al registro HashMap y lo actualiza y guarda en el archivo GuardadoDatos.txt.
         */
        usuarios.put(u, 0);
        try {
            FileOutputStream fos = new FileOutputStream("GuardadoDatos.txt");
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream(fos);
            escribiendoFichero.writeObject(usuarios);
            escribiendoFichero.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(new JFrame(), "ERROR I/O");
        }
    }

    public static void ordenarClasificacion() {
        Comparator ComparaUsuario = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                User j1 = (User) o1;
                User j2 = (User) o2;
                return new Integer(j1.getPoints()).compareTo(new Integer(j2.getPoints()));
            }
        };
        Collections.sort(clasificacion, ComparaUsuario);
        Collections.reverse(clasificacion);
    }
    
    public static void eliminarUsuario(User usuario){
        /** 
         * Se encarga de eliminar al usuario y actualiza el registro HashMap de usuarios.
         */
        JOptionPane.showMessageDialog(new JFrame(), "Usuario "+usuario.getUsername()+" eliminado.");
        usuarios.remove(usuario);
        try {
            FileOutputStream fos = new FileOutputStream("GuardadoDatos.txt");
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream(fos);
            escribiendoFichero.writeObject(usuarios);
            escribiendoFichero.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(new JFrame(), "ERROR I/O");
        }
    }

    public static void mostrarRanking(JTable jt){
        /**
         * Muestra la clasificación e información de los jugadores.
         */
        DefaultTableModel tablaUsuario = (DefaultTableModel) jt.getModel();
        Serializacion.cargarDatos();
        String[] usuarioDatos = new String[1];
        if(!usuarios.isEmpty()){
            for(User u : usuarios.keySet()){
                usuarioDatos[0] = "User: "+u.getUsername()+" DNI: "+u.getDni()+" Points: "+u.getPoints();
                clasificacion.add(u);
                tablaUsuario.addRow(usuarioDatos); // Añadimos una fila cuando tengamos un usuario.
            }
        }
        
    }
}
