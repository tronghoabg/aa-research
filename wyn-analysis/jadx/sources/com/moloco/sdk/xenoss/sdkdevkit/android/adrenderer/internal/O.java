package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.view.View;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class O extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30001a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30002b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S f30003c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f30004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Gf.t f30005e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Gf.t tVar, View view, S s10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30003c = s10;
        this.f30004d = view;
        this.f30005e = tVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        O o7 = new O(this.f30005e, this.f30004d, this.f30003c, interfaceC3103c);
        o7.f30002b = obj;
        return o7;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((Boolean) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (Hf.k0.k(r6, r1, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (((Gf.s) r4).f4839d.i(r1, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        return r0;
     */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r5.f30001a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            Fe.e.U(r6)
            goto L4e
        L19:
            Fe.e.U(r6)
            java.lang.Object r6 = r5.f30002b
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r6 = kotlin.jvm.internal.AbstractC3340k.a(r6, r1)
            Gf.t r4 = r5.f30005e
            if (r6 != 0) goto L41
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S r6 = r5.f30003c
            android.view.View r1 = r5.f30004d
            Hf.l r6 = r6.b(r1)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.N r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.N
            r2 = 0
            r1.<init>(r4, r2)
            r5.f30001a = r3
            java.lang.Object r6 = Hf.k0.k(r6, r1, r5)
            if (r6 != r0) goto L4e
            goto L4d
        L41:
            r5.f30001a = r2
            Gf.s r4 = (Gf.s) r4
            Gf.e r6 = r4.f4839d
            java.lang.Object r6 = r6.i(r1, r5)
            if (r6 != r0) goto L4e
        L4d:
            return r0
        L4e:
            ef.C r6 = ef.C2515C.f34653a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
