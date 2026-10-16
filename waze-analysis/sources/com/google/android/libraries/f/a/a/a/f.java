package com.google.android.libraries.f.a.a.a;

import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f5928a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f5929b;

    /* renamed from: c, reason: collision with root package name */
    int f5930c;

    /* renamed from: d, reason: collision with root package name */
    aq f5931d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(k kVar, h.c.e eVar) {
        super(eVar);
        this.f5929b = kVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f5928a = obj;
        this.f5930c |= Integer.MIN_VALUE;
        return this.f5929b.a(this);
    }
}
