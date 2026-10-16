package h6;

import A7.AbstractC0279p0;
import E5.AbstractC0449f;
import E5.C;
import E5.F;
import E5.I;
import E5.T;
import S3.s;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import l8.AbstractC3409K;
import l8.e0;
import u6.AbstractC4256a;
import u6.v;

/* renamed from: h6.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2792k extends AbstractC0449f implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    public long f36204A;

    /* renamed from: B, reason: collision with root package name */
    public long f36205B;

    /* renamed from: C, reason: collision with root package name */
    public long f36206C;

    /* renamed from: m, reason: collision with root package name */
    public final Handler f36207m;

    /* renamed from: n, reason: collision with root package name */
    public final F f36208n;

    /* renamed from: o, reason: collision with root package name */
    public final C2790i f36209o;

    /* renamed from: p, reason: collision with root package name */
    public final s f36210p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f36211q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f36212r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f36213s;

    /* renamed from: t, reason: collision with root package name */
    public int f36214t;

    /* renamed from: u, reason: collision with root package name */
    public T f36215u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC2788g f36216v;

    /* renamed from: w, reason: collision with root package name */
    public C2791j f36217w;

    /* renamed from: x, reason: collision with root package name */
    public C2785d f36218x;

    /* renamed from: y, reason: collision with root package name */
    public C2785d f36219y;

    /* renamed from: z, reason: collision with root package name */
    public int f36220z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2792k(F f10, Looper looper) {
        Handler handler;
        super(3);
        C2790i c2790i = C2790i.f36202a;
        this.f36208n = f10;
        if (looper == null) {
            handler = null;
        } else {
            int i5 = v.f46721a;
            handler = new Handler(looper, this);
        }
        this.f36207m = handler;
        this.f36209o = c2790i;
        this.f36210p = new s(4, (char) 0);
        this.f36204A = -9223372036854775807L;
        this.f36205B = -9223372036854775807L;
        this.f36206C = -9223372036854775807L;
    }

    public final void A(C2784c c2784c) {
        AbstractC3409K abstractC3409K = c2784c.f36185a;
        F f10 = this.f36208n;
        f10.f3030a.f3091l.p(27, new C(0, abstractC3409K));
        I i5 = f10.f3030a;
        i5.f3077d0 = c2784c;
        i5.f3091l.p(27, new B8.b(c2784c, 6));
    }

    public final void B() {
        this.f36217w = null;
        this.f36220z = -1;
        C2785d c2785d = this.f36218x;
        if (c2785d != null) {
            c2785d.o();
            this.f36218x = null;
        }
        C2785d c2785d2 = this.f36219y;
        if (c2785d2 != null) {
            c2785d2.o();
            this.f36219y = null;
        }
    }

    @Override // E5.AbstractC0449f
    public final String f() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        A((C2784c) message.obj);
        return true;
    }

    @Override // E5.AbstractC0449f
    public final boolean i() {
        return this.f36212r;
    }

    @Override // E5.AbstractC0449f
    public final boolean j() {
        return true;
    }

    @Override // E5.AbstractC0449f
    public final void k() {
        this.f36215u = null;
        this.f36204A = -9223372036854775807L;
        C2784c c2784c = new C2784c(e0.f40101e, z(this.f36206C));
        Handler handler = this.f36207m;
        if (handler != null) {
            handler.obtainMessage(0, c2784c).sendToTarget();
        } else {
            A(c2784c);
        }
        this.f36205B = -9223372036854775807L;
        this.f36206C = -9223372036854775807L;
        B();
        InterfaceC2788g interfaceC2788g = this.f36216v;
        interfaceC2788g.getClass();
        interfaceC2788g.release();
        this.f36216v = null;
        this.f36214t = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    @Override // E5.AbstractC0449f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(long r6, boolean r8) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.C2792k.m(long, boolean):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    @Override // E5.AbstractC0449f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(E5.T[] r4, long r5, long r7) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.C2792k.q(E5.T[], long, long):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021d A[PHI: r25
  0x021d: PHI (r25v20 java.lang.String) = 
  (r25v7 java.lang.String)
  (r25v8 java.lang.String)
  (r25v9 java.lang.String)
  (r25v10 java.lang.String)
  (r25v11 java.lang.String)
  (r25v12 java.lang.String)
  (r25v13 java.lang.String)
  (r25v14 java.lang.String)
  (r25v15 java.lang.String)
  (r25v16 java.lang.String)
  (r25v17 java.lang.String)
  (r25v18 java.lang.String)
  (r25v21 java.lang.String)
 binds: [B:162:0x02ad, B:158:0x02a2, B:154:0x0297, B:150:0x028c, B:146:0x0281, B:142:0x0276, B:138:0x026b, B:134:0x0260, B:130:0x0252, B:126:0x0244, B:122:0x0236, B:118:0x0228, B:115:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    @Override // E5.AbstractC0449f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(long r29, long r31) {
        /*
            Method dump skipped, instructions count: 1606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.C2792k.s(long, long):void");
    }

    @Override // E5.AbstractC0449f
    public final int w(T t10) {
        this.f36209o.getClass();
        String str = t10.f3238l;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return AbstractC0279p0.e(t10.f3226E == 0 ? 4 : 2, 0, 0);
        }
        return u6.k.h(t10.f3238l) ? AbstractC0279p0.e(1, 0, 0) : AbstractC0279p0.e(0, 0, 0);
    }

    public final long y() {
        if (this.f36220z == -1) {
            return Long.MAX_VALUE;
        }
        this.f36218x.getClass();
        if (this.f36220z >= this.f36218x.p()) {
            return Long.MAX_VALUE;
        }
        return this.f36218x.k(this.f36220z);
    }

    public final long z(long j8) {
        AbstractC4256a.i(j8 != -9223372036854775807L);
        AbstractC4256a.i(this.f36205B != -9223372036854775807L);
        return j8 - this.f36205B;
    }
}
