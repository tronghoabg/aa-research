package androidx.datastore.preferences.protobuf;

import com.applovin.shadow.okio.Utf8;
import com.qonversion.android.sdk.internal.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f18153a = new e0();

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f18154b = new f0();

    public static void a(byte b5, byte b10, byte b11, byte b12, char[] cArr, int i5) throws A {
        if (!h(b10)) {
            if ((((b10 + 112) + (b5 << 28)) >> 30) == 0 && !h(b11) && !h(b12)) {
                int i10 = ((b5 & 7) << 18) | ((b10 & Utf8.REPLACEMENT_BYTE) << 12) | ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (b12 & Utf8.REPLACEMENT_BYTE);
                cArr[i5] = (char) ((i10 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i5 + 1] = (char) ((i10 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                return;
            }
        }
        throw A.a();
    }

    public static void b(byte b5, byte b10, char[] cArr, int i5) throws A {
        if (b5 < -62 || h(b10)) {
            throw A.a();
        }
        cArr[i5] = (char) (((b5 & 31) << 6) | (b10 & Utf8.REPLACEMENT_BYTE));
    }

    public static void c(byte b5, byte b10, byte b11, char[] cArr, int i5) throws A {
        if (h(b10) || ((b5 == -32 && b10 < -96) || ((b5 == -19 && b10 >= -96) || h(b11)))) {
            throw A.a();
        }
        cArr[i5] = (char) (((b5 & 15) << 12) | ((b10 & Utf8.REPLACEMENT_BYTE) << 6) | (b11 & Utf8.REPLACEMENT_BYTE));
    }

    public static final String d(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i5 = 0; i5 < str.length(); i5++) {
            char cCharAt = str.charAt(i5);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append(Constants.USER_ID_SEPARATOR);
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    public static String g(C1390g c1390g) {
        StringBuilder sb2 = new StringBuilder(c1390g.size());
        for (int i5 = 0; i5 < c1390g.size(); i5++) {
            byte b5 = c1390g.f18206b[i5];
            if (b5 == 34) {
                sb2.append("\\\"");
            } else if (b5 == 39) {
                sb2.append("\\'");
            } else if (b5 != 92) {
                switch (b5) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b5 < 32 || b5 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b5 >>> 6) & 3) + 48));
                            sb2.append((char) (((b5 >>> 3) & 7) + 48));
                            sb2.append((char) ((b5 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) b5);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static boolean h(byte b5) {
        return b5 > -65;
    }

    public static final void j(StringBuilder sb2, int i5, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                j(sb2, i5, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(sb2, i5, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            C1390g c1390g = C1390g.f18203c;
            sb2.append(g(new C1390g(((String) obj).getBytes(AbstractC1407y.f18274a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof C1390g) {
            sb2.append(": \"");
            sb2.append(g((C1390g) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC1404v) {
            sb2.append(" {");
            k((AbstractC1404v) obj, sb2, i5 + 2);
            sb2.append("\n");
            while (i10 < i5) {
                sb2.append(' ');
                i10++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i5 + 2;
        j(sb2, i12, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, entry.getKey());
        j(sb2, i12, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, entry.getValue());
        sb2.append("\n");
        while (i10 < i5) {
            sb2.append(' ');
            i10++;
        }
        sb2.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(androidx.datastore.preferences.protobuf.AbstractC1404v r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Q.k(androidx.datastore.preferences.protobuf.v, java.lang.StringBuilder, int):void");
    }

    public abstract String e(int i5, int i10, byte[] bArr);

    public abstract int f(int i5, int i10, String str, byte[] bArr);

    public abstract int i(byte[] bArr, int i5, int i10);

    public abstract void l(byte[] bArr, int i5, int i10);
}
