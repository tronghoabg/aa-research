package com.waze.ui.w.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah extends com.waze.ui.g.w {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f43583a;

    public ah(boolean z) {
        super(null);
        this.f43583a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah) && this.f43583a == ((ah) obj).f43583a;
    }

    public final int hashCode() {
        return a.a.a(this.f43583a);
    }

    public final boolean j() {
        return this.f43583a;
    }

    public final String toString() {
        return "OnResumed(hasRecordedAudioPermission=" + this.f43583a + ")";
    }
}
