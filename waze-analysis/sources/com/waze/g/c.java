package com.waze.g;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f23992a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23993b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23994c;

    public c(String str, String str2, boolean z) {
        x.f(str, "clientSessionId");
        this.f23992a = str;
        this.f23993b = str2;
        this.f23994c = z;
    }

    public static /* synthetic */ c d(c cVar, String str, boolean z, int i2) {
        String str2 = (i2 & 1) != 0 ? cVar.f23992a : null;
        if ((i2 & 2) != 0) {
            str = cVar.f23993b;
        }
        if ((i2 & 4) != 0) {
            z = cVar.f23994c;
        }
        x.f(str2, "clientSessionId");
        return new c(str2, str, z);
    }

    public final String a() {
        return this.f23992a;
    }

    public final String b() {
        return this.f23993b;
    }

    public final boolean c() {
        return this.f23994c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f23992a, cVar.f23992a) && x.n(this.f23993b, cVar.f23993b) && this.f23994c == cVar.f23994c;
    }

    public final int hashCode() {
        int iHashCode = this.f23992a.hashCode() * 31;
        String str = this.f23993b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + a.a.a(this.f23994c);
    }

    public final String toString() {
        return "SessionInfo(clientSessionId=" + this.f23992a + ", rtSessionId=" + this.f23993b + ", stealth=" + this.f23994c + ")";
    }
}
