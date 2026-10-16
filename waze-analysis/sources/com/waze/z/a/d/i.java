package com.waze.z.a.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i implements q {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f45963a;

    public i(boolean z) {
        this.f45963a = z;
    }

    public final boolean a() {
        return this.f45963a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f45963a == ((i) obj).f45963a;
    }

    public final int hashCode() {
        return a.a.a(this.f45963a);
    }

    public final String toString() {
        return "FocusChanged(isFocused=" + this.f45963a + ")";
    }
}
