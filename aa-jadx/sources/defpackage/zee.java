package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zee extends defpackage.ytn {
    public static final char[] a = {'+'};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final boolean c;
    public final boolean[] d;

    public zee(java.lang.String str, boolean z) {
        super(null);
        defpackage.ysr.aY(!str.matches(".*[0-9A-Za-z].*"), "Alphanumeric characters are always 'safe' and should not be explicitly specified");
        java.lang.String strConcat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (z && strConcat.contains(" ")) {
            throw new java.lang.IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.c = z;
        char[] charArray = strConcat.toCharArray();
        int iMax = -1;
        for (char c : charArray) {
            iMax = java.lang.Math.max((int) c, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        this.d = zArr;
    }
}
