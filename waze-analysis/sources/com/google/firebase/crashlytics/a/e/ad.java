package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ad extends bc {

    /* renamed from: a, reason: collision with root package name */
    private final String f9311a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9312b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9313c;

    /* synthetic */ ad(String str, String str2, String str3) {
        this.f9311a = str;
        this.f9312b = str2;
        this.f9313c = str3;
    }

    @Override // com.google.firebase.crashlytics.a.e.bc
    public final String a() {
        return this.f9311a;
    }

    @Override // com.google.firebase.crashlytics.a.e.bc
    public final String b() {
        return this.f9313c;
    }

    @Override // com.google.firebase.crashlytics.a.e.bc
    public final String c() {
        return this.f9312b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bc) {
            bc bcVar = (bc) obj;
            if (this.f9311a.equals(bcVar.a()) && this.f9312b.equals(bcVar.c()) && this.f9313c.equals(bcVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f9311a.hashCode() ^ 1000003) * 1000003) ^ this.f9312b.hashCode();
        return this.f9313c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "BuildIdMappingForArch{arch=" + this.f9311a + ", libraryName=" + this.f9312b + ", buildId=" + this.f9313c + "}";
    }
}
