package com.moloco.sdk.internal.services.bidtoken;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class e extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public a2.v f29430a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.v f29432c;

    /* renamed from: d, reason: collision with root package name */
    public int f29433d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a2.v vVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29432c = vVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29431b = obj;
        this.f29433d |= Integer.MIN_VALUE;
        return a2.v.i(this.f29432c, null, this);
    }
}
