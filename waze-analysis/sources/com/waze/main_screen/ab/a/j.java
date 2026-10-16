package com.waze.main_screen.ab.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    private final int f25639a;

    public j(int i2) {
        this.f25639a = i2;
    }

    public final int a() {
        return this.f25639a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f25639a == ((j) obj).f25639a;
    }

    public final int hashCode() {
        return this.f25639a;
    }

    public final String toString() {
        return "PreCloseAllpopUps(reason=" + this.f25639a + ")";
    }
}
