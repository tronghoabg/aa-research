package V8;

import U8.A;
import U8.C;
import U8.C0857a0;
import U8.C0859b0;
import U8.D;
import U8.E;
import U8.G;
import U8.V;
import U8.Y;
import U8.Z;
import V1.c;
import ad.L;
import android.util.JsonReader;
import j9.C3094d;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final L f13166a;

    static {
        C3094d c3094d = new C3094d();
        A.f12353a.configure(c3094d);
        c3094d.f38685d = true;
        f13166a = new L(c3094d, 11);
    }

    public static Z a(JsonReader jsonReader) throws IOException {
        Y y10 = new Y();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    y10.f12497d = jsonReader.nextLong();
                    y10.f12499f = (byte) (y10.f12499f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    y10.f12495b = strNextString;
                    break;
                case "pc":
                    y10.f12494a = jsonReader.nextLong();
                    y10.f12499f = (byte) (y10.f12499f | 1);
                    break;
                case "file":
                    y10.f12496c = jsonReader.nextString();
                    break;
                case "importance":
                    y10.f12498e = jsonReader.nextInt();
                    y10.f12499f = (byte) (y10.f12499f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return y10.a();
    }

    public static G b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR)) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (strNextName.equals(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR)) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new G(strNextString, strNextString2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (strNextString == null) {
            sb2.append(" key");
        }
        if (strNextString2 == null) {
            sb2.append(" value");
        }
        throw new IllegalStateException(N0.a.i("Missing required properties:", sb2));
    }

    public static E c(JsonReader jsonReader) throws IOException {
        D d3 = new D();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    d3.f12385i = d(jsonReader, new c(1));
                    break;
                case "pid":
                    d3.f12377a = jsonReader.nextInt();
                    d3.f12386j = (byte) (d3.f12386j | 1);
                    break;
                case "pss":
                    d3.f12381e = jsonReader.nextLong();
                    d3.f12386j = (byte) (d3.f12386j | 8);
                    break;
                case "rss":
                    d3.f12382f = jsonReader.nextLong();
                    d3.f12386j = (byte) (d3.f12386j | 16);
                    break;
                case "timestamp":
                    d3.f12383g = jsonReader.nextLong();
                    d3.f12386j = (byte) (d3.f12386j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    d3.f12378b = strNextString;
                    break;
                case "reasonCode":
                    d3.f12379c = jsonReader.nextInt();
                    d3.f12386j = (byte) (d3.f12386j | 2);
                    break;
                case "traceFile":
                    d3.f12384h = jsonReader.nextString();
                    break;
                case "importance":
                    d3.f12380d = jsonReader.nextInt();
                    d3.f12386j = (byte) (d3.f12386j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return d3.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List d(android.util.JsonReader r21, V1.c r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V8.a.d(android.util.JsonReader, V1.c):java.util.List");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014e A[PHI: r19
  0x014e: PHI (r19v10 char) = (r19v4 char), (r19v5 char), (r19v6 char), (r19v7 char), (r19v8 char), (r19v9 char), (r19v11 char) binds: [B:88:0x014c, B:84:0x013f, B:80:0x0131, B:76:0x0124, B:72:0x0117, B:68:0x010a, B:64:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static U8.Q e(android.util.JsonReader r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V8.a.e(android.util.JsonReader):U8.Q");
    }

    public static V f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        int iNextInt = 0;
        String str = null;
        String strNextString = null;
        List list = null;
        V vF = null;
        byte b5 = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    List listD = d(jsonReader, new c(6));
                    if (listD == null) {
                        throw new NullPointerException("Null frames");
                    }
                    list = listD;
                    break;
                case "reason":
                    strNextString = jsonReader.nextString();
                    break;
                case "type":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    str = strNextString2;
                    break;
                case "causedBy":
                    vF = f(jsonReader);
                    break;
                case "overflowCount":
                    iNextInt = jsonReader.nextInt();
                    b5 = (byte) (b5 | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (b5 == 1 && str != null && list != null) {
            return new V(str, strNextString, list, vF, iNextInt);
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            sb2.append(" type");
        }
        if (list == null) {
            sb2.append(" frames");
        }
        if ((b5 & 1) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(N0.a.i("Missing required properties:", sb2));
    }

    public static C0859b0 g(JsonReader jsonReader) throws IOException {
        C0857a0 c0857a0 = new C0857a0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    c0857a0.f12510b = jsonReader.nextInt();
                    c0857a0.f12513e = (byte) (c0857a0.f12513e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c0857a0.f12509a = strNextString;
                    break;
                case "defaultProcess":
                    c0857a0.f12512d = jsonReader.nextBoolean();
                    c0857a0.f12513e = (byte) (c0857a0.f12513e | 4);
                    break;
                case "importance":
                    c0857a0.f12511c = jsonReader.nextInt();
                    c0857a0.f12513e = (byte) (c0857a0.f12513e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0857a0.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01be A[PHI: r22
  0x01be: PHI (r22v24 char) = 
  (r22v13 char)
  (r22v14 char)
  (r22v15 char)
  (r22v16 char)
  (r22v17 char)
  (r22v18 char)
  (r22v19 char)
  (r22v20 char)
  (r22v21 char)
  (r22v22 char)
  (r22v23 char)
  (r22v25 char)
 binds: [B:110:0x01bc, B:106:0x01ae, B:102:0x01a3, B:98:0x0198, B:94:0x018a, B:90:0x017d, B:86:0x0170, B:82:0x0161, B:78:0x0151, B:74:0x0141, B:70:0x0131, B:66:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db A[PHI: r21
  0x00db: PHI (r21v12 char) = 
  (r21v1 char)
  (r21v2 char)
  (r21v3 char)
  (r21v4 char)
  (r21v5 char)
  (r21v6 char)
  (r21v7 char)
  (r21v8 char)
  (r21v9 char)
  (r21v10 char)
  (r21v11 char)
  (r21v13 char)
 binds: [B:53:0x00d9, B:49:0x00cb, B:45:0x00be, B:41:0x00b3, B:37:0x00a6, B:33:0x009b, B:29:0x008e, B:25:0x007f, B:21:0x0071, B:17:0x0061, B:13:0x0053, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static U8.C h(android.util.JsonReader r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V8.a.h(android.util.JsonReader):U8.C");
    }

    public static C i(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                C cH = h(jsonReader);
                jsonReader.close();
                return cH;
            } finally {
            }
        } catch (IllegalStateException e7) {
            throw new IOException(e7);
        }
    }
}
