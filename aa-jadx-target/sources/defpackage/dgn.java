package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dgn {
    public static final android.text.Layout.Alignment a;
    public static final android.text.Layout.Alignment b;

    static {
        android.text.Layout.Alignment[] alignmentArrValues = android.text.Layout.Alignment.values();
        android.text.Layout.Alignment alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
        android.text.Layout.Alignment alignment2 = android.text.Layout.Alignment.ALIGN_NORMAL;
        for (android.text.Layout.Alignment alignment3 : alignmentArrValues) {
            if (defpackage.afga.f(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (defpackage.afga.f(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        a = alignment;
        b = alignment2;
    }
}
