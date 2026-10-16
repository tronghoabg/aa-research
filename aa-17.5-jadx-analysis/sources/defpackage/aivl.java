package defpackage;

/* loaded from: classes3.dex */
final class aivl extends aitg {
    private final aivo f;

    public aivl(afck afckVar, aivo aivoVar) {
        super(afckVar, 1);
        this.f = aivoVar;
    }

    @Override // defpackage.aitg
    protected final String o() {
        return "AwaitContinuation";
    }

    @Override // defpackage.aitg
    public final Throwable p(aivh aivhVar) {
        Throwable thD;
        Object objHN = this.f.hN();
        return (!(objHN instanceof aivn) || (thD = ((aivn) objHN).d()) == null) ? objHN instanceof aito ? ((aito) objHN).b : aivhVar.o() : thD;
    }
}
