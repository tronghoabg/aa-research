package com.google.android.datatransport.cct.a;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class v extends aj {

    /* renamed from: a, reason: collision with root package name */
    private final long f4066a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4067b;

    /* renamed from: c, reason: collision with root package name */
    private final z f4068c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f4069d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4070e;

    /* renamed from: f, reason: collision with root package name */
    private final List f4071f;

    /* renamed from: g, reason: collision with root package name */
    private final ap f4072g;

    /* synthetic */ v(long j2, long j3, z zVar, Integer num, String str, List list, ap apVar) {
        this.f4066a = j2;
        this.f4067b = j3;
        this.f4068c = zVar;
        this.f4069d = num;
        this.f4070e = str;
        this.f4071f = list;
        this.f4072g = apVar;
    }

    @Override // com.google.android.datatransport.cct.a.aj
    public final long a() {
        return this.f4066a;
    }

    @Override // com.google.android.datatransport.cct.a.aj
    public final long b() {
        return this.f4067b;
    }

    @Override // com.google.android.datatransport.cct.a.aj
    public final z c() {
        return this.f4068c;
    }

    @Override // com.google.android.datatransport.cct.a.aj
    public final ap d() {
        return this.f4072g;
    }

    @Override // com.google.android.datatransport.cct.a.aj
    public final Integer e() {
        return this.f4069d;
    }

    public final boolean equals(Object obj) {
        z zVar;
        Integer num;
        String str;
        List list;
        ap apVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aj) {
            aj ajVar = (aj) obj;
            if (this.f4066a == ajVar.a() && this.f4067b == ajVar.b() && ((zVar = this.f4068c) != null ? zVar.equals(ajVar.c()) : ajVar.c() == null) && ((num = this.f4069d) != null ? num.equals(ajVar.e()) : ajVar.e() == null) && ((str = this.f4070e) != null ? str.equals(ajVar.f()) : ajVar.f() == null) && ((list = this.f4071f) != null ? list.equals(ajVar.g()) : ajVar.g() == null) && ((apVar = this.f4072g) != null ? apVar.equals(ajVar.d()) : ajVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.a.aj
    public final String f() {
        return this.f4070e;
    }

    @Override // com.google.android.datatransport.cct.a.aj
    public final List g() {
        return this.f4071f;
    }

    public final int hashCode() {
        z zVar = this.f4068c;
        int iHashCode = zVar == null ? 0 : zVar.hashCode();
        long j2 = this.f4066a;
        long j3 = this.f4067b;
        Integer num = this.f4069d;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int i2 = iHashCode ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
        String str = this.f4070e;
        int iHashCode3 = ((((i2 * 1000003) ^ iHashCode2) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f4071f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        ap apVar = this.f4072g;
        return iHashCode4 ^ (apVar != null ? apVar.hashCode() : 0);
    }

    public final String toString() {
        ap apVar = this.f4072g;
        List list = this.f4071f;
        return "LogRequest{requestTimeMs=" + this.f4066a + ", requestUptimeMs=" + this.f4067b + ", clientInfo=" + String.valueOf(this.f4068c) + ", logSource=" + this.f4069d + ", logSourceName=" + this.f4070e + ", logEvents=" + String.valueOf(list) + ", qosTier=" + String.valueOf(apVar) + "}";
    }
}
