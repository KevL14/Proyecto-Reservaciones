# Proyecto-Reservaciones
//Métodos para las Tablas:

//Metodo para Llenar la tabla:
    public void setDataTable(String[][] datos, String[] encabezado)
    {
        this.tbnReporte.setModel(new DefaultTableModel(datos, encabezado));
        this.jScrollPane1.setViewportView(this.tbnReporte); //Cargar la Tabla y se vea la barra de Desplazamiento.
    }//Fin Metodo
    
    //Devuelva Titulo de lo seleccionado (Llenar espacios)
    public String[] getDataRow() {
        String[] datosCancion = new String[this.tbnReporte.getColumnCount()];
        int filaSeleccionada = this.tbnReporte.getSelectedRow();
        
        for(int i = 0; i < datosCancion.length; i++) {
            datosCancion[i] = this.tbnReporte.getValueAt(filaSeleccionada, i).toString();
        }//Fin FOR
        return datosCancion;
    }//Fin Metodo DataRow
    
    //Escuchar tabla cuando se seleccione
    public void escucharMouse(MouseListener manejador) {
        this.tbnReporte.addMouseListener(manejador);
    }//Fin Metodo escuchar Mouse
