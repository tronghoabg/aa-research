package com.moloco.sdk.internal.publisher;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class g0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f29023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o f29024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X2.j f29025c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f29026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o oVar, X2.j jVar, l0 l0Var, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29024b = oVar;
        this.f29025c = jVar;
        this.f29026d = l0Var;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new g0(this.f29024b, this.f29025c, this.f29026d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (Hf.k0.p(r10, r1, r9) == r0) goto L17;
     */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r9.f29023a
            com.moloco.sdk.internal.publisher.l0 r2 = r9.f29026d
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o r3 = r9.f29024b
            r4 = 0
            r5 = 6
            java.lang.String r2 = r2.f29060d
            X2.j r6 = r9.f29025c
            r7 = 1
            r8 = 2
            if (r1 == 0) goto L26
            if (r1 == r7) goto L22
            if (r1 != r8) goto L1a
            Fe.e.U(r10)
            goto L63
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            Fe.e.U(r10)
            goto L3b
        L26:
            Fe.e.U(r10)
            Hf.v0 r10 = r3.l()
            com.moloco.sdk.internal.publisher.e0 r1 = new com.moloco.sdk.internal.publisher.e0
            r1.<init>(r8, r4)
            r9.f29023a = r7
            java.lang.Object r10 = Hf.k0.p(r10, r1, r9)
            if (r10 != r0) goto L3b
            goto L62
        L3b:
            if (r6 == 0) goto L51
            com.moloco.sdk.publisher.MolocoAd r10 = com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(r2, r4, r4, r5, r4)
            r6.getClass()
            java.lang.String r1 = "molocoAd"
            kotlin.jvm.internal.AbstractC3340k.e(r10, r1)
            java.lang.Object r1 = r6.f16075b
            com.moloco.sdk.internal.publisher.b r1 = (com.moloco.sdk.internal.publisher.C1913b) r1
            r7 = 0
            r1.b(r10, r7)
        L51:
            Hf.v0 r10 = r3.l()
            com.moloco.sdk.internal.publisher.f0 r1 = new com.moloco.sdk.internal.publisher.f0
            r1.<init>(r8, r4)
            r9.f29023a = r8
            java.lang.Object r10 = Hf.k0.p(r10, r1, r9)
            if (r10 != r0) goto L63
        L62:
            return r0
        L63:
            if (r6 == 0) goto L6c
            com.moloco.sdk.publisher.MolocoAd r10 = com.moloco.sdk.publisher.MolocoAdKt.createAdInfo$default(r2, r4, r4, r5, r4)
            r6.W(r10)
        L6c:
            ef.C r10 = ef.C2515C.f34653a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
