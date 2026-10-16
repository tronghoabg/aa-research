package com.google.firebase.crashlytics.a.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    private final String f9137a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9138b;

    public ap(String str, String str2) {
        this.f9137a = str;
        this.f9138b = str2;
    }

    public final String a() {
        return this.f9138b;
    }

    public final String b() {
        return this.f9137a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        return h.g.b.x.n(this.f9137a, apVar.f9137a) && h.g.b.x.n(this.f9138b, apVar.f9138b);
    }

    public final int hashCode() {
        String str = this.f9137a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f9138b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "FirebaseInstallationId(fid=" + this.f9137a + ", authToken=" + this.f9138b + ")";
    }
}
