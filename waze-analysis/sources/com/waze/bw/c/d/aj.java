package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aj implements z, bl {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17960a;

    public aj(boolean z) {
        this.f17960a = z;
    }

    public final boolean a() {
        return this.f17960a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aj) && this.f17960a == ((aj) obj).f17960a;
    }

    public final int hashCode() {
        return a.a.a(this.f17960a);
    }

    public final String toString() {
        return "ContactsPermissionsChanged(isGranted=" + this.f17960a + ")";
    }
}
