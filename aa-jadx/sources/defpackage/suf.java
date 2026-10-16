package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class suf {
    public static final java.text.DecimalFormat a = new java.text.DecimalFormat(".000000", java.text.DecimalFormatSymbols.getInstance(java.util.Locale.ROOT));
    public static final java.text.DecimalFormat b;

    static {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat(".##", java.text.DecimalFormatSymbols.getInstance(java.util.Locale.ROOT));
        b = decimalFormat;
        decimalFormat.setRoundingMode(java.math.RoundingMode.DOWN);
    }
}
