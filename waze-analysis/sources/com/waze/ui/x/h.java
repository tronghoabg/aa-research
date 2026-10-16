package com.waze.ui.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f43815a;

    public h(boolean z) {
        this.f43815a = z;
    }

    public final boolean a() {
        return this.f43815a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f43815a == ((h) obj).f43815a;
    }

    public final int hashCode() {
        return a.a.a(this.f43815a);
    }

    public final String toString() {
        return "AvoidFerriesSettingChanged(isChecked=" + this.f43815a + ")";
    }
}
