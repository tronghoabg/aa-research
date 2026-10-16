package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zix extends adjz {
    private final AtomicReference a;

    public zix(adqq adqqVar) {
        super(adqqVar);
        this.a = new AtomicReference(new acjs(1, (Object) null));
    }

    @Override // defpackage.adqq
    public final void b(adqq adqqVar, admc admcVar) {
        AtomicReference atomicReference;
        acjs acjsVar;
        int i;
        do {
            atomicReference = this.a;
            acjsVar = (acjs) atomicReference.get();
            i = acjsVar.a;
        } while (!a.h(atomicReference, acjsVar, i == 1 ? new acjs(2, (Object) null) : acjsVar));
        if (i == 1) {
            this.b.b(adqqVar, admcVar);
        } else if (i == 4) {
            adqqVar.a((adnq) acjsVar.b, new admc());
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Already started");
            this.b.i("start() called more than once", illegalStateException);
            throw illegalStateException;
        }
    }

    @Override // defpackage.admu, defpackage.adqq
    public final void i(String str, Throwable th) {
        AtomicReference atomicReference;
        acjs acjsVar;
        int i;
        adnq adnqVarD = adnq.c;
        if (str != null) {
            adnqVarD = adnqVarD.e(str);
        }
        if (th != null) {
            adnqVarD = adnqVarD.d(th);
        }
        do {
            atomicReference = this.a;
            acjsVar = (acjs) atomicReference.get();
            i = acjsVar.a;
        } while (!a.h(atomicReference, acjsVar, i == 4 ? acjsVar : i == 1 ? acjs.e(4, adnqVarD) : acjs.e(5, adnqVarD)));
        this.b.i(str, th);
    }

    @Override // defpackage.admu, defpackage.adqq
    public final void j() {
        AtomicReference atomicReference;
        acjs acjsVar;
        do {
            atomicReference = this.a;
            acjsVar = (acjs) atomicReference.get();
            if (acjsVar.a != 2) {
                throw new IllegalStateException("Call was either not started or already half-closed.");
            }
        } while (!a.h(atomicReference, acjsVar, new acjs(3, (Object) null)));
        this.b.j();
    }

    @Override // defpackage.admu, defpackage.adqq
    public final void m(int i) {
        int i2 = ((acjs) this.a.get()).a;
        if (i2 == 1 || i2 == 4) {
            throw new IllegalStateException("Not started");
        }
        this.b.m(i);
    }

    @Override // defpackage.adka, defpackage.adqq
    public final void n(Object obj) {
        obj.getClass();
        int i = ((acjs) this.a.get()).a;
        if (i == 2) {
            this.b.n(obj);
        } else if (i != 5) {
            throw new IllegalStateException("Call was either not started or already half-closed.");
        }
    }
}
