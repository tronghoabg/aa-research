package com.waze.nav_connect.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o extends com.waze.map.isolated.k implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f30745a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str) {
        super(null, null);
        x.f(str, "externalTripToken");
        this.f30745a = str;
    }

    @Override // com.waze.nav_connect.a.c
    public final String b() {
        return this.f30745a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && x.n(this.f30745a, ((o) obj).f30745a);
    }

    public final int hashCode() {
        return this.f30745a.hashCode();
    }

    public final String toString() {
        return "PendingTokenValidation(externalTripToken=" + this.f30745a + ")";
    }
}
