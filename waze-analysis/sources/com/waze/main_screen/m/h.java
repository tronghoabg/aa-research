package com.waze.main_screen.m;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    private final int f26656a;

    public h(int i2) {
        this.f26656a = i2;
    }

    @Override // com.waze.main_screen.m.i
    public final int a() {
        return this.f26656a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f26656a == ((h) obj).f26656a;
    }

    public final int hashCode() {
        return this.f26656a;
    }

    public final String toString() {
        return "WazeAsk(top=" + this.f26656a + ")";
    }
}
