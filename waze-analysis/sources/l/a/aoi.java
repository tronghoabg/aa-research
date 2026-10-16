package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aoi extends com.google.v.dm<aok, aoi> implements com.google.v.fj {
    /* synthetic */ aoi(byte[] bArr) {
        super(aok.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((aok) this.instance).setAccountRestored(z);
    }

    public final void b(aoh aohVar) {
        copyOnWrite();
        ((aok) this.instance).setContext(aohVar);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((aok) this.instance).setCredentialsFound(z);
    }

    public final void d(String str) {
        copyOnWrite();
        ((aok) this.instance).setExperiment(str);
    }

    public final void e(String str) {
        copyOnWrite();
        ((aok) this.instance).setExperimentGroup(str);
    }

    public final void f(aoj aojVar) {
        copyOnWrite();
        ((aok) this.instance).setNewUserType(aojVar);
    }

    public final void g(long j2) {
        copyOnWrite();
        ((aok) this.instance).setOnboardingDurationSeconds(j2);
    }

    public final void h(boolean z) {
        copyOnWrite();
        ((aok) this.instance).setRecoveryAttempt(z);
    }

    public final void i(auc aucVar) {
        copyOnWrite();
        ((aok) this.instance).setRegulationFlags(aucVar);
    }

    private aoi() {
        throw null;
    }
}
