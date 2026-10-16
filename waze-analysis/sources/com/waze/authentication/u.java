package com.waze.authentication;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u extends v {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15774a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15775b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z, String str) {
        super("UnsupportedAppVersion");
        h.g.b.x.f(str, "appDownloadUrl");
        this.f15774a = z;
        this.f15775b = str;
    }

    public final String a() {
        return this.f15775b;
    }

    public final boolean b() {
        return this.f15774a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f15774a == uVar.f15774a && h.g.b.x.n(this.f15775b, uVar.f15775b);
    }

    public final int hashCode() {
        return (a.a.a(this.f15774a) * 31) + this.f15775b.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "UnsupportedAppVersion(unsupportedOs=" + this.f15774a + ", appDownloadUrl=" + this.f15775b + ")";
    }
}
