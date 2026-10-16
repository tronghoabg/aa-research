package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class dk extends com.google.v.dm<dm, dk> implements com.google.v.fj {
    /* synthetic */ dk(byte[] bArr) {
        super(dm.DEFAULT_INSTANCE);
    }

    public final void a(ep epVar) {
        copyOnWrite();
        ((dm) this.instance).setPasswordCredential(epVar);
    }

    public final void b(et etVar) {
        copyOnWrite();
        ((dm) this.instance).setTokenCredential(etVar);
    }

    private dk() {
        throw null;
    }
}
