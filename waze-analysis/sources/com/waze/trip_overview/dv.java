package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dv extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f41420a;

    public dv(boolean z) {
        super(null);
        this.f41420a = z;
    }

    public final boolean a() {
        return this.f41420a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dv) && this.f41420a == ((dv) obj).f41420a;
    }

    public final int hashCode() {
        return a.a.a(this.f41420a);
    }

    public final String toString() {
        return "AvoidTollsSettingChanged(isChecked=" + this.f41420a + ")";
    }
}
