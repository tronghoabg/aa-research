package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aoe extends com.google.v.dm<aog, aoe> implements com.google.v.fj {
    /* synthetic */ aoe(byte[] bArr) {
        super(aog.DEFAULT_INSTANCE);
    }

    public final void a(aoh aohVar) {
        copyOnWrite();
        ((aog) this.instance).setContext(aohVar);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((aog) this.instance).setOnboardingDurationSeconds(j2);
    }

    public final void c(auc aucVar) {
        copyOnWrite();
        ((aog) this.instance).setRegulationFlags(aucVar);
    }

    public final void d(aof aofVar) {
        copyOnWrite();
        ((aog) this.instance).setType(aofVar);
    }

    private aoe() {
        throw null;
    }
}
