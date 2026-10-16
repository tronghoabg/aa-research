package defpackage;

/* loaded from: classes3.dex */
final class aadh implements aaeu {
    final /* synthetic */ zrq a;
    public Object b;
    private final /* synthetic */ int c;

    public aadh(zrq zrqVar, int i) {
        this.c = i;
        this.a = zrqVar;
    }

    @Override // defpackage.aaeu
    public final void a(aaem aaemVar) {
        int i = this.c;
        zrq zrqVar = this.a;
        if (i != 0) {
            this.b = aaemVar.f(zrqVar);
        } else {
            this.b = aaemVar.h(zrqVar);
        }
    }
}
