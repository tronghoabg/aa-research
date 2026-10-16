package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cyx {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;

    public cyx() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(1.0f);
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(1.0f);
        this.h = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.cli(defpackage.tna.aK(0.5f, 0.5f)), bxvVar);
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.ckd(0L), bxvVar);
    }

    public final float a() {
        return ((defpackage.byh) this.c).e();
    }

    public final float b() {
        return ((defpackage.byh) this.d).e();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bwx, java.lang.Object] */
    public final long c() {
        return ((defpackage.cli) this.a.a()).a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bwx, java.lang.Object] */
    public final long d() {
        return ((defpackage.ckd) this.e.a()).a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [bwx, java.lang.Object] */
    public final void e() {
        ((defpackage.byh) this.c).h(1.0f);
        this.f.b(java.lang.Boolean.FALSE);
        ((defpackage.byh) this.d).h(1.0f);
        this.g.b(java.lang.Boolean.FALSE);
        this.a.b(new defpackage.cli(defpackage.tna.aK(0.5f, 0.5f)));
        this.h.b(java.lang.Boolean.FALSE);
        this.e.b(new defpackage.ckd(0L));
        this.b.b(java.lang.Boolean.FALSE);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bys, java.lang.Object] */
    public final boolean f() {
        return ((java.lang.Boolean) this.f.a()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bys, java.lang.Object] */
    public final boolean g() {
        return ((java.lang.Boolean) this.g.a()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bys, java.lang.Object] */
    public final boolean h() {
        return ((java.lang.Boolean) this.h.a()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bys, java.lang.Object] */
    public final boolean i() {
        return ((java.lang.Boolean) this.b.a()).booleanValue();
    }

    public cyx(defpackage.affc affcVar) {
        this.a = new defpackage.cez(affcVar);
        this.b = new defpackage.bwy(18);
        this.c = new defpackage.bwy(19);
        this.d = new defpackage.bwy(20);
        this.e = new defpackage.cyw(1);
        this.f = new defpackage.cyw(0);
        this.g = new defpackage.cyw(2);
        this.h = new defpackage.cyw(3);
    }
}
