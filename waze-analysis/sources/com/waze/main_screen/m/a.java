package com.waze.main_screen.m;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    private final int f26648a;

    public a(int i2) {
        this.f26648a = i2;
    }

    @Override // com.waze.main_screen.m.i
    public final int a() {
        return this.f26648a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f26648a == ((a) obj).f26648a;
    }

    public final int hashCode() {
        return this.f26648a;
    }

    public final String toString() {
        return "CompactEtaBar(top=" + this.f26648a + ")";
    }
}
