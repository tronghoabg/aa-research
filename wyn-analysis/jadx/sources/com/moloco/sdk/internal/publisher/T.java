package com.moloco.sdk.internal.publisher;

import android.view.MotionEvent;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class T extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f28941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MotionEvent f28942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.O f28943c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V f28944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Hf.j0 f28945e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(MotionEvent motionEvent, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.O o7, V v2, Hf.j0 j0Var, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28942b = motionEvent;
        this.f28943c = o7;
        this.f28944d = v2;
        this.f28945e = j0Var;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        Hf.j0 j0Var = this.f28945e;
        return new T(this.f28942b, this.f28943c, this.f28944d, j0Var, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r5 = r18
            kf.a r6 = kf.a.f39711a
            int r0 = r5.f28941a
            ef.C r7 = ef.C2515C.f34653a
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            Fe.e.U(r19)
            return r7
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L19:
            Fe.e.U(r19)
            android.view.MotionEvent r0 = r5.f28942b
            if (r0 == 0) goto L99
            com.moloco.sdk.internal.publisher.V r2 = r5.f28944d
            r3 = r0
            com.moloco.sdk.internal.services.B r0 = r2.f28957l
            R0.e r4 = r2.f28965t
            java.lang.Object r8 = r4.f10057i
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r4 = r4.f10056h
            java.lang.String r4 = (java.lang.String) r4
            r5.f28941a = r1
            int r1 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.O.f30847a
            ef.p r1 = com.moloco.sdk.internal.C.f28485a
            java.lang.Object r1 = r1.getValue()
            com.moloco.sdk.internal.B r1 = (com.moloco.sdk.internal.B) r1
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.O r9 = r5.f28943c
            int r10 = r3.getAction()
            if (r10 != 0) goto L95
            r10 = 2
            int[] r10 = new int[r10]
            r9.getLocationOnScreen(r10)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a r11 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a
            int r12 = ff.m.t0(r10)
            int r13 = ff.m.B0(r10)
            int r14 = r9.getHeight()
            int r15 = r9.getWidth()
            float r9 = r3.getX()
            r19 = r0
            int r0 = ff.m.t0(r10)
            float r0 = (float) r0
            float r9 = r9 + r0
            int r0 = (int) r9
            float r3 = r3.getY()
            int r9 = ff.m.B0(r10)
            float r9 = (float) r9
            float r3 = r3 + r9
            int r3 = (int) r3
            r16 = r0
            r17 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            if (r8 == 0) goto L84
            long r9 = java.lang.System.currentTimeMillis()
            r0 = 0
            r1.a(r8, r9, r0)
        L84:
            if (r4 == 0) goto L95
            r1 = r4
            Hf.j0 r4 = r5.f28945e
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s r3 = r2.f28966u
            r0 = r19
            r2 = r11
            java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 != r6) goto L95
            goto L96
        L95:
            r0 = r7
        L96:
            if (r0 != r6) goto L99
            return r6
        L99:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.T.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
