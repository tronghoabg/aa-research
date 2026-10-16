package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class os implements defpackage.eqe {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ os(defpackage.bil bilVar, defpackage.od odVar, int i) {
        this.c = i;
        this.b = bilVar;
        this.a = odVar;
    }

    @Override // defpackage.eqe
    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
        if (this.c != 0) {
            if (epwVar == defpackage.epw.ON_CREATE) {
                java.lang.Object obj = this.a;
                java.lang.Object obj2 = this.b;
                android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = ((defpackage.od) obj).getOnBackInvokedDispatcher();
                onBackInvokedDispatcher.getClass();
                ((defpackage.bil) obj2).z(onBackInvokedDispatcher);
                return;
            }
            return;
        }
        int iOrdinal = epwVar.ordinal();
        if (iOrdinal == 1) {
            ((defpackage.oo) this.a).d(true);
            return;
        }
        if (iOrdinal == 4) {
            ((defpackage.oo) this.a).d(false);
        } else {
            if (iOrdinal != 5) {
                return;
            }
            ((defpackage.ewz) this.a).f();
            ((defpackage.epy) this.b).d(this);
        }
    }

    public os(defpackage.oo ooVar, defpackage.epy epyVar, int i) {
        this.c = i;
        this.a = ooVar;
        this.b = epyVar;
    }
}
