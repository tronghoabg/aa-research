package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class akem {
    private static final java.util.concurrent.ConcurrentMap n = new j$.util.concurrent.ConcurrentHashMap();
    public final java.lang.String[] a;
    public final java.lang.String[] b;
    public final java.lang.String[] c;
    public final java.lang.String[] d;
    public final java.lang.String[] e;
    public final java.lang.String[] f;
    public final java.util.TreeMap g;
    public final java.util.TreeMap h;
    public final java.util.TreeMap i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    private akem(java.util.Locale locale) {
        java.text.DateFormatSymbols dateFormatSymbolsA = defpackage.akdi.a(locale);
        this.a = dateFormatSymbolsA.getEras();
        this.b = d(dateFormatSymbolsA.getWeekdays());
        this.c = d(dateFormatSymbolsA.getShortWeekdays());
        this.d = e(dateFormatSymbolsA.getMonths());
        this.e = e(dateFormatSymbolsA.getShortMonths());
        this.f = dateFormatSymbolsA.getAmPmStrings();
        java.lang.Integer[] numArr = new java.lang.Integer[13];
        for (int i = 0; i < 13; i++) {
            numArr[i] = java.lang.Integer.valueOf(i);
        }
        java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        this.g = treeMap;
        c(treeMap, this.a, numArr);
        if ("en".equals(locale.getLanguage())) {
            treeMap.put("BCE", numArr[0]);
            treeMap.put("CE", numArr[1]);
        }
        java.util.TreeMap treeMap2 = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        this.h = treeMap2;
        c(treeMap2, this.b, numArr);
        c(treeMap2, this.c, numArr);
        f(treeMap2, 7, numArr);
        java.util.TreeMap treeMap3 = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        this.i = treeMap3;
        c(treeMap3, this.d, numArr);
        c(treeMap3, this.e, numArr);
        f(treeMap3, 12, numArr);
        this.j = b(this.a);
        this.k = b(this.b);
        b(this.c);
        this.l = b(this.d);
        b(this.e);
        this.m = b(this.f);
    }

    static defpackage.akem a(java.util.Locale locale) {
        if (locale == null) {
            locale = java.util.Locale.getDefault();
        }
        java.util.concurrent.ConcurrentMap concurrentMap = n;
        defpackage.akem akemVar = (defpackage.akem) concurrentMap.get(locale);
        if (akemVar != null) {
            return akemVar;
        }
        defpackage.akem akemVar2 = new defpackage.akem(locale);
        defpackage.akem akemVar3 = (defpackage.akem) concurrentMap.putIfAbsent(locale, akemVar2);
        return akemVar3 == null ? akemVar2 : akemVar3;
    }

    private static int b(java.lang.String[] strArr) {
        int length;
        int length2 = strArr.length;
        int i = 0;
        while (true) {
            length2--;
            if (length2 < 0) {
                return i;
            }
            java.lang.String str = strArr[length2];
            if (str != null && (length = str.length()) > i) {
                i = length;
            }
        }
    }

    private static void c(java.util.TreeMap treeMap, java.lang.String[] strArr, java.lang.Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            java.lang.String str = strArr[length];
            if (str != null) {
                treeMap.put(str, numArr[length]);
            }
        }
    }

    private static java.lang.String[] d(java.lang.String[] strArr) {
        java.lang.String[] strArr2 = new java.lang.String[8];
        int i = 1;
        while (i < 8) {
            int i2 = i + 1;
            strArr2[i] = strArr[i < 7 ? i2 : 1];
            i = i2;
        }
        return strArr2;
    }

    private static java.lang.String[] e(java.lang.String[] strArr) {
        java.lang.String[] strArr2 = new java.lang.String[13];
        for (int i = 1; i < 13; i++) {
            strArr2[i] = strArr[i - 1];
        }
        return strArr2;
    }

    private static void f(java.util.TreeMap treeMap, int i, java.lang.Integer[] numArr) {
        for (int i2 = 1; i2 <= i; i2++) {
            treeMap.put(java.lang.String.valueOf(i2).intern(), numArr[i2]);
        }
    }
}
