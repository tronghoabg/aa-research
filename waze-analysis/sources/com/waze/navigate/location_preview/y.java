package com.waze.navigate.location_preview;

import com.waze.ui.m.dl;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class y extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f31769a;

    /* renamed from: b, reason: collision with root package name */
    Object f31770b;

    /* renamed from: c, reason: collision with root package name */
    Object f31771c;

    /* renamed from: d, reason: collision with root package name */
    Object f31772d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f31773e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ai f31774f;

    /* renamed from: g, reason: collision with root package name */
    int f31775g;

    /* renamed from: h, reason: collision with root package name */
    ay f31776h;

    /* renamed from: i, reason: collision with root package name */
    dl f31777i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ai aiVar, h.c.e eVar) {
        super(eVar);
        this.f31774f = aiVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31773e = obj;
        this.f31775g |= Integer.MIN_VALUE;
        return this.f31774f.a(null, null, null, null, this);
    }
}
