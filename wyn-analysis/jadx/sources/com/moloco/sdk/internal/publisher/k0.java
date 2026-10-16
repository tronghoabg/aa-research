package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdShowListener;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class k0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdShowListener f29053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f29054b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(AdShowListener adShowListener, l0 l0Var, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29053a = adShowListener;
        this.f29054b = l0Var;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new k0(this.f29053a, this.f29054b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) throws Exception {
        k0 k0Var = (k0) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        k0Var.invokeSuspend(c2515c);
        return c2515c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
