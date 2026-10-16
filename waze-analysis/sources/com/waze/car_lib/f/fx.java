package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fx extends com.waze.car_lib.screens.bx {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19599a;

    public fx(boolean z) {
        super(null);
        this.f19599a = z;
    }

    public final boolean a() {
        return this.f19599a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fx) && this.f19599a == ((fx) obj).f19599a;
    }

    public final int hashCode() {
        return a.a.a(this.f19599a);
    }

    public final String toString() {
        return "End(hasPermission=" + this.f19599a + ")";
    }

    public fx() {
        this(false);
    }
}
