package com.moloco.sdk.internal.ilrd.provider;

import Ef.E;
import Hf.j0;
import com.moloco.sdk.internal.ilrd.t;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f28613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f28614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f28615c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, t tVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28614b = dVar;
        this.f28615c = tVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new b(this.f28614b, this.f28615c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f28613a;
        if (i5 == 0) {
            Fe.e.U(obj);
            j0 j0Var = this.f28614b.f28623g;
            this.f28613a = 1;
            if (j0Var.emit(this.f28615c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return C2515C.f34653a;
    }
}
