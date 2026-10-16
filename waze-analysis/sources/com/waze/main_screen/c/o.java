package com.waze.main_screen.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o extends com.waze.location.q {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.c.e.i f26260a;

    public o(com.waze.main_screen.c.e.i iVar) {
        h.g.b.x.f(iVar, "shareDriveButtonStateHolder");
        this.f26260a = iVar;
    }

    public final com.waze.main_screen.c.e.i b() {
        return this.f26260a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && h.g.b.x.n(this.f26260a, ((o) obj).f26260a);
    }

    public final int hashCode() {
        return this.f26260a.hashCode();
    }

    public final String toString() {
        return "ShareDrive(shareDriveButtonStateHolder=" + this.f26260a + ")";
    }
}
