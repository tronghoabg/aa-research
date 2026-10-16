package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aeee extends defpackage.aeed {
    private final defpackage.aeep a;
    private final defpackage.aeeb b;
    private boolean c;

    public aeee(defpackage.aeep aeepVar, defpackage.aeeb aeebVar) {
        this.a = aeepVar;
        this.b = aeebVar;
        if (aeepVar instanceof aeej) {
            ((aeej) aeepVar).d();
        }
    }

    @Override // defpackage.adrq
    public final void a(defpackage.ador adorVar, defpackage.adnd adndVar) {
        boolean zG = adorVar.g();
        defpackage.aeep aeepVar = this.a;
        if (zG) {
            aeepVar.a();
        } else {
            aeepVar.b(new defpackage.adou(adorVar, adndVar));
        }
    }

    @Override // defpackage.adrq
    public final void g(java.lang.Object obj) {
        if (this.c && !this.b.a) {
            throw new defpackage.adou(defpackage.ador.l.e("More than one responses received for unary or client-streaming call"), null);
        }
        this.c = true;
        this.a.c(obj);
        defpackage.aeeb aeebVar = this.b;
        if (aeebVar.a) {
            aeebVar.d();
        }
    }

    @Override // defpackage.aeed
    public final void k() {
        this.b.d();
    }

    @Override // defpackage.adrq
    public final void h() {
    }

    @Override // defpackage.adrq
    public final void aV(defpackage.adnd adndVar) {
    }
}
