package com.moloco.sdk.internal.publisher.nativead;

import com.moloco.sdk.internal.publisher.s0;
import ef.C2530n;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class i extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Object f29151a;

    /* renamed from: b, reason: collision with root package name */
    public com.moloco.sdk.acm.l f29152b;

    /* renamed from: c, reason: collision with root package name */
    public s0 f29153c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f29155e;

    /* renamed from: f, reason: collision with root package name */
    public int f29156f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29155e = oVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29154d = obj;
        this.f29156f |= Integer.MIN_VALUE;
        Object objC = o.c(this.f29155e, null, null, null, this);
        return objC == kf.a.f39711a ? objC : new C2530n(objC);
    }
}
