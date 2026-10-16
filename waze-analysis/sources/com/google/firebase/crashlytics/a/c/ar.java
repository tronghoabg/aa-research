package com.google.firebase.crashlytics.a.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    private final String f9147a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9148b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9149c;

    ar(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f9147a = str;
        this.f9148b = str2;
        this.f9149c = str3;
    }

    static ar a(String str, ap apVar) {
        return new ar(str, apVar.b(), apVar.a());
    }

    public final String b() {
        return this.f9147a;
    }

    public final String c() {
        return this.f9149c;
    }

    public final String d() {
        return this.f9148b;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ar) {
            ar arVar = (ar) obj;
            if (this.f9147a.equals(arVar.f9147a) && ((str = this.f9148b) != null ? str.equals(arVar.f9148b) : arVar.f9148b == null) && ((str2 = this.f9149c) != null ? str2.equals(arVar.f9149c) : arVar.f9149c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9147a.hashCode() ^ 1000003;
        String str = this.f9148b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f9149c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f9147a + ", firebaseInstallationId=" + this.f9148b + ", firebaseAuthenticationToken=" + this.f9149c + "}";
    }

    public ar() {
        throw null;
    }
}
