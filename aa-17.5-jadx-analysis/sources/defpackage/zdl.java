package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;

/* loaded from: classes3.dex */
public final class zdl extends Number implements Comparable {
    private final long a;

    static {
        new zdl(0L);
        new zdl(1L);
        new zdl(-1L);
    }

    private zdl(long j) {
        this.a = j;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        zdl zdlVar = (zdl) obj;
        zdlVar.getClass();
        return Long.compare(this.a ^ Long.MIN_VALUE, zdlVar.a ^ Long.MIN_VALUE);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        long j = this.a;
        if (j >= 0) {
            return j;
        }
        return 1.8446744073709552E19d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zdl) && this.a == ((zdl) obj).a;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        long j = this.a;
        if (j >= 0) {
            return j;
        }
        return 1.8446744E19f;
    }

    public final int hashCode() {
        return a.g(this.a);
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.a;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.a;
    }

    public final String toString() {
        woy.Q(true, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", 10);
        long j = this.a;
        if (j == 0) {
            return CloudRecognizerProtocolStrings.DBG_VALUE;
        }
        if (j > 0) {
            return Long.toString(1L, 10);
        }
        long j2 = (j >>> 1) / 5;
        char[] cArr = new char[64];
        int i = 63;
        cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
        while (j2 > 0) {
            i--;
            cArr[i] = Character.forDigit((int) (j2 % 10), 10);
            j2 /= 10;
        }
        return new String(cArr, i, 64 - i);
    }
}
