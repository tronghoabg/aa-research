package com.waze.sharedrive.c.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    private final int f38063a;

    public d(int i2) {
        this.f38063a = i2;
    }

    public final int a() {
        return this.f38063a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f38063a == ((d) obj).f38063a;
    }

    public final int hashCode() {
        return this.f38063a;
    }

    public final String toString() {
        return "Mood(id=" + this.f38063a + ")";
    }
}
