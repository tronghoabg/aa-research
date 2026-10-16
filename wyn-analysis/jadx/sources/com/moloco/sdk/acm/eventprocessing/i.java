package com.moloco.sdk.acm.eventprocessing;

import C6.l;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class i extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public l f28402a;

    /* renamed from: b, reason: collision with root package name */
    public Nf.d f28403b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f28404c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f28405d;

    /* renamed from: e, reason: collision with root package name */
    public int f28406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f28405d = lVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f28404c = obj;
        this.f28406e |= Integer.MIN_VALUE;
        return this.f28405d.m(this);
    }
}
