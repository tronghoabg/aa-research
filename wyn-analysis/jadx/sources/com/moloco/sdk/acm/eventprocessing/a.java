package com.moloco.sdk.acm.eventprocessing;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class a extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public DBRequestWorker f28375a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DBRequestWorker f28377c;

    /* renamed from: d, reason: collision with root package name */
    public int f28378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DBRequestWorker dBRequestWorker, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f28377c = dBRequestWorker;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f28376b = obj;
        this.f28378d |= Integer.MIN_VALUE;
        return this.f28377c.doWork(this);
    }
}
