package com.moloco.sdk.internal.services.bidtoken;

import Ef.H;
import Ef.H0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class w extends AbstractC3471j implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public int f29557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f29558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.acm.recorder.c f29559c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(A a5, com.moloco.sdk.acm.recorder.c cVar, InterfaceC3103c interfaceC3103c) {
        super(1, interfaceC3103c);
        this.f29558b = a5;
        this.f29559c = cVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(InterfaceC3103c interfaceC3103c) {
        return new w(this.f29558b, this.f29559c, interfaceC3103c);
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        return ((w) create((InterfaceC3103c) obj)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29557a;
        A a5 = this.f29558b;
        G9.e eVar = a5.f29410c;
        if (i5 == 0) {
            Fe.e.U(obj);
            A.d("[Thread: " + Thread.currentThread().getName() + "] Acquired lock, fetching status of current token");
            this.f29557a = 1;
            obj = eVar.c(this);
            if (obj != aVar) {
            }
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        b bVar = (b) obj;
        A.c(a5, "[Thread: " + Thread.currentThread().getName() + "] bidToken status: " + bVar);
        bVar.getClass();
        b bVar2 = b.f29416b;
        com.moloco.sdk.acm.recorder.c cVar = this.f29559c;
        if (bVar != bVar2 && bVar != b.f29417c) {
            A.d("[Thread: " + Thread.currentThread().getName() + "] bidToken needs refresh, fetching new token");
            m mVar = f.f29435b;
            this.f29557a = 2;
            Object objA = a5.a(cVar, mVar, false, false, this);
            return objA == aVar ? aVar : objA;
        }
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("sbt_cached");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        hVar.a("result", "true");
        hVar.a("initial_fetch", "false");
        hVar.a("expiring", bVar != bVar2 ? "false" : "true");
        cVar.a(hVar);
        m mVar2 = (m) eVar.f4687d;
        if (bVar != bVar2) {
            A.c(a5, "[Thread: " + Thread.currentThread().getName() + "] bidToken doesn't need refresh, returning cached");
            return mVar2;
        }
        A.c(a5, "[Thread: " + Thread.currentThread().getName() + "] bidToken is expiring, returning cached, and refreshing async");
        A.d("[Thread: " + Thread.currentThread().getName() + "] Refreshing token async");
        com.moloco.sdk.acm.h hVar2 = new com.moloco.sdk.acm.h("sbt_async_fetch");
        H0 h02 = a5.f29413f;
        hVar2.a("async", String.valueOf(h02 != null ? h02.isActive() : false));
        cVar.a(hVar2);
        H0 h03 = a5.f29413f;
        if (h03 != null && h03.isActive()) {
            A.d("[Thread: " + Thread.currentThread().getName() + "] Async refresh already in progress. Returning");
            return mVar2;
        }
        A.d("[Thread: " + Thread.currentThread().getName() + "] Scheduling to fetch token from server");
        a5.f29413f = H.D(a5.f29409b, null, new z(a5, cVar, null), 3);
        return mVar2;
    }
}
