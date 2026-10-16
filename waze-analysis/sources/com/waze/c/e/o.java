package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o extends q {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18683a;

    public o(boolean z) {
        super(null);
        this.f18683a = z;
    }

    public final boolean a() {
        return this.f18683a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f18683a == ((o) obj).f18683a;
    }

    public final int hashCode() {
        return a.a.a(this.f18683a);
    }

    public final String toString() {
        return "Loaded(oneAlternativeFound=" + this.f18683a + ")";
    }
}
