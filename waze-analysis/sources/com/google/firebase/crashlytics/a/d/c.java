package com.google.firebase.crashlytics.a.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c extends q {

    /* renamed from: b, reason: collision with root package name */
    private final String f9234b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9235c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9236d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9237e;

    /* renamed from: f, reason: collision with root package name */
    private final long f9238f;

    c(String str, String str2, String str3, String str4, long j2) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f9234b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f9235c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f9236d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f9237e = str4;
        this.f9238f = j2;
    }

    @Override // com.google.firebase.crashlytics.a.d.q
    public final long a() {
        return this.f9238f;
    }

    @Override // com.google.firebase.crashlytics.a.d.q
    public final String b() {
        return this.f9235c;
    }

    @Override // com.google.firebase.crashlytics.a.d.q
    public final String c() {
        return this.f9236d;
    }

    @Override // com.google.firebase.crashlytics.a.d.q
    public final String d() {
        return this.f9234b;
    }

    @Override // com.google.firebase.crashlytics.a.d.q
    public final String e() {
        return this.f9237e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f9234b.equals(qVar.d()) && this.f9235c.equals(qVar.b()) && this.f9236d.equals(qVar.c()) && this.f9237e.equals(qVar.e()) && this.f9238f == qVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.f9234b.hashCode() ^ 1000003) * 1000003) ^ this.f9235c.hashCode()) * 1000003) ^ this.f9236d.hashCode()) * 1000003) ^ this.f9237e.hashCode();
        long j2 = this.f9238f;
        return ((int) (j2 ^ (j2 >>> 32))) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "RolloutAssignment{rolloutId=" + this.f9234b + ", parameterKey=" + this.f9235c + ", parameterValue=" + this.f9236d + ", variantId=" + this.f9237e + ", templateVersion=" + this.f9238f + "}";
    }
}
