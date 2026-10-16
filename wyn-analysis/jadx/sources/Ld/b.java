package Ld;

import ka.AbstractC3256n;

/* loaded from: classes5.dex */
public final class b implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public final int f7082a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7083b;

    /* renamed from: c, reason: collision with root package name */
    public String f7084c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f7085d;

    public b(c cVar, int i5, int i10) {
        this.f7085d = cVar;
        this.f7082a = i5;
        this.f7083b = i10;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i5) {
        int i10 = this.f7082a + i5;
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "index is negative: ").toString());
        }
        if (i10 < this.f7083b) {
            return this.f7085d.c(i10);
        }
        StringBuilder sbL = pd.f.l(i5, "index (", ") should be less than length (");
        sbL.append(length());
        sbL.append(')');
        throw new IllegalArgumentException(sbL.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence.length() == length()) {
                int length = length();
                c cVar = this.f7085d;
                for (int i5 = 0; i5 < length; i5++) {
                    if (cVar.c(this.f7082a + i5) != charSequence.charAt(i5)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7084c;
        if (str != null) {
            return str.hashCode();
        }
        c cVar = this.f7085d;
        int iC = 0;
        for (int i5 = this.f7082a; i5 < this.f7083b; i5++) {
            iC = (iC * 31) + cVar.c(i5);
        }
        return iC;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f7083b - this.f7082a;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i5, int i10) {
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "start is negative: ").toString());
        }
        if (i5 > i10) {
            throw new IllegalArgumentException(("start (" + i5 + ") should be less or equal to end (" + i10 + ')').toString());
        }
        int i11 = this.f7083b;
        int i12 = this.f7082a;
        if (i10 > i11 - i12) {
            throw new IllegalArgumentException(("end should be less than length (" + length() + ')').toString());
        }
        if (i5 == i10) {
            return "";
        }
        return new b(this.f7085d, i5 + i12, i12 + i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.f7084c;
        if (str != null) {
            return str;
        }
        String string = this.f7085d.b(this.f7082a, this.f7083b).toString();
        this.f7084c = string;
        return string;
    }
}
