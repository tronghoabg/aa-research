package com.waze.bn;

import h.g.b.x;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends com.waze.resume_drive.a {

    /* renamed from: a, reason: collision with root package name */
    private final br f17150a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(br brVar) {
        super(null, null);
        x.f(brVar, "roamingActivationJob");
        this.f17150a = brVar;
    }

    public final br b() {
        return this.f17150a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && x.n(this.f17150a, ((d) obj).f17150a);
    }

    public final int hashCode() {
        return this.f17150a.hashCode();
    }

    public final String toString() {
        return "Pending(roamingActivationJob=" + this.f17150a + ")";
    }
}
