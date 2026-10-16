package com.moloco.sdk.internal.publisher.nativead;

import ef.C2530n;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class k extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f29163b;

    /* renamed from: c, reason: collision with root package name */
    public int f29164c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29163b = oVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29162a = obj;
        this.f29164c |= Integer.MIN_VALUE;
        Object objG = this.f29163b.g(null, null, null, this);
        return objG == kf.a.f39711a ? objG : new C2530n(objG);
    }
}
