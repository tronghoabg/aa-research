package com.moloco.sdk.internal.services.events;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class b extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public String f29594a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f29596c;

    /* renamed from: d, reason: collision with root package name */
    public int f29597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29596c = cVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29595b = obj;
        this.f29597d |= Integer.MIN_VALUE;
        return this.f29596c.a(0L, null, null, this);
    }
}
