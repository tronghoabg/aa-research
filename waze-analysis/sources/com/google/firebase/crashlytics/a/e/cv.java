package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class cv {

    /* renamed from: a, reason: collision with root package name */
    private final String f9546a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9547b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9548c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9549d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9550e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.h f9551f;

    cv(String str, String str2, String str3, String str4, int i2, com.google.firebase.crashlytics.a.h hVar) {
        this.f9546a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f9547b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f9548c = str3;
        this.f9549d = str4;
        this.f9550e = i2;
        this.f9551f = hVar;
    }

    public static cv a(String str, String str2, String str3, String str4, int i2, com.google.firebase.crashlytics.a.h hVar) {
        return new cv(str, str2, str3, str4, i2, hVar);
    }

    public final int b() {
        return this.f9550e;
    }

    public final com.google.firebase.crashlytics.a.h c() {
        return this.f9551f;
    }

    public final String d() {
        return this.f9546a;
    }

    public final String e() {
        return this.f9549d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cv) {
            cv cvVar = (cv) obj;
            if (this.f9546a.equals(cvVar.f9546a) && this.f9547b.equals(cvVar.f9547b) && this.f9548c.equals(cvVar.f9548c) && this.f9549d.equals(cvVar.f9549d) && this.f9550e == cvVar.f9550e && this.f9551f.equals(cvVar.f9551f)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return this.f9547b;
    }

    public final String g() {
        return this.f9548c;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.f9546a.hashCode() ^ 1000003) * 1000003) ^ this.f9547b.hashCode()) * 1000003) ^ this.f9548c.hashCode()) * 1000003) ^ this.f9549d.hashCode();
        com.google.firebase.crashlytics.a.h hVar = this.f9551f;
        return ((this.f9550e ^ (iHashCode * 1000003)) * 1000003) ^ hVar.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f9546a + ", versionCode=" + this.f9547b + ", versionName=" + this.f9548c + ", installUuid=" + this.f9549d + ", deliveryMechanism=" + this.f9550e + ", developmentPlatformProvider=" + this.f9551f.toString() + "}";
    }

    public cv() {
        throw null;
    }
}
