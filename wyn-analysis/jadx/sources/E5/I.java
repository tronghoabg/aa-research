package E5;

import G5.C0527h;
import N1.C0762k;
import a2.C1323c;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.unity3d.services.core.device.MimeTypes;
import f6.AbstractC2588a;
import f6.C2613z;
import f6.InterfaceC2612y;
import h6.C2784c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import l8.AbstractC3409K;
import l8.C3407I;
import r6.C3930e;
import s8.C4026b;
import t6.C4136d;
import t6.InterfaceC4137e;
import u6.AbstractC4256a;
import u6.C4260e;
import x9.C4504d;

/* loaded from: classes3.dex */
public final class I extends A7.B0 {

    /* renamed from: A, reason: collision with root package name */
    public final C0447e f3046A;

    /* renamed from: B, reason: collision with root package name */
    public final E0 f3047B;

    /* renamed from: C, reason: collision with root package name */
    public final C4504d f3048C;

    /* renamed from: D, reason: collision with root package name */
    public final ya.b f3049D;

    /* renamed from: E, reason: collision with root package name */
    public final long f3050E;

    /* renamed from: F, reason: collision with root package name */
    public int f3051F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3052G;

    /* renamed from: H, reason: collision with root package name */
    public int f3053H;

    /* renamed from: I, reason: collision with root package name */
    public int f3054I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f3055J;

    /* renamed from: K, reason: collision with root package name */
    public int f3056K;
    public final C0 L;

    /* renamed from: M, reason: collision with root package name */
    public f6.X f3057M;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f3058N;

    /* renamed from: O, reason: collision with root package name */
    public s0 f3059O;

    /* renamed from: P, reason: collision with root package name */
    public C0450f0 f3060P;

    /* renamed from: Q, reason: collision with root package name */
    public AudioTrack f3061Q;

    /* renamed from: R, reason: collision with root package name */
    public Object f3062R;

    /* renamed from: S, reason: collision with root package name */
    public Surface f3063S;

    /* renamed from: T, reason: collision with root package name */
    public SurfaceHolder f3064T;

    /* renamed from: U, reason: collision with root package name */
    public w6.k f3065U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f3066V;

    /* renamed from: W, reason: collision with root package name */
    public TextureView f3067W;

    /* renamed from: X, reason: collision with root package name */
    public final int f3068X;

    /* renamed from: Y, reason: collision with root package name */
    public u6.p f3069Y;

    /* renamed from: Z, reason: collision with root package name */
    public final int f3070Z;

    /* renamed from: a0, reason: collision with root package name */
    public final C0527h f3071a0;

    /* renamed from: b, reason: collision with root package name */
    public final r6.s f3072b;

    /* renamed from: b0, reason: collision with root package name */
    public float f3073b0;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f3074c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3075c0;

    /* renamed from: d, reason: collision with root package name */
    public final C4026b f3076d;

    /* renamed from: d0, reason: collision with root package name */
    public C2784c f3077d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f3078e;

    /* renamed from: e0, reason: collision with root package name */
    public final boolean f3079e0;

    /* renamed from: f, reason: collision with root package name */
    public final I f3080f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f3081f0;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0449f[] f3082g;

    /* renamed from: g0, reason: collision with root package name */
    public final C0464n f3083g0;

    /* renamed from: h, reason: collision with root package name */
    public final r6.o f3084h;

    /* renamed from: h0, reason: collision with root package name */
    public v6.o f3085h0;

    /* renamed from: i, reason: collision with root package name */
    public final u6.s f3086i;

    /* renamed from: i0, reason: collision with root package name */
    public C0450f0 f3087i0;

    /* renamed from: j, reason: collision with root package name */
    public final C0470u f3088j;

    /* renamed from: j0, reason: collision with root package name */
    public q0 f3089j0;
    public final O k;

    /* renamed from: k0, reason: collision with root package name */
    public int f3090k0;

    /* renamed from: l, reason: collision with root package name */
    public final K8.H f3091l;

    /* renamed from: l0, reason: collision with root package name */
    public long f3092l0;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f3093m;

    /* renamed from: n, reason: collision with root package name */
    public final H0 f3094n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f3095o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f3096p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC2612y f3097q;

    /* renamed from: r, reason: collision with root package name */
    public final F5.f f3098r;

    /* renamed from: s, reason: collision with root package name */
    public final Looper f3099s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC4137e f3100t;

    /* renamed from: u, reason: collision with root package name */
    public final long f3101u;

    /* renamed from: v, reason: collision with root package name */
    public final long f3102v;

    /* renamed from: w, reason: collision with root package name */
    public final u6.q f3103w;

    /* renamed from: x, reason: collision with root package name */
    public final F f3104x;

    /* renamed from: y, reason: collision with root package name */
    public final G f3105y;

    /* renamed from: z, reason: collision with root package name */
    public final C0441b f3106z;

    static {
        P.a("goog.exo.exoplayer");
    }

