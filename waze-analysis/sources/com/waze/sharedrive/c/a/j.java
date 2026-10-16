package com.waze.sharedrive.c.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f38068a;

    public j(boolean z) {
        this.f38068a = z;
    }

    public final boolean a() {
        return this.f38068a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f38068a == ((j) obj).f38068a;
    }

    public final int hashCode() {
        return a.a.a(this.f38068a);
    }

    public final String toString() {
        return "Viewer(sharingLocation=" + this.f38068a + ")";
    }
}
