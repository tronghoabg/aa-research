package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class gi extends com.google.v.dm<gl, gi> implements com.google.v.fj {
    /* synthetic */ gi(byte[] bArr) {
        super(gl.DEFAULT_INSTANCE);
    }

    public final void a() {
        copyOnWrite();
        ((gl) this.instance).setApprovedOnly(false);
    }

    public final void b(int i2) {
        copyOnWrite();
        ((gl) this.instance).setMaxResults(i2);
    }

    public final void c() {
        copyOnWrite();
        ((gl) this.instance).setMergeUserUpdates(true);
    }

    public final void d(u uVar) {
        copyOnWrite();
        ((gl) this.instance).setNearBy(uVar);
    }

    public final void e() {
        copyOnWrite();
        ((gl) this.instance).setResidentialToo(true);
    }

    public final void f(gj gjVar) {
        copyOnWrite();
        ((gl) this.instance).setSortBy(gjVar);
    }

    private gi() {
        throw null;
    }
}
