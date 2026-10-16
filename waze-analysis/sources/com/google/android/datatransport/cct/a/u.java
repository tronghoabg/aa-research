package com.google.android.datatransport.cct.a;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class u extends ah {

    /* renamed from: a, reason: collision with root package name */
    private final long f4057a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f4058b;

    /* renamed from: c, reason: collision with root package name */
    private final ab f4059c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4060d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f4061e;

    /* renamed from: f, reason: collision with root package name */
    private final String f4062f;

    /* renamed from: g, reason: collision with root package name */
    private final long f4063g;

    /* renamed from: h, reason: collision with root package name */
    private final ao f4064h;

    /* renamed from: i, reason: collision with root package name */
    private final ac f4065i;

    /* synthetic */ u(long j2, Integer num, ab abVar, long j3, byte[] bArr, String str, long j4, ao aoVar, ac acVar) {
        this.f4057a = j2;
        this.f4058b = num;
        this.f4059c = abVar;
        this.f4060d = j3;
        this.f4061e = bArr;
        this.f4062f = str;
        this.f4063g = j4;
        this.f4064h = aoVar;
        this.f4065i = acVar;
    }

    @Override // com.google.android.datatransport.cct.a.ah
    public final long a() {
        return this.f4057a;
    }

    @Override // com.google.android.datatransport.cct.a.ah
    public final long b() {
        return this.f4060d;
    }

    @Override // com.google.android.datatransport.cct.a.ah
    public final long c() {
        return this.f4063g;
    }

    @Override // com.google.android.datatransport.cct.a.ah
    public final ab d() {
        return this.f4059c;
    }

    @Override // com.google.android.datatransport.cct.a.ah
    public final ac e() {
        return this.f4065i;
    }

    public final boolean equals(Object obj) {
        Integer num;
        ab abVar;
        String str;
        ao aoVar;
        ac acVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ah) {
            ah ahVar = (ah) obj;
            if (this.f4057a == ahVar.a() && ((num = this.f4058b) != null ? num.equals(ahVar.g()) : ahVar.g() == null) && ((abVar = this.f4059c) != null ? abVar.equals(ahVar.d()) : ahVar.d() == null) && this.f4060d == ahVar.b()) {
                if (Arrays.equals(this.f4061e, ahVar instanceof u ? ((u) ahVar).f4061e : ahVar.i()) && ((str = this.f4062f) != null ? str.equals(ahVar.h()) : ahVar.h() == null) && this.f4063g == ahVar.c() && ((aoVar = this.f4064h) != null ? aoVar.equals(ahVar.f()) : ahVar.f() == null) && ((acVar = this.f4065i) != null ? acVar.equals(ahVar.e()) : ahVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.a.ah
    public final ao f() {
        return this.f4064h;
    }

    @Override // com.google.android.datatransport.cct.a.ah
    public final Integer g() {
        return this.f4058b;
    }

    @Override // com.google.android.datatransport.cct.a.ah
    public final String h() {
        return this.f4062f;
    }

    public final int hashCode() {
        Integer num = this.f4058b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f4057a;
        ab abVar = this.f4059c;
        int iHashCode2 = abVar == null ? 0 : abVar.hashCode();
        long j3 = this.f4060d;
        int iHashCode3 = ((((((iHashCode ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ iHashCode2) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f4061e);
        String str = this.f4062f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j4 = this.f4063g;
        int i2 = ((((iHashCode3 * 1000003) ^ iHashCode4) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        ao aoVar = this.f4064h;
        int iHashCode5 = (i2 ^ (aoVar == null ? 0 : aoVar.hashCode())) * 1000003;
        ac acVar = this.f4065i;
        return iHashCode5 ^ (acVar != null ? acVar.hashCode() : 0);
    }

    @Override // com.google.android.datatransport.cct.a.ah
    public final byte[] i() {
        return this.f4061e;
    }

    public final String toString() {
        ac acVar = this.f4065i;
        ao aoVar = this.f4064h;
        byte[] bArr = this.f4061e;
        return "LogEvent{eventTimeMs=" + this.f4057a + ", eventCode=" + this.f4058b + ", complianceData=" + String.valueOf(this.f4059c) + ", eventUptimeMs=" + this.f4060d + ", sourceExtension=" + Arrays.toString(bArr) + ", sourceExtensionJsonProto3=" + this.f4062f + ", timezoneOffsetSeconds=" + this.f4063g + ", networkConnectionInfo=" + String.valueOf(aoVar) + ", experimentIds=" + String.valueOf(acVar) + "}";
    }
}
