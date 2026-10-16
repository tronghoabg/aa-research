package com.moloco.sdk.internal.services.usertracker;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class b extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Object f29724a;

    /* renamed from: b, reason: collision with root package name */
    public Object f29725b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29726c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f29727d;

    /* renamed from: e, reason: collision with root package name */
    public int f29728e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29727d = cVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29726c = obj;
        this.f29728e |= Integer.MIN_VALUE;
        return this.f29727d.a(this);
    }
}
