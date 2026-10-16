package com.google.firebase.installations.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f10016a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10017b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10018c;

    /* renamed from: d, reason: collision with root package name */
    private final f f10019d;

    /* renamed from: e, reason: collision with root package name */
    private final int f10020e;

    /* synthetic */ c(String str, String str2, String str3, f fVar, int i2) {
        this.f10016a = str;
        this.f10017b = str2;
        this.f10018c = str3;
        this.f10019d = fVar;
        this.f10020e = i2;
    }

    public final f a() {
        return this.f10019d;
    }

    public final String b() {
        return this.f10017b;
    }

    public final String c() {
        return this.f10018c;
    }

    public final int d() {
        return this.f10020e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = this.f10016a;
            if (str != null ? str.equals(cVar.f10016a) : cVar.f10016a == null) {
                String str2 = this.f10017b;
                if (str2 != null ? str2.equals(cVar.f10017b) : cVar.f10017b == null) {
                    String str3 = this.f10018c;
                    if (str3 != null ? str3.equals(cVar.f10018c) : cVar.f10018c == null) {
                        f fVar = this.f10019d;
                        if (fVar != null ? fVar.equals(cVar.f10019d) : cVar.f10019d == null) {
                            int i2 = this.f10020e;
                            if (i2 != 0 ? i2 == cVar.f10020e : cVar.f10020e == 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10016a;
        int i2 = 0;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f10017b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i3 = iHashCode ^ 1000003;
        String str3 = this.f10018c;
        int iHashCode3 = ((((i3 * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f10019d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        int i4 = this.f10020e;
        if (i4 != 0) {
            a.a.L(i4);
            i2 = i4;
        }
        return iHashCode4 ^ i2;
    }

    public final String toString() {
        int i2 = this.f10020e;
        String strValueOf = String.valueOf(this.f10019d);
        String str = i2 != 1 ? i2 != 2 ? "null" : "BAD_CONFIG" : "OK";
        String str2 = this.f10018c;
        String str3 = this.f10017b;
        return "InstallationResponse{uri=" + this.f10016a + ", fid=" + str3 + ", refreshToken=" + str2 + ", authToken=" + strValueOf + ", responseCode=" + str + "}";
    }

    public c() {
        throw null;
    }
}
