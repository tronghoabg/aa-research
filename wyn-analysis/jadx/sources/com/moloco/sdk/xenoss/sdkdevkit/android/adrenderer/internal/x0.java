package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import Hf.InterfaceC0602l;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class x0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.G f32355a;

    /* renamed from: b, reason: collision with root package name */
    public int f32356b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f32357c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.E f32358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0602l f32359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.E f32360f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(kotlin.jvm.internal.E e7, InterfaceC0602l interfaceC0602l, kotlin.jvm.internal.E e10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32358d = e7;
        this.f32359e = interfaceC0602l;
        this.f32360f = e10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        x0 x0Var = new x0(this.f32358d, this.f32359e, this.f32360f, interfaceC3103c);
        x0Var.f32357c = obj;
        return x0Var;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x0) create((Gf.t) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (p7.AbstractC3772b.f(r6, r1, r10) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r1.collect(r2, r10) == r0) goto L30;
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
            int r1 = r10.f32356b
            kotlin.jvm.internal.E r5 = r10.f32358d
            r8 = 3
            r9 = 2
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L1f
            if (r1 == r9) goto L1a
            if (r1 != r8) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            Fe.e.U(r11)
            goto L98
        L1f:
            kotlin.jvm.internal.G r1 = r10.f32355a
            java.lang.Object r2 = r10.f32357c
            Gf.t r2 = (Gf.t) r2
            Fe.e.U(r11)
            r6 = r2
        L29:
            r4 = r1
            goto L52
        L2b:
            Fe.e.U(r11)
            java.lang.Object r11 = r10.f32357c
            Gf.t r11 = (Gf.t) r11
            kotlin.jvm.internal.G r1 = new kotlin.jvm.internal.G
            r1.<init>()
            int r3 = r5.f39738a
            ef.u r4 = new ef.u
            r4.<init>(r3)
            r10.f32357c = r11
            r10.f32355a = r1
            r10.f32356b = r2
            r2 = r11
            Gf.s r2 = (Gf.s) r2
            Gf.e r2 = r2.f4839d
            java.lang.Object r2 = r2.i(r4, r10)
            if (r2 != r0) goto L50
            goto L97
        L50:
            r6 = r11
            goto L29
        L52:
            kotlin.jvm.internal.E r3 = r10.f32360f
            r11 = 0
            Hf.l r1 = r10.f32359e
            if (r1 != 0) goto L82
            int r1 = r3.f39738a
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r4.f39740a
            if (r1 == 0) goto L62
            goto L6e
        L62:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0 r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            Ef.H0 r1 = Ef.H.D(r6, r11, r2, r8)
            r4.f39740a = r1
        L6e:
            Af.q r1 = new Af.q
            r2 = 18
            r1.<init>(r4, r2)
            r10.f32357c = r11
            r10.f32355a = r11
            r10.f32356b = r9
            java.lang.Object r11 = p7.AbstractC3772b.f(r6, r1, r10)
            if (r11 != r0) goto L98
            goto L97
        L82:
            Hf.l r1 = Hf.k0.m(r1)
            If.m r2 = new If.m
            r2.<init>(r3, r4, r6, r5)
            r10.f32357c = r11
            r10.f32355a = r11
            r10.f32356b = r8
            java.lang.Object r11 = r1.collect(r2, r10)
            if (r11 != r0) goto L98
        L97:
            return r0
        L98:
            ef.C r11 = ef.C2515C.f34653a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
