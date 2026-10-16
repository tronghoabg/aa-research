package com.waze.ui.v;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends l {

    /* renamed from: a, reason: collision with root package name */
    private final String f43507a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str) {
        super(null);
        x.f(str, "bottomTextLink");
        this.f43507a = str;
    }

    public final String a() {
        return this.f43507a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && x.n(this.f43507a, ((h) obj).f43507a);
    }

    public final int hashCode() {
        return this.f43507a.hashCode();
    }

    public final String toString() {
        return "Initial(bottomTextLink=" + this.f43507a + ")";
    }
}
