package d2;

import N1.C0765n;
import Q1.x;
import U1.AbstractC0834d;
import U1.C0835e;
import U1.C0840j;
import U1.C0851v;
import W1.w;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import k2.d0;

/* loaded from: classes.dex */
public abstract class q extends AbstractC0834d {
    public static final byte[] B0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    public final w f34010A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f34011A0;

    /* renamed from: B, reason: collision with root package name */
    public C0765n f34012B;

    /* renamed from: C, reason: collision with root package name */
    public C0765n f34013C;

    /* renamed from: D, reason: collision with root package name */
    public S3.l f34014D;

    /* renamed from: E, reason: collision with root package name */
    public S3.l f34015E;

    /* renamed from: F, reason: collision with root package name */
    public C0851v f34016F;

    /* renamed from: G, reason: collision with root package name */
    public MediaCrypto f34017G;

    /* renamed from: H, reason: collision with root package name */
    public final long f34018H;

    /* renamed from: I, reason: collision with root package name */
    public float f34019I;

    /* renamed from: J, reason: collision with root package name */
    public float f34020J;

    /* renamed from: K, reason: collision with root package name */
    public j f34021K;
    public C0765n L;

    /* renamed from: M, reason: collision with root package name */
    public MediaFormat f34022M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f34023N;

    /* renamed from: O, reason: collision with root package name */
    public float f34024O;

    /* renamed from: P, reason: collision with root package name */
    public ArrayDeque f34025P;

    /* renamed from: Q, reason: collision with root package name */
    public o f34026Q;

    /* renamed from: R, reason: collision with root package name */
    public m f34027R;

    /* renamed from: S, reason: collision with root package name */
    public int f34028S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f34029T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f34030U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f34031V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f34032W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f34033X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f34034Y;

    /* renamed from: Z, reason: collision with root package name */
    public long f34035Z;

    /* renamed from: a0, reason: collision with root package name */
    public long f34036a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f34037b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f34038c0;

    /* renamed from: d0, reason: collision with root package name */
    public ByteBuffer f34039d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f34040e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f34041f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f34042g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f34043h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f34044i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f34045j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f34046k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f34047l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f34048m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f34049n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f34050o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f34051p0;

    /* renamed from: q0, reason: collision with root package name */
    public long f34052q0;

    /* renamed from: r, reason: collision with root package name */
    public final i f34053r;

    /* renamed from: r0, reason: collision with root package name */
    public long f34054r0;

    /* renamed from: s, reason: collision with root package name */
    public final h f34055s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f34056s0;

    /* renamed from: t, reason: collision with root package name */
    public final float f34057t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f34058t0;

    /* renamed from: u, reason: collision with root package name */
    public final T1.d f34059u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f34060u0;

    /* renamed from: v, reason: collision with root package name */
    public final T1.d f34061v;
    public boolean v0;

    /* renamed from: w, reason: collision with root package name */
    public final T1.d f34062w;

    /* renamed from: w0, reason: collision with root package name */
    public C0840j f34063w0;

    /* renamed from: x, reason: collision with root package name */
    public final f f34064x;

    /* renamed from: x0, reason: collision with root package name */
    public H5.e f34065x0;

    /* renamed from: y, reason: collision with root package name */
    public final MediaCodec.BufferInfo f34066y;

    /* renamed from: y0, reason: collision with root package name */
    public p f34067y0;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayDeque f34068z;

