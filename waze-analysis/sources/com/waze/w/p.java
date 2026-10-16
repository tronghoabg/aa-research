package com.waze.w;

import com.waze.places.PlacesNativeManager;
import h.ab;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    private final PlacesNativeManager f45452a;

    /* renamed from: b, reason: collision with root package name */
    private final bm f45453b;

    /* renamed from: c, reason: collision with root package name */
    private final bq f45454c;

    public p(PlacesNativeManager placesNativeManager) {
        h.g.b.x.f(placesNativeManager, "placesNativeManager");
        this.f45452a = placesNativeManager;
        bm bmVarE = bu.e(1, 0, null, 6);
        this.f45453b = bmVarE;
        this.f45454c = ai.S(bmVarE);
    }

    protected abstract Object a(h.c.e eVar);

    protected final PlacesNativeManager b() {
        return this.f45452a;
    }

    public final Object c(h.c.e eVar) {
        Object objD = ai.d(ai.K(ai.L(this.f45452a.getPlacesUpdatedEventFlow(), new o(this, null, 1, null)), new o(this, null, 0)), eVar);
        return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
    }

    public final bq e() {
        return this.f45454c;
    }
}
