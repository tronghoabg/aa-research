package defpackage;

/* loaded from: classes.dex */
final class advm extends aduj {
    final /* synthetic */ advv b;

    public advm(advv advvVar) {
        this.b = advvVar;
    }

    @Override // defpackage.aduj
    protected final void a() {
        this.b.i();
    }

    @Override // defpackage.aduj
    protected final void b() {
        advv advvVar = this.b;
        if (advvVar.z.get()) {
            return;
        }
        advvVar.k();
    }
}
