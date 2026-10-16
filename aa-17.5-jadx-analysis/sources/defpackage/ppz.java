package defpackage;

/* loaded from: classes2.dex */
final class ppz implements pqd {
    final /* synthetic */ pqe a;
    private vae b = null;

    public ppz(pqe pqeVar) {
        this.a = pqeVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, uzy] */
    @Override // defpackage.pqd
    public final synchronized void b() {
        this.b = new pqf(this, 1);
        ?? r0 = ((kex) this.a.d.a()).a;
        vae vaeVar = this.b;
        vaeVar.getClass();
        r0.e(vaeVar, zfq.a);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, uzy] */
    @Override // defpackage.pqd
    public final synchronized void c() {
        if (this.b != null) {
            ?? r0 = ((kex) this.a.d.a()).a;
            vae vaeVar = this.b;
            vaeVar.getClass();
            r0.f(vaeVar);
            this.b = null;
        }
    }
}
