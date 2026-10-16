package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class axr {
    public boolean a;
    public java.lang.Object b;
    public final defpackage.azt c;
    private final defpackage.byj d;
    private final defpackage.byj e;

    public axr(int i, int i2) {
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(i);
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(i2);
        this.c = new defpackage.azt(i, 30, 100);
    }

    public final int a() {
        return this.d.e();
    }

    public final int b() {
        return this.e.e();
    }

    public final void c(int i) {
        this.d.h(i);
    }

    public final void d(int i) {
        this.e.h(i);
    }

    public final void e(int i, int i2) {
        if (i < 0.0f) {
            defpackage.asq.c(defpackage.a.bm(i, "Index should be non-negative (", ")"));
        }
        c(i);
        this.c.c(i);
        d(i2);
    }
}
