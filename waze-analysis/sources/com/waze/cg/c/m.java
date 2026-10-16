package com.waze.cg.c;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    private final String f22331a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str) {
        super(null);
        x.f(str, "playerName");
        this.f22331a = str;
    }

    public final String a() {
        return this.f22331a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && x.n(this.f22331a, ((m) obj).f22331a);
    }

    public final int hashCode() {
        return this.f22331a.hashCode();
    }

    public final String toString() {
        return "Score(playerName=" + this.f22331a + ")";
    }
}
