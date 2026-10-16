package com.waze.main_screen.m;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    private final int f26649a;

    public b(int i2) {
        this.f26649a = i2;
    }

    @Override // com.waze.main_screen.m.i
    public final int a() {
        return this.f26649a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f26649a == ((b) obj).f26649a;
    }

    public final int hashCode() {
        return this.f26649a;
    }

    public final String toString() {
        return "CurrentStreetNamePill(top=" + this.f26649a + ")";
    }
}
