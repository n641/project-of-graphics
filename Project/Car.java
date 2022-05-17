package com.cs304.Project;

import com.cs304.lab9.AnimListener;
import com.cs304.lab9.Example1.Anim;
import com.cs304.lab9.Example1.AnimGLEventListener3;
import com.sun.opengl.util.Animator;
import com.sun.opengl.util.FPSAnimator;

import javax.media.opengl.GLCanvas;
import javax.swing.*;
import java.awt.*;

public class Car extends JFrame {
    public GLCanvas glcanvas;
    public Animator animator;

    public static void main(String[] args) {
        new Car();
    }


    public Car() {


        AnimListener listener = new SingleM3MediamCarListener();
        glcanvas = new GLCanvas();
        glcanvas.addGLEventListener(listener);
        glcanvas.addKeyListener(listener);
        getContentPane().add(glcanvas, BorderLayout.CENTER);
        animator = new FPSAnimator(60);
        animator.add(glcanvas);
        animator.start();

        setTitle("Car Race");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 900);
        setLocationRelativeTo(null);
        setVisible(true);
        setFocusable(true);
        glcanvas.requestFocus();
    }
}

