package com.moloco.sdk.acm.http;

import ef.C2530n;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class e extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f28433b;

    /* renamed from: c, reason: collision with root package name */
    public int f28434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f28433b = gVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f28432a = obj;
        this.f28434c |= Integer.MIN_VALUE;
        Object objB = this.f28433b.b(null, null, this);
        return objB == kf.a.f39711a ? objB : new C2530n(objB);
    }
}
