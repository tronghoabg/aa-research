package z0;

import ff.v;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class b implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public final String f48269a;

    /* renamed from: b, reason: collision with root package name */
    public final List f48270b;

    /* renamed from: c, reason: collision with root package name */
    public final List f48271c;

    /* renamed from: d, reason: collision with root package name */
    public final List f48272d;

    public b(String text, List list, List list2, List list3) {
        AbstractC3340k.e(text, "text");
        this.f48269a = text;
        this.f48270b = list;
        this.f48271c = list2;
        this.f48272d = list3;
        int size = list2.size();
        int i5 = -1;
        int i10 = 0;
        while (i10 < size) {
            a aVar = (a) list2.get(i10);
            if (aVar.f48266b < i5) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
            int length = this.f48269a.length();
            int i11 = aVar.f48267c;
            if (i11 > length) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + aVar.f48266b + ", " + i11 + ") is out of boundary").toString());
            }
            i10++;
            i5 = i11;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i5) {
        return this.f48269a.charAt(i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC3340k.a(this.f48269a, bVar.f48269a) && AbstractC3340k.a(this.f48270b, bVar.f48270b) && AbstractC3340k.a(this.f48271c, bVar.f48271c) && AbstractC3340k.a(this.f48272d, bVar.f48272d);
    }

    public final int hashCode() {
        return this.f48272d.hashCode() + ((this.f48271c.hashCode() + ((this.f48270b.hashCode() + (this.f48269a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f48269a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i5, int i10) {
        if (i5 > i10) {
            throw new IllegalArgumentException(("start (" + i5 + ") should be less or equal to end (" + i10 + ')').toString());
        }
        String str = this.f48269a;
        if (i5 == 0 && i10 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i5, i10);
        AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new b(strSubstring, c.a(i5, i10, this.f48270b), c.a(i5, i10, this.f48271c), c.a(i5, i10, this.f48272d));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f48269a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(int i5, List spanStyles, String text) {
        int i10 = i5 & 2;
        v vVar = v.f35432a;
        spanStyles = i10 != 0 ? vVar : spanStyles;
        AbstractC3340k.e(text, "text");
        AbstractC3340k.e(spanStyles, "spanStyles");
        this(text, spanStyles, vVar, vVar);
    }
}
