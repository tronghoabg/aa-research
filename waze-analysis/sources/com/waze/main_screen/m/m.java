package com.waze.main_screen.m;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m implements o {

    /* renamed from: a, reason: collision with root package name */
    private final int f26659a;

    public m(int i2) {
        this.f26659a = i2;
    }

    @Override // com.waze.main_screen.m.o
    public final int a() {
        return this.f26659a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f26659a == ((m) obj).f26659a;
    }

    public final int hashCode() {
        return this.f26659a;
    }

    public final String toString() {
        return "NotificationMessage(bottom=" + this.f26659a + ")";
    }
}
