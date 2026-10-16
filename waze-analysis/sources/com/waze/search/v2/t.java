package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class t extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f36626a;

    /* renamed from: b, reason: collision with root package name */
    int f36627b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f36628c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ SearchV2Activity f36629d;

    /* renamed from: e, reason: collision with root package name */
    int f36630e;

    /* renamed from: f, reason: collision with root package name */
    dj f36631f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(SearchV2Activity searchV2Activity, h.c.e eVar) {
        super(eVar);
        this.f36629d = searchV2Activity;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36628c = obj;
        this.f36630e |= Integer.MIN_VALUE;
        return SearchV2Activity.o(this.f36629d, null, this);
    }
}
