package com.waze.car_lib.p;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class y extends com.waze.n.aq {

    /* renamed from: a, reason: collision with root package name */
    private final List f20838a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20839b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(List list, String str) {
        super(null, null);
        h.g.b.x.f(list, "radioButtons");
        h.g.b.x.f(str, "selectedItemId");
        this.f20838a = list;
        this.f20839b = str;
    }

    public final String a() {
        return this.f20839b;
    }

    public final List b() {
        return this.f20838a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return h.g.b.x.n(this.f20838a, yVar.f20838a) && h.g.b.x.n(this.f20839b, yVar.f20839b);
    }

    public final int hashCode() {
        return (this.f20838a.hashCode() * 31) + this.f20839b.hashCode();
    }

    public final String toString() {
        return "RadioButtons(radioButtons=" + this.f20838a + ", selectedItemId=" + this.f20839b + ")";
    }
}
