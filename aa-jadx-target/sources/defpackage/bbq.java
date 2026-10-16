package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bbq {
    public final defpackage.bby a;
    public boolean b;
    public java.lang.Object c;
    public final defpackage.azt d;
    private final defpackage.byj e;
    private final defpackage.byh f;

    public bbq(int i, float f, defpackage.bby bbyVar) {
        this.a = bbyVar;
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(i);
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(f);
        this.d = new defpackage.azt(i, 30, 100);
    }

    public final float a() {
        return this.f.e();
    }

    public final int b() {
        return this.e.e();
    }

    public final void c(int i) {
        this.e.h(i);
    }

    public final void d(float f) {
        this.f.h(f);
    }

    public final void e(int i, float f) {
        c(i);
        this.d.c(i);
        d(f);
    }
}
