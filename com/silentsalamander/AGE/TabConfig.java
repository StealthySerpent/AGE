package com.silentsalamander.AGE;

import java.util.ArrayList;

import javax.swing.JScrollPane;

import com.silentsalamander.helper.config.ConfigPanel;
import com.silentsalamander.helper.config.ConfigValueBase;
import com.silentsalamander.helper.config.ConfigValueComboString;

public class TabConfig extends JScrollPane {
  private static final long serialVersionUID = -293097432549174756L;
  protected ConfigPanel     config;
  protected boolean         useRadians       = true;
  
  public TabConfig() {
    ArrayList<ConfigValueBase> configItems = new ArrayList<>();
    configItems.add(new ConfigValueComboString() {
      private final String[] options = { "Radians", "Degrees" };
      
      @Override
      public int getDefaultIndex() {
        return useRadians ? 0 : 1;// 0 by default
      }
      
      @Override
      public String[] getOptions() {
        return options;
      }
      
      @Override
      protected void saveIndex(int i) {
        useRadians = (i == 0);
      }
      
      @Override
      public String getName() {
        return "Angle Measurement";
      }
    });
    
    // TODO file loc
    config = new ConfigPanel(configItems, true, null, null);
    
    setViewportView(config);
  }
  
  public boolean useRadians() {
    return useRadians;
  }
}
