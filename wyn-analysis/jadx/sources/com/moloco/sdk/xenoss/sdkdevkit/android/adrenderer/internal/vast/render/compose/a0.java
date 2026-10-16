package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.view.View;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class a0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public View f31850a;

    /* renamed from: b, reason: collision with root package name */
    public int f31851b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o f31852c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o oVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31852c = oVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new a0(this.f31852c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r10.f31851b
            r2 = 0
            r3 = 4
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            android.view.View r0 = r10.f31850a
            Fe.e.U(r11)
            goto L80
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            android.view.View r1 = r10.f31850a
            Fe.e.U(r11)
            goto L6d
        L23:
            Fe.e.U(r11)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.o r11 = r10.f31852c
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j r1 = r11.f32261a
            s6.C r1 = r1.f32241l
            if (r1 == 0) goto L31
            r1.setVisibility(r3)
        L31:
            r10.f31850a = r1
            r10.f31851b = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j r11 = r11.f32261a
            E5.I r11 = r11.f32245p
            ef.C r5 = ef.C2515C.f34653a
            if (r11 == 0) goto L6a
            Ef.n r6 = new Ef.n
            jf.c r7 = A6.h.A(r10)
            r8 = 1
            r6.<init>(r8, r7)
            r6.t()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g r7 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
            r7.<init>(r11, r6)
            K8.H r8 = r11.f3091l
            r8.d(r7)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f r8 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
            r9 = 0
            r8.<init>(r9, r11, r7)
            r6.v(r8)
            java.lang.Object r11 = r6.s()
            kf.a r6 = kf.a.f39711a
            if (r11 != r6) goto L66
            goto L67
        L66:
            r11 = r5
        L67:
            if (r11 != r6) goto L6a
            r5 = r11
        L6a:
            if (r5 != r0) goto L6d
            goto L7e
        L6d:
            if (r1 == 0) goto L72
            r1.setVisibility(r2)
        L72:
            r10.f31850a = r1
            r10.f31851b = r4
            r4 = 50
            java.lang.Object r11 = Ef.H.m(r4, r10)
            if (r11 != r0) goto L7f
        L7e:
            return r0
        L7f:
            r0 = r1
        L80:
            if (r0 == 0) goto L85
            r0.setVisibility(r3)
        L85:
            if (r0 == 0) goto L8a
            r0.setVisibility(r2)
        L8a:
            ef.C r11 = ef.C2515C.f34653a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
