package com.waze.utils;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ah extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    long f44832a;

    /* renamed from: b, reason: collision with root package name */
    Object f44833b;

    /* renamed from: c, reason: collision with root package name */
    Object f44834c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f44835d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f44836e;

    /* renamed from: f, reason: collision with root package name */
    int f44837f;

    /* renamed from: g, reason: collision with root package name */
    ag f44838g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(aj ajVar, h.c.e eVar) {
        super(eVar);
        this.f44836e = ajVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws IOException {
        this.f44835d = obj;
        this.f44837f |= Integer.MIN_VALUE;
        Object objA = this.f44836e.a(null, null, this);
        return objA == h.c.a.a.f48038a ? objA : h.m.d(objA);
    }
}
