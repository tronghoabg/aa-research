package com.waze.nightmode;

import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class o extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f32484a;

    o(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new o(eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((o) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = h.c.a.a.f48038a;
        if (this.f32484a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            t tVar = t.f32494a;
            WazeDaylightTimeProvider wazeDaylightTimeProviderK = t.k();
            this.f32484a = 1;
            Object objD = aj.d(new p(wazeDaylightTimeProviderK, (h.c.e) null, 1), this);
            if (objD != obj2) {
                objD = h.ab.f48028a;
            }
            if (objD == obj2) {
                return obj2;
            }
        }
        return h.ab.f48028a;
    }
}
