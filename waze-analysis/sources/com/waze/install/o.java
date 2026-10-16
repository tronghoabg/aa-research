package com.waze.install;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o extends w {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24788a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24789b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z, String str) {
        super(10);
        h.g.b.x.f(str, "appDownloadUrl");
        this.f24788a = z;
        this.f24789b = str;
    }

    public final String a() {
        return this.f24789b;
    }

    public final boolean b() {
        return this.f24788a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f24788a == oVar.f24788a && h.g.b.x.n(this.f24789b, oVar.f24789b);
    }

    public final int hashCode() {
        return (a.a.a(this.f24788a) * 31) + this.f24789b.hashCode();
    }

    public final String toString() {
        return "AppVersion(hasUnsupportedOs=" + this.f24788a + ", appDownloadUrl=" + this.f24789b + ")";
    }
}
