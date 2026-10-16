package com.applovin.impl;

import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.C1667u0;
import com.applovin.impl.s2;

/* loaded from: classes.dex */
public final /* synthetic */ class M implements s2.a, C1667u0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppLovinCommunicatorSubscriber f20803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20804b;

    public /* synthetic */ M(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, Object obj) {
        this.f20803a = appLovinCommunicatorSubscriber;
        this.f20804b = obj;
    }

    @Override // com.applovin.impl.s2.a
    public void a(j2 j2Var, r2 r2Var) {
        ((e7) this.f20803a).a((com.applovin.impl.sdk.k) this.f20804b, j2Var, r2Var);
    }

    @Override // com.applovin.impl.C1667u0.c
    public void a(C1667u0.b bVar) {
        ((C1667u0) this.f20803a).a((C1667u0.c) this.f20804b, bVar);
    }
}
