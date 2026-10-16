package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aei {
    public final long a;
    public final defpackage.bwx b;
    public defpackage.aep c;
    public long d;
    public long e;
    public final defpackage.bil f;
    private final defpackage.afer g;
    private final defpackage.bwx h;

    public aei(java.lang.Object obj, defpackage.bil bilVar, defpackage.aep aepVar, long j, long j2, defpackage.afer aferVar) {
        this.f = bilVar;
        this.a = j2;
        this.g = aferVar;
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, bxvVar);
        this.c = defpackage.ca.A(aepVar);
        this.d = j;
        this.e = Long.MIN_VALUE;
        this.h = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.TRUE, bxvVar);
    }

    public final java.lang.Object a() {
        return this.b.a();
    }

    public final void b() {
        d();
        this.g.invoke();
    }

    public final boolean c() {
        return ((java.lang.Boolean) this.h.a()).booleanValue();
    }

    public final void d() {
        this.h.b(java.lang.Boolean.FALSE);
    }
}
