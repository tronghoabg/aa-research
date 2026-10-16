package com.moloco.sdk.internal.services;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.internal.services.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1942e extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1944g f29582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29583b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1942e(C1944g c1944g, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29582a = c1944g;
        this.f29583b = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1942e(this.f29582a, this.f29583b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C1942e c1942e = (C1942e) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c1942e.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        this.f29582a.f29616a.edit().remove(this.f29583b).apply();
        return C2515C.f34653a;
    }
}
