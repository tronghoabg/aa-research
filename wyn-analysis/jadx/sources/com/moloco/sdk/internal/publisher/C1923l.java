package com.moloco.sdk.internal.publisher;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.internal.publisher.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1923l extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f29055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf.l f29056b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1923l(tf.l lVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29056b = lVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1923l(this.f29056b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1923l) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29055a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        this.f29055a = 1;
        Object objInvoke = this.f29056b.invoke(this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
