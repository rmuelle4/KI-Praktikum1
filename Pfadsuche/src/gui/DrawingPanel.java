/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.Line;
import data.LineList;
import data.Point;
import java.awt.Color;

import java.awt.Graphics2D;
import java.util.HashSet;

/**
 *
 * @author Roland
 */
public class DrawingPanel extends javax.swing.JPanel {
    
    final int WIDTH_NEW = 900;
    final int HEIGHT_NEW = 456;
    
    HashSet<Point> points;
    HashSet<Point> drawnPoints;
    Point selected;
    final double scalingFactorX = WIDTH_NEW / (388 - 100);
    final double scalingFactorY = HEIGHT_NEW / (670 - 516);

    /**
     * Creates new form DrawingPanel
     */
    public DrawingPanel() {
        drawnPoints = new HashSet<>();
        initComponents();
    }
    
    public boolean setPoints(HashSet<Point> p) {
        if(p == null) {
            return false;
        }
        points = p;
        return true;
    }
    
    
    public void drawAllPoints() {
        Graphics2D g = (Graphics2D) this.getGraphics();
        
        for(Point p: points) {
                int x = (int) p.getX();
                int y = (int) p.getY();
                String id = p.getId();
                
                g.drawOval((int) scalingFactorX * x - x-2,HEIGHT_NEW - (int)(Math.abs(HEIGHT_NEW - y)*scalingFactorY)-2+20, 4, 4);
                g.fillOval((int) scalingFactorX * x - x-2,HEIGHT_NEW - (int)(Math.abs(HEIGHT_NEW - y)*scalingFactorY)-2+20, 4, 4);
                if(id.equals("S") || id.equals("Z")) {
                    g.drawString(id,(int) scalingFactorX * x - x-2,HEIGHT_NEW - (int)(Math.abs(HEIGHT_NEW - y)*scalingFactorY)+10+25-2);
                }
        }
        if(selected != null) {
            
            int x = (int) selected.getX();
            int y = (int) selected.getY();
            String name = selected.getId();
            g.setColor(Color.RED);
            g.drawOval(x, y, 5, 5);
            g.fillOval(x, y, 5, 5);
            g.drawString(name, x, 15+y);
            
        }
        
    }
    
    public void drawAllLines(LineList list) {
        Graphics2D g = (Graphics2D) this.getGraphics();
        
        for(Line l: list.getList()) {
            int xFrom = (int) l.getPointFrom().getX();
            int yFrom = (int) l.getPointFrom().getY();
            int xTo = (int) l.getPointTo().getX();
            int yTo = (int) l.getPointTo().getY();
            g.drawLine((int) scalingFactorX * xFrom - xFrom,HEIGHT_NEW -  (int) (Math.abs(HEIGHT_NEW - yFrom)*scalingFactorY) +20,(int) scalingFactorX * xTo - xTo,HEIGHT_NEW -  (int) (Math.abs(HEIGHT_NEW - yTo)*scalingFactorY)+20);
        }
        
    }
    
    public void selectPoint(Point p) {
        selected = p;
        Graphics2D g = (Graphics2D) this.getGraphics();
        super.paintComponent(g);
        int x = (int) p.getX();
        int y = (int) p.getY();
        
        
        drawAllPoints();
        g.setColor(Color.RED);
        g.drawOval(x, y, 5, 5);
        g.fillOval(x, y, 5, 5);
        g.drawString(p.getId() + "("+(x)+","+ y + ")", x, 15+y);
    }
    
    public void drawPoint(Point p) {
        Graphics2D g = (Graphics2D) this.getGraphics();
        super.paintComponent(g);
        int x = (int) p.getX();
        int y = (int) p.getY();
        g.drawOval(x, y, 5, 5);
        g.fillOval(x, y, 5, 5);
        g.drawString(p.getId() + "("+(x)+","+ y + ")", x, 15+y);
    }
    
    public void unselectPoints() {
        if(selected != null) {
            selected=null;
            Graphics2D g = (Graphics2D) this.getGraphics();
            super.paintComponent(g);
            undrawAllPoints();
            drawAllPoints();
            
        }
        else {
            
        }
    }
    
    
    public void undrawPoint(Point p) {
        Graphics2D g = (Graphics2D) this.getGraphics();
        super.paintComponent(g);
        if(drawnPoints.contains(p)) {
            int x = (int) p.getX();
            int y = (int) p.getY();
            g.setColor(getBackground());
            g.drawOval(x, y, 5, 5);
            g.fillOval(x, y, 5, 5);
            g.drawString(p.getId() + "("+(x)+","+ y + ")", x, 15+y);
        }
    }
    public void undrawAllPoints() {
        Graphics2D g = (Graphics2D) this.getGraphics();
        super.paintComponent(g);
        drawnPoints.clear();
        g.clearRect(0, 0, WIDTH_NEW, HEIGHT_NEW);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
