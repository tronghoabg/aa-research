package com.waze.ui.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i implements n {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f43816a;

    public i(boolean z) {
        this.f43816a = z;
    }

    public final boolean a() {
        return this.f43816a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f43816a == ((i) obj).f43816a;
    }

    public final int hashCode() {
        return a.a.a(this.f43816a);
    }

    public final String toString() {
        return "AvoidTollsSettingChanged(isChecked=" + this.f43816a + ")";
    }
}
