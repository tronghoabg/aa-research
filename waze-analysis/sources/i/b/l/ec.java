package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ec extends com.google.v.dm<eg, ec> implements com.google.v.fj {
    /* synthetic */ ec(byte[] bArr) {
        super(eg.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((eg) this.instance).addAllExcludedLoginResponses(iterable);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((eg) this.instance).setLogoutOtherDevices(z);
    }

    public final void c(ep epVar) {
        copyOnWrite();
        ((eg) this.instance).setPasswordCredential(epVar);
    }

    public final void d(ef efVar) {
        copyOnWrite();
        ((eg) this.instance).setReason(efVar);
    }

    public final void e(et etVar) {
        copyOnWrite();
        ((eg) this.instance).setTokenCredential(etVar);
    }

    private ec() {
        throw null;
    }
}
