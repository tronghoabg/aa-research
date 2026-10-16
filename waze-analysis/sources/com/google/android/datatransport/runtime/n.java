package com.google.android.datatransport.runtime;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final String f4213a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f4214b;

    /* renamed from: c, reason: collision with root package name */
    private final l f4215c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4216d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4217e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f4218f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f4219g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4220h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f4221i;

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f4222j;

    /* renamed from: k, reason: collision with root package name */
    private final List f4223k;

    /* renamed from: l, reason: collision with root package name */
    private final String f4224l;

    /* synthetic */ n(String str, Integer num, l lVar, long j2, long j3, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2, List list, String str3) {
        this.f4213a = str;
        this.f4214b = num;
        this.f4215c = lVar;
        this.f4216d = j2;
        this.f4217e = j3;
        this.f4218f = map;
        this.f4219g = num2;
        this.f4220h = str2;
        this.f4221i = bArr;
        this.f4222j = bArr2;
        this.f4223k = list;
        this.f4224l = str3;
    }

    public static m b() {
        m mVar = new m();
        mVar.f(new HashMap());
        return mVar;
    }

    public final int a(String str) {
        String str2 = (String) this.f4218f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final m c() {
        m mVar = new m();
        mVar.p(this.f4213a);
        mVar.g(this.f4214b);
        mVar.m(this.f4219g);
        mVar.n(this.f4220h);
        mVar.j(this.f4221i);
        mVar.k(this.f4222j);
        mVar.l(this.f4223k);
        mVar.o(this.f4224l);
        mVar.h(this.f4215c);
        mVar.i(this.f4216d);
        mVar.q(this.f4217e);
        mVar.f(new HashMap(this.f4218f));
        return mVar;
    }

    public final String d(String str) {
        String str2 = (String) this.f4218f.get(str);
        return str2 == null ? "" : str2;
    }

    public final Map e() {
        return DesugarCollections.unmodifiableMap(this.f4218f);
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        List list;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f4213a.equals(nVar.f4213a) && ((num = this.f4214b) != null ? num.equals(nVar.f4214b) : nVar.f4214b == null) && this.f4215c.equals(nVar.f4215c) && this.f4216d == nVar.f4216d && this.f4217e == nVar.f4217e && this.f4218f.equals(nVar.f4218f) && ((num2 = this.f4219g) != null ? num2.equals(nVar.f4219g) : nVar.f4219g == null) && ((str = this.f4220h) != null ? str.equals(nVar.f4220h) : nVar.f4220h == null)) {
                boolean z = nVar instanceof n;
                if (Arrays.equals(this.f4221i, z ? nVar.f4221i : nVar.f4221i)) {
                    if (Arrays.equals(this.f4222j, z ? nVar.f4222j : nVar.f4222j) && ((list = this.f4223k) != null ? list.equals(nVar.f4223k) : nVar.f4223k == null) && ((str2 = this.f4224l) != null ? str2.equals(nVar.f4224l) : nVar.f4224l == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final long f() {
        return this.f4216d;
    }

    public final long g() {
        return this.f4217e;
    }

    public final l h() {
        return this.f4215c;
    }

    public final int hashCode() {
        int iHashCode = this.f4213a.hashCode() ^ 1000003;
        Integer num = this.f4214b;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f4215c.hashCode()) * 1000003;
        long j2 = this.f4216d;
        int i2 = (iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f4217e;
        int iHashCode3 = (((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f4218f.hashCode()) * 1000003;
        Integer num2 = this.f4219g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f4220h;
        int iHashCode5 = (((((iHashCode4 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ Arrays.hashCode(this.f4221i)) * 1000003) ^ Arrays.hashCode(this.f4222j)) * 1000003;
        List list = this.f4223k;
        int iHashCode6 = (iHashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        String str2 = this.f4224l;
        return iHashCode6 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final Integer i() {
        return this.f4214b;
    }

    public final Integer j() {
        return this.f4219g;
    }

    public final String k() {
        return this.f4220h;
    }

    public final String l() {
        return this.f4224l;
    }

    public final String m() {
        return this.f4213a;
    }

    public final List n() {
        return this.f4223k;
    }

    public final byte[] o() {
        return this.f4221i;
    }

    public final byte[] p() {
        return this.f4222j;
    }

    public final long q() {
        String str = (String) this.f4218f.get("tz-offset");
        if (str == null) {
            return 0L;
        }
        return Long.valueOf(str).longValue();
    }

    public final String toString() {
        List list = this.f4223k;
        byte[] bArr = this.f4222j;
        byte[] bArr2 = this.f4221i;
        Map map = this.f4218f;
        return "EventInternal{transportName=" + this.f4213a + ", code=" + this.f4214b + ", encodedPayload=" + String.valueOf(this.f4215c) + ", eventMillis=" + this.f4216d + ", uptimeMillis=" + this.f4217e + ", autoMetadata=" + String.valueOf(map) + ", productId=" + this.f4219g + ", pseudonymousId=" + this.f4220h + ", experimentIdsClear=" + Arrays.toString(bArr2) + ", experimentIdsEncrypted=" + Arrays.toString(bArr) + ", experimentIdsEncryptedList=" + String.valueOf(list) + ", pseudonymousIdUpdateReceiverClassName=" + this.f4224l + "}";
    }

    public n() {
        throw null;
    }
}
