package com.bumptech.glide.load.c.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final com.bumptech.glide.load.r f3364a = com.bumptech.glide.load.r.c("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", com.bumptech.glide.load.a.f2937c);

    /* renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.r f3365b = com.bumptech.glide.load.r.b("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: c, reason: collision with root package name */
    public static final com.bumptech.glide.load.r f3366c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.bumptech.glide.load.r f3367d;

    /* renamed from: e, reason: collision with root package name */
    private static final v f3368e;

    /* renamed from: f, reason: collision with root package name */
    private static final Queue f3369f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.c f3370g;

    /* renamed from: h, reason: collision with root package name */
    private final DisplayMetrics f3371h;

    /* renamed from: i, reason: collision with root package name */
    private final List f3372i;

    /* renamed from: j, reason: collision with root package name */
    private final ag f3373j = ag.a();

    /* renamed from: k, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.j f3374k;

    static {
        t tVar = t.f3357b;
        f3366c = com.bumptech.glide.load.r.c("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false);
        f3367d = com.bumptech.glide.load.r.c("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false);
        DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f3368e = new u();
        DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        int i2 = com.bumptech.glide.g.r.f2918a;
        f3369f = new ArrayDeque(0);
    }

    public w(List list, DisplayMetrics displayMetrics, com.bumptech.glide.load.a.a.c cVar, com.bumptech.glide.load.a.a.j jVar) {
        this.f3372i = list;
        com.bumptech.glide.g.p.f(displayMetrics);
        this.f3371h = displayMetrics;
        com.bumptech.glide.g.p.f(cVar);
        this.f3370g = cVar;
        com.bumptech.glide.g.p.f(jVar);
        this.f3374k = jVar;
    }

    private static int d(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int e(double d2) {
        return (int) (d2 + 0.5d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap f(com.bumptech.glide.load.c.a.ai r9, android.graphics.BitmapFactory.Options r10, com.bumptech.glide.load.c.a.v r11, com.bumptech.glide.load.a.a.c r12) {
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
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.c.a.as.d()
            r5.lock()
            android.graphics.Bitmap r9 = r9.b(r10)     // Catch: java.lang.IllegalArgumentException -> L20 java.lang.Throwable -> L74
            goto L6a
        L20:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L74
            java.lang.String r7 = j(r10)     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L74
            r8.append(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = ", outHeight: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L74
            r8.append(r3)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = ", outMimeType: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L74
            r8.append(r4)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = ", inBitmap: "
            r8.append(r1)     // Catch: java.lang.Throwable -> L74
            r8.append(r7)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L74
            r6.<init>(r1, r5)     // Catch: java.lang.Throwable -> L74
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L5a
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r6)     // Catch: java.lang.Throwable -> L74
        L5a:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L73
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.io.IOException -> L72 java.lang.Throwable -> L74
            r12.d(r0)     // Catch: java.io.IOException -> L72 java.lang.Throwable -> L74
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L72 java.lang.Throwable -> L74
            android.graphics.Bitmap r9 = f(r9, r10, r11, r12)     // Catch: java.io.IOException -> L72 java.lang.Throwable -> L74
        L6a:
            java.util.concurrent.locks.Lock r10 = com.bumptech.glide.load.c.a.as.d()
            r10.unlock()
            return r9
        L72:
            throw r6     // Catch: java.lang.Throwable -> L74
        L73:
            throw r6     // Catch: java.lang.Throwable -> L74
        L74:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = com.bumptech.glide.load.c.a.as.d()
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.c.a.w.f(com.bumptech.glide.load.c.a.ai, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.c.a.v, com.bumptech.glide.load.a.a.c):android.graphics.Bitmap");
    }

    private static synchronized BitmapFactory.Options g() {
        BitmapFactory.Options options;
        Queue queue = f3369f;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options != null) {
            return options;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        l(options2);
        return options2;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0349 A[Catch: all -> 0x0557, TryCatch #1 {all -> 0x0557, blocks: (B:94:0x02e9, B:96:0x02f5, B:112:0x033d, B:127:0x03ce, B:130:0x03d9, B:132:0x03df, B:133:0x03e1, B:135:0x03e9, B:137:0x03ef, B:139:0x03f5, B:141:0x03ff, B:143:0x0408, B:142:0x0404, B:144:0x040f, B:148:0x0422, B:150:0x042b, B:151:0x0436, B:153:0x043d, B:117:0x0349, B:119:0x034f, B:121:0x0359, B:123:0x0382, B:97:0x02ff, B:100:0x0305, B:102:0x030f, B:108:0x032d, B:110:0x0335, B:107:0x032b, B:111:0x0339, B:104:0x0313, B:106:0x031a), top: B:196:0x02e9, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x034f A[Catch: all -> 0x0557, TryCatch #1 {all -> 0x0557, blocks: (B:94:0x02e9, B:96:0x02f5, B:112:0x033d, B:127:0x03ce, B:130:0x03d9, B:132:0x03df, B:133:0x03e1, B:135:0x03e9, B:137:0x03ef, B:139:0x03f5, B:141:0x03ff, B:143:0x0408, B:142:0x0404, B:144:0x040f, B:148:0x0422, B:150:0x042b, B:151:0x0436, B:153:0x043d, B:117:0x0349, B:119:0x034f, B:121:0x0359, B:123:0x0382, B:97:0x02ff, B:100:0x0305, B:102:0x030f, B:108:0x032d, B:110:0x0335, B:107:0x032b, B:111:0x0339, B:104:0x0313, B:106:0x031a), top: B:196:0x02e9, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0382 A[Catch: all -> 0x0557, TryCatch #1 {all -> 0x0557, blocks: (B:94:0x02e9, B:96:0x02f5, B:112:0x033d, B:127:0x03ce, B:130:0x03d9, B:132:0x03df, B:133:0x03e1, B:135:0x03e9, B:137:0x03ef, B:139:0x03f5, B:141:0x03ff, B:143:0x0408, B:142:0x0404, B:144:0x040f, B:148:0x0422, B:150:0x042b, B:151:0x0436, B:153:0x043d, B:117:0x0349, B:119:0x034f, B:121:0x0359, B:123:0x0382, B:97:0x02ff, B:100:0x0305, B:102:0x030f, B:108:0x032d, B:110:0x0335, B:107:0x032b, B:111:0x0339, B:104:0x0313, B:106:0x031a), top: B:196:0x02e9, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03d9 A[Catch: all -> 0x0557, TryCatch #1 {all -> 0x0557, blocks: (B:94:0x02e9, B:96:0x02f5, B:112:0x033d, B:127:0x03ce, B:130:0x03d9, B:132:0x03df, B:133:0x03e1, B:135:0x03e9, B:137:0x03ef, B:139:0x03f5, B:141:0x03ff, B:143:0x0408, B:142:0x0404, B:144:0x040f, B:148:0x0422, B:150:0x042b, B:151:0x0436, B:153:0x043d, B:117:0x0349, B:119:0x034f, B:121:0x0359, B:123:0x0382, B:97:0x02ff, B:100:0x0305, B:102:0x030f, B:108:0x032d, B:110:0x0335, B:107:0x032b, B:111:0x0339, B:104:0x0313, B:106:0x031a), top: B:196:0x02e9, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03e9 A[Catch: all -> 0x0557, TryCatch #1 {all -> 0x0557, blocks: (B:94:0x02e9, B:96:0x02f5, B:112:0x033d, B:127:0x03ce, B:130:0x03d9, B:132:0x03df, B:133:0x03e1, B:135:0x03e9, B:137:0x03ef, B:139:0x03f5, B:141:0x03ff, B:143:0x0408, B:142:0x0404, B:144:0x040f, B:148:0x0422, B:150:0x042b, B:151:0x0436, B:153:0x043d, B:117:0x0349, B:119:0x034f, B:121:0x0359, B:123:0x0382, B:97:0x02ff, B:100:0x0305, B:102:0x030f, B:108:0x032d, B:110:0x0335, B:107:0x032b, B:111:0x0339, B:104:0x0313, B:106:0x031a), top: B:196:0x02e9, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x043d A[Catch: all -> 0x0557, TRY_LEAVE, TryCatch #1 {all -> 0x0557, blocks: (B:94:0x02e9, B:96:0x02f5, B:112:0x033d, B:127:0x03ce, B:130:0x03d9, B:132:0x03df, B:133:0x03e1, B:135:0x03e9, B:137:0x03ef, B:139:0x03f5, B:141:0x03ff, B:143:0x0408, B:142:0x0404, B:144:0x040f, B:148:0x0422, B:150:0x042b, B:151:0x0436, B:153:0x043d, B:117:0x0349, B:119:0x034f, B:121:0x0359, B:123:0x0382, B:97:0x02ff, B:100:0x0305, B:102:0x030f, B:108:0x032d, B:110:0x0335, B:107:0x032b, B:111:0x0339, B:104:0x0313, B:106:0x031a), top: B:196:0x02e9, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04d5 A[Catch: all -> 0x0545, TryCatch #0 {all -> 0x0545, blocks: (B:157:0x045c, B:162:0x04d5, B:176:0x053b, B:178:0x0541, B:182:0x0548, B:165:0x04e6, B:166:0x04f3, B:175:0x0523, B:168:0x04f7, B:169:0x04fb, B:170:0x0504, B:171:0x0508, B:172:0x0511, B:173:0x051a, B:174:0x051e), top: B:194:0x045c }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7 A[Catch: all -> 0x055d, TryCatch #5 {all -> 0x055d, blocks: (B:8:0x006c, B:15:0x0093, B:16:0x0099, B:22:0x00ad, B:24:0x00b7, B:29:0x00c2, B:34:0x00cd), top: B:203:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2 A[Catch: all -> 0x055d, TryCatch #5 {all -> 0x055d, blocks: (B:8:0x006c, B:15:0x0093, B:16:0x0099, B:22:0x00ad, B:24:0x00b7, B:29:0x00c2, B:34:0x00cd), top: B:203:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b5 A[Catch: all -> 0x0559, TryCatch #3 {all -> 0x0559, blocks: (B:40:0x00ed, B:47:0x0103, B:49:0x010d, B:51:0x0134, B:53:0x013d, B:55:0x0147, B:57:0x014e, B:58:0x014f, B:60:0x0155, B:62:0x016f, B:79:0x01b7, B:81:0x01e3, B:84:0x01ef, B:86:0x01f5, B:83:0x01e8, B:63:0x0172, B:65:0x0176, B:68:0x017b, B:70:0x0181, B:71:0x018e, B:73:0x0192, B:76:0x0197, B:77:0x019c, B:78:0x01a7, B:52:0x0139, B:88:0x0272, B:89:0x02b4, B:90:0x02b5, B:92:0x02c1), top: B:200:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c1 A[Catch: all -> 0x0559, TRY_LEAVE, TryCatch #3 {all -> 0x0559, blocks: (B:40:0x00ed, B:47:0x0103, B:49:0x010d, B:51:0x0134, B:53:0x013d, B:55:0x0147, B:57:0x014e, B:58:0x014f, B:60:0x0155, B:62:0x016f, B:79:0x01b7, B:81:0x01e3, B:84:0x01ef, B:86:0x01f5, B:83:0x01e8, B:63:0x0172, B:65:0x0176, B:68:0x017b, B:70:0x0181, B:71:0x018e, B:73:0x0192, B:76:0x0197, B:77:0x019c, B:78:0x01a7, B:52:0x0139, B:88:0x0272, B:89:0x02b4, B:90:0x02b5, B:92:0x02c1), top: B:200:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f5 A[Catch: all -> 0x0557, TryCatch #1 {all -> 0x0557, blocks: (B:94:0x02e9, B:96:0x02f5, B:112:0x033d, B:127:0x03ce, B:130:0x03d9, B:132:0x03df, B:133:0x03e1, B:135:0x03e9, B:137:0x03ef, B:139:0x03f5, B:141:0x03ff, B:143:0x0408, B:142:0x0404, B:144:0x040f, B:148:0x0422, B:150:0x042b, B:151:0x0436, B:153:0x043d, B:117:0x0349, B:119:0x034f, B:121:0x0359, B:123:0x0382, B:97:0x02ff, B:100:0x0305, B:102:0x030f, B:108:0x032d, B:110:0x0335, B:107:0x032b, B:111:0x0339, B:104:0x0313, B:106:0x031a), top: B:196:0x02e9, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ff A[Catch: all -> 0x0557, TRY_LEAVE, TryCatch #1 {all -> 0x0557, blocks: (B:94:0x02e9, B:96:0x02f5, B:112:0x033d, B:127:0x03ce, B:130:0x03d9, B:132:0x03df, B:133:0x03e1, B:135:0x03e9, B:137:0x03ef, B:139:0x03f5, B:141:0x03ff, B:143:0x0408, B:142:0x0404, B:144:0x040f, B:148:0x0422, B:150:0x042b, B:151:0x0436, B:153:0x043d, B:117:0x0349, B:119:0x034f, B:121:0x0359, B:123:0x0382, B:97:0x02ff, B:100:0x0305, B:102:0x030f, B:108:0x032d, B:110:0x0335, B:107:0x032b, B:111:0x0339, B:104:0x0313, B:106:0x031a), top: B:196:0x02e9, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.bumptech.glide.load.a.aw h(com.bumptech.glide.load.c.a.ai r44, int r45, int r46, com.bumptech.glide.load.s r47, com.bumptech.glide.load.c.a.v r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.c.a.w.h(com.bumptech.glide.load.c.a.ai, int, int, com.bumptech.glide.load.s, com.bumptech.glide.load.c.a.v):com.bumptech.glide.load.a.aw");
    }

    private static String i(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        String str = " (" + bitmap.getAllocationByteCount() + ")";
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + String.valueOf(bitmap.getConfig()) + str;
    }

    private static String j(BitmapFactory.Options options) {
        return i(options.inBitmap);
    }

    private static void k(BitmapFactory.Options options) {
        l(options);
        Queue queue = f3369f;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void l(BitmapFactory.Options options) {
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

    private static boolean m(int i2) {
        return i2 == 90 || i2 == 270;
    }

    private static boolean n(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static int[] o(ai aiVar, BitmapFactory.Options options, v vVar, com.bumptech.glide.load.a.a.c cVar) {
        options.inJustDecodeBounds = true;
        f(aiVar, options, vVar, cVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public final com.bumptech.glide.load.a.aw a(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, com.bumptech.glide.load.s sVar) {
        return h(new ah(parcelFileDescriptor, this.f3372i, this.f3374k, 2), i2, i3, sVar, f3368e);
    }

    public final com.bumptech.glide.load.a.aw b(ByteBuffer byteBuffer, int i2, int i3, com.bumptech.glide.load.s sVar) {
        return h(new ah(byteBuffer, this.f3372i, this.f3374k, 1), i2, i3, sVar, f3368e);
    }

    public final com.bumptech.glide.load.a.aw c(InputStream inputStream, int i2, int i3, com.bumptech.glide.load.s sVar, v vVar) {
        return h(new ah(inputStream, this.f3372i, this.f3374k, 0), i2, i3, sVar, vVar);
    }
}
