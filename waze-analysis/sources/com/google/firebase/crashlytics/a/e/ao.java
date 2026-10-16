package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ao extends br {

    /* renamed from: a, reason: collision with root package name */
    private final long f9365a;

    /* renamed from: b, reason: collision with root package name */
    private final long f9366b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9367c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9368d;

    /* synthetic */ ao(long j2, long j3, String str, String str2) {
        this.f9365a = j2;
        this.f9366b = j3;
        this.f9367c = str;
        this.f9368d = str2;
    }

    @Override // com.google.firebase.crashlytics.a.e.br
    public final long a() {
        return this.f9365a;
    }

    @Override // com.google.firebase.crashlytics.a.e.br
    public final long b() {
        return this.f9366b;
    }

    @Override // com.google.firebase.crashlytics.a.e.br
    public final String c() {
        return this.f9367c;
    }

    @Override // com.google.firebase.crashlytics.a.e.br
    public final String d() {
        return this.f9368d;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof br) {
            br brVar = (br) obj;
            if (this.f9365a == brVar.a() && this.f9366b == brVar.b() && this.f9367c.equals(brVar.c()) && ((str = this.f9368d) != null ? str.equals(brVar.d()) : brVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f9366b;
        long j3 = this.f9365a;
        int iHashCode = ((((int) (j2 ^ (j2 >>> 32))) ^ ((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ this.f9367c.hashCode();
        String str = this.f9368d;
        return (str == null ? 0 : str.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "BinaryImage{baseAddress=" + this.f9365a + ", size=" + this.f9366b + ", name=" + this.f9367c + ", uuid=" + this.f9368d + "}";
    }
}
