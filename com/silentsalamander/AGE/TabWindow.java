// This file is part of AGE
//
// AGE Graphs Equations (AGE) is a java program that graphs equations
// Copyright (C) 2016 Ivan Johnson:
// fire.4@cox.net
//
// AGE is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program. If not, see <http://www.gnu.org/licenses/>.

package com.silentsalamander.AGE;

import java.awt.GridLayout;
import java.awt.geom.Point2D;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import com.silentsalamander.helper.NumberTextField;

public class TabWindow extends JScrollPane {
  private static final long serialVersionUID = -1362611028851398686L;
  protected JLabel          labelXMin, labelXMax, labelYMin, labelYMax;
  protected JPanel          mainPanel;
  protected NumberTextField textXMin, textXMax, textYMin, textYMax;
  
  public TabWindow() {
    textXMin = new NumberTextField(-10);
    textXMax = new NumberTextField(10);
    textYMin = new NumberTextField(-10);
    textYMax = new NumberTextField(10);
    labelXMin = new JLabel("X-Min");
    labelXMin.setHorizontalAlignment(SwingConstants.CENTER);
    labelXMax = new JLabel("X-Max");
    labelXMax.setHorizontalAlignment(SwingConstants.CENTER);
    labelYMin = new JLabel("Y-Min");
    labelYMin.setHorizontalAlignment(SwingConstants.CENTER);
    labelYMax = new JLabel("Y-Max");
    labelYMax.setHorizontalAlignment(SwingConstants.CENTER);
    
    mainPanel = new JPanel();
    mainPanel.setLayout(new GridLayout(2, 5));
    mainPanel.add(labelXMin);
    mainPanel.add(labelXMax);
    mainPanel.add(labelYMin);
    mainPanel.add(labelYMax);
    mainPanel.add(textXMin);
    mainPanel.add(textXMax);
    mainPanel.add(textYMin);
    mainPanel.add(textYMax);
    
    setViewportView(mainPanel);
  }
  
  public Point2D.Double getMaximumCorner() {
    return new Point2D.Double(getXMax(), getYMax());
  }
  
  public Point2D.Double getMinimumCorner() {
    return new Point2D.Double(getXMin(), getYMin());
  }
  
  public double getXMax() {
    return textXMax.getValueDouble();
  }
  
  public double getXMin() {
    return textXMin.getValueDouble();
  }
  
  public double getYMax() {
    return textYMax.getValueDouble();
  }
  
  public double getYMin() {
    return textYMin.getValueDouble();
  }
}
