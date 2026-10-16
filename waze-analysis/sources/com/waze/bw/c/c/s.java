package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s extends com.waze.sharedui.api.c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17860a;

    public s(boolean z) {
        super(null, null);
        this.f17860a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f17860a == ((s) obj).f17860a;
    }

    public final boolean g() {
        return this.f17860a;
    }

    public final int hashCode() {
        return a.a.a(this.f17860a);
    }

    public final String toString() {
        return "RequestContactsPermissions(isUserAgeRestricted=" + this.f17860a + ")";
    }
}
