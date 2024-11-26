package com.fansheng.everythingjavafx;

import javafx.scene.image.ImageView;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ImageView imageView = new ImageView();
//        fitHeight="30.0" fitWidth="30.0" layoutX="7.0" layoutY="4.0" pickOnBounds="true" preserveRatio="true"
//        layoutX="45.0" layoutY="23.0" strokeType="OUTSIDE" strokeWidth="0.0"


//        imageView.setImage(new Image(String.valueOf(this.getClass().getClassLoader().getResource("dir_img.png"))));
            FileSystemView fsv = FileSystemView.getFileSystemView();
            Icon icon = fsv.getSystemIcon(new File("C:\\Program Files\\Tencent\\WeChat"));
            // 创建 BufferedImage
            BufferedImage image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);

            // 获取 Graphics2D 对象并绘制 Icon
            Graphics2D g2d = image.createGraphics();
            icon.paintIcon(null, g2d, 0, 0);
            g2d.dispose();

            // 保存 BufferedImage 为 PNG
            File outputFile = new File("C:\\Users\\Public\\Desktop\\wx1.png");

            try {
                ImageIO.write(image, "png", outputFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
