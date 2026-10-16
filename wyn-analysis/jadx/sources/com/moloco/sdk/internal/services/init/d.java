package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.internal.services.F;
import com.moloco.sdk.internal.services.w;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class d extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public f f29636a;

    /* renamed from: b, reason: collision with root package name */
    public Object f29637b;

    /* renamed from: c, reason: collision with root package name */
    public Object f29638c;

    /* renamed from: d, reason: collision with root package name */
    public com.moloco.sdk.acm.recorder.c f29639d;

    /* renamed from: e, reason: collision with root package name */
    public com.moloco.sdk.acm.l f29640e;

    /* renamed from: f, reason: collision with root package name */
    public F f29641f;

    /* renamed from: g, reason: collision with root package name */
    public w f29642g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f29643h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f29644i;

    /* renamed from: j, reason: collision with root package name */
    public int f29645j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29644i = fVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29643h = obj;
        this.f29645j |= Integer.MIN_VALUE;
        return this.f29644i.a(null, null, null, this);
    }
}
