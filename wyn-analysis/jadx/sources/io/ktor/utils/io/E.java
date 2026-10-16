package io.ktor.utils.io;

import Ef.C0505o0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class E extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public C0505o0 f37335a;

    /* renamed from: b, reason: collision with root package name */
    public int f37336b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f37337c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Od.b f37338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2880m f37339e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Od.b bVar, C2880m c2880m, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f37338d = bVar;
        this.f37339e = c2880m;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        E e7 = new E(this.f37338d, this.f37339e, interfaceC3103c);
        e7.f37337c = obj;
        return e7;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if (r1.join(r11) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r1.join(r11) == r0) goto L39;
     */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r11.f37336b
            io.ktor.utils.io.m r2 = r11.f37339e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L37
            if (r1 == r6) goto L2b
            if (r1 == r5) goto L26
            if (r1 == r4) goto L26
            if (r1 == r3) goto L1d
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            java.lang.Object r0 = r11.f37337c
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            Fe.e.U(r12)
            goto Lbf
        L26:
            Fe.e.U(r12)
            goto Lad
        L2b:
            Ef.o0 r1 = r11.f37335a
            java.lang.Object r6 = r11.f37337c
            Ef.E r6 = (Ef.E) r6
            Fe.e.U(r12)     // Catch: java.lang.Throwable -> L35
            goto L69
        L35:
            r12 = move-exception
            goto L98
        L37:
            Fe.e.U(r12)
            java.lang.Object r12 = r11.f37337c
            Ef.E r12 = (Ef.E) r12
            jf.h r1 = r12.getCoroutineContext()
            Ef.m0 r1 = Ef.H.u(r1)
            Ef.o0 r8 = new Ef.o0
            r8.<init>(r1)
            Od.b r1 = r11.f37338d     // Catch: java.lang.Throwable -> L96
            io.ktor.utils.io.Z r9 = new io.ktor.utils.io.Z     // Catch: java.lang.Throwable -> L96
            jf.h r10 = r12.getCoroutineContext()     // Catch: java.lang.Throwable -> L96
            jf.h r10 = r10.plus(r8)     // Catch: java.lang.Throwable -> L96
            r9.<init>(r2, r10)     // Catch: java.lang.Throwable -> L96
            r11.f37337c = r12     // Catch: java.lang.Throwable -> L96
            r11.f37335a = r8     // Catch: java.lang.Throwable -> L96
            r11.f37336b = r6     // Catch: java.lang.Throwable -> L96
            java.lang.Object r1 = r1.invoke(r9, r11)     // Catch: java.lang.Throwable -> L96
            if (r1 != r0) goto L67
            goto Lbd
        L67:
            r6 = r12
            r1 = r8
        L69:
            r1.Y()     // Catch: java.lang.Throwable -> L35
            jf.h r12 = r6.getCoroutineContext()     // Catch: java.lang.Throwable -> L35
            Ef.m0 r12 = Ef.H.u(r12)     // Catch: java.lang.Throwable -> L35
            boolean r12 = r12.isCancelled()     // Catch: java.lang.Throwable -> L35
            if (r12 == 0) goto L89
            jf.h r12 = r6.getCoroutineContext()     // Catch: java.lang.Throwable -> L35
            Ef.m0 r12 = Ef.H.u(r12)     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.CancellationException r12 = r12.getCancellationException()     // Catch: java.lang.Throwable -> L35
            r2.a(r12)     // Catch: java.lang.Throwable -> L35
        L89:
            r11.f37337c = r7
            r11.f37335a = r7
            r11.f37336b = r5
            java.lang.Object r12 = r1.join(r11)
            if (r12 != r0) goto Lad
            goto Lbd
        L96:
            r12 = move-exception
            r1 = r8
        L98:
            java.lang.String r5 = "Exception thrown while reading from channel"
            Ef.H.k(r1, r5, r12)     // Catch: java.lang.Throwable -> Lb0
            io.ktor.utils.io.N.c(r2, r12)     // Catch: java.lang.Throwable -> Lb0
            r11.f37337c = r7
            r11.f37335a = r7
            r11.f37336b = r4
            java.lang.Object r12 = r1.join(r11)
            if (r12 != r0) goto Lad
            goto Lbd
        Lad:
            ef.C r12 = ef.C2515C.f34653a
            return r12
        Lb0:
            r12 = move-exception
            r11.f37337c = r12
            r11.f37335a = r7
            r11.f37336b = r3
            java.lang.Object r1 = r1.join(r11)
            if (r1 != r0) goto Lbe
        Lbd:
            return r0
        Lbe:
            r0 = r12
        Lbf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
