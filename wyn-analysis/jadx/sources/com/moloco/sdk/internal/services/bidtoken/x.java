package com.moloco.sdk.internal.services.bidtoken;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class x extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public A f29560a;

    /* renamed from: b, reason: collision with root package name */
    public Object f29561b;

    /* renamed from: c, reason: collision with root package name */
    public m f29562c;

    /* renamed from: d, reason: collision with root package name */
    public com.moloco.sdk.acm.l f29563d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29564e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29565f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f29566g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A f29567h;

    /* renamed from: i, reason: collision with root package name */
    public int f29568i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(A a5, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29567h = a5;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29566g = obj;
        this.f29568i |= Integer.MIN_VALUE;
        return this.f29567h.a(null, null, false, false, this);
    }
}
