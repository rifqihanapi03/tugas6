/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rifqihanapi.latihanmvcdao.main;

import edu.rifqihanapi.latihanmvcdao.database.KingsBarbershopDatabase;
import edu.rifqihanapi.latihanmvcdao.entity.Pelanggan;
import edu.rifqihanapi.latihanmvcdao.error.PelangganException;
import edu.rifqihanapi.latihanmvcdao.service.PelangganDao;
import java.sql.SQLException;

/**
 *
 * @author Qhi
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        PelangganDao dao = KingsBarbershopDatabase.getPelangganDao();
        Pelanggan pelanggan = dao.getPelanggan(7);
        pelanggan.setNama("Mochamad Rizal F");
        pelanggan.setAlamat("Jl mengger girang no 5");
        
        dao.updatePelanggan(pelanggan);
        
    }

}
