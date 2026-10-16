package defpackage;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ajsj {
    public static final BitSet a;
    public static final BitSet b;
    public static final BitSet c;
    private static final BitSet d;
    private static final BitSet e;
    private static final BitSet f;
    private static final BitSet g;
    private static final BitSet h;
    private static final BitSet i;

    static {
        BitSet bitSet = new BitSet(256);
        d = bitSet;
        bitSet.set(47);
        e = new BitSet(256);
        f = new BitSet(256);
        a = new BitSet(256);
        b = new BitSet(256);
        c = new BitSet(256);
        g = new BitSet(256);
        h = new BitSet(256);
        i = new BitSet(256);
        for (int i2 = 97; i2 <= 122; i2++) {
            e.set(i2);
        }
        for (int i3 = 65; i3 <= 90; i3++) {
            e.set(i3);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            e.set(i4);
        }
        BitSet bitSet2 = e;
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
        BitSet bitSet3 = f;
        bitSet3.set(44);
        bitSet3.set(59);
        bitSet3.set(58);
        bitSet3.set(36);
        bitSet3.set(38);
        bitSet3.set(43);
        bitSet3.set(61);
        BitSet bitSet4 = a;
        bitSet4.or(bitSet2);
        bitSet4.or(bitSet3);
        BitSet bitSet5 = b;
        bitSet5.or(bitSet2);
        bitSet5.set(59);
        bitSet5.set(58);
        bitSet5.set(64);
        bitSet5.set(38);
        bitSet5.set(61);
        bitSet5.set(43);
        bitSet5.set(36);
        bitSet5.set(44);
        BitSet bitSet6 = i;
        bitSet6.or(bitSet5);
        bitSet6.set(47);
        BitSet bitSet7 = g;
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
        BitSet bitSet8 = c;
        bitSet8.or(bitSet7);
        bitSet8.or(bitSet2);
    }

    public static String a(String str, Charset charset, boolean z) {
        if (str == null) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str.length());
        CharBuffer charBufferWrap = CharBuffer.wrap(str);
        while (charBufferWrap.hasRemaining()) {
            char c2 = charBufferWrap.get();
            if (c2 == '%') {
                if (charBufferWrap.remaining() >= 2) {
                    char c3 = charBufferWrap.get();
                    char c4 = charBufferWrap.get();
                    int iDigit = Character.digit(c3, 16);
                    int iDigit2 = Character.digit(c4, 16);
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

    public static String b(String str, Charset charset, BitSet bitSet, boolean z) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ByteBuffer byteBufferEncode = charset.encode(str);
        while (byteBufferEncode.hasRemaining()) {
            byte b2 = byteBufferEncode.get();
            int i2 = b2 & 255;
            if (bitSet.get(i2)) {
                sb.append((char) i2);
            } else if (z && i2 == 32) {
                sb.append('+');
            } else {
                sb.append("%");
                char upperCase = Character.toUpperCase(Character.forDigit(i2 >> 4, 16));
                char upperCase2 = Character.toUpperCase(Character.forDigit(b2 & 15, 16));
                sb.append(upperCase);
                sb.append(upperCase2);
            }
        }
        return sb.toString();
    }

    public static List c(akbh akbhVar, Charset charset, char... cArr) {
        BitSet bitSet = new BitSet();
        for (char c2 : cArr) {
            bitSet.set(c2);
        }
        akao akaoVar = new akao(0, akbhVar.b);
        ArrayList arrayList = new ArrayList();
        while (!akaoVar.b()) {
            bitSet.set(61);
            String strD = akap.d(akbhVar, akaoVar, bitSet);
            String strD2 = null;
            if (!akaoVar.b()) {
                char cCharAt = akbhVar.charAt(akaoVar.b);
                akaoVar.a(akaoVar.b + 1);
                if (cCharAt == '=') {
                    bitSet.clear(61);
                    strD2 = akap.d(akbhVar, akaoVar, bitSet);
                    if (!akaoVar.b()) {
                        akaoVar.a(akaoVar.b + 1);
                    }
                }
            }
            if (!strD.isEmpty()) {
                arrayList.add(new akag(f(strD, charset), f(strD2, charset)));
            }
        }
        return arrayList;
    }

    static List d(CharSequence charSequence) {
        BitSet bitSet = d;
        akao akaoVar = new akao(0, charSequence.length());
        if (akaoVar.b()) {
            return Collections.EMPTY_LIST;
        }
        if (bitSet.get(charSequence.charAt(akaoVar.b))) {
            akaoVar.a(akaoVar.b + 1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        while (!akaoVar.b()) {
            char cCharAt = charSequence.charAt(akaoVar.b);
            if (bitSet.get(cCharAt)) {
                arrayList.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(cCharAt);
            }
            akaoVar.a(akaoVar.b + 1);
        }
        arrayList.add(sb.toString());
        return arrayList;
    }

    public static String e(Iterable iterable, Charset charset) {
        ahgm.e(iterable, "Parameters");
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ajpp ajppVar = (ajpp) it.next();
            String strG = g(ajppVar.b(), charset);
            String strG2 = g(ajppVar.c(), charset);
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

    private static String f(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = ajox.a;
        }
        return a(str, charset, true);
    }

    private static String g(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = ajox.a;
        }
        return b(str, charset, h, true);
    }
}
