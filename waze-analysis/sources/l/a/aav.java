package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aav extends com.google.v.dm<aax, aav> implements com.google.v.fj {
    /* synthetic */ aav(byte[] bArr) {
        super(aax.DEFAULT_INSTANCE);
    }

    public final void a(aau aauVar) {
        copyOnWrite();
        ((aax) this.instance).setGpsSourceChanged(aauVar);
    }

    public final void b(agp agpVar) {
        copyOnWrite();
        ((aax) this.instance).setLocationIssueDetected(agpVar);
    }

    public final void c(bjg bjgVar) {
        copyOnWrite();
        ((aax) this.instance).setTopBarGpsErrorMessageRemoved(bjgVar);
    }

    public final void d(bji bjiVar) {
        copyOnWrite();
        ((aax) this.instance).setTopBarGpsErrorMessageShown(bjiVar);
    }

    private aav() {
        throw null;
    }
}
