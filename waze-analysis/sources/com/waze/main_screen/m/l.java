package com.waze.main_screen.m;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l implements o {

    /* renamed from: a, reason: collision with root package name */
    private final int f26658a;

    public l(int i2) {
        this.f26658a = i2;
    }

    @Override // com.waze.main_screen.m.o
    public final int a() {
        return this.f26658a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f26658a == ((l) obj).f26658a;
    }

    public final int hashCode() {
        return this.f26658a;
    }

    public final String toString() {
        return "NearingDestination(bottom=" + this.f26658a + ")";
    }
}
