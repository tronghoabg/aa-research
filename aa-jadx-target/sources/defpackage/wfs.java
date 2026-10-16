package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wfs {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, xzi] */
    public final defpackage.wba a() {
        this.f.getClass();
        if (this.a == null) {
            this.a = defpackage.wba.b;
        }
        if (this.e == null) {
            java.lang.Object obj = this.f;
            java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.wba.a;
            this.e = defpackage.ysr.aQ(new defpackage.ryo(obj, 11));
        }
        if (this.d == null) {
            this.d = new defpackage.upb(this, 18);
        }
        if (this.c == null) {
            java.lang.Object obj2 = this.f;
            java.util.concurrent.atomic.AtomicReference atomicReference2 = defpackage.wba.a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Collections.addAll(arrayList, new defpackage.wfv(new defpackage.rkq((android.content.Context) obj2)), new defpackage.wfy(new defpackage.wgf()));
            this.c = defpackage.ysr.aQ(new defpackage.ryo(arrayList, 12));
        }
        if (this.b == null) {
            this.b = new defpackage.ryo(this, 14);
        }
        return new defpackage.wba((android.content.Context) this.f, this.a, this.e, this.d, this.c, this.b);
    }
}
