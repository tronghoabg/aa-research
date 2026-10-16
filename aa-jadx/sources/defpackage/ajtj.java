package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajtj {
    public static final java.util.BitSet a;
    public static final java.util.BitSet b;
    public static final java.util.BitSet c;
    private static final java.util.BitSet d;
    private static final java.util.BitSet e;
    private static final java.util.BitSet f;
    private static final java.util.BitSet g;
    private static final java.util.BitSet h;
    private static final java.util.BitSet i;

    static {
        java.util.BitSet bitSet = new java.util.BitSet(256);
        d = bitSet;
        bitSet.set(47);
        e = new java.util.BitSet(256);
        f = new java.util.BitSet(256);
        a = new java.util.BitSet(256);
        b = new java.util.BitSet(256);
        c = new java.util.BitSet(256);
        g = new java.util.BitSet(256);
        h = new java.util.BitSet(256);
        i = new java.util.BitSet(256);
        for (int i2 = 97; i2 <= 122; i2++) {
            e.set(i2);
        }
        for (int i3 = 65; i3 <= 90; i3++) {
            e.set(i3);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            e.set(i4);
        }
        java.util.BitSet bitSet2 = e;
        bitSet2.set(95);
        bitSet2.set(45);
        bitSet2.set(46);
        bitSet2.set(42);
        h.or(bitSet2);
        bitSet2.set(33);
        bitSet2.set(126);
        bitSet2.set(39);
        bitSet2.set(40);
        bitSet2.set(41);
        java.util.BitSet bitSet3 = f;
        bitSet3.set(44);
        bitSet3.set(59);
        bitSet3.set(58);
        bitSet3.set(36);
        bitSet3.set(38);
        bitSet3.set(43);
        bitSet3.set(61);
        java.util.BitSet bitSet4 = a;
        bitSet4.or(bitSet2);
        bitSet4.or(bitSet3);
        java.util.BitSet bitSet5 = b;
        bitSet5.or(bitSet2);
        bitSet5.set(59);
        bitSet5.set(58);
        bitSet5.set(64);
        bitSet5.set(38);
        bitSet5.set(61);
        bitSet5.set(43);
        bitSet5.set(36);
        bitSet5.set(44);
        java.util.BitSet bitSet6 = i;
        bitSet6.or(bitSet5);
        bitSet6.set(47);
        java.util.BitSet bitSet7 = g;
        bitSet7.set(59);
        bitSet7.set(47);
        bitSet7.set(63);
        bitSet7.set(58);
        bitSet7.set(64);
        bitSet7.set(38);
        bitSet7.set(61);
        bitSet7.set(43);
        bitSet7.set(36);
        bitSet7.set(44);
        bitSet7.set(91);
        bitSet7.set(93);
        java.util.BitSet bitSet8 = c;
        bitSet8.or(bitSet7);
        bitSet8.or(bitSet2);
    }

    public static java.lang.String a(java.lang.String str, java.nio.charset.Charset charset, boolean z) {
        if (str == null) {
            return null;
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(str.length());
        java.nio.CharBuffer charBufferWrap = java.nio.CharBuffer.wrap(str);
        while (charBufferWrap.hasRemaining()) {
            char c2 = charBufferWrap.get();
            if (c2 == '%') {
                if (charBufferWrap.remaining() >= 2) {
                    char c3 = charBufferWrap.get();
                    char c4 = charBufferWrap.get();
                    int iDigit = java.lang.Character.digit(c3, 16);
                    int iDigit2 = java.lang.Character.digit(c4, 16);
                    if (iDigit == -1 || iDigit2 == -1) {
                        byteBufferAllocate.put((byte) 37);
                        byteBufferAllocate.put((byte) c3);
                        byteBufferAllocate.put((byte) c4);
                    } else {
                        byteBufferAllocate.put((byte) ((iDigit << 4) + iDigit2));
                    }
                } else {
                    c2 = '%';
                }
            }
            if (z && c2 == '+') {
                byteBufferAllocate.put((byte) 32);
            } else {
                byteBufferAllocate.put((byte) c2);
            }
        }
        return charset.decode(byteBufferAllocate).toString();
    }

    public static java.lang.String b(java.lang.String str, java.nio.charset.Charset charset, java.util.BitSet bitSet, boolean z) {
        if (str == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.nio.ByteBuffer byteBufferEncode = charset.encode(str);
        while (byteBufferEncode.hasRemaining()) {
            byte b2 = byteBufferEncode.get();
            int i2 = b2 & 255;
            if (bitSet.get(i2)) {
                sb.append((char) i2);
            } else if (z && i2 == 32) {
                sb.append('+');
            } else {
                sb.append("%");
                char upperCase = java.lang.Character.toUpperCase(java.lang.Character.forDigit(i2 >> 4, 16));
                char upperCase2 = java.lang.Character.toUpperCase(java.lang.Character.forDigit(b2 & 15, 16));
                sb.append(upperCase);
                sb.append(upperCase2);
            }
        }
        return sb.toString();
    }

    public static java.util.List c(defpackage.akch akchVar, java.nio.charset.Charset charset, char... cArr) {
        java.util.BitSet bitSet = new java.util.BitSet();
        for (char c2 : cArr) {
            bitSet.set(c2);
        }
        defpackage.akbo akboVar = new defpackage.akbo(0, akchVar.b);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!akboVar.b()) {
            bitSet.set(61);
            java.lang.String strD = defpackage.akbp.d(akchVar, akboVar, bitSet);
            java.lang.String strD2 = null;
            if (!akboVar.b()) {
                char cCharAt = akchVar.charAt(akboVar.b);
                akboVar.a(akboVar.b + 1);
                if (cCharAt == '=') {
                    bitSet.clear(61);
                    strD2 = defpackage.akbp.d(akchVar, akboVar, bitSet);
                    if (!akboVar.b()) {
                        akboVar.a(akboVar.b + 1);
                    }
                }
            }
            if (!strD.isEmpty()) {
                arrayList.add(new defpackage.akbg(f(strD, charset), f(strD2, charset)));
            }
        }
        return arrayList;
    }

    static java.util.List d(java.lang.CharSequence charSequence) {
        java.util.BitSet bitSet = d;
        defpackage.akbo akboVar = new defpackage.akbo(0, charSequence.length());
        if (akboVar.b()) {
            return java.util.Collections.EMPTY_LIST;
        }
        if (bitSet.get(charSequence.charAt(akboVar.b))) {
            akboVar.a(akboVar.b + 1);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (!akboVar.b()) {
            char cCharAt = charSequence.charAt(akboVar.b);
            if (bitSet.get(cCharAt)) {
                arrayList.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(cCharAt);
            }
            akboVar.a(akboVar.b + 1);
        }
        arrayList.add(sb.toString());
        return arrayList;
    }

    public static java.lang.String e(java.lang.Iterable iterable, java.nio.charset.Charset charset) {
        defpackage.aguw.e(iterable, "Parameters");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            defpackage.ajqp ajqpVar = (defpackage.ajqp) it.next();
            java.lang.String strG = g(ajqpVar.b(), charset);
            java.lang.String strG2 = g(ajqpVar.c(), charset);
            if (sb.length() > 0) {
                sb.append('&');
            }
            sb.append(strG);
            if (strG2 != null) {
                sb.append("=");
                sb.append(strG2);
            }
        }
        return sb.toString();
    }

    private static java.lang.String f(java.lang.String str, java.nio.charset.Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = defpackage.ajpx.a;
        }
        return a(str, charset, true);
    }

    private static java.lang.String g(java.lang.String str, java.nio.charset.Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = defpackage.ajpx.a;
        }
        return b(str, charset, h, true);
    }
}
