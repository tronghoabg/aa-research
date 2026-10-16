package com.moloco.sdk.internal.publisher.nativead;

import com.moloco.sdk.internal.ortb.model.C1890d;
import com.moloco.sdk.internal.publisher.s0;
import ef.C2530n;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class g extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Object f29141a;

    /* renamed from: b, reason: collision with root package name */
    public C1890d f29142b;

    /* renamed from: c, reason: collision with root package name */
    public s0 f29143c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f29145e;

    /* renamed from: f, reason: collision with root package name */
    public int f29146f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29145e = oVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29144d = obj;
        this.f29146f |= Integer.MIN_VALUE;
        Object objA = this.f29145e.a(null, null, null, 0L, this);
        return objA == kf.a.f39711a ? objA : new C2530n(objA);
    }
}
