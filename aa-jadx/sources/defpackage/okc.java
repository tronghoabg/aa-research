package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class okc {
    public final defpackage.yyt c;
    public final boolean d;

    public okc(defpackage.yyt yytVar, boolean z) {
        this.c = yytVar;
        this.d = z;
    }

    public abstract defpackage.okf a();

    public abstract void b();

    public abstract int d();

    public final boolean e() {
        return d() == 4;
    }

    public final int f() {
        return this.d ? 3 : 2;
    }
}
