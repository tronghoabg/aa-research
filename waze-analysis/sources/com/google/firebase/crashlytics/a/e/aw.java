package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aw extends cm {

    /* renamed from: a, reason: collision with root package name */
    private final cl f9396a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9397b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9398c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9399d;

    /* synthetic */ aw(cl clVar, String str, String str2, long j2) {
        this.f9396a = clVar;
        this.f9397b = str;
        this.f9398c = str2;
        this.f9399d = j2;
    }

    @Override // com.google.firebase.crashlytics.a.e.cm
    public final long a() {
        return this.f9399d;
    }

    @Override // com.google.firebase.crashlytics.a.e.cm
    public final cl b() {
        return this.f9396a;
    }

    @Override // com.google.firebase.crashlytics.a.e.cm
    public final String c() {
        return this.f9397b;
    }

    @Override // com.google.firebase.crashlytics.a.e.cm
    public final String d() {
        return this.f9398c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cm) {
            cm cmVar = (cm) obj;
            if (this.f9396a.equals(cmVar.b()) && this.f9397b.equals(cmVar.c()) && this.f9398c.equals(cmVar.d()) && this.f9399d == cmVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f9396a.hashCode() ^ 1000003) * 1000003) ^ this.f9397b.hashCode()) * 1000003) ^ this.f9398c.hashCode();
        long j2 = this.f9399d;
        return ((int) (j2 ^ (j2 >>> 32))) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f9396a.toString() + ", parameterKey=" + this.f9397b + ", parameterValue=" + this.f9398c + ", templateVersion=" + this.f9399d + "}";
    }
}
