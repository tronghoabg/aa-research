package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import Hf.InterfaceC0603m;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class v0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31089a;

    /* renamed from: b, reason: collision with root package name */
    public int f31090b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31091c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31092d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(int i5, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31092d = i5;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        v0 v0Var = new v0(this.f31092d, interfaceC3103c);
        v0Var.f31091c = obj;
        return v0Var;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v0) create((InterfaceC0603m) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0073 -> B:16:0x0049). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r7.f31090b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L22
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            goto L22
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            int r1 = r7.f31089a
            java.lang.Object r4 = r7.f31091c
            Hf.m r4 = (Hf.InterfaceC0603m) r4
            Fe.e.U(r8)
            goto L62
        L22:
            int r1 = r7.f31089a
            java.lang.Object r4 = r7.f31091c
            Hf.m r4 = (Hf.InterfaceC0603m) r4
            Fe.e.U(r8)
            goto L49
        L2c:
            Fe.e.U(r8)
            java.lang.Object r8 = r7.f31091c
            Hf.m r8 = (Hf.InterfaceC0603m) r8
            ef.u r1 = new ef.u
            int r5 = r7.f31092d
            r1.<init>(r5)
            r7.f31091c = r8
            r7.f31089a = r5
            r7.f31090b = r4
            java.lang.Object r1 = r8.emit(r1, r7)
            if (r1 != r0) goto L47
            goto L75
        L47:
            r4 = r8
            r1 = r5
        L49:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r1 ^ r8
            int r8 = java.lang.Integer.compare(r5, r8)
            if (r8 <= 0) goto L76
            r7.f31091c = r4
            r7.f31089a = r1
            r7.f31090b = r3
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = Ef.H.m(r5, r7)
            if (r8 != r0) goto L62
            goto L75
        L62:
            int r1 = r1 + (-1)
            ef.u r8 = new ef.u
            r8.<init>(r1)
            r7.f31091c = r4
            r7.f31089a = r1
            r7.f31090b = r2
            java.lang.Object r8 = r4.emit(r8, r7)
            if (r8 != r0) goto L49
        L75:
            return r0
        L76:
            ef.C r8 = ef.C2515C.f34653a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
