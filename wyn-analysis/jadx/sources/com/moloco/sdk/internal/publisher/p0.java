package com.moloco.sdk.internal.publisher;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class p0 extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Object f29295a;

    /* renamed from: b, reason: collision with root package name */
    public com.moloco.sdk.acm.recorder.c f29296b;

    /* renamed from: c, reason: collision with root package name */
    public com.moloco.sdk.internal.services.init.l f29297c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0 f29299e;

    /* renamed from: f, reason: collision with root package name */
    public int f29300f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(r0 r0Var, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29299e = r0Var;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29298d = obj;
        this.f29300f |= Integer.MIN_VALUE;
        return this.f29299e.b(null, null, null, null, this);
    }
}
