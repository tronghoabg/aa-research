package Ef;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: Ef.j0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0495j0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A0.p f3745b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0495j0(A0.p pVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f3745b = pVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C0495j0 c0495j0 = new C0495j0(this.f3745b, interfaceC3103c);
        c0495j0.f3744a = obj;
        return c0495j0;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0495j0) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        return r0.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        r1.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        throw r5;
     */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            kf.a r0 = kf.a.f39711a
            Fe.e.U(r5)
            java.lang.Object r5 = r4.f3744a
            Ef.E r5 = (Ef.E) r5
            jf.h r5 = r5.getCoroutineContext()
            A0.p r0 = r4.f3745b
            Ef.K0 r1 = new Ef.K0     // Catch: java.lang.InterruptedException -> L42
            r1.<init>()     // Catch: java.lang.InterruptedException -> L42
            Ef.m0 r5 = Ef.H.u(r5)     // Catch: java.lang.InterruptedException -> L42
            r2 = 1
            Ef.U r5 = Ef.H.x(r5, r2, r1)     // Catch: java.lang.InterruptedException -> L42
            r1.f3684f = r5     // Catch: java.lang.InterruptedException -> L42
        L1f:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = Ef.K0.f3682g     // Catch: java.lang.InterruptedException -> L42
            int r2 = r5.get(r1)     // Catch: java.lang.InterruptedException -> L42
            if (r2 == 0) goto L33
            r5 = 2
            if (r2 == r5) goto L3a
            r5 = 3
            if (r2 != r5) goto L2e
            goto L3a
        L2e:
            Ef.K0.l(r2)     // Catch: java.lang.InterruptedException -> L42
            r5 = 0
            throw r5     // Catch: java.lang.InterruptedException -> L42
        L33:
            r3 = 0
            boolean r5 = r5.compareAndSet(r1, r2, r3)     // Catch: java.lang.InterruptedException -> L42
            if (r5 == 0) goto L1f
        L3a:
            java.lang.Object r5 = r0.invoke()     // Catch: java.lang.Throwable -> L44
            r1.k()     // Catch: java.lang.InterruptedException -> L42
            return r5
        L42:
            r5 = move-exception
            goto L49
        L44:
            r5 = move-exception
            r1.k()     // Catch: java.lang.InterruptedException -> L42
            throw r5     // Catch: java.lang.InterruptedException -> L42
        L49:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Blocking call was interrupted due to parent cancellation"
            r0.<init>(r1)
            java.lang.Throwable r5 = r0.initCause(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Ef.C0495j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
