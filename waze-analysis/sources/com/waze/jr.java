package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jr extends ka {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24965a;

    public jr(boolean z) {
        this.f24965a = z;
    }

    public final boolean a() {
        return this.f24965a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jr) && this.f24965a == ((jr) obj).f24965a;
    }

    public final int hashCode() {
        return a.a.a(this.f24965a);
    }

    public final String toString() {
        return "LogsReportedPopup(succeeded=" + this.f24965a + ")";
    }
}
