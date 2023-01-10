package org.aibles.exercise;

import org.aibles.exercise.service.ProcessNumber;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProcessNumber.showList(ProcessNumber.analysisNumberSequence());
    }
}