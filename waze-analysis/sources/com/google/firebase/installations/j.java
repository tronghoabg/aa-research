package com.google.firebase.installations;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f10039a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10040b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10041c;

    /* synthetic */ j(String str, long j2, long j3) {
        this.f10039a = str;
        this.f10040b = j2;
        this.f10041c = j3;
    }

    public final String a() {
        return this.f10039a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f10039a.equals(jVar.f10039a) && this.f10040b == jVar.f10040b && this.f10041c == jVar.f10041c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f10039a.hashCode() ^ 1000003;
        long j2 = this.f10041c;
        long j3 = j2 ^ (j2 >>> 32);
        long j4 = this.f10040b;
        return ((((int) (j4 ^ (j4 >>> 32))) ^ (iHashCode * 1000003)) * 1000003) ^ ((int) j3);
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f10039a + ", tokenExpirationTimestamp=" + this.f10040b + ", tokenCreationTimestamp=" + this.f10041c + "}";
    }

    public j() {
        throw null;
    }
}
