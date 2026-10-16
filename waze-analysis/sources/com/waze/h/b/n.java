package com.waze.h.b;

import com.waze.a.af;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n extends af {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.e.a f24331a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.waze.shared_infra.e.a aVar) {
        super(null);
        x.f(aVar, "encodedData");
        this.f24331a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && x.n(this.f24331a, ((n) obj).f24331a);
    }

    public final int hashCode() {
        return this.f24331a.hashCode();
    }

    public final com.waze.shared_infra.e.a p() {
        return this.f24331a;
    }

    public final String toString() {
        return "Success(encodedData=" + this.f24331a + ")";
    }
}
