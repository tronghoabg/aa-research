package defpackage;

/* loaded from: classes3.dex */
final class aivf extends aivk {
    private final afec a;
    private final aisu c = new aisu(false, aisy.a);

    public aivf(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.aivk
    public final void b(Throwable th) {
        if (this.c.b()) {
            this.a.invoke(th);
        }
    }

    @Override // defpackage.aivk
    public final boolean c() {
        return true;
    }
}
