package com.moloco.sdk.internal.publisher.nativead;

import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class h extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f29147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f29148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.internal.publisher.nativead.model.h f29149c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f29150d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, com.moloco.sdk.internal.publisher.nativead.model.h hVar, long j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29148b = oVar;
        this.f29149c = hVar;
        this.f29150d = j8;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new h(this.f29148b, this.f29149c, this.f29150d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29147a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        this.f29147a = 1;
        Object objB = o.b(this.f29148b, this.f29149c, this.f29150d, this);
        return objB == aVar ? aVar : objB;
    }
}
