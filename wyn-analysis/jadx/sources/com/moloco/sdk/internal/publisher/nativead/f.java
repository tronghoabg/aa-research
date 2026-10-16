package com.moloco.sdk.internal.publisher.nativead;

import Ef.E;
import com.moloco.sdk.internal.ortb.model.C1890d;
import com.moloco.sdk.internal.publisher.C;
import com.moloco.sdk.internal.publisher.s0;
import com.moloco.sdk.internal.r;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class f extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f29138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f29139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1890d f29140c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(s0 s0Var, r rVar, C1890d c1890d, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29138a = s0Var;
        this.f29139b = rVar;
        this.f29140c = c1890d;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new f(this.f29138a, this.f29139b, this.f29140c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        f fVar = (f) create((E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        fVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        ((C) this.f29138a).a(this.f29139b, this.f29140c);
        return C2515C.f34653a;
    }
}
