package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class fph extends afde implements afeg {
    Object a;
    Object b;
    int c;
    final /* synthetic */ fjn d;
    final /* synthetic */ fod e;
    final /* synthetic */ gjv f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fph(fjn fjnVar, gjv gjvVar, fod fodVar, afck afckVar) {
        super(2, afckVar);
        this.d = fjnVar;
        this.f = gjvVar;
        this.e = fodVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        fph fphVar = new fph(this.d, this.f, this.e, afckVar);
        fphVar.g = obj;
        return fphVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aivh] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aivh] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        CancellationException cancellationException;
        AtomicInteger atomicInteger;
        zgp zgpVar;
        ?? r5;
        afcr afcrVar = afcr.a;
        ?? r1 = this.c;
        try {
            try {
                if (r1 != 0) {
                    Object obj2 = this.b;
                    r5 = this.a;
                    atomicInteger = (AtomicInteger) this.g;
                    try {
                        woy.dF(obj);
                        r1 = obj2;
                        r5 = r5;
                    } catch (CancellationException e) {
                        cancellationException = e;
                        zgpVar = r5;
                        String str = fpl.a;
                        fjn fjnVar = this.d;
                        fjo.a().d(str, "Delegated worker " + fjnVar.getClass() + " was cancelled", cancellationException);
                        int i = atomicInteger.get();
                        if (zgpVar.isCancelled() || i == -256) {
                            throw cancellationException;
                        }
                        throw new fpf(atomicInteger.get());
                    }
                } else {
                    woy.dF(obj);
                    aitx aitxVar = (aitx) this.g;
                    AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                    fjn fjnVar2 = this.d;
                    gjv gjvVar = this.f;
                    fod fodVar = this.e;
                    zgp zgpVarB = fjnVar2.b();
                    aivh aivhVarD = ahnc.d(aitxVar, null, 0, new foz(gjvVar, fodVar, atomicInteger2, zgpVarB, (afck) null, 2), 3);
                    try {
                        this.g = atomicInteger2;
                        this.a = zgpVarB;
                        this.b = aivhVarD;
                        this.c = 1;
                        obj = vy.h(zgpVarB, this);
                        if (obj == afcrVar) {
                            return afcrVar;
                        }
                        atomicInteger = atomicInteger2;
                        r5 = zgpVarB;
                        r1 = aivhVarD;
                    } catch (CancellationException e2) {
                        cancellationException = e2;
                        atomicInteger = atomicInteger2;
                        zgpVar = zgpVarB;
                        String str2 = fpl.a;
                        fjn fjnVar3 = this.d;
                        fjo.a().d(str2, "Delegated worker " + fjnVar3.getClass() + " was cancelled", cancellationException);
                        int i2 = atomicInteger.get();
                        if (zgpVar.isCancelled()) {
                            throw cancellationException;
                        }
                        throw cancellationException;
                    }
                }
                dsu dsuVar = (dsu) obj;
                r1.s(null);
                return dsuVar;
            } catch (Throwable th) {
                String str3 = fpl.a;
                fjn fjnVar4 = this.d;
                fjo.a().d(str3, "Delegated worker " + fjnVar4.getClass() + " threw exception in startWork.", th);
                throw th;
            }
        } catch (Throwable th2) {
            r1.s(null);
            throw th2;
        }
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((fph) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
