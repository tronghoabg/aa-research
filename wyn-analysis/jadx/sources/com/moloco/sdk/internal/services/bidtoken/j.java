package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.publisher.MolocoBidTokenListener;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class j extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public k f29441a;

    /* renamed from: b, reason: collision with root package name */
    public com.moloco.sdk.acm.recorder.c f29442b;

    /* renamed from: c, reason: collision with root package name */
    public MolocoBidTokenListener f29443c;

    /* renamed from: d, reason: collision with root package name */
    public long f29444d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f29446f;

    /* renamed from: g, reason: collision with root package name */
    public int f29447g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29446f = kVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29445e = obj;
        this.f29447g |= Integer.MIN_VALUE;
        return this.f29446f.a(null, null, null, this);
    }
}
