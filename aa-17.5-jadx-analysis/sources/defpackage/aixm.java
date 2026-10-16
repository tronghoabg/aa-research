package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public class aixm extends aisz implements aixl {
    public final aixl b;

    public aixm(afco afcoVar, aixl aixlVar) {
        super(afcoVar, true);
        this.b = aixlVar;
    }

    @Override // defpackage.aixx
    public final aiwz A() {
        return this.b.A();
    }

    @Override // defpackage.aixx
    public final ajds B() {
        throw null;
    }

    @Override // defpackage.aixx
    public final ajds C() {
        return this.b.C();
    }

    @Override // defpackage.aivo
    public final void H(Throwable th) {
        aixl aixlVar = this.b;
        CancellationException cancellationExceptionE = E(th, null);
        aixlVar.s(cancellationExceptionE);
        L(cancellationExceptionE);
    }

    @Override // defpackage.aixx
    public final Object d(afck afckVar) {
        throw null;
    }

    @Override // defpackage.aixx
    public final Object e(afck afckVar) {
        throw null;
    }

    @Override // defpackage.aixy
    public final Object h(Object obj, afck afckVar) {
        return this.b.h(obj, afckVar);
    }

    @Override // defpackage.aixx
    public final Object i() {
        return this.b.i();
    }

    @Override // defpackage.aixy
    public final Object j(Object obj) {
        return this.b.j(obj);
    }

    @Override // defpackage.aixy
    public final void r(afec afecVar) {
        throw null;
    }

    @Override // defpackage.aivo, defpackage.aivh
    public final void s(CancellationException cancellationException) {
        if (v()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new aivi(hF(), null, this);
        }
        H(cancellationException);
    }

    @Override // defpackage.aixy
    public final boolean u(Throwable th) {
        return this.b.u(th);
    }

    @Override // defpackage.aixy
    public final boolean y() {
        throw null;
    }
}
