package com.waze.w;

import com.waze.NativeManager;
import com.waze.ar;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final ar f45459a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f45460b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f45461c;

    public t(ar arVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(arVar, "categoryProvider");
        h.g.b.x.f(eVar, "logger");
        this.f45459a = arVar;
        this.f45460b = eVar;
        this.f45461c = h.g.a(new h.g.a.a() { // from class: com.waze.w.s
            @Override // h.g.a.a
            public final Object invoke() {
                return t.a(this.f45458a);
            }
        });
    }

    static final List a(t tVar) {
        Object objA;
        List listH;
        try {
            objA = tVar.f45459a.c();
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        boolean z = objA instanceof h.l;
        if (z) {
            tVar.f45460b.b("SearchCategoryDataSource failed to getData(), exception='" + h.m.c(objA) + "'");
        }
        if (true == z) {
            objA = null;
        }
        NativeManager.VenueCategory[] venueCategoryArr = (NativeManager.VenueCategory[]) objA;
        if (venueCategoryArr == null || (listH = h.a.c.X(venueCategoryArr)) == null) {
            listH = h.a.i.h();
        }
        if (listH.isEmpty()) {
            tVar.f45460b.b("SearchCategoryDataSource about to return empty list");
        }
        return listH;
    }

    public final List b() {
        return (List) this.f45461c.getValue();
    }
}
