package com.moloco.sdk.internal.publisher;

import lf.AbstractC3464c;

/* renamed from: com.moloco.sdk.internal.publisher.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1922k extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public c0 f29047a;

    /* renamed from: b, reason: collision with root package name */
    public com.moloco.sdk.acm.recorder.c f29048b;

    /* renamed from: c, reason: collision with root package name */
    public com.moloco.sdk.acm.l f29049c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1929s f29051e;

    /* renamed from: f, reason: collision with root package name */
    public int f29052f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1922k(C1929s c1929s, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29051e = c1929s;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29050d = obj;
        this.f29052f |= Integer.MIN_VALUE;
        return C1929s.b(this.f29051e, null, null, null, this);
    }
}
