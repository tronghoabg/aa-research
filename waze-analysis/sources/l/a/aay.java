package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aay extends com.google.v.dm<abb, aay> implements com.google.v.fj {
    /* synthetic */ aay(byte[] bArr) {
        super(abb.DEFAULT_INSTANCE);
    }

    public final void a(aaz aazVar) {
        copyOnWrite();
        ((abb) this.instance).setChangedFrom(aazVar);
    }

    public final void b(aaz aazVar) {
        copyOnWrite();
        ((abb) this.instance).setChangedTo(aazVar);
    }

    public final void c(aba abaVar) {
        copyOnWrite();
        ((abb) this.instance).setSource(abaVar);
    }

    private aay() {
        throw null;
    }
}
