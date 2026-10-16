package com.moloco.sdk.internal.publisher.nativead;

import ef.C2530n;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class j extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Object f29157a;

    /* renamed from: b, reason: collision with root package name */
    public Object f29158b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29159c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f29160d;

    /* renamed from: e, reason: collision with root package name */
    public int f29161e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29160d = oVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29159c = obj;
        this.f29161e |= Integer.MIN_VALUE;
        Object objD = o.d(this.f29160d, null, null, null, this);
        return objD == kf.a.f39711a ? objD : new C2530n(objD);
    }
}
