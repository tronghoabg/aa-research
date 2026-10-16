package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ah extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f31526a;

    /* renamed from: b, reason: collision with root package name */
    Object f31527b;

    /* renamed from: c, reason: collision with root package name */
    boolean f31528c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f31529d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ai f31530e;

    /* renamed from: f, reason: collision with root package name */
    int f31531f;

    /* renamed from: g, reason: collision with root package name */
    com.waze.modules.navigation.at f31532g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ai aiVar, h.c.e eVar) {
        super(eVar);
        this.f31530e = aiVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31529d = obj;
        this.f31531f |= Integer.MIN_VALUE;
        return this.f31530e.r(null, null, null, false, this);
    }
}
