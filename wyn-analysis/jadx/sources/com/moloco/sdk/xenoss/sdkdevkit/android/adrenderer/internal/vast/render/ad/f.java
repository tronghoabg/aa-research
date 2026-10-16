package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import A7.AbstractC0279p0;
import E5.Q;
import Ef.E;
import Hf.C0615z;
import Hf.v0;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.G;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class f extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f31617b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q qVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31617b = qVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new f(this.f31617b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((f) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
        return kf.a.f39711a;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31616a;
        if (i5 == 0) {
            G gS = AbstractC0279p0.s(obj);
            q qVar = this.f31617b;
            v0 v0VarL = qVar.f31647g.l();
            C0615z c0615z = new C0615z(gS, qVar, 8);
            this.f31616a = 1;
            if (v0VarL.collect(c0615z, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        throw new Q((byte) 0, 8);
    }
}
