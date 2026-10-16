package com.waze.car_lib.j;

import com.waze.navigate.db;
import com.waze.navigate.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f20166a;

    public a() {
        this.f20166a = h.g.a(new com.waze.car_lib.b.l(17));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.navigate.db, java.lang.Object] */
    public final boolean a() {
        return this.f20166a.e().d() == ei.f31311b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.f, java.lang.Object] */
    public final boolean b() {
        return ((Boolean) this.f20166a.getValue()).booleanValue();
    }

    public a(com.waze.bn.b bVar, db dbVar) {
        h.g.b.x.f(bVar, "roamingStateProvider");
        h.g.b.x.f(dbVar, "navigationController");
        this.f20166a = dbVar;
    }
}
