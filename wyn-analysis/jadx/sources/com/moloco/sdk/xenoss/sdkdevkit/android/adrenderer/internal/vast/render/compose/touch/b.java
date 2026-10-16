package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3470i;
import p0.s;
import tf.p;

/* loaded from: classes4.dex */
public final class b extends AbstractC3470i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f31936a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C.e f31938c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f31939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C.e eVar, p pVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31938c = eVar;
        this.f31939d = pVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        b bVar = new b(this.f31938c, this.f31939d, interfaceC3103c);
        bVar.f31937b = obj;
        return bVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((s) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r6.f31936a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r0 = r6.f31937b
            p0.k r0 = (p0.k) r0
            Fe.e.U(r7)
            goto L52
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            java.lang.Object r1 = r6.f31937b
            p0.s r1 = (p0.s) r1
            Fe.e.U(r7)
            goto L3a
        L24:
            Fe.e.U(r7)
            java.lang.Object r7 = r6.f31937b
            r1 = r7
            p0.s r1 = (p0.s) r1
            r6.f31937b = r1
            r6.f31936a = r3
            p0.g r7 = p0.g.f43137b
            r4 = 0
            java.lang.Object r7 = C.o.a(r1, r7, r4, r6)
            if (r7 != r0) goto L3a
            goto L4f
        L3a:
            p0.k r7 = (p0.k) r7
            boolean r4 = r7.f43144d
            boolean r5 = r7.f43147g
            if (r4 == r5) goto L45
            r7.a()
        L45:
            r6.f31937b = r7
            r6.f31936a = r2
            java.lang.Object r1 = vf.AbstractC4345a.d(r1, r6)
            if (r1 != r0) goto L50
        L4f:
            return r0
        L50:
            r0 = r7
            r7 = r1
        L52:
            p0.k r7 = (p0.k) r7
            C.e r1 = r6.f31938c
            r2 = 0
            Nf.d r4 = r1.f1716d
            if (r7 != 0) goto L61
            r1.f1715c = r3
            r4.a(r2)
            goto L79
        L61:
            r1.f1714b = r3
            r4.a(r2)
            long r0 = r0.f43143c
            d0.c r2 = new d0.c
            r2.<init>(r0)
            d0.c r0 = new d0.c
            long r3 = r7.f43143c
            r0.<init>(r3)
            tf.p r7 = r6.f31939d
            r7.invoke(r2, r0)
        L79:
            ef.C r7 = ef.C2515C.f34653a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
