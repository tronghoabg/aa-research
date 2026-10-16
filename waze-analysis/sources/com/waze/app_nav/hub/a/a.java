package com.waze.app_nav.hub.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15212a;

    public a(boolean z) {
        this.f15212a = z;
    }

    public final boolean a() {
        return this.f15212a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f15212a == ((a) obj).f15212a;
    }

    public final int hashCode() {
        return a.a.a(this.f15212a);
    }

    public final String toString() {
        return "WazeHubPolicy(blockAll=" + this.f15212a + ")";
    }
}
