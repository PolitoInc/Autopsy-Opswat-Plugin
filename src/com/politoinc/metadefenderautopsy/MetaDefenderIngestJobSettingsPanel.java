/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.politoinc.metadefenderautopsy;


import org.sleuthkit.autopsy.ingest.IngestModuleIngestJobSettings;
import org.sleuthkit.autopsy.ingest.IngestModuleIngestJobSettingsPanel;

/**
 *
 * @author Ian Duffy
 */
public class MetaDefenderIngestJobSettingsPanel extends IngestModuleIngestJobSettingsPanel {

    MetaDefenderSettings settings;
    
    /**
     * Creates new form MetaDefenderIngestJobSettingsPanel
     */
    public MetaDefenderIngestJobSettingsPanel(MetaDefenderSettings settings) {
        initComponents();
        this.settings = settings;
    }
    
    @Override
    public IngestModuleIngestJobSettings getSettings() {
        return settings;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        APIKeyTextField = new javax.swing.JTextField();
        TitleLabel = new javax.swing.JLabel();
        RateLimitLabel = new javax.swing.JLabel();
        RateLimitSpinner = new javax.swing.JSpinner();

        setLayout(new java.awt.GridBagLayout());

        APIKeyTextField.setText(org.openide.util.NbBundle.getMessage(MetaDefenderIngestJobSettingsPanel.class, "MetaDefenderIngestJobSettingsPanel.APIKeyTextField.text")); // NOI18N
        APIKeyTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                APIKeyTextFieldKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(APIKeyTextField, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(TitleLabel, org.openide.util.NbBundle.getMessage(MetaDefenderIngestJobSettingsPanel.class, "MetaDefenderIngestJobSettingsPanel.TitleLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(TitleLabel, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(RateLimitLabel, org.openide.util.NbBundle.getMessage(MetaDefenderIngestJobSettingsPanel.class, "MetaDefenderIngestJobSettingsPanel.RateLimitLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(RateLimitLabel, gridBagConstraints);

        RateLimitSpinner.setValue(10);
        RateLimitSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RateLimitSpinnerStateChanged(evt);
            }
        });
        RateLimitSpinner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RateLimitSpinnerKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(RateLimitSpinner, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void APIKeyTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_APIKeyTextFieldKeyReleased
        settings.setAPIKey(APIKeyTextField.getText());
    }//GEN-LAST:event_APIKeyTextFieldKeyReleased

    private void RateLimitSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RateLimitSpinnerStateChanged
        settings.setRateLimitQueriesPerMinute((int)RateLimitSpinner.getValue());
    }//GEN-LAST:event_RateLimitSpinnerStateChanged

    private void RateLimitSpinnerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RateLimitSpinnerKeyReleased
        settings.setRateLimitQueriesPerMinute((int)RateLimitSpinner.getValue());
    }//GEN-LAST:event_RateLimitSpinnerKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField APIKeyTextField;
    private javax.swing.JLabel RateLimitLabel;
    private javax.swing.JSpinner RateLimitSpinner;
    private javax.swing.JLabel TitleLabel;
    // End of variables declaration//GEN-END:variables
}
