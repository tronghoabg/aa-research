package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dvi {
    private static final java.lang.ThreadLocal c = new java.lang.ThreadLocal();
    public static final java.util.WeakHashMap a = new java.util.WeakHashMap(0);
    public static final java.lang.Object b = new java.lang.Object();

    public static float a(android.content.res.Resources resources, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return alh$.ExternalSyntheticApiModelOutline0.m(resources, i);
        }
        android.util.TypedValue typedValueB = b();
        resources.getValue(i, typedValueB, true);
        if (typedValueB.type == 4) {
            return typedValueB.getFloat();
        }
        throw new android.content.res.Resources.NotFoundException("Resource ID #0x" + java.lang.Integer.toHexString(i) + " type #0x" + java.lang.Integer.toHexString(typedValueB.type) + " is not valid");
    }

    public static android.util.TypedValue b() {
        java.lang.ThreadLocal threadLocal = c;
        android.util.TypedValue typedValue = (android.util.TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static void c(android.content.Context context, int i, defpackage.dvg dvgVar) throws android.content.res.Resources.NotFoundException {
        if (context.isRestricted()) {
            dvgVar.c(-4);
        } else {
            d(context, i, new android.util.TypedValue(), 0, dvgVar, false, false);
        }
    }

    public static android.graphics.Typeface d(android.content.Context context, int i, android.util.TypedValue typedValue, int i2, defpackage.dvg dvgVar, boolean z, boolean z2) {
        android.content.res.Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        android.graphics.Typeface typefaceE = e(context, resources, typedValue, i, i2, dvgVar, z, z2);
        if (typefaceE != null || dvgVar != null || z2) {
            return typefaceE;
        }
        throw new android.content.res.Resources.NotFoundException("Font resource ID #0x" + java.lang.Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0208 A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x020f A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0216 A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x021c A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x022d A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0236 A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0246 A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x024d A[EDGE_INSN: B:124:0x024d->B:155:0x02fa BREAK  A[LOOP:3: B:126:0x0251->B:131:0x0266]] */
    /* JADX WARN: Code duplicated, block: B:125:0x0250  */
    /* JADX WARN: Code duplicated, block: B:128:0x0257 A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0266 A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, LOOP:3: B:126:0x0251->B:131:0x0266, LOOP_END, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0271 A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x027e A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x02b4 A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TRY_LEAVE, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x02da A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x02e5 A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x02ec A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x02fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x02fe A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x030b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x030d A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0311  */
    /* JADX WARN: Code duplicated, block: B:163:0x0312 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x0314  */
    /* JADX WARN: Code duplicated, block: B:165:0x0316  */
    /* JADX WARN: Code duplicated, block: B:167:0x0319 A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x031c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0334 A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0340 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x0342 A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0346 A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x034d A[Catch: IOException -> 0x0372, XmlPullParserException -> 0x0382, TryCatch #3 {XmlPullParserException -> 0x0382, blocks: (B:16:0x0041, B:18:0x004d, B:19:0x0051, B:23:0x005c, B:24:0x0063, B:25:0x0064, B:27:0x0072, B:30:0x00aa, B:31:0x00b3, B:33:0x00b9, B:35:0x00bf, B:37:0x00cb, B:45:0x00f5, B:50:0x0105, B:51:0x0108, B:52:0x0109, B:54:0x010f, B:56:0x0116, B:108:0x0208, B:110:0x020f, B:113:0x0216, B:115:0x021c, B:117:0x0227, B:157:0x02fe, B:158:0x0301, B:160:0x030d, B:167:0x0319, B:169:0x031d, B:177:0x034d, B:119:0x022d, B:121:0x0236, B:122:0x0246, B:126:0x0251, B:128:0x0257, B:131:0x0266, B:133:0x026b, B:135:0x0271, B:137:0x027e, B:139:0x0286, B:140:0x028c, B:143:0x029a, B:144:0x02b4, B:146:0x02bc, B:151:0x02e5, B:153:0x02ef, B:152:0x02ec, B:149:0x02da, B:148:0x02d3, B:154:0x02f6, B:170:0x0334, B:173:0x0342, B:174:0x0346, B:58:0x011f, B:60:0x012f, B:61:0x013d, B:62:0x0144, B:63:0x014b, B:64:0x014c, B:65:0x0151, B:67:0x0157, B:69:0x015d, B:71:0x0169, B:74:0x017d, B:78:0x018d, B:82:0x0199, B:85:0x01a2, B:89:0x01ab, B:93:0x01be, B:94:0x01c9, B:96:0x01cf, B:97:0x01d3, B:98:0x01de, B:101:0x01eb, B:104:0x01f2, B:105:0x0202, B:179:0x0357), top: B:208:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x0393  */
    /* JADX WARN: Code duplicated, block: B:206:0x02bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:? A[RETURN, SYNTHETIC] */
    private static android.graphics.Typeface e(android.content.Context context, android.content.res.Resources resources, android.util.TypedValue typedValue, int i, int i2, defpackage.dvg dvgVar, boolean z, boolean z2) {
        java.lang.String str;
        int next;
        java.lang.Object srVar;
        int i3;
        android.graphics.Typeface typefaceB;
        android.graphics.Typeface typefaceM;
        defpackage.dve dveVar;
        java.lang.String str2;
        int i4;
        java.util.List list;
        int i5;
        int i6;
        android.graphics.Typeface.CustomFallbackBuilder customFallbackBuilder;
        defpackage.dwn dwnVar;
        java.lang.String str3;
        android.graphics.fonts.Font fontC;
        java.lang.String str4;
        android.graphics.fonts.FontFamily fontFamilyM;
        boolean z3;
        int i7;
        if (typedValue.string == null) {
            throw new android.content.res.Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + java.lang.Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        java.lang.String string = typedValue.string.toString();
        if (!string.startsWith("res/")) {
            if (dvgVar != null) {
                dvgVar.c(-3);
            }
            return null;
        }
        android.graphics.Typeface typeface = (android.graphics.Typeface) defpackage.dvo.b.b(defpackage.dvo.d(resources, i, string, typedValue.assetCookie, i2));
        if (typeface != null) {
            if (dvgVar != null) {
                dvgVar.d(typeface);
            }
            return typeface;
        }
        if (z2) {
            return null;
        }
        try {
            try {
                if (!string.toLowerCase().endsWith(".xml")) {
                    str = string;
                    try {
                        android.graphics.Typeface typefaceA = defpackage.dvo.a(context, resources, i, str, typedValue.assetCookie, i2);
                        if (dvgVar != null) {
                            if (typefaceA != null) {
                                dvgVar.d(typefaceA);
                                return typefaceA;
                            }
                            dvgVar.c(-3);
                        }
                        return typefaceA;
                    } catch (java.io.IOException e) {
                        e = e;
                        android.util.Log.e("ResourcesCompat", "Failed to read xml resource ".concat(java.lang.String.valueOf(str)), e);
                        if (dvgVar != null) {
                            return null;
                        }
                        dvgVar.c(-3);
                        return null;
                    } catch (org.xmlpull.v1.XmlPullParserException e2) {
                        e = e2;
                        android.util.Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(java.lang.String.valueOf(str)), e);
                        if (dvgVar != null) {
                            return null;
                        }
                        dvgVar.c(-3);
                        return null;
                    }
                }
                android.content.res.XmlResourceParser xml = resources.getXml(i);
                do {
                    next = xml.next();
                    int i8 = 2;
                    if (next == 2) {
                        xml.require(2, null, "font-family");
                        if (xml.getName().equals("font-family")) {
                            android.content.res.TypedArray typedArrayObtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xml), defpackage.dss.b);
                            java.lang.String string2 = typedArrayObtainAttributes.getString(0);
                            java.lang.String string3 = typedArrayObtainAttributes.getString(5);
                            java.lang.String string4 = typedArrayObtainAttributes.getString(6);
                            java.lang.String string5 = typedArrayObtainAttributes.getString(2);
                            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
                            int integer = typedArrayObtainAttributes.getInteger(3, 1);
                            int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
                            int i9 = 7;
                            java.lang.String string6 = typedArrayObtainAttributes.getString(7);
                            typedArrayObtainAttributes.recycle();
                            if (string2 == null || string3 == null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                while (xml.next() != 3) {
                                    if (xml.getEventType() == i8) {
                                        if (xml.getName().equals("font")) {
                                            android.content.res.TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(android.util.Xml.asAttributeSet(xml), defpackage.dss.c);
                                            int i10 = typedArrayObtainAttributes2.getInt(true != typedArrayObtainAttributes2.hasValue(8) ? 1 : 8, 400);
                                            boolean z4 = typedArrayObtainAttributes2.getInt(true != typedArrayObtainAttributes2.hasValue(6) ? i8 : 6, 0) == 1;
                                            int i11 = true != typedArrayObtainAttributes2.hasValue(9) ? 3 : 9;
                                            java.lang.String string7 = typedArrayObtainAttributes2.getString(true != typedArrayObtainAttributes2.hasValue(i9) ? 4 : i9);
                                            int i12 = typedArrayObtainAttributes2.getInt(i11, 0);
                                            int i13 = true != typedArrayObtainAttributes2.hasValue(5) ? 0 : 5;
                                            int resourceId2 = typedArrayObtainAttributes2.getResourceId(i13, 0);
                                            java.lang.String string8 = typedArrayObtainAttributes2.getString(i13);
                                            typedArrayObtainAttributes2.recycle();
                                            while (xml.next() != 3) {
                                                defpackage.dmh.E(xml);
                                            }
                                            arrayList.add(new dws(string8, i10, z4, string7, i12, resourceId2));
                                        } else {
                                            defpackage.dmh.E(xml);
                                        }
                                        i8 = 2;
                                        i9 = 7;
                                    } else {
                                        i8 = 2;
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    srVar = new defpackage.sr((dws[]) arrayList.toArray(new dws[0]), (byte[]) null);
                                }
                            } else {
                                java.util.List listD = defpackage.dmh.D(resources, resourceId);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                while (xml.next() != 3) {
                                    if (xml.getEventType() == 2) {
                                        if (xml.getName().equals("fallback")) {
                                            android.content.res.TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(android.util.Xml.asAttributeSet(xml), defpackage.dss.d);
                                            try {
                                                java.lang.String string9 = typedArrayObtainAttributes3.getString(0);
                                                java.lang.String string10 = typedArrayObtainAttributes3.getString(1);
                                                java.lang.String string11 = typedArrayObtainAttributes3.getString(2);
                                                if (string9 == null) {
                                                    throw new org.xmlpull.v1.XmlPullParserException("query attribute must be set in fallback element");
                                                }
                                                while (xml.next() != 3) {
                                                    defpackage.dmh.E(xml);
                                                }
                                                defpackage.dwn dwnVar2 = new defpackage.dwn(string2, string3, string9, listD, string10, string11);
                                                typedArrayObtainAttributes3.recycle();
                                                arrayList2.add(dwnVar2);
                                            } catch (java.lang.Throwable th) {
                                                typedArrayObtainAttributes3.recycle();
                                                throw th;
                                            }
                                        } else {
                                            defpackage.dmh.E(xml);
                                        }
                                        integer2 = integer2;
                                    }
                                }
                                int i14 = integer2;
                                if (!arrayList2.isEmpty()) {
                                    srVar = new defpackage.dve(arrayList2, integer, i14, string6);
                                } else {
                                    if (string4 == null) {
                                        throw new java.lang.IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
                                    }
                                    arrayList2.add(new defpackage.dwn(string2, string3, string4, listD, null, null));
                                    if (string5 != null) {
                                        arrayList2.add(new defpackage.dwn(string2, string3, string5, listD, null, null));
                                    }
                                    srVar = new defpackage.dve(arrayList2, integer, i14, string6);
                                }
                            }
                            if (srVar == null) {
                                android.util.Log.e("ResourcesCompat", "Failed to find font-family tag");
                                if (dvgVar != null) {
                                    return null;
                                }
                                dvgVar.c(-3);
                                return null;
                            }
                            i3 = typedValue.assetCookie;
                            if (srVar instanceof defpackage.dve) {
                                dveVar = (defpackage.dve) srVar;
                                str2 = dveVar.d;
                                i4 = -1;
                                if (!android.text.TextUtils.isEmpty(str2) || (typefaceM = defpackage.dvo.b(str2)) == null) {
                                    list = dveVar.a;
                                    if (list.size() != 1) {
                                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                                            i5 = 0;
                                            while (true) {
                                                if (i5 >= list.size()) {
                                                    i6 = 0;
                                                    customFallbackBuilder = null;
                                                    while (true) {
                                                        if (i6 < list.size()) {
                                                            dwnVar = (defpackage.dwn) list.get(i6);
                                                            if (i6 == list.size() + i4 || !android.text.TextUtils.isEmpty(dwnVar.g)) {
                                                                str3 = dwnVar.f;
                                                                fontC = defpackage.dvo.c(defpackage.dvo.b(str3));
                                                                if (fontC == null) {
                                                                    android.util.Log.w("TypefaceCompat", "Unable identify the primary font for " + str3 + ". Falling back to provider font.");
                                                                } else {
                                                                    str4 = dwnVar.g;
                                                                    if (android.text.TextUtils.isEmpty(str4)) {
                                                                        fontFamilyM = ep$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.FontFamily.Builder(fontC));
                                                                    } else {
                                                                        try {
                                                                            fontFamilyM = ep$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.FontFamily.Builder(ep$.ExternalSyntheticApiModelOutline0.m(ep$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.Font.Builder(fontC), str4))));
                                                                        } catch (java.io.IOException unused) {
                                                                            android.util.Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                                        }
                                                                    }
                                                                    if (customFallbackBuilder == null) {
                                                                        customFallbackBuilder = new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyM);
                                                                    } else {
                                                                        ep$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder, fontFamilyM);
                                                                    }
                                                                    i6++;
                                                                    i4 = -1;
                                                                }
                                                            } else {
                                                                alh$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder, dwnVar.f);
                                                            }
                                                        }
                                                        typefaceM = ep$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder);
                                                        break;
                                                    }
                                                }
                                                if (defpackage.dvo.b(((defpackage.dwn) list.get(i5)).f) != null) {
                                                    i5++;
                                                }
                                                typefaceM = null;
                                                break;
                                            }
                                        }
                                        typefaceM = null;
                                        break;
                                    }
                                    typefaceM = defpackage.dvo.b(((defpackage.dwn) list.get(0)).f);
                                }
                                if (typefaceM != null) {
                                    if (dvgVar != null) {
                                        dvgVar.d(typefaceM);
                                    }
                                    defpackage.dvo.b.c(defpackage.dvo.d(resources, i, string, i3, i2), typefaceM);
                                } else {
                                    if (z) {
                                        if (dveVar.c == 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                    } else if (dvgVar == null) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z) {
                                        i7 = dveVar.b;
                                    } else {
                                        i7 = -1;
                                    }
                                    typefaceB = defpackage.dsx.g(context, dveVar.a, i2, z3, i7, new android.os.Handler(android.os.Looper.getMainLooper()), new dvn(dvgVar));
                                }
                                return typefaceM;
                            }
                            typefaceB = defpackage.dvo.a.b(context, (defpackage.sr) srVar, resources, i2);
                            if (dvgVar != null) {
                                if (typefaceB != null) {
                                    dvgVar.d(typefaceB);
                                } else {
                                    dvgVar.c(-3);
                                }
                            }
                            typefaceM = typefaceB;
                            if (typefaceM != null) {
                                defpackage.dvo.b.c(defpackage.dvo.d(resources, i, string, i3, i2), typefaceM);
                            }
                            return typefaceM;
                        }
                        defpackage.dmh.E(xml);
                        srVar = null;
                        if (srVar == null) {
                            android.util.Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (dvgVar != null) {
                                return null;
                            }
                            dvgVar.c(-3);
                            return null;
                        }
                        i3 = typedValue.assetCookie;
                        if (srVar instanceof defpackage.dve) {
                            dveVar = (defpackage.dve) srVar;
                            str2 = dveVar.d;
                            i4 = -1;
                            if (!android.text.TextUtils.isEmpty(str2)) {
                                list = dveVar.a;
                                if (list.size() != 1) {
                                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                                        i5 = 0;
                                        while (true) {
                                            if (i5 >= list.size()) {
                                                i6 = 0;
                                                customFallbackBuilder = null;
                                                while (true) {
                                                    if (i6 < list.size()) {
                                                        dwnVar = (defpackage.dwn) list.get(i6);
                                                        if (i6 == list.size() + i4) {
                                                        }
                                                        str3 = dwnVar.f;
                                                        fontC = defpackage.dvo.c(defpackage.dvo.b(str3));
                                                        if (fontC == null) {
                                                            android.util.Log.w("TypefaceCompat", "Unable identify the primary font for " + str3 + ". Falling back to provider font.");
                                                        } else {
                                                            str4 = dwnVar.g;
                                                            if (android.text.TextUtils.isEmpty(str4)) {
                                                                fontFamilyM = ep$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.FontFamily.Builder(ep$.ExternalSyntheticApiModelOutline0.m(ep$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.Font.Builder(fontC), str4))));
                                                            } else {
                                                                fontFamilyM = ep$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.FontFamily.Builder(fontC));
                                                            }
                                                            if (customFallbackBuilder == null) {
                                                                customFallbackBuilder = new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyM);
                                                            } else {
                                                                ep$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder, fontFamilyM);
                                                            }
                                                            i6++;
                                                            i4 = -1;
                                                        }
                                                    }
                                                    typefaceM = ep$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder);
                                                    break;
                                                }
                                            }
                                            if (defpackage.dvo.b(((defpackage.dwn) list.get(i5)).f) != null) {
                                                i5++;
                                            }
                                            typefaceM = null;
                                            break;
                                        }
                                    }
                                    typefaceM = null;
                                    break;
                                }
                                typefaceM = defpackage.dvo.b(((defpackage.dwn) list.get(0)).f);
                            } else {
                                list = dveVar.a;
                                if (list.size() != 1) {
                                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                                        i5 = 0;
                                        while (true) {
                                            if (i5 >= list.size()) {
                                                i6 = 0;
                                                customFallbackBuilder = null;
                                                while (true) {
                                                    if (i6 < list.size()) {
                                                        dwnVar = (defpackage.dwn) list.get(i6);
                                                        if (i6 == list.size() + i4) {
                                                        }
                                                        str3 = dwnVar.f;
                                                        fontC = defpackage.dvo.c(defpackage.dvo.b(str3));
                                                        if (fontC == null) {
                                                            android.util.Log.w("TypefaceCompat", "Unable identify the primary font for " + str3 + ". Falling back to provider font.");
                                                        } else {
                                                            str4 = dwnVar.g;
                                                            if (android.text.TextUtils.isEmpty(str4)) {
                                                                fontFamilyM = ep$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.FontFamily.Builder(ep$.ExternalSyntheticApiModelOutline0.m(ep$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.Font.Builder(fontC), str4))));
                                                            } else {
                                                                fontFamilyM = ep$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.FontFamily.Builder(fontC));
                                                            }
                                                            if (customFallbackBuilder == null) {
                                                                customFallbackBuilder = new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyM);
                                                            } else {
                                                                ep$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder, fontFamilyM);
                                                            }
                                                            i6++;
                                                            i4 = -1;
                                                        }
                                                    }
                                                    typefaceM = ep$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder);
                                                    break;
                                                }
                                            }
                                            if (defpackage.dvo.b(((defpackage.dwn) list.get(i5)).f) != null) {
                                                i5++;
                                            }
                                            typefaceM = null;
                                            break;
                                        }
                                    }
                                    typefaceM = null;
                                    break;
                                }
                                typefaceM = defpackage.dvo.b(((defpackage.dwn) list.get(0)).f);
                            }
                            if (typefaceM != null) {
                                if (dvgVar != null) {
                                    dvgVar.d(typefaceM);
                                }
                                defpackage.dvo.b.c(defpackage.dvo.d(resources, i, string, i3, i2), typefaceM);
                            } else {
                                if (z) {
                                    if (dveVar.c == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                } else if (dvgVar == null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z) {
                                    i7 = dveVar.b;
                                } else {
                                    i7 = -1;
                                }
                                typefaceB = defpackage.dsx.g(context, dveVar.a, i2, z3, i7, new android.os.Handler(android.os.Looper.getMainLooper()), new dvn(dvgVar));
                            }
                            return typefaceM;
                        }
                        typefaceB = defpackage.dvo.a.b(context, (defpackage.sr) srVar, resources, i2);
                        if (dvgVar != null) {
                            if (typefaceB != null) {
                                dvgVar.d(typefaceB);
                            } else {
                                dvgVar.c(-3);
                            }
                        }
                        typefaceM = typefaceB;
                        if (typefaceM != null) {
                            defpackage.dvo.b.c(defpackage.dvo.d(resources, i, string, i3, i2), typefaceM);
                        }
                        return typefaceM;
                    }
                } while (next != 1);
                throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
            } catch (org.xmlpull.v1.XmlPullParserException e3) {
                e = e3;
                str = string;
            }
        } catch (java.io.IOException e4) {
            e = e4;
            str = string;
        }
    }
}
