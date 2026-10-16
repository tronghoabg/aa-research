package com.waze.sharedrive;

import e.a.eb;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements q {

    /* renamed from: a, reason: collision with root package name */
    private final eb f38011a;

    public a(eb ebVar) {
        h.g.b.x.f(ebVar, "statusCode");
        this.f38011a = ebVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f38011a == ((a) obj).f38011a;
    }

    public final int hashCode() {
        return this.f38011a.hashCode();
    }

    public final String toString() {
        return "ApiError(statusCode=" + this.f38011a + ")";
    }
}
