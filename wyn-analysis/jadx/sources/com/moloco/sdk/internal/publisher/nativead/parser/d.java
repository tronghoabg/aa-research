package com.moloco.sdk.internal.publisher.nativead.parser;

import Ef.E;
import ef.C2515C;
import ef.C2527k;
import ef.InterfaceC2525i;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class d extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public com.moloco.sdk.internal.publisher.nativead.model.e f29224a;

    /* renamed from: b, reason: collision with root package name */
    public int f29225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.internal.publisher.nativead.model.e f29226c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2525i f29227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f29228e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.moloco.sdk.internal.publisher.nativead.model.e eVar, InterfaceC2525i interfaceC2525i, long j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29226c = eVar;
        this.f29227d = interfaceC2525i;
        this.f29228e = j8;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new d(this.f29226c, this.f29227d, this.f29228e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        com.moloco.sdk.internal.publisher.nativead.model.e eVar;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29225b;
        if (i5 == 0) {
            Fe.e.U(obj);
            com.moloco.sdk.internal.publisher.nativead.model.e eVar2 = this.f29226c;
            this.f29224a = eVar2;
            this.f29225b = 1;
            Object objD = A6.c.d(eVar2, this.f29227d, this.f29228e, this);
            if (objD == aVar) {
                return aVar;
            }
            eVar = eVar2;
            obj = objD;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = this.f29224a;
            Fe.e.U(obj);
        }
        return new C2527k(eVar, obj);
    }
}
