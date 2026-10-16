package com.waze.sound;

import androidx.media3.datasource.cache.CacheDataSource;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ci extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f39661a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39662b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cj f39663c;

    /* renamed from: d, reason: collision with root package name */
    int f39664d;

    /* renamed from: e, reason: collision with root package name */
    cj f39665e;

    /* renamed from: f, reason: collision with root package name */
    CacheDataSource.Factory f39666f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ci(cj cjVar, h.c.e eVar) {
        super(eVar);
        this.f39663c = cjVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39662b = obj;
        this.f39664d |= Integer.MIN_VALUE;
        return cj.a(this.f39663c, this);
    }
}
