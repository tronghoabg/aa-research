package com.waze.sharedui.web;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v extends y {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f39371a;

    public v(boolean z) {
        super(null);
        this.f39371a = z;
    }

    public final boolean a() {
        return this.f39371a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f39371a == ((v) obj).f39371a;
    }

    public final int hashCode() {
        return a.a.a(this.f39371a);
    }

    public final String toString() {
        return "PendingBackHandled(wasHandled=" + this.f39371a + ")";
    }
}
