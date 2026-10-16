package d2;

import Q1.x;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.HashSet;
import q2.C3860d;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2386a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f33953a;

    /* renamed from: b, reason: collision with root package name */
    public final e f33954b;

    /* renamed from: c, reason: collision with root package name */
    public final k f33955c;

    /* renamed from: d, reason: collision with root package name */
    public final Dd.c f33956d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33957e;

    /* renamed from: f, reason: collision with root package name */
    public int f33958f = 0;

    public C2386a(MediaCodec mediaCodec, HandlerThread handlerThread, k kVar, Dd.c cVar) {
        this.f33953a = mediaCodec;
        this.f33954b = new e(handlerThread);
        this.f33955c = kVar;
        this.f33956d = cVar;
    }

    public static void a(C2386a c2386a, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i5) {
        Dd.c cVar;
        LoudnessCodecController loudnessCodecController;
        e eVar = c2386a.f33954b;
        Q1.k.g(eVar.f33974c == null);
        HandlerThread handlerThread = eVar.f33973b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = c2386a.f33953a;
        mediaCodec.setCallback(eVar, handler);
        eVar.f33974c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i5);
        Trace.endSection();
        c2386a.f33955c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (x.f9724a >= 35 && (cVar = c2386a.f33956d) != null && ((loudnessCodecController = (LoudnessCodecController) cVar.f2644d) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            Q1.k.g(((HashSet) cVar.f2642b).add(mediaCodec));
        }
        c2386a.f33958f = 1;
    }

    public static String b(int i5, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i5 == 1) {
            sb2.append("Audio");
        } else if (i5 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i5);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // d2.j
    public final void G(int i5) {
        this.f33953a.releaseOutputBuffer(i5, false);
    }

    @Override // d2.j
    public final boolean J(a2.v vVar) {
        e eVar = this.f33954b;
        synchronized (eVar.f33972a) {
            eVar.f33985o = vVar;
        }
        return true;
    }

    @Override // d2.j
    public final void L(C3860d c3860d, Handler handler) {
        this.f33953a.setOnFrameRenderedListener(new V5.a(this, c3860d, 2), handler);
    }

    @Override // d2.j
    public final void c(Bundle bundle) {
        this.f33955c.c(bundle);
    }

    @Override // d2.j
    public final void d(int i5, int i10, long j8, int i11) {
        this.f33955c.d(i5, i10, j8, i11);
    }

    @Override // d2.j
    public final MediaFormat f() {
        MediaFormat mediaFormat;
        e eVar = this.f33954b;
        synchronized (eVar.f33972a) {
            try {
                mediaFormat = eVar.f33979h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // d2.j
    public final void flush() {
        this.f33955c.flush();
        this.f33953a.flush();
        e eVar = this.f33954b;
        synchronized (eVar.f33972a) {
            eVar.f33982l++;
            Handler handler = eVar.f33974c;
            int i5 = x.f9724a;
            handler.post(new com.applovin.adview.a(eVar, 20));
        }
        this.f33953a.start();
    }

    @Override // d2.j
    public final void h(int i5) {
        this.f33953a.setVideoScalingMode(i5);
    }

    @Override // d2.j
    public final ByteBuffer i(int i5) {
        return this.f33953a.getInputBuffer(i5);
    }

    @Override // d2.j
    public final void j(Surface surface) {
        this.f33953a.setOutputSurface(surface);
    }

    @Override // d2.j
    public final void l(int i5, H5.c cVar, long j8, int i10) {
        this.f33955c.l(i5, cVar, j8, i10);
    }

    @Override // d2.j
    public final void n(int i5, long j8) {
        this.f33953a.releaseOutputBuffer(i5, j8);
    }

    @Override // d2.j
    public final int o() {
        this.f33955c.a();
        e eVar = this.f33954b;
        synchronized (eVar.f33972a) {
            try {
                IllegalStateException illegalStateException = eVar.f33984n;
                if (illegalStateException != null) {
                    eVar.f33984n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = eVar.f33981j;
                if (codecException != null) {
                    eVar.f33981j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = eVar.k;
                if (cryptoException != null) {
                    eVar.k = null;
                    throw cryptoException;
                }
                int i5 = -1;
                if (eVar.f33982l > 0 || eVar.f33983m) {
                    return -1;
                }
                G4.f fVar = eVar.f33975d;
                int i10 = fVar.f4233a;
                int i11 = fVar.f4234b;
                if (!(i10 == i11)) {
                    if (i10 == i11) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i5 = ((int[]) fVar.f4236d)[i10];
                    fVar.f4233a = (i10 + 1) & fVar.f4235c;
                }
                return i5;
            } finally {
            }
        }
    }

    @Override // d2.j
    public final int q(MediaCodec.BufferInfo bufferInfo) {
        this.f33955c.a();
        e eVar = this.f33954b;
        synchronized (eVar.f33972a) {
            try {
                IllegalStateException illegalStateException = eVar.f33984n;
                if (illegalStateException != null) {
                    eVar.f33984n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = eVar.f33981j;
                if (codecException != null) {
                    eVar.f33981j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = eVar.k;
                if (cryptoException != null) {
                    eVar.k = null;
                    throw cryptoException;
                }
                if (eVar.f33982l > 0 || eVar.f33983m) {
                    return -1;
                }
                G4.f fVar = eVar.f33976e;
                int i5 = fVar.f4233a;
                int i10 = fVar.f4234b;
                if (i5 == i10) {
                    return -1;
                }
                if (i5 == i10) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i11 = ((int[]) fVar.f4236d)[i5];
                fVar.f4233a = fVar.f4235c & (i5 + 1);
                if (i11 >= 0) {
                    Q1.k.h(eVar.f33979h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) eVar.f33977f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i11 == -2) {
                    eVar.f33979h = (MediaFormat) eVar.f33978g.remove();
                }
                return i11;
            } finally {
            }
        }
    }

    @Override // d2.j
    public final ByteBuffer r(int i5) {
        return this.f33953a.getOutputBuffer(i5);
    }

    @Override // d2.j
    public final void release() {
        Dd.c cVar;
        Dd.c cVar2;
        try {
            if (this.f33958f == 1) {
                this.f33955c.shutdown();
                e eVar = this.f33954b;
                synchronized (eVar.f33972a) {
                    eVar.f33983m = true;
                    eVar.f33973b.quit();
                    eVar.a();
                }
            }
            this.f33958f = 2;
            if (this.f33957e) {
                return;
            }
            try {
                int i5 = x.f9724a;
                if (i5 >= 30 && i5 < 33) {
                    this.f33953a.stop();
                }
                if (i5 >= 35 && (cVar2 = this.f33956d) != null) {
                    cVar2.P(this.f33953a);
                }
                this.f33953a.release();
                this.f33957e = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.f33957e) {
                try {
                    int i10 = x.f9724a;
                    if (i10 >= 30 && i10 < 33) {
                        this.f33953a.stop();
                    }
                    if (i10 >= 35 && (cVar = this.f33956d) != null) {
                        cVar.P(this.f33953a);
                    }
                    this.f33953a.release();
                    this.f33957e = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // d2.j
    public final void v() {
        this.f33953a.detachOutputSurface();
    }
}
