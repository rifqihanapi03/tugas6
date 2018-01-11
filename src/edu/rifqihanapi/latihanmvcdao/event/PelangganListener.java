/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rifqihanapi.latihanmvcdao.event;

import edu.rifqihanapi.latihanmvcdao.entity.Pelanggan;
import edu.rifqihanapi.latihanmvcdao.model.PelangganModel;

/**
 *
 * @author Qhi
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);

}
