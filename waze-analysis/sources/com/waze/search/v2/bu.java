package com.waze.search.v2;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bu {

    /* renamed from: a, reason: collision with root package name */
    private final Map f36202a = new LinkedHashMap();

    public final c a(String str, String str2) {
        c cVar = (c) this.f36202a.get(new i(str, str2));
        return cVar != null ? c.n(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, 8191) : new c(null);
    }

    public final void b(String str, String str2, c cVar) {
        h.g.b.x.f(cVar, "filterState");
        this.f36202a.put(new i(str, str2), c.n(cVar, null, null, null, null, null, null, null, null, null, null, null, null, null, 8143));
    }
}
