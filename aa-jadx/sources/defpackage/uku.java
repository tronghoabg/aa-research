package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class uku {
    public static final java.util.Comparator a = new defpackage.tve(6);
    public static final java.util.Comparator b = new defpackage.tve(7);

    public static final void a(int i, int i2, int i3, boolean z, java.util.List list) {
        java.util.List list2 = (java.util.List) list.get(i);
        list2.add(i2, java.lang.Integer.valueOf(i3));
        list2.add(i2, java.lang.Integer.valueOf(z ? defpackage.ukv.b : -defpackage.ukv.b));
    }
}
