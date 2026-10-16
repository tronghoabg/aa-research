package com.waze.main_screen.m;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k implements o {

    /* renamed from: a, reason: collision with root package name */
    private final int f26657a;

    public k(int i2) {
        this.f26657a = i2;
    }

    @Override // com.waze.main_screen.m.o
    public final int a() {
        return this.f26657a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f26657a == ((k) obj).f26657a;
    }

    public final int hashCode() {
        return this.f26657a;
    }

    public final String toString() {
        return "InstructionsBar(bottom=" + this.f26657a + ")";
    }
}
