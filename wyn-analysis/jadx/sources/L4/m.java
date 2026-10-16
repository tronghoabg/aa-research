package L4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import c8.C1581e;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final B4.f f6907f = B4.f.a(B4.a.f1581c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g, reason: collision with root package name */
    public static final B4.f f6908g = B4.f.a(B4.h.f1590a, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h, reason: collision with root package name */
    public static final B4.f f6909h;

    /* renamed from: i, reason: collision with root package name */
    public static final B4.f f6910i;

    /* renamed from: j, reason: collision with root package name */
    public static final Set f6911j;
    public static final C1581e k;

    /* renamed from: l, reason: collision with root package name */
    public static final ArrayDeque f6912l;

    /* renamed from: a, reason: collision with root package name */
    public final F4.a f6913a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f6914b;

    /* renamed from: c, reason: collision with root package name */
    public final F4.f f6915c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6916d;

    /* renamed from: e, reason: collision with root package name */
    public final r f6917e = r.a();

    static {
        i iVar = k.f6903a;
        Boolean bool = Boolean.FALSE;
        f6909h = B4.f.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f6910i = B4.f.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f6911j = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        k = new C1581e(21);
        DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = Y4.m.f16700a;
        f6912l = new ArrayDeque(0);
    }

    public m(ArrayList arrayList, DisplayMetrics displayMetrics, F4.a aVar, F4.f fVar) {
        this.f6916d = arrayList;
        gc.b.k(displayMetrics, "Argument must not be null");
        this.f6914b = displayMetrics;
        this.f6913a = aVar;
        this.f6915c = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(L4.s r9, android.graphics.BitmapFactory.Options r10, L4.l r11, F4.a r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r11.h()
            r9.h()
        Lc:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = L4.v.f6934b
            r4.lock()
            android.graphics.Bitmap r9 = r9.f(r10)     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.Throwable -> L66
            r4.unlock()
            return r9
        L1f:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = R8.v.h(r6, r1, r7, r2, r8)     // Catch: java.lang.Throwable -> L66
            r1.append(r3)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L66
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = d(r2)     // Catch: java.lang.Throwable -> L66
            r1.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L66
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L66
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L50
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r5)     // Catch: java.lang.Throwable -> L66
        L50:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L65
            r12.f(r0)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L66
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L66
            android.graphics.Bitmap r9 = c(r9, r10, r11, r12)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L66
            java.util.concurrent.locks.Lock r10 = L4.v.f6934b
            r10.unlock()
            return r9
        L64:
            throw r5     // Catch: java.lang.Throwable -> L66
        L65:
            throw r5     // Catch: java.lang.Throwable -> L66
        L66:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = L4.v.f6934b
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.m.c(L4.s, android.graphics.BitmapFactory$Options, L4.l, F4.a):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        f(options);
        ArrayDeque arrayDeque = f6912l;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final c a(s sVar, int i5, int i10, B4.g gVar, l lVar) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f6915c.e(65536, byte[].class);
        synchronized (m.class) {
            ArrayDeque arrayDeque = f6912l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        B4.a aVar = (B4.a) gVar.c(f6907f);
        B4.h hVar = (B4.h) gVar.c(f6908g);
        k kVar = (k) gVar.c(k.f6905c);
        boolean zBooleanValue = ((Boolean) gVar.c(f6909h)).booleanValue();
        B4.f fVar = f6910i;
        try {
            Bitmap bitmapB = b(sVar, options2, kVar, aVar, hVar, gVar.c(fVar) != null && ((Boolean) gVar.c(fVar)).booleanValue(), i5, i10, zBooleanValue, lVar);
            return bitmapB == null ? null : new c(this.f6913a, bitmapB);
        } finally {
            e(options2);
            this.f6915c.i(bArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x039c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x041a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(L4.s r41, android.graphics.BitmapFactory.Options r42, L4.k r43, B4.a r44, B4.h r45, boolean r46, int r47, int r48, boolean r49, L4.l r50) {
        /*
            Method dump skipped, instructions count: 1540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.m.b(L4.s, android.graphics.BitmapFactory$Options, L4.k, B4.a, B4.h, boolean, int, int, boolean, L4.l):android.graphics.Bitmap");
    }
}
