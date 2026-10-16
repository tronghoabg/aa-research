package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import A.C0212e;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class E extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0212e f31713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f31714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f31715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p f31716e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C0212e c0212e, float f10, boolean z2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p pVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31713b = c0212e;
        this.f31714c = f10;
        this.f31715d = z2;
        this.f31716e = pVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new E(this.f31713b, this.f31714c, this.f31715d, this.f31716e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        if (A.C0212e.c(r2, r1, r11, r10) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (r2.f(r10) == r0) goto L43;
     */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r10.f31712a
            A.e r2 = r10.f31713b
            r3 = 3
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r5) goto L1a
            if (r1 != r3) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            Fe.e.U(r11)
            goto L93
        L1f:
            Fe.e.U(r11)
            goto L36
        L23:
            Fe.e.U(r11)
            java.lang.Float r11 = new java.lang.Float
            float r1 = r10.f31714c
            r11.<init>(r1)
            r10.f31712a = r4
            java.lang.Object r11 = r2.e(r11, r10)
            if (r11 != r0) goto L36
            goto L92
        L36:
            boolean r11 = r10.f31715d
            if (r11 == 0) goto L8a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p r11 = r10.f31716e
            boolean r1 = r11 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
            if (r1 == 0) goto L8a
            java.lang.Float r1 = new java.lang.Float
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r3)
            boolean r3 = r11 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l
            r4 = 0
            if (r3 == 0) goto L4d
            goto L7b
        L4d:
            boolean r3 = r11 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
            if (r3 == 0) goto L65
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n r11 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n) r11
            long r6 = r11.f32075b
            r8 = 0
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L5c
            goto L7b
        L5c:
            long r8 = r11.f32074a
            long r6 = r6 - r8
            int r11 = (int) r6
            if (r11 >= 0) goto L63
            goto L7b
        L63:
            r4 = r11
            goto L7b
        L65:
            boolean r3 = r11 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o
            if (r3 != 0) goto L7b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m r3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m.f32073a
            boolean r11 = kotlin.jvm.internal.AbstractC3340k.a(r11, r3)
            if (r11 == 0) goto L72
            goto L7b
        L72:
            E5.Q r11 = new E5.Q
            r0 = 9
            r1 = 0
            r11.<init>(r1, r0)
            throw r11
        L7b:
            A.s r11 = A.C0225s.f182a
            A.Z r11 = A.AbstractC0226t.j(r4, r11, r5)
            r10.f31712a = r5
            java.lang.Object r11 = A.C0212e.c(r2, r1, r11, r10)
            if (r11 != r0) goto L93
            goto L92
        L8a:
            r10.f31712a = r3
            java.lang.Object r11 = r2.f(r10)
            if (r11 != r0) goto L93
        L92:
            return r0
        L93:
            ef.C r11 = ef.C2515C.f34653a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
