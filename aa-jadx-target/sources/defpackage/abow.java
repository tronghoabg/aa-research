package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abow implements java.lang.Comparable {
    final defpackage.abpc a;
    public final int b;
    public final defpackage.abrf c;
    public final boolean d;

    public abow(defpackage.abpc abpcVar, int i, defpackage.abrf abrfVar, boolean z) {
        this.a = abpcVar;
        this.b = i;
        this.c = abrfVar;
        this.d = z;
    }

    public static final void b(java.lang.Object obj, java.lang.Object obj2) {
        ((defpackage.abor) obj).w((defpackage.abox) obj2);
    }

    public final defpackage.abrg a() {
        return this.c.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.b - ((defpackage.abow) obj).b;
    }
}
