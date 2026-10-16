package com.waze.ui.j;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f42414a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f42415b;

    public i(boolean z, boolean z2) {
        this.f42414a = z;
        this.f42415b = z2;
    }

    public static /* synthetic */ i c(i iVar, boolean z) {
        return new i(z, iVar.f42415b);
    }

    public final boolean a() {
        return this.f42415b;
    }

    public final boolean b() {
        return this.f42414a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f42414a == iVar.f42414a && this.f42415b == iVar.f42415b;
    }

    public final int hashCode() {
        return (a.a.a(this.f42414a) * 31) + a.a.a(this.f42415b);
    }

    public final String toString() {
        return "HamburgerButtonState(showNotificationDot=" + this.f42414a + ", longClickEnabled=" + this.f42415b + ")";
    }
}
