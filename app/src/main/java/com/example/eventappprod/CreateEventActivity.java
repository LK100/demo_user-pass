package com.example.eventappprod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;

public class CreateEventActivity extends AppCompatActivity {
    EditText Name, Location, StartTime, EndTime, Day, Description, Tag;
    Button Create, Cancel;
    FirebaseDatabase database;
    DatabaseReference ref;
    Event event;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        Name = (EditText) findViewById(R.id.Name);
        Location = (EditText) findViewById(R.id.Location);
        Day = (EditText) findViewById(R.id.Day);
        StartTime = (EditText) findViewById(R.id.StartTime);
        EndTime = (EditText) findViewById(R.id.EndTime);
        Description = (EditText) findViewById(R.id.Description);
        Tag = (EditText) findViewById(R.id.Tag);
        Create = (Button) findViewById(R.id.btnCreate);
        Cancel = (Button) findViewById(R.id.btnCancel);
        ref= database.getInstance().getReference("Event");
        event = new Event();
    }

    private void getValue() {
        event.setName(Name.getText().toString());
        event.setLocation(Location.getText().toString());
        event.setName(StartTime.getText().toString());
        event.setName(EndTime.getText().toString());
        event.setName(Tag.getText().toString());
    }

    public void btnCreate(View view){
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                getValue();
                ref.child("Event1").setValue(event);
                Toast.makeText(CreateEventActivity.this, "Event created ", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }



}
