package W1;

import A7.V1;
import J9.C0656o;
import K8.H;
import N1.C;
import N1.C0754c;
import N1.C0755d;
import N1.C0765n;
import N1.F;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.unity3d.services.core.device.MimeTypes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3406H;
import l8.C3407I;
import l8.e0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: j0, reason: collision with root package name */
    public static final Object f15036j0 = new Object();

    /* renamed from: k0, reason: collision with root package name */
    public static ScheduledExecutorService f15037k0;

    /* renamed from: l0, reason: collision with root package name */
    public static int f15038l0;

    /* renamed from: A, reason: collision with root package name */
    public o f15039A;

    /* renamed from: B, reason: collision with root package name */
    public o f15040B;

    /* renamed from: C, reason: collision with root package name */
    public F f15041C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f15042D;

    /* renamed from: E, reason: collision with root package name */
    public ByteBuffer f15043E;

    /* renamed from: F, reason: collision with root package name */
    public int f15044F;

    /* renamed from: G, reason: collision with root package name */
    public long f15045G;

    /* renamed from: H, reason: collision with root package name */
    public long f15046H;

    /* renamed from: I, reason: collision with root package name */
    public long f15047I;

    /* renamed from: J, reason: collision with root package name */
    public long f15048J;

    /* renamed from: K, reason: collision with root package name */
    public int f15049K;
    public boolean L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f15050M;

    /* renamed from: N, reason: collision with root package name */
    public long f15051N;

    /* renamed from: O, reason: collision with root package name */
    public float f15052O;

    /* renamed from: P, reason: collision with root package name */
    public ByteBuffer f15053P;

    /* renamed from: Q, reason: collision with root package name */
    public int f15054Q;

    /* renamed from: R, reason: collision with root package name */
    public ByteBuffer f15055R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f15056S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f15057T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f15058U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f15059V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f15060W;

    /* renamed from: X, reason: collision with root package name */
    public int f15061X;

    /* renamed from: Y, reason: collision with root package name */
    public C0755d f15062Y;

    /* renamed from: Z, reason: collision with root package name */
    public Y9.c f15063Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15064a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f15065a0;

    /* renamed from: b, reason: collision with root package name */
    public final b7.k f15066b;

    /* renamed from: b0, reason: collision with root package name */
    public long f15067b0;

    /* renamed from: c, reason: collision with root package name */
    public final m f15068c;

    /* renamed from: c0, reason: collision with root package name */
    public long f15069c0;

    /* renamed from: d, reason: collision with root package name */
    public final z f15070d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f15071d0;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f15072e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f15073e0;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f15074f;

    /* renamed from: f0, reason: collision with root package name */
    public Looper f15075f0;

    /* renamed from: g, reason: collision with root package name */
    public final l f15076g;

    /* renamed from: g0, reason: collision with root package name */
    public long f15077g0;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayDeque f15078h;

    /* renamed from: h0, reason: collision with root package name */
    public long f15079h0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15080i;

    /* renamed from: i0, reason: collision with root package name */
    public Handler f15081i0;

    /* renamed from: j, reason: collision with root package name */
    public int f15082j;
    public G9.e k;

    /* renamed from: l, reason: collision with root package name */
    public final r f15083l;

    /* renamed from: m, reason: collision with root package name */
    public final r f15084m;

    /* renamed from: n, reason: collision with root package name */
    public final u f15085n;

    /* renamed from: o, reason: collision with root package name */
    public final S3.c f15086o;

    /* renamed from: p, reason: collision with root package name */
    public final u f15087p;

    /* renamed from: q, reason: collision with root package name */
    public V1.k f15088q;

    /* renamed from: r, reason: collision with root package name */
    public xa.d f15089r;

    /* renamed from: s, reason: collision with root package name */
    public n f15090s;

    /* renamed from: t, reason: collision with root package name */
    public n f15091t;

    /* renamed from: u, reason: collision with root package name */
    public O1.a f15092u;

    /* renamed from: v, reason: collision with root package name */
    public AudioTrack f15093v;

    /* renamed from: w, reason: collision with root package name */
    public b f15094w;

    /* renamed from: x, reason: collision with root package name */
    public C0656o f15095x;

    /* renamed from: y, reason: collision with root package name */
    public Dd.c f15096y;

    /* renamed from: z, reason: collision with root package name */
    public C0754c f15097z;

    public t(H h10) {
        b bVarB;
        Context context = (Context) h10.f6583b;
        this.f15064a = context;
        C0754c c0754c = C0754c.f8139e;
        this.f15097z = c0754c;
        if (context != null) {
            b bVar = b.f14944c;
            int i5 = Q1.x.f9724a;
            bVarB = b.b(context, c0754c, null);
        } else {
            bVarB = (b) h10.f6584c;
        }
        this.f15094w = bVarB;
        this.f15066b = (b7.k) h10.f6585d;
        int i10 = Q1.x.f9724a;
        this.f15080i = false;
        this.f15082j = 0;
        this.f15085n = (u) h10.f6586e;
        S3.c cVar = (S3.c) h10.f6588g;
        cVar.getClass();
        this.f15086o = cVar;
        this.f15076g = new l(new A.e0(this, 22));
        m mVar = new m();
        this.f15068c = mVar;
        z zVar = new z();
        zVar.f15136m = Q1.x.f9729f;
        this.f15070d = zVar;
        O1.h hVar = new O1.h();
        C3407I c3407i = AbstractC3409K.f40056b;
        Object[] objArr = {hVar, mVar, zVar};
        AbstractC3437s.b(3, objArr);
        this.f15072e = AbstractC3409K.h(3, objArr);
        this.f15074f = AbstractC3409K.n(new y());
        this.f15052O = 1.0f;
        this.f15061X = 0;
        this.f15062Y = new C0755d();
        F f10 = F.f8031d;
        this.f15040B = new o(f10, 0L, 0L);
        this.f15041C = f10;
        this.f15042D = false;
        this.f15078h = new ArrayDeque();
        this.f15083l = new r();
        this.f15084m = new r();
        this.f15087p = (u) h10.f6587f;
    }

    public static boolean p(AudioTrack audioTrack) {
        return Q1.x.f9724a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r9) {
        /*
            r8 = this;
            boolean r0 = r8.x()
            b7.k r1 = r8.f15066b
            if (r0 != 0) goto L3f
            boolean r0 = r8.f15065a0
            if (r0 != 0) goto L39
            W1.n r0 = r8.f15091t
            int r2 = r0.f15017c
            if (r2 != 0) goto L39
            N1.n r0 = r0.f15015a
            int r0 = r0.f8212E
            N1.F r0 = r8.f15041C
            r1.getClass()
            float r2 = r0.f8032a
            java.lang.Object r3 = r1.f19398d
            O1.g r3 = (O1.g) r3
            float r4 = r3.f8837c
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r5 = 1
            if (r4 == 0) goto L2c
            r3.f8837c = r2
            r3.f8843i = r5
        L2c:
            float r2 = r3.f8838d
            float r4 = r0.f8033b
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L3b
            r3.f8838d = r4
            r3.f8843i = r5
            goto L3b
        L39:
            N1.F r0 = N1.F.f8031d
        L3b:
            r8.f15041C = r0
        L3d:
            r3 = r0
            goto L42
        L3f:
            N1.F r0 = N1.F.f8031d
            goto L3d
        L42:
            boolean r0 = r8.f15065a0
            if (r0 != 0) goto L59
            W1.n r0 = r8.f15091t
            int r2 = r0.f15017c
            if (r2 != 0) goto L59
            N1.n r0 = r0.f15015a
            int r0 = r0.f8212E
            boolean r0 = r8.f15042D
            java.lang.Object r1 = r1.f19397c
            W1.x r1 = (W1.x) r1
            r1.f15124o = r0
            goto L5a
        L59:
            r0 = 0
        L5a:
            r8.f15042D = r0
            java.util.ArrayDeque r0 = r8.f15078h
            W1.o r2 = new W1.o
            r4 = 0
            long r4 = java.lang.Math.max(r4, r9)
            W1.n r9 = r8.f15091t
            long r6 = r8.k()
            int r9 = r9.f15019e
            long r6 = Q1.x.Q(r9, r6)
            r2.<init>(r3, r4, r6)
            r0.add(r2)
            W1.n r9 = r8.f15091t
            O1.a r9 = r9.f15023i
            r8.f15092u = r9
            r9.b()
            xa.d r9 = r8.f15089r
            if (r9 == 0) goto L9c
            boolean r10 = r8.f15042D
            java.lang.Object r9 = r9.f47873b
            W1.v r9 = (W1.v) r9
            S3.s r9 = r9.f15101D0
            java.lang.Object r0 = r9.f11009b
            android.os.Handler r0 = (android.os.Handler) r0
            if (r0 == 0) goto L9c
            G5.o r1 = new G5.o
            r2 = 1
            r1.<init>(r2, r9, r10)
            r0.post(r1)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.t.a(long):void");
    }

    public final AudioTrack b(g gVar, C0754c c0754c, int i5, C0765n c0765n) throws i {
        try {
            try {
                AudioTrack audioTrackA = this.f15087p.a(gVar, c0754c, i5);
                int state = audioTrackA.getState();
                if (state == 1) {
                    return audioTrackA;
                }
                try {
                    audioTrackA.release();
                } catch (Exception unused) {
                }
                throw new i(state, gVar.f14962c, gVar.f14964e, gVar.f14961b, c0765n, gVar.f14963d, null);
            } catch (IllegalArgumentException e7) {
                e = e7;
                RuntimeException runtimeException = e;
                throw new i(0, gVar.f14962c, gVar.f14964e, gVar.f14961b, c0765n, gVar.f14963d, runtimeException);
            } catch (UnsupportedOperationException e10) {
                e = e10;
                RuntimeException runtimeException2 = e;
                throw new i(0, gVar.f14962c, gVar.f14964e, gVar.f14961b, c0765n, gVar.f14963d, runtimeException2);
            }
        } catch (IllegalArgumentException e11) {
            e = e11;
        } catch (UnsupportedOperationException e12) {
            e = e12;
        }
    }

    public final AudioTrack c(n nVar) throws i {
        try {
            return b(nVar.a(), this.f15097z, this.f15061X, nVar.f15015a);
        } catch (i e7) {
            xa.d dVar = this.f15089r;
            if (dVar != null) {
                dVar.A(e7);
            }
            throw e7;
        }
    }

    public final void d(C0765n c0765n, int[] iArr) throws h {
        int iIntValue;
        int i5;
        int i10;
        O1.a aVar;
        boolean z2;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int iC;
        q();
        boolean zEquals = "audio/raw".equals(c0765n.f8232n);
        boolean z11 = this.f15080i;
        String str = c0765n.f8232n;
        int i16 = c0765n.f8211D;
        int i17 = c0765n.f8210C;
        if (zEquals) {
            int i18 = c0765n.f8212E;
            Q1.k.c(Q1.x.F(i18));
            int iZ = Q1.x.z(i18, i17);
            C3406H c3406h = new C3406H(4);
            c3406h.d(this.f15072e);
            c3406h.b((O1.d[]) this.f15066b.f19396b);
            O1.a aVar2 = new O1.a(c3406h.g());
            if (aVar2.equals(this.f15092u)) {
                aVar2 = this.f15092u;
            }
            int i19 = c0765n.f8213F;
            z zVar = this.f15070d;
            zVar.f15133i = i19;
            zVar.f15134j = c0765n.f8214G;
            this.f15068c.f15013i = iArr;
            try {
                O1.b bVarA = aVar2.a(new O1.b(i16, i17, i18));
                int i20 = bVarA.f8803b;
                iIntValue = Q1.x.q(i20);
                int i21 = bVarA.f8804c;
                int iZ2 = Q1.x.z(i21, i20);
                i16 = bVarA.f8802a;
                i5 = iZ2;
                z10 = z11;
                i12 = iZ;
                i10 = i21;
                aVar = aVar2;
                z2 = false;
                i11 = 0;
            } catch (O1.c e7) {
                throw new h(e7, c0765n);
            }
        } else {
            O1.a aVar3 = new O1.a(e0.f40101e);
            e eVarH = this.f15082j != 0 ? h(c0765n) : e.f14954d;
            if (this.f15082j == 0 || !eVarH.f14955a) {
                Pair pairD = this.f15094w.d(this.f15097z, c0765n);
                if (pairD == null) {
                    throw new h("Unable to configure passthrough for: " + c0765n, c0765n);
                }
                int iIntValue2 = ((Integer) pairD.first).intValue();
                iIntValue = ((Integer) pairD.second).intValue();
                i5 = -1;
                i10 = iIntValue2;
                aVar = aVar3;
                z2 = false;
                i11 = 2;
                z10 = z11;
                i12 = -1;
            } else {
                str.getClass();
                int iC2 = C.c(str, c0765n.k);
                iIntValue = Q1.x.q(i17);
                i11 = 1;
                i12 = -1;
                i10 = iC2;
                aVar = aVar3;
                z2 = eVarH.f14956b;
                z10 = true;
                i5 = -1;
            }
        }
        if (i10 == 0) {
            throw new h("Invalid output encoding (mode=" + i11 + ") for: " + c0765n, c0765n);
        }
        if (iIntValue == 0) {
            throw new h("Invalid output channel config (mode=" + i11 + ") for: " + c0765n, c0765n);
        }
        boolean zEquals2 = "audio/vnd.dts.hd;profile=lbr".equals(str);
        int i22 = c0765n.f8229j;
        if (zEquals2 && i22 == -1) {
            i22 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i16, iIntValue, i10);
        Q1.k.g(minBufferSize != -2);
        int i23 = i5 != -1 ? i5 : 1;
        double d3 = z10 ? 8.0d : 1.0d;
        this.f15085n.getClass();
        if (i11 != 0) {
            if (i11 == 1) {
                i13 = i12;
                i15 = S3.f.l((50000000 * u.c(i10)) / 1000000);
            } else {
                if (i11 != 2) {
                    throw new IllegalArgumentException();
                }
                int i24 = i10 == 5 ? 500000 : i10 == 8 ? 1000000 : 250000;
                if (i22 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    iC = A6.c.q(i22, 8);
                } else {
                    iC = u.c(i10);
                }
                i13 = i12;
                i15 = S3.f.l((i24 * iC) / 1000000);
            }
            i14 = i5;
        } else {
            i13 = i12;
            long j8 = i16;
            long j10 = 250000 * j8;
            long j11 = i23;
            i14 = i5;
            i15 = Q1.x.i(minBufferSize * 4, S3.f.l((j10 * j11) / 1000000), S3.f.l(((750000 * j8) * j11) / 1000000));
        }
        this.f15071d0 = false;
        n nVar = new n(c0765n, i13, i11, i14, i16, iIntValue, i10, (((Math.max(minBufferSize, (int) (i15 * d3)) + i23) - 1) / i23) * i23, aVar, z10, z2, this.f15065a0);
        if (o()) {
            this.f15090s = nVar;
        } else {
            this.f15091t = nVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r13) throws W1.j {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.t.e(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() throws W1.j {
        /*
            r6 = this;
            O1.a r0 = r6.f15092u
            boolean r0 = r0.e()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            r6.e(r1)
            java.nio.ByteBuffer r0 = r6.f15055R
            if (r0 != 0) goto L44
            goto L43
        L14:
            O1.a r0 = r6.f15092u
            boolean r5 = r0.e()
            if (r5 == 0) goto L2e
            boolean r5 = r0.f8800d
            if (r5 == 0) goto L21
            goto L2e
        L21:
            r0.f8800d = r4
            java.util.ArrayList r0 = r0.f8798b
            java.lang.Object r0 = r0.get(r3)
            O1.d r0 = (O1.d) r0
            r0.e()
        L2e:
            r6.t(r1)
            O1.a r0 = r6.f15092u
            boolean r0 = r0.d()
            if (r0 == 0) goto L44
            java.nio.ByteBuffer r0 = r6.f15055R
            if (r0 == 0) goto L43
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L44
        L43:
            return r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.t.f():boolean");
    }

    public final void g() throws IllegalStateException {
        Dd.c cVar;
        if (o()) {
            this.f15045G = 0L;
            this.f15046H = 0L;
            this.f15047I = 0L;
            this.f15048J = 0L;
            this.f15073e0 = false;
            this.f15049K = 0;
            this.f15040B = new o(this.f15041C, 0L, 0L);
            this.f15051N = 0L;
            this.f15039A = null;
            this.f15078h.clear();
            this.f15053P = null;
            this.f15054Q = 0;
            this.f15055R = null;
            this.f15057T = false;
            this.f15056S = false;
            this.f15058U = false;
            this.f15043E = null;
            this.f15044F = 0;
            this.f15070d.f15138o = 0L;
            O1.a aVar = this.f15091t.f15023i;
            this.f15092u = aVar;
            aVar.b();
            AudioTrack audioTrack = this.f15076g.f14990c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f15093v.pause();
            }
            if (p(this.f15093v)) {
                G9.e eVar = this.k;
                eVar.getClass();
                this.f15093v.unregisterStreamEventCallback((G5.F) eVar.f4686c);
                ((Handler) eVar.f4685b).removeCallbacksAndMessages(null);
            }
            g gVarA = this.f15091t.a();
            n nVar = this.f15090s;
            if (nVar != null) {
                this.f15091t = nVar;
                this.f15090s = null;
            }
            l lVar = this.f15076g;
            lVar.d();
            lVar.f14990c = null;
            lVar.f14992e = null;
            if (Q1.x.f9724a >= 24 && (cVar = this.f15096y) != null) {
                q qVar = (q) cVar.f2644d;
                qVar.getClass();
                ((AudioTrack) cVar.f2642b).removeOnRoutingChangedListener(qVar);
                cVar.f2644d = null;
                this.f15096y = null;
            }
            AudioTrack audioTrack2 = this.f15093v;
            xa.d dVar = this.f15089r;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f15036j0) {
                try {
                    if (f15037k0 == null) {
                        f15037k0 = Executors.newSingleThreadScheduledExecutor(new Q1.v(0));
                    }
                    f15038l0++;
                    f15037k0.schedule(new Cb.a(audioTrack2, dVar, handler, gVarA, 7), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f15093v = null;
        }
        r rVar = this.f15084m;
        rVar.f15033c = null;
        rVar.f15031a = -9223372036854775807L;
        rVar.f15032b = -9223372036854775807L;
        r rVar2 = this.f15083l;
        rVar2.f15033c = null;
        rVar2.f15031a = -9223372036854775807L;
        rVar2.f15032b = -9223372036854775807L;
        this.f15077g0 = 0L;
        this.f15079h0 = 0L;
        Handler handler2 = this.f15081i0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final e h(C0765n c0765n) {
        int i5;
        boolean zBooleanValue;
        AudioManager audioManager;
        if (this.f15071d0) {
            return e.f14954d;
        }
        C0754c c0754c = this.f15097z;
        S3.c cVar = this.f15086o;
        cVar.getClass();
        c0765n.getClass();
        c0754c.getClass();
        int i10 = Q1.x.f9724a;
        if (i10 < 29 || (i5 = c0765n.f8211D) == -1) {
            return e.f14954d;
        }
        Boolean bool = (Boolean) cVar.f10937c;
        boolean z2 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = (Context) cVar.f10936b;
            if (context == null || (audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO)) == null) {
                cVar.f10937c = Boolean.FALSE;
            } else {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                cVar.f10937c = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            }
            zBooleanValue = ((Boolean) cVar.f10937c).booleanValue();
        }
        String str = c0765n.f8232n;
        str.getClass();
        int iC = C.c(str, c0765n.k);
        if (iC == 0 || i10 < Q1.x.o(iC)) {
            return e.f14954d;
        }
        int iQ = Q1.x.q(c0765n.f8210C);
        if (iQ == 0) {
            return e.f14954d;
        }
        try {
            AudioFormat audioFormatP = Q1.x.p(i5, iQ, iC);
            if (i10 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatP, (AudioAttributes) c0754c.a().f48001b)) {
                    return e.f14954d;
                }
                E4.j jVar = new E4.j();
                jVar.f2896a = true;
                jVar.f2898c = zBooleanValue;
                return jVar.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatP, (AudioAttributes) c0754c.a().f48001b);
            if (playbackOffloadSupport == 0) {
                return e.f14954d;
            }
            E4.j jVar2 = new E4.j();
            if (i10 > 32 && playbackOffloadSupport == 2) {
                z2 = true;
            }
            jVar2.f2896a = true;
            jVar2.f2897b = z2;
            jVar2.f2898c = zBooleanValue;
            return jVar2.a();
        } catch (IllegalArgumentException unused) {
            return e.f14954d;
        }
    }

    public final int i(C0765n c0765n) {
        q();
        if ("audio/raw".equals(c0765n.f8232n)) {
            int i5 = c0765n.f8212E;
            if (!Q1.x.F(i5)) {
                N0.a.o(i5, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i5 != 2) {
                return 1;
            }
        } else if (this.f15094w.d(this.f15097z, c0765n) == null) {
            return 0;
        }
        return 2;
    }

    public final long j() {
        return this.f15091t.f15017c == 0 ? this.f15045G / r0.f15016b : this.f15046H;
    }

    public final long k() {
        n nVar = this.f15091t;
        if (nVar.f15017c != 0) {
            return this.f15048J;
        }
        long j8 = this.f15047I;
        long j10 = nVar.f15018d;
        int i5 = Q1.x.f9724a;
        return ((j8 + j10) - 1) / j10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x039f, code lost:
    
        if (r5 == 0) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0115, code lost:
    
        if (r10.b() == 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(long r28, int r30, java.nio.ByteBuffer r31) throws java.lang.IllegalStateException, W1.i, W1.j {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.t.l(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean m() {
        if (o()) {
            return !(Q1.x.f9724a >= 29 && this.f15093v.isOffloadedPlayback() && this.f15058U) && this.f15076g.c(k());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() throws W1.i {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.t.n():boolean");
    }

    public final boolean o() {
        return this.f15093v != null;
    }

    public final void q() {
        Context context;
        b bVarC;
        c cVar;
        if (this.f15095x != null || (context = this.f15064a) == null) {
            return;
        }
        this.f15075f0 = Looper.myLooper();
        C0656o c0656o = new C0656o(context, new S8.b(this, 11), this.f15097z, this.f15063Z);
        this.f15095x = c0656o;
        if (c0656o.f5961a) {
            bVarC = (b) c0656o.f5968h;
            bVarC.getClass();
        } else {
            c0656o.f5961a = true;
            d dVar = (d) c0656o.f5967g;
            if (dVar != null) {
                dVar.f14951a.registerContentObserver(dVar.f14952b, false, dVar);
            }
            int i5 = Q1.x.f9724a;
            Handler handler = (Handler) c0656o.f5964d;
            Context context2 = (Context) c0656o.f5962b;
            if (i5 >= 23 && (cVar = (c) c0656o.f5965e) != null) {
                AudioManager audioManager = (AudioManager) context2.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                audioManager.getClass();
                audioManager.registerAudioDeviceCallback(cVar, handler);
            }
            bVarC = b.c(context2, context2.registerReceiver((V1) c0656o.f5966f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (C0754c) c0656o.f5970j, (Y9.c) c0656o.f5969i);
            c0656o.f5968h = bVarC;
        }
        this.f15094w = bVarC;
    }

    public final void r() throws IllegalStateException {
        this.f15059V = true;
        if (o()) {
            l lVar = this.f15076g;
            if (lVar.f15010x != -9223372036854775807L) {
                lVar.f14987I.getClass();
                lVar.f15010x = Q1.x.K(SystemClock.elapsedRealtime());
            }
            G5.v vVar = lVar.f14992e;
            vVar.getClass();
            vVar.a();
            this.f15093v.play();
        }
    }

    public final void s() throws IllegalStateException {
        if (this.f15057T) {
            return;
        }
        this.f15057T = true;
        long jK = k();
        l lVar = this.f15076g;
        lVar.f15012z = lVar.b();
        lVar.f14987I.getClass();
        lVar.f15010x = Q1.x.K(SystemClock.elapsedRealtime());
        lVar.f14979A = jK;
        if (p(this.f15093v)) {
            this.f15058U = false;
        }
        this.f15093v.stop();
        this.f15044F = 0;
    }

    public final void t(long j8) throws j {
        ByteBuffer byteBuffer;
        e(j8);
        if (this.f15055R != null) {
            return;
        }
        if (!this.f15092u.e()) {
            ByteBuffer byteBuffer2 = this.f15053P;
            if (byteBuffer2 != null) {
                w(byteBuffer2);
                e(j8);
                return;
            }
            return;
        }
        while (!this.f15092u.d()) {
            do {
                O1.a aVar = this.f15092u;
                if (aVar.e()) {
                    ByteBuffer byteBuffer3 = aVar.f8799c[aVar.c()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        aVar.f(O1.d.f8806a);
                        byteBuffer = aVar.f8799c[aVar.c()];
                    }
                } else {
                    byteBuffer = O1.d.f8806a;
                }
                if (byteBuffer.hasRemaining()) {
                    w(byteBuffer);
                    e(j8);
                } else {
                    ByteBuffer byteBuffer4 = this.f15053P;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    O1.a aVar2 = this.f15092u;
                    ByteBuffer byteBuffer5 = this.f15053P;
                    if (aVar2.e() && !aVar2.f8800d) {
                        aVar2.f(byteBuffer5);
                    }
                }
            } while (this.f15055R == null);
            return;
        }
    }

    public final void u() throws IllegalStateException {
        g();
        C3407I c3407iListIterator = this.f15072e.listIterator(0);
        while (c3407iListIterator.hasNext()) {
            ((O1.d) c3407iListIterator.next()).reset();
        }
        C3407I c3407iListIterator2 = this.f15074f.listIterator(0);
        while (c3407iListIterator2.hasNext()) {
            ((O1.d) c3407iListIterator2.next()).reset();
        }
        O1.a aVar = this.f15092u;
        if (aVar != null) {
            int i5 = 0;
            while (true) {
                e0 e0Var = aVar.f8797a;
                if (i5 >= e0Var.f40103d) {
                    break;
                }
                O1.d dVar = (O1.d) e0Var.get(i5);
                dVar.flush();
                dVar.reset();
                i5++;
            }
            aVar.f8799c = new ByteBuffer[0];
            O1.b bVar = O1.b.f8801e;
            aVar.f8800d = false;
        }
        this.f15059V = false;
        this.f15071d0 = false;
    }

    public final void v() {
        if (o()) {
            try {
                this.f15093v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f15041C.f8032a).setPitch(this.f15041C.f8033b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e7) {
                Q1.k.x("DefaultAudioSink", "Failed to set playback params", e7);
            }
            F f10 = new F(this.f15093v.getPlaybackParams().getSpeed(), this.f15093v.getPlaybackParams().getPitch());
            this.f15041C = f10;
            l lVar = this.f15076g;
            lVar.f14996i = f10.f8032a;
            G5.v vVar = lVar.f14992e;
            if (vVar != null) {
                vVar.a();
            }
            lVar.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.t.w(java.nio.ByteBuffer):void");
    }

    public final boolean x() {
        n nVar = this.f15091t;
        return nVar != null && nVar.f15024j && Q1.x.f9724a >= 23;
    }
}
