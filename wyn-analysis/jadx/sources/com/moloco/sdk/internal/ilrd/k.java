package com.moloco.sdk.internal.ilrd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class k extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f28576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f28577b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28577b = mVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new k(this.f28577b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r7.f28576a
            ef.C r2 = ef.C2515C.f34653a
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r4) goto L12
            Fe.e.U(r8)
            return r2
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            Fe.e.U(r8)
            return r2
        L1e:
            Fe.e.U(r8)
            com.moloco.sdk.internal.ilrd.m r8 = r7.f28577b
            java.util.ArrayList r1 = r8.f28597r
            boolean r5 = r1.isEmpty()
            com.moloco.sdk.internal.services.g r8 = r8.f28591l
            java.lang.String r6 = "ilrd_events_store"
            if (r5 == 0) goto L38
            r7.f28576a = r3
            java.lang.Object r8 = r8.b(r6, r7)
            if (r8 != r0) goto L56
            goto L55
        L38:
            com.moloco.sdk.g0 r3 = com.moloco.sdk.C1876h0.h()
            r3.a(r1)
            com.google.protobuf.GeneratedMessageLite r1 = r3.build()
            com.moloco.sdk.h0 r1 = (com.moloco.sdk.C1876h0) r1
            byte[] r1 = r1.toByteArray()
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r4)
            r7.f28576a = r4
            java.lang.Object r8 = r8.a(r6, r1, r7)
            if (r8 != r0) goto L56
        L55:
            return r0
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.ilrd.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
