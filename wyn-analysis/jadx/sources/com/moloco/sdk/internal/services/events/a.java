package com.moloco.sdk.internal.services.events;

import com.moloco.sdk.k1;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class a extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public c f29585a;

    /* renamed from: b, reason: collision with root package name */
    public Ba.c f29586b;

    /* renamed from: c, reason: collision with root package name */
    public k1 f29587c;

    /* renamed from: d, reason: collision with root package name */
    public k1 f29588d;

    /* renamed from: e, reason: collision with root package name */
    public k1 f29589e;

    /* renamed from: f, reason: collision with root package name */
    public long f29590f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f29591g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f29592h;

    /* renamed from: i, reason: collision with root package name */
    public int f29593i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29592h = cVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29591g = obj;
        this.f29593i |= Integer.MIN_VALUE;
        return this.f29592h.b(0L, null, this);
    }
}
