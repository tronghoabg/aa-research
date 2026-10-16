package com.moloco.sdk.internal.services.bidtoken;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class n extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public o f29454a;

    /* renamed from: b, reason: collision with root package name */
    public com.moloco.sdk.acm.recorder.b f29455b;

    /* renamed from: c, reason: collision with root package name */
    public Nf.a f29456c;

    /* renamed from: d, reason: collision with root package name */
    public com.moloco.sdk.acm.l f29457d;

    /* renamed from: e, reason: collision with root package name */
    public String f29458e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f29459f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f29460g;

    /* renamed from: h, reason: collision with root package name */
    public int f29461h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29460g = oVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29459f = obj;
        this.f29461h |= Integer.MIN_VALUE;
        return this.f29460g.a(null, this);
    }
}
