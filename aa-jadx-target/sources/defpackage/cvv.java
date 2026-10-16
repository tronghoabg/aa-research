package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cvv {
    public final defpackage.cuz a;
    public final defpackage.cuz b;
    public long c;
    public long d;
    public long e;
    public long f;
    private final defpackage.bwx g;
    private final defpackage.bwx h;
    private final defpackage.byh i;
    private final defpackage.byl j;
    private final defpackage.byh k;

    public cvv(java.lang.String str) {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.h = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, bxvVar);
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
        this.j = new androidx.compose.runtime.ParcelableSnapshotMutableLongState(0L);
        this.k = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(1.0f);
        this.a = new defpackage.cva(str.concat(" source"), 0);
        this.b = new defpackage.cva(str.concat(" target"), 0);
        this.c = -1L;
        this.d = -1L;
        this.e = -1L;
        this.f = -1L;
    }

    public final void a(float f) {
        this.k.h(f);
    }

    public final void b(boolean z) {
        this.h.b(java.lang.Boolean.valueOf(z));
    }

    public final void c(long j) {
        this.j.h(j);
    }

    public final void d(float f) {
        this.i.h(f);
    }

    public final void e(boolean z) {
        this.g.b(java.lang.Boolean.valueOf(z));
    }

    public final boolean f() {
        return ((java.lang.Boolean) this.h.a()).booleanValue();
    }
}
