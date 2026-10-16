package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.K0;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class o0 extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Object f29276a;

    /* renamed from: b, reason: collision with root package name */
    public Object f29277b;

    /* renamed from: c, reason: collision with root package name */
    public Object f29278c;

    /* renamed from: d, reason: collision with root package name */
    public Object f29279d;

    /* renamed from: e, reason: collision with root package name */
    public K0 f29280e;

    /* renamed from: f, reason: collision with root package name */
    public long f29281f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f29282g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r0 f29283h;

    /* renamed from: i, reason: collision with root package name */
    public int f29284i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r0 r0Var, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29283h = r0Var;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29282g = obj;
        this.f29284i |= Integer.MIN_VALUE;
        return r0.a(this.f29283h, null, 0L, null, null, null, this);
    }
}
