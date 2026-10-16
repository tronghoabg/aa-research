package com.moloco.sdk.internal.services.init;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class r extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public com.moloco.sdk.acm.recorder.c f29692a;

    /* renamed from: b, reason: collision with root package name */
    public com.moloco.sdk.acm.l f29693b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29694c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f29695d;

    /* renamed from: e, reason: collision with root package name */
    public int f29696e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29695d = sVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29694c = obj;
        this.f29696e |= Integer.MIN_VALUE;
        return this.f29695d.c(null, null, this);
    }
}