    public I(r rVar) {
        boolean zEquals;
        super(1);
        this.f3076d = new C4026b(7);
        try {
            AbstractC4256a.u("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.2] [" + u6.v.f46725e + "]");
            this.f3078e = rVar.f3516a.getApplicationContext();
            this.f3098r = new F5.f(rVar.f3517b);
            this.f3071a0 = rVar.f3523h;
            this.f3068X = rVar.f3524i;
            this.f3075c0 = false;
            this.f3050E = rVar.f3530p;
            F f10 = new F(this);
            this.f3104x = f10;
            this.f3105y = new G();
            Handler handler = new Handler(rVar.f3522g);
            AbstractC0449f[] abstractC0449fArrA = ((C0463m) rVar.f3518c.get()).a(handler, f10, f10, f10, f10);
            this.f3082g = abstractC0449fArrA;
            AbstractC4256a.i(abstractC0449fArrA.length > 0);
            this.f3084h = (r6.o) rVar.f3520e.get();
            this.f3097q = (InterfaceC2612y) rVar.f3519d.get();
            this.f3100t = (InterfaceC4137e) rVar.f3521f.get();
            this.f3096p = rVar.f3525j;
            this.L = rVar.k;
            this.f3101u = rVar.f3526l;
            this.f3102v = rVar.f3527m;
            this.f3058N = rVar.f3531q;
            Looper looper = rVar.f3522g;
            this.f3099s = looper;
            u6.q qVar = rVar.f3517b;
            this.f3103w = qVar;
            this.f3080f = this;
            this.f3091l = new K8.H(looper, qVar, new C0470u(this));
            this.f3093m = new CopyOnWriteArraySet();
            this.f3095o = new ArrayList();
            this.f3057M = new f6.X();
            this.f3072b = new r6.s(new B0[abstractC0449fArrA.length], new r6.n[abstractC0449fArrA.length], L0.f3138b, null);
            this.f3094n = new H0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i5 = 0; i5 < 21; i5++) {
                int i10 = iArr[i5];
                AbstractC4256a.i(!false);
                sparseBooleanArray.append(i10, true);
            }
            this.f3084h.getClass();
            AbstractC4256a.i(!false);
            sparseBooleanArray.append(29, true);
            AbstractC4256a.i(!false);
            C4260e c4260e = new C4260e(sparseBooleanArray);
            this.f3074c = new s0(c4260e);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i11 = 0; i11 < c4260e.f46677a.size(); i11++) {
                int iA = c4260e.a(i11);
                AbstractC4256a.i(!false);
                sparseBooleanArray2.append(iA, true);
            }
            AbstractC4256a.i(!false);
            sparseBooleanArray2.append(4, true);
            AbstractC4256a.i(!false);
            sparseBooleanArray2.append(10, true);
            AbstractC4256a.i(!false);
            this.f3059O = new s0(new C4260e(sparseBooleanArray2));
            this.f3086i = this.f3103w.a(this.f3099s, null);
            C0470u c0470u = new C0470u(this);
            this.f3088j = c0470u;
            this.f3089j0 = q0.h(this.f3072b);
            this.f3098r.P(this.f3080f, this.f3099s);
            int i12 = u6.v.f46721a;
            this.k = new O(this.f3082g, this.f3084h, this.f3072b, new C0459k(), this.f3100t, this.f3051F, this.f3052G, this.f3098r, this.L, rVar.f3528n, rVar.f3529o, this.f3058N, this.f3099s, this.f3103w, c0470u, i12 < 31 ? new F5.l() : B.a(this.f3078e, this, rVar.f3532r));
            this.f3073b0 = 1.0f;
            this.f3051F = 0;
            C0450f0 c0450f0 = C0450f0.f3356G;
            this.f3060P = c0450f0;
            this.f3087i0 = c0450f0;
            int iGenerateAudioSessionId = -1;
            this.f3090k0 = -1;
            if (i12 < 21) {
                AudioTrack audioTrack = this.f3061Q;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f3061Q.release();
                    this.f3061Q = null;
                }
                if (this.f3061Q == null) {
                    this.f3061Q = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f3070Z = this.f3061Q.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f3078e.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.f3070Z = iGenerateAudioSessionId;
            }
            this.f3077d0 = C2784c.f36184b;
            this.f3079e0 = true;
            F5.f fVar = this.f3098r;
            fVar.getClass();
            this.f3091l.d(fVar);
            InterfaceC4137e interfaceC4137e = this.f3100t;
            Handler handler2 = new Handler(this.f3099s);
            F5.f fVar2 = this.f3098r;
            t6.p pVar = (t6.p) interfaceC4137e;
            pVar.getClass();
            fVar2.getClass();
            C1323c c1323c = pVar.f45895b;
            c1323c.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c1323c.f17156b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C4136d c4136d = (C4136d) it.next();
                if (c4136d.f45860b == fVar2) {
                    c4136d.f45861c = true;
                    copyOnWriteArrayList.remove(c4136d);
                }
            }
            ((CopyOnWriteArrayList) c1323c.f17156b).add(new C4136d(fVar2, handler2));
            this.f3093m.add(this.f3104x);
            C0441b c0441b = new C0441b(rVar.f3516a, handler, this.f3104x);
            this.f3106z = c0441b;
            c0441b.l();
            this.f3046A = new C0447e(rVar.f3516a, handler, this.f3104x);
            int i13 = u6.v.f46721a;
            E0 e02 = new E0(rVar.f3516a, handler, this.f3104x);
            this.f3047B = e02;
            int iQ = u6.v.q(this.f3071a0.f4411c);
            if (e02.f3027f != iQ) {
                e02.f3027f = iQ;
                e02.b();
                I i14 = e02.f3024c.f3030a;
                C0464n c0464nG0 = g0(i14.f3047B);
                if (!c0464nG0.equals(i14.f3083g0)) {
                    i14.f3083g0 = c0464nG0;
                    i14.f3091l.p(29, new B8.b(c0464nG0, 9));
                }
            }
            Context context = rVar.f3516a;
            C4504d c4504d = new C4504d(16);
            this.f3048C = c4504d;
            Context context2 = rVar.f3516a;
            ya.b bVar = new ya.b(16);
            this.f3049D = bVar;
            this.f3083g0 = g0(e02);
            this.f3085h0 = v6.o.f46898e;
            this.f3069Y = u6.p.f46710c;
            r6.o oVar = this.f3084h;
            C0527h c0527h = this.f3071a0;
            r6.l lVar = (r6.l) oVar;
            synchronized (lVar.f44455c) {
                zEquals = lVar.f44461i.equals(c0527h);
                lVar.f44461i = c0527h;
            }
            if (!zEquals) {
                lVar.f();
            }
            F0(1, 10, Integer.valueOf(this.f3070Z));
            F0(2, 10, Integer.valueOf(this.f3070Z));
            F0(1, 3, this.f3071a0);
            F0(2, 4, Integer.valueOf(this.f3068X));
            F0(2, 5, 0);
            F0(1, 9, Boolean.valueOf(this.f3075c0));
            F0(2, 7, this.f3105y);
            F0(6, 8, this.f3105y);
            this.f3076d.e();
        } catch (Throwable th) {
            this.f3076d.e();
            throw th;
        }
    }

    public static C0464n g0(E0 e02) {
        e02.getClass();
        int i5 = u6.v.f46721a;
        AudioManager audioManager = e02.f3025d;
        return new C0464n(0, i5 >= 28 ? audioManager.getStreamMinVolume(e02.f3027f) : 0, audioManager.getStreamMaxVolume(e02.f3027f));
    }

    public static long u0(q0 q0Var) {
        I0 i02 = new I0();
        H0 h02 = new H0();
        q0Var.f3499a.g(q0Var.f3500b.f35112a, h02);
        long j8 = q0Var.f3501c;
        if (j8 != -9223372036854775807L) {
            return h02.f3043e + j8;
        }
        return q0Var.f3499a.m(h02.f3041c, i02, 0L).f3120l;
    }

    public static boolean w0(q0 q0Var) {
        return q0Var.f3503e == 3 && q0Var.f3509l && q0Var.f3510m == 0;
    }

    public final void A0(int i5, int i10) {
        u6.p pVar = this.f3069Y;
        if (i5 == pVar.f46711a && i10 == pVar.f46712b) {
            return;
        }
        this.f3069Y = new u6.p(i5, i10);
        this.f3091l.p(24, new C0473x(i5, i10, 0));
    }

    public final void B0() {
        Q0();
        boolean zS0 = s0();
        int iC = this.f3046A.c(2, zS0);
        N0(iC, (!zS0 || iC == 1) ? 1 : 2, zS0);
        q0 q0Var = this.f3089j0;
        if (q0Var.f3503e != 1) {
            return;
        }
        q0 q0VarD = q0Var.d(null);
        q0 q0VarF = q0VarD.f(q0VarD.f3499a.p() ? 4 : 2);
        this.f3053H++;
        u6.s sVar = this.k.f3170h;
        sVar.getClass();
        u6.r rVarB = u6.s.b();
        rVarB.f46714a = sVar.f46716a.obtainMessage(0);
        rVarB.b();
        O0(q0VarF, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    public final void C0(u0 u0Var) {
        u0Var.getClass();
        K8.H h10 = this.f3091l;
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) h10.f6586e;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            u6.i iVar = (u6.i) it.next();
            if (iVar.f46678a.equals(u0Var)) {
                iVar.f46681d = true;
                if (iVar.f46680c) {
                    iVar.f46680c = false;
                    C4260e c4260eC = iVar.f46679b.c();
                    ((u6.h) h10.f6585d).a(iVar.f46678a, c4260eC);
                }
                copyOnWriteArraySet.remove(iVar);
            }
        }
    }

    public final void D0() {
        w6.k kVar = this.f3065U;
        F f10 = this.f3104x;
        if (kVar != null) {
            y0 y0VarH0 = h0(this.f3105y);
            AbstractC4256a.i(!y0VarH0.f3570g);
            y0VarH0.f3567d = 10000;
            AbstractC4256a.i(!y0VarH0.f3570g);
            y0VarH0.f3568e = null;
            y0VarH0.c();
            this.f3065U.f47355a.remove(f10);
            this.f3065U = null;
        }
        TextureView textureView = this.f3067W;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != f10) {
                AbstractC4256a.E("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f3067W.setSurfaceTextureListener(null);
            }
            this.f3067W = null;
        }
        SurfaceHolder surfaceHolder = this.f3064T;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(f10);
            this.f3064T = null;
        }
    }

    public final void E0(long j8, int i5, boolean z2) {
        F5.f fVar = this.f3098r;
        if (!fVar.f3899i) {
            F5.a aVarJ = fVar.J();
            fVar.f3899i = true;
            fVar.O(aVarJ, -1, new A5.f(24));
        }
        J0 j02 = this.f3089j0.f3499a;
        if (i5 < 0 || (!j02.p() && i5 >= j02.o())) {
            throw new Cd.s0(2);
        }
        this.f3053H++;
        if (!x0()) {
            int i10 = t0() != 1 ? 2 : 1;
            int iL0 = l0();
            q0 q0VarY0 = y0(this.f3089j0.f(i10), j02, z0(j02, i5, j8));
            this.k.f3170h.a(3, new N(j02, i5, u6.v.y(j8))).b();
            O0(q0VarY0, 0, 1, true, true, 1, n0(q0VarY0), iL0, z2);
            return;
        }
        AbstractC4256a.E("ExoPlayerImpl", "seekTo ignored because an ad is playing");
        A6.d dVar = new A6.d(this.f3089j0);
        dVar.a(1);
        I i11 = this.f3088j.f3544a;
        i11.f3086i.f46716a.post(new C8.d(4, i11, dVar));
    }

    public final void F0(int i5, int i10, Object obj) {
        for (AbstractC0449f abstractC0449f : this.f3082g) {
            if (abstractC0449f.f3345a == i5) {
                y0 y0VarH0 = h0(abstractC0449f);
                AbstractC4256a.i(!y0VarH0.f3570g);
                y0VarH0.f3567d = i10;
                AbstractC4256a.i(!y0VarH0.f3570g);
                y0VarH0.f3568e = obj;
                y0VarH0.c();
            }
        }
    }

    public final void G0(List list) {
        Q0();
        q0();
        m0();
        this.f3053H++;
        ArrayList arrayList = this.f3095o;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i5 = size - 1; i5 >= 0; i5--) {
                arrayList.remove(i5);
            }
            f6.X x5 = this.f3057M;
            int[] iArr = x5.f35008b;
            int[] iArr2 = new int[iArr.length - size];
            int i10 = 0;
            for (int i11 = 0; i11 < iArr.length; i11++) {
                int i12 = iArr[i11];
                if (i12 < 0 || i12 >= size) {
                    int i13 = i11 - i10;
                    if (i12 >= 0) {
                        i12 -= size;
                    }
                    iArr2[i13] = i12;
                } else {
                    i10++;
                }
            }
            this.f3057M = new f6.X(iArr2, new Random(x5.f35007a.nextLong()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i14 = 0; i14 < list.size(); i14++) {
            m0 m0Var = new m0((AbstractC2588a) list.get(i14), this.f3096p);
            arrayList2.add(m0Var);
            arrayList.add(i14, new H(m0Var.f3464b, m0Var.f3463a.f35102o));
        }
        f6.X xA = this.f3057M.a(arrayList2.size());
        this.f3057M = xA;
        z0 z0Var = new z0(arrayList, xA);
        boolean zP = z0Var.p();
        int i15 = z0Var.f3579d;
        if (!zP && -1 >= i15) {
            throw new Cd.s0(2);
        }
        int iA = z0Var.a(this.f3052G);
        q0 q0VarY0 = y0(this.f3089j0, z0Var, z0(z0Var, iA, -9223372036854775807L));
        int i16 = q0VarY0.f3503e;
        if (iA != -1 && i16 != 1) {
            i16 = (z0Var.p() || iA >= i15) ? 4 : 2;
        }
        q0 q0VarF = q0VarY0.f(i16);
        this.k.f3170h.a(17, new L(arrayList2, this.f3057M, iA, u6.v.y(-9223372036854775807L))).b();
        O0(q0VarF, 0, 1, false, (this.f3089j0.f3500b.f35112a.equals(q0VarF.f3500b.f35112a) || this.f3089j0.f3499a.p()) ? false : true, 4, n0(q0VarF), -1, false);
    }

    public final void H0(SurfaceHolder surfaceHolder) {
        this.f3066V = false;
        this.f3064T = surfaceHolder;
        surfaceHolder.addCallback(this.f3104x);
        Surface surface = this.f3064T.getSurface();
        if (surface == null || !surface.isValid()) {
            A0(0, 0);
        } else {
            Rect surfaceFrame = this.f3064T.getSurfaceFrame();
            A0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void I0(boolean z2) {
        Q0();
        int iC = this.f3046A.c(t0(), z2);
        int i5 = 1;
        if (z2 && iC != 1) {
            i5 = 2;
        }
        N0(iC, i5, z2);
    }

    public final void J0(int i5) {
        Q0();
        if (this.f3051F != i5) {
            this.f3051F = i5;
            u6.s sVar = this.k.f3170h;
            sVar.getClass();
            u6.r rVarB = u6.s.b();
            rVarB.f46714a = sVar.f46716a.obtainMessage(11, i5, 0);
            rVarB.b();
            C0471v c0471v = new C0471v(i5, 0);
            K8.H h10 = this.f3091l;
            h10.o(8, c0471v);
            M0();
            h10.m();
        }
    }

    public final void K0(r6.r rVar) {
        Q0();
        r6.o oVar = this.f3084h;
        oVar.getClass();
        r6.l lVar = (r6.l) oVar;
        if (rVar.equals(lVar.d())) {
            return;
        }
        if (rVar instanceof r6.f) {
            lVar.i((r6.f) rVar);
        }
        C3930e c3930e = new C3930e(lVar.d());
        c3930e.b(rVar);
        lVar.i(new r6.f(c3930e));
        this.f3091l.p(19, new B8.b(rVar, 5));
    }

    public final void L0(Object obj) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (AbstractC0449f abstractC0449f : this.f3082g) {
            if (abstractC0449f.f3345a == 2) {
                y0 y0VarH0 = h0(abstractC0449f);
                AbstractC4256a.i(!y0VarH0.f3570g);
                y0VarH0.f3567d = 1;
                AbstractC4256a.i(true ^ y0VarH0.f3570g);
                y0VarH0.f3568e = obj;
                y0VarH0.c();
                arrayList.add(y0VarH0);
            }
        }
        Object obj2 = this.f3062R;
        if (obj2 == null || obj2 == obj) {
            z2 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((y0) it.next()).a(this.f3050E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z2 = true;
            }
            z2 = false;
            Object obj3 = this.f3062R;
            Surface surface = this.f3063S;
            if (obj3 == surface) {
                surface.release();
                this.f3063S = null;
            }
        }
        this.f3062R = obj;
        if (z2) {
            C0465o c0465o = new C0465o(2, new Q("Detaching surface timed out.", 0), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW);
            q0 q0Var = this.f3089j0;
            q0 q0VarA = q0Var.a(q0Var.f3500b);
            q0VarA.f3513p = q0VarA.f3515r;
            q0VarA.f3514q = 0L;
            q0 q0VarD = q0VarA.f(1).d(c0465o);
            this.f3053H++;
            u6.s sVar = this.k.f3170h;
            sVar.getClass();
            u6.r rVarB = u6.s.b();
            rVarB.f46714a = sVar.f46716a.obtainMessage(6);
            rVarB.b();
            if (q0VarD.f3499a.p() && !this.f3089j0.f3499a.p()) {
                z10 = true;
            }
            O0(q0VarD, 0, 1, false, z10, 4, n0(q0VarD), -1, false);
        }
    }

    public final void M0() {
        int iK;
        int iE;
        s0 s0Var = this.f3059O;
        int i5 = u6.v.f46721a;
        I i10 = this.f3080f;
        boolean zX0 = i10.x0();
        boolean zK = i10.K();
        J0 j0O0 = i10.o0();
        if (j0O0.p()) {
            iK = -1;
        } else {
            int iL0 = i10.l0();
            i10.Q0();
            int i11 = i10.f3051F;
            if (i11 == 1) {
                i11 = 0;
            }
            i10.Q0();
            iK = j0O0.k(iL0, i11, i10.f3052G);
        }
        boolean z2 = iK != -1;
        J0 j0O02 = i10.o0();
        if (j0O02.p()) {
            iE = -1;
        } else {
            int iL02 = i10.l0();
            i10.Q0();
            int i12 = i10.f3051F;
            if (i12 == 1) {
                i12 = 0;
            }
            i10.Q0();
            iE = j0O02.e(iL02, i12, i10.f3052G);
        }
        boolean z10 = iE != -1;
        boolean zJ = i10.J();
        boolean zI = i10.I();
        boolean zP = i10.o0().p();
        A.e0 e0Var = new A.e0(5);
        C4260e c4260e = this.f3074c.f3540a;
        C0762k c0762k = (C0762k) e0Var.f152b;
        c0762k.getClass();
        for (int i13 = 0; i13 < c4260e.f46677a.size(); i13++) {
            c0762k.a(c4260e.a(i13));
        }
        boolean z11 = !zX0;
        e0Var.f(4, z11);
        e0Var.f(5, zK && !zX0);
        e0Var.f(6, z2 && !zX0);
        e0Var.f(7, !zP && (z2 || !zJ || zK) && !zX0);
        e0Var.f(8, z10 && !zX0);
        e0Var.f(9, !zP && (z10 || (zJ && zI)) && !zX0);
        e0Var.f(10, z11);
        e0Var.f(11, zK && !zX0);
        e0Var.f(12, zK && !zX0);
        s0 s0Var2 = new s0(c0762k.c());
        this.f3059O = s0Var2;
        if (s0Var2.equals(s0Var)) {
            return;
        }
        this.f3091l.o(13, new C0470u(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void N0(int i5, int i10, boolean z2) {
        int i11 = 0;
        ?? r42 = (!z2 || i5 == -1) ? 0 : 1;
        if (r42 != 0 && i5 != 1) {
            i11 = 1;
        }
        q0 q0Var = this.f3089j0;
        if (q0Var.f3509l == r42 && q0Var.f3510m == i11) {
            return;
        }
        this.f3053H++;
        q0 q0VarC = q0Var.c(i11, r42);
        u6.s sVar = this.k.f3170h;
        sVar.getClass();
        u6.r rVarB = u6.s.b();
        rVarB.f46714a = sVar.f46716a.obtainMessage(1, r42, i11);
        rVarB.b();
        O0(q0VarC, 0, i10, false, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03dd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0(final E5.q0 r34, final int r35, final int r36, boolean r37, boolean r38, int r39, long r40, int r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.I.O0(E5.q0, int, int, boolean, boolean, int, long, int, boolean):void");
    }

    public final void P0() {
        int iT0 = t0();
        ya.b bVar = this.f3049D;
        C4504d c4504d = this.f3048C;
        if (iT0 != 1) {
            if (iT0 == 2 || iT0 == 3) {
                Q0();
                boolean z2 = this.f3089j0.f3512o;
                s0();
                c4504d.getClass();
                s0();
                bVar.getClass();
                return;
            }
            if (iT0 != 4) {
                throw new IllegalStateException();
            }
        }
        c4504d.getClass();
        bVar.getClass();
    }

    public final void Q0() {
        C4026b c4026b = this.f3076d;
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
        if (Thread.currentThread() != this.f3099s.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f3099s.getThread().getName();
            int i5 = u6.v.f46721a;
            Locale locale = Locale.US;
            String strG = R8.v.g("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (this.f3079e0) {
                throw new IllegalStateException(strG);
            }
            AbstractC4256a.D(this.f3081f0 ? null : new IllegalStateException(), "ExoPlayerImpl", strG);
            this.f3081f0 = true;
        }
    }

    public final C0450f0 e0() {
        J0 j0O0 = o0();
        if (j0O0.p()) {
            return this.f3087i0;
        }
        C0446d0 c0446d0 = j0O0.m(l0(), (I0) this.f421a, 0L).f3112c;
        C0448e0 c0448e0A = this.f3087i0.a();
        C0450f0 c0450f0 = c0446d0.f3307d;
        if (c0450f0 != null) {
            CharSequence charSequence = c0450f0.f3364a;
            if (charSequence != null) {
                c0448e0A.f3320a = charSequence;
            }
            CharSequence charSequence2 = c0450f0.f3365b;
            if (charSequence2 != null) {
                c0448e0A.f3321b = charSequence2;
            }
            CharSequence charSequence3 = c0450f0.f3366c;
            if (charSequence3 != null) {
                c0448e0A.f3322c = charSequence3;
            }
            CharSequence charSequence4 = c0450f0.f3367d;
            if (charSequence4 != null) {
                c0448e0A.f3323d = charSequence4;
            }
            CharSequence charSequence5 = c0450f0.f3368e;
            if (charSequence5 != null) {
                c0448e0A.f3324e = charSequence5;
            }
            CharSequence charSequence6 = c0450f0.f3369f;
            if (charSequence6 != null) {
                c0448e0A.f3325f = charSequence6;
            }
            CharSequence charSequence7 = c0450f0.f3370g;
            if (charSequence7 != null) {
                c0448e0A.f3326g = charSequence7;
            }
            A0 a02 = c0450f0.f3371h;
            if (a02 != null) {
                c0448e0A.f3327h = a02;
            }
            A0 a03 = c0450f0.f3372i;
            if (a03 != null) {
                c0448e0A.f3328i = a03;
            }
            byte[] bArr = c0450f0.f3373j;
            if (bArr != null) {
                c0448e0A.f3329j = (byte[]) bArr.clone();
                c0448e0A.k = c0450f0.k;
            }
            Uri uri = c0450f0.f3374l;
            if (uri != null) {
                c0448e0A.f3330l = uri;
            }
            Integer num = c0450f0.f3375m;
            if (num != null) {
                c0448e0A.f3331m = num;
            }
            Integer num2 = c0450f0.f3376n;
            if (num2 != null) {
                c0448e0A.f3332n = num2;
            }
            Integer num3 = c0450f0.f3377o;
            if (num3 != null) {
                c0448e0A.f3333o = num3;
            }
            Boolean bool = c0450f0.f3378p;
            if (bool != null) {
                c0448e0A.f3334p = bool;
            }
            Integer num4 = c0450f0.f3379q;
            if (num4 != null) {
                c0448e0A.f3335q = num4;
            }
            Integer num5 = c0450f0.f3380r;
            if (num5 != null) {
                c0448e0A.f3335q = num5;
            }
            Integer num6 = c0450f0.f3381s;
            if (num6 != null) {
                c0448e0A.f3336r = num6;
            }
            Integer num7 = c0450f0.f3382t;
            if (num7 != null) {
                c0448e0A.f3337s = num7;
            }
            Integer num8 = c0450f0.f3383u;
            if (num8 != null) {
                c0448e0A.f3338t = num8;
            }
            Integer num9 = c0450f0.f3384v;
            if (num9 != null) {
                c0448e0A.f3339u = num9;
            }
            Integer num10 = c0450f0.f3385w;
            if (num10 != null) {
                c0448e0A.f3340v = num10;
            }
            CharSequence charSequence8 = c0450f0.f3386x;
            if (charSequence8 != null) {
                c0448e0A.f3341w = charSequence8;
            }
            CharSequence charSequence9 = c0450f0.f3387y;
            if (charSequence9 != null) {
                c0448e0A.f3342x = charSequence9;
            }
            CharSequence charSequence10 = c0450f0.f3388z;
            if (charSequence10 != null) {
                c0448e0A.f3343y = charSequence10;
            }
            Integer num11 = c0450f0.f3358A;
            if (num11 != null) {
                c0448e0A.f3344z = num11;
            }
            Integer num12 = c0450f0.f3359B;
            if (num12 != null) {
                c0448e0A.f3315A = num12;
            }
            CharSequence charSequence11 = c0450f0.f3360C;
            if (charSequence11 != null) {
                c0448e0A.f3316B = charSequence11;
            }
            CharSequence charSequence12 = c0450f0.f3361D;
            if (charSequence12 != null) {
                c0448e0A.f3317C = charSequence12;
            }
            CharSequence charSequence13 = c0450f0.f3362E;
            if (charSequence13 != null) {
                c0448e0A.f3318D = charSequence13;
            }
            Bundle bundle = c0450f0.f3363F;
            if (bundle != null) {
                c0448e0A.f3319E = bundle;
            }
        }
        return new C0450f0(c0448e0A);
    }

    public final void f0() {
        Q0();
        D0();
        L0(null);
        A0(0, 0);
    }

    public final y0 h0(x0 x0Var) {
        int iQ0 = q0();
        J0 j02 = this.f3089j0.f3499a;
        if (iQ0 == -1) {
            iQ0 = 0;
        }
        O o7 = this.k;
        return new y0(o7, x0Var, j02, iQ0, this.f3103w, o7.f3172j);
    }

    public final long i0() {
        Q0();
        if (!x0()) {
            return m0();
        }
        q0 q0Var = this.f3089j0;
        J0 j02 = q0Var.f3499a;
        Object obj = q0Var.f3500b.f35112a;
        H0 h02 = this.f3094n;
        j02.g(obj, h02);
        q0 q0Var2 = this.f3089j0;
        if (q0Var2.f3501c == -9223372036854775807L) {
            return u6.v.F(q0Var2.f3499a.m(l0(), (I0) this.f421a, 0L).f3120l);
        }
        return u6.v.F(this.f3089j0.f3501c) + u6.v.F(h02.f3043e);
    }

    public final int j0() {
        Q0();
        if (x0()) {
            return this.f3089j0.f3500b.f35113b;
        }
        return -1;
    }

    public final int k0() {
        Q0();
        if (x0()) {
            return this.f3089j0.f3500b.f35114c;
        }
        return -1;
    }

    public final int l0() {
        Q0();
        int iQ0 = q0();
        if (iQ0 == -1) {
            return 0;
        }
        return iQ0;
    }

    public final long m0() {
        Q0();
        return u6.v.F(n0(this.f3089j0));
    }

    public final long n0(q0 q0Var) {
        if (q0Var.f3499a.p()) {
            return u6.v.y(this.f3092l0);
        }
        if (q0Var.f3500b.a()) {
            return q0Var.f3515r;
        }
        J0 j02 = q0Var.f3499a;
        C2613z c2613z = q0Var.f3500b;
        long j8 = q0Var.f3515r;
        Object obj = c2613z.f35112a;
        H0 h02 = this.f3094n;
        j02.g(obj, h02);
        return j8 + h02.f3043e;
    }

    public final J0 o0() {
        Q0();
        return this.f3089j0.f3499a;
    }

    public final L0 p0() {
        Q0();
        return this.f3089j0.f3507i.f44521d;
    }

    public final int q0() {
        if (this.f3089j0.f3499a.p()) {
            return this.f3090k0;
        }
        q0 q0Var = this.f3089j0;
        return q0Var.f3499a.g(q0Var.f3500b.f35112a, this.f3094n).f3041c;
    }

    public final long r0() {
        Q0();
        if (!x0()) {
            J0 j0O0 = o0();
            if (j0O0.p()) {
                return -9223372036854775807L;
            }
            return u6.v.F(j0O0.m(l0(), (I0) this.f421a, 0L).f3121m);
        }
        q0 q0Var = this.f3089j0;
        C2613z c2613z = q0Var.f3500b;
        J0 j02 = q0Var.f3499a;
        Object obj = c2613z.f35112a;
        H0 h02 = this.f3094n;
        j02.g(obj, h02);
        return u6.v.F(h02.a(c2613z.f35113b, c2613z.f35114c));
    }

    public final boolean s0() {
        Q0();
        return this.f3089j0.f3509l;
    }

    public final int t0() {
        Q0();
        return this.f3089j0.f3503e;
    }

    public final r6.f v0() {
        Q0();
        return ((r6.l) this.f3084h).d();
    }

    public final boolean x0() {
        Q0();
        return this.f3089j0.f3500b.a();
    }

    public final q0 y0(q0 q0Var, J0 j02, Pair pair) {
        List list;
        AbstractC4256a.e(j02.p() || pair != null);
        J0 j03 = q0Var.f3499a;
        q0 q0VarG = q0Var.g(j02);
        if (j02.p()) {
            C2613z c2613z = q0.f3498s;
            long jY = u6.v.y(this.f3092l0);
            q0 q0VarA = q0VarG.b(c2613z, jY, jY, jY, 0L, f6.a0.f35029d, this.f3072b, l8.e0.f40101e).a(c2613z);
            q0VarA.f3513p = q0VarA.f3515r;
            return q0VarA;
        }
        Object obj = q0VarG.f3500b.f35112a;
        int i5 = u6.v.f46721a;
        boolean zEquals = obj.equals(pair.first);
        C2613z c2613z2 = !zEquals ? new C2613z(pair.first) : q0VarG.f3500b;
        long jLongValue = ((Long) pair.second).longValue();
        long jY2 = u6.v.y(i0());
        if (!j03.p()) {
            jY2 -= j03.g(obj, this.f3094n).f3043e;
        }
        if (!zEquals || jLongValue < jY2) {
            C2613z c2613z3 = c2613z2;
            AbstractC4256a.i(!c2613z3.a());
            f6.a0 a0Var = !zEquals ? f6.a0.f35029d : q0VarG.f3506h;
            r6.s sVar = !zEquals ? this.f3072b : q0VarG.f3507i;
            if (zEquals) {
                list = q0VarG.f3508j;
            } else {
                C3407I c3407i = AbstractC3409K.f40056b;
                list = l8.e0.f40101e;
            }
            q0 q0VarA2 = q0VarG.b(c2613z3, jLongValue, jLongValue, jLongValue, 0L, a0Var, sVar, list).a(c2613z3);
            q0VarA2.f3513p = jLongValue;
            return q0VarA2;
        }
        if (jLongValue != jY2) {
            C2613z c2613z4 = c2613z2;
            AbstractC4256a.i(!c2613z4.a());
            long jMax = Math.max(0L, q0VarG.f3514q - (jLongValue - jY2));
            long j8 = q0VarG.f3513p;
            if (q0VarG.k.equals(q0VarG.f3500b)) {
                j8 = jLongValue + jMax;
            }
            q0 q0VarB = q0VarG.b(c2613z4, jLongValue, jLongValue, jLongValue, jMax, q0VarG.f3506h, q0VarG.f3507i, q0VarG.f3508j);
            q0VarB.f3513p = j8;
            return q0VarB;
        }
        int iB = j02.b(q0VarG.k.f35112a);
        if (iB != -1 && j02.f(iB, this.f3094n, false).f3041c == j02.g(c2613z2.f35112a, this.f3094n).f3041c) {
            return q0VarG;
        }
        j02.g(c2613z2.f35112a, this.f3094n);
        long jA = c2613z2.a() ? this.f3094n.a(c2613z2.f35113b, c2613z2.f35114c) : this.f3094n.f3042d;
        C2613z c2613z5 = c2613z2;
        q0 q0VarA3 = q0VarG.b(c2613z5, q0VarG.f3515r, q0VarG.f3515r, q0VarG.f3502d, jA - q0VarG.f3515r, q0VarG.f3506h, q0VarG.f3507i, q0VarG.f3508j).a(c2613z5);
        q0VarA3.f3513p = jA;
        return q0VarA3;
    }

    public final Pair z0(J0 j02, int i5, long j8) {
        if (j02.p()) {
            this.f3090k0 = i5;
            if (j8 == -9223372036854775807L) {
                j8 = 0;
            }
            this.f3092l0 = j8;
            return null;
        }
        if (i5 == -1 || i5 >= j02.o()) {
            i5 = j02.a(this.f3052G);
            j8 = u6.v.F(j02.m(i5, (I0) this.f421a, 0L).f3120l);
        }
        return j02.i((I0) this.f421a, this.f3094n, i5, u6.v.y(j8));
    }
}
