package com.waze.search;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aq extends ai {

    /* renamed from: a, reason: collision with root package name */
    private final Set f35518a;

    /* JADX WARN: Illegal instructions before constructor call */
    public aq(Set set) {
        h.g.b.x.f(set, "ids");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f35518a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq) && h.g.b.x.n(this.f35518a, ((aq) obj).f35518a);
    }

    public final int hashCode() {
        return this.f35518a.hashCode();
    }

    public final Set p() {
        return this.f35518a;
    }

    public final String toString() {
        return "EVPlug(ids=" + this.f35518a + ")";
    }
}
