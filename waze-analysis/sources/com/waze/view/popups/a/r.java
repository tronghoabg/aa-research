package com.waze.view.popups.a;

import com.waze.map.gu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends u {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f45222a;

    /* renamed from: b, reason: collision with root package name */
    private final int f45223b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.waze.shared_infra.h.c cVar, int i2) {
        super(gu.f29189i);
        h.g.b.x.f(cVar, "coordinate");
        this.f45222a = cVar;
        this.f45223b = i2;
    }

    public final int b() {
        return this.f45223b;
    }

    public final com.waze.shared_infra.h.c c() {
        return this.f45222a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return h.g.b.x.n(this.f45222a, rVar.f45222a) && this.f45223b == rVar.f45223b;
    }

    public final int hashCode() {
        return (this.f45222a.hashCode() * 31) + this.f45223b;
    }

    public final String toString() {
        return "ParkingSuggestionPopup(coordinate=" + this.f45222a + ", parkingId=" + this.f45223b + ")";
    }
}
