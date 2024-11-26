package com.fansheng.everythingjavafx.util;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.image.BufferedImage;
import java.io.File;

public class FXUtils {
    public Image getIconFromFilePath(String path){
        FileSystemView fsv = FileSystemView.getFileSystemView();
        Icon icon = fsv.getSystemIcon(new File(path));
        // 创建 BufferedImage
        BufferedImage image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        // 获取 Graphics2D 对象并绘制 Icon
        icon.paintIcon(null, image.getGraphics(), 0, 0);
        return SwingFXUtils.toFXImage(image, null);
    }
}
