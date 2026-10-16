package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class bc extends com.google.v.dm<bd, bc> implements com.google.v.fj {
    /* synthetic */ bc(byte[] bArr) {
        super(bd.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((bd) this.instance).setConsentCheckboxValue(z);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((bd) this.instance).setWasConsentCheckboxShown(z);
    }

    private bc() {
        throw null;
    }
}
