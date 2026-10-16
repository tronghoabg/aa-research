package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class advj extends adka {
    public final adjq a;
    private final adkk b;
    private final adix c;
    private final Executor d;
    private final admf e;
    private adiw f;
    private adqq g;

    public advj(adkk adkkVar, adix adixVar, Executor executor, admf admfVar, adiw adiwVar) {
        this.b = adkkVar;
        this.c = adixVar;
        this.e = admfVar;
        Executor executor2 = adiwVar.c;
        executor = executor2 != null ? executor2 : executor;
        this.d = executor;
        this.f = adiwVar.c(executor);
        this.a = adjq.k();
    }

    @Override // defpackage.adqq
    public final void b(adqq adqqVar, admc admcVar) {
        admf admfVar = this.e;
        new adld(admfVar, admcVar, this.f, advv.f);
        aebg aebgVarA = this.b.a();
        adnq adnqVar = (adnq) aebgVarA.a;
        if (!adnqVar.g()) {
            this.d.execute(new advi(this, adqqVar, adue.b(adnqVar)));
            this.g = advv.T;
        } else {
            adwe adweVarB = ((adwg) aebgVarA.b).b(admfVar);
            if (adweVarB != null) {
                this.f = this.f.f(adwe.a, adweVarB);
            }
            adqq adqqVarD = this.c.d(admfVar, this.f);
            this.g = adqqVarD;
            adqqVarD.b(adqqVar, admcVar);
        }
    }

    @Override // defpackage.admu, defpackage.adqq
    public final void i(String str, Throwable th) {
        adqq adqqVar = this.g;
        if (adqqVar != null) {
            adqqVar.i(str, th);
        }
    }

    @Override // defpackage.adka, defpackage.admu
    protected final adqq k() {
        return this.g;
    }
}
