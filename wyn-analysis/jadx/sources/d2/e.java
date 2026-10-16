package d2;

import U1.C0851v;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class e extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f33973b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f33974c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f33979h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f33980i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f33981j;
    public MediaCodec.CryptoException k;

    /* renamed from: l, reason: collision with root package name */
    public long f33982l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f33983m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f33984n;

    /* renamed from: o, reason: collision with root package name */
    public a2.v f33985o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f33972a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final G4.f f33975d = new G4.f();

    /* renamed from: e, reason: collision with root package name */
    public final G4.f f33976e = new G4.f();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f33977f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f33978g = new ArrayDeque();

    public e(HandlerThread handlerThread) {
        this.f33973b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f33978g;
        if (!arrayDeque.isEmpty()) {
            this.f33980i = (MediaFormat) arrayDeque.getLast();
        }
        G4.f fVar = this.f33975d;
        fVar.f4234b = fVar.f4233a;
        G4.f fVar2 = this.f33976e;
        fVar2.f4234b = fVar2.f4233a;
        this.f33977f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f33972a) {
            this.f33984n = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f33972a) {
            this.k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f33972a) {
            this.f33981j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i5) {
        C0851v c0851v;
        synchronized (this.f33972a) {
            this.f33975d.c(i5);
            a2.v vVar = this.f33985o;
            if (vVar != null && (c0851v = ((q) vVar.f17322b).f34016F) != null) {
                c0851v.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i5, MediaCodec.BufferInfo bufferInfo) {
        C0851v c0851v;
        synchronized (this.f33972a) {
            try {
                MediaFormat mediaFormat = this.f33980i;
                if (mediaFormat != null) {
                    this.f33976e.c(-2);
                    this.f33978g.add(mediaFormat);
                    this.f33980i = null;
                }
                this.f33976e.c(i5);
                this.f33977f.add(bufferInfo);
                a2.v vVar = this.f33985o;
                if (vVar != null && (c0851v = ((q) vVar.f17322b).f34016F) != null) {
                    c0851v.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f33972a) {
            this.f33976e.c(-2);
            this.f33978g.add(mediaFormat);
            this.f33980i = null;
        }
    }
}
