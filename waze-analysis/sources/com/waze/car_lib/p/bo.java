package com.waze.car_lib.p;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bo extends com.waze.car_lib.screens.bx {

    /* renamed from: a, reason: collision with root package name */
    private final String f20648a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f20649b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(String str, h.g.a.a aVar) {
        super(null);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(aVar, "onItemClicked");
        this.f20648a = str;
        this.f20649b = aVar;
    }

    public final String a() {
        return this.f20648a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo)) {
            return false;
        }
        bo boVar = (bo) obj;
        return h.g.b.x.n(this.f20648a, boVar.f20648a) && h.g.b.x.n(this.f20649b, boVar.f20649b);
    }

    public final int hashCode() {
        return (this.f20648a.hashCode() * 31) + this.f20649b.hashCode();
    }

    public final h.g.a.a l() {
        return this.f20649b;
    }

    public final String toString() {
        return "Favorite(name=" + this.f20648a + ", onItemClicked=" + this.f20649b + ")";
    }
}
