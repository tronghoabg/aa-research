package com.waze.ui.w.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class al extends com.waze.ui.g.w {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f43586a;

    public al(boolean z) {
        super(null);
        this.f43586a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof al) && this.f43586a == ((al) obj).f43586a;
    }

    public final int hashCode() {
        return a.a.a(this.f43586a);
    }

    public final boolean j() {
        return this.f43586a;
    }

    public final String toString() {
        return "TurnedOnClicked(hasRecordedAudioPermission=" + this.f43586a + ")";
    }
}
