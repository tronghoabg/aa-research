package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bow extends com.google.v.dm<boy, bow> implements com.google.v.fj {
    /* synthetic */ bow(byte[] bArr) {
        super(boy.DEFAULT_INSTANCE);
    }

    public final void a(wy wyVar) {
        copyOnWrite();
        ((boy) this.instance).setForceUpgradeMessageClicked(wyVar);
    }

    public final void b(xa xaVar) {
        copyOnWrite();
        ((boy) this.instance).setForceUpgradeMessageReceived(xaVar);
    }

    public final void c(xc xcVar) {
        copyOnWrite();
        ((boy) this.instance).setForceUpgradeMessageShown(xcVar);
    }

    public final void d(acd acdVar) {
        copyOnWrite();
        ((boy) this.instance).setInCarLoginConfirmationScreenShown(acdVar.build());
    }

    public final void e(acg acgVar) {
        copyOnWrite();
        ((boy) this.instance).setInCarLoginScreenClicked(acgVar.build());
    }

    public final void f(aci aciVar) {
        copyOnWrite();
        ((boy) this.instance).setInCarLoginScreenShown(aciVar.build());
    }

    public final void g(ahe aheVar) {
        copyOnWrite();
        ((boy) this.instance).setLoginComplete(aheVar);
    }

    private bow() {
        throw null;
    }
}
