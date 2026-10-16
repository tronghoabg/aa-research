package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import Af.q;
import Bf.s;
import Gf.t;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import p7.AbstractC3772b;
import tf.p;

/* loaded from: classes4.dex */
public final class b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f30321a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30322b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f30323c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30323c = cVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        b bVar = new b(this.f30323c, interfaceC3103c);
        bVar.f30322b = obj;
        return bVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((t) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f30321a;
        if (i5 == 0) {
            Fe.e.U(obj);
            t tVar = (t) this.f30322b;
            c cVar = this.f30323c;
            cVar.getClass();
            cVar.f30326c = new s(tVar, 9);
            cVar.f30327d = new a(tVar, 0);
            cVar.f30328e = new a(tVar, 1);
            q qVar = new q(cVar, 19);
            this.f30321a = 1;
            if (AbstractC3772b.f(tVar, qVar, this) == aVar) {
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
