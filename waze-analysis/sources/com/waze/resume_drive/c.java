package com.waze.resume_drive;

import com.waze.av.b.n;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    private final n f35103a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n nVar) {
        super(null);
        x.f(nVar, "destination");
        this.f35103a = nVar;
    }

    public final n a() {
        return this.f35103a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && x.n(this.f35103a, ((c) obj).f35103a);
    }

    public final int hashCode() {
        return this.f35103a.hashCode();
    }

    public final String toString() {
        return "Place(destination=" + this.f35103a + ")";
    }
}
