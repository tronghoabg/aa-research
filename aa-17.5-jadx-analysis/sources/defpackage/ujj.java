package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ujj extends ukh {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/model/LazyStyleEntryTable");
    private final aehj b = new aehf(null);
    private final aehj f = new aehf(null);
    private final aehj g = new aehf(null);
    private final aehj h = new aehf(null);
    private final aehj i = new aehf(null);
    private final aenq j = new aenq(null);
    private final boolean k;
    private final uji l;

    public ujj(uji ujiVar, boolean z) {
        vaq.d();
        this.l = ujiVar;
        this.k = z;
    }

    private final int o(int i) {
        return this.l.a(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0392 A[Catch: abon | IndexOutOfBoundsException -> 0x05a0, IndexOutOfBoundsException -> 0x05a2, all -> 0x061f, TryCatch #9 {, blocks: (B:5:0x0008, B:7:0x000e, B:9:0x0014, B:12:0x0018, B:14:0x0049, B:16:0x0075, B:18:0x007d, B:232:0x0597, B:247:0x05aa, B:265:0x061b, B:19:0x008c, B:22:0x0094, B:24:0x00a6, B:26:0x00e1, B:28:0x00e6, B:30:0x00f2, B:32:0x010c, B:31:0x00fd, B:34:0x0112, B:36:0x011a, B:37:0x0132, B:39:0x0139, B:41:0x0143, B:43:0x014b, B:47:0x0154, B:51:0x0170, B:54:0x018c, B:57:0x0197, B:60:0x01a2, B:62:0x01a9, B:64:0x01af, B:66:0x01d9, B:68:0x01e1, B:70:0x01e5, B:72:0x0208, B:74:0x020e, B:76:0x0214, B:77:0x0218, B:79:0x021c, B:80:0x0224, B:82:0x022a, B:83:0x0232, B:85:0x0238, B:86:0x0240, B:88:0x0246, B:90:0x0253, B:92:0x025a, B:95:0x02ab, B:96:0x02ae, B:98:0x02b4, B:100:0x02c4, B:102:0x02de, B:101:0x02cf, B:104:0x02e6, B:106:0x02ec, B:107:0x0302, B:110:0x0311, B:112:0x0317, B:114:0x0339, B:116:0x0349, B:118:0x034d, B:119:0x034f, B:121:0x0359, B:122:0x035b, B:124:0x0363, B:126:0x0367, B:127:0x0369, B:139:0x038a, B:141:0x0392, B:144:0x03a2, B:146:0x03ab, B:148:0x03b5, B:156:0x03f0, B:158:0x0402, B:160:0x0408, B:161:0x0410, B:163:0x0414, B:164:0x041c, B:166:0x0420, B:167:0x0428, B:169:0x042d, B:172:0x0436, B:173:0x0438, B:175:0x043d, B:177:0x0447, B:193:0x04c8, B:195:0x04d2, B:197:0x04da, B:198:0x04dc, B:199:0x04de, B:201:0x04e6, B:202:0x04ec, B:204:0x04f2, B:209:0x04fe, B:212:0x0506, B:214:0x050b, B:216:0x0511, B:218:0x053f, B:220:0x0544, B:222:0x0552, B:223:0x0557, B:224:0x055e, B:226:0x0564, B:227:0x0576, B:229:0x057b, B:178:0x0453, B:179:0x0476, B:181:0x047e, B:182:0x048a, B:183:0x0496, B:185:0x049f, B:187:0x04a3, B:188:0x04a5, B:189:0x04ac, B:191:0x04b4, B:192:0x04c0, B:149:0x03bf, B:150:0x03e0, B:152:0x03e7, B:154:0x03eb, B:155:0x03ed, B:143:0x039a, B:129:0x0371, B:131:0x0375, B:133:0x0379, B:135:0x037d, B:136:0x037f, B:137:0x0386, B:157:0x03f6, B:108:0x0308, B:67:0x01de, B:42:0x0148, B:38:0x0135, B:230:0x058d, B:250:0x05c2, B:255:0x05ef, B:258:0x05f3, B:253:0x05cc, B:264:0x0606), top: B:274:0x0008, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x039a A[Catch: abon | IndexOutOfBoundsException -> 0x05a0, IndexOutOfBoundsException -> 0x05a2, all -> 0x061f, TryCatch #9 {, blocks: (B:5:0x0008, B:7:0x000e, B:9:0x0014, B:12:0x0018, B:14:0x0049, B:16:0x0075, B:18:0x007d, B:232:0x0597, B:247:0x05aa, B:265:0x061b, B:19:0x008c, B:22:0x0094, B:24:0x00a6, B:26:0x00e1, B:28:0x00e6, B:30:0x00f2, B:32:0x010c, B:31:0x00fd, B:34:0x0112, B:36:0x011a, B:37:0x0132, B:39:0x0139, B:41:0x0143, B:43:0x014b, B:47:0x0154, B:51:0x0170, B:54:0x018c, B:57:0x0197, B:60:0x01a2, B:62:0x01a9, B:64:0x01af, B:66:0x01d9, B:68:0x01e1, B:70:0x01e5, B:72:0x0208, B:74:0x020e, B:76:0x0214, B:77:0x0218, B:79:0x021c, B:80:0x0224, B:82:0x022a, B:83:0x0232, B:85:0x0238, B:86:0x0240, B:88:0x0246, B:90:0x0253, B:92:0x025a, B:95:0x02ab, B:96:0x02ae, B:98:0x02b4, B:100:0x02c4, B:102:0x02de, B:101:0x02cf, B:104:0x02e6, B:106:0x02ec, B:107:0x0302, B:110:0x0311, B:112:0x0317, B:114:0x0339, B:116:0x0349, B:118:0x034d, B:119:0x034f, B:121:0x0359, B:122:0x035b, B:124:0x0363, B:126:0x0367, B:127:0x0369, B:139:0x038a, B:141:0x0392, B:144:0x03a2, B:146:0x03ab, B:148:0x03b5, B:156:0x03f0, B:158:0x0402, B:160:0x0408, B:161:0x0410, B:163:0x0414, B:164:0x041c, B:166:0x0420, B:167:0x0428, B:169:0x042d, B:172:0x0436, B:173:0x0438, B:175:0x043d, B:177:0x0447, B:193:0x04c8, B:195:0x04d2, B:197:0x04da, B:198:0x04dc, B:199:0x04de, B:201:0x04e6, B:202:0x04ec, B:204:0x04f2, B:209:0x04fe, B:212:0x0506, B:214:0x050b, B:216:0x0511, B:218:0x053f, B:220:0x0544, B:222:0x0552, B:223:0x0557, B:224:0x055e, B:226:0x0564, B:227:0x0576, B:229:0x057b, B:178:0x0453, B:179:0x0476, B:181:0x047e, B:182:0x048a, B:183:0x0496, B:185:0x049f, B:187:0x04a3, B:188:0x04a5, B:189:0x04ac, B:191:0x04b4, B:192:0x04c0, B:149:0x03bf, B:150:0x03e0, B:152:0x03e7, B:154:0x03eb, B:155:0x03ed, B:143:0x039a, B:129:0x0371, B:131:0x0375, B:133:0x0379, B:135:0x037d, B:136:0x037f, B:137:0x0386, B:157:0x03f6, B:108:0x0308, B:67:0x01de, B:42:0x0148, B:38:0x0135, B:230:0x058d, B:250:0x05c2, B:255:0x05ef, B:258:0x05f3, B:253:0x05cc, B:264:0x0606), top: B:274:0x0008, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ab A[Catch: abon | IndexOutOfBoundsException -> 0x05a0, IndexOutOfBoundsException -> 0x05a2, all -> 0x061f, TryCatch #9 {, blocks: (B:5:0x0008, B:7:0x000e, B:9:0x0014, B:12:0x0018, B:14:0x0049, B:16:0x0075, B:18:0x007d, B:232:0x0597, B:247:0x05aa, B:265:0x061b, B:19:0x008c, B:22:0x0094, B:24:0x00a6, B:26:0x00e1, B:28:0x00e6, B:30:0x00f2, B:32:0x010c, B:31:0x00fd, B:34:0x0112, B:36:0x011a, B:37:0x0132, B:39:0x0139, B:41:0x0143, B:43:0x014b, B:47:0x0154, B:51:0x0170, B:54:0x018c, B:57:0x0197, B:60:0x01a2, B:62:0x01a9, B:64:0x01af, B:66:0x01d9, B:68:0x01e1, B:70:0x01e5, B:72:0x0208, B:74:0x020e, B:76:0x0214, B:77:0x0218, B:79:0x021c, B:80:0x0224, B:82:0x022a, B:83:0x0232, B:85:0x0238, B:86:0x0240, B:88:0x0246, B:90:0x0253, B:92:0x025a, B:95:0x02ab, B:96:0x02ae, B:98:0x02b4, B:100:0x02c4, B:102:0x02de, B:101:0x02cf, B:104:0x02e6, B:106:0x02ec, B:107:0x0302, B:110:0x0311, B:112:0x0317, B:114:0x0339, B:116:0x0349, B:118:0x034d, B:119:0x034f, B:121:0x0359, B:122:0x035b, B:124:0x0363, B:126:0x0367, B:127:0x0369, B:139:0x038a, B:141:0x0392, B:144:0x03a2, B:146:0x03ab, B:148:0x03b5, B:156:0x03f0, B:158:0x0402, B:160:0x0408, B:161:0x0410, B:163:0x0414, B:164:0x041c, B:166:0x0420, B:167:0x0428, B:169:0x042d, B:172:0x0436, B:173:0x0438, B:175:0x043d, B:177:0x0447, B:193:0x04c8, B:195:0x04d2, B:197:0x04da, B:198:0x04dc, B:199:0x04de, B:201:0x04e6, B:202:0x04ec, B:204:0x04f2, B:209:0x04fe, B:212:0x0506, B:214:0x050b, B:216:0x0511, B:218:0x053f, B:220:0x0544, B:222:0x0552, B:223:0x0557, B:224:0x055e, B:226:0x0564, B:227:0x0576, B:229:0x057b, B:178:0x0453, B:179:0x0476, B:181:0x047e, B:182:0x048a, B:183:0x0496, B:185:0x049f, B:187:0x04a3, B:188:0x04a5, B:189:0x04ac, B:191:0x04b4, B:192:0x04c0, B:149:0x03bf, B:150:0x03e0, B:152:0x03e7, B:154:0x03eb, B:155:0x03ed, B:143:0x039a, B:129:0x0371, B:131:0x0375, B:133:0x0379, B:135:0x037d, B:136:0x037f, B:137:0x0386, B:157:0x03f6, B:108:0x0308, B:67:0x01de, B:42:0x0148, B:38:0x0135, B:230:0x058d, B:250:0x05c2, B:255:0x05ef, B:258:0x05f3, B:253:0x05cc, B:264:0x0606), top: B:274:0x0008, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03e0 A[Catch: abon | IndexOutOfBoundsException -> 0x05a0, IndexOutOfBoundsException -> 0x05a2, all -> 0x061f, TryCatch #9 {, blocks: (B:5:0x0008, B:7:0x000e, B:9:0x0014, B:12:0x0018, B:14:0x0049, B:16:0x0075, B:18:0x007d, B:232:0x0597, B:247:0x05aa, B:265:0x061b, B:19:0x008c, B:22:0x0094, B:24:0x00a6, B:26:0x00e1, B:28:0x00e6, B:30:0x00f2, B:32:0x010c, B:31:0x00fd, B:34:0x0112, B:36:0x011a, B:37:0x0132, B:39:0x0139, B:41:0x0143, B:43:0x014b, B:47:0x0154, B:51:0x0170, B:54:0x018c, B:57:0x0197, B:60:0x01a2, B:62:0x01a9, B:64:0x01af, B:66:0x01d9, B:68:0x01e1, B:70:0x01e5, B:72:0x0208, B:74:0x020e, B:76:0x0214, B:77:0x0218, B:79:0x021c, B:80:0x0224, B:82:0x022a, B:83:0x0232, B:85:0x0238, B:86:0x0240, B:88:0x0246, B:90:0x0253, B:92:0x025a, B:95:0x02ab, B:96:0x02ae, B:98:0x02b4, B:100:0x02c4, B:102:0x02de, B:101:0x02cf, B:104:0x02e6, B:106:0x02ec, B:107:0x0302, B:110:0x0311, B:112:0x0317, B:114:0x0339, B:116:0x0349, B:118:0x034d, B:119:0x034f, B:121:0x0359, B:122:0x035b, B:124:0x0363, B:126:0x0367, B:127:0x0369, B:139:0x038a, B:141:0x0392, B:144:0x03a2, B:146:0x03ab, B:148:0x03b5, B:156:0x03f0, B:158:0x0402, B:160:0x0408, B:161:0x0410, B:163:0x0414, B:164:0x041c, B:166:0x0420, B:167:0x0428, B:169:0x042d, B:172:0x0436, B:173:0x0438, B:175:0x043d, B:177:0x0447, B:193:0x04c8, B:195:0x04d2, B:197:0x04da, B:198:0x04dc, B:199:0x04de, B:201:0x04e6, B:202:0x04ec, B:204:0x04f2, B:209:0x04fe, B:212:0x0506, B:214:0x050b, B:216:0x0511, B:218:0x053f, B:220:0x0544, B:222:0x0552, B:223:0x0557, B:224:0x055e, B:226:0x0564, B:227:0x0576, B:229:0x057b, B:178:0x0453, B:179:0x0476, B:181:0x047e, B:182:0x048a, B:183:0x0496, B:185:0x049f, B:187:0x04a3, B:188:0x04a5, B:189:0x04ac, B:191:0x04b4, B:192:0x04c0, B:149:0x03bf, B:150:0x03e0, B:152:0x03e7, B:154:0x03eb, B:155:0x03ed, B:143:0x039a, B:129:0x0371, B:131:0x0375, B:133:0x0379, B:135:0x037d, B:136:0x037f, B:137:0x0386, B:157:0x03f6, B:108:0x0308, B:67:0x01de, B:42:0x0148, B:38:0x0135, B:230:0x058d, B:250:0x05c2, B:255:0x05ef, B:258:0x05f3, B:253:0x05cc, B:264:0x0606), top: B:274:0x0008, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized defpackage.ukf p(long r27) {
        /*
            Method dump skipped, instructions count: 1572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ujj.p(long):ukf");
    }

    public final void a(long j, ukf ukfVar) {
        aenq aenqVar = this.j;
        synchronized (aenqVar) {
            aenqVar.a(j, ukfVar);
        }
    }

    @Override // defpackage.ukh
    public final ukf b(int i) {
        ukf ukfVar;
        synchronized (this) {
            aehj aehjVar = this.i;
            if (!aehjVar.c(i)) {
                aehjVar.a(i, c(o(i)));
            }
            ukfVar = (ukf) aehjVar.p(i);
        }
        return ukfVar;
    }

    @Override // defpackage.ukh
    public final ukf c(long j) {
        ukf ukfVar;
        aenq aenqVar = this.j;
        synchronized (aenqVar) {
            ukfVar = (ukf) aenqVar.p(j);
        }
        return ukfVar == null ? p(j) : ukfVar;
    }

    @Override // defpackage.ukh
    public final ukf d(int i, aekf aekfVar, ukj ukjVar) {
        return aekfVar.isEmpty() ? b(i) : c(ukjVar.a(o(i), aekfVar));
    }

    @Override // defpackage.ukh
    public final List e() {
        ArrayList arrayList = new ArrayList();
        abfk abfkVar = this.l.c;
        int i = 0;
        if (abfkVar != null) {
            while (i < abfkVar.a()) {
                try {
                    arrayList.add(abfkVar.e(i));
                } catch (abon e) {
                    ((ynz) ((ynz) a.a(uys.a).p(e)).ai(9384)).w("getAllNamedStyleMappings: Error in getting named style mapping for index: %s", i);
                }
                i++;
            }
        } else {
            abfl abflVar = this.l.b;
            if (abflVar != null) {
                while (i < abflVar.a()) {
                    try {
                        arrayList.add(abflVar.e(i));
                    } catch (abon e2) {
                        ((ynz) ((ynz) a.a(uys.a).p(e2)).ai(9383)).w("getAllNamedStyleMappings: Error in getting named style mapping for index: %s", i);
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.ukh
    public final byte[] f() {
        uji ujiVar = this.l;
        if (ujiVar.c != null) {
            return ujiVar.e;
        }
        ((ynz) uji.a.a(uys.a).ai((char) 9382)).u("Only compact style tables are supported.");
        return new byte[0];
    }

    @Override // defpackage.ukh
    public final byte[] g() {
        return this.l.d;
    }

    @Override // defpackage.ukh
    public final void h() {
        synchronized (this.j) {
        }
    }

    @Override // defpackage.ukh
    public final ukf i() {
        return b(1581);
    }
}
