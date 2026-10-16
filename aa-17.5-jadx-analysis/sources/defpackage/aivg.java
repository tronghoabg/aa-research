package defpackage;

/* loaded from: classes2.dex */
final class aivg extends aivk {
    private final afec a;

    public aivg(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.aivk
    public final void b(Throwable th) {
        this.a.invoke(th);
    }

    @Override // defpackage.aivk
    public final boolean c() {
        return false;
    }
}
