package com.moloco.sdk.internal.publisher.nativead;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class e extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public o f29132a;

    /* renamed from: b, reason: collision with root package name */
    public String f29133b;

    /* renamed from: c, reason: collision with root package name */
    public com.moloco.sdk.acm.l f29134c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f29136e;

    /* renamed from: f, reason: collision with root package name */
    public int f29137f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29136e = oVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29135d = obj;
        this.f29137f |= Integer.MIN_VALUE;
        return o.b(this.f29136e, null, 0L, this);
    }
}
