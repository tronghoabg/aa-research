package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class D0 extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Y2.B f29914a;

    /* renamed from: b, reason: collision with root package name */
    public z0 f29915b;

    /* renamed from: c, reason: collision with root package name */
    public String f29916c;

    /* renamed from: d, reason: collision with root package name */
    public String f29917d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y2.B f29919f;

    /* renamed from: g, reason: collision with root package name */
    public int f29920g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(Y2.B b5, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29919f = b5;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29918e = obj;
        this.f29920g |= Integer.MIN_VALUE;
        return this.f29919f.a(null, null, this);
    }
}