    /* renamed from: z0, reason: collision with root package name */
    public long f34069z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i5, i iVar, float f10) {
        super(i5);
        h hVar = h.f33990b;
        this.f34053r = iVar;
        this.f34055s = hVar;
        this.f34057t = f10;
        this.f34059u = new T1.d(0);
        this.f34061v = new T1.d(0);
        this.f34062w = new T1.d(2);
        f fVar = new f(2);
        fVar.f33987l = 32;
        this.f34064x = fVar;
        this.f34066y = new MediaCodec.BufferInfo();
        this.f34019I = 1.0f;
        this.f34020J = 1.0f;
        this.f34018H = -9223372036854775807L;
        this.f34068z = new ArrayDeque();
        this.f34067y0 = p.f34005e;
        fVar.r(0);
        fVar.f11358e.order(ByteOrder.nativeOrder());
        w wVar = new w();
        wVar.f15116a = O1.d.f8806a;
        wVar.f15118c = 0;
        wVar.f15117b = 2;
        this.f34010A = wVar;
        this.f34024O = -1.0f;
        this.f34028S = 0;
        this.f34046k0 = 0;
        this.f34037b0 = -1;
        this.f34038c0 = -1;
        this.f34036a0 = -9223372036854775807L;
        this.f34052q0 = -9223372036854775807L;
        this.f34054r0 = -9223372036854775807L;
        this.f34069z0 = -9223372036854775807L;
        this.f34035Z = -9223372036854775807L;
        this.f34047l0 = 0;
        this.f34048m0 = 0;
        this.f34065x0 = new H5.e(1);
    }

    public boolean A0(T1.d dVar) {
        return false;
    }

    public boolean B0(C0765n c0765n) {
        return false;
    }

    public abstract int C0(h hVar, C0765n c0765n);

    @Override // U1.AbstractC0834d
    public void D() throws MediaCryptoException {
        this.f34012B = null;
        y0(p.f34005e);
        this.f34068z.clear();
        U();
    }

    public final boolean D0(C0765n c0765n) {
        if (x.f9724a >= 23 && this.f34021K != null && this.f34048m0 != 3 && this.f12037h != 0) {
            float f10 = this.f34020J;
            c0765n.getClass();
            C0765n[] c0765nArr = this.f12039j;
            c0765nArr.getClass();
            float fY = Y(f10, c0765nArr);
            float f11 = this.f34024O;
            if (f11 != fY) {
                if (fY == -1.0f) {
                    if (this.f34049n0) {
                        this.f34047l0 = 1;
                        this.f34048m0 = 3;
                        return false;
                    }
                    t0();
                    e0();
                    return false;
                }
                if (f11 != -1.0f || fY > this.f34057t) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fY);
                    j jVar = this.f34021K;
                    jVar.getClass();
                    jVar.c(bundle);
                    this.f34024O = fY;
                }
            }
        }
        return true;
    }

    public final void E0() throws MediaCryptoException, C0840j {
        S3.l lVar = this.f34015E;
        lVar.getClass();
        T1.a aVarL = lVar.l();
        if (aVarL instanceof Z1.h) {
            try {
                MediaCrypto mediaCrypto = this.f34017G;
                mediaCrypto.getClass();
                ((Z1.h) aVarL).getClass();
                mediaCrypto.setMediaDrmSession(null);
            } catch (MediaCryptoException e7) {
                throw C(e7, this.f34012B, false, 6006);
            }
        }
        x0(this.f34015E);
        this.f34047l0 = 0;
        this.f34048m0 = 0;
    }

    @Override // U1.AbstractC0834d
    public void F(long j8, boolean z2) {
        this.f34056s0 = false;
        this.f34058t0 = false;
        this.v0 = false;
        if (this.f34042g0) {
            this.f34064x.o();
            this.f34062w.o();
            this.f34043h0 = false;
            w wVar = this.f34010A;
            wVar.getClass();
            wVar.f15116a = O1.d.f8806a;
            wVar.f15118c = 0;
            wVar.f15117b = 2;
        } else if (U()) {
            e0();
        }
        if (this.f34067y0.f34009d.n() > 0) {
            this.f34060u0 = true;
        }
        this.f34067y0.f34009d.d();
        this.f34068z.clear();
    }

    public final void F0(long j8) {
        C0765n c0765n = (C0765n) this.f34067y0.f34009d.j(j8);
        if (c0765n == null && this.f34011A0 && this.f34022M != null) {
            c0765n = (C0765n) this.f34067y0.f34009d.i();
        }
        if (c0765n != null) {
            this.f34013C = c0765n;
        } else if (!this.f34023N || this.f34013C == null) {
            return;
        }
        C0765n c0765n2 = this.f34013C;
        c0765n2.getClass();
        k0(c0765n2, this.f34022M);
        this.f34023N = false;
        this.f34011A0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // U1.AbstractC0834d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(N1.C0765n[] r13, long r14, long r16, k2.H r18) {
        /*
            r12 = this;
            d2.p r13 = r12.f34067y0
            long r0 = r13.f34008c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            d2.p r4 = new d2.p
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.y0(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.f34068z
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L52
            long r0 = r12.f34052q0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L36
            long r4 = r12.f34069z0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L52
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L52
        L36:
            d2.p r5 = new d2.p
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.y0(r5)
            d2.p r13 = r12.f34067y0
            long r13 = r13.f34008c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.n0()
        L51:
            return
        L52:
            d2.p r5 = new d2.p
            long r6 = r12.f34052q0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.q.K(N1.n[], long, long, k2.H):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0312  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean M(long r26, long r28) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.q.M(long, long):boolean");
    }

    public abstract C0835e N(m mVar, C0765n c0765n, C0765n c0765n2);

    public l O(IllegalStateException illegalStateException, m mVar) {
        return new l(illegalStateException, mVar);
    }

    public final void P() {
        this.f34044i0 = false;
        this.f34064x.o();
        this.f34062w.o();
        this.f34043h0 = false;
        this.f34042g0 = false;
        w wVar = this.f34010A;
        wVar.getClass();
        wVar.f15116a = O1.d.f8806a;
        wVar.f15118c = 0;
        wVar.f15117b = 2;
    }

    public final boolean Q() throws MediaCryptoException, C0840j {
        if (!this.f34049n0) {
            E0();
            return true;
        }
        this.f34047l0 = 1;
        if (this.f34030U) {
            this.f34048m0 = 3;
            return false;
        }
        this.f34048m0 = 2;
        return true;
    }

    public final boolean R(long j8, long j10) throws MediaCryptoException, C0840j {
        boolean z2;
        boolean z10;
        MediaCodec.BufferInfo bufferInfo;
        boolean zR0;
        ByteBuffer byteBuffer;
        int i5;
        int i10;
        long j11;
        boolean z11;
        boolean z12;
        C0765n c0765n;
        int iQ;
        j jVar = this.f34021K;
        jVar.getClass();
        boolean z13 = this.f34038c0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f34066y;
        if (!z13) {
            if (this.f34031V && this.f34050o0) {
                try {
                    iQ = jVar.q(bufferInfo2);
                } catch (IllegalStateException unused) {
                    q0();
                    if (this.f34058t0) {
                        t0();
                    }
                }
            } else {
                iQ = jVar.q(bufferInfo2);
            }
            if (iQ < 0) {
                if (iQ == -2) {
                    this.f34051p0 = true;
                    j jVar2 = this.f34021K;
                    jVar2.getClass();
                    MediaFormat mediaFormatF = jVar2.f();
                    if (this.f34028S != 0 && mediaFormatF.getInteger("width") == 32 && mediaFormatF.getInteger("height") == 32) {
                        this.f34033X = true;
                        return true;
                    }
                    this.f34022M = mediaFormatF;
                    this.f34023N = true;
                    return true;
                }
                if (this.f34034Y && (this.f34056s0 || this.f34047l0 == 2)) {
                    q0();
                }
                long j12 = this.f34035Z;
                if (j12 != -9223372036854775807L) {
                    long j13 = j12 + 100;
                    this.f12036g.getClass();
                    if (j13 < System.currentTimeMillis()) {
                        q0();
                        return false;
                    }
                }
                return false;
            }
            if (this.f34033X) {
                this.f34033X = false;
                jVar.G(iQ);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                q0();
                return false;
            }
            this.f34038c0 = iQ;
            ByteBuffer byteBufferR = jVar.r(iQ);
            this.f34039d0 = byteBufferR;
            if (byteBufferR != null) {
                byteBufferR.position(bufferInfo2.offset);
                this.f34039d0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j14 = bufferInfo2.presentationTimeUs;
            this.f34040e0 = j14 < this.f12040l;
            long j15 = this.f34054r0;
            this.f34041f0 = j15 != -9223372036854775807L && j15 <= j14;
            F0(j14);
        }
        if (this.f34031V && this.f34050o0) {
            try {
                byteBuffer = this.f34039d0;
                i5 = this.f34038c0;
                i10 = bufferInfo2.flags;
                j11 = bufferInfo2.presentationTimeUs;
                z11 = this.f34040e0;
                z12 = this.f34041f0;
                c0765n = this.f34013C;
                c0765n.getClass();
                z2 = true;
                z10 = false;
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused2) {
                z10 = false;
            }
            try {
                zR0 = r0(j8, j10, jVar, byteBuffer, i5, i10, 1, j11, z11, z12, c0765n);
            } catch (IllegalStateException unused3) {
                q0();
                if (!this.f34058t0) {
                    return z10;
                }
                t0();
                return z10;
            }
        } else {
            z2 = true;
            z10 = false;
            bufferInfo = bufferInfo2;
            ByteBuffer byteBuffer2 = this.f34039d0;
            int i11 = this.f34038c0;
            int i12 = bufferInfo.flags;
            long j16 = bufferInfo.presentationTimeUs;
            boolean z14 = this.f34040e0;
            boolean z15 = this.f34041f0;
            C0765n c0765n2 = this.f34013C;
            c0765n2.getClass();
            zR0 = r0(j8, j10, jVar, byteBuffer2, i11, i12, 1, j16, z14, z15, c0765n2);
        }
        if (!zR0) {
            return z10;
        }
        m0(bufferInfo.presentationTimeUs);
        boolean z16 = (bufferInfo.flags & 4) != 0 ? z2 : z10;
        if (!z16 && this.f34050o0 && this.f34041f0) {
            this.f12036g.getClass();
            this.f34035Z = System.currentTimeMillis();
        }
        this.f34038c0 = -1;
        this.f34039d0 = null;
        if (!z16) {
            return z2;
        }
        q0();
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean S() throws android.media.MediaCryptoException, U1.C0840j {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.q.S():boolean");
    }

    public final void T() {
        try {
            j jVar = this.f34021K;
            Q1.k.h(jVar);
            jVar.flush();
        } finally {
            v0();
        }
    }

    public final boolean U() throws MediaCryptoException {
        if (this.f34021K == null) {
            return false;
        }
        int i5 = this.f34048m0;
        if (i5 == 3 || ((this.f34029T && !this.f34051p0) || (this.f34030U && this.f34050o0))) {
            t0();
            return true;
        }
        if (i5 == 2) {
            int i10 = x.f9724a;
            Q1.k.g(i10 >= 23);
            if (i10 >= 23) {
                try {
                    E0();
                } catch (C0840j e7) {
                    Q1.k.x("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e7);
                    t0();
                    return true;
                }
            }
        }
        T();
        return false;
    }

    public final List V(boolean z2) {
        C0765n c0765n = this.f34012B;
        c0765n.getClass();
        h hVar = this.f34055s;
        ArrayList arrayListZ = Z(hVar, c0765n, z2);
        if (!arrayListZ.isEmpty() || !z2) {
            return arrayListZ;
        }
        ArrayList arrayListZ2 = Z(hVar, c0765n, false);
        if (!arrayListZ2.isEmpty()) {
            Q1.k.w("MediaCodecRenderer", "Drm session requires secure decoder for " + c0765n.f8232n + ", but no secure decoder available. Trying to proceed with " + arrayListZ2 + ".");
        }
        return arrayListZ2;
    }

    public int W(T1.d dVar) {
        return 0;
    }

    public boolean X() {
        return false;
    }

    public abstract float Y(float f10, C0765n[] c0765nArr);

    public abstract ArrayList Z(h hVar, C0765n c0765n, boolean z2);

    public abstract C6.l a0(m mVar, C0765n c0765n, MediaCrypto mediaCrypto, float f10);

    public abstract void b0(T1.d dVar);

    /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0(d2.m r13, android.media.MediaCrypto r14) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.q.c0(d2.m, android.media.MediaCrypto):void");
    }

    @Override // U1.X
    public final int d(C0765n c0765n) throws C0840j {
        try {
            return C0(this.f34055s, c0765n);
        } catch (s e7) {
            throw C(e7, c0765n, false, 4002);
        }
    }

    public final boolean d0(long j8, long j10) {
        if (j10 >= j8) {
            return false;
        }
        C0765n c0765n = this.f34013C;
        return c0765n == null || !Objects.equals(c0765n.f8232n, "audio/opus") || j8 - j10 > 80000;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0() {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.q.e0():void");
    }

    public final void f0(MediaCrypto mediaCrypto, boolean z2) throws o {
        C0765n c0765n = this.f34012B;
        c0765n.getClass();
        if (this.f34025P == null) {
            try {
                List listV = V(z2);
                this.f34025P = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listV;
                if (!arrayList.isEmpty()) {
                    this.f34025P.add((m) arrayList.get(0));
                }
                this.f34026Q = null;
            } catch (s e7) {
                throw new o(c0765n, e7, z2, -49998);
            }
        }
        if (this.f34025P.isEmpty()) {
            throw new o(c0765n, null, z2, -49999);
        }
        ArrayDeque arrayDeque = this.f34025P;
        arrayDeque.getClass();
        while (this.f34021K == null) {
            m mVar = (m) arrayDeque.peekFirst();
            mVar.getClass();
            if (!z0(mVar)) {
                return;
            }
            try {
                c0(mVar, mediaCrypto);
            } catch (Exception e10) {
                Q1.k.x("MediaCodecRenderer", "Failed to initialize decoder: " + mVar, e10);
                arrayDeque.removeFirst();
                o oVar = new o("Decoder init failed: " + mVar.f33992a + ", " + c0765n, e10, c0765n.f8232n, z2, mVar, e10 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e10).getDiagnosticInfo() : null);
                g0(oVar);
                o oVar2 = this.f34026Q;
                if (oVar2 == null) {
                    this.f34026Q = oVar;
                } else {
                    this.f34026Q = new o(oVar2.getMessage(), oVar2.getCause(), oVar2.f34001a, oVar2.f34002b, oVar2.f34003c, oVar2.f34004d);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.f34026Q;
                }
            }
        }
        this.f34025P = null;
    }

    public abstract void g0(Exception exc);

    public abstract void h0(long j8, long j10, String str);

    public abstract void i0(String str);

    @Override // U1.W
    public boolean isReady() {
        boolean zIsReady;
        if (this.f34012B != null) {
            if (i()) {
                zIsReady = this.f12042n;
            } else {
                d0 d0Var = this.f12038i;
                d0Var.getClass();
                zIsReady = d0Var.isReady();
            }
            if (!zIsReady) {
                if (!(this.f34038c0 >= 0)) {
                    if (this.f34036a0 != -9223372036854775807L) {
                        this.f12036g.getClass();
                        if (SystemClock.elapsedRealtime() < this.f34036a0) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e3, code lost:
    
        if (r4.t(r3) != false) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public U1.C0835e j0(S3.c r14) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.q.j0(S3.c):U1.e");
    }

    public abstract void k0(C0765n c0765n, MediaFormat mediaFormat);

    public void m0(long j8) {
        this.f34069z0 = j8;
        while (true) {
            ArrayDeque arrayDeque = this.f34068z;
            if (arrayDeque.isEmpty() || j8 < ((p) arrayDeque.peek()).f34006a) {
                return;
            }
            p pVar = (p) arrayDeque.poll();
            pVar.getClass();
            y0(pVar);
            n0();
        }
    }

    public abstract void n0();

    public final void q0() throws MediaCryptoException, C0840j {
        int i5 = this.f34048m0;
        if (i5 == 1) {
            T();
            return;
        }
        if (i5 == 2) {
            T();
            E0();
        } else if (i5 != 3) {
            this.f34058t0 = true;
            u0();
        } else {
            t0();
            e0();
        }
    }

    public abstract boolean r0(long j8, long j10, j jVar, ByteBuffer byteBuffer, int i5, int i10, int i11, long j11, boolean z2, boolean z10, C0765n c0765n);

    public final boolean s0(int i5) throws MediaCryptoException, C0840j {
        S3.c cVar = this.f12032c;
        cVar.i();
        T1.d dVar = this.f34059u;
        dVar.o();
        int iL = L(cVar, dVar, i5 | 4);
        if (iL == -5) {
            j0(cVar);
            return true;
        }
        if (iL != -4 || !dVar.h(4)) {
            return false;
        }
        this.f34056s0 = true;
        q0();
        return false;
    }

    @Override // U1.AbstractC0834d, U1.W
    public void t(float f10, float f11) {
        this.f34019I = f10;
        this.f34020J = f11;
        D0(this.L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0() {
        try {
            j jVar = this.f34021K;
            if (jVar != null) {
                jVar.release();
                this.f34065x0.f4906c++;
                m mVar = this.f34027R;
                mVar.getClass();
                i0(mVar.f33992a);
            }
            this.f34021K = null;
            try {
                MediaCrypto mediaCrypto = this.f34017G;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f34021K = null;
            try {
                MediaCrypto mediaCrypto2 = this.f34017G;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // U1.AbstractC0834d, U1.X
    public final int u() {
        return 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[LOOP:1: B:31:0x0053->B:41:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099 A[LOOP:2: B:42:0x0079->B:52:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0079 A[EDGE_INSN: B:87:0x0079->B:90:? BREAK  A[LOOP:1: B:31:0x0053->B:41:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a A[EDGE_INSN: B:88:0x009a->B:53:0x009a BREAK  A[LOOP:2: B:42:0x0079->B:52:0x0099], SYNTHETIC] */
    @Override // U1.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(long r12, long r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.q.v(long, long):void");
    }

    public void v0() {
        this.f34037b0 = -1;
        this.f34061v.f11358e = null;
        this.f34038c0 = -1;
        this.f34039d0 = null;
        this.f34036a0 = -9223372036854775807L;
        this.f34050o0 = false;
        this.f34035Z = -9223372036854775807L;
        this.f34049n0 = false;
        this.f34032W = false;
        this.f34033X = false;
        this.f34040e0 = false;
        this.f34041f0 = false;
        this.f34052q0 = -9223372036854775807L;
        this.f34054r0 = -9223372036854775807L;
        this.f34069z0 = -9223372036854775807L;
        this.f34047l0 = 0;
        this.f34048m0 = 0;
        this.f34046k0 = this.f34045j0 ? 1 : 0;
    }

    public final void w0() {
        v0();
        this.f34063w0 = null;
        this.f34025P = null;
        this.f34027R = null;
        this.L = null;
        this.f34022M = null;
        this.f34023N = false;
        this.f34051p0 = false;
        this.f34024O = -1.0f;
        this.f34028S = 0;
        this.f34029T = false;
        this.f34030U = false;
        this.f34031V = false;
        this.f34034Y = false;
        this.f34045j0 = false;
        this.f34046k0 = 0;
    }

    public final void x0(S3.l lVar) {
        S3.l lVar2 = this.f34014D;
        if (lVar2 != lVar) {
            if (lVar != null) {
                lVar.h(null);
            }
            if (lVar2 != null) {
                lVar2.s(null);
            }
        }
        this.f34014D = lVar;
    }

    public final void y0(p pVar) {
        this.f34067y0 = pVar;
        if (pVar.f34008c != -9223372036854775807L) {
            this.f34011A0 = true;
            l0();
        }
    }

    public boolean z0(m mVar) {
        return true;
    }

    public void l0() {
    }

    public void u0() {
    }

    public void o0(T1.d dVar) {
    }

    public void p0(C0765n c0765n) {
    }
}
