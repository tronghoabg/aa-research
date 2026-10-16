package com.waze.map;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dx extends dz {

    /* renamed from: a, reason: collision with root package name */
    private final gf f28783a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(gf gfVar) {
        super(null);
        h.g.b.x.f(gfVar, "view");
        this.f28783a = gfVar;
    }

    @Override // com.waze.map.dz
    public final /* synthetic */ View a() {
        return this.f28783a;
    }

    public final gf b() {
        return this.f28783a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dx) && h.g.b.x.n(this.f28783a, ((dx) obj).f28783a);
    }

    public final int hashCode() {
        return this.f28783a.hashCode();
    }

    public final String toString() {
        return "New(view=" + this.f28783a + ")";
    }
}
