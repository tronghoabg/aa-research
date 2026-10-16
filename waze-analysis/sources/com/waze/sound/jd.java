package com.waze.sound;

import androidx.media3.datasource.DefaultHttpDataSource;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class jd extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f40286a;

    /* renamed from: b, reason: collision with root package name */
    Object f40287b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f40288c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ jl f40289d;

    /* renamed from: e, reason: collision with root package name */
    int f40290e;

    /* renamed from: f, reason: collision with root package name */
    DefaultHttpDataSource.Factory f40291f;

    /* renamed from: g, reason: collision with root package name */
    com.google.android.gms.f.v f40292g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    jd(jl jlVar, h.c.e eVar) {
        super(eVar);
        this.f40289d = jlVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40288c = obj;
        this.f40290e |= Integer.MIN_VALUE;
        return this.f40289d.x(this);
    }
}
