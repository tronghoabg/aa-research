package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends com.waze.speech.k {

    /* renamed from: a, reason: collision with root package name */
    private final int f36601a;

    public k(int i2) {
        super(null);
        this.f36601a = i2;
    }

    public final int a() {
        return this.f36601a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f36601a == ((k) obj).f36601a;
    }

    public final int hashCode() {
        return this.f36601a;
    }

    public final String toString() {
        return "Counter(counter=" + this.f36601a + ")";
    }
}
