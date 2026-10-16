package defpackage;

/* loaded from: classes3.dex */
final class sze implements aedp {
    final /* synthetic */ szh a;
    private final afec b;
    private final boolean c;

    public sze(szh szhVar, afec afecVar, boolean z) {
        this.a = szhVar;
        this.b = afecVar;
        this.c = z;
    }

    @Override // defpackage.aedp
    public final void a() {
        ((ype) szh.a.e()).u("Finished sending notification");
    }

    @Override // defpackage.aedp
    public final void b(Throwable th) {
        ((ype) ((ype) szh.a.g()).p(th)).u("Error sending notification");
        this.b.invoke(th);
    }

    @Override // defpackage.aedp
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        taj tajVar = (taj) obj;
        tajVar.getClass();
        if ((tajVar.b & 1) != 0) {
            szh szhVar = this.a;
            tak takVar = tajVar.c;
            if (takVar == null) {
                takVar = tak.a;
            }
            takVar.getClass();
            szhVar.h(takVar, this.b, this.c);
        }
    }
}
