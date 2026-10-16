package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import Hf.j0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class r extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f30442b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f30443c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, u uVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30442b = tVar;
        this.f30443c = uVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new r(this.f30442b, this.f30443c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30441a;
        if (i5 == 0) {
            Fe.e.U(obj);
            j0 j0Var = this.f30442b.f30452f;
            this.f30441a = 1;
            if (j0Var.emit(this.f30443c, this) == aVar) {
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
