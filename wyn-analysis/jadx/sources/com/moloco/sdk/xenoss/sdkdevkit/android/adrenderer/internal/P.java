package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.view.View;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class P extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30009a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f30010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f30011c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Gf.t f30012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S f30013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Gf.t tVar, View view, S s10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30011c = view;
        this.f30012d = tVar;
        this.f30013e = s10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        P p10 = new P(this.f30012d, this.f30011c, this.f30013e, interfaceC3103c);
        p10.f30010b = ((Boolean) obj).booleanValue();
        return p10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((P) create(bool, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (Hf.k0.k(r3, r4, r7) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (((Gf.s) r1).f4839d.i(r8, r7) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        return r0;
     */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r7.f30009a
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L19
            if (r1 == r2) goto L15
            if (r1 != r3) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            Fe.e.U(r8)
            goto L69
        L19:
            Fe.e.U(r8)
            boolean r8 = r7.f30010b
            Gf.t r1 = r7.f30012d
            if (r8 == 0) goto L5a
            android.view.View r8 = r7.f30011c
            androidx.lifecycle.v r4 = androidx.lifecycle.V.e(r8)
            r5 = 0
            if (r4 == 0) goto L40
            androidx.lifecycle.o r4 = r4.getLifecycle()
            if (r4 != 0) goto L32
            goto L40
        L32:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.X r3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.X
            r3.<init>(r4, r5)
            Hf.c r3 = Hf.k0.h(r3)
            Hf.l r3 = a.AbstractC1304a.j(r3)
            goto L4a
        L40:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Y r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Y
            r4.<init>(r3, r5)
            Hf.f0 r3 = new Hf.f0
            r3.<init>(r4)
        L4a:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S r6 = r7.f30013e
            r4.<init>(r1, r8, r6, r5)
            r7.f30009a = r2
            java.lang.Object r8 = Hf.k0.k(r3, r4, r7)
            if (r8 != r0) goto L69
            goto L68
        L5a:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r7.f30009a = r3
            Gf.s r1 = (Gf.s) r1
            Gf.e r1 = r1.f4839d
            java.lang.Object r8 = r1.i(r8, r7)
            if (r8 != r0) goto L69
        L68:
            return r0
        L69:
            ef.C r8 = ef.C2515C.f34653a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.P.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
