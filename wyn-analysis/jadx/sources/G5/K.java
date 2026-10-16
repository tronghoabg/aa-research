package G5;

import E5.B0;
import E5.C0465o;
import E5.S;
import E5.T;
import E5.r0;
import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import l8.AbstractC3409K;
import l8.C3406H;
import l8.C3407I;
import l8.e0;
import u6.AbstractC4256a;
import y3.C4552j;

/* loaded from: classes3.dex */
public final class K extends V5.q implements u6.j {

    /* renamed from: E0, reason: collision with root package name */
    public final Context f4313E0;

    /* renamed from: F0, reason: collision with root package name */
    public final C0535p f4314F0;

    /* renamed from: G0, reason: collision with root package name */
    public final G f4315G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f4316H0;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f4317I0;

    /* renamed from: J0, reason: collision with root package name */
    public T f4318J0;

    /* renamed from: K0, reason: collision with root package name */
    public long f4319K0;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f4320L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f4321M0;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f4322N0;

    /* renamed from: O0, reason: collision with root package name */
    public E5.K f4323O0;

    public K(Context context, V5.j jVar, Handler handler, E5.F f10, G g9) {
        super(1, jVar, 44100.0f);
        this.f4313E0 = context.getApplicationContext();
        this.f4315G0 = g9;
        this.f4314F0 = new C0535p(handler, f10, 0);
        g9.f4302r = new C4552j(this, 8);
    }

    public static AbstractC3409K q0(V5.r rVar, T t10, boolean z2, G g9) {
        String str = t10.f3238l;
        if (str == null) {
            C3407I c3407i = AbstractC3409K.f40056b;
            return e0.f40101e;
        }
        if (g9.f(t10) != 0) {
            List listE = V5.y.e("audio/raw", false, false);
            V5.n nVar = listE.isEmpty() ? null : (V5.n) listE.get(0);
            if (nVar != null) {
                return AbstractC3409K.n(nVar);
            }
        }
        rVar.getClass();
        List listE2 = V5.y.e(str, z2, false);
        String strB = V5.y.b(t10);
        if (strB == null) {
            return AbstractC3409K.j(listE2);
        }
        List listE3 = V5.y.e(strB, z2, false);
        C3406H c3406hI = AbstractC3409K.i();
        c3406hI.d(listE2);
        c3406hI.d(listE3);
        return c3406hI.g();
    }

