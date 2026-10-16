package com.waze.sound.a;

import com.waze.copilot.data.ag;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39378a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f39379b;

    /* renamed from: c, reason: collision with root package name */
    int f39380c;

    /* renamed from: d, reason: collision with root package name */
    ag f39381d;

    /* renamed from: e, reason: collision with root package name */
    ag f39382e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, h.c.e eVar) {
        super(eVar);
        this.f39379b = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39378a = obj;
        this.f39380c |= Integer.MIN_VALUE;
        return this.f39379b.d(null, this);
    }
}
