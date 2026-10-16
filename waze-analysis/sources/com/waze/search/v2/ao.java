package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ao extends com.waze.speech.k {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f36157a;

    public ao(boolean z) {
        super(null);
        this.f36157a = z;
    }

    public final boolean a() {
        return this.f36157a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ao) && this.f36157a == ((ao) obj).f36157a;
    }

    public final int hashCode() {
        return a.a.a(this.f36157a);
    }

    public final String toString() {
        return "MapDragged(mapExpanded=" + this.f36157a + ")";
    }
}
