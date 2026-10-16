package com.waze.af;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    public final String f14048a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super(null);
        x.f(str, "address");
        this.f14048a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && x.n(this.f14048a, ((b) obj).f14048a);
    }

    public final int hashCode() {
        return this.f14048a.hashCode();
    }

    public final String toString() {
        return "FullyFormatted(address=" + this.f14048a + ")";
    }
}
