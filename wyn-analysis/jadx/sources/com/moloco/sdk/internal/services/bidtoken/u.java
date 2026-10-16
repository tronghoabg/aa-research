package com.moloco.sdk.internal.services.bidtoken;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class u extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public G9.e f29547a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G9.e f29549c;

    /* renamed from: d, reason: collision with root package name */
    public int f29550d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(G9.e eVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29549c = eVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29548b = obj;
        this.f29550d |= Integer.MIN_VALUE;
        return this.f29549c.c(this);
    }
}
