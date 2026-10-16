package com.waze.search;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ap extends ai {

    /* renamed from: a, reason: collision with root package name */
    private final Set f35517a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ap(Set set) {
        h.g.b.x.f(set, "names");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f35517a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap) && h.g.b.x.n(this.f35517a, ((ap) obj).f35517a);
    }

    public final int hashCode() {
        return this.f35517a.hashCode();
    }

    public final Set p() {
        return this.f35517a;
    }

    public final String toString() {
        return "EVNetwork(names=" + this.f35517a + ")";
    }
}
