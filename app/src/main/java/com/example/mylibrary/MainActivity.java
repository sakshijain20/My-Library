package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Book> listBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listBook=new ArrayList<Book>();
        listBook.add(new Book("JAVA"," As the name suggests, it’s a good book for someone with basic knowledge of"
                +"programming wanting to learn java programming language","Herbert Schildt",R.drawable.java));

        listBook.add(new Book("AI","Artificial intelligence (AI) is a field within computer science that is attempting to build enhanced intelligence into computer systems. This book traces the history of the subject, from the early dreams of eighteenth-century (and earlier) pioneers\n"
                +"to the more successful work of today's AI engineers.","Peter Norvig",R.drawable.ai));

        listBook.add(new Book("DSA","This was my preferred resource on algorithms for a long time, it still is but now I see it less often than before. You will learn lots of background on the algorithm and nowadays even specific versions of this book are available\n"+
                "for different programming languages like Java and C++.","Robert Lafore",R.drawable.dsa));

        listBook.add(new Book("ANALYSIS OF ALGO","it is the best book to explore about the algorithms with" +
                "proper description about use cases and time complexity.","Anany Levitin",R.drawable.aoa));

        listBook.add(new Book("Computer Networking","The book is an introduction to computer networking for those seeking information on various aspects of establishing and maintaining wireless networks" +"" +
                " A computer network is a group of computers that share data over a wireless or cable-connected set-up.","Andrew S. Tanenbaum.",R.drawable.cn));

        listBook.add(new Book("C#","Its a good book for beginners, I also read that book. You can use this book for reference There can be more books,"
                +"but for beginners it is perfect. Lets read this without wasting time to search for another :)","Jeffrey Ritcher",R.drawable.c_sharp));

        RecyclerView myRecyclerView=(RecyclerView) findViewById(R.id.recycler_view_id);
        RecyclerViewAdapter myAdapter=new RecyclerViewAdapter(this,listBook);
        myRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        myRecyclerView.setAdapter(myAdapter);
    }
}
