package com.waze.view.popups.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f45254a;

    public d(boolean z) {
        super(null);
        this.f45254a = z;
    }

    public final boolean a() {
        return this.f45254a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f45254a == ((d) obj).f45254a;
    }

    public final int hashCode() {
        return a.a.a(this.f45254a);
    }

    public final String toString() {
        return "CloseTakeNewPhotoScreen(didTakeNewPhoto=" + this.f45254a + ")";
    }
}
