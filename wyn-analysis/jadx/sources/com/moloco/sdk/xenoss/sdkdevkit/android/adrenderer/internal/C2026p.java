package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2026p extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30478a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30479b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2028q f30480c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F4.f f30481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.internal.publisher.i0 f30482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2026p(C2028q c2028q, F4.f fVar, com.moloco.sdk.internal.publisher.i0 i0Var, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30480c = c2028q;
        this.f30481d = fVar;
        this.f30482e = i0Var;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2026p c2026p = new C2026p(this.f30480c, this.f30481d, this.f30482e, interfaceC3103c);
        c2026p.f30479b = obj;
        return c2026p;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2026p) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009d A[LOOP:0: B:18:0x0097->B:20:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2 A[LOOP:1: B:27:0x00bc->B:29:0x00c2, LOOP_END] */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2026p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
