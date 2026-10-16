package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zgs extends defpackage.zgk {
    public defpackage.zgr c;

    public zgs(defpackage.ygm ygmVar, boolean z, java.util.concurrent.Executor executor, defpackage.zgm zgmVar) {
        super(ygmVar, z, false);
        this.c = new defpackage.zgp(this, zgmVar, executor);
        u();
    }

    @Override // defpackage.zgk
    public final void g() {
        defpackage.zgr zgrVar = this.c;
        if (zgrVar != null) {
            zgrVar.f();
        }
    }

    @Override // defpackage.zga
    protected final void l() {
        defpackage.zgr zgrVar = this.c;
        if (zgrVar != null) {
            zgrVar.h();
        }
    }

    @Override // defpackage.zgk
    public final void w(int i) {
        super.w(i);
        if (i == 1) {
            this.c = null;
        }
    }

    public zgs(defpackage.ygm ygmVar, boolean z, java.util.concurrent.Executor executor, java.util.concurrent.Callable callable) {
        super(ygmVar, z, false);
        this.c = new defpackage.zgq(this, callable, executor);
        u();
    }

    @Override // defpackage.zgk
    public final void e(int i, java.lang.Object obj) {
    }
}
