package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class du extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f41419a;

    public du(boolean z) {
        super(null);
        this.f41419a = z;
    }

    public final boolean a() {
        return this.f41419a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof du) && this.f41419a == ((du) obj).f41419a;
    }

    public final int hashCode() {
        return a.a.a(this.f41419a);
    }

    public final String toString() {
        return "AvoidFerriesSettingChanged(isChecked=" + this.f41419a + ")";
    }
}
