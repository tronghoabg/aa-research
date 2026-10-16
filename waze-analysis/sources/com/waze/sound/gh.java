package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gh extends gj {

    /* renamed from: a, reason: collision with root package name */
    private final String f40083a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40084b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f40085c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f40086d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.a f40087e;

    public gh(String str, String str2, boolean z, boolean z2, h.g.a.a aVar) {
        h.g.b.x.f(str, "filePath");
        h.g.b.x.f(aVar, "completionCallback");
        this.f40083a = str;
        this.f40084b = str2;
        this.f40085c = z;
        this.f40086d = z2;
        this.f40087e = aVar;
    }

    public final String a() {
        return this.f40083a;
    }

    @Override // com.waze.sound.gj
    public final h.g.a.a b() {
        return this.f40087e;
    }

    @Override // com.waze.sound.gj
    public final boolean c() {
        return this.f40086d;
    }

    @Override // com.waze.sound.gj
    public final boolean d() {
        return this.f40085c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh)) {
            return false;
        }
        gh ghVar = (gh) obj;
        return h.g.b.x.n(this.f40083a, ghVar.f40083a) && h.g.b.x.n(this.f40084b, ghVar.f40084b) && this.f40085c == ghVar.f40085c && this.f40086d == ghVar.f40086d && h.g.b.x.n(this.f40087e, ghVar.f40087e);
    }

    public final int hashCode() {
        int iHashCode = this.f40083a.hashCode() * 31;
        String str = this.f40084b;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + a.a.a(this.f40085c)) * 31) + a.a.a(this.f40086d)) * 31) + this.f40087e.hashCode();
    }

    public final String toString() {
        return "File(filePath=" + this.f40083a + ", soundStatsType=" + this.f40084b + ", ignoreMute=" + this.f40085c + ", ignoreHardMute=" + this.f40086d + ", completionCallback=" + this.f40087e + ")";
    }
}
