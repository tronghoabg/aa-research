package com.google.android.datatransport.cct.a;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class o extends x {

    /* renamed from: a, reason: collision with root package name */
    private final List f4048a;

    o(List list) {
        this.f4048a = list;
    }

    @Override // com.google.android.datatransport.cct.a.x
    public final List a() {
        return this.f4048a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            return this.f4048a.equals(((x) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f4048a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f4048a.toString() + "}";
    }
}
