package com.waze.main_screen.m;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    private final int f26653a;

    public e(int i2) {
        this.f26653a = i2;
    }

    @Override // com.waze.main_screen.m.i
    public final int a() {
        return this.f26653a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f26653a == ((e) obj).f26653a;
    }

    public final int hashCode() {
        return this.f26653a;
    }

    public final String toString() {
        return "ReportMenu(top=" + this.f26653a + ")";
    }
}
