package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import A.C0212e;
import Ef.E;
import N.V;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class h extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f31002a;

    /* renamed from: b, reason: collision with root package name */
    public int f31003b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31004c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0212e f31006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf.a f31007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ V f31008g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i5, int i10, C0212e c0212e, tf.a aVar, V v2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31004c = i5;
        this.f31005d = i10;
        this.f31006e = c0212e;
        this.f31007f = aVar;
        this.f31008g = v2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new h(this.f31004c, this.f31005d, this.f31006e, this.f31007f, this.f31008g, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r7.e(r10, r9) == r0) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kf.a] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r9.f31003b
            tf.a r2 = r9.f31007f
            r3 = 1
            r4 = 2
            int r5 = r9.f31004c
            N.V r6 = r9.f31008g
            if (r1 == 0) goto L29
            if (r1 == r3) goto L23
            if (r1 != r4) goto L1b
            int r0 = r9.f31002a
            Fe.e.U(r10)     // Catch: java.lang.Throwable -> L18 java.util.concurrent.CancellationException -> L8e
            goto L75
        L18:
            r10 = move-exception
            goto L80
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            int r0 = r9.f31002a
            Fe.e.U(r10)     // Catch: java.lang.Throwable -> L18 java.util.concurrent.CancellationException -> L8e
            goto L75
        L29:
            Fe.e.U(r10)
            java.lang.Object r10 = r6.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            int r1 = r9.f31005d
            float r1 = xg.g.d(r5, r1)
            A.e r7 = r9.f31006e
            if (r5 >= r10) goto L65
            int r10 = r10 - r5
            r8 = 0
            if (r10 >= 0) goto L45
            r10 = r8
        L45:
            int r10 = r10 * 1000
            if (r10 >= 0) goto L4a
            goto L4b
        L4a:
            r8 = r10
        L4b:
            java.lang.Float r10 = new java.lang.Float     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L8d
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L8d
            A.s r1 = A.C0225s.f182a     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L8d
            A.Z r1 = A.AbstractC0226t.j(r8, r1, r4)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L8d
            r9.f31002a = r5     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L8d
            r9.f31003b = r3     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L8d
            java.lang.Object r10 = A.C0212e.c(r7, r10, r1, r9)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L8d
            if (r10 != r0) goto L61
            goto L74
        L61:
            r0 = r5
            goto L75
        L63:
            r10 = move-exception
            goto L7f
        L65:
            java.lang.Float r10 = new java.lang.Float     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L8d
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L8d
            r9.f31002a = r5     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L8d
            r9.f31003b = r4     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L8d
            java.lang.Object r10 = r7.e(r10, r9)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L8d
            if (r10 != r0) goto L61
        L74:
            return r0
        L75:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r6.setValue(r10)
            if (r5 != 0) goto L9a
            goto L97
        L7f:
            r0 = r5
        L80:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.setValue(r0)
            if (r5 != 0) goto L8c
            r2.invoke()
        L8c:
            throw r10
        L8d:
            r0 = r5
        L8e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r6.setValue(r10)
            if (r5 != 0) goto L9a
        L97:
            r2.invoke()
        L9a:
            ef.C r10 = ef.C2515C.f34653a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
