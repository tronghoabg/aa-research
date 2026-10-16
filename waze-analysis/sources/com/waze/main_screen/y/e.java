package com.waze.main_screen.y;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f27874a;

    public e(boolean z) {
        this.f27874a = z;
    }

    public final boolean a() {
        return this.f27874a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f27874a == ((e) obj).f27874a;
    }

    public final int hashCode() {
        return a.a.a(this.f27874a);
    }

    public final String toString() {
        return "MidDrive(resumeDrive=" + this.f27874a + ")";
    }

    public e() {
        this((byte[]) null);
    }

    public /* synthetic */ e(byte[] bArr) {
        this(false);
    }
}
