      // Delete Button and its functionality
        deleteButton = new JButton("Delete");
        deleteButton.setBackground(new Color(40, 44, 52));
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setFocusable(false);
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = list.getSelectedIndex();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                } // validation Check
                else {
                    JOptionPane.showMessageDialog(null, "Please select ToDo to delete");
                    return;
                }
            }
        });
