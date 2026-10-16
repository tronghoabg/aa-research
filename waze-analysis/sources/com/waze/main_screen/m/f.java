package com.waze.main_screen.m;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    private final int f26654a;

    public f(int i2) {
        this.f26654a = i2;
    }

    @Override // com.waze.main_screen.m.i
    public final int a() {
        return this.f26654a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f26654a == ((f) obj).f26654a;
    }

    public final int hashCode() {
        return this.f26654a;
    }

    public final String toString() {
        return "StartState(top=" + this.f26654a + ")";
    }
}
