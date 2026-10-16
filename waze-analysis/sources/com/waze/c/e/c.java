package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18639a;

    public c(boolean z) {
        super(null);
        this.f18639a = z;
    }

    public final boolean a() {
        return this.f18639a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f18639a == ((c) obj).f18639a;
    }

    public final int hashCode() {
        return a.a.a(this.f18639a);
    }

    public final String toString() {
        return "Loaded(oneAlternativeFound=" + this.f18639a + ")";
    }
}
