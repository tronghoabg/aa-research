package P4;

import A.e0;
import R8.v;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import x9.C4504d;

/* loaded from: classes.dex */
public final class a implements B4.i {

    /* renamed from: f, reason: collision with root package name */
    public static final C4504d f9099f = new C4504d(24);

    /* renamed from: g, reason: collision with root package name */
    public static final e0 f9100g = new e0(17);

    /* renamed from: a, reason: collision with root package name */
    public final Context f9101a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9102b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f9103c;

    /* renamed from: d, reason: collision with root package name */
    public final C4504d f9104d;

    /* renamed from: e, reason: collision with root package name */
    public final S3.c f9105e;

    public a(Context context, ArrayList arrayList, F4.a aVar, F4.f fVar) {
        C4504d c4504d = f9099f;
        this.f9101a = context.getApplicationContext();
        this.f9102b = arrayList;
        this.f9104d = c4504d;
        this.f9105e = new S3.c(aVar, false, fVar, 16);
        this.f9103c = f9100g;
    }

    public static int d(A4.b bVar, int i5, int i10) {
        int iMin = Math.min(bVar.f317g / i10, bVar.f316f / i5);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbH = v.h("Downsampling GIF, sampleSize: ", iMax, ", target dimens: [", i5, "x");
            sbH.append(i10);
            sbH.append("], actual dimens: [");
            sbH.append(bVar.f316f);
            sbH.append("x");
            sbH.append(bVar.f317g);
            sbH.append("]");
            Log.v("BufferGifDecoder", sbH.toString());
        }
        return iMax;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x005b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // B4.i
    public final E4.B a(java.lang.Object r8, int r9, int r10, B4.g r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            A.e0 r8 = r7.f9103c
            monitor-enter(r8)
            java.lang.Object r0 = r8.f152b     // Catch: java.lang.Throwable -> L56
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L56
            A4.c r0 = (A4.c) r0     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L17
            A4.c r0 = new A4.c     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
        L17:
            r5 = r0
            goto L1d
        L19:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L59
        L1d:
            r0 = 0
            r5.f322b = r0     // Catch: java.lang.Throwable -> L56
            byte[] r0 = r5.f321a     // Catch: java.lang.Throwable -> L56
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L56
            A4.b r0 = new A4.b     // Catch: java.lang.Throwable -> L56
            r0.<init>()     // Catch: java.lang.Throwable -> L56
            r5.f323c = r0     // Catch: java.lang.Throwable -> L56
            r5.f324d = r1     // Catch: java.lang.Throwable -> L56
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L56
            r5.f322b = r0     // Catch: java.lang.Throwable -> L56
            r0.position(r1)     // Catch: java.lang.Throwable -> L56
            java.nio.ByteBuffer r0 = r5.f322b     // Catch: java.lang.Throwable -> L56
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L56
            r0.order(r1)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            N4.a r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4e
            A.e0 r9 = r1.f9103c
            r9.x(r5)
            return r8
        L4e:
            r0 = move-exception
            r8 = r0
            A.e0 r9 = r1.f9103c
            r9.x(r5)
            throw r8
        L56:
            r0 = move-exception
            r1 = r7
        L58:
            r9 = r0
        L59:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5b
            throw r9
        L5b:
            r0 = move-exception
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.a.a(java.lang.Object, int, int, B4.g):E4.B");
    }

    @Override // B4.i
    public final boolean b(Object obj, B4.g gVar) {
        ImageHeaderParser$ImageType imageHeaderParser$ImageType;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!((Boolean) gVar.c(i.f9141b)).booleanValue()) {
            if (byteBuffer == null) {
                imageHeaderParser$ImageType = ImageHeaderParser$ImageType.UNKNOWN;
            } else {
                ArrayList arrayList = this.f9102b;
                int size = arrayList.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        imageHeaderParser$ImageType = ImageHeaderParser$ImageType.UNKNOWN;
                        break;
                    }
                    ImageHeaderParser$ImageType imageHeaderParser$ImageTypeB = ((B4.c) arrayList.get(i5)).b(byteBuffer);
                    if (imageHeaderParser$ImageTypeB != ImageHeaderParser$ImageType.UNKNOWN) {
                        imageHeaderParser$ImageType = imageHeaderParser$ImageTypeB;
                        break;
                    }
                    i5++;
                }
            }
            if (imageHeaderParser$ImageType == ImageHeaderParser$ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    public final N4.a c(ByteBuffer byteBuffer, int i5, int i10, A4.c cVar, B4.g gVar) {
        StringBuilder sb2;
        int i11 = Y4.i.f16694b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            A4.b bVarB = cVar.b();
            if (bVarB.f313c > 0 && bVarB.f312b == 0) {
                Bitmap.Config config = gVar.c(i.f9140a) == B4.a.f1580b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iD = d(bVarB, i5, i10);
                C4504d c4504d = this.f9104d;
                S3.c cVar2 = this.f9105e;
                c4504d.getClass();
                A4.d dVar = new A4.d(cVar2, bVarB, byteBuffer, iD);
                dVar.c(config);
                dVar.k = (dVar.k + 1) % dVar.f335l.f313c;
                Bitmap bitmapB = dVar.b();
                if (bitmapB == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb2 = new StringBuilder("Decoded GIF from stream in ");
                        sb2.append(Y4.i.a(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb2.toString());
                        return null;
                    }
                    return null;
                }
                N4.a aVar = new N4.a(new c(new b(new h(com.bumptech.glide.b.b(this.f9101a), dVar, i5, i10, bitmapB), 0)), 1);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + Y4.i.a(jElapsedRealtimeNanos));
                }
                return aVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb2 = new StringBuilder("Decoded GIF from stream in ");
                sb2.append(Y4.i.a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb2.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + Y4.i.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
