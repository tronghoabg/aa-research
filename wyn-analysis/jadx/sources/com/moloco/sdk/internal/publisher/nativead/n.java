package com.moloco.sdk.internal.publisher.nativead;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class n extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f29203b;

    /* renamed from: c, reason: collision with root package name */
    public int f29204c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29203b = oVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29202a = obj;
        this.f29204c |= Integer.MIN_VALUE;
        return this.f29203b.f(null, 0L, this);
    }
}
