package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class atn extends com.google.v.dm<atp, atn> implements com.google.v.fj {
    /* synthetic */ atn(byte[] bArr) {
        super(atp.DEFAULT_INSTANCE);
    }

    @Deprecated
    public final void a(kg kgVar) {
        copyOnWrite();
        ((atp) this.instance).setClientAlerterShown(kgVar);
    }

    public final void b(agc agcVar) {
        copyOnWrite();
        ((atp) this.instance).setLiveMatchClicked(agcVar.build());
    }

    public final void c(age ageVar) {
        copyOnWrite();
        ((atp) this.instance).setLiveMatchShown(ageVar.build());
    }

    public final void d(bfs bfsVar) {
        copyOnWrite();
        ((atp) this.instance).setSpeedEnforcementZoneBarShown(bfsVar);
    }

    private atn() {
        throw null;
    }
}
