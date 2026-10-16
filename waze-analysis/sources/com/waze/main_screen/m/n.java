package com.waze.main_screen.m;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    private final int f26660a;

    public n(int i2) {
        this.f26660a = i2;
    }

    @Override // com.waze.main_screen.m.o
    public final int a() {
        return this.f26660a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f26660a == ((n) obj).f26660a;
    }

    public final int hashCode() {
        return this.f26660a;
    }

    public final String toString() {
        return "ViaBar(bottom=" + this.f26660a + ")";
    }
}
