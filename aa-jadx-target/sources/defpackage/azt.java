package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class azt implements defpackage.bys {
    private final int a;
    private final int b;
    private final defpackage.bwx c;
    private int d;

    public azt(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        int i4 = (i / i2) * i2;
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.afqt.m(java.lang.Math.max(i4 - i3, 0), i4 + i2 + i3), defpackage.bxv.c);
        this.d = i;
    }

    @Override // defpackage.bys
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.afia a() {
        return (defpackage.afia) this.c.a();
    }

    public final void c(int i) {
        if (i != this.d) {
            this.d = i;
            int i2 = this.a;
            int i3 = this.b;
            int i4 = (i / i2) * i2;
            this.c.b(defpackage.afqt.m(java.lang.Math.max(i4 - i3, 0), i4 + i2 + i3));
        }
    }
}
