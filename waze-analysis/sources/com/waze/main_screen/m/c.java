package com.waze.main_screen.m;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final int f26650a;

    public c(int i2) {
        this.f26650a = i2;
    }

    @Override // com.waze.main_screen.m.i
    public final int a() {
        return this.f26650a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f26650a == ((c) obj).f26650a;
    }

    public final int hashCode() {
        return this.f26650a;
    }

    public final String toString() {
        return "Eta(top=" + this.f26650a + ")";
    }
}
