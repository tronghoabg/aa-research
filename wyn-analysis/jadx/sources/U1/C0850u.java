package U1;

import A7.B0;
import E5.C0441b;
import E5.C0469t;
import E5.C0471v;
import E5.C0473x;
import J9.C0664x;
import N1.AbstractC0774x;
import N1.C0754c;
import N1.C0759h;
import N1.C0762k;
import N1.C0763l;
import N1.C0765n;
import N1.C0773w;
import N1.C0775y;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import k2.AbstractC3144a;
import k2.g0;
import k2.n0;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import s8.C4026b;
import vf.AbstractC4345a;

/* renamed from: U1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0850u extends B0 implements InterfaceC0843m {

    /* renamed from: A, reason: collision with root package name */
    public final G4.c f12121A;

    /* renamed from: B, reason: collision with root package name */
    public final long f12122B;

    /* renamed from: C, reason: collision with root package name */
    public int f12123C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f12124D;

    /* renamed from: E, reason: collision with root package name */
    public int f12125E;

    /* renamed from: F, reason: collision with root package name */
    public int f12126F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f12127G;

    /* renamed from: H, reason: collision with root package name */
    public final a0 f12128H;

    /* renamed from: I, reason: collision with root package name */
    public g0 f12129I;

    /* renamed from: J, reason: collision with root package name */
    public final C0842l f12130J;

    /* renamed from: K, reason: collision with root package name */
    public N1.G f12131K;
    public N1.z L;

    /* renamed from: M, reason: collision with root package name */
    public C0765n f12132M;

    /* renamed from: N, reason: collision with root package name */
    public Surface f12133N;

    /* renamed from: O, reason: collision with root package name */
    public Surface f12134O;

    /* renamed from: P, reason: collision with root package name */
    public SurfaceHolder f12135P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f12136Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f12137R;

    /* renamed from: S, reason: collision with root package name */
    public Q1.p f12138S;

    /* renamed from: T, reason: collision with root package name */
    public final int f12139T;

    /* renamed from: U, reason: collision with root package name */
    public C0754c f12140U;

    /* renamed from: V, reason: collision with root package name */
    public float f12141V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f12142W;

    /* renamed from: X, reason: collision with root package name */
    public final boolean f12143X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f12144Y;

    /* renamed from: Z, reason: collision with root package name */
    public final int f12145Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f12146a0;

    /* renamed from: b, reason: collision with root package name */
    public final n2.t f12147b;

    /* renamed from: b0, reason: collision with root package name */
    public N1.Y f12148b0;

    /* renamed from: c, reason: collision with root package name */
    public final N1.G f12149c;

    /* renamed from: c0, reason: collision with root package name */
    public N1.z f12150c0;

    /* renamed from: d, reason: collision with root package name */
    public final C4026b f12151d;

    /* renamed from: d0, reason: collision with root package name */
    public P f12152d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f12153e;

    /* renamed from: e0, reason: collision with root package name */
    public int f12154e0;

    /* renamed from: f, reason: collision with root package name */
    public final C0850u f12155f;

    /* renamed from: f0, reason: collision with root package name */
    public long f12156f0;

    /* renamed from: g, reason: collision with root package name */
    public final W[] f12157g;

    /* renamed from: h, reason: collision with root package name */
    public final n2.s f12158h;

    /* renamed from: i, reason: collision with root package name */
    public final Q1.s f12159i;

    /* renamed from: j, reason: collision with root package name */
    public final C0845o f12160j;
    public final C0855z k;

    /* renamed from: l, reason: collision with root package name */
    public final Q1.j f12161l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f12162m;

    /* renamed from: n, reason: collision with root package name */
    public final N1.L f12163n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f12164o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f12165p;

    /* renamed from: q, reason: collision with root package name */
    public final k2.G f12166q;

    /* renamed from: r, reason: collision with root package name */
    public final V1.d f12167r;

    /* renamed from: s, reason: collision with root package name */
    public final Looper f12168s;

    /* renamed from: t, reason: collision with root package name */
    public final o2.d f12169t;

    /* renamed from: u, reason: collision with root package name */
    public final Q1.q f12170u;

    /* renamed from: v, reason: collision with root package name */
    public final r f12171v;

    /* renamed from: w, reason: collision with root package name */
    public final C0848s f12172w;

    /* renamed from: x, reason: collision with root package name */
    public final C0441b f12173x;

    /* renamed from: y, reason: collision with root package name */
    public final C0833c f12174y;

    /* renamed from: z, reason: collision with root package name */
    public final J4.c f12175z;

    static {
        AbstractC0774x.a("media3.exoplayer");
    }

    public C0850u(C0841k c0841k) {
        super(6);
        this.f12151d = new C4026b(3);
        try {
            Q1.k.o("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.1] [" + Q1.x.f9728e + "]");
            Context context = c0841k.f12090a;
            Looper looper = c0841k.f12098i;
            this.f12153e = context.getApplicationContext();
            C0664x c0664x = c0841k.f12097h;
            Q1.q qVar = c0841k.f12091b;
            c0664x.getClass();
            this.f12167r = new V1.d(qVar);
            this.f12145Z = c0841k.f12099j;
            this.f12140U = c0841k.k;
            this.f12137R = c0841k.f12100l;
            this.f12142W = false;
            this.f12122B = c0841k.f12105q;
            r rVar = new r(this);
            this.f12171v = rVar;
            this.f12172w = new C0848s();
            Handler handler = new Handler(looper);
            W[] wArrA = ((Z) c0841k.f12092c.get()).a(handler, rVar, rVar, rVar, rVar);
            this.f12157g = wArrA;
            Q1.k.g(wArrA.length > 0);
            this.f12158h = (n2.s) c0841k.f12094e.get();
            this.f12166q = (k2.G) c0841k.f12093d.get();
            this.f12169t = (o2.d) c0841k.f12096g.get();
            this.f12165p = c0841k.f12101m;
            this.f12128H = c0841k.f12102n;
            this.f12168s = looper;
            this.f12170u = qVar;
            this.f12155f = this;
            this.f12161l = new Q1.j(looper, qVar, new C0845o(this));
            this.f12162m = new CopyOnWriteArraySet();
            this.f12164o = new ArrayList();
            this.f12129I = new g0();
            this.f12130J = C0842l.f12109a;
            this.f12147b = new n2.t(new Y[wArrA.length], new n2.q[wArrA.length], N1.V.f8122b, null);
            this.f12163n = new N1.L();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i5 = 0; i5 < 20; i5++) {
                int i10 = iArr[i5];
                Q1.k.g(!false);
                sparseBooleanArray.append(i10, true);
            }
            this.f12158h.getClass();
            Q1.k.g(!false);
            sparseBooleanArray.append(29, true);
            Q1.k.g(!false);
            C0763l c0763l = new C0763l(sparseBooleanArray);
            this.f12149c = new N1.G(c0763l);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i11 = 0; i11 < c0763l.f8171a.size(); i11++) {
                int iA = c0763l.a(i11);
                Q1.k.g(!false);
                sparseBooleanArray2.append(iA, true);
            }
            Q1.k.g(!false);
            sparseBooleanArray2.append(4, true);
            Q1.k.g(!false);
            sparseBooleanArray2.append(10, true);
            Q1.k.g(!false);
            this.f12131K = new N1.G(new C0763l(sparseBooleanArray2));
            this.f12159i = this.f12170u.a(this.f12168s, null);
            C0845o c0845o = new C0845o(this);
            this.f12160j = c0845o;
            this.f12152d0 = P.i(this.f12147b);
            this.f12167r.M(this.f12155f, this.f12168s);
            int i12 = Q1.x.f9724a;
            String str = c0841k.f12108t;
            this.k = new C0855z(this.f12157g, this.f12158h, this.f12147b, (C0838h) c0841k.f12095f.get(), this.f12169t, this.f12123C, this.f12124D, this.f12167r, this.f12128H, c0841k.f12103o, c0841k.f12104p, this.f12168s, this.f12170u, c0845o, i12 < 31 ? new V1.k(str) : AbstractC4345a.A(this.f12153e, this, c0841k.f12106r, str), this.f12130J);
            this.f12141V = 1.0f;
            this.f12123C = 0;
            N1.z zVar = N1.z.f8304B;
            this.L = zVar;
            this.f12150c0 = zVar;
            this.f12154e0 = -1;
            AudioManager audioManager = (AudioManager) this.f12153e.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            int iGenerateAudioSessionId = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            this.f12139T = iGenerateAudioSessionId;
            int i13 = P1.c.f9036b;
            this.f12143X = true;
            V1.d dVar = this.f12167r;
            dVar.getClass();
            this.f12161l.a(dVar);
            o2.d dVar2 = this.f12169t;
            Handler handler2 = new Handler(this.f12168s);
            V1.d dVar3 = this.f12167r;
            o2.g gVar = (o2.g) dVar2;
            gVar.getClass();
            dVar3.getClass();
            ad.L l10 = gVar.f41296b;
            l10.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) l10.f17515b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                o2.c cVar = (o2.c) it.next();
                if (cVar.f41278b == dVar3) {
                    cVar.f41279c = true;
                    copyOnWriteArrayList.remove(cVar);
                }
            }
            copyOnWriteArrayList.add(new o2.c(handler2, dVar3));
            this.f12162m.add(this.f12171v);
            C0441b c0441b = new C0441b(context, handler, this.f12171v);
            this.f12173x = c0441b;
            c0441b.l();
            C0833c c0833c = new C0833c(context, handler, this.f12171v);
            this.f12174y = c0833c;
            c0833c.b(null);
            this.f12175z = new J4.c(context);
            this.f12121A = new G4.c(context, 1);
            D9.n nVar = new D9.n(3);
            nVar.f2592b = 0;
            nVar.f2593c = 0;
            new C0759h(nVar);
            this.f12148b0 = N1.Y.f8125d;
            this.f12138S = Q1.p.f9705c;
            this.f12158h.b(this.f12140U);
            D0(1, 10, Integer.valueOf(iGenerateAudioSessionId));
            D0(2, 10, Integer.valueOf(iGenerateAudioSessionId));
            D0(1, 3, this.f12140U);
            D0(2, 4, Integer.valueOf(this.f12137R));
            D0(2, 5, 0);
            D0(1, 9, Boolean.valueOf(this.f12142W));
            D0(2, 7, this.f12172w);
            D0(6, 8, this.f12172w);
            D0(-1, 16, Integer.valueOf(this.f12145Z));
            this.f12151d.e();
        } catch (Throwable th) {
            this.f12151d.e();
            throw th;
        }
    }

    public static long u0(P p10) {
        N1.M m10 = new N1.M();
        N1.L l10 = new N1.L();
        p10.f11977a.g(p10.f11978b.f38903a, l10);
        long j8 = p10.f11979c;
        if (j8 != -9223372036854775807L) {
            return l10.f8052e + j8;
        }
        return p10.f11977a.m(l10.f8050c, m10, 0L).f8067l;
    }

    public final void A0() {
        String str;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [AndroidXMedia3/1.5.1] [");
        sb2.append(Q1.x.f9728e);
        sb2.append("] [");
        HashSet hashSet = AbstractC0774x.f8277a;
        synchronized (AbstractC0774x.class) {
            str = AbstractC0774x.f8278b;
        }
        sb2.append(str);
        sb2.append("]");
        Q1.k.o("ExoPlayerImpl", sb2.toString());
        S0();
        this.f12173x.l();
        this.f12175z.getClass();
        this.f12121A.getClass();
        C0833c c0833c = this.f12174y;
        c0833c.f12024c = null;
        c0833c.a();
        c0833c.c(0);
        if (!this.k.C()) {
            this.f12161l.e(10, new C0664x(25));
        }
        this.f12161l.d();
        this.f12159i.f9711a.removeCallbacksAndMessages(null);
        o2.d dVar = this.f12169t;
        V1.d dVar2 = this.f12167r;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((o2.g) dVar).f41296b.f17515b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            o2.c cVar = (o2.c) it.next();
            if (cVar.f41278b == dVar2) {
                cVar.f41279c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        P p10 = this.f12152d0;
        if (p10.f11991p) {
            this.f12152d0 = p10.a();
        }
        P pG = this.f12152d0.g(1);
        this.f12152d0 = pG;
        P pB = pG.b(pG.f11978b);
        this.f12152d0 = pB;
        pB.f11992q = pB.f11994s;
        this.f12152d0.f11993r = 0L;
        V1.d dVar3 = this.f12167r;
        Q1.s sVar = dVar3.f12906h;
        Q1.k.h(sVar);
        sVar.c(new C8.g(dVar3, 14));
        this.f12158h.a();
        C0();
        Surface surface = this.f12134O;
        if (surface != null) {
            surface.release();
            this.f12134O = null;
        }
        int i5 = P1.c.f9036b;
        this.f12146a0 = true;
    }

    public final void B0(int i5, int i10) {
        S0();
        Q1.k.c(i5 >= 0 && i10 >= i5);
        ArrayList arrayList = this.f12164o;
        int size = arrayList.size();
        int iMin = Math.min(i10, size);
        if (i5 >= size || i5 == iMin) {
            return;
        }
        P p10 = this.f12152d0;
        int iP0 = p0(p10);
        long jI0 = i0(p10);
        int size2 = arrayList.size();
        this.f12125E++;
        for (int i11 = iMin - 1; i11 >= i5; i11--) {
            arrayList.remove(i11);
        }
        this.f12129I = this.f12129I.c(i5, iMin);
        V v2 = new V(arrayList, this.f12129I);
        P pW0 = w0(p10, v2, r0(p10.f11977a, v2, iP0, jI0));
        int i12 = pW0.f11981e;
        if (i12 != 1 && i12 != 4 && i5 < iMin && iMin == size2 && iP0 >= pW0.f11977a.o()) {
            pW0 = pW0.g(4);
        }
        g0 g0Var = this.f12129I;
        Q1.s sVar = this.k.f12218i;
        sVar.getClass();
        Q1.r rVarB = Q1.s.b();
        rVarB.f9709a = sVar.f9711a.obtainMessage(20, i5, iMin, g0Var);
        rVarB.b();
        Q0(pW0, 0, !pW0.f11978b.f38903a.equals(this.f12152d0.f11978b.f38903a), 4, n0(pW0), -1, false);
    }

    public final void C0() {
        SurfaceHolder surfaceHolder = this.f12135P;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f12171v);
            this.f12135P = null;
        }
    }

    public final void D0(int i5, int i10, Object obj) {
        for (W w2 : this.f12157g) {
            if (i5 == -1 || w2.f() == i5) {
                int iP0 = p0(this.f12152d0);
                N1.N n10 = this.f12152d0.f11977a;
                if (iP0 == -1) {
                    iP0 = 0;
                }
                C0855z c0855z = this.k;
                T t10 = new T(c0855z, w2, n10, iP0, this.f12170u, c0855z.k);
                Q1.k.g(!t10.f12002g);
                t10.f11999d = i10;
                Q1.k.g(!t10.f12002g);
                t10.f12000e = obj;
                t10.c();
            }
        }
    }

    public final void E0(C0754c c0754c, boolean z2) {
        S0();
        if (this.f12146a0) {
            return;
        }
        C0754c c0754c2 = this.f12140U;
        int i5 = Q1.x.f9724a;
        boolean zEquals = Objects.equals(c0754c2, c0754c);
        Q1.j jVar = this.f12161l;
        if (!zEquals) {
            this.f12140U = c0754c;
            D0(1, 3, c0754c);
            jVar.c(20, new S8.b(c0754c, i));
        }
        C0754c c0754c3 = z2 ? c0754c : null;
        C0833c c0833c = this.f12174y;
        c0833c.b(c0754c3);
        this.f12158h.b(c0754c);
        boolean zS0 = s0();
        int iD = c0833c.d(t0(), zS0);
        P0(iD, iD != -1 ? 1 : 2, zS0);
        jVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F0(java.util.List r16, boolean r17, long r18, int r20) {
        /*
            r15 = this;
            r1 = r20
            U1.P r2 = r15.f12152d0
            int r2 = r15.p0(r2)
            long r3 = r15.m0()
            int r5 = r15.f12125E
            r6 = 1
            int r5 = r5 + r6
            r15.f12125E = r5
            java.util.ArrayList r5 = r15.f12164o
            boolean r7 = r5.isEmpty()
            r8 = 0
            if (r7 != 0) goto L31
            int r7 = r5.size()
            int r9 = r7 + (-1)
        L21:
            if (r9 < 0) goto L29
            r5.remove(r9)
            int r9 = r9 + (-1)
            goto L21
        L29:
            k2.g0 r9 = r15.f12129I
            k2.g0 r7 = r9.c(r8, r7)
            r15.f12129I = r7
        L31:
            r7 = r16
            java.util.ArrayList r10 = r15.e0(r8, r7)
            U1.V r7 = new U1.V
            k2.g0 r9 = r15.f12129I
            r7.<init>(r5, r9)
            boolean r5 = r7.p()
            int r9 = r7.f12007e
            if (r5 != 0) goto L51
            if (r1 >= r9) goto L49
            goto L51
        L49:
            Cd.s0 r1 = new Cd.s0
            r2 = 8
            r1.<init>(r2)
            throw r1
        L51:
            r5 = -1
            if (r17 == 0) goto L61
            boolean r1 = r15.f12124D
            int r1 = r7.a(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L5f:
            r12 = r1
            goto L69
        L61:
            if (r1 != r5) goto L66
            r12 = r2
            r2 = r3
            goto L69
        L66:
            r2 = r18
            goto L5f
        L69:
            U1.P r1 = r15.f12152d0
            android.util.Pair r4 = r15.x0(r7, r12, r2)
            U1.P r1 = r15.w0(r1, r7, r4)
            int r4 = r1.f11981e
            if (r12 == r5) goto L85
            if (r4 == r6) goto L85
            boolean r4 = r7.p()
            if (r4 != 0) goto L84
            if (r12 < r9) goto L82
            goto L84
        L82:
            r4 = 2
            goto L85
        L84:
            r4 = 4
        L85:
            U1.P r1 = r1.g(r4)
            long r13 = Q1.x.K(r2)
            k2.g0 r11 = r15.f12129I
            U1.z r2 = r15.k
            Q1.s r2 = r2.f12218i
            U1.w r9 = new U1.w
            r9.<init>(r10, r11, r12, r13)
            r3 = 17
            Q1.r r2 = r2.a(r3, r9)
            r2.b()
            U1.P r2 = r15.f12152d0
            k2.H r2 = r2.f11978b
            java.lang.Object r2 = r2.f38903a
            k2.H r3 = r1.f11978b
            java.lang.Object r3 = r3.f38903a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lbd
            U1.P r2 = r15.f12152d0
            N1.N r2 = r2.f11977a
            boolean r2 = r2.p()
            if (r2 != 0) goto Lbd
            r3 = r6
            goto Lbe
        Lbd:
            r3 = r8
        Lbe:
            long r5 = r15.n0(r1)
            r2 = 0
            r4 = 4
            r7 = -1
            r8 = 0
            r0 = r15
            r0.Q0(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.C0850u.F0(java.util.List, boolean, long, int):void");
    }

    public final void G0(boolean z2) {
        S0();
        int iD = this.f12174y.d(t0(), z2);
        P0(iD, iD == -1 ? 2 : 1, z2);
    }

    public final void H0(N1.F f10) {
        S0();
        if (this.f12152d0.f11990o.equals(f10)) {
            return;
        }
        P pF = this.f12152d0.f(f10);
        this.f12125E++;
        this.k.f12218i.a(4, f10).b();
        Q0(pF, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void I0(int i5) {
        S0();
        if (this.f12123C != i5) {
            this.f12123C = i5;
            Q1.s sVar = this.k.f12218i;
            sVar.getClass();
            Q1.r rVarB = Q1.s.b();
            rVarB.f9709a = sVar.f9711a.obtainMessage(11, i5, 0);
            rVarB.b();
            C0471v c0471v = new C0471v(i5, 2);
            Q1.j jVar = this.f12161l;
            jVar.c(8, c0471v);
            O0();
            jVar.b();
        }
    }

    public final void J0(g0 g0Var) {
        S0();
        int length = g0Var.f39073b.length;
        ArrayList arrayList = this.f12164o;
        Q1.k.c(length == arrayList.size());
        this.f12129I = g0Var;
        V v2 = new V(arrayList, this.f12129I);
        P pW0 = w0(this.f12152d0, v2, x0(v2, l0(), m0()));
        this.f12125E++;
        this.k.f12218i.a(21, g0Var).b();
        Q0(pW0, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void K0(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (W w2 : this.f12157g) {
            if (w2.f() == 2) {
                int iP0 = p0(this.f12152d0);
                N1.N n10 = this.f12152d0.f11977a;
                int i5 = iP0 == -1 ? 0 : iP0;
                C0855z c0855z = this.k;
                T t10 = new T(c0855z, w2, n10, i5, this.f12170u, c0855z.k);
                Q1.k.g(!t10.f12002g);
                t10.f11999d = 1;
                Q1.k.g(!t10.f12002g);
                t10.f12000e = surface;
                t10.c();
                arrayList.add(t10);
            }
        }
        Surface surface2 = this.f12133N;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((T) it.next()).a(this.f12122B);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z2 = true;
            }
            Surface surface3 = this.f12133N;
            Surface surface4 = this.f12134O;
            if (surface3 == surface4) {
                surface4.release();
                this.f12134O = null;
            }
        }
        this.f12133N = surface;
        if (z2) {
            N0(new C0840j(2, new E5.Q("Detaching surface timed out.", 4), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
        }
    }

    public final void L0(Surface surface) {
        S0();
        C0();
        K0(surface);
        int i5 = surface == null ? 0 : -1;
        y0(i5, i5);
    }

    public final void M0(float f10) {
        S0();
        float fH = Q1.x.h(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (this.f12141V == fH) {
            return;
        }
        this.f12141V = fH;
        D0(1, 2, Float.valueOf(this.f12174y.f12028g * fH));
        this.f12161l.e(22, new C0469t(fH, 1));
    }

    public final void N0(C0840j c0840j) {
        P p10 = this.f12152d0;
        P pB = p10.b(p10.f11978b);
        pB.f11992q = pB.f11994s;
        pB.f11993r = 0L;
        P pG = pB.g(1);
        if (c0840j != null) {
            pG = pG.e(c0840j);
        }
        P p11 = pG;
        this.f12125E++;
        Q1.s sVar = this.k.f12218i;
        sVar.getClass();
        Q1.r rVarB = Q1.s.b();
        rVarB.f9709a = sVar.f9711a.obtainMessage(6);
        rVarB.b();
        Q0(p11, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // A7.B0
    public final void O(long j8, int i5, boolean z2) {
        S0();
        if (i5 == -1) {
            return;
        }
        Q1.k.c(i5 >= 0);
        N1.N n10 = this.f12152d0.f11977a;
        if (n10.p() || i5 < n10.o()) {
            V1.d dVar = this.f12167r;
            if (!dVar.f12907i) {
                V1.a aVarG = dVar.G();
                dVar.f12907i = true;
                dVar.L(aVarG, -1, new V1.b(8));
            }
            this.f12125E++;
            if (v0()) {
                Q1.k.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                T5.s sVar = new T5.s(this.f12152d0);
                sVar.c(1);
                C0850u c0850u = this.f12160j.f12112a;
                c0850u.f12159i.c(new T3.r(4, c0850u, sVar));
                return;
            }
            P pG = this.f12152d0;
            int i10 = pG.f11981e;
            if (i10 == 3 || (i10 == 4 && !n10.p())) {
                pG = this.f12152d0.g(2);
            }
            int iL0 = l0();
            P pW0 = w0(pG, n10, x0(n10, i5, j8));
            this.k.f12218i.a(3, new C0854y(n10, i5, Q1.x.K(j8))).b();
            Q0(pW0, 0, true, 1, n0(pW0), iL0, z2);
        }
    }

    public final void O0() {
        int iK;
        int iE;
        N1.G g9 = this.f12131K;
        int i5 = Q1.x.f9724a;
        C0850u c0850u = this.f12155f;
        boolean zV0 = c0850u.v0();
        N1.N nO0 = c0850u.o0();
        boolean zP = nO0.p();
        N1.M m10 = (N1.M) c0850u.f421a;
        boolean z2 = !zP && nO0.m(c0850u.l0(), m10, 0L).f8064h;
        N1.N nO02 = c0850u.o0();
        if (nO02.p()) {
            iK = -1;
        } else {
            int iL0 = c0850u.l0();
            c0850u.S0();
            int i10 = c0850u.f12123C;
            if (i10 == 1) {
                i10 = 0;
            }
            c0850u.S0();
            iK = nO02.k(iL0, i10, c0850u.f12124D);
        }
        boolean z10 = iK != -1;
        N1.N nO03 = c0850u.o0();
        if (nO03.p()) {
            iE = -1;
        } else {
            int iL02 = c0850u.l0();
            c0850u.S0();
            int i11 = c0850u.f12123C;
            if (i11 == 1) {
                i11 = 0;
            }
            c0850u.S0();
            iE = nO03.e(iL02, i11, c0850u.f12124D);
        }
        boolean z11 = iE != -1;
        N1.N nO04 = c0850u.o0();
        boolean z12 = !nO04.p() && nO04.m(c0850u.l0(), m10, 0L).a();
        N1.N nO05 = c0850u.o0();
        boolean z13 = !nO05.p() && nO05.m(c0850u.l0(), m10, 0L).f8065i;
        boolean zP2 = c0850u.o0().p();
        S3.l lVar = new S3.l(20);
        C0763l c0763l = this.f12149c.f8035a;
        C0762k c0762k = (C0762k) lVar.f10967a;
        c0762k.getClass();
        for (int i12 = 0; i12 < c0763l.f8171a.size(); i12++) {
            c0762k.a(c0763l.a(i12));
        }
        boolean z14 = !zV0;
        lVar.k(4, z14);
        lVar.k(5, z2 && !zV0);
        lVar.k(6, z10 && !zV0);
        lVar.k(7, !zP2 && (z10 || !z12 || z2) && !zV0);
        lVar.k(8, z11 && !zV0);
        lVar.k(9, !zP2 && (z11 || (z12 && z13)) && !zV0);
        lVar.k(10, z14);
        lVar.k(11, z2 && !zV0);
        lVar.k(12, z2 && !zV0);
        N1.G g10 = new N1.G(c0762k.b());
        this.f12131K = g10;
        if (g10.equals(g9)) {
            return;
        }
        this.f12161l.c(13, new C0845o(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final void P0(int i5, int i10, boolean z2) {
        ?? r14 = (!z2 || i5 == -1) ? 0 : 1;
        int i11 = i5 == 0 ? 1 : 0;
        P p10 = this.f12152d0;
        if (p10.f11987l == r14 && p10.f11989n == i11 && p10.f11988m == i10) {
            return;
        }
        this.f12125E++;
        P p11 = this.f12152d0;
        boolean z10 = p11.f11991p;
        P pA = p11;
        if (z10) {
            pA = p11.a();
        }
        P pD = pA.d(i10, i11, r14);
        int i12 = (i11 << 4) | i10;
        Q1.s sVar = this.k.f12218i;
        sVar.getClass();
        Q1.r rVarB = Q1.s.b();
        rVarB.f9709a = sVar.f9711a.obtainMessage(1, r14, i12);
        rVarB.b();
        Q0(pD, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(final U1.P r34, int r35, boolean r36, int r37, long r38, int r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.C0850u.Q0(U1.P, int, boolean, int, long, int, boolean):void");
    }

    public final void R0() {
        int iT0 = t0();
        G4.c cVar = this.f12121A;
        J4.c cVar2 = this.f12175z;
        if (iT0 != 1) {
            if (iT0 == 2 || iT0 == 3) {
                S0();
                boolean z2 = this.f12152d0.f11991p;
                s0();
                cVar2.getClass();
                s0();
                cVar.getClass();
                return;
            }
            if (iT0 != 4) {
                throw new IllegalStateException();
            }
        }
        cVar2.getClass();
        cVar.getClass();
    }

    public final void S0() {
        C4026b c4026b = this.f12151d;
        synchronized (c4026b) {
            boolean z2 = false;
            while (!c4026b.f45322b) {
                try {
                    c4026b.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f12168s.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f12168s.getThread().getName();
            int i5 = Q1.x.f9724a;
            Locale locale = Locale.US;
            String strG = R8.v.g("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f12143X) {
                throw new IllegalStateException(strG);
            }
            Q1.k.x("ExoPlayerImpl", strG, this.f12144Y ? null : new IllegalStateException());
            this.f12144Y = true;
        }
    }

    public final ArrayList e0(int i5, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            O o7 = new O((AbstractC3144a) list.get(i10), this.f12165p);
            arrayList.add(o7);
            this.f12164o.add(i10 + i5, new C0849t(o7.f11972b, o7.f11971a));
        }
        this.f12129I = this.f12129I.b(i5, arrayList.size());
        return arrayList;
    }

    public final void f0(ArrayList arrayList, int i5) {
        S0();
        Q1.k.c(i5 >= 0);
        ArrayList arrayList2 = this.f12164o;
        int iMin = Math.min(i5, arrayList2.size());
        if (arrayList2.isEmpty()) {
            boolean z2 = this.f12154e0 == -1;
            S0();
            F0(arrayList, z2, -9223372036854775807L, -1);
            return;
        }
        P p10 = this.f12152d0;
        N1.N n10 = p10.f11977a;
        this.f12125E++;
        ArrayList arrayListE0 = e0(iMin, arrayList);
        V v2 = new V(arrayList2, this.f12129I);
        P pW0 = w0(p10, v2, r0(n10, v2, p0(p10), i0(p10)));
        g0 g0Var = this.f12129I;
        Q1.s sVar = this.k.f12218i;
        C0852w c0852w = new C0852w(arrayListE0, g0Var, -1, -9223372036854775807L);
        sVar.getClass();
        Q1.r rVarB = Q1.s.b();
        rVarB.f9709a = sVar.f9711a.obtainMessage(18, iMin, 0, c0852w);
        rVarB.b();
        Q0(pW0, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final N1.z g0() {
        N1.N nO0 = o0();
        if (nO0.p()) {
            return this.f12150c0;
        }
        C0773w c0773w = nO0.m(l0(), (N1.M) this.f421a, 0L).f8059c;
        C0775y c0775yA = this.f12150c0.a();
        N1.z zVar = c0773w.f8274d;
        if (zVar != null) {
            CharSequence charSequence = zVar.f8306a;
            if (charSequence != null) {
                c0775yA.f8279a = charSequence;
            }
            CharSequence charSequence2 = zVar.f8307b;
            if (charSequence2 != null) {
                c0775yA.f8280b = charSequence2;
            }
            CharSequence charSequence3 = zVar.f8308c;
            if (charSequence3 != null) {
                c0775yA.f8281c = charSequence3;
            }
            CharSequence charSequence4 = zVar.f8309d;
            if (charSequence4 != null) {
                c0775yA.f8282d = charSequence4;
            }
            CharSequence charSequence5 = zVar.f8310e;
            if (charSequence5 != null) {
                c0775yA.f8283e = charSequence5;
            }
            byte[] bArr = zVar.f8311f;
            if (bArr != null) {
                c0775yA.f8284f = bArr == null ? null : (byte[]) bArr.clone();
                c0775yA.f8285g = zVar.f8312g;
            }
            Integer num = zVar.f8313h;
            if (num != null) {
                c0775yA.f8286h = num;
            }
            Integer num2 = zVar.f8314i;
            if (num2 != null) {
                c0775yA.f8287i = num2;
            }
            Integer num3 = zVar.f8315j;
            if (num3 != null) {
                c0775yA.f8288j = num3;
            }
            Boolean bool = zVar.k;
            if (bool != null) {
                c0775yA.k = bool;
            }
            Integer num4 = zVar.f8316l;
            if (num4 != null) {
                c0775yA.f8289l = num4;
            }
            Integer num5 = zVar.f8317m;
            if (num5 != null) {
                c0775yA.f8289l = num5;
            }
            Integer num6 = zVar.f8318n;
            if (num6 != null) {
                c0775yA.f8290m = num6;
            }
            Integer num7 = zVar.f8319o;
            if (num7 != null) {
                c0775yA.f8291n = num7;
            }
            Integer num8 = zVar.f8320p;
            if (num8 != null) {
                c0775yA.f8292o = num8;
            }
            Integer num9 = zVar.f8321q;
            if (num9 != null) {
                c0775yA.f8293p = num9;
            }
            Integer num10 = zVar.f8322r;
            if (num10 != null) {
                c0775yA.f8294q = num10;
            }
            CharSequence charSequence6 = zVar.f8323s;
            if (charSequence6 != null) {
                c0775yA.f8295r = charSequence6;
            }
            CharSequence charSequence7 = zVar.f8324t;
            if (charSequence7 != null) {
                c0775yA.f8296s = charSequence7;
            }
            CharSequence charSequence8 = zVar.f8325u;
            if (charSequence8 != null) {
                c0775yA.f8297t = charSequence8;
            }
            Integer num11 = zVar.f8326v;
            if (num11 != null) {
                c0775yA.f8298u = num11;
            }
            Integer num12 = zVar.f8327w;
            if (num12 != null) {
                c0775yA.f8299v = num12;
            }
            CharSequence charSequence9 = zVar.f8328x;
            if (charSequence9 != null) {
                c0775yA.f8300w = charSequence9;
            }
            CharSequence charSequence10 = zVar.f8329y;
            if (charSequence10 != null) {
                c0775yA.f8301x = charSequence10;
            }
            Integer num13 = zVar.f8330z;
            if (num13 != null) {
                c0775yA.f8302y = num13;
            }
            AbstractC3409K abstractC3409K = zVar.f8305A;
            if (!abstractC3409K.isEmpty()) {
                c0775yA.f8303z = AbstractC3409K.j(abstractC3409K);
            }
        }
        return new N1.z(c0775yA);
    }

    public final long h0() {
        S0();
        if (v0()) {
            P p10 = this.f12152d0;
            return p10.k.equals(p10.f11978b) ? Q1.x.W(this.f12152d0.f11992q) : q0();
        }
        S0();
        if (this.f12152d0.f11977a.p()) {
            return this.f12156f0;
        }
        P p11 = this.f12152d0;
        long j8 = 0;
        if (p11.k.f38906d != p11.f11978b.f38906d) {
            return Q1.x.W(p11.f11977a.m(l0(), (N1.M) this.f421a, 0L).f8068m);
        }
        long j10 = p11.f11992q;
        if (this.f12152d0.k.b()) {
            P p12 = this.f12152d0;
            p12.f11977a.g(p12.k.f38903a, this.f12163n).d(this.f12152d0.k.f38904b);
        } else {
            j8 = j10;
        }
        P p13 = this.f12152d0;
        N1.N n10 = p13.f11977a;
        Object obj = p13.k.f38903a;
        N1.L l10 = this.f12163n;
        n10.g(obj, l10);
        return Q1.x.W(j8 + l10.f8052e);
    }

    public final long i0(P p10) {
        if (!p10.f11978b.b()) {
            return Q1.x.W(n0(p10));
        }
        Object obj = p10.f11978b.f38903a;
        N1.N n10 = p10.f11977a;
        N1.L l10 = this.f12163n;
        n10.g(obj, l10);
        long j8 = p10.f11979c;
        if (j8 == -9223372036854775807L) {
            return Q1.x.W(n10.m(p0(p10), (N1.M) this.f421a, 0L).f8067l);
        }
        return Q1.x.W(j8) + Q1.x.W(l10.f8052e);
    }

    public final int j0() {
        S0();
        if (v0()) {
            return this.f12152d0.f11978b.f38904b;
        }
        return -1;
    }

    public final int k0() {
        S0();
        if (v0()) {
            return this.f12152d0.f11978b.f38905c;
        }
        return -1;
    }

    public final int l0() {
        S0();
        int iP0 = p0(this.f12152d0);
        if (iP0 == -1) {
            return 0;
        }
        return iP0;
    }

    public final long m0() {
        S0();
        return Q1.x.W(n0(this.f12152d0));
    }

    public final long n0(P p10) {
        if (p10.f11977a.p()) {
            return Q1.x.K(this.f12156f0);
        }
        long j8 = p10.f11991p ? p10.j() : p10.f11994s;
        if (p10.f11978b.b()) {
            return j8;
        }
        N1.N n10 = p10.f11977a;
        Object obj = p10.f11978b.f38903a;
        N1.L l10 = this.f12163n;
        n10.g(obj, l10);
        return j8 + l10.f8052e;
    }

    public final N1.N o0() {
        S0();
        return this.f12152d0.f11977a;
    }

    public final int p0(P p10) {
        if (p10.f11977a.p()) {
            return this.f12154e0;
        }
        return p10.f11977a.g(p10.f11978b.f38903a, this.f12163n).f8050c;
    }

    public final long q0() {
        S0();
        if (!v0()) {
            N1.N nO0 = o0();
            if (nO0.p()) {
                return -9223372036854775807L;
            }
            return Q1.x.W(nO0.m(l0(), (N1.M) this.f421a, 0L).f8068m);
        }
        P p10 = this.f12152d0;
        k2.H h10 = p10.f11978b;
        N1.N n10 = p10.f11977a;
        Object obj = h10.f38903a;
        N1.L l10 = this.f12163n;
        n10.g(obj, l10);
        return Q1.x.W(l10.a(h10.f38904b, h10.f38905c));
    }

    public final Pair r0(N1.N n10, V v2, int i5, long j8) {
        if (n10.p() || v2.p()) {
            boolean z2 = !n10.p() && v2.p();
            return x0(v2, z2 ? -1 : i5, z2 ? -9223372036854775807L : j8);
        }
        Pair pairI = n10.i((N1.M) this.f421a, this.f12163n, i5, Q1.x.K(j8));
        Object obj = pairI.first;
        if (v2.b(obj) != -1) {
            return pairI;
        }
        int iL = C0855z.L((N1.M) this.f421a, this.f12163n, this.f12123C, this.f12124D, obj, n10, v2);
        if (iL == -1) {
            return x0(v2, -1, -9223372036854775807L);
        }
        N1.M m10 = (N1.M) this.f421a;
        v2.m(iL, m10, 0L);
        return x0(v2, iL, Q1.x.W(m10.f8067l));
    }

    public final boolean s0() {
        S0();
        return this.f12152d0.f11987l;
    }

    public final int t0() {
        S0();
        return this.f12152d0.f11981e;
    }

    public final boolean v0() {
        S0();
        return this.f12152d0.f11978b.b();
    }

    public final P w0(P p10, N1.N n10, Pair pair) {
        List list;
        Q1.k.c(n10.p() || pair != null);
        N1.N n11 = p10.f11977a;
        long jI0 = i0(p10);
        P pH = p10.h(n10);
        if (n10.p()) {
            k2.H h10 = P.f11976u;
            long jK = Q1.x.K(this.f12156f0);
            P pB = pH.c(h10, jK, jK, jK, 0L, n0.f39127d, this.f12147b, e0.f40101e).b(h10);
            pB.f11992q = pB.f11994s;
            return pB;
        }
        Object obj = pH.f11978b.f38903a;
        boolean zEquals = obj.equals(pair.first);
        k2.H h11 = !zEquals ? new k2.H(pair.first) : pH.f11978b;
        long jLongValue = ((Long) pair.second).longValue();
        long jK2 = Q1.x.K(jI0);
        if (!n11.p()) {
            jK2 -= n11.g(obj, this.f12163n).f8052e;
        }
        if (!zEquals || jLongValue < jK2) {
            k2.H h12 = h11;
            Q1.k.g(!h12.b());
            n0 n0Var = !zEquals ? n0.f39127d : pH.f11984h;
            n2.t tVar = !zEquals ? this.f12147b : pH.f11985i;
            if (zEquals) {
                list = pH.f11986j;
            } else {
                C3407I c3407i = AbstractC3409K.f40056b;
                list = e0.f40101e;
            }
            P pB2 = pH.c(h12, jLongValue, jLongValue, jLongValue, 0L, n0Var, tVar, list).b(h12);
            pB2.f11992q = jLongValue;
            return pB2;
        }
        if (jLongValue != jK2) {
            k2.H h13 = h11;
            Q1.k.g(!h13.b());
            long jMax = Math.max(0L, pH.f11993r - (jLongValue - jK2));
            long j8 = pH.f11992q;
            if (pH.k.equals(pH.f11978b)) {
                j8 = jLongValue + jMax;
            }
            P pC = pH.c(h13, jLongValue, jLongValue, jLongValue, jMax, pH.f11984h, pH.f11985i, pH.f11986j);
            pC.f11992q = j8;
            return pC;
        }
        int iB = n10.b(pH.k.f38903a);
        if (iB != -1 && n10.f(iB, this.f12163n, false).f8050c == n10.g(h11.f38903a, this.f12163n).f8050c) {
            return pH;
        }
        n10.g(h11.f38903a, this.f12163n);
        long jA = h11.b() ? this.f12163n.a(h11.f38904b, h11.f38905c) : this.f12163n.f8051d;
        k2.H h14 = h11;
        P pB3 = pH.c(h14, pH.f11994s, pH.f11994s, pH.f11980d, jA - pH.f11994s, pH.f11984h, pH.f11985i, pH.f11986j).b(h14);
        pB3.f11992q = jA;
        return pB3;
    }

    public final Pair x0(N1.N n10, int i5, long j8) {
        if (n10.p()) {
            this.f12154e0 = i5;
            if (j8 == -9223372036854775807L) {
                j8 = 0;
            }
            this.f12156f0 = j8;
            return null;
        }
        if (i5 == -1 || i5 >= n10.o()) {
            i5 = n10.a(this.f12124D);
            j8 = Q1.x.W(n10.m(i5, (N1.M) this.f421a, 0L).f8067l);
        }
        return n10.i((N1.M) this.f421a, this.f12163n, i5, Q1.x.K(j8));
    }

    public final void y0(int i5, int i10) {
        Q1.p pVar = this.f12138S;
        if (i5 == pVar.f9706a && i10 == pVar.f9707b) {
            return;
        }
        this.f12138S = new Q1.p(i5, i10);
        this.f12161l.e(24, new C0473x(i5, i10, 1));
        D0(2, 14, new Q1.p(i5, i10));
    }

    public final void z0() {
        S0();
        boolean zS0 = s0();
        int iD = this.f12174y.d(2, zS0);
        P0(iD, iD == -1 ? 2 : 1, zS0);
        P p10 = this.f12152d0;
        if (p10.f11981e != 1) {
            return;
        }
        P pE = p10.e(null);
        P pG = pE.g(pE.f11977a.p() ? 4 : 2);
        this.f12125E++;
        Q1.s sVar = this.k.f12218i;
        sVar.getClass();
        Q1.r rVarB = Q1.s.b();
        rVarB.f9709a = sVar.f9711a.obtainMessage(29);
        rVarB.b();
        Q0(pG, 1, false, 5, -9223372036854775807L, -1, false);
    }
}
