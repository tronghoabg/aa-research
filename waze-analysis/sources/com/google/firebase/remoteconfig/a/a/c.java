package com.google.firebase.remoteconfig.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    private final String f10589b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10590c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10591d;

    /* renamed from: e, reason: collision with root package name */
    private final String f10592e;

    /* renamed from: f, reason: collision with root package name */
    private final long f10593f;

    /* synthetic */ c(String str, String str2, String str3, String str4, long j2) {
        this.f10589b = str;
        this.f10590c = str2;
        this.f10591d = str3;
        this.f10592e = str4;
        this.f10593f = j2;
    }

    @Override // com.google.firebase.remoteconfig.a.a.e
    public final long a() {
        return this.f10593f;
    }

    @Override // com.google.firebase.remoteconfig.a.a.e
    public final String b() {
        return this.f10591d;
    }

    @Override // com.google.firebase.remoteconfig.a.a.e
    public final String c() {
        return this.f10592e;
    }

    @Override // com.google.firebase.remoteconfig.a.a.e
    public final String d() {
        return this.f10589b;
    }

    @Override // com.google.firebase.remoteconfig.a.a.e
    public final String e() {
        return this.f10590c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f10589b.equals(eVar.d()) && this.f10590c.equals(eVar.e()) && this.f10591d.equals(eVar.b()) && this.f10592e.equals(eVar.c()) && this.f10593f == eVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.f10589b.hashCode() ^ 1000003) * 1000003) ^ this.f10590c.hashCode()) * 1000003) ^ this.f10591d.hashCode()) * 1000003) ^ this.f10592e.hashCode();
        long j2 = this.f10593f;
        return ((int) (j2 ^ (j2 >>> 32))) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "RolloutAssignment{rolloutId=" + this.f10589b + ", variantId=" + this.f10590c + ", parameterKey=" + this.f10591d + ", parameterValue=" + this.f10592e + ", templateVersion=" + this.f10593f + "}";
    }
}
