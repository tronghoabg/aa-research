package com.waze.ui.ab;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private final String f41729a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super(null);
        x.f(str, "streetName");
        this.f41729a = str;
    }

    public final String a() {
        return this.f41729a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && x.n(this.f41729a, ((b) obj).f41729a);
    }

    public final int hashCode() {
        return this.f41729a.hashCode();
    }

    public final String toString() {
        return "Street(streetName=" + this.f41729a + ")";
    }
}
