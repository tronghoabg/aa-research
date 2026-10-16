package com.waze.ads;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f14027a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TrustlessTokenNativeManager f14028b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f14029c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f14030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(TrustlessTokenNativeManager trustlessTokenNativeManager, int i2, h.c.e eVar) {
        super(2, eVar);
        this.f14028b = trustlessTokenNativeManager;
        this.f14029c = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        h hVar = new h(this.f14028b, this.f14029c, eVar);
        hVar.f14030d = obj;
        return hVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        h.c.a.a aVar = h.c.a.a.f48038a;
        try {
            if (this.f14027a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                com.waze.ads.a.h hVar = this.f14028b.trustlessTokenFetcher;
                this.f14027a = 1;
                obj = hVar.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            objA = (String) obj;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        if (true == (objA instanceof h.l)) {
            objA = null;
        }
        String str = (String) objA;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        l.onTokenReceived$default(this.f14028b, this.f14029c, str2, null, 4, null);
        return ab.f48028a;
    }
}
