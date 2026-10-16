package defpackage;

/* loaded from: classes3.dex */
final class adxz implements Runnable {
    final adxy a;
    final /* synthetic */ adyg b;

    public adxz(adyg adygVar, adxy adxyVar) {
        this.b = adygVar;
        this.a = adxyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        adyg adygVar = this.b;
        adye adyeVarP = adygVar.p(adygVar.r.e, false, true);
        if (adyeVarP == null) {
            return;
        }
        adygVar.g.execute(new adsy(this, adyeVarP, 19, (char[]) null));
    }
}
