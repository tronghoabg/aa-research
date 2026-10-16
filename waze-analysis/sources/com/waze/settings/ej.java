package com.waze.settings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ej {

    /* renamed from: a, reason: collision with root package name */
    private final int f37179a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37180b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37181c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37182d;

    public ej(int i2, int i3, int i4, int i5) {
        this.f37179a = i2;
        this.f37180b = i3;
        this.f37181c = i4;
        this.f37182d = i5;
    }

    public final int a() {
        return this.f37181c;
    }

    public final int b() {
        return this.f37182d;
    }

    public final int c() {
        return this.f37180b;
    }

    public final int d() {
        return this.f37179a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej)) {
            return false;
        }
        ej ejVar = (ej) obj;
        return this.f37179a == ejVar.f37179a && this.f37180b == ejVar.f37180b && this.f37181c == ejVar.f37181c && this.f37182d == ejVar.f37182d;
    }

    public final int hashCode() {
        return (((((this.f37179a * 31) + this.f37180b) * 31) + this.f37181c) * 31) + this.f37182d;
    }

    public final String toString() {
        return "GuidanceModeUiResources(titleResId=" + this.f37179a + ", settingsIconResId=" + this.f37180b + ", inCarSettingsIconResId=" + this.f37181c + ", navigationIconResId=" + this.f37182d + ")";
    }
}
