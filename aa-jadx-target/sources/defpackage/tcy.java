package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tcy implements defpackage.zhh {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public tcy(defpackage.eqp eqpVar, defpackage.eqt eqtVar, int i) {
        this.c = i;
        this.a = eqpVar;
        this.b = eqtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [eqt, java.lang.Object] */
    @Override // defpackage.zhh
    public final void a(java.lang.Throwable th) {
        int i = this.c;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((puj) obj).a((defpackage.xyn) this.b);
        } else {
            ((defpackage.eqp) obj).k(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [eqt, java.lang.Object] */
    @Override // defpackage.zhh
    public final void b(java.lang.Object obj) {
        int i = this.c;
        java.lang.Object obj2 = this.a;
        if (i != 0) {
            ((puj) obj2).a((defpackage.xyn) this.b);
        } else {
            ((defpackage.eqp) obj2).k(this.b);
        }
    }

    public tcy(puj pujVar, defpackage.xyn xynVar, int i) {
        this.c = i;
        this.b = xynVar;
        this.a = pujVar;
    }
}
