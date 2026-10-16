package com.waze.main_screen.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25653a;

    public b(boolean z) {
        this.f25653a = z;
    }

    public final boolean a() {
        return this.f25653a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f25653a == ((b) obj).f25653a;
    }

    public final int hashCode() {
        return a.a.a(this.f25653a);
    }

    public final String toString() {
        return "AudioSDKPane(openAppList=" + this.f25653a + ")";
    }
}
