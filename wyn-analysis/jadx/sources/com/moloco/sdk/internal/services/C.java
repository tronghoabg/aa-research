package com.moloco.sdk.internal.services;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class C extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f29377b;

    /* renamed from: c, reason: collision with root package name */
    public int f29378c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(E e7, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29377b = e7;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29376a = obj;
        this.f29378c |= Integer.MIN_VALUE;
        return this.f29377b.a(0L, this);
    }
}
