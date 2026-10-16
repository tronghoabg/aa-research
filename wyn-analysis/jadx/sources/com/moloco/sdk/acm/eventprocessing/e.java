package com.moloco.sdk.acm.eventprocessing;

import Ef.E;
import com.moloco.sdk.acm.l;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class e extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f28389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f28390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S3.i f28391c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, S3.i iVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28390b = lVar;
        this.f28391c = iVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new e(this.f28390b, this.f28391c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (S3.i.a(r11.f28391c, r12.f28452d, r6, r7, r9, r11) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        if (S3.i.a(r11.f28391c, r1, r3, r8, r6, r11) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        return r0;
     */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r11.f28389a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L15:
            Fe.e.U(r12)
            goto La0
        L1a:
            Fe.e.U(r12)
            com.moloco.sdk.acm.l r12 = r11.f28390b
            long r7 = r12.f28450b
            r4 = 0
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            java.util.ArrayList r4 = r12.f28451c
            r5 = 10
            if (r1 <= 0) goto L5d
            com.moloco.sdk.acm.db.b r6 = com.moloco.sdk.acm.db.b.f28352a
            java.util.ArrayList r9 = new java.util.ArrayList
            int r1 = ff.p.a0(r4, r5)
            r9.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        L3a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r1.next()
            com.moloco.sdk.acm.i r2 = (com.moloco.sdk.acm.i) r2
            java.lang.String r2 = android.support.v4.media.session.b.H(r2)
            r9.add(r2)
            goto L3a
        L4e:
            r11.f28389a = r3
            S3.i r4 = r11.f28391c
            java.lang.String r5 = r12.f28452d
            r10 = r11
            java.lang.Object r12 = S3.i.a(r4, r5, r6, r7, r9, r10)
            r7 = r10
            if (r12 != r0) goto La0
            goto L9f
        L5d:
            r7 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "negative_time_"
            r1.<init>(r3)
            java.lang.String r3 = r12.f28452d
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.moloco.sdk.acm.db.b r3 = com.moloco.sdk.acm.db.b.f28352a
            long r8 = r12.f28450b
            java.util.ArrayList r6 = new java.util.ArrayList
            int r12 = ff.p.a0(r4, r5)
            r6.<init>(r12)
            java.util.Iterator r12 = r4.iterator()
        L7f:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L93
            java.lang.Object r4 = r12.next()
            com.moloco.sdk.acm.i r4 = (com.moloco.sdk.acm.i) r4
            java.lang.String r4 = android.support.v4.media.session.b.H(r4)
            r6.add(r4)
            goto L7f
        L93:
            r7.f28389a = r2
            r2 = r1
            S3.i r1 = r7.f28391c
            r4 = r8
            java.lang.Object r12 = S3.i.a(r1, r2, r3, r4, r6, r7)
            if (r12 != r0) goto La0
        L9f:
            return r0
        La0:
            ef.C r12 = ef.C2515C.f34653a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
