/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author edubi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        postals p = new postals();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }
}
