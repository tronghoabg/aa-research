package defpackage;

/* loaded from: classes.dex */
final class aede extends aedd {
    private final aedp a;
    private final aedb b;
    private boolean c;

    public aede(aedp aedpVar, aedb aedbVar) {
        this.a = aedpVar;
        this.b = aedbVar;
        if (aedpVar instanceof aedj) {
            ((aedj) aedpVar).d();
        }
    }

    @Override // defpackage.adqq
    public final void a(adnq adnqVar, admc admcVar) {
        boolean zG = adnqVar.g();
        aedp aedpVar = this.a;
        if (zG) {
            aedpVar.a();
        } else {
            aedpVar.b(new adnt(adnqVar, admcVar));
        }
    }

    @Override // defpackage.adqq
    public final void g(Object obj) {
        if (this.c && !this.b.a) {
            throw new adnt(adnq.l.e("More than one responses received for unary or client-streaming call"), null);
        }
        this.c = true;
        this.a.c(obj);
        aedb aedbVar = this.b;
        if (aedbVar.a) {
            aedbVar.d();
        }
    }

    @Override // defpackage.aedd
    public final void k() {
        this.b.d();
    }

    @Override // defpackage.adqq
    public final void h() {
    }

    @Override // defpackage.adqq
    public final void be(admc admcVar) {
    }
}
