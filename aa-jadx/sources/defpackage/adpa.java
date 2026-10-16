package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adpa {
    public static final java.util.BitSet a = java.util.BitSet.valueOf(new long[]{287948901175001088L});
    public static final java.util.BitSet b = java.util.BitSet.valueOf(new long[]{0, 576460743847706622L});
    public static final java.util.BitSet c = java.util.BitSet.valueOf(new long[]{288063250384289792L, 576460743847706622L});
    public static final java.util.BitSet d = java.util.BitSet.valueOf(new long[]{288054454291267584L, 5188146764422578174L});
    public static final java.util.BitSet e;
    public static final java.util.BitSet f;
    static final java.util.BitSet g;
    public static final java.util.BitSet h;
    public static final java.util.BitSet i;
    public static final java.util.BitSet j;
    private static final char[] m;
    public final java.lang.String k;
    public final java.lang.String l;
    private final java.lang.String n;
    private final java.lang.String o;
    private final java.lang.String p;
    private final java.lang.String q;
    private final java.lang.String r;

    static {
        java.util.BitSet.valueOf(new long[]{-8935000888854970368L, 671088641});
        java.util.BitSet.valueOf(new long[]{2882338748320710656L});
        java.util.BitSet.valueOf(new long[]{-6052662140534259712L, 671088641});
        e = java.util.BitSet.valueOf(new long[]{3170393202611978240L, 5188146764422578174L});
        f = java.util.BitSet.valueOf(new long[]{3458623578763689984L, 5188146764422578174L});
        g = java.util.BitSet.valueOf(new long[]{3458623578763689984L, 5188146764422578175L});
        h = java.util.BitSet.valueOf(new long[]{3458764316252045312L, 5188146764422578175L});
        java.util.BitSet bitSetValueOf = java.util.BitSet.valueOf(new long[]{-5764607720602730496L, 5188146764422578175L});
        i = bitSetValueOf;
        j = bitSetValueOf;
        m = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public adpa(defpackage.tk tkVar) {
        java.lang.Object obj = tkVar.g;
        obj.getClass();
        this.k = (java.lang.String) obj;
        this.n = (java.lang.String) tkVar.f;
        this.o = (java.lang.String) tkVar.d;
        this.p = (java.lang.String) tkVar.a;
        java.lang.String str = (java.lang.String) tkVar.b;
        this.l = str;
        this.q = (java.lang.String) tkVar.c;
        this.r = (java.lang.String) tkVar.e;
        if (!f()) {
            if (str.startsWith("//")) {
                throw new java.lang.IllegalArgumentException("No authority -- Path cannot start with '//'");
            }
        } else if (!str.isEmpty() && !str.startsWith("/")) {
            throw new java.lang.IllegalArgumentException("Has authority -- Non-empty path must start with '/'");
        }
    }

    public static java.lang.String a(java.lang.String str) {
        if (str == null || str.indexOf(37) == -1) {
            return str;
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(str.length());
        e(str, "input", null, byteBufferAllocate);
        byteBufferAllocate.flip();
        try {
            return java.nio.charset.StandardCharsets.UTF_8.newDecoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPLACE).onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPLACE).decode(byteBufferAllocate).toString();
        } catch (java.nio.charset.CharacterCodingException e2) {
            throw new defpackage.xzp(e2);
        }
    }

    public static java.lang.String b(java.lang.String str, java.util.BitSet bitSet) {
        if (str == null) {
            return null;
        }
        try {
            java.nio.ByteBuffer byteBufferEncode = java.nio.charset.StandardCharsets.UTF_8.newEncoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPORT).onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPORT).encode(java.nio.CharBuffer.wrap(str));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            while (byteBufferEncode.hasRemaining()) {
                byte b2 = byteBufferEncode.get();
                int i2 = b2 & 255;
                if (bitSet.get(i2)) {
                    sb.append((char) i2);
                } else {
                    sb.append('%');
                    char[] cArr = m;
                    sb.append(cArr[(b2 & 240) >> 4]);
                    sb.append(cArr[b2 & 15]);
                }
            }
            return sb.toString();
        } catch (java.nio.charset.MalformedInputException e2) {
            throw new java.lang.IllegalArgumentException("Malformed input", e2);
        } catch (java.nio.charset.CharacterCodingException e3) {
            throw new defpackage.xzp(e3);
        }
    }

    public static void d(java.lang.String str, defpackage.ygr ygrVar) {
        java.lang.String strSubstring;
        int length;
        int iStartsWith = str.startsWith("/");
        while (iStartsWith < str.length()) {
            int iIndexOf = str.indexOf(47, iStartsWith);
            if (iIndexOf >= 0) {
                strSubstring = str.substring(iStartsWith, iIndexOf);
                length = iIndexOf + 1;
            } else {
                strSubstring = str.substring(iStartsWith);
                length = str.length();
            }
            if (ygrVar != null) {
                ygrVar.i(a(strSubstring));
            } else {
                e(strSubstring, "path segment", g, null);
            }
            iStartsWith = length;
        }
        if (!str.endsWith("/") || ygrVar == null) {
            return;
        }
        ygrVar.i("");
    }

    public static void e(java.lang.CharSequence charSequence, java.lang.String str, java.util.BitSet bitSet, java.nio.ByteBuffer byteBuffer) {
        int i2 = 0;
        while (i2 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt == '%') {
                int i3 = i2 + 2;
                if (i3 >= charSequence.length()) {
                    throw new java.lang.IllegalArgumentException("Invalid percent-encoding at index " + i2 + " of " + str + ": " + java.lang.String.valueOf(charSequence));
                }
                int iDigit = java.lang.Character.digit(charSequence.charAt(i2 + 1), 16);
                int iDigit2 = java.lang.Character.digit(charSequence.charAt(i3), 16);
                if (iDigit == -1 || iDigit2 == -1) {
                    throw new java.lang.IllegalArgumentException("Invalid hex digit in " + str + " at index " + i2 + " of: " + java.lang.String.valueOf(charSequence));
                }
                if (byteBuffer != null) {
                    byteBuffer.put((byte) ((iDigit << 4) | iDigit2));
                }
                i2 = i3;
            } else {
                if (bitSet != null && !bitSet.get(cCharAt)) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.by(i2, str, "Invalid character in ", " at index "));
                }
                if (byteBuffer != null) {
                    byteBuffer.put((byte) cCharAt);
                }
            }
            i2++;
        }
    }

    public final void c(java.lang.StringBuilder sb) {
        java.lang.String str = this.n;
        if (str != null) {
            sb.append(str);
            sb.append('@');
        }
        java.lang.String str2 = this.o;
        if (str2 != null) {
            sb.append(str2);
        }
        java.lang.String str3 = this.p;
        if (str3 != null) {
            sb.append(':');
            sb.append(str3);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.adpa)) {
            return false;
        }
        defpackage.adpa adpaVar = (defpackage.adpa) obj;
        return j$.util.Objects.equals(this.k, adpaVar.k) && j$.util.Objects.equals(this.n, adpaVar.n) && j$.util.Objects.equals(this.o, adpaVar.o) && j$.util.Objects.equals(this.p, adpaVar.p) && j$.util.Objects.equals(this.l, adpaVar.l) && j$.util.Objects.equals(this.q, adpaVar.q) && j$.util.Objects.equals(this.r, adpaVar.r);
    }

    public final boolean f() {
        return this.o != null;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.k, this.n, this.o, this.p, this.l, this.q, this.r);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.k);
        sb.append(':');
        if (f()) {
            sb.append("//");
            c(sb);
        }
        sb.append(this.l);
        java.lang.String str = this.q;
        if (str != null) {
            sb.append('?');
            sb.append(str);
        }
        java.lang.String str2 = this.r;
        if (str2 != null) {
            sb.append('#');
            sb.append(str2);
        }
        return sb.toString();
    }
}
