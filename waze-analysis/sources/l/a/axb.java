package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class axb extends com.google.v.dm<axc, axb> implements com.google.v.fj {
    /* synthetic */ axb(byte[] bArr) {
        super(axc.DEFAULT_INSTANCE);
    }

    public final void a(axa axaVar) {
        copyOnWrite();
        ((axc) this.instance).setAction(axaVar);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((axc) this.instance).setSetHomeAvailable(z);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((axc) this.instance).setSetWorkAvailable(z);
    }

    private axb() {
        throw null;
    }
}
