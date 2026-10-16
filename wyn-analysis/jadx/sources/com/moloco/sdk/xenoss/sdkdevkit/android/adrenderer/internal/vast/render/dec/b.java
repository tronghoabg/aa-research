package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

import Ef.E;
import Fe.e;
import Hf.j0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f31966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f31967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f31968c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, a aVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31967b = cVar;
        this.f31968c = aVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new b(this.f31967b, this.f31968c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31966a;
        if (i5 == 0) {
            e.U(obj);
            j0 j0Var = this.f31967b.f31974f;
            this.f31966a = 1;
            if (j0Var.emit(this.f31968c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
        }
        return C2515C.f34653a;
    }
}
