package com.moloco.sdk.internal.services.bidtoken;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class v extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public G9.e f29551a;

    /* renamed from: b, reason: collision with root package name */
    public m f29552b;

    /* renamed from: c, reason: collision with root package name */
    public com.moloco.sdk.internal.bidtoken.a f29553c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ G9.e f29555e;

    /* renamed from: f, reason: collision with root package name */
    public int f29556f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(G9.e eVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29555e = eVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29554d = obj;
        this.f29556f |= Integer.MIN_VALUE;
        return this.f29555e.d(null, this);
    }
}
