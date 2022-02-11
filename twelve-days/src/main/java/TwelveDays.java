class TwelveDays {
    String verse(int verseNumber) {
        if(verseNumber==1)
            return "first";
        else if(verseNumber==2)
            return "second";
        else if(verseNumber==3)
            return "third";
        else if(verseNumber==4)
            return "forth";
        else if(verseNumber==5)
            return "fifth";
        else if(verseNumber==6)
            return "sixth";
        else if(verseNumber==7)
            return "seventh";
        else if(verseNumber==8)
            return "eighth";
        else if(verseNumber==9)
            return "ninth";
        else if(verseNumber==10)
            return "tenth";
        else if(verseNumber==11)
            return "eleventh";
        else if(verseNumber==12)
            return "twelfth";
    }

    String verses(int startVerse, int endVerse) {
        return startVerse+endVerse;
    }
    
    String sing() {
        return "hello";
    }
}
