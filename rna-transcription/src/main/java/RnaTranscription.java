class RnaTranscription {

    String transcribe(String dnaStrand) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String RnaStrand="";
        for(int i=0;i<dnaStrand.length();i++){
            if(dnaStrand.charAt(i)=='G')
                RnaStrand+='C';
            else if(dnaStrand.charAt(i)=='C')
                RnaStrand+='G';
            else if(dnaStrand.charAt(i)=='T')
                RnaStrand+='A';
            else if(dnaStrand.charAt(i)=='A')
                RnaStrand+='U';
        }
        return RnaStrand;
    }

}
