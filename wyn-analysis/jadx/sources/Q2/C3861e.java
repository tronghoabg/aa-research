package q2;

import G5.C0522c;
import K8.H;
import N1.C;
import N1.C0757f;
import N1.C0764m;
import N1.C0765n;
import N1.L;
import N1.N;
import N1.Y;
import Q1.x;
import U1.C0835e;
import U1.C0840j;
import U1.C0848s;
import U1.C0851v;
import ac.C1346a;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.applovin.impl.W;
import d2.v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import l8.e0;
import org.apache.tika.pipes.PipesConfigBase;

/* renamed from: q2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3861e extends d2.q {

    /* renamed from: m1, reason: collision with root package name */
    public static final int[] f43990m1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: n1, reason: collision with root package name */
    public static boolean f43991n1;

    /* renamed from: o1, reason: collision with root package name */
    public static boolean f43992o1;

    /* renamed from: C0, reason: collision with root package name */
    public final Context f43993C0;

    /* renamed from: D0, reason: collision with root package name */
    public final boolean f43994D0;

    /* renamed from: E0, reason: collision with root package name */
    public final X2.j f43995E0;

    /* renamed from: F0, reason: collision with root package name */
    public final int f43996F0;

    /* renamed from: G0, reason: collision with root package name */
    public final boolean f43997G0;

    /* renamed from: H0, reason: collision with root package name */
    public final m f43998H0;

    /* renamed from: I0, reason: collision with root package name */
    public final C8.j f43999I0;

    /* renamed from: J0, reason: collision with root package name */
    public C0522c f44000J0;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f44001K0;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f44002L0;

    /* renamed from: M0, reason: collision with root package name */
    public i f44003M0;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f44004N0;

    /* renamed from: O0, reason: collision with root package name */
    public List f44005O0;

    /* renamed from: P0, reason: collision with root package name */
    public Surface f44006P0;

    /* renamed from: Q0, reason: collision with root package name */
    public C3863g f44007Q0;

    /* renamed from: R0, reason: collision with root package name */
    public Q1.p f44008R0;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f44009S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f44010T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f44011U0;

    /* renamed from: V0, reason: collision with root package name */
    public long f44012V0;

    /* renamed from: W0, reason: collision with root package name */
    public int f44013W0;

    /* renamed from: X0, reason: collision with root package name */
    public int f44014X0;

    /* renamed from: Y0, reason: collision with root package name */
    public int f44015Y0;
    public long Z0;

    /* renamed from: a1, reason: collision with root package name */
    public int f44016a1;

    /* renamed from: b1, reason: collision with root package name */
    public long f44017b1;

    /* renamed from: c1, reason: collision with root package name */
    public Y f44018c1;

    /* renamed from: d1, reason: collision with root package name */
    public Y f44019d1;

    /* renamed from: e1, reason: collision with root package name */
    public int f44020e1;
    public boolean f1;

    /* renamed from: g1, reason: collision with root package name */
    public int f44021g1;

    /* renamed from: h1, reason: collision with root package name */
    public C3860d f44022h1;

    /* renamed from: i1, reason: collision with root package name */
    public C0848s f44023i1;

    /* renamed from: j1, reason: collision with root package name */
    public long f44024j1;

    /* renamed from: k1, reason: collision with root package name */
    public long f44025k1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f44026l1;

    public C3861e(Context context, d2.i iVar, Handler handler, U1.r rVar) {
        super(2, iVar, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f43993C0 = applicationContext;
        this.f43996F0 = 50;
        this.f44003M0 = null;
        this.f43995E0 = new X2.j(26, handler, rVar);
        this.f43994D0 = true;
        this.f43998H0 = new m(applicationContext, this);
        this.f43999I0 = new C8.j(5);
        this.f43997G0 = "NVIDIA".equals(x.f9726c);
        this.f44008R0 = Q1.p.f9705c;
        this.f44010T0 = 1;
        this.f44011U0 = 0;
        this.f44018c1 = Y.f8125d;
        this.f44021g1 = 0;
        this.f44019d1 = null;
        this.f44020e1 = -1000;
        this.f44024j1 = -9223372036854775807L;
        this.f44025k1 = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean G0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.C3861e.G0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int H0(d2.m r11, N1.C0765n r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.C3861e.H0(d2.m, N1.n):int");
    }

    public static List I0(Context context, d2.h hVar, C0765n c0765n, boolean z2, boolean z10) {
        List listE;
        String str = c0765n.f8232n;
        if (str == null) {
            return e0.f40101e;
        }
        if (x.f9724a >= 26 && "video/dolby-vision".equals(str) && !tg.b.w(context)) {
            String strB = v.b(c0765n);
            if (strB == null) {
                listE = e0.f40101e;
            } else {
                hVar.getClass();
                listE = v.e(strB, z2, z10);
            }
            if (!listE.isEmpty()) {
                return listE;
            }
        }
        return v.g(hVar, c0765n, z2, z10);
    }

    public static int J0(d2.m mVar, C0765n c0765n) {
        if (c0765n.f8233o == -1) {
            return H0(mVar, c0765n);
        }
        List list = c0765n.f8235q;
        int size = list.size();
        int length = 0;
        for (int i5 = 0; i5 < size; i5++) {
            length += ((byte[]) list.get(i5)).length;
        }
        return c0765n.f8233o + length;
    }

    @Override // d2.q
    public final boolean A0(T1.d dVar) {
        if (dVar.h(67108864) && !i() && !dVar.h(536870912)) {
            long j8 = this.f44025k1;
            if (j8 != -9223372036854775807L && j8 - (dVar.f11360g - this.f34067y0.f34008c) > PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH && !dVar.h(1073741824) && dVar.f11360g < this.f12040l) {
                return true;
            }
        }
        return false;
    }

    @Override // d2.q
    public final int C0(d2.h hVar, C0765n c0765n) {
        boolean z2;
        int i5 = 1;
        int i10 = 0;
        if (!C.l(c0765n.f8232n)) {
            return R8.v.a(0, 0, 0, 0);
        }
        boolean z10 = c0765n.f8236r != null;
        Context context = this.f43993C0;
        List listI0 = I0(context, hVar, c0765n, z10, false);
        if (z10 && listI0.isEmpty()) {
            listI0 = I0(context, hVar, c0765n, false, false);
        }
        if (listI0.isEmpty()) {
            return R8.v.a(1, 0, 0, 0);
        }
        int i11 = c0765n.L;
        if (i11 != 0 && i11 != 2) {
            return R8.v.a(2, 0, 0, 0);
        }
        d2.m mVar = (d2.m) listI0.get(0);
        boolean zD = mVar.d(c0765n);
        if (zD) {
            z2 = true;
        } else {
            for (int i12 = 1; i12 < listI0.size(); i12++) {
                d2.m mVar2 = (d2.m) listI0.get(i12);
                if (mVar2.d(c0765n)) {
                    zD = true;
                    z2 = false;
                    mVar = mVar2;
                    break;
                }
            }
            z2 = true;
        }
        int i13 = zD ? 4 : 3;
        int i14 = mVar.e(c0765n) ? 16 : 8;
        int i15 = mVar.f33998g ? 64 : 0;
        int i16 = z2 ? 128 : 0;
        if (x.f9724a >= 26 && "video/dolby-vision".equals(c0765n.f8232n) && !tg.b.w(context)) {
            i16 = 256;
        }
        if (zD) {
            List listI02 = I0(context, hVar, c0765n, z10, true);
            if (!listI02.isEmpty()) {
                HashMap map = v.f34073a;
                ArrayList arrayList = new ArrayList(listI02);
                Collections.sort(arrayList, new V5.s(new com.unity3d.services.core.webview.b(c0765n, i5), i5));
                d2.m mVar3 = (d2.m) arrayList.get(0);
                if (mVar3.d(c0765n) && mVar3.e(c0765n)) {
                    i10 = 32;
                }
            }
        }
        return i13 | i14 | i10 | i15 | i16;
    }

    @Override // d2.q, U1.AbstractC0834d
    public final void D() {
        X2.j jVar = this.f43995E0;
        this.f44019d1 = null;
        this.f44025k1 = -9223372036854775807L;
        i iVar = this.f44003M0;
        if (iVar != null) {
            ((m) iVar.f44052n.f44061g.f16383b).d(0);
        } else {
            this.f43998H0.d(0);
        }
        M0();
        this.f44009S0 = false;
        this.f44022h1 = null;
        try {
            super.D();
            H5.e eVar = this.f34065x0;
            jVar.getClass();
            synchronized (eVar) {
            }
            Handler handler = (Handler) jVar.f16075b;
            if (handler != null) {
                handler.post(new ng.a(10, jVar, eVar));
            }
            jVar.Y(Y.f8125d);
        } catch (Throwable th) {
            jVar.S(this.f34065x0);
            jVar.Y(Y.f8125d);
            throw th;
        }
    }

    @Override // U1.AbstractC0834d
    public final void E(boolean z2, boolean z10) {
        this.f34065x0 = new H5.e(1);
        U1.Y y10 = this.f12033d;
        y10.getClass();
        boolean z11 = y10.f12015b;
        Q1.k.g((z11 && this.f44021g1 == 0) ? false : true);
        if (this.f1 != z11) {
            this.f1 = z11;
            t0();
        }
        H5.e eVar = this.f34065x0;
        X2.j jVar = this.f43995E0;
        Handler handler = (Handler) jVar.f16075b;
        if (handler != null) {
            handler.post(new q(jVar, eVar, 4));
        }
        boolean z12 = this.f44004N0;
        m mVar = this.f43998H0;
        if (!z12) {
            if (this.f44005O0 != null && this.f44003M0 == null) {
                H h10 = new H(this.f43993C0, mVar);
                Q1.q qVar = this.f12036g;
                qVar.getClass();
                h10.f6588g = qVar;
                Q1.k.g(!h10.f6582a);
                if (((k) h10.f6586e) == null) {
                    if (((j) h10.f6585d) == null) {
                        h10.f6585d = new j();
                    }
                    h10.f6586e = new k((j) h10.f6585d);
                }
                l lVar = new l(h10);
                h10.f6582a = true;
                this.f44003M0 = lVar.f44056b;
            }
            this.f44004N0 = true;
        }
        i iVar = this.f44003M0;
        if (iVar == null) {
            Q1.q qVar2 = this.f12036g;
            qVar2.getClass();
            mVar.k = qVar2;
            mVar.f44072d = z10 ? 1 : 0;
            return;
        }
        C1346a c1346a = new C1346a(this, 18);
        p8.n nVar = p8.n.f43298a;
        iVar.f44050l = c1346a;
        iVar.f44051m = nVar;
        C0848s c0848s = this.f44023i1;
        if (c0848s != null) {
            iVar.f44052n.k = c0848s;
        }
        if (this.f44006P0 != null && !this.f44008R0.equals(Q1.p.f9705c)) {
            this.f44003M0.h(this.f44006P0, this.f44008R0);
        }
        this.f44003M0.g(this.f44011U0);
        this.f44003M0.i(this.f34019I);
        List list = this.f44005O0;
        if (list != null) {
            this.f44003M0.k(list);
        }
        ((m) this.f44003M0.f44052n.f44061g.f16383b).f44072d = z10 ? 1 : 0;
    }

    @Override // d2.q, U1.AbstractC0834d
    public final void F(long j8, boolean z2) {
        i iVar = this.f44003M0;
        if (iVar != null) {
            iVar.a(true);
            i iVar2 = this.f44003M0;
            d2.p pVar = this.f34067y0;
            iVar2.j(pVar.f34007b, pVar.f34008c, -this.f44024j1, this.f12040l);
            this.f44026l1 = true;
        }
        super.F(j8, z2);
        i iVar3 = this.f44003M0;
        m mVar = this.f43998H0;
        if (iVar3 == null) {
            o oVar = mVar.f44070b;
            oVar.k = 0L;
            oVar.f44096n = -1L;
            oVar.f44094l = -1L;
            mVar.f44075g = -9223372036854775807L;
            mVar.f44073e = -9223372036854775807L;
            mVar.d(1);
            mVar.f44076h = -9223372036854775807L;
        }
        if (z2) {
            i iVar4 = this.f44003M0;
            if (iVar4 != null) {
                iVar4.d(false);
            } else {
                mVar.c(false);
            }
        }
        M0();
        this.f44014X0 = 0;
    }

    @Override // U1.AbstractC0834d
    public final void G() {
        i iVar = this.f44003M0;
        if (iVar == null || !this.f43994D0) {
            return;
        }
        l lVar = iVar.f44052n;
        if (lVar.f44068o == 2) {
            return;
        }
        Q1.s sVar = lVar.f44065l;
        if (sVar != null) {
            sVar.f9711a.removeCallbacksAndMessages(null);
        }
        lVar.f44066m = null;
        lVar.f44068o = 2;
    }

    @Override // U1.AbstractC0834d
    public final void H() {
        try {
            try {
                P();
                t0();
                S3.l lVar = this.f34015E;
                if (lVar != null) {
                    lVar.s(null);
                }
                this.f34015E = null;
            } catch (Throwable th) {
                S3.l lVar2 = this.f34015E;
                if (lVar2 != null) {
                    lVar2.s(null);
                }
                this.f34015E = null;
                throw th;
            }
        } finally {
            this.f44004N0 = false;
            this.f44024j1 = -9223372036854775807L;
            C3863g c3863g = this.f44007Q0;
            if (c3863g != null) {
                c3863g.release();
                this.f44007Q0 = null;
            }
        }
    }

    @Override // U1.AbstractC0834d
    public final void I() {
        this.f44013W0 = 0;
        this.f12036g.getClass();
        this.f44012V0 = SystemClock.elapsedRealtime();
        this.Z0 = 0L;
        this.f44016a1 = 0;
        i iVar = this.f44003M0;
        if (iVar != null) {
            ((m) iVar.f44052n.f44061g.f16383b).e();
        } else {
            this.f43998H0.e();
        }
    }

    @Override // U1.AbstractC0834d
    public final void J() {
        L0();
        int i5 = this.f44016a1;
        if (i5 != 0) {
            long j8 = this.Z0;
            X2.j jVar = this.f43995E0;
            Handler handler = (Handler) jVar.f16075b;
            if (handler != null) {
                handler.post(new q(jVar, j8, i5));
            }
            this.Z0 = 0L;
            this.f44016a1 = 0;
        }
        i iVar = this.f44003M0;
        if (iVar != null) {
            ((m) iVar.f44052n.f44061g.f16383b).f();
        } else {
            this.f43998H0.f();
        }
    }

    @Override // d2.q, U1.AbstractC0834d
    public final void K(C0765n[] c0765nArr, long j8, long j10, k2.H h10) {
        super.K(c0765nArr, j8, j10, h10);
        if (this.f44024j1 == -9223372036854775807L) {
            this.f44024j1 = j8;
        }
        N n10 = this.f12044p;
        if (n10.p()) {
            this.f44025k1 = -9223372036854775807L;
            return;
        }
        h10.getClass();
        this.f44025k1 = n10.g(h10.f38903a, new L()).f8051d;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.Surface K0(d2.m r6) {
        /*
            r5 = this;
            q2.i r0 = r5.f44003M0
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lad
            android.view.Surface r0 = r5.f44006P0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            int r0 = Q1.x.f9724a
            r3 = 35
            if (r0 < r3) goto L16
            boolean r0 = r6.f33999h
            if (r0 == 0) goto L16
            return r2
        L16:
            boolean r0 = r5.O0(r6)
            Q1.k.g(r0)
            q2.g r0 = r5.f44007Q0
            if (r0 == 0) goto L2e
            boolean r3 = r0.f44035a
            boolean r4 = r6.f33997f
            if (r3 == r4) goto L2e
            if (r0 == 0) goto L2e
            r0.release()
            r5.f44007Q0 = r2
        L2e:
            q2.g r0 = r5.f44007Q0
            if (r0 != 0) goto Laa
            android.content.Context r0 = r5.f43993C0
            boolean r6 = r6.f33997f
            r2 = 1
            if (r6 == 0) goto L42
            boolean r0 = q2.C3863g.c(r0)
            if (r0 == 0) goto L40
            goto L44
        L40:
            r0 = r1
            goto L45
        L42:
            int r0 = q2.C3863g.f44033d
        L44:
            r0 = r2
        L45:
            Q1.k.g(r0)
            q2.f r0 = new q2.f
            java.lang.String r3 = "ExoPlayer:PlaceholderSurface"
            r0.<init>(r3, r1)
            if (r6 == 0) goto L54
            int r6 = q2.C3863g.f44033d
            goto L55
        L54:
            r6 = r1
        L55:
            r0.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r0.getLooper()
            r3.<init>(r4, r0)
            r0.f44028b = r3
            Q1.d r4 = new Q1.d
            r4.<init>(r3)
            r0.f44031e = r4
            monitor-enter(r0)
            android.os.Handler r3 = r0.f44028b     // Catch: java.lang.Throwable -> L86
            android.os.Message r6 = r3.obtainMessage(r2, r6, r1)     // Catch: java.lang.Throwable -> L86
            r6.sendToTarget()     // Catch: java.lang.Throwable -> L86
        L74:
            android.view.Surface r6 = r0.f44032f     // Catch: java.lang.Throwable -> L86
            q2.g r6 = (q2.C3863g) r6     // Catch: java.lang.Throwable -> L86
            if (r6 != 0) goto L8a
            java.lang.RuntimeException r6 = r0.f44030d     // Catch: java.lang.Throwable -> L86
            if (r6 != 0) goto L8a
            java.lang.Error r6 = r0.f44029c     // Catch: java.lang.Throwable -> L86
            if (r6 != 0) goto L8a
            r0.wait()     // Catch: java.lang.Throwable -> L86 java.lang.InterruptedException -> L88
            goto L74
        L86:
            r6 = move-exception
            goto La8
        L88:
            r1 = r2
            goto L74
        L8a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L94
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L94:
            java.lang.RuntimeException r6 = r0.f44030d
            if (r6 != 0) goto La7
            java.lang.Error r6 = r0.f44029c
            if (r6 != 0) goto La6
            android.view.Surface r6 = r0.f44032f
            q2.g r6 = (q2.C3863g) r6
            r6.getClass()
            r5.f44007Q0 = r6
            goto Laa
        La6:
            throw r6
        La7:
            throw r6
        La8:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            throw r6
        Laa:
            q2.g r6 = r5.f44007Q0
            return r6
        Lad:
            Q1.k.g(r1)
            Q1.k.h(r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.C3861e.K0(d2.m):android.view.Surface");
    }

    public final void L0() {
        if (this.f44013W0 > 0) {
            this.f12036g.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j8 = jElapsedRealtime - this.f44012V0;
            int i5 = this.f44013W0;
            X2.j jVar = this.f43995E0;
            Handler handler = (Handler) jVar.f16075b;
            if (handler != null) {
                handler.post(new q(jVar, i5, j8));
            }
            this.f44013W0 = 0;
            this.f44012V0 = jElapsedRealtime;
        }
    }

    public final void M0() {
        int i5;
        d2.j jVar;
        if (!this.f1 || (i5 = x.f9724a) < 23 || (jVar = this.f34021K) == null) {
            return;
        }
        this.f44022h1 = new C3860d(this, jVar);
        if (i5 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            jVar.c(bundle);
        }
    }

    @Override // d2.q
    public final C0835e N(d2.m mVar, C0765n c0765n, C0765n c0765n2) {
        C0835e c0835eB = mVar.b(c0765n, c0765n2);
        C0522c c0522c = this.f44000J0;
        c0522c.getClass();
        int i5 = c0765n2.f8239u;
        int i10 = c0522c.f4405a;
        int i11 = c0835eB.f12050e;
        if (i5 > i10 || c0765n2.f8240v > c0522c.f4406b) {
            i11 |= 256;
        }
        if (J0(mVar, c0765n2) > c0522c.f4407c) {
            i11 |= 64;
        }
        int i12 = i11;
        return new C0835e(mVar.f33992a, c0765n, c0765n2, i12 != 0 ? 0 : c0835eB.f12049d, i12);
    }

    public final void N0(d2.j jVar, int i5, long j8) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        jVar.n(i5, j8);
        Trace.endSection();
        this.f34065x0.f4909f++;
        this.f44014X0 = 0;
        if (this.f44003M0 == null) {
            Y y10 = this.f44018c1;
            boolean zEquals = y10.equals(Y.f8125d);
            X2.j jVar2 = this.f43995E0;
            if (!zEquals && !y10.equals(this.f44019d1)) {
                this.f44019d1 = y10;
                jVar2.Y(y10);
            }
            m mVar = this.f43998H0;
            boolean z2 = mVar.f44072d != 3;
            mVar.f44072d = 3;
            mVar.k.getClass();
            mVar.f44074f = x.K(SystemClock.elapsedRealtime());
            if (!z2 || (surface = this.f44006P0) == null) {
                return;
            }
            Handler handler = (Handler) jVar2.f16075b;
            if (handler != null) {
                handler.post(new W(jVar2, surface, SystemClock.elapsedRealtime(), 2));
            }
            this.f44009S0 = true;
        }
    }

    @Override // d2.q
    public final d2.l O(IllegalStateException illegalStateException, d2.m mVar) {
        Surface surface = this.f44006P0;
        C3859c c3859c = new C3859c(illegalStateException, mVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c3859c;
    }

    public final boolean O0(d2.m mVar) {
        if (x.f9724a < 23 || this.f1 || G0(mVar.f33992a)) {
            return false;
        }
        return !mVar.f33997f || C3863g.c(this.f43993C0);
    }

    public final void P0(d2.j jVar, int i5) {
        Trace.beginSection("skipVideoBuffer");
        jVar.G(i5);
        Trace.endSection();
        this.f34065x0.f4910g++;
    }

    public final void Q0(int i5, int i10) {
        H5.e eVar = this.f34065x0;
        eVar.f4912i += i5;
        int i11 = i5 + i10;
        eVar.f4911h += i11;
        this.f44013W0 += i11;
        int i12 = this.f44014X0 + i11;
        this.f44014X0 = i12;
        eVar.f4913j = Math.max(i12, eVar.f4913j);
        int i13 = this.f43996F0;
        if (i13 <= 0 || this.f44013W0 < i13) {
            return;
        }
        L0();
    }

    public final void R0(long j8) {
        H5.e eVar = this.f34065x0;
        eVar.f4914l += j8;
        eVar.f4915m++;
        this.Z0 += j8;
        this.f44016a1++;
    }

    @Override // d2.q
    public final int W(T1.d dVar) {
        return (x.f9724a < 34 || !this.f1 || dVar.f11360g >= this.f12040l) ? 0 : 32;
    }

    @Override // d2.q
    public final boolean X() {
        return this.f1 && x.f9724a < 23;
    }

    @Override // d2.q
    public final float Y(float f10, C0765n[] c0765nArr) {
        float fMax = -1.0f;
        for (C0765n c0765n : c0765nArr) {
            float f11 = c0765n.f8241w;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // d2.q
    public final ArrayList Z(d2.h hVar, C0765n c0765n, boolean z2) {
        int i5 = 1;
        List listI0 = I0(this.f43993C0, hVar, c0765n, z2, this.f1);
        HashMap map = v.f34073a;
        ArrayList arrayList = new ArrayList(listI0);
        Collections.sort(arrayList, new V5.s(new com.unity3d.services.core.webview.b(c0765n, i5), i5));
        return arrayList;
    }

    @Override // d2.q
    public final C6.l a0(d2.m mVar, C0765n c0765n, MediaCrypto mediaCrypto, float f10) {
        C0757f c0757f;
        int i5;
        C0522c c0522c;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i10;
        int i11;
        int i12;
        char c10;
        boolean z2;
        Pair pairD;
        int iH0;
        String str = mVar.f33994c;
        C0765n[] c0765nArr = this.f12039j;
        c0765nArr.getClass();
        int iMax = c0765n.f8239u;
        int iJ0 = J0(mVar, c0765n);
        int length = c0765nArr.length;
        float f11 = c0765n.f8241w;
        int i13 = c0765n.f8239u;
        C0757f c0757f2 = c0765n.f8209B;
        int i14 = c0765n.f8240v;
        if (length == 1) {
            if (iJ0 != -1 && (iH0 = H0(mVar, c0765n)) != -1) {
                iJ0 = Math.min((int) (iJ0 * 1.5f), iH0);
            }
            c0522c = new C0522c(iMax, i14, iJ0);
            c0757f = c0757f2;
            i5 = i14;
        } else {
            int length2 = c0765nArr.length;
            int iMax2 = i14;
            int i15 = 0;
            boolean z10 = false;
            while (i15 < length2) {
                C0765n c0765n2 = c0765nArr[i15];
                C0765n[] c0765nArr2 = c0765nArr;
                if (c0757f2 != null && c0765n2.f8209B == null) {
                    C0764m c0764mA = c0765n2.a();
                    c0764mA.f8172A = c0757f2;
                    c0765n2 = new C0765n(c0764mA);
                }
                if (mVar.b(c0765n, c0765n2).f12049d != 0) {
                    int i16 = c0765n2.f8240v;
                    i11 = length2;
                    int i17 = c0765n2.f8239u;
                    i12 = i15;
                    c10 = 65535;
                    z10 |= i17 == -1 || i16 == -1;
                    iMax = Math.max(iMax, i17);
                    iMax2 = Math.max(iMax2, i16);
                    iJ0 = Math.max(iJ0, J0(mVar, c0765n2));
                } else {
                    i11 = length2;
                    i12 = i15;
                    c10 = 65535;
                }
                length2 = i11;
                i15 = i12 + 1;
                c0765nArr = c0765nArr2;
            }
            if (z10) {
                Q1.k.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z11 = i14 > i13;
                int i18 = z11 ? i14 : i13;
                boolean z12 = z11;
                int i19 = z11 ? i13 : i14;
                float f12 = i19 / i18;
                int[] iArr = f43990m1;
                c0757f = c0757f2;
                int i20 = 0;
                while (i20 < 9) {
                    int i21 = iArr[i20];
                    int i22 = i20;
                    int i23 = (int) (i21 * f12);
                    if (i21 <= i18 || i23 <= i19) {
                        break;
                    }
                    if (!z12) {
                        i23 = i21;
                    }
                    if (!z12) {
                        i21 = i23;
                    }
                    int i24 = i19;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f33995d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i10 = i18;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i10 = i18;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(x.f(i23, widthAlignment) * widthAlignment, x.f(i21, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i5 = i14;
                        if (mVar.f(point.x, point.y, f11)) {
                            break;
                        }
                    } else {
                        i5 = i14;
                    }
                    i20 = i22 + 1;
                    i14 = i5;
                    i19 = i24;
                    i18 = i10;
                }
                i5 = i14;
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    C0764m c0764mA2 = c0765n.a();
                    c0764mA2.f8201t = iMax;
                    c0764mA2.f8202u = iMax2;
                    iJ0 = Math.max(iJ0, H0(mVar, new C0765n(c0764mA2)));
                    Q1.k.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                c0757f = c0757f2;
                i5 = i14;
            }
            c0522c = new C0522c(iMax, iMax2, iJ0);
        }
        this.f44000J0 = c0522c;
        int i25 = this.f1 ? this.f44021g1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i13);
        mediaFormat.setInteger("height", i5);
        Q1.k.v(mediaFormat, c0765n.f8235q);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        Q1.k.r(mediaFormat, "rotation-degrees", c0765n.f8242x);
        if (c0757f != null) {
            C0757f c0757f3 = c0757f;
            Q1.k.r(mediaFormat, "color-transfer", c0757f3.f8152c);
            Q1.k.r(mediaFormat, "color-standard", c0757f3.f8150a);
            Q1.k.r(mediaFormat, "color-range", c0757f3.f8151b);
            byte[] bArr = c0757f3.f8153d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c0765n.f8232n) && (pairD = v.d(c0765n)) != null) {
            Q1.k.r(mediaFormat, "profile", ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", c0522c.f4405a);
        mediaFormat.setInteger("max-height", c0522c.f4406b);
        Q1.k.r(mediaFormat, "max-input-size", c0522c.f4407c);
        int i26 = x.f9724a;
        if (i26 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (this.f43997G0) {
            z2 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z2 = true;
        }
        if (i25 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z2);
            mediaFormat.setInteger("audio-session-id", i25);
        }
        if (i26 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f44020e1));
        }
        Surface surfaceK0 = K0(mVar);
        if (this.f44003M0 != null && !x.G(this.f43993C0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new C6.l(mVar, mediaFormat, c0765n, surfaceK0, mediaCrypto, (Dd.c) null);
    }

    @Override // U1.AbstractC0834d, U1.W
    public final boolean b() {
        return this.f34058t0 && this.f44003M0 == null;
    }

    @Override // d2.q
    public final void b0(T1.d dVar) {
        if (this.f44002L0) {
            ByteBuffer byteBuffer = dVar.f11361h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b5 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b5 == -75 && s10 == 60 && s11 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        d2.j jVar = this.f34021K;
                        jVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        jVar.c(bundle);
                    }
                }
            }
        }
    }

    @Override // U1.AbstractC0834d, U1.S
    public final void c(int i5, Object obj) {
        Handler handler;
        m mVar = this.f43998H0;
        if (i5 == 1) {
            Surface surface = obj instanceof Surface ? (Surface) obj : null;
            Surface surface2 = this.f44006P0;
            X2.j jVar = this.f43995E0;
            if (surface2 == surface) {
                if (surface != null) {
                    Y y10 = this.f44019d1;
                    if (y10 != null) {
                        jVar.Y(y10);
                    }
                    Surface surface3 = this.f44006P0;
                    if (surface3 == null || !this.f44009S0 || (handler = (Handler) jVar.f16075b) == null) {
                        return;
                    }
                    handler.post(new W(jVar, surface3, SystemClock.elapsedRealtime(), 2));
                    return;
                }
                return;
            }
            this.f44006P0 = surface;
            if (this.f44003M0 == null) {
                o oVar = mVar.f44070b;
                if (oVar.f44086c != surface) {
                    oVar.b();
                    oVar.f44086c = surface;
                    oVar.d(true);
                }
                mVar.d(1);
            }
            this.f44009S0 = false;
            int i10 = this.f12037h;
            d2.j jVar2 = this.f34021K;
            if (jVar2 != null && this.f44003M0 == null) {
                d2.m mVar2 = this.f34027R;
                mVar2.getClass();
                Surface surface4 = this.f44006P0;
                boolean z2 = (surface4 != null && surface4.isValid()) || (x.f9724a >= 35 && mVar2.f33999h) || O0(mVar2);
                int i11 = x.f9724a;
                if (i11 < 23 || !z2 || this.f44001K0) {
                    t0();
                    e0();
                } else {
                    Surface surfaceK0 = K0(mVar2);
                    if (i11 >= 23 && surfaceK0 != null) {
                        jVar2.j(surfaceK0);
                    } else {
                        if (i11 < 35) {
                            throw new IllegalStateException();
                        }
                        jVar2.v();
                    }
                }
            }
            if (surface != null) {
                Y y11 = this.f44019d1;
                if (y11 != null) {
                    jVar.Y(y11);
                }
                if (i10 == 2) {
                    i iVar = this.f44003M0;
                    if (iVar != null) {
                        iVar.d(true);
                    } else {
                        mVar.c(true);
                    }
                }
            } else {
                this.f44019d1 = null;
                i iVar2 = this.f44003M0;
                if (iVar2 != null) {
                    l lVar = iVar2.f44052n;
                    lVar.getClass();
                    int i12 = Q1.p.f9705c.f9706a;
                    lVar.f44066m = null;
                }
            }
            M0();
            return;
        }
        if (i5 == 7) {
            obj.getClass();
            C0848s c0848s = (C0848s) obj;
            this.f44023i1 = c0848s;
            i iVar3 = this.f44003M0;
            if (iVar3 != null) {
                iVar3.f44052n.k = c0848s;
                return;
            }
            return;
        }
        if (i5 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f44021g1 != iIntValue) {
                this.f44021g1 = iIntValue;
                if (this.f1) {
                    t0();
                    return;
                }
                return;
            }
            return;
        }
        if (i5 == 16) {
            obj.getClass();
            this.f44020e1 = ((Integer) obj).intValue();
            d2.j jVar3 = this.f34021K;
            if (jVar3 != null && x.f9724a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f44020e1));
                jVar3.c(bundle);
                return;
            }
            return;
        }
        if (i5 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f44010T0 = iIntValue2;
            d2.j jVar4 = this.f34021K;
            if (jVar4 != null) {
                jVar4.h(iIntValue2);
                return;
            }
            return;
        }
        if (i5 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f44011U0 = iIntValue3;
            i iVar4 = this.f44003M0;
            if (iVar4 != null) {
                iVar4.g(iIntValue3);
                return;
            }
            o oVar2 = mVar.f44070b;
            if (oVar2.f44091h == iIntValue3) {
                return;
            }
            oVar2.f44091h = iIntValue3;
            oVar2.d(true);
            return;
        }
        if (i5 == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f44005O0 = list;
            i iVar5 = this.f44003M0;
            if (iVar5 != null) {
                iVar5.k(list);
                return;
            }
            return;
        }
        if (i5 != 14) {
            if (i5 == 11) {
                this.f34016F = (C0851v) obj;
                return;
            }
            return;
        }
        obj.getClass();
        Q1.p pVar = (Q1.p) obj;
        if (pVar.f9706a == 0 || pVar.f9707b == 0) {
            return;
        }
        this.f44008R0 = pVar;
        i iVar6 = this.f44003M0;
        if (iVar6 != null) {
            Surface surface5 = this.f44006P0;
            Q1.k.h(surface5);
            iVar6.h(surface5, pVar);
        }
    }

    @Override // d2.q
    public final void g0(Exception exc) {
        Q1.k.l("MediaCodecVideoRenderer", "Video codec error", exc);
        X2.j jVar = this.f43995E0;
        Handler handler = (Handler) jVar.f16075b;
        if (handler != null) {
            handler.post(new q(jVar, exc, 3));
        }
    }

    @Override // U1.W, U1.X
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // d2.q
    public final void h0(long j8, long j10, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        X2.j jVar = this.f43995E0;
        Handler handler = (Handler) jVar.f16075b;
        if (handler != null) {
            str2 = str;
            handler.post(new q(jVar, str2, j8, j10));
        } else {
            str2 = str;
        }
        this.f44001K0 = G0(str2);
        d2.m mVar = this.f34027R;
        mVar.getClass();
        boolean z2 = false;
        if (x.f9724a >= 29 && "video/x-vnd.on2.vp9".equals(mVar.f33993b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f33995d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i5].profile == 16384) {
                    z2 = true;
                    break;
                }
                i5++;
            }
        }
        this.f44002L0 = z2;
        M0();
    }

    @Override // d2.q
    public final void i0(String str) {
        X2.j jVar = this.f43995E0;
        Handler handler = (Handler) jVar.f16075b;
        if (handler != null) {
            handler.post(new q(jVar, str, 5));
        }
    }

    @Override // d2.q, U1.W
    public final boolean isReady() {
        boolean zIsReady = super.isReady();
        i iVar = this.f44003M0;
        if (iVar != null) {
            return ((m) iVar.f44052n.f44061g.f16383b).b(false);
        }
        if (zIsReady && (this.f34021K == null || this.f44006P0 == null || this.f1)) {
            return true;
        }
        return this.f43998H0.b(zIsReady);
    }

    @Override // U1.AbstractC0834d, U1.W
    public final void j() {
        i iVar = this.f44003M0;
        if (iVar != null) {
            m mVar = (m) iVar.f44052n.f44061g.f16383b;
            if (mVar.f44072d == 0) {
                mVar.f44072d = 1;
                return;
            }
            return;
        }
        m mVar2 = this.f43998H0;
        if (mVar2.f44072d == 0) {
            mVar2.f44072d = 1;
        }
    }

    @Override // d2.q
    public final C0835e j0(S3.c cVar) {
        C0835e c0835eJ0 = super.j0(cVar);
        C0765n c0765n = (C0765n) cVar.f10937c;
        c0765n.getClass();
        X2.j jVar = this.f43995E0;
        Handler handler = (Handler) jVar.f16075b;
        if (handler != null) {
            handler.post(new ng.a(jVar, c0765n, c0835eJ0));
        }
        return c0835eJ0;
    }

    @Override // d2.q
    public final void k0(C0765n c0765n, MediaFormat mediaFormat) {
        int integer;
        int i5;
        d2.j jVar = this.f34021K;
        if (jVar != null) {
            jVar.h(this.f44010T0);
        }
        if (this.f1) {
            i5 = c0765n.f8239u;
            integer = c0765n.f8240v;
        } else {
            mediaFormat.getClass();
            boolean z2 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z2 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z2 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i5 = integer2;
        }
        float f10 = c0765n.f8243y;
        int i10 = c0765n.f8242x;
        if (i10 == 90 || i10 == 270) {
            f10 = 1.0f / f10;
            int i11 = integer;
            integer = i5;
            i5 = i11;
        }
        this.f44018c1 = new Y(i5, integer, f10);
        i iVar = this.f44003M0;
        if (iVar == null || !this.f44026l1) {
            this.f43998H0.g(c0765n.f8241w);
        } else {
            C0764m c0764mA = c0765n.a();
            c0764mA.f8201t = i5;
            c0764mA.f8202u = integer;
            c0764mA.f8205x = f10;
            C0765n c0765n2 = new C0765n(c0764mA);
            Q1.k.g(false);
            iVar.f44052n.f44057c.g(c0765n2.f8241w);
            iVar.f44042c = c0765n2;
            if (iVar.f44048i) {
                Q1.k.g(iVar.f44047h != -9223372036854775807L);
                iVar.f44049j = true;
                iVar.k = iVar.f44047h;
            } else {
                iVar.e();
                iVar.f44048i = true;
                iVar.f44049j = false;
                iVar.k = -9223372036854775807L;
            }
        }
        this.f44026l1 = false;
    }

    @Override // d2.q
    public final void m0(long j8) {
        super.m0(j8);
        if (this.f1) {
            return;
        }
        this.f44015Y0--;
    }

    @Override // d2.q
    public final void n0() {
        i iVar = this.f44003M0;
        if (iVar != null) {
            d2.p pVar = this.f34067y0;
            iVar.j(pVar.f34007b, pVar.f34008c, -this.f44024j1, this.f12040l);
        } else {
            this.f43998H0.d(2);
        }
        this.f44026l1 = true;
        M0();
    }

    @Override // d2.q
    public final void o0(T1.d dVar) {
        Surface surface;
        boolean z2 = this.f1;
        if (!z2) {
            this.f44015Y0++;
        }
        if (x.f9724a >= 23 || !z2) {
            return;
        }
        long j8 = dVar.f11360g;
        F0(j8);
        Y y10 = this.f44018c1;
        boolean zEquals = y10.equals(Y.f8125d);
        X2.j jVar = this.f43995E0;
        if (!zEquals && !y10.equals(this.f44019d1)) {
            this.f44019d1 = y10;
            jVar.Y(y10);
        }
        this.f34065x0.f4909f++;
        m mVar = this.f43998H0;
        boolean z10 = mVar.f44072d != 3;
        mVar.f44072d = 3;
        mVar.k.getClass();
        mVar.f44074f = x.K(SystemClock.elapsedRealtime());
        if (z10 && (surface = this.f44006P0) != null) {
            Handler handler = (Handler) jVar.f16075b;
            if (handler != null) {
                handler.post(new W(jVar, surface, SystemClock.elapsedRealtime(), 2));
            }
            this.f44009S0 = true;
        }
        m0(j8);
    }

    @Override // d2.q
    public final void p0(C0765n c0765n) throws C0840j {
        i iVar = this.f44003M0;
        if (iVar == null) {
            return;
        }
        try {
            iVar.c(c0765n);
            throw null;
        } catch (s e7) {
            throw C(e7, c0765n, false, 7000);
        }
    }

    @Override // d2.q
    public final boolean r0(long j8, long j10, d2.j jVar, ByteBuffer byteBuffer, int i5, int i10, int i11, long j11, boolean z2, boolean z10, C0765n c0765n) throws C0840j {
        jVar.getClass();
        d2.p pVar = this.f34067y0;
        long j12 = j11 - pVar.f34008c;
        i iVar = this.f44003M0;
        if (iVar != null) {
            try {
                return iVar.b(j11 + (-this.f44024j1), z10, j8, j10, new E4.n(this, jVar, i5, j12));
            } catch (s e7) {
                throw C(e7, e7.f44114a, false, 7001);
            }
        }
        int iA = this.f43998H0.a(j11, j8, j10, pVar.f34007b, z10, this.f43999I0);
        if (iA != 4) {
            if (z2 && !z10) {
                P0(jVar, i5);
                return true;
            }
            Surface surface = this.f44006P0;
            C8.j jVar2 = this.f43999I0;
            if (surface == null) {
                if (jVar2.f1944a < 30000) {
                    P0(jVar, i5);
                    R0(jVar2.f1944a);
                    return true;
                }
            } else {
                if (iA == 0) {
                    this.f12036g.getClass();
                    long jNanoTime = System.nanoTime();
                    C0848s c0848s = this.f44023i1;
                    if (c0848s != null) {
                        c0848s.g();
                    }
                    N0(jVar, i5, jNanoTime);
                    R0(jVar2.f1944a);
                    return true;
                }
                if (iA == 1) {
                    long j13 = jVar2.f1945b;
                    long j14 = jVar2.f1944a;
                    if (j13 == this.f44017b1) {
                        P0(jVar, i5);
                    } else {
                        C0848s c0848s2 = this.f44023i1;
                        if (c0848s2 != null) {
                            c0848s2.g();
                        }
                        N0(jVar, i5, j13);
                    }
                    R0(j14);
                    this.f44017b1 = j13;
                    return true;
                }
                if (iA == 2) {
                    Trace.beginSection("dropVideoBuffer");
                    jVar.G(i5);
                    Trace.endSection();
                    Q0(0, 1);
                    R0(jVar2.f1944a);
                    return true;
                }
                if (iA == 3) {
                    P0(jVar, i5);
                    R0(jVar2.f1944a);
                    return true;
                }
                if (iA != 5) {
                    throw new IllegalStateException(String.valueOf(iA));
                }
            }
        }
        return false;
    }

    @Override // d2.q, U1.AbstractC0834d, U1.W
    public final void t(float f10, float f11) {
        super.t(f10, f11);
        i iVar = this.f44003M0;
        if (iVar != null) {
            iVar.i(f10);
        } else {
            this.f43998H0.h(f10);
        }
    }

    @Override // d2.q, U1.W
    public final void v(long j8, long j10) throws C0840j {
        super.v(j8, j10);
        i iVar = this.f44003M0;
        if (iVar != null) {
            try {
                iVar.f(j8, j10);
            } catch (s e7) {
                throw C(e7, e7.f44114a, false, 7001);
            }
        }
    }

    @Override // d2.q
    public final void v0() {
        super.v0();
        this.f44015Y0 = 0;
    }

    @Override // d2.q
    public final boolean z0(d2.m mVar) {
        Surface surface = this.f44006P0;
        if (surface == null || !surface.isValid()) {
            return (x.f9724a >= 35 && mVar.f33999h) || O0(mVar);
        }
        return true;
    }
}
