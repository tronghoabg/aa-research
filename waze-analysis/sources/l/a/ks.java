package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ks extends com.google.v.dm<kt, ks> implements com.google.v.fj {
    /* synthetic */ ks(byte[] bArr) {
        super(kt.DEFAULT_INSTANCE);
    }

    public final void a(kr krVar) {
        copyOnWrite();
        ((kt) this.instance).setAction(krVar);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((kt) this.instance).setFromNode(j2);
    }

    public final void c() {
        copyOnWrite();
        ((kt) this.instance).setLevel(1L);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((kt) this.instance).setToNode(j2);
    }

    private ks() {
        throw null;
    }
}
