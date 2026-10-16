package com.google.android.libraries.f.a.a.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final a f5926a;

    public b(a aVar) {
        x.f(aVar, "reason");
        this.f5926a = aVar;
    }

    public final a a() {
        return this.f5926a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f5926a == ((b) obj).f5926a;
    }

    public final int hashCode() {
        return this.f5926a.hashCode();
    }

    public final String toString() {
        return "Failure(reason=" + this.f5926a + ")";
    }
}
