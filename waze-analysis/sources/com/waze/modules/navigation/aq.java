package com.waze.modules.navigation;

import com.waze.modules.c.dk;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aq implements ar {

    /* renamed from: a, reason: collision with root package name */
    private final dk f30316a;

    public aq(dk dkVar) {
        h.g.b.x.f(dkVar, "response");
        this.f30316a = dkVar;
    }

    public final dk a() {
        return this.f30316a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq) && h.g.b.x.n(this.f30316a, ((aq) obj).f30316a);
    }

    public final int hashCode() {
        return this.f30316a.hashCode();
    }

    public final String toString() {
        return "PreCalculated(response=" + this.f30316a + ")";
    }
}
