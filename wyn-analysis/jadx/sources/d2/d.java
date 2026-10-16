package d2;

import Q1.x;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import s8.C4026b;

/* loaded from: classes.dex */
public final class d implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f33964g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f33965h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f33966a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f33967b;

    /* renamed from: c, reason: collision with root package name */
    public V5.c f33968c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f33969d;

    /* renamed from: e, reason: collision with root package name */
    public final C4026b f33970e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33971f;

    public d(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C4026b c4026b = new C4026b(3);
        this.f33966a = mediaCodec;
        this.f33967b = handlerThread;
        this.f33970e = c4026b;
        this.f33969d = new AtomicReference();
    }

    public static c b() {
        ArrayDeque arrayDeque = f33964g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new c();
                }
                return (c) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(c cVar) {
        ArrayDeque arrayDeque = f33964g;
        synchronized (arrayDeque) {
            arrayDeque.add(cVar);
        }
    }

    @Override // d2.k
    public final void a() {
        RuntimeException runtimeException = (RuntimeException) this.f33969d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // d2.k
    public final void c(Bundle bundle) {
        a();
        V5.c cVar = this.f33968c;
        int i5 = x.f9724a;
        cVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // d2.k
    public final void d(int i5, int i10, long j8, int i11) {
        a();
        c cVarB = b();
        cVarB.f33959a = i5;
        cVarB.f33960b = i10;
        cVarB.f33962d = j8;
        cVarB.f33963e = i11;
        V5.c cVar = this.f33968c;
        int i12 = x.f9724a;
        cVar.obtainMessage(1, cVarB).sendToTarget();
    }

    @Override // d2.k
    public final void flush() {
        if (this.f33971f) {
            try {
                V5.c cVar = this.f33968c;
                cVar.getClass();
                cVar.removeCallbacksAndMessages(null);
                C4026b c4026b = this.f33970e;
                synchronized (c4026b) {
                    c4026b.f45322b = false;
                }
                V5.c cVar2 = this.f33968c;
                cVar2.getClass();
                cVar2.obtainMessage(3).sendToTarget();
                c4026b.a();
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e7);
            }
        }
    }

    @Override // d2.k
    public final void l(int i5, H5.c cVar, long j8, int i10) {
        a();
        c cVarB = b();
        cVarB.f33959a = i5;
        cVarB.f33960b = 0;
        cVarB.f33962d = j8;
        cVarB.f33963e = i10;
        int i11 = cVar.f4899f;
        MediaCodec.CryptoInfo cryptoInfo = cVarB.f33961c;
        cryptoInfo.numSubSamples = i11;
        int[] iArr = cVar.f4897d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = cVar.f4898e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = cVar.f4895b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = cVar.f4894a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = cVar.f4896c;
        if (x.f9724a >= 24) {
            b.o();
            cryptoInfo.setPattern(W1.p.l(cVar.f4900g, cVar.f4901h));
        }
        this.f33968c.obtainMessage(2, cVarB).sendToTarget();
    }

    @Override // d2.k
    public final void shutdown() {
        if (this.f33971f) {
            flush();
            this.f33967b.quit();
        }
        this.f33971f = false;
    }

    @Override // d2.k
    public final void start() {
        if (this.f33971f) {
            return;
        }
        HandlerThread handlerThread = this.f33967b;
        handlerThread.start();
        this.f33968c = new V5.c(this, handlerThread.getLooper(), 3);
        this.f33971f = true;
    }
}
