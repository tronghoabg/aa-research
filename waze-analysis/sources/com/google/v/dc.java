package com.google.v;

import androidx.compose.foundation.style.StylePropertiesKt;
import com.google.v.fi;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class dc<ContainingType extends fi, Type> {
    public dc() {
    }

    private static int A(byte b2) {
        return b2 & 63;
    }

    private static boolean B(byte b2) {
        return b2 > -65;
    }

    public static v a(ae aeVar, byte[] bArr) {
        aeVar.ad();
        return new u(bArr);
    }

    static dh b(Object obj) {
        return ((dq) obj).extensions;
    }

    static dh c(Object obj) {
        return ((dq) obj).ensureExtensionsAreMutable();
    }

    static void d(aa aaVar, Object obj, de deVar, dh dhVar) {
        ds dsVar = (ds) obj;
        dhVar.n(dsVar.f12878d, aaVar.s(dsVar.f12877c.getClass(), deVar));
    }

    static void e(af afVar, Map.Entry entry) {
        dr drVar = (dr) entry.getKey();
        if (!drVar.f12873d) {
            gm gmVar = gm.DOUBLE;
            switch (drVar.f12872c) {
                case DOUBLE:
                    afVar.f(drVar.f12871b, ((Double) entry.getValue()).doubleValue());
                    break;
                case FLOAT:
                    afVar.o(drVar.f12871b, ((Float) entry.getValue()).floatValue());
                    break;
                case INT64:
                    afVar.t(drVar.f12871b, ((Long) entry.getValue()).longValue());
                    break;
                case UINT64:
                    afVar.L(drVar.f12871b, ((Long) entry.getValue()).longValue());
                    break;
                case INT32:
                    afVar.r(drVar.f12871b, ((Integer) entry.getValue()).intValue());
                    break;
                case FIXED64:
                    afVar.m(drVar.f12871b, ((Long) entry.getValue()).longValue());
                    break;
                case FIXED32:
                    afVar.k(drVar.f12871b, ((Integer) entry.getValue()).intValue());
                    break;
                case BOOL:
                    afVar.b(drVar.f12871b, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case STRING:
                    afVar.H(drVar.f12871b, (String) entry.getValue());
                    break;
                case GROUP:
                    afVar.q(drVar.f12871b, entry.getValue(), fq.a().c(((du) entry.getValue()).getClass()));
                    break;
                case MESSAGE:
                    afVar.w(drVar.f12871b, entry.getValue(), fq.a().c(((du) entry.getValue()).getClass()));
                    break;
                case BYTES:
                    afVar.d(drVar.f12871b, (v) entry.getValue());
                    break;
                case UINT32:
                    afVar.J(drVar.f12871b, ((Integer) entry.getValue()).intValue());
                    break;
                case ENUM:
                    afVar.r(drVar.f12871b, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED32:
                    afVar.y(drVar.f12871b, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED64:
                    afVar.A(drVar.f12871b, ((Long) entry.getValue()).longValue());
                    break;
                case SINT32:
                    afVar.C(drVar.f12871b, ((Integer) entry.getValue()).intValue());
                    break;
                case SINT64:
                    afVar.E(drVar.f12871b, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        gm gmVar2 = gm.DOUBLE;
        switch (drVar.f12872c) {
            case DOUBLE:
                fu.s(drVar.f12871b, (List) entry.getValue(), afVar, drVar.f12874e);
                break;
            case FLOAT:
                fu.w(drVar.f12871b, (List) entry.getValue(), afVar, drVar.f12874e);
                break;
            case INT64:
                fu.z(drVar.f12871b, (List) entry.getValue(), afVar, drVar.f12874e);
                break;
            case UINT64:
                fu.H(drVar.f12871b, (List) entry.getValue(), afVar, drVar.f12874e);
                break;
            case INT32:
                fu.y(drVar.f12871b, (List) entry.getValue(), afVar, drVar.f12874e);
                break;
            case FIXED64:
                fu.v(drVar.f12871b, (List) entry.getValue(), afVar, drVar.f12874e);
                break;
            case FIXED32:
                fu.u(drVar.f12871b, (List) entry.getValue(), afVar, drVar.f12874e);
                break;
            case BOOL:
                fu.q(drVar.f12871b, (List) entry.getValue(), afVar, drVar.f12874e);
                break;
            case STRING:
                fu.F(drVar.f12871b, (List) entry.getValue(), afVar);
                break;
            case GROUP:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    fu.x(drVar.f12871b, (List) entry.getValue(), afVar, fq.a().c(((du) list.get(0)).getClass()));
                    break;
                }
                break;
            case MESSAGE:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    fu.A(drVar.f12871b, (List) entry.getValue(), afVar, fq.a().c(((du) list2.get(0)).getClass()));
                    break;
                }
                break;
            case BYTES:
                fu.r(drVar.f12871b, (List) entry.getValue(), afVar);
                break;
            case UINT32:
                fu.G(drVar.f12871b, (List) entry.getValue(), afVar, drVar.f12874e);
                break;
            case ENUM:
                fu.y(drVar.f12871b, (List) entry.getValue(), afVar, drVar.f12874e);
                break;
            case SFIXED32:
                fu.B(drVar.f12871b, (List) entry.getValue(), afVar, drVar.f12874e);
                break;
            case SFIXED64:
                fu.C(drVar.f12871b, (List) entry.getValue(), afVar, drVar.f12874e);
                break;
            case SINT32:
                fu.D(drVar.f12871b, (List) entry.getValue(), afVar, drVar.f12874e);
                break;
            case SINT64:
                fu.E(drVar.f12871b, (List) entry.getValue(), afVar, drVar.f12874e);
                break;
        }
    }

    static void f(Object obj) {
        b(obj).l();
    }

    static String g(v vVar) {
        return h(vVar.x());
    }

    static String h(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b2);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static fd i(Object obj) {
        return ((fe) obj).c();
    }

    public static boolean j(Object obj) {
        return !((ff) obj).e();
    }

    public static Object k(Object obj, Object obj2) {
        ff ffVarB = (ff) obj;
        ff ffVar = (ff) obj2;
        if (!ffVar.isEmpty()) {
            if (!ffVarB.e()) {
                ffVarB = ffVarB.b();
            }
            ffVarB.d(ffVar);
        }
        return ffVarB;
    }

    public static Object l() {
        return ff.a().b();
    }

    static eo m(Object obj, long j2) {
        return (eo) gk.f(obj, j2);
    }

    public static List n(Object obj, long j2) {
        eo eoVarM = m(obj, j2);
        if (eoVarM.c()) {
            return eoVarM;
        }
        int size = eoVarM.size();
        eo eoVarF = eoVarM.f(size == 0 ? 10 : size + size);
        gk.p(obj, j2, eoVarF);
        return eoVarF;
    }

    static int o(String str, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int length = str.length();
        int i7 = 0;
        while (true) {
            i4 = i2 + i3;
            if (i7 >= length || (i6 = i7 + i2) >= i4 || (cCharAt = str.charAt(i7)) >= 128) {
                break;
            }
            bArr[i6] = (byte) cCharAt;
            i7++;
        }
        if (i7 == length) {
            return i2 + length;
        }
        int i8 = i2 + i7;
        while (i7 < length) {
            char cCharAt2 = str.charAt(i7);
            if (cCharAt2 < 128 && i8 < i4) {
                bArr[i8] = (byte) cCharAt2;
                i8++;
            } else if (cCharAt2 < 2048 && i8 <= i4 - 2) {
                bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i8 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i8 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i8 > i4 - 3) {
                    if (i8 > i4 - 4) {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i5 = i7 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i5)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        return s(str, bArr, i2, i3);
                    }
                    i7++;
                    if (i7 != str.length()) {
                        char cCharAt3 = str.charAt(i7);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i9 = i8 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i8 += 4;
                            bArr[i9] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    return s(str, bArr, i2, i3);
                }
                bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i8 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i8 += 3;
            }
            i7++;
        }
        return i8;
    }

    static String p(byte[] bArr, int i2, int i3) throws eu {
        int i4;
        if (i3 == 0) {
            return "";
        }
        int length = bArr.length;
        if ((((length - i2) - i3) | i2 | i3) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i5 = i2 + i3;
        char[] cArr = new char[i3];
        int i6 = 0;
        while (i2 < i5) {
            byte b2 = bArr[i2];
            if (!y(b2)) {
                break;
            }
            i2++;
            v(b2, cArr, i6);
            i6++;
        }
        int i7 = i6;
        while (i2 < i5) {
            int i8 = i2 + 1;
            byte b3 = bArr[i2];
            if (y(b3)) {
                v(b3, cArr, i7);
                i7++;
                i2 = i8;
                while (i2 < i5) {
                    byte b4 = bArr[i2];
                    if (y(b4)) {
                        i2++;
                        v(b4, cArr, i7);
                        i7++;
                    }
                }
            } else {
                if (b3 < -32) {
                    if (i8 >= i5) {
                        throw new eu("Protocol message had invalid UTF-8.");
                    }
                    i4 = i7 + 1;
                    i2 += 2;
                    x(b3, bArr[i8], cArr, i7);
                } else if (b3 < -16) {
                    if (i8 >= i5 - 1) {
                        throw new eu("Protocol message had invalid UTF-8.");
                    }
                    i4 = i7 + 1;
                    int i9 = i2 + 2;
                    i2 += 3;
                    w(b3, bArr[i8], bArr[i9], cArr, i7);
                } else {
                    if (i8 >= i5 - 2) {
                        throw new eu("Protocol message had invalid UTF-8.");
                    }
                    byte b5 = bArr[i8];
                    int i10 = i2 + 3;
                    byte b6 = bArr[i2 + 2];
                    i2 += 4;
                    u(b3, b5, b6, bArr[i10], cArr, i7);
                    i7 += 2;
                }
                i7 = i4;
            }
        }
        return new String(cArr, 0, i7);
    }

    static boolean q(byte[] bArr) {
        return z(bArr, 0, bArr.length);
    }

    static boolean r(byte[] bArr, int i2, int i3) {
        return z(bArr, i2, i3);
    }

    protected static int s(String str, byte[] bArr, int i2, int i3) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        if (length - i2 > i3) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i2, length);
        return i2 + length;
    }

    static int t(String str) throws gl {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt < 2048) {
                i4 += (127 - cCharAt) >>> 31;
                i3++;
            } else {
                try {
                    int length2 = str.length();
                    while (i3 < length2) {
                        char cCharAt2 = str.charAt(i3);
                        if (cCharAt2 < 2048) {
                            i2 += (127 - cCharAt2) >>> 31;
                        } else {
                            i2 += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i3) < 65536) {
                                    throw new gl(i3, length2);
                                }
                                i3++;
                            }
                        }
                        i3++;
                    }
                    i4 += i2;
                } catch (gl unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i4 >= length) {
            return i4;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i4 + 4294967296L));
    }

    static /* bridge */ /* synthetic */ void u(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws eu {
        if (B(b3) || (((b2 << StylePropertiesKt.RotationZId) + (b3 + 112)) >> 30) != 0 || B(b4) || B(b5)) {
            throw new eu("Protocol message had invalid UTF-8.");
        }
        int iA = ((b2 & 7) << 18) | (A(b3) << 12) | (A(b4) << 6) | A(b5);
        cArr[i2] = (char) ((iA >>> 10) + 55232);
        cArr[i2 + 1] = (char) ((iA & 1023) + 56320);
    }

    static /* bridge */ /* synthetic */ void v(byte b2, char[] cArr, int i2) {
        cArr[i2] = (char) b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* bridge */ /* synthetic */ void w(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.v.eu {
        /*
            boolean r0 = B(r3)
            if (r0 != 0) goto L30
            r0 = -96
            r1 = -32
            if (r2 != r1) goto Lf
            if (r3 < r0) goto L30
            r2 = r1
        Lf:
            r1 = -19
            if (r2 != r1) goto L16
            if (r3 >= r0) goto L30
            r2 = r1
        L16:
            boolean r0 = B(r4)
            if (r0 != 0) goto L30
            r2 = r2 & 15
            int r3 = A(r3)
            int r4 = A(r4)
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L30:
            com.google.v.eu r2 = new com.google.v.eu
            java.lang.String r3 = "Protocol message had invalid UTF-8."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.v.dc.w(byte, byte, byte, char[], int):void");
    }

    static /* bridge */ /* synthetic */ void x(byte b2, byte b3, char[] cArr, int i2) throws eu {
        if (b2 < -62 || B(b3)) {
            throw new eu("Protocol message had invalid UTF-8.");
        }
        cArr[i2] = (char) (((b2 & StylePropertiesKt.ClipId) << 6) | A(b3));
    }

    static /* bridge */ /* synthetic */ boolean y(byte b2) {
        return b2 >= 0;
    }

    private static boolean z(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return true;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                i2 = i4;
            } else {
                if (b2 < -32) {
                    if (i4 < i3 && b2 >= -62) {
                        i2 += 2;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return false;
                }
                if (b2 >= -16) {
                    if (i4 >= i3 - 2) {
                        return false;
                    }
                    int i5 = i2 + 2;
                    byte b3 = bArr[i4];
                    if (b3 <= -65 && (((b2 << StylePropertiesKt.RotationZId) + (b3 + 112)) >> 30) == 0) {
                        int i6 = i2 + 3;
                        if (bArr[i5] <= -65) {
                            i2 += 4;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                    return false;
                }
                if (i4 >= i3 - 1) {
                    return false;
                }
                int i7 = i2 + 2;
                byte b4 = bArr[i4];
                if (b4 > -65 || (b2 == -32 && b4 < -96)) {
                    return false;
                }
                if (b2 == -19 && b4 >= -96) {
                    return false;
                }
                i2 += 3;
                if (bArr[i7] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    dc(byte[] bArr) {
    }
}
