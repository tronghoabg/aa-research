package q9;

import java.util.Arrays;
import s9.h;
import w9.AbstractC4397p;

/* renamed from: q9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3880a implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f44170a;

    /* renamed from: b, reason: collision with root package name */
    public final h f44171b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f44172c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f44173d;

    public C3880a(int i5, h hVar, byte[] bArr, byte[] bArr2) {
        this.f44170a = i5;
        if (hVar == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f44171b = hVar;
        if (bArr == null) {
            throw new NullPointerException("Null arrayValue");
        }
        this.f44172c = bArr;
        if (bArr2 == null) {
            throw new NullPointerException("Null directionalValue");
        }
        this.f44173d = bArr2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3880a c3880a = (C3880a) obj;
        int iCompare = Integer.compare(this.f44170a, c3880a.f44170a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = this.f44171b.compareTo(c3880a.f44171b);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iB = AbstractC4397p.b(this.f44172c, c3880a.f44172c);
        return iB != 0 ? iB : AbstractC4397p.b(this.f44173d, c3880a.f44173d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3880a) {
            C3880a c3880a = (C3880a) obj;
            if (this.f44170a == c3880a.f44170a && this.f44171b.equals(c3880a.f44171b) && Arrays.equals(this.f44172c, c3880a.f44172c) && Arrays.equals(this.f44173d, c3880a.f44173d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f44170a ^ 1000003) * 1000003) ^ this.f44171b.f45375a.hashCode()) * 1000003) ^ Arrays.hashCode(this.f44172c)) * 1000003) ^ Arrays.hashCode(this.f44173d);
    }

    public final String toString() {
        return "IndexEntry{indexId=" + this.f44170a + ", documentKey=" + this.f44171b + ", arrayValue=" + Arrays.toString(this.f44172c) + ", directionalValue=" + Arrays.toString(this.f44173d) + "}";
    }
}
