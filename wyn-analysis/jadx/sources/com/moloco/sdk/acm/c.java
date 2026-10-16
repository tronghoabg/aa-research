package com.moloco.sdk.acm;

import Ef.E;
import Ef.H;
import Ef.S;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class c extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f28339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f28340b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28340b = hVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new c(this.f28340b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f28339a;
        C2515C c2515c = C2515C.f34653a;
        if (i5 == 0) {
            Fe.e.U(obj);
            S3.i iVar = f.f28408b;
            if (iVar == null) {
                AbstractC3340k.m("eventProcessor");
                throw null;
            }
            this.f28339a = 1;
            h hVar = this.f28340b;
            Lf.e eVar = S.f3698a;
            Object objP = H.P(Lf.d.f7120b, new com.moloco.sdk.acm.eventprocessing.c(iVar, hVar, null), this);
            if (objP != aVar) {
                objP = c2515c;
            }
            if (objP == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return c2515c;
    }
}
