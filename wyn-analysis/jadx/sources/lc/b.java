package Lc;

import C8.g;
import V5.c;
import V5.d;
import V5.e;
import V5.f;
import V5.k;
import W1.p;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.android.gms.common.api.internal.C1701o;
import com.google.android.gms.common.api.internal.C1703q;
import com.google.android.gms.common.api.internal.C1707v;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.common.api.internal.S;
import com.google.android.gms.common.api.internal.T;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.nio.ByteBuffer;
import java.util.Arrays;
import q2.C3860d;
import u6.AbstractC4256a;
import u6.v;

/* loaded from: classes5.dex */
public final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7074a;

    /* renamed from: b, reason: collision with root package name */
    public int f7075b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7076c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7077d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7078e;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 8434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lc.b.<init>(android.content.Context, boolean):void");
    }

    public static void a(b bVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        f fVar = (f) bVar.f7077d;
        AbstractC4256a.i(fVar.f13040c == null);
        HandlerThread handlerThread = fVar.f13039b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) bVar.f7076c;
        mediaCodec.setCallback(fVar, handler);
        fVar.f13040c = handler;
        AbstractC4256a.b("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        AbstractC4256a.q();
        e eVar = (e) bVar.f7078e;
        if (!eVar.f13037f) {
            HandlerThread handlerThread2 = eVar.f13033b;
            handlerThread2.start();
            eVar.f13034c = new c(eVar, handlerThread2.getLooper(), 0);
            eVar.f13037f = true;
        }
        AbstractC4256a.b("startCodec");
        mediaCodec.start();
        AbstractC4256a.q();
        bVar.f7075b = 1;
    }

    public static String e(int i5, String str) {
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

    public C1707v b() {
        AbstractC1732v.a("Must set register function", ((InterfaceC1708w) this.f7076c) != null);
        AbstractC1732v.a("Must set unregister function", ((InterfaceC1708w) this.f7077d) != null);
        AbstractC1732v.a("Must set holder", ((C1703q) this.f7078e) != null);
        C1701o c1701o = ((C1703q) this.f7078e).f26552c;
        AbstractC1732v.j(c1701o, "Key must not be null");
        return new C1707v(new S(this, (C1703q) this.f7078e, this.f7074a, this.f7075b), new T(this, c1701o));
    }

    @Override // V5.k
    public void c(Bundle bundle) {
        ((MediaCodec) this.f7076c).setParameters(bundle);
    }

    @Override // V5.k
    public void d(int i5, int i10, long j8, int i11) {
        e eVar = (e) this.f7078e;
        RuntimeException runtimeException = (RuntimeException) eVar.f13035d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        d dVarB = e.b();
        dVarB.f13025a = i5;
        dVarB.f13026b = i10;
        dVarB.f13028d = j8;
        dVarB.f13029e = i11;
        c cVar = eVar.f13034c;
        int i12 = v.f46721a;
        cVar.obtainMessage(0, dVarB).sendToTarget();
    }

    @Override // V5.k
    public MediaFormat f() {
        MediaFormat mediaFormat;
        f fVar = (f) this.f7077d;
        synchronized (fVar.f13038a) {
            try {
                mediaFormat = fVar.f13045h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // V5.k
    public void flush() {
        ((e) this.f7078e).a();
        ((MediaCodec) this.f7076c).flush();
        f fVar = (f) this.f7077d;
        synchronized (fVar.f13038a) {
            fVar.k++;
            Handler handler = fVar.f13040c;
            int i5 = v.f46721a;
            handler.post(new g(fVar, 15));
        }
        ((MediaCodec) this.f7076c).start();
    }

    @Override // V5.k
    public void h(int i5) {
        ((MediaCodec) this.f7076c).setVideoScalingMode(i5);
    }

    @Override // V5.k
    public ByteBuffer i(int i5) {
        return ((MediaCodec) this.f7076c).getInputBuffer(i5);
    }

    @Override // V5.k
    public void j(Surface surface) {
        ((MediaCodec) this.f7076c).setOutputSurface(surface);
    }

    @Override // V5.k
    public void n(int i5, long j8) {
        ((MediaCodec) this.f7076c).releaseOutputBuffer(i5, j8);
    }

    @Override // V5.k
    public int o() {
        f fVar = (f) this.f7077d;
        synchronized (fVar.f13038a) {
            try {
                boolean z2 = true;
                int iE = -1;
                if (fVar.k > 0 || fVar.f13048l) {
                    return -1;
                }
                IllegalStateException illegalStateException = fVar.f13049m;
                if (illegalStateException != null) {
                    fVar.f13049m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fVar.f13047j;
                if (codecException != null) {
                    fVar.f13047j = null;
                    throw codecException;
                }
                M2.f fVar2 = fVar.f13041d;
                if (fVar2.f7312d != 0) {
                    z2 = false;
                }
                if (!z2) {
                    iE = fVar2.e();
                }
                return iE;
            } finally {
            }
        }
    }

    @Override // V5.k
    public int q(MediaCodec.BufferInfo bufferInfo) {
        f fVar = (f) this.f7077d;
        synchronized (fVar.f13038a) {
            try {
                boolean z2 = true;
                if (fVar.k > 0 || fVar.f13048l) {
                    return -1;
                }
                IllegalStateException illegalStateException = fVar.f13049m;
                if (illegalStateException != null) {
                    fVar.f13049m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fVar.f13047j;
                if (codecException != null) {
                    fVar.f13047j = null;
                    throw codecException;
                }
                M2.f fVar2 = fVar.f13042e;
                if (fVar2.f7312d != 0) {
                    z2 = false;
                }
                if (z2) {
                    return -1;
                }
                int iE = fVar2.e();
                if (iE >= 0) {
                    AbstractC4256a.j(fVar.f13045h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) fVar.f13043f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iE == -2) {
                    fVar.f13045h = (MediaFormat) fVar.f13044g.remove();
                }
                return iE;
            } finally {
            }
        }
    }

    @Override // V5.k
    public ByteBuffer r(int i5) {
        return ((MediaCodec) this.f7076c).getOutputBuffer(i5);
    }

    @Override // V5.k
    public void release() {
        try {
            if (this.f7075b == 1) {
                e eVar = (e) this.f7078e;
                if (eVar.f13037f) {
                    eVar.a();
                    eVar.f13033b.quit();
                }
                eVar.f13037f = false;
                f fVar = (f) this.f7077d;
                synchronized (fVar.f13038a) {
                    fVar.f13048l = true;
                    fVar.f13039b.quit();
                    fVar.a();
                }
            }
            this.f7075b = 2;
        } finally {
            if (!this.f7074a) {
                ((MediaCodec) this.f7076c).release();
                this.f7074a = true;
            }
        }
    }

    @Override // V5.k
    public void u(int i5, H5.c cVar, long j8) {
        e eVar = (e) this.f7078e;
        RuntimeException runtimeException = (RuntimeException) eVar.f13035d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        d dVarB = e.b();
        dVarB.f13025a = i5;
        dVarB.f13026b = 0;
        dVarB.f13028d = j8;
        dVarB.f13029e = 0;
        int i10 = cVar.f4899f;
        MediaCodec.CryptoInfo cryptoInfo = dVarB.f13027c;
        cryptoInfo.numSubSamples = i10;
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
        if (v.f46721a >= 24) {
            d2.b.o();
            cryptoInfo.setPattern(p.l(cVar.f4900g, cVar.f4901h));
        }
        eVar.f13034c.obtainMessage(1, dVarB).sendToTarget();
    }

    @Override // V5.k
    public void v(C3860d c3860d, Handler handler) {
        ((MediaCodec) this.f7076c).setOnFrameRenderedListener(new V5.a(this, c3860d, 0), handler);
    }

    @Override // V5.k
    public void x(int i5, boolean z2) {
        ((MediaCodec) this.f7076c).releaseOutputBuffer(i5, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r14, int r15) {
        /*
            Method dump skipped, instructions count: 8808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lc.b.<init>(android.content.Context, int):void");
    }
}
