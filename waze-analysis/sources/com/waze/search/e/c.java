package com.waze.search.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends com.waze.search.v2.o {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f35619a;

    public c(boolean z) {
        super(null);
        this.f35619a = z;
    }

    public final boolean a() {
        return this.f35619a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f35619a == ((c) obj).f35619a;
    }

    public final int hashCode() {
        return a.a.a(this.f35619a);
    }

    public final String toString() {
        return "GrantState(granted=" + this.f35619a + ")";
    }
}
