package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aas extends com.google.v.dm<aau, aas> implements com.google.v.fj {
    /* synthetic */ aas(byte[] bArr) {
        super(aau.DEFAULT_INSTANCE);
    }

    public final void a(aat aatVar) {
        copyOnWrite();
        ((aau) this.instance).setChangedFrom(aatVar);
    }

    public final void b(aat aatVar) {
        copyOnWrite();
        ((aau) this.instance).setChangedTo(aatVar);
    }

    private aas() {
        throw null;
    }
}
