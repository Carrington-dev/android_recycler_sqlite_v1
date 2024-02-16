package za.co.stemgon.todo365.todos.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import za.co.stemgon.todo365.R;

public class AddTodoActivity extends AppCompatActivity implements View.OnClickListener {
    TextInputEditText nameEditText, emailEditText;
    Button updateButton, addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_todo);

        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);

        addButton = findViewById(R.id.add);
        updateButton = findViewById(R.id.update);


    }

    @Override
    public void onClick(View v) {
        Button myClickedButton = (Button) v;
        if (myClickedButton.equals(updateButton)) {
            addTodo();
        } else if (myClickedButton.equals(addButton)) {
            updateTodo();
        }
    }

    private void updateTodo() {
        Toast.makeText(AddTodoActivity.this, "Clicked Update", Toast.LENGTH_SHORT).show();
    }

    private void addTodo() {
        Toast.makeText(AddTodoActivity.this, "Clicked Update", Toast.LENGTH_SHORT).show();
    }
}