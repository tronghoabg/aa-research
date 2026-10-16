package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class D extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f29909a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29910b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f29911c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g f29912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f29913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(H h10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar, long j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29911c = h10;
        this.f29912d = gVar;
        this.f29913e = j8;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        D d3 = new D(this.f29911c, this.f29912d, this.f29913e, interfaceC3103c);
        d3.f29910b = obj;
        return d3;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        if (r2 != r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Ef.m0] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v6, types: [Ef.K] */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
