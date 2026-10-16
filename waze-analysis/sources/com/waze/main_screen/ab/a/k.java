package com.waze.main_screen.ab.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    private final int f25640a;

    public k(int i2) {
        this.f25640a = i2;
    }

    public final int a() {
        return this.f25640a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f25640a == ((k) obj).f25640a;
    }

    public final int hashCode() {
        return this.f25640a;
    }

    public final String toString() {
        return "SetTimeout(timeout=" + this.f25640a + ")";
    }
}
