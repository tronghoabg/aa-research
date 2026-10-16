package com.waze.app_nav.hub.a;

import androidx.autofill.HintConstants;
import com.waze.app_nav.hub.ag;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f15217a;

    /* renamed from: b, reason: collision with root package name */
    private final d f15218b;

    /* renamed from: c, reason: collision with root package name */
    private final b f15219c;

    /* renamed from: d, reason: collision with root package name */
    private final ag f15220d;

    public c(d dVar, b bVar) {
        x.f("block while navigating", HintConstants.AUTOFILL_HINT_NAME);
        x.f(dVar, "rule");
        x.f(bVar, "priority");
        this.f15217a = "block while navigating";
        this.f15218b = dVar;
        this.f15219c = bVar;
        int i2 = ag.f15247a;
        this.f15220d = com.waze.c.c.e.j();
    }

    public final b a() {
        return this.f15219c;
    }

    public final d b() {
        return this.f15218b;
    }

    public final String c() {
        return this.f15217a;
    }

    public final boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return x.n(cVar != null ? cVar.f15220d : null, this.f15220d);
    }

    public final int hashCode() {
        return this.f15220d.hashCode();
    }

    public final String toString() {
        return "Rule(ruleId=" + this.f15220d + ", name=" + this.f15217a + ", priority=" + this.f15219c + ")";
    }
}
