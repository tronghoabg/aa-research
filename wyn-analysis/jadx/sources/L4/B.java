package L4;

import A7.AbstractC0279p0;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class B implements B4.i {

    /* renamed from: d, reason: collision with root package name */
    public static final B4.f f6882d = new B4.f("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new y());

    /* renamed from: e, reason: collision with root package name */
    public static final B4.f f6883e = new B4.f("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new xa.d(15));

    /* renamed from: f, reason: collision with root package name */
    public static final x4.d f6884f = new x4.d(21);

    /* renamed from: a, reason: collision with root package name */
    public final A f6885a;

    /* renamed from: b, reason: collision with root package name */
    public final F4.a f6886b;

    /* renamed from: c, reason: collision with root package name */
    public final x4.d f6887c = f6884f;

    public B(F4.a aVar, A a5) {
        this.f6886b = aVar;
        this.f6885a = a5;
    }

    public static Bitmap c(MediaMetadataRetriever mediaMetadataRetriever, long j8, int i5, int i10, int i11, k kVar) {
        Bitmap scaledFrameAtTime = null;
        if (Build.VERSION.SDK_INT >= 27 && i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && kVar != k.f6903a) {
            try {
                int i12 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (i14 == 90 || i14 == 270) {
                    i13 = i12;
                    i12 = i13;
                }
                float fB = kVar.b(i12, i13, i10, i11);
                scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j8, i5, Math.round(i12 * fB), Math.round(fB * i13));
            } catch (Throwable th) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
                }
            }
        }
        return scaledFrameAtTime == null ? mediaMetadataRetriever.getFrameAtTime(j8, i5) : scaledFrameAtTime;
    }

    @Override // B4.i
    public final E4.B a(Object obj, int i5, int i10, B4.g gVar) throws IOException {
        long jLongValue = ((Long) gVar.c(f6882d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(AbstractC0279p0.k(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) gVar.c(f6883e);
        if (num == null) {
            num = 2;
        }
        k kVar = (k) gVar.c(k.f6905c);
        if (kVar == null) {
            kVar = k.f6904b;
        }
        k kVar2 = kVar;
        this.f6887c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                this.f6885a.j(mediaMetadataRetriever, obj);
                Bitmap bitmapC = c(mediaMetadataRetriever, jLongValue, num.intValue(), i5, i10, kVar2);
                mediaMetadataRetriever.release();
                F4.a aVar = this.f6886b;
                if (bitmapC == null) {
                    return null;
                }
                return new c(aVar, bitmapC);
            } catch (RuntimeException e7) {
                throw new IOException(e7);
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    @Override // B4.i
    public final boolean b(Object obj, B4.g gVar) {
        return true;
    }
}
