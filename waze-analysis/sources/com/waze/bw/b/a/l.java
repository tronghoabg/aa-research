package com.waze.bw.b.a;

import i.b.l.mq;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f17700a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f17701b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f17702c;

    /* renamed from: d, reason: collision with root package name */
    int f17703d;

    /* renamed from: e, reason: collision with root package name */
    mq f17704e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(m mVar, h.c.e eVar) {
        super(eVar);
        this.f17702c = mVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17701b = obj;
        this.f17703d |= Integer.MIN_VALUE;
        return this.f17702c.a(null, this);
    }
}
