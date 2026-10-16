package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import Ef.E;
import Jd.C0672f;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class k extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f32455a;

    /* renamed from: b, reason: collision with root package name */
    public int f32456b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f32457c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f32458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f32459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0672f f32460f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, String str, byte[] bArr, C0672f c0672f, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32457c = lVar;
        this.f32458d = str;
        this.f32459e = bArr;
        this.f32460f = c0672f;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new k(this.f32457c, this.f32458d, this.f32459e, this.f32460f, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        if (r0 == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0092 -> B:26:0x0093). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            r20 = this;
            r5 = r20
            kf.a r6 = kf.a.f39711a
            int r0 = r5.f32456b
            ef.C r7 = ef.C2515C.f34653a
            r8 = 0
            r9 = 2
            r10 = 1
            if (r0 == 0) goto L29
            if (r0 == r10) goto L20
            if (r0 != r9) goto L18
            int r0 = r5.f32455a
            Fe.e.U(r21)
            goto L93
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L20:
            int r0 = r5.f32455a
            Fe.e.U(r21)
            r11 = r0
            r0 = r21
            goto L7a
        L29:
            Fe.e.U(r21)
            r11 = r8
        L2d:
            r0 = 5
            if (r11 >= r0) goto L96
            r0 = 0
            android.content.Context r0 = ic.d.e(r0)
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l r1 = r5.f32457c
            r1.getClass()
            boolean r0 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l.b(r0)
            com.moloco.sdk.internal.MolocoLogger r12 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Network available: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = " for non persistent request"
            r2.append(r3)
            java.lang.String r14 = r2.toString()
            r15 = 0
            r16 = 0
            java.lang.String r13 = "NonPersistentRequest"
            r17 = 12
            r18 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r12, r13, r14, r15, r16, r17, r18)
            if (r0 == 0) goto L81
            r5.f32455a = r11
            r5.f32456b = r10
            java.lang.String r0 = r5.f32458d
            byte[] r2 = r5.f32459e
            Jd.f r3 = r5.f32460f
            r4 = 0
            wd.c r1 = r1.f32461a
            r19 = r1
            r1 = r0
            r0 = r19
            java.lang.Object r0 = Fe.c.f(r0, r1, r2, r3, r4, r5)
            if (r0 != r6) goto L7a
            goto L91
        L7a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L82
        L81:
            r0 = r8
        L82:
            if (r0 == 0) goto L85
            goto L96
        L85:
            r5.f32455a = r11
            r5.f32456b = r9
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r0 = Ef.H.m(r0, r5)
            if (r0 != r6) goto L92
        L91:
            return r6
        L92:
            r0 = r11
        L93:
            int r11 = r0 + 1
            goto L2d
        L96:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
