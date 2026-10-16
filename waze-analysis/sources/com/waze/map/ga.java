package com.waze.map;

import com.waze.jni.protos.map.MapContent;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ga extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f29116a;

    /* renamed from: b, reason: collision with root package name */
    Object f29117b;

    /* renamed from: c, reason: collision with root package name */
    Object f29118c;

    /* renamed from: d, reason: collision with root package name */
    Object f29119d;

    /* renamed from: e, reason: collision with root package name */
    Object f29120e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f29121f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ gb f29122g;

    /* renamed from: h, reason: collision with root package name */
    int f29123h;

    /* renamed from: i, reason: collision with root package name */
    cr f29124i;

    /* renamed from: j, reason: collision with root package name */
    MapContent.Builder f29125j;

    /* renamed from: k, reason: collision with root package name */
    MapContent.Builder f29126k;

    /* renamed from: l, reason: collision with root package name */
    MapContent.Builder f29127l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ga(gb gbVar, h.c.e eVar) {
        super(eVar);
        this.f29122g = gbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29121f = obj;
        this.f29123h |= Integer.MIN_VALUE;
        return gb.g(this.f29122g, null, null, null, null, this);
    }
}
