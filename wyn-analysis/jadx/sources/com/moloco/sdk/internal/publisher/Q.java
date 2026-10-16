package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdLoad;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class Q extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f28935a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28936b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdLoad.Listener f28937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(V v2, String str, AdLoad.Listener listener, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28935a = v2;
        this.f28936b = str;
        this.f28937c = listener;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new Q(this.f28935a, this.f28936b, this.f28937c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        Q q4 = (Q) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        q4.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        V v2 = this.f28935a;
        v2.f28969x.load(this.f28936b, this.f28937c);
        return C2515C.f34653a;
    }
}
