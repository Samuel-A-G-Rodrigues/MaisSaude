/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maissaude;

import java.sql.Time;
import java.util.Date;
import maissaude.cadastros.DadosUsuario;
import maissaude.cadastros.Perfil;

/**
 *
 * @author Samuel Rodrigues
 */
public class MaisSaude {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        Alimento alimento = new Alimento("Arroz", 500.0, "Grão", 100.0);
        System.out.println(alimento.toString());
        
        InformacaoNutricional informacaoNutricional = new InformacaoNutricional(500.0 , "Arroz");
        System.out.println(informacaoNutricional.toString());
        
        Date data = new Date(2001, 01, 15);
        Lembrete lembrete = new Lembrete("Comer",data);
        System.out.println(lembrete.toString()); 
        Lembrete lembrete2 = new Lembrete("Comer",data , "Comer" , true);
        System.out.println(lembrete2.toString());
        
        RefeicaoFeita refeicaoFeita = new RefeicaoFeita ("Grão", "Arroz", 500.0);
        System.out.println(refeicaoFeita.toString());
        
        Time hora = new Time(04,04,04);
        RefeicaoPrevista refeicaoPrevista = new RefeicaoPrevista (hora, "Arroz", 500.0);
        System.out.println(refeicaoPrevista.toString());
        
        Date nascimento = new Date(2001, 06, 9);
        DadosUsuario dadosUsuario = new DadosUsuario("Test", nascimento, "test@test.com" , "M", "xxxx-xxxx", "123");
        System.out.println(dadosUsuario.toString());
        
        Date registro = new Date(2020,06, 21);
        Perfil perfil = new Perfil(1.70, 60.0, registro);
        System.out.println(perfil.toString());
        
        
        Rotina rotina = new Rotina(30, 10, true);
        System.out.println(rotina.toString()); 
        rotina.updateLembrete("Dormir", data, "Tomar remedio antes de dormir", true);
        rotina.cadastrarRefeicaoPrevista(hora, "Miojo", 200.0);
        rotina.cadastrarRefeicaoFeita("Macarrão", "Miojo", 200.0);
        rotina.informacaoNutricional(400.0, "Caloria");
    }
}
