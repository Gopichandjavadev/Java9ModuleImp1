module easytextimp1 {
    requires easytextapi;
    
    provides easytextapi.Analyzer with easytextimp1.Imp1;
}