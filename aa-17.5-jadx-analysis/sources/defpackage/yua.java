package defpackage;

/* loaded from: classes3.dex */
public final class yua implements CharSequence {
    public final String a;
    public final int b;
    public final int c;
    private final int d;
    private String e;

    public yua(String str, int i, int i2, int i3) {
        this.a = str;
        this.b = i;
        int i4 = i + i2;
        this.c = i4;
        this.d = i3;
        woy.ab(i >= 0, "Invalid index: %s", i);
        woy.ab(i2 >= 0, "Invalid length: %s", i2);
        woy.ab(i4 <= str.length(), "Invalid endIndex: %s", i4);
        woy.ab(i3 >= i4, "Invalid repetitionStartIndex: %s", i3);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.bn(i, "Invalid index (", ") < 0"));
        }
        if (i < length()) {
            return this.a.charAt(this.b + i);
        }
        throw new IndexOutOfBoundsException("Invalid index (" + i + ") >= length (" + length() + ")");
    }

    public final boolean isEmpty() {
        return length() == 0;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.c - this.b;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.bn(i, "Invalid index: begin (", ") < 0"));
        }
        if (i2 <= length()) {
            if (i > i2) {
                throw new IndexOutOfBoundsException(a.bB(i2, i, "Invalid index: begin (", ") > end (", ")"));
            }
            return new yua(this.a, this.b + i, i2 - i, this.d);
        }
        throw new IndexOutOfBoundsException("Invalid index: end (" + i2 + ") > length (" + length() + ")");
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String strSubstring = this.a.substring(this.b, this.c);
        this.e = strSubstring;
        return strSubstring;
    }
}
