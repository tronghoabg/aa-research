package com.moloco.sdk.internal.publisher;

import lf.AbstractC3464c;

/* renamed from: com.moloco.sdk.internal.publisher.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1933w extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public String f29349a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29350b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f29351c;

    /* renamed from: d, reason: collision with root package name */
    public int f29352d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1933w(B b5, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f29351c = b5;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f29350b = obj;
        this.f29352d |= Integer.MIN_VALUE;
        return B.b(this.f29351c, null, this);
    }
}
