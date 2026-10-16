package Q9;

import A.AbstractC0213f;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f9919a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9920b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9921c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9922d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9923e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9924f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9925g;

    public b(String str, int i5, String str2, String str3, long j8, long j10, String str4) {
        this.f9919a = str;
        this.f9920b = i5;
        this.f9921c = str2;
        this.f9922d = str3;
        this.f9923e = j8;
        this.f9924f = j10;
        this.f9925g = str4;
    }

    public final a a() {
        a aVar = new a();
        aVar.f9913c = this.f9919a;
        aVar.f9912b = this.f9920b;
        aVar.f9914d = this.f9921c;
        aVar.f9915e = this.f9922d;
        aVar.f9917g = Long.valueOf(this.f9923e);
        aVar.f9918h = Long.valueOf(this.f9924f);
        aVar.f9916f = this.f9925g;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f9919a;
        if (str == null) {
            if (bVar.f9919a != null) {
                return false;
            }
        } else if (!str.equals(bVar.f9919a)) {
            return false;
        }
        if (!AbstractC0213f.b(this.f9920b, bVar.f9920b)) {
            return false;
        }
        String str2 = bVar.f9921c;
        String str3 = this.f9921c;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        String str4 = bVar.f9922d;
        String str5 = this.f9922d;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (this.f9923e != bVar.f9923e || this.f9924f != bVar.f9924f) {
            return false;
        }
        String str6 = bVar.f9925g;
        String str7 = this.f9925g;
        return str7 == null ? str6 == null : str7.equals(str6);
    }

    public final int hashCode() {
        String str = this.f9919a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ AbstractC0213f.f(this.f9920b)) * 1000003;
        String str2 = this.f9921c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9922d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j8 = this.f9923e;
        int i5 = (iHashCode3 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j10 = this.f9924f;
        int i10 = (i5 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f9925g;
        return (str4 != null ? str4.hashCode() : 0) ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f9919a);
        sb2.append(", registrationStatus=");
        int i5 = this.f9920b;
        sb2.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb2.append(", authToken=");
        sb2.append(this.f9921c);
        sb2.append(", refreshToken=");
        sb2.append(this.f9922d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f9923e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f9924f);
        sb2.append(", fisError=");
        return wg.b.c(sb2, this.f9925g, "}");
    }
}
