package com.google.firebase.sessions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    private final String f10799a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10800b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10801c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10802d;

    public ah(String str, String str2, int i2, long j2) {
        h.g.b.x.f(str, "sessionId");
        h.g.b.x.f(str2, "firstSessionId");
        this.f10799a = str;
        this.f10800b = str2;
        this.f10801c = i2;
        this.f10802d = j2;
    }

    public final int a() {
        return this.f10801c;
    }

    public final long b() {
        return this.f10802d;
    }

    public final String c() {
        return this.f10800b;
    }

    public final String d() {
        return this.f10799a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return h.g.b.x.n(this.f10799a, ahVar.f10799a) && h.g.b.x.n(this.f10800b, ahVar.f10800b) && this.f10801c == ahVar.f10801c && this.f10802d == ahVar.f10802d;
    }

    public final int hashCode() {
        return (((((this.f10799a.hashCode() * 31) + this.f10800b.hashCode()) * 31) + this.f10801c) * 31) + a.a.b(this.f10802d);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f10799a + ", firstSessionId=" + this.f10800b + ", sessionIndex=" + this.f10801c + ", sessionStartTimestampUs=" + this.f10802d + ")";
    }
}
