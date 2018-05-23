package com.tw;

public class Student {
    private String name;
    private int num;
    private String subject;
    public int ChineseGrade;
    public int MathGrade;

    public Student(String name, int num, int mathGrade, int chineseGrade, int englishGrade, int codeGrade) {
        this.name = name;
        this.num = num;

        this.ChineseGrade = chineseGrade;
        this.MathGrade = mathGrade;
        this.EnglishGrade = englishGrade;
        this.CodeGrade = codeGrade;
        this.TotalGrade = chineseGrade + mathGrade + englishGrade +codeGrade;
        this.AverageGrade = this.TotalGrade/4;

    }

    public int EnglishGrade;
    public int CodeGrade;
    public int AverageGrade;
    public int TotalGrade;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }



    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public int getAverageGrade() {
        return AverageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        AverageGrade = averageGrade;
    }


    public int getTotalGrade() {
        return TotalGrade;
    }

    public void setTotalGrade(int totalGrade) {
        TotalGrade = totalGrade;
    }



    public int getChineseGrade() {
        return ChineseGrade;
    }

    public void setChineseGrade(int chineseGrade) {
        ChineseGrade = chineseGrade;
    }

    public int getMathGrade() {
        return MathGrade;
    }

    public void setMathGrade(int mathGrade) {
        MathGrade = mathGrade;
    }

    public int getEnglishGrade() {
        return EnglishGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        EnglishGrade = englishGrade;
    }

    public int getCodeGrade() {
        return CodeGrade;
    }

    public void setCodeGrade(int codeGrade) {
        CodeGrade = codeGrade;
    }
    


}
