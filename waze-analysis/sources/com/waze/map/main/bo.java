package com.waze.map.main;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bo extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29401a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MapPopupDataFetcherNativeManager f29402b;

    /* renamed from: c, reason: collision with root package name */
    int f29403c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bo(MapPopupDataFetcherNativeManager mapPopupDataFetcherNativeManager, h.c.e eVar) {
        super(eVar);
        this.f29402b = mapPopupDataFetcherNativeManager;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29401a = obj;
        this.f29403c |= Integer.MIN_VALUE;
        return this.f29402b.fetchParkingSuggestionPopupInfo((com.waze.shared_infra.h.c) null, 0, (Integer) null, this);
    }
}