    @Override // V5.q
    public final float J(float f10, T[] tArr) {
        int iMax = -1;
        for (T t10 : tArr) {
            int i5 = t10.f3252z;
            if (i5 != -1) {
                iMax = Math.max(iMax, i5);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // V5.q
    public final ArrayList K(V5.r rVar, T t10, boolean z2) {
        AbstractC3409K abstractC3409KQ0 = q0(rVar, t10, z2, this.f4315G0);
        Pattern pattern = V5.y.f13150a;
        ArrayList arrayList = new ArrayList(abstractC3409KQ0);
        Collections.sort(arrayList, new V5.s(new S8.b(t10, 10), 0));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    @Override // V5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V5.i M(V5.n r12, E5.T r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.K.M(V5.n, E5.T, android.media.MediaCrypto, float):V5.i");
    }

    @Override // V5.q
    public final void R(Exception exc) {
        AbstractC4256a.p("MediaCodecAudioRenderer", "Audio codec error", exc);
        C0535p c0535p = this.f4314F0;
        Handler handler = c0535p.f4433b;
        if (handler != null) {
            handler.post(new RunnableC0533n(c0535p, exc, 2));
        }
    }

    @Override // V5.q
    public final void S(long j8, long j10, String str) {
        C0535p c0535p = this.f4314F0;
        Handler handler = c0535p.f4433b;
        if (handler != null) {
            handler.post(new RunnableC0533n(c0535p, str, j8, j10));
        }
    }

    @Override // V5.q
    public final void T(String str) {
        C0535p c0535p = this.f4314F0;
        Handler handler = c0535p.f4433b;
        if (handler != null) {
            handler.post(new RunnableC0533n(c0535p, str, 0));
        }
    }

    @Override // V5.q
    public final H5.i U(S3.s sVar) {
        H5.i iVarU = super.U(sVar);
        T t10 = (T) sVar.f11010c;
        C0535p c0535p = this.f4314F0;
        Handler handler = c0535p.f4433b;
        if (handler != null) {
            handler.post(new RunnableC0533n(c0535p, t10, iVarU));
        }
        return iVarU;
    }

    @Override // V5.q
    public final void V(T t10, MediaFormat mediaFormat) throws C0465o {
        int i5;
        T t11 = this.f4318J0;
        int[] iArr = null;
        if (t11 != null) {
            t10 = t11;
        } else if (this.f13084I != null) {
            int iO = "audio/raw".equals(t10.f3238l) ? t10.f3222A : (u6.v.f46721a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? u6.v.o(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            S s10 = new S();
            s10.k = "audio/raw";
            s10.f3219z = iO;
            s10.f3191A = t10.f3223B;
            s10.f3192B = t10.f3224C;
            s10.f3217x = mediaFormat.getInteger("channel-count");
            s10.f3218y = mediaFormat.getInteger("sample-rate");
            T t12 = new T(s10);
            if (this.f4317I0 && t12.f3251y == 6 && (i5 = t10.f3251y) < 6) {
                iArr = new int[i5];
                for (int i10 = 0; i10 < i5; i10++) {
                    iArr[i10] = i10;
                }
            }
            t10 = t12;
        }
        try {
            this.f4315G0.b(t10, iArr);
        } catch (C0536q e7) {
            throw b(e7, e7.f4435a, false, 5001);
        }
    }

    @Override // V5.q
    public final void W() {
        this.f4315G0.getClass();
    }

    @Override // V5.q
    public final void Y() {
        this.f4315G0.f4264G = true;
    }

    @Override // V5.q
    public final void Z(H5.h hVar) {
        if (!this.f4320L0 || hVar.h(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(hVar.f4919f - this.f4319K0) > 500000) {
            this.f4319K0 = hVar.f4919f;
        }
        this.f4320L0 = false;
    }

    @Override // u6.j
    public final void a(r0 r0Var) {
        G g9 = this.f4315G0;
        g9.getClass();
        r0 r0Var2 = new r0(u6.v.g(r0Var.f3535a, 0.1f, 8.0f), u6.v.g(r0Var.f3536b, 0.1f, 8.0f));
        if (!g9.k || u6.v.f46721a < 23) {
            g9.r(r0Var2, g9.g().f4250b);
        } else {
            g9.s(r0Var2);
        }
    }

    @Override // V5.q
    public final boolean b0(long j8, long j10, V5.k kVar, ByteBuffer byteBuffer, int i5, int i10, int i11, long j11, boolean z2, boolean z10, T t10) throws C0465o {
        byteBuffer.getClass();
        if (this.f4318J0 != null && (i10 & 2) != 0) {
            kVar.getClass();
            kVar.x(i5, false);
            return true;
        }
        G g9 = this.f4315G0;
        if (z2) {
            if (kVar != null) {
                kVar.x(i5, false);
            }
            this.f13139z0.f4910g += i11;
            g9.f4264G = true;
            return true;
        }
        try {
            if (!g9.j(j11, i11, byteBuffer)) {
                return false;
            }
            if (kVar != null) {
                kVar.x(i5, false);
            }
            this.f13139z0.f4909f += i11;
            return true;
        } catch (r e7) {
            throw b(e7, e7.f4438c, e7.f4437b, 5001);
        } catch (s e10) {
            throw b(e10, t10, e10.f4440b, 5002);
        }
    }

    @Override // E5.AbstractC0449f, E5.x0
    public final void c(int i5, Object obj) {
        G g9 = this.f4315G0;
        if (i5 == 2) {
            float fFloatValue = ((Float) obj).floatValue();
            if (g9.f4267J != fFloatValue) {
                g9.f4267J = fFloatValue;
                if (g9.m()) {
                    if (u6.v.f46721a >= 21) {
                        g9.f4305u.setVolume(g9.f4267J);
                        return;
                    }
                    AudioTrack audioTrack = g9.f4305u;
                    float f10 = g9.f4267J;
                    audioTrack.setStereoVolume(f10, f10);
                    return;
                }
                return;
            }
            return;
        }
        if (i5 == 3) {
            C0527h c0527h = (C0527h) obj;
            if (g9.f4306v.equals(c0527h)) {
                return;
            }
            g9.f4306v = c0527h;
            if (g9.f4282Z) {
                return;
            }
            g9.d();
            return;
        }
        if (i5 == 6) {
            x xVar = (x) obj;
            if (g9.f4280X.equals(xVar)) {
                return;
            }
            xVar.getClass();
            if (g9.f4305u != null) {
                g9.f4280X.getClass();
            }
            g9.f4280X = xVar;
            return;
        }
        switch (i5) {
            case 9:
                g9.r(g9.g().f4249a, ((Boolean) obj).booleanValue());
                break;
            case 10:
                int iIntValue = ((Integer) obj).intValue();
                if (g9.f4279W != iIntValue) {
                    g9.f4279W = iIntValue;
                    g9.f4278V = iIntValue != 0;
                    g9.d();
                    break;
                }
                break;
            case 11:
                this.f4323O0 = (E5.K) obj;
                break;
            case 12:
                if (u6.v.f46721a >= 23) {
                    J.a(g9, obj);
                    break;
                }
                break;
        }
    }

    @Override // u6.j
    public final r0 e() {
        G g9 = this.f4315G0;
        return g9.k ? g9.f4309y : g9.g().f4249a;
    }

    @Override // V5.q
    public final void e0() throws C0465o {
        try {
            G g9 = this.f4315G0;
            if (!g9.f4275S && g9.m() && g9.c()) {
                g9.o();
                g9.f4275S = true;
            }
        } catch (s e7) {
            throw b(e7, e7.f4441c, e7.f4440b, 5002);
        }
    }

    @Override // E5.AbstractC0449f
    public final String f() {
        return "MediaCodecAudioRenderer";
    }

    @Override // u6.j
    public final long g() {
        if (this.f3350f == 2) {
            r0();
        }
        return this.f4319K0;
    }

    @Override // V5.q, E5.AbstractC0449f
    public final boolean i() {
        if (!this.v0) {
            return false;
        }
        G g9 = this.f4315G0;
        if (g9.m()) {
            return g9.f4275S && !g9.k();
        }
        return true;
    }

    @Override // V5.q, E5.AbstractC0449f
    public final boolean j() {
        return this.f4315G0.k() || super.j();
    }

    @Override // V5.q, E5.AbstractC0449f
    public final void k() {
        C0535p c0535p = this.f4314F0;
        this.f4322N0 = true;
        try {
            this.f4315G0.d();
            try {
                super.k();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.k();
                throw th;
            } finally {
            }
        }
    }

    @Override // V5.q
    public final boolean k0(T t10) {
        return this.f4315G0.f(t10) != 0;
    }

    @Override // E5.AbstractC0449f
    public final void l(boolean z2, boolean z10) {
        H5.e eVar = new H5.e(0);
        this.f13139z0 = eVar;
        C0535p c0535p = this.f4314F0;
        Handler handler = c0535p.f4433b;
        if (handler != null) {
            handler.post(new RunnableC0533n(c0535p, eVar, 4));
        }
        B0 b02 = this.f3347c;
        b02.getClass();
        boolean z11 = b02.f3010a;
        G g9 = this.f4315G0;
        if (z11) {
            g9.getClass();
            AbstractC4256a.i(u6.v.f46721a >= 21);
            AbstractC4256a.i(g9.f4278V);
            if (!g9.f4282Z) {
                g9.f4282Z = true;
                g9.d();
            }
        } else if (g9.f4282Z) {
            g9.f4282Z = false;
            g9.d();
        }
        F5.l lVar = this.f3349e;
        lVar.getClass();
        g9.f4301q = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if ((r4.isEmpty() ? null : (V5.n) r4.get(0)) != null) goto L30;
     */
    @Override // V5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l0(V5.r r12, E5.T r13) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.K.l0(V5.r, E5.T):int");
    }

    @Override // V5.q, E5.AbstractC0449f
    public final void m(long j8, boolean z2) {
        super.m(j8, z2);
        this.f4315G0.d();
        this.f4319K0 = j8;
        this.f4320L0 = true;
        this.f4321M0 = true;
    }

    @Override // E5.AbstractC0449f
    public final void n() {
        G g9 = this.f4315G0;
        try {
            try {
                B();
                d0();
                A.e0 e0Var = this.f13077C;
                if (e0Var != null) {
                    e0Var.y(null);
                }
                this.f13077C = null;
            } catch (Throwable th) {
                A.e0 e0Var2 = this.f13077C;
                if (e0Var2 != null) {
                    e0Var2.y(null);
                }
                this.f13077C = null;
                throw th;
            }
        } finally {
            if (this.f4322N0) {
                this.f4322N0 = false;
                g9.q();
            }
        }
    }

    @Override // E5.AbstractC0449f
    public final void o() throws IllegalStateException {
        G g9 = this.f4315G0;
        g9.f4277U = true;
        if (g9.m()) {
            v vVar = g9.f4294i.f4465f;
            vVar.getClass();
            vVar.a();
            g9.f4305u.play();
        }
    }

    @Override // E5.AbstractC0449f
    public final void p() throws IllegalStateException {
        r0();
        G g9 = this.f4315G0;
        g9.f4277U = false;
        if (g9.m()) {
            w wVar = g9.f4294i;
            wVar.f4470l = 0L;
            wVar.f4481w = 0;
            wVar.f4480v = 0;
            wVar.f4471m = 0L;
            wVar.f4456C = 0L;
            wVar.f4459F = 0L;
            wVar.k = false;
            if (wVar.f4482x == -9223372036854775807L) {
                v vVar = wVar.f4465f;
                vVar.getClass();
                vVar.a();
                g9.f4305u.pause();
            }
        }
    }

    public final int p0(V5.n nVar, T t10) {
        int i5;
        if (!"OMX.google.raw.decoder".equals(nVar.f13061a) || (i5 = u6.v.f46721a) >= 24 || (i5 == 23 && u6.v.x(this.f4313E0))) {
            return t10.f3239m;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0216 A[Catch: Exception -> 0x022c, TRY_LEAVE, TryCatch #0 {Exception -> 0x022c, blocks: (B:91:0x01ee, B:93:0x0216), top: B:167:0x01ee }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0() {
        /*
            Method dump skipped, instructions count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.K.r0():void");
    }

    @Override // V5.q
    public final H5.i z(V5.n nVar, T t10, T t11) {
        H5.i iVarB = nVar.b(t10, t11);
        int iP0 = p0(nVar, t11);
        int i5 = this.f4316H0;
        int i10 = iVarB.f4926e;
        if (iP0 > i5) {
            i10 |= 64;
        }
        int i11 = i10;
        return new H5.i(nVar.f13061a, t10, t11, i11 != 0 ? 0 : iVarB.f4925d, i11);
    }

    @Override // E5.AbstractC0449f
    public final u6.j d() {
        return this;
    }
}
