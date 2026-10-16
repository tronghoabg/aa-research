package defpackage;

/* loaded from: classes3.dex */
final class aedh extends aedd {
    private final aedc a;
    private Object b;
    private boolean c = false;

    public aedh(aedc aedcVar) {
        this.a = aedcVar;
    }

    @Override // defpackage.adqq
    public final void a(adnq adnqVar, admc admcVar) {
        if (!adnqVar.g()) {
            this.a.p(new adnt(adnqVar, admcVar));
            return;
        }
        if (!this.c) {
            this.a.p(new adnt(adnq.l.e("No value received for unary call"), admcVar));
        }
        this.a.o(this.b);
    }

    @Override // defpackage.adqq
    public final void g(Object obj) {
        if (this.c) {
            throw new adnt(adnq.l.e("More than one value received for unary call"), null);
        }
        this.b = obj;
        this.c = true;
    }

    @Override // defpackage.aedd
    public final void k() {
        this.a.a.m(2);
    }

    @Override // defpackage.adqq
    public final void be(admc admcVar) {
    }
}
