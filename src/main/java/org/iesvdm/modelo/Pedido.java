package org.iesvdm.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    private int id;
    private double total;
    private Date fecha;
    private Cliente cliente;
    private Comercial comercial;
}
