package com.waze.ui.b.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f41950a;

    /* renamed from: b, reason: collision with root package name */
    private final int f41951b;

    public a(int i2, int i3) {
        this.f41950a = i2;
        this.f41951b = i3;
    }

    public final int a() {
        return this.f41951b;
    }

    public final int b() {
        return this.f41950a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f41950a == aVar.f41950a && this.f41951b == aVar.f41951b;
    }

    public final int hashCode() {
        return (this.f41950a * 31) + this.f41951b;
    }

    public final String toString() {
        return "AbsolutePosition(start=" + this.f41950a + ", end=" + this.f41951b + ")";
    }
}
