package t5;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: t5.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4113h {

    /* renamed from: a, reason: collision with root package name */
    public final String f45766a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f45767b;

    /* renamed from: c, reason: collision with root package name */
    public final C4117l f45768c;

    /* renamed from: d, reason: collision with root package name */
    public final long f45769d;

    /* renamed from: e, reason: collision with root package name */
    public final long f45770e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f45771f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f45772g;

    /* renamed from: h, reason: collision with root package name */
    public final String f45773h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f45774i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f45775j;

    public C4113h(String str, Integer num, C4117l c4117l, long j8, long j10, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f45766a = str;
        this.f45767b = num;
        this.f45768c = c4117l;
        this.f45769d = j8;
        this.f45770e = j10;
        this.f45771f = map;
        this.f45772g = num2;
        this.f45773h = str2;
        this.f45774i = bArr;
        this.f45775j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f45771f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f45771f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.bumptech.glide.f c() {
        com.bumptech.glide.f fVar = new com.bumptech.glide.f();
        String str = this.f45766a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        fVar.f24230a = str;
        fVar.f24231b = this.f45767b;
        fVar.f24236g = this.f45772g;
        fVar.f24237h = this.f45773h;
        fVar.f24238i = this.f45774i;
        fVar.f24239j = this.f45775j;
        C4117l c4117l = this.f45768c;
        if (c4117l == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        fVar.f24232c = c4117l;
        fVar.f24233d = Long.valueOf(this.f45769d);
        fVar.f24234e = Long.valueOf(this.f45770e);
        fVar.f24235f = new HashMap(this.f45771f);
        return fVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4113h)) {
            return false;
        }
        C4113h c4113h = (C4113h) obj;
        if (!this.f45766a.equals(c4113h.f45766a)) {
            return false;
        }
        Integer num = c4113h.f45767b;
        Integer num2 = this.f45767b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        if (!this.f45768c.equals(c4113h.f45768c) || this.f45769d != c4113h.f45769d || this.f45770e != c4113h.f45770e || !this.f45771f.equals(c4113h.f45771f)) {
            return false;
        }
        Integer num3 = c4113h.f45772g;
        Integer num4 = this.f45772g;
        if (num4 == null) {
            if (num3 != null) {
                return false;
            }
        } else if (!num4.equals(num3)) {
            return false;
        }
        String str = c4113h.f45773h;
        String str2 = this.f45773h;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return Arrays.equals(this.f45774i, c4113h.f45774i) && Arrays.equals(this.f45775j, c4113h.f45775j);
    }

    public final int hashCode() {
        int iHashCode = (this.f45766a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f45767b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f45768c.hashCode()) * 1000003;
        long j8 = this.f45769d;
        int i5 = (iHashCode2 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j10 = this.f45770e;
        int iHashCode3 = (((i5 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f45771f.hashCode()) * 1000003;
        Integer num2 = this.f45772g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f45773h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f45774i)) * 1000003) ^ Arrays.hashCode(this.f45775j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f45766a + ", code=" + this.f45767b + ", encodedPayload=" + this.f45768c + ", eventMillis=" + this.f45769d + ", uptimeMillis=" + this.f45770e + ", autoMetadata=" + this.f45771f + ", productId=" + this.f45772g + ", pseudonymousId=" + this.f45773h + ", experimentIdsClear=" + Arrays.toString(this.f45774i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f45775j) + "}";
    }
}
