package V5;

import A.e0;
import E5.AbstractC0449f;
import E5.C0465o;
import E5.T;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import f6.V;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public abstract class q extends AbstractC0449f {

    /* renamed from: D0, reason: collision with root package name */
    public static final byte[] f13073D0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    public T f13074A;

    /* renamed from: A0, reason: collision with root package name */
    public long f13075A0;

    /* renamed from: B, reason: collision with root package name */
    public e0 f13076B;
    public long B0;

    /* renamed from: C, reason: collision with root package name */
    public e0 f13077C;

    /* renamed from: C0, reason: collision with root package name */
    public int f13078C0;

    /* renamed from: D, reason: collision with root package name */
    public MediaCrypto f13079D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f13080E;

    /* renamed from: F, reason: collision with root package name */
    public final long f13081F;

    /* renamed from: G, reason: collision with root package name */
    public float f13082G;

    /* renamed from: H, reason: collision with root package name */
    public float f13083H;

    /* renamed from: I, reason: collision with root package name */
    public k f13084I;

    /* renamed from: J, reason: collision with root package name */
    public T f13085J;

    /* renamed from: K, reason: collision with root package name */
    public MediaFormat f13086K;
    public boolean L;

    /* renamed from: M, reason: collision with root package name */
    public float f13087M;

    /* renamed from: N, reason: collision with root package name */
    public ArrayDeque f13088N;

    /* renamed from: O, reason: collision with root package name */
    public p f13089O;

    /* renamed from: P, reason: collision with root package name */
    public n f13090P;

    /* renamed from: Q, reason: collision with root package name */
    public int f13091Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f13092R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f13093S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f13094T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f13095U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f13096V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f13097W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f13098X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f13099Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f13100Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f13101a0;

    /* renamed from: b0, reason: collision with root package name */
    public h f13102b0;

    /* renamed from: c0, reason: collision with root package name */
    public long f13103c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f13104d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f13105e0;

    /* renamed from: f0, reason: collision with root package name */
    public ByteBuffer f13106f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f13107g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f13108h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f13109i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f13110j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f13111k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f13112l0;

    /* renamed from: m, reason: collision with root package name */
    public final j f13113m;

    /* renamed from: m0, reason: collision with root package name */
    public int f13114m0;

    /* renamed from: n, reason: collision with root package name */
    public final r f13115n;

    /* renamed from: n0, reason: collision with root package name */
    public int f13116n0;

    /* renamed from: o, reason: collision with root package name */
    public final float f13117o;

    /* renamed from: o0, reason: collision with root package name */
    public int f13118o0;

    /* renamed from: p, reason: collision with root package name */
    public final H5.h f13119p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f13120p0;

    /* renamed from: q, reason: collision with root package name */
    public final H5.h f13121q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f13122q0;

    /* renamed from: r, reason: collision with root package name */
    public final H5.h f13123r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f13124r0;

    /* renamed from: s, reason: collision with root package name */
    public final g f13125s;

    /* renamed from: s0, reason: collision with root package name */
    public long f13126s0;

    /* renamed from: t, reason: collision with root package name */
    public final Q1.t f13127t;

    /* renamed from: t0, reason: collision with root package name */
    public long f13128t0;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f13129u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f13130u0;

    /* renamed from: v, reason: collision with root package name */
    public final MediaCodec.BufferInfo f13131v;
    public boolean v0;

    /* renamed from: w, reason: collision with root package name */
    public final long[] f13132w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f13133w0;

    /* renamed from: x, reason: collision with root package name */
    public final long[] f13134x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f13135x0;

    /* renamed from: y, reason: collision with root package name */
    public final long[] f13136y;

    /* renamed from: y0, reason: collision with root package name */
    public C0465o f13137y0;

    /* renamed from: z, reason: collision with root package name */
    public T f13138z;

    /* renamed from: z0, reason: collision with root package name */
    public H5.e f13139z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i5, j jVar, float f10) {
        super(i5);
        r rVar = r.f13140b;
        this.f13113m = jVar;
        this.f13115n = rVar;
        this.f13117o = f10;
        this.f13119p = new H5.h(0);
        this.f13121q = new H5.h(0);
        this.f13123r = new H5.h(2);
        g gVar = new g(2);
        gVar.k = 32;
        this.f13125s = gVar;
        this.f13127t = new Q1.t(1);
        this.f13129u = new ArrayList();
        this.f13131v = new MediaCodec.BufferInfo();
        this.f13082G = 1.0f;
        this.f13083H = 1.0f;
        this.f13081F = -9223372036854775807L;
        this.f13132w = new long[10];
        this.f13134x = new long[10];
        this.f13136y = new long[10];
        this.f13075A0 = -9223372036854775807L;
        i0(-9223372036854775807L);
        gVar.r(0);
        gVar.f4917d.order(ByteOrder.nativeOrder());
        this.f13087M = -1.0f;
        this.f13091Q = 0;
        this.f13114m0 = 0;
        this.f13104d0 = -1;
        this.f13105e0 = -1;
        this.f13103c0 = -9223372036854775807L;
        this.f13126s0 = -9223372036854775807L;
        this.f13128t0 = -9223372036854775807L;
        this.f13116n0 = 0;
        this.f13118o0 = 0;
    }

    public l A(IllegalStateException illegalStateException, n nVar) {
        return new l(illegalStateException, nVar);
    }

    public final void B() {
        this.f13111k0 = false;
        this.f13125s.o();
        this.f13123r.o();
        this.f13110j0 = false;
        this.f13109i0 = false;
    }

    public final boolean C() throws C0465o, MediaCryptoException {
        if (!this.f13120p0) {
            n0();
            return true;
        }
        this.f13116n0 = 1;
        if (this.f13093S || this.f13095U) {
            this.f13118o0 = 3;
            return false;
        }
        this.f13118o0 = 2;
        return true;
    }

    public final boolean D(long j8, long j10) throws Exception {
        boolean z2;
        boolean z10;
        MediaCodec.BufferInfo bufferInfo;
        boolean zB0;
        int iQ;
        boolean z11;
        boolean z12 = this.f13105e0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f13131v;
        if (!z12) {
            if (this.f13096V && this.f13122q0) {
                try {
                    iQ = this.f13084I.q(bufferInfo2);
                } catch (IllegalStateException unused) {
                    a0();
                    if (this.v0) {
                        d0();
                    }
                }
            } else {
                iQ = this.f13084I.q(bufferInfo2);
            }
            if (iQ < 0) {
                if (iQ != -2) {
                    if (this.f13101a0 && (this.f13130u0 || this.f13116n0 == 2)) {
                        a0();
                        return false;
                    }
                    return false;
                }
                this.f13124r0 = true;
                MediaFormat mediaFormatF = this.f13084I.f();
                if (this.f13091Q != 0 && mediaFormatF.getInteger("width") == 32 && mediaFormatF.getInteger("height") == 32) {
                    this.f13100Z = true;
                    return true;
                }
                if (this.f13098X) {
                    mediaFormatF.setInteger("channel-count", 1);
                }
                this.f13086K = mediaFormatF;
                this.L = true;
                return true;
            }
            if (this.f13100Z) {
                this.f13100Z = false;
                this.f13084I.x(iQ, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                a0();
                return false;
            }
            this.f13105e0 = iQ;
            ByteBuffer byteBufferR = this.f13084I.r(iQ);
            this.f13106f0 = byteBufferR;
            if (byteBufferR != null) {
                byteBufferR.position(bufferInfo2.offset);
                this.f13106f0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f13097W && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j11 = this.f13126s0;
                if (j11 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j11;
                }
            }
            long j12 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.f13129u;
            int size = arrayList.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z11 = false;
                    break;
                }
                if (((Long) arrayList.get(i5)).longValue() == j12) {
                    arrayList.remove(i5);
                    z11 = true;
                    break;
                }
                i5++;
            }
            this.f13107g0 = z11;
            long j13 = this.f13128t0;
            long j14 = bufferInfo2.presentationTimeUs;
            this.f13108h0 = j13 == j14;
            o0(j14);
        }
        if (this.f13096V && this.f13122q0) {
            try {
                z2 = true;
                z10 = false;
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused2) {
                z10 = false;
            }
            try {
                zB0 = b0(j8, j10, this.f13084I, this.f13106f0, this.f13105e0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f13107g0, this.f13108h0, this.f13074A);
            } catch (IllegalStateException unused3) {
                a0();
                if (!this.v0) {
                    return z10;
                }
                d0();
                return z10;
            }
        } else {
            z2 = true;
            z10 = false;
            bufferInfo = bufferInfo2;
            zB0 = b0(j8, j10, this.f13084I, this.f13106f0, this.f13105e0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f13107g0, this.f13108h0, this.f13074A);
        }
        if (!zB0) {
            return z10;
        }
        X(bufferInfo.presentationTimeUs);
        boolean z13 = (bufferInfo.flags & 4) != 0 ? z2 : z10;
        this.f13105e0 = -1;
        this.f13106f0 = null;
        if (!z13) {
            return z2;
        }
        a0();
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V5.q.E():boolean");
    }

    public final void F() {
        try {
            this.f13084I.flush();
        } finally {
            f0();
        }
    }

    public final boolean G() throws MediaCryptoException {
        if (this.f13084I == null) {
            return false;
        }
        int i5 = this.f13118o0;
        if (i5 == 3 || this.f13093S || ((this.f13094T && !this.f13124r0) || (this.f13095U && this.f13122q0))) {
            d0();
            return true;
        }
        if (i5 == 2) {
            int i10 = u6.v.f46721a;
            AbstractC4256a.i(i10 >= 23);
            if (i10 >= 23) {
                try {
                    n0();
                } catch (C0465o e7) {
                    AbstractC4256a.D(e7, "MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.");
                    d0();
                    return true;
                }
            }
        }
        F();
        return false;
    }

    public final List H(boolean z2) {
        T t10 = this.f13138z;
        r rVar = this.f13115n;
        ArrayList arrayListK = K(rVar, t10, z2);
        if (!arrayListK.isEmpty() || !z2) {
            return arrayListK;
        }
        ArrayList arrayListK2 = K(rVar, this.f13138z, false);
        if (!arrayListK2.isEmpty()) {
            AbstractC4256a.E("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f13138z.f3238l + ", but no secure decoder available. Trying to proceed with " + arrayListK2 + ".");
        }
        return arrayListK2;
    }

    public boolean I() {
        return false;
    }

    public abstract float J(float f10, T[] tArr);

    public abstract ArrayList K(r rVar, T t10, boolean z2);

    public final I5.j L(e0 e0Var) {
        e0Var.getClass();
        return null;
    }

    public abstract i M(n nVar, T t10, MediaCrypto mediaCrypto, float f10);

    /* JADX WARN: Removed duplicated region for block: B:114:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(V5.n r17, android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V5.q.O(V5.n, android.media.MediaCrypto):void");
    }

    public final void P() throws Exception {
        T t10;
        if (this.f13084I != null || this.f13109i0 || (t10 = this.f13138z) == null) {
            return;
        }
        if (this.f13077C == null && k0(t10)) {
            T t11 = this.f13138z;
            B();
            String str = t11.f3238l;
            boolean zEquals = "audio/mp4a-latm".equals(str);
            g gVar = this.f13125s;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                gVar.getClass();
                gVar.k = 32;
            } else {
                gVar.getClass();
                gVar.k = 1;
            }
            this.f13109i0 = true;
            return;
        }
        h0(this.f13077C);
        String str2 = this.f13138z.f3238l;
        e0 e0Var = this.f13076B;
        if (e0Var != null) {
            if (this.f13079D == null) {
                L(e0Var);
                if (this.f13076B.p() == null) {
                    return;
                }
            }
            if (I5.j.f5397a) {
                int iR = this.f13076B.r();
                if (iR == 1) {
                    I5.d dVarP = this.f13076B.p();
                    dVarP.getClass();
                    throw b(dVarP, this.f13138z, false, dVarP.f5390a);
                }
                if (iR != 4) {
                    return;
                }
            }
        }
        try {
            Q(this.f13079D, this.f13080E);
        } catch (p e7) {
            throw b(e7, this.f13138z, false, 4001);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(android.media.MediaCrypto r20, boolean r21) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V5.q.Q(android.media.MediaCrypto, boolean):void");
    }

    public abstract void R(Exception exc);

    public abstract void S(long j8, long j10, String str);

    public abstract void T(String str);

    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public H5.i U(S3.s r13) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V5.q.U(S3.s):H5.i");
    }

    public abstract void V(T t10, MediaFormat mediaFormat);

    public void X(long j8) {
        while (this.f13078C0 != 0) {
            long[] jArr = this.f13136y;
            if (j8 < jArr[0]) {
                return;
            }
            long[] jArr2 = this.f13132w;
            this.f13075A0 = jArr2[0];
            long[] jArr3 = this.f13134x;
            i0(jArr3[0]);
            int i5 = this.f13078C0 - 1;
            this.f13078C0 = i5;
            System.arraycopy(jArr2, 1, jArr2, 0, i5);
            System.arraycopy(jArr3, 1, jArr3, 0, this.f13078C0);
            System.arraycopy(jArr, 1, jArr, 0, this.f13078C0);
            Y();
        }
    }

    public abstract void Y();

    public abstract void Z(H5.h hVar);

    public final void a0() throws Exception {
        int i5 = this.f13118o0;
        if (i5 == 1) {
            F();
            return;
        }
        if (i5 == 2) {
            F();
            n0();
        } else if (i5 != 3) {
            this.v0 = true;
            e0();
        } else {
            d0();
            P();
        }
    }

    public abstract boolean b0(long j8, long j10, k kVar, ByteBuffer byteBuffer, int i5, int i10, int i11, long j11, boolean z2, boolean z10, T t10);

    public final boolean c0(int i5) throws Exception {
        S3.s sVar = this.f3346b;
        sVar.e();
        H5.h hVar = this.f13119p;
        hVar.o();
        int iR = r(sVar, hVar, i5 | 4);
        if (iR == -5) {
            U(sVar);
            return true;
        }
        if (iR != -4 || !hVar.h(4)) {
            return false;
        }
        this.f13130u0 = true;
        a0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0() {
        try {
            k kVar = this.f13084I;
            if (kVar != null) {
                kVar.release();
                this.f13139z0.f4906c++;
                T(this.f13090P.f13061a);
            }
            this.f13084I = null;
            try {
                MediaCrypto mediaCrypto = this.f13079D;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f13084I = null;
            try {
                MediaCrypto mediaCrypto2 = this.f13079D;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void f0() {
        this.f13104d0 = -1;
        this.f13121q.f4917d = null;
        this.f13105e0 = -1;
        this.f13106f0 = null;
        this.f13103c0 = -9223372036854775807L;
        this.f13122q0 = false;
        this.f13120p0 = false;
        this.f13099Y = false;
        this.f13100Z = false;
        this.f13107g0 = false;
        this.f13108h0 = false;
        this.f13129u.clear();
        this.f13126s0 = -9223372036854775807L;
        this.f13128t0 = -9223372036854775807L;
        h hVar = this.f13102b0;
        if (hVar != null) {
            hVar.f13052a = 0L;
            hVar.f13053b = 0L;
            hVar.f13054c = false;
        }
        this.f13116n0 = 0;
        this.f13118o0 = 0;
        this.f13114m0 = this.f13112l0 ? 1 : 0;
    }

    public final void g0() {
        f0();
        this.f13137y0 = null;
        this.f13102b0 = null;
        this.f13088N = null;
        this.f13090P = null;
        this.f13085J = null;
        this.f13086K = null;
        this.L = false;
        this.f13124r0 = false;
        this.f13087M = -1.0f;
        this.f13091Q = 0;
        this.f13092R = false;
        this.f13093S = false;
        this.f13094T = false;
        this.f13095U = false;
        this.f13096V = false;
        this.f13097W = false;
        this.f13098X = false;
        this.f13101a0 = false;
        this.f13112l0 = false;
        this.f13114m0 = 0;
        this.f13080E = false;
    }

    public final void h0(e0 e0Var) {
        e0 e0Var2 = this.f13076B;
        if (e0Var2 != e0Var) {
            if (e0Var != null) {
                e0Var.c(null);
            }
            if (e0Var2 != null) {
                e0Var2.y(null);
            }
        }
        this.f13076B = e0Var;
    }

    @Override // E5.AbstractC0449f
    public boolean i() {
        return this.v0;
    }

    public final void i0(long j8) {
        this.B0 = j8;
        if (j8 != -9223372036854775807L) {
            W();
        }
    }

    @Override // E5.AbstractC0449f
    public boolean j() {
        boolean zIsReady;
        if (this.f13138z != null) {
            if (h()) {
                zIsReady = this.k;
            } else {
                V v2 = this.f3351g;
                v2.getClass();
                zIsReady = v2.isReady();
            }
            if (!zIsReady) {
                if ((this.f13105e0 >= 0) || (this.f13103c0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f13103c0)) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean j0(n nVar) {
        return true;
    }

    @Override // E5.AbstractC0449f
    public void k() throws MediaCryptoException {
        this.f13138z = null;
        this.f13075A0 = -9223372036854775807L;
        i0(-9223372036854775807L);
        this.f13078C0 = 0;
        G();
    }

    public boolean k0(T t10) {
        return false;
    }

    public abstract int l0(r rVar, T t10);

    @Override // E5.AbstractC0449f
    public void m(long j8, boolean z2) {
        int i5;
        this.f13130u0 = false;
        this.v0 = false;
        this.f13135x0 = false;
        if (this.f13109i0) {
            this.f13125s.o();
            this.f13123r.o();
            this.f13110j0 = false;
        } else if (G()) {
            P();
        }
        Q1.t tVar = this.f13127t;
        synchronized (tVar) {
            i5 = tVar.f9716e;
        }
        if (i5 > 0) {
            this.f13133w0 = true;
        }
        this.f13127t.d();
        int i10 = this.f13078C0;
        if (i10 != 0) {
            i0(this.f13134x[i10 - 1]);
            this.f13075A0 = this.f13132w[this.f13078C0 - 1];
            this.f13078C0 = 0;
        }
    }

    public final boolean m0(T t10) throws Exception {
        if (u6.v.f46721a >= 23 && this.f13084I != null && this.f13118o0 != 3 && this.f3350f != 0) {
            float f10 = this.f13083H;
            T[] tArr = this.f3352h;
            tArr.getClass();
            float fJ = J(f10, tArr);
            float f11 = this.f13087M;
            if (f11 != fJ) {
                if (fJ == -1.0f) {
                    if (this.f13120p0) {
                        this.f13116n0 = 1;
                        this.f13118o0 = 3;
                        return false;
                    }
                    d0();
                    P();
                    return false;
                }
                if (f11 != -1.0f || fJ > this.f13117o) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fJ);
                    this.f13084I.c(bundle);
                    this.f13087M = fJ;
                }
            }
        }
        return true;
    }

    public final void n0() throws C0465o, MediaCryptoException {
        try {
            MediaCrypto mediaCrypto = this.f13079D;
            L(this.f13077C).getClass();
            mediaCrypto.setMediaDrmSession(null);
            h0(this.f13077C);
            this.f13116n0 = 0;
            this.f13118o0 = 0;
        } catch (MediaCryptoException e7) {
            throw b(e7, this.f13138z, false, 6006);
        }
    }

    public final void o0(long j8) {
        Object objM;
        T t10 = (T) this.f13127t.j(j8);
        if (t10 == null && this.L) {
            Q1.t tVar = this.f13127t;
            synchronized (tVar) {
                objM = tVar.f9716e == 0 ? null : tVar.m();
            }
            t10 = (T) objM;
        }
        if (t10 != null) {
            this.f13074A = t10;
        } else if (!this.L || this.f13074A == null) {
            return;
        }
        V(this.f13074A, this.f13086K);
        this.L = false;
    }

    @Override // E5.AbstractC0449f
    public final void q(T[] tArr, long j8, long j10) {
        if (this.B0 == -9223372036854775807L) {
            AbstractC4256a.i(this.f13075A0 == -9223372036854775807L);
            this.f13075A0 = j8;
            i0(j10);
            return;
        }
        int i5 = this.f13078C0;
        long[] jArr = this.f13134x;
        if (i5 == jArr.length) {
            AbstractC4256a.E("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + jArr[this.f13078C0 - 1]);
        } else {
            this.f13078C0 = i5 + 1;
        }
        int i10 = this.f13078C0 - 1;
        this.f13132w[i10] = j8;
        jArr[i10] = j10;
        this.f13136y[i10] = this.f13126s0;
    }

    @Override // E5.AbstractC0449f
    public final void s(long j8, long j10) throws Exception {
        boolean z2 = false;
        if (this.f13135x0) {
            this.f13135x0 = false;
            a0();
        }
        C0465o c0465o = this.f13137y0;
        if (c0465o != null) {
            this.f13137y0 = null;
            throw c0465o;
        }
        try {
            if (this.v0) {
                e0();
                return;
            }
            if (this.f13138z != null || c0(2)) {
                P();
                if (this.f13109i0) {
                    AbstractC4256a.b("bypassRender");
                    while (y(j8, j10)) {
                    }
                    AbstractC4256a.q();
                } else if (this.f13084I != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    AbstractC4256a.b("drainAndFeed");
                    while (D(j8, j10)) {
                        long j11 = this.f13081F;
                        if (!(j11 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j11)) {
                            break;
                        }
                    }
                    while (E()) {
                        long j12 = this.f13081F;
                        if (!(j12 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j12)) {
                            break;
                        }
                    }
                    AbstractC4256a.q();
                } else {
                    H5.e eVar = this.f13139z0;
                    int i5 = eVar.f4908e;
                    V v2 = this.f3351g;
                    v2.getClass();
                    eVar.f4908e = i5 + v2.g(j8 - this.f3353i);
                    c0(1);
                }
                synchronized (this.f13139z0) {
                }
            }
        } catch (IllegalStateException e7) {
            int i10 = u6.v.f46721a;
            if (i10 < 21 || !(e7 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e7.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e7;
                }
            }
            R(e7);
            if (i10 >= 21) {
                if (e7 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e7).isRecoverable() : false) {
                    z2 = true;
                }
            }
            if (z2) {
                d0();
            }
            throw b(A(e7, this.f13090P), this.f13138z, z2, 4003);
        }
    }

    @Override // E5.AbstractC0449f
    public void v(float f10, float f11) throws Exception {
        this.f13082G = f10;
        this.f13083H = f11;
        m0(this.f13085J);
    }

    @Override // E5.AbstractC0449f
    public final int w(T t10) throws C0465o {
        try {
            return l0(this.f13115n, t10);
        } catch (u e7) {
            throw b(e7, t10, false, 4002);
        }
    }

    @Override // E5.AbstractC0449f
    public final int x() {
        return 8;
    }

    public final boolean y(long j8, long j10) throws Exception {
        g gVar;
        AbstractC4256a.i(!this.v0);
        g gVar2 = this.f13125s;
        int i5 = gVar2.f13051j;
        if (i5 > 0) {
            gVar = gVar2;
            if (!b0(j8, j10, null, gVar2.f4917d, this.f13105e0, 0, i5, gVar2.f4919f, gVar2.h(Integer.MIN_VALUE), gVar2.h(4), this.f13074A)) {
                return false;
            }
            X(gVar.f13050i);
            gVar.o();
        } else {
            gVar = gVar2;
        }
        if (this.f13130u0) {
            this.v0 = true;
            return false;
        }
        boolean z2 = this.f13110j0;
        H5.h hVar = this.f13123r;
        if (z2) {
            AbstractC4256a.i(gVar.t(hVar));
            this.f13110j0 = false;
        }
        if (this.f13111k0) {
            if (gVar.f13051j > 0) {
                return true;
            }
            B();
            this.f13111k0 = false;
            P();
            if (!this.f13109i0) {
                return false;
            }
        }
        AbstractC4256a.i(!this.f13130u0);
        S3.s sVar = this.f3346b;
        sVar.e();
        hVar.o();
        while (true) {
            hVar.o();
            int iR = r(sVar, hVar, 0);
            if (iR == -5) {
                U(sVar);
                break;
            }
            if (iR != -4) {
                if (iR != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (hVar.h(4)) {
                    this.f13130u0 = true;
                    break;
                }
                if (this.f13133w0) {
                    T t10 = this.f13138z;
                    t10.getClass();
                    this.f13074A = t10;
                    V(t10, null);
                    this.f13133w0 = false;
                }
                hVar.s();
                if (!gVar.t(hVar)) {
                    this.f13110j0 = true;
                    break;
                }
            }
        }
        if (gVar.f13051j > 0) {
            gVar.s();
        }
        return gVar.f13051j > 0 || this.f13130u0 || this.f13111k0;
    }

    public abstract H5.i z(n nVar, T t10, T t11);

    public void W() {
    }

    public void e0() {
    }

    public void N(H5.h hVar) {
    }
}
