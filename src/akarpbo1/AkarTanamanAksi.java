/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akarpbo1;

/**
 *
 * @author ZACKUIN
 */
public class AkarTanamanAksi {
    public static void main(String[] args) {
        AkarTanaman Kacang = new AkarTanaman();
            
            Kacang.nama="Kacang Panjang";
            Kacang.JenisAkar="Akar Serabut";
            Kacang.PanjangAkar="5 - 10 Cm";
            Kacang.JumlahAkar="Bercabang";
            Kacang.KedalamanAkar="60 Cm";
            
            Kacang.CaraTumbuh();
            
        AkarTanaman Singkong = new AkarTanaman();
            
            Singkong.nama="Singkong/Ubi Jalar";
            Singkong.JenisAkar="Akar Serabut";
            Singkong.PanjangAkar="30 Cm";
            Singkong.JumlahAkar="Bercabang Banyak";
            Singkong.KedalamanAkar="50 - 80 Cm";
            
            Singkong.CaraTumbuh();
            
        AkarTanaman Mangga = new AkarTanaman();
        
            Mangga.nama="Pohon Mangga Madu";
            Mangga.JenisAkar="Akar Tunggang";
            Mangga.PanjangAkar="6 Meter";
            Mangga.JumlahAkar="Bercabang Sedikit";
            Mangga.KedalamanAkar="3 - 7 Meter";
            
            Mangga.CaraTumbuh();
    }
    
}
