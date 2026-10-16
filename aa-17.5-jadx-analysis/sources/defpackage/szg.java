package defpackage;

/* loaded from: classes3.dex */
final class szg implements aedp {
    final /* synthetic */ szh a;
    private final afec b;
    private final boolean c;
    private final Runnable d;

    public szg(szh szhVar, afec afecVar, boolean z, Runnable runnable) {
        this.a = szhVar;
        this.b = afecVar;
        this.c = z;
        this.d = runnable;
    }

    @Override // defpackage.aedp
    public final void a() {
        ((ype) szh.a.e()).u("Started assistant session");
        this.d.run();
    }

    @Override // defpackage.aedp
    public final void b(Throwable th) {
        ((ype) ((ype) szh.a.g()).p(th)).u("Error starting assistant session");
        this.b.invoke(th);
    }

    @Override // defpackage.aedp
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        taw tawVar = (taw) obj;
        tawVar.getClass();
        if ((tawVar.b & 1) != 0) {
            szh szhVar = this.a;
            tak takVar = tawVar.c;
            if (takVar == null) {
                takVar = tak.a;
            }
            takVar.getClass();
            szhVar.h(takVar, this.b, this.c);
        }
    }
}
