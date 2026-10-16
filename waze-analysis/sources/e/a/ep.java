package e.a;

import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.MalformedInputException;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ep {

    /* renamed from: a, reason: collision with root package name */
    static final BitSet f47443a = BitSet.valueOf(new long[]{287948901175001088L});

    /* renamed from: b, reason: collision with root package name */
    static final BitSet f47444b = BitSet.valueOf(new long[]{0, 576460743847706622L});

    /* renamed from: c, reason: collision with root package name */
    static final BitSet f47445c = BitSet.valueOf(new long[]{288063250384289792L, 576460743847706622L});

    /* renamed from: d, reason: collision with root package name */
    static final BitSet f47446d = BitSet.valueOf(new long[]{288054454291267584L, 5188146764422578174L});

    /* renamed from: e, reason: collision with root package name */
    static final BitSet f47447e;

    /* renamed from: f, reason: collision with root package name */
    static final BitSet f47448f;

    /* renamed from: g, reason: collision with root package name */
    static final BitSet f47449g;

    /* renamed from: h, reason: collision with root package name */
    static final BitSet f47450h;

    /* renamed from: i, reason: collision with root package name */
    static final BitSet f47451i;

    /* renamed from: j, reason: collision with root package name */
    static final BitSet f47452j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f47453k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final char[] f47454l;
    private final String m;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;

    static {
        BitSet.valueOf(new long[]{-8935000888854970368L, 671088641});
        BitSet.valueOf(new long[]{2882338748320710656L});
        BitSet.valueOf(new long[]{-6052662140534259712L, 671088641});
        f47447e = BitSet.valueOf(new long[]{3170393202611978240L, 5188146764422578174L});
        f47448f = BitSet.valueOf(new long[]{3458623578763689984L, 5188146764422578174L});
        f47449g = BitSet.valueOf(new long[]{3458623578763689984L, 5188146764422578175L});
        f47450h = BitSet.valueOf(new long[]{3458764316252045312L, 5188146764422578175L});
        BitSet bitSetValueOf = BitSet.valueOf(new long[]{-5764607720602730496L, 5188146764422578175L});
        f47451i = bitSetValueOf;
        f47452j = bitSetValueOf;
        f47454l = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    /* synthetic */ ep(eo eoVar) {
        String str = eoVar.f47436a;
        com.google.d.b.an.C(str, "scheme");
        this.m = str;
        this.n = eoVar.f47440e;
        this.o = eoVar.f47441f;
        this.p = eoVar.f47442g;
        String str2 = eoVar.f47437b;
        this.q = str2;
        this.r = eoVar.f47438c;
        this.s = eoVar.f47439d;
        if (!o()) {
            if (str2.startsWith("//")) {
                throw new IllegalArgumentException("No authority -- Path cannot start with '//'");
            }
        } else if (!str2.isEmpty() && !str2.startsWith(DomExceptionUtils.SEPARATOR)) {
            throw new IllegalArgumentException("Has authority -- Non-empty path must start with '/'");
        }
    }

    public static eo a() {
        return new eo();
    }

    public static ep b(String str) throws CharacterCodingException, NumberFormatException {
        eo eoVar = new eo();
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == ':') {
                break;
            }
            if (cCharAt == '/' || cCharAt == '?' || cCharAt == '#') {
                break;
            }
            i2++;
        }
        i2 = -1;
        if (i2 < 0) {
            throw new IllegalArgumentException("Missing required scheme.");
        }
        eoVar.q(str.substring(0, i2));
        int i3 = i2 + 1;
        int i4 = i2 + 2;
        if (i4 < length && str.charAt(i3) == '/' && str.charAt(i4) == '/') {
            int i5 = i2 + 3;
            i3 = i5;
            while (i3 < length) {
                char cCharAt2 = str.charAt(i3);
                if (cCharAt2 == '/' || cCharAt2 == '?' || cCharAt2 == '#') {
                    break;
                }
                i3++;
            }
            eoVar.l(str.substring(i5, i3));
        }
        int i6 = i3;
        while (i6 < length) {
            char cCharAt3 = str.charAt(i6);
            if (cCharAt3 == '?' || cCharAt3 == '#') {
                break;
            }
            i6++;
        }
        eoVar.o(str.substring(i3, i6));
        if (i6 < length && str.charAt(i6) == '?') {
            int i7 = i6 + 1;
            int i8 = i7;
            while (i8 < length && str.charAt(i8) != '#') {
                i8++;
            }
            eoVar.p(str.substring(i7, i8));
            i6 = i8;
        }
        if (i6 < length && str.charAt(i6) == '#') {
            eoVar.m(str.substring(i6 + 1));
        }
        return eoVar.a();
    }

    private static String i(String str) throws CharacterCodingException {
        if (str == null || str.indexOf(37) == -1) {
            return str;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str.length());
        n(str, "input", null, byteBufferAllocate);
        byteBufferAllocate.flip();
        try {
            return StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(byteBufferAllocate).toString();
        } catch (CharacterCodingException e2) {
            throw new com.google.d.b.ar(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String j(String str, BitSet bitSet) throws CharacterCodingException {
        if (str == null) {
            return null;
        }
        try {
            ByteBuffer byteBufferEncode = StandardCharsets.UTF_8.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(str));
            StringBuilder sb = new StringBuilder();
            while (byteBufferEncode.hasRemaining()) {
                byte b2 = byteBufferEncode.get();
                int i2 = b2 & 255;
                if (bitSet.get(i2)) {
                    sb.append((char) i2);
                } else {
                    sb.append('%');
                    char[] cArr = f47454l;
                    sb.append(cArr[(b2 & 240) >> 4]);
                    sb.append(cArr[b2 & StylePropertiesKt.RightId]);
                }
            }
            return sb.toString();
        } catch (MalformedInputException e2) {
            throw new IllegalArgumentException("Malformed input", e2);
        } catch (CharacterCodingException e3) {
            throw new com.google.d.b.ar(e3);
        }
    }

    private final void k(StringBuilder sb) {
        String str = this.n;
        if (str != null) {
            sb.append(str);
            sb.append('@');
        }
        String str2 = this.o;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.p;
        if (str3 != null) {
            sb.append(':');
            sb.append(str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(String str, String str2, BitSet bitSet) {
        n(str, str2, bitSet, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(String str, com.google.d.d.bi biVar) throws CharacterCodingException {
        String strSubstring;
        int length;
        int iStartsWith = str.startsWith(DomExceptionUtils.SEPARATOR);
        while (iStartsWith < str.length()) {
            int iIndexOf = str.indexOf(47, iStartsWith);
            if (iIndexOf >= 0) {
                strSubstring = str.substring(iStartsWith, iIndexOf);
                length = iIndexOf + 1;
            } else {
                strSubstring = str.substring(iStartsWith);
                length = str.length();
            }
            if (biVar != null) {
                biVar.g(i(strSubstring));
            } else {
                l(strSubstring, "path segment", f47449g);
            }
            iStartsWith = length;
        }
        if (!str.endsWith(DomExceptionUtils.SEPARATOR) || biVar == null) {
            return;
        }
        biVar.g("");
    }

    private static void n(CharSequence charSequence, String str, BitSet bitSet, ByteBuffer byteBuffer) {
        int i2 = 0;
        while (i2 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt == '%') {
                int i3 = i2 + 2;
                if (i3 >= charSequence.length()) {
                    throw new IllegalArgumentException("Invalid percent-encoding at index " + i2 + " of " + str + ": " + String.valueOf(charSequence));
                }
                int iDigit = Character.digit(charSequence.charAt(i2 + 1), 16);
                int iDigit2 = Character.digit(charSequence.charAt(i3), 16);
                if (iDigit == -1 || iDigit2 == -1) {
                    throw new IllegalArgumentException("Invalid hex digit in " + str + " at index " + i2 + " of: " + String.valueOf(charSequence));
                }
                if (byteBuffer != null) {
                    byteBuffer.put((byte) ((iDigit << 4) | iDigit2));
                }
                i2 = i3;
            } else {
                if (bitSet != null && !bitSet.get(cCharAt)) {
                    throw new IllegalArgumentException("Invalid character in " + str + " at index " + i2);
                }
                if (byteBuffer != null) {
                    byteBuffer.put((byte) cCharAt);
                }
            }
            i2++;
        }
    }

    private final boolean o() {
        return this.o != null;
    }

    public final String d() {
        return this.m;
    }

    public final List e() throws CharacterCodingException {
        int i2 = com.google.d.d.bn.f7456d;
        com.google.d.d.bi biVar = new com.google.d.d.bi();
        m(this.q, biVar);
        return biVar.f();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ep)) {
            return false;
        }
        ep epVar = (ep) obj;
        return Objects.equals(this.m, epVar.m) && Objects.equals(this.n, epVar.n) && Objects.equals(this.o, epVar.o) && Objects.equals(this.p, epVar.p) && Objects.equals(this.q, epVar.q) && Objects.equals(this.r, epVar.r) && Objects.equals(this.s, epVar.s);
    }

    public final void h() throws CharacterCodingException {
        String string;
        if (o()) {
            StringBuilder sb = new StringBuilder();
            k(sb);
            string = sb.toString();
        } else {
            string = null;
        }
        i(string);
    }

    public final int hashCode() {
        return Objects.hash(this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.m);
        sb.append(':');
        if (o()) {
            sb.append("//");
            k(sb);
        }
        sb.append(this.q);
        String str = this.r;
        if (str != null) {
            sb.append('?');
            sb.append(str);
        }
        String str2 = this.s;
        if (str2 != null) {
            sb.append('#');
            sb.append(str2);
        }
        return sb.toString();
    }
}
