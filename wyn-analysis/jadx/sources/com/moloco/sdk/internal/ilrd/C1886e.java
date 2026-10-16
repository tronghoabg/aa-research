package com.moloco.sdk.internal.ilrd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.internal.ilrd.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1886e extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f28560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28561b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1886e(m mVar, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28560a = mVar;
        this.f28561b = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1886e(this.f28560a, this.f28561b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1886e) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        return new r(this.f28560a.f28588h, this.f28561b);
    }
}
