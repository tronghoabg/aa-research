package V5;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class f extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f13039b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f13040c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f13045h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f13046i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f13047j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13048l;

    /* renamed from: m, reason: collision with root package name */
    public IllegalStateException f13049m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f13038a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final M2.f f13041d = new M2.f();

    /* renamed from: e, reason: collision with root package name */
    public final M2.f f13042e = new M2.f();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f13043f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f13044g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f13039b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f13044g;
        if (!arrayDeque.isEmpty()) {
            this.f13046i = (MediaFormat) arrayDeque.getLast();
        }
        M2.f fVar = this.f13041d;
        fVar.f7310b = 0;
        fVar.f7311c = -1;
        fVar.f7312d = 0;
        M2.f fVar2 = this.f13042e;
        fVar2.f7310b = 0;
        fVar2.f7311c = -1;
        fVar2.f7312d = 0;
        this.f13043f.clear();
        arrayDeque.clear();
        this.f13047j = null;
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f13038a) {
            this.f13049m = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f13038a) {
            this.f13047j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i5) {
        synchronized (this.f13038a) {
            this.f13041d.b(i5);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i5, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f13038a) {
            try {
                MediaFormat mediaFormat = this.f13046i;
                if (mediaFormat != null) {
                    this.f13042e.b(-2);
                    this.f13044g.add(mediaFormat);
                    this.f13046i = null;
                }
                this.f13042e.b(i5);
                this.f13043f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f13038a) {
            this.f13042e.b(-2);
            this.f13044g.add(mediaFormat);
            this.f13046i = null;
        }
    }
}
