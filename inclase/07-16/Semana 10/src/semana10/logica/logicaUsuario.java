/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10.logica;

import java.util.ArrayList;
import java.util.List;
import semana10.modelos.Usuario;

/**
 *
 * @author PJ129
 */
public class logicaUsuario {
    public List<Usuario> obtenerUsuario (){
        List<Usuario> list = new ArrayList<Usuario>();
        list.add(new Usuario ("David",27));
        list.add(new Usuario ("Pedro",27));
        list.add(new Usuario ("Pepe",27));
        list.add(new Usuario ("Juan",27));
        return list;
    }
}
