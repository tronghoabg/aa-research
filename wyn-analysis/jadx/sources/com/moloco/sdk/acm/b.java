package com.moloco.sdk.acm;

import Ef.E;
import ef.C2515C;
import java.util.Iterator;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f28337a;

    /* renamed from: b, reason: collision with root package name */
    public int f28338b;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new b(2, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r10.f28338b
            ef.C r2 = ef.C2515C.f34653a
            r3 = 0
            java.lang.String r4 = "eventProcessor"
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L29
            if (r1 == r6) goto L21
            if (r1 != r5) goto L19
            java.util.Iterator r1 = r10.f28337a
            java.util.Iterator r1 = (java.util.Iterator) r1
            Fe.e.U(r11)
            goto L6c
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            java.util.Iterator r1 = r10.f28337a
            java.util.Iterator r1 = (java.util.Iterator) r1
            Fe.e.U(r11)
            goto L32
        L29:
            Fe.e.U(r11)
            java.util.concurrent.CopyOnWriteArrayList r11 = com.moloco.sdk.acm.f.f28415i
            java.util.Iterator r1 = r11.iterator()
        L32:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L66
            java.lang.Object r11 = r1.next()
            com.moloco.sdk.acm.l r11 = (com.moloco.sdk.acm.l) r11
            S3.i r7 = com.moloco.sdk.acm.f.f28408b
            if (r7 == 0) goto L62
            kotlin.jvm.internal.AbstractC3340k.b(r11)
            r8 = r1
            java.util.Iterator r8 = (java.util.Iterator) r8
            r10.f28337a = r8
            r10.f28338b = r6
            Lf.e r8 = Ef.S.f3698a
            Lf.d r8 = Lf.d.f7120b
            com.moloco.sdk.acm.eventprocessing.e r9 = new com.moloco.sdk.acm.eventprocessing.e
            r9.<init>(r11, r7, r3)
            java.lang.Object r11 = Ef.H.P(r8, r9, r10)
            kf.a r7 = kf.a.f39711a
            if (r11 != r7) goto L5e
            goto L5f
        L5e:
            r11 = r2
        L5f:
            if (r11 != r0) goto L32
            goto L9b
        L62:
            kotlin.jvm.internal.AbstractC3340k.m(r4)
            throw r3
        L66:
            java.util.concurrent.CopyOnWriteArrayList r11 = com.moloco.sdk.acm.f.f28416j
            java.util.Iterator r1 = r11.iterator()
        L6c:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto La0
            java.lang.Object r11 = r1.next()
            com.moloco.sdk.acm.h r11 = (com.moloco.sdk.acm.h) r11
            S3.i r6 = com.moloco.sdk.acm.f.f28408b
            if (r6 == 0) goto L9c
            kotlin.jvm.internal.AbstractC3340k.b(r11)
            r7 = r1
            java.util.Iterator r7 = (java.util.Iterator) r7
            r10.f28337a = r7
            r10.f28338b = r5
            Lf.e r7 = Ef.S.f3698a
            Lf.d r7 = Lf.d.f7120b
            com.moloco.sdk.acm.eventprocessing.c r8 = new com.moloco.sdk.acm.eventprocessing.c
            r8.<init>(r6, r11, r3)
            java.lang.Object r11 = Ef.H.P(r7, r8, r10)
            kf.a r6 = kf.a.f39711a
            if (r11 != r6) goto L98
            goto L99
        L98:
            r11 = r2
        L99:
            if (r11 != r0) goto L6c
        L9b:
            return r0
        L9c:
            kotlin.jvm.internal.AbstractC3340k.m(r4)
            throw r3
        La0:
            java.util.concurrent.CopyOnWriteArrayList r11 = com.moloco.sdk.acm.f.f28415i
            r11.clear()
            java.util.concurrent.CopyOnWriteArrayList r11 = com.moloco.sdk.acm.f.f28416j
            r11.clear()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
