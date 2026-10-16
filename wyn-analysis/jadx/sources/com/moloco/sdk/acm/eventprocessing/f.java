package com.moloco.sdk.acm.eventprocessing;

import ef.C2530n;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class f extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public G9.e f28392a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G9.e f28394c;

    /* renamed from: d, reason: collision with root package name */
    public int f28395d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(G9.e eVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f28394c = eVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f28393b = obj;
        this.f28395d |= Integer.MIN_VALUE;
        Object objJ = this.f28394c.j(this);
        return objJ == kf.a.f39711a ? objJ : new C2530n(objJ);
    }
}
