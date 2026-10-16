package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import Hf.InterfaceC0602l;
import a.AbstractC1304a;
import android.view.View;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class Q extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30020a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30021b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f30022c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S f30023d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(View view, S s10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30022c = view;
        this.f30023d = s10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        Q q4 = new Q(this.f30022c, this.f30023d, interfaceC3103c);
        q4.f30021b = obj;
        return q4;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((Gf.t) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30020a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Gf.t tVar = (Gf.t) this.f30021b;
            View view = this.f30022c;
            InterfaceC0602l interfaceC0602lJ = AbstractC1304a.j(Hf.k0.h(new U(view, null)));
            P p10 = new P(tVar, view, this.f30023d, null);
            this.f30020a = 1;
            if (Hf.k0.k(interfaceC0602lJ, p10, this) == aVar) {
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
