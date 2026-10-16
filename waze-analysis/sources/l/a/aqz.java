package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aqz extends com.google.v.dm<arb, aqz> implements com.google.v.fj {
    /* synthetic */ aqz(byte[] bArr) {
        super(arb.DEFAULT_INSTANCE);
    }

    public final void a(aqt aqtVar) {
        copyOnWrite();
        ((arb) this.instance).setPlannedDriveScreenClicked(aqtVar.build());
    }

    public final void b(aqv aqvVar) {
        copyOnWrite();
        ((arb) this.instance).setPlannedDriveShown(aqvVar.build());
    }

    public final void c(axm axmVar) {
        copyOnWrite();
        ((arb) this.instance).setSchedulePlannedDriveScreenClicked(axmVar);
    }

    public final void d(axn axnVar) {
        copyOnWrite();
        ((arb) this.instance).setSchedulePlannedDriveScreenShown(axnVar.build());
    }

    private aqz() {
        throw null;
    }
}
