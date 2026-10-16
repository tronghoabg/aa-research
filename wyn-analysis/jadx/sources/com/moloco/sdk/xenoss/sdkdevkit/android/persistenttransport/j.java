package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class j extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f32451a;

    /* renamed from: b, reason: collision with root package name */
    public int f32452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f32453c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f32454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32453c = lVar;
        this.f32454d = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new j(this.f32453c, this.f32454d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (r15 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (Ef.H.m(10000, r14) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:25:0x0080). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r14.f32452b
            ef.C r2 = ef.C2515C.f34653a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            int r1 = r14.f32451a
            Fe.e.U(r15)
            goto L80
        L15:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1d:
            int r1 = r14.f32451a
            Fe.e.U(r15)
            goto L68
        L23:
            Fe.e.U(r15)
            r1 = r3
        L27:
            r15 = 5
            if (r1 >= r15) goto L82
            r15 = 0
            android.content.Context r15 = ic.d.e(r15)
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l r6 = r14.f32453c
            r6.getClass()
            boolean r15 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l.b(r15)
            com.moloco.sdk.internal.MolocoLogger r7 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Network available: "
            r8.<init>(r9)
            r8.append(r15)
            java.lang.String r9 = " for non persistent request"
            r8.append(r9)
            java.lang.String r9 = r8.toString()
            r10 = 0
            r11 = 0
            java.lang.String r8 = "NonPersistentRequest"
            r12 = 12
            r13 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r7, r8, r9, r10, r11, r12, r13)
            if (r15 == 0) goto L6f
            r14.f32451a = r1
            r14.f32452b = r5
            java.lang.String r15 = r14.f32454d
            wd.c r6 = r6.f32461a
            java.lang.Object r15 = Fe.c.e(r6, r15, r14)
            if (r15 != r0) goto L68
            goto L7f
        L68:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            goto L70
        L6f:
            r15 = r3
        L70:
            if (r15 == 0) goto L73
            goto L82
        L73:
            r14.f32451a = r1
            r14.f32452b = r4
            r6 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r15 = Ef.H.m(r6, r14)
            if (r15 != r0) goto L80
        L7f:
            return r0
        L80:
            int r1 = r1 + r5
            goto L27
        L82:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
