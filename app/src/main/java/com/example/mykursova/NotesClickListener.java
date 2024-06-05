package com.example.mykursova;

import androidx.cardview.widget.CardView;

import com.example.mykursova.Models.Notes;

public interface NotesClickListener {

    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
