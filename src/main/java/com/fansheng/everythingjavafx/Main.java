package com.fansheng.everythingjavafx;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. 加载图片
            File inputFile = new File(Main.class.getClassLoader().getResource("dir_img.png").getPath()); // 输入图片路径
            BufferedImage image = ImageIO.read(inputFile);

            // 2. 创建 Graphics2D 对象
            Graphics2D g2d = image.createGraphics();

            // 3. 设置中文字体
            Font font = new Font("黑体", Font.BOLD, 36);
            g2d.setFont(font);
            g2d.setColor(Color.RED); // 设置字体颜色

            // 4. 绘制中文文本
            String text = "你好，世界！"; // 要绘制的中文文本
            int x = 0; // 文本的 x 坐标
            int y = 36; // 文本的 y 坐标
            g2d.drawString(text, x, y);

            // 5. 释放资源
            g2d.dispose();

            // 6. 保存结果图片
            File outputFile = new File("output.png"); // 输出图片路径
            ImageIO.write(image, "png", outputFile);

            System.out.println("图片处理完成，保存到：" + outputFile.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
