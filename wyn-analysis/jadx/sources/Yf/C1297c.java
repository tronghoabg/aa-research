package Yf;

/* renamed from: Yf.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1297c implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public final char[] f16851a;

    /* renamed from: b, reason: collision with root package name */
    public int f16852b;

    public C1297c(char[] cArr) {
        this.f16851a = cArr;
        this.f16852b = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i5) {
        return this.f16851a[i5];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f16852b;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i5, int i10) {
        return Bf.r.Z(this.f16851a, i5, Math.min(i10, this.f16852b));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i5 = this.f16852b;
        return Bf.r.Z(this.f16851a, 0, Math.min(i5, i5));
    }
}
