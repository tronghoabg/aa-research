package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.view.View;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class U extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30038a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f30040c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(View view, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30040c = view;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        U u10 = new U(this.f30040c, interfaceC3103c);
        u10.f30039b = obj;
        return u10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((Gf.t) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (p7.AbstractC3772b.f(r1, r3, r6) == r0) goto L15;
     */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r6.f30038a
            r2 = 2
            r3 = 1
            android.view.View r4 = r6.f30040c
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            Fe.e.U(r7)
            goto L5d
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.f30039b
            Gf.t r1 = (Gf.t) r1
            Fe.e.U(r7)
            goto L42
        L22:
            Fe.e.U(r7)
            java.lang.Object r7 = r6.f30039b
            r1 = r7
            Gf.t r1 = (Gf.t) r1
            boolean r7 = r4.isAttachedToWindow()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6.f30039b = r1
            r6.f30038a = r3
            r3 = r1
            Gf.s r3 = (Gf.s) r3
            Gf.e r3 = r3.f4839d
            java.lang.Object r7 = r3.i(r7, r6)
            if (r7 != r0) goto L42
            goto L5c
        L42:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T r7 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T
            r3 = 0
            r7.<init>(r1, r3)
            r4.addOnAttachStateChangeListener(r7)
            Bf.g r3 = new Bf.g
            r5 = 6
            r3.<init>(r5, r4, r7)
            r7 = 0
            r6.f30039b = r7
            r6.f30038a = r2
            java.lang.Object r7 = p7.AbstractC3772b.f(r1, r3, r6)
            if (r7 != r0) goto L5d
        L5c:
            return r0
        L5d:
            ef.C r7 = ef.C2515C.f34653a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.U.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
