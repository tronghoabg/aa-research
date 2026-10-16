package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class iaz {
    public static final hul a = new hul("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", hty.c, hul.a);
    public static final hul b = new hul("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, hul.a);
    public static final hul c;
    public static final hul d;
    public static final hul e;
    public static final iay f;
    private static final Queue j;
    public final List g;
    public final hxl h;
    public final htm i;
    private final hxe k;
    private final DisplayMetrics l;
    private final ibi m = ibi.a();

    static {
        iaw iawVar = iaw.b;
        c = new hul("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false, hul.a);
        d = new hul("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false, hul.a);
        e = new hul("com.bumptech.glide.load.resource.bitmap.Downsampler.BypassTransformationsForHardwareBitmaps", false, hul.a);
        DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f = new iax();
        DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = ify.a;
        j = new ArrayDeque(0);
    }

    public iaz(List list, DisplayMetrics displayMetrics, hxe hxeVar, hxl hxlVar, htm htmVar) {
        this.g = list;
        a.al(displayMetrics, "Argument must not be null");
        this.l = displayMetrics;
        a.al(hxeVar, "Argument must not be null");
        this.k = hxeVar;
        a.al(hxlVar, "Argument must not be null");
        this.h = hxlVar;
        this.i = htmVar;
    }

    private static int b(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int c(double d2) {
        return (int) (d2 + 0.5d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap d(defpackage.ibl r9, android.graphics.BitmapFactory.Options r10, defpackage.iay r11, defpackage.hxe r12) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            java.lang.String r1 = "Exception decoding bitmap, outWidth: "
            boolean r2 = r10.inJustDecodeBounds
            if (r2 != 0) goto Le
            r11.b()
            r9.d()
        Le:
            int r2 = r10.outWidth
            int r3 = r10.outHeight
            java.lang.String r4 = r10.outMimeType
            java.util.concurrent.locks.Lock r5 = defpackage.ibt.c
            r5.lock()
            android.graphics.Bitmap r9 = r9.b(r10)     // Catch: java.lang.IllegalArgumentException -> L1e java.lang.Throwable -> L70
            goto L68
        L1e:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L70
            java.lang.String r7 = g(r10)     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L70
            r8.append(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = ", outHeight: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L70
            r8.append(r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = ", outMimeType: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L70
            r8.append(r4)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = ", inBitmap: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L70
            r8.append(r7)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L70
            r6.<init>(r1, r5)     // Catch: java.lang.Throwable -> L70
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L58
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r6)     // Catch: java.lang.Throwable -> L70
        L58:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L6f
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L70
            r12.d(r0)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L70
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L70
            android.graphics.Bitmap r9 = d(r9, r10, r11, r12)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> L70
        L68:
            java.util.concurrent.locks.Lock r10 = defpackage.ibt.c
            r10.unlock()
            return r9
        L6e:
            throw r6     // Catch: java.lang.Throwable -> L70
        L6f:
            throw r6     // Catch: java.lang.Throwable -> L70
        L70:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = defpackage.ibt.c
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iaz.d(ibl, android.graphics.BitmapFactory$Options, iay, hxe):android.graphics.Bitmap");
    }

    private static synchronized BitmapFactory.Options e() {
        BitmapFactory.Options options;
        Queue queue = j;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options != null) {
            return options;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        i(options2);
        return options2;
    }

    private static String f(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        String str = " (" + bitmap.getAllocationByteCount() + ")";
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + String.valueOf(bitmap.getConfig()) + str;
    }

    private static String g(BitmapFactory.Options options) {
        return f(options.inBitmap);
    }

    private static void h(BitmapFactory.Options options) {
        i(options);
        Queue queue = j;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void i(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static boolean j(int i) {
        return i == 90 || i == 270;
    }

    private static boolean k(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static int[] l(ibl iblVar, BitmapFactory.Options options, iay iayVar, hxe hxeVar) throws IOException {
        options.inJustDecodeBounds = true;
        d(iblVar, options, iayVar, hxeVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:0|2|(1:11)(27:6|(2:8|(1:10))|13|(1:18)(1:17)|221|19|(1:(1:22)(20:23|26|27|33|(2:35|(1:37)(1:38))|(2:40|(1:42)(1:43))|44|45|229|(1:(1:48)(7:49|230|50|(1:52)(1:53)|(1:55)(1:56)|57|(28:59|60|(2:223|62)(1:66)|67|(1:71)|72|(3:74|75|(1:77))(2:79|(2:95|96)(2:84|(1:86)(2:87|(1:93)(1:92))))|97|(2:99|100)(2:102|103)|101|104|(3:106|107|108)(1:109)|118|227|119|(1:121)(3:122|123|(5:234|125|(1:127)(1:132)|133|(1:135))(1:136))|137|(5:142|(1:144)(1:145)|146|(1:148)(1:149)|150)(1:141)|(2:153|(3:156|(1:158)|159)(1:155))|(3:161|(1:168)(1:167)|169)|170|(1:176)|177|(7:179|180|232|181|182|225|183)(1:186)|(4:188|(1:190)(3:191|192|201)|202|(1:204))(1:207)|208|209|210)(2:110|111)))(1:114)|115|(1:117)|118|227|119|(0)(0)|137|(15:142|(0)(0)|146|(0)(0)|150|(2:153|(0)(0))|(0)|170|(2:174|176)|177|(0)(0)|(0)(0)|208|209|210)(0)|219|220))(1:24)|25|26|27|33|(0)|(0)|44|45|229|(0)(0)|115|(0)|118|227|119|(0)(0)|137|(0)(0)|219|220)|12|13|(2:15|18)(0)|221|19|(0)(0)|25|26|27|33|(0)|(0)|44|45|229|(0)(0)|115|(0)|118|227|119|(0)(0)|137|(0)(0)|219|220|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0598, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x059a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x05a0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x05a1, code lost:
    
        r9 = r43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fc A[Catch: all -> 0x059a, TRY_LEAVE, TryCatch #4 {all -> 0x059a, blocks: (B:115:0x02f6, B:117:0x02fc, B:108:0x0282, B:110:0x02a7, B:111:0x02ea), top: B:229:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0330 A[Catch: all -> 0x0598, TryCatch #3 {all -> 0x0598, blocks: (B:119:0x0324, B:121:0x0330, B:137:0x0378, B:153:0x0411, B:156:0x041c, B:158:0x0422, B:159:0x0424, B:161:0x042c, B:163:0x0432, B:165:0x0438, B:167:0x0442, B:169:0x044b, B:168:0x0447, B:170:0x0452, B:174:0x0463, B:176:0x046c, B:177:0x0477, B:179:0x047e, B:142:0x0386, B:144:0x038c, B:146:0x0396, B:148:0x03bf, B:122:0x033a, B:125:0x0340, B:127:0x034a, B:133:0x0368, B:135:0x0370, B:132:0x0366, B:136:0x0374, B:129:0x034e, B:131:0x0355), top: B:227:0x0324, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x033a A[Catch: all -> 0x0598, TRY_LEAVE, TryCatch #3 {all -> 0x0598, blocks: (B:119:0x0324, B:121:0x0330, B:137:0x0378, B:153:0x0411, B:156:0x041c, B:158:0x0422, B:159:0x0424, B:161:0x042c, B:163:0x0432, B:165:0x0438, B:167:0x0442, B:169:0x044b, B:168:0x0447, B:170:0x0452, B:174:0x0463, B:176:0x046c, B:177:0x0477, B:179:0x047e, B:142:0x0386, B:144:0x038c, B:146:0x0396, B:148:0x03bf, B:122:0x033a, B:125:0x0340, B:127:0x034a, B:133:0x0368, B:135:0x0370, B:132:0x0366, B:136:0x0374, B:129:0x034e, B:131:0x0355), top: B:227:0x0324, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x037c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0386 A[Catch: all -> 0x0598, TryCatch #3 {all -> 0x0598, blocks: (B:119:0x0324, B:121:0x0330, B:137:0x0378, B:153:0x0411, B:156:0x041c, B:158:0x0422, B:159:0x0424, B:161:0x042c, B:163:0x0432, B:165:0x0438, B:167:0x0442, B:169:0x044b, B:168:0x0447, B:170:0x0452, B:174:0x0463, B:176:0x046c, B:177:0x0477, B:179:0x047e, B:142:0x0386, B:144:0x038c, B:146:0x0396, B:148:0x03bf, B:122:0x033a, B:125:0x0340, B:127:0x034a, B:133:0x0368, B:135:0x0370, B:132:0x0366, B:136:0x0374, B:129:0x034e, B:131:0x0355), top: B:227:0x0324, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x038c A[Catch: all -> 0x0598, TryCatch #3 {all -> 0x0598, blocks: (B:119:0x0324, B:121:0x0330, B:137:0x0378, B:153:0x0411, B:156:0x041c, B:158:0x0422, B:159:0x0424, B:161:0x042c, B:163:0x0432, B:165:0x0438, B:167:0x0442, B:169:0x044b, B:168:0x0447, B:170:0x0452, B:174:0x0463, B:176:0x046c, B:177:0x0477, B:179:0x047e, B:142:0x0386, B:144:0x038c, B:146:0x0396, B:148:0x03bf, B:122:0x033a, B:125:0x0340, B:127:0x034a, B:133:0x0368, B:135:0x0370, B:132:0x0366, B:136:0x0374, B:129:0x034e, B:131:0x0355), top: B:227:0x0324, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03bf A[Catch: all -> 0x0598, TryCatch #3 {all -> 0x0598, blocks: (B:119:0x0324, B:121:0x0330, B:137:0x0378, B:153:0x0411, B:156:0x041c, B:158:0x0422, B:159:0x0424, B:161:0x042c, B:163:0x0432, B:165:0x0438, B:167:0x0442, B:169:0x044b, B:168:0x0447, B:170:0x0452, B:174:0x0463, B:176:0x046c, B:177:0x0477, B:179:0x047e, B:142:0x0386, B:144:0x038c, B:146:0x0396, B:148:0x03bf, B:122:0x033a, B:125:0x0340, B:127:0x034a, B:133:0x0368, B:135:0x0370, B:132:0x0366, B:136:0x0374, B:129:0x034e, B:131:0x0355), top: B:227:0x0324, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x041c A[Catch: all -> 0x0598, TryCatch #3 {all -> 0x0598, blocks: (B:119:0x0324, B:121:0x0330, B:137:0x0378, B:153:0x0411, B:156:0x041c, B:158:0x0422, B:159:0x0424, B:161:0x042c, B:163:0x0432, B:165:0x0438, B:167:0x0442, B:169:0x044b, B:168:0x0447, B:170:0x0452, B:174:0x0463, B:176:0x046c, B:177:0x0477, B:179:0x047e, B:142:0x0386, B:144:0x038c, B:146:0x0396, B:148:0x03bf, B:122:0x033a, B:125:0x0340, B:127:0x034a, B:133:0x0368, B:135:0x0370, B:132:0x0366, B:136:0x0374, B:129:0x034e, B:131:0x0355), top: B:227:0x0324, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x042c A[Catch: all -> 0x0598, TryCatch #3 {all -> 0x0598, blocks: (B:119:0x0324, B:121:0x0330, B:137:0x0378, B:153:0x0411, B:156:0x041c, B:158:0x0422, B:159:0x0424, B:161:0x042c, B:163:0x0432, B:165:0x0438, B:167:0x0442, B:169:0x044b, B:168:0x0447, B:170:0x0452, B:174:0x0463, B:176:0x046c, B:177:0x0477, B:179:0x047e, B:142:0x0386, B:144:0x038c, B:146:0x0396, B:148:0x03bf, B:122:0x033a, B:125:0x0340, B:127:0x034a, B:133:0x0368, B:135:0x0370, B:132:0x0366, B:136:0x0374, B:129:0x034e, B:131:0x0355), top: B:227:0x0324, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x047e A[Catch: all -> 0x0598, TRY_LEAVE, TryCatch #3 {all -> 0x0598, blocks: (B:119:0x0324, B:121:0x0330, B:137:0x0378, B:153:0x0411, B:156:0x041c, B:158:0x0422, B:159:0x0424, B:161:0x042c, B:163:0x0432, B:165:0x0438, B:167:0x0442, B:169:0x044b, B:168:0x0447, B:170:0x0452, B:174:0x0463, B:176:0x046c, B:177:0x0477, B:179:0x047e, B:142:0x0386, B:144:0x038c, B:146:0x0396, B:148:0x03bf, B:122:0x033a, B:125:0x0340, B:127:0x034a, B:133:0x0368, B:135:0x0370, B:132:0x0366, B:136:0x0374, B:129:0x034e, B:131:0x0355), top: B:227:0x0324, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0516 A[Catch: all -> 0x0586, TryCatch #2 {all -> 0x0586, blocks: (B:183:0x049d, B:188:0x0516, B:202:0x057c, B:204:0x0582, B:208:0x0589, B:191:0x0527, B:192:0x0534, B:201:0x0564, B:194:0x0538, B:195:0x053c, B:196:0x0545, B:197:0x0549, B:198:0x0552, B:199:0x055b, B:200:0x055f), top: B:225:0x049d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0 A[Catch: all -> 0x05a0, TryCatch #0 {all -> 0x05a0, blocks: (B:19:0x0095, B:26:0x00bc, B:27:0x00c2, B:33:0x00d6, B:35:0x00e0, B:40:0x00eb, B:44:0x00f4), top: B:221:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb A[Catch: all -> 0x05a0, TryCatch #0 {all -> 0x05a0, blocks: (B:19:0x0095, B:26:0x00bc, B:27:0x00c2, B:33:0x00d6, B:35:0x00e0, B:40:0x00eb, B:44:0x00f4), top: B:221:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010a  */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.graphics.BitmapFactory$Options] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hwx a(defpackage.ibl r44, int r45, int r46, defpackage.hum r47, defpackage.iay r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iaz.a(ibl, int, int, hum, iay):hwx");
    }
}
