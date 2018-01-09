/**
 * IMPORTANT: Asegurate de estar utilizando el nombre de paquete correcto.
 * Este ejemplo usa el paquete con el nombre:
 * package com.example.robotica.justjava
 * Sí tienes un error cuando copias esto en android studio, verifica el nombre del paquete de tu proyecto.
 **/

package com.example.robotica.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Este es el display de una app para ordenar café.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Este método es llamado, cuando le das click al botón de ordenar.
     */
    public void submitOrder(View view) {
        display(1);
    }

    /**
     * Este método muestra el valor de la cantidad dada en la pantalla.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.cantidad_text_view);
        quantityTextView.setText("" + number);
    }
}