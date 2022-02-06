package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class WordService {
    private ArrayList<Word> wordList = new ArrayList<Word>();
    private int counter;

    public String getLastWord(){
        if(wordList.isEmpty()) return "No previous responses found";
		int size = wordList.size()-1;
		return wordList.get(size).toString();
    }

    public String addWord(Word word){
        if(counter>=500) return "Received too many responses. Not accepting new ones.";
        if(word.toString().length()>500) return "Word is too big";
        wordList.add(word);
        counter++;
        return "Your response is saved successfully";
    }
}
