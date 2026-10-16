package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final int f36596a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36597b;

    public h(int i2, int i3) {
        this.f36596a = i2;
        this.f36597b = i3;
    }

    public final int a() {
        return this.f36597b;
    }

    public final int b() {
        return this.f36596a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f36596a == hVar.f36596a && this.f36597b == hVar.f36597b;
    }

    public final int hashCode() {
        return (this.f36596a * 31) + this.f36597b;
    }

    public final String toString() {
        return "SafeDrawingVerticalPadding(topPx=" + this.f36596a + ", bottomPx=" + this.f36597b + ")";
    }
}
