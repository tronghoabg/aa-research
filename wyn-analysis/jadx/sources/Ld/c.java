package Ld;

import Va.M6;
import java.util.ArrayList;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class c implements CharSequence, Appendable {

    /* renamed from: a, reason: collision with root package name */
    public final Wd.d f7086a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f7087b;

    /* renamed from: c, reason: collision with root package name */
    public char[] f7088c;

    /* renamed from: d, reason: collision with root package name */
    public String f7089d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7090e;

    /* renamed from: f, reason: collision with root package name */
    public int f7091f;

    /* renamed from: g, reason: collision with root package name */
    public int f7092g;

    public c() {
        Wd.d pool = e.f7093a;
        AbstractC3340k.e(pool, "pool");
        this.f7086a = pool;
    }

    public final char[] a(int i5) {
        ArrayList arrayList = this.f7087b;
        if (arrayList != null) {
            char[] cArr = this.f7088c;
            AbstractC3340k.b(cArr);
            return (char[]) arrayList.get(i5 / cArr.length);
        }
        if (i5 >= 2048) {
            e(i5);
            throw null;
        }
        char[] cArr2 = this.f7088c;
        if (cArr2 != null) {
            return cArr2;
        }
        e(i5);
        throw null;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) {
        char[] cArrD = d();
        char[] cArr = this.f7088c;
        AbstractC3340k.b(cArr);
        int length = cArr.length;
        int i5 = this.f7091f;
        cArrD[length - i5] = c10;
        this.f7089d = null;
        this.f7091f = i5 - 1;
        this.f7092g++;
        return this;
    }

    public final CharSequence b(int i5, int i10) {
        if (i5 == i10) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i10 - i5);
        for (int i11 = i5 - (i5 % 2048); i11 < i10; i11 += 2048) {
            char[] cArrA = a(i11);
            int iMin = Math.min(i10 - i11, 2048);
            for (int iMax = Math.max(0, i5 - i11); iMax < iMin; iMax++) {
                sb2.append(cArrA[iMax]);
            }
        }
        return sb2;
    }

    public final char c(int i5) {
        char[] cArrA = a(i5);
        char[] cArr = this.f7088c;
        AbstractC3340k.b(cArr);
        return cArrA[i5 % cArr.length];
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "index is negative: ").toString());
        }
        if (i5 < this.f7092g) {
            return c(i5);
        }
        throw new IllegalArgumentException(M6.r(pd.f.l(i5, "index ", " is not in range [0, "), this.f7092g, ')').toString());
    }

    public final char[] d() {
        if (this.f7091f != 0) {
            char[] cArr = this.f7088c;
            AbstractC3340k.b(cArr);
            return cArr;
        }
        char[] cArr2 = (char[]) this.f7086a.C();
        char[] cArr3 = this.f7088c;
        this.f7088c = cArr2;
        this.f7091f = cArr2.length;
        this.f7090e = false;
        if (cArr3 != null) {
            ArrayList arrayList = this.f7087b;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f7087b = arrayList;
                arrayList.add(cArr3);
            }
            arrayList.add(cArr2);
        }
        return cArr2;
    }

    public final void e(int i5) {
        if (this.f7090e) {
            throw new IllegalStateException("Buffer is already released");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i5);
        sb2.append(" is not in range [0; ");
        char[] cArr = this.f7088c;
        AbstractC3340k.b(cArr);
        sb2.append(cArr.length - this.f7091f);
        sb2.append(')');
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (this.f7092g == charSequence.length()) {
                int i5 = this.f7092g;
                for (int i10 = 0; i10 < i5; i10++) {
                    if (c(i10) != charSequence.charAt(i10)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7089d;
        if (str != null) {
            return str.hashCode();
        }
        int i5 = this.f7092g;
        int iC = 0;
        for (int i10 = 0; i10 < i5; i10++) {
            iC = (iC * 31) + c(i10);
        }
        return iC;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f7092g;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i5, int i10) {
        if (i5 <= i10) {
            if (i5 < 0) {
                throw new IllegalArgumentException(AbstractC3256n.g(i5, "startIndex is negative: ").toString());
            }
            if (i10 <= this.f7092g) {
                return new b(this, i5, i10);
            }
            throw new IllegalArgumentException(M6.r(pd.f.l(i10, "endIndex (", ") is greater than length ("), this.f7092g, ')').toString());
        }
        throw new IllegalArgumentException(("startIndex (" + i5 + ") should be less or equal to endIndex (" + i10 + ')').toString());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.f7089d;
        if (str != null) {
            return str;
        }
        String string = b(0, this.f7092g).toString();
        this.f7089d = string;
        return string;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i5, int i10) {
        if (charSequence == null) {
            return this;
        }
        int i11 = i5;
        while (i11 < i10) {
            char[] cArrD = d();
            int length = cArrD.length;
            int i12 = this.f7091f;
            int i13 = length - i12;
            int iMin = Math.min(i10 - i11, i12);
            for (int i14 = 0; i14 < iMin; i14++) {
                cArrD[i13 + i14] = charSequence.charAt(i11 + i14);
            }
            i11 += iMin;
            this.f7091f -= iMin;
        }
        this.f7089d = null;
        this.f7092g = (i10 - i5) + this.f7092g;
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }
}
