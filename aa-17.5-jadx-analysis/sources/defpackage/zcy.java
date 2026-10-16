package defpackage;

/* loaded from: classes3.dex */
public final class zcy extends ysi {
    public static final char[] a = {'+'};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final boolean c;
    public final boolean[] d;

    public zcy(String str, boolean z) {
        super(null);
        woy.O(!str.matches(".*[0-9A-Za-z].*"), "Alphanumeric characters are always 'safe' and should not be explicitly specified");
        String strConcat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (z && strConcat.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.c = z;
        char[] charArray = strConcat.toCharArray();
        int iMax = -1;
        for (char c : charArray) {
            iMax = Math.max((int) c, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        this.d = zArr;
    }
}
