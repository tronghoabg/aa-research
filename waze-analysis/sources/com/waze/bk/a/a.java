package com.waze.bk.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final a f16839a = new a(false, false, false);

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16840b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16841c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16842d;

    public a(boolean z, boolean z2, boolean z3) {
        this.f16840b = z;
        this.f16841c = z2;
        this.f16842d = z3;
    }

    public final boolean b() {
        return this.f16842d;
    }

    public final boolean c() {
        return this.f16841c;
    }

    public final boolean d() {
        return this.f16840b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16840b == aVar.f16840b && this.f16841c == aVar.f16841c && this.f16842d == aVar.f16842d;
    }

    public final int hashCode() {
        return (((a.a.a(this.f16840b) * 31) + a.a.a(this.f16841c)) * 31) + a.a.a(this.f16842d);
    }

    public final String toString() {
        return "ScreenWidgetsConfiguration(showSpeedometer=" + this.f16840b + ", showLoadersIfNeeded=" + this.f16841c + ", showBottomPillsIfNeeded=" + this.f16842d + ")";
    }
}
