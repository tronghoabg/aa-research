package com.moloco.sdk.internal.ilrd;

import androidx.lifecycle.AbstractC1451o;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.internal.ilrd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1882a extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1451o f28542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f28543b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882a(AbstractC1451o abstractC1451o, m mVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28542a = abstractC1451o;
        this.f28543b = mVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1882a(this.f28542a, this.f28543b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C1882a c1882a = (C1882a) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c1882a.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        this.f28542a.a(this.f28543b);
        return C2515C.f34653a;
    }
}
