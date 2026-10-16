package G5;

import A7.AbstractC0279p0;
import E5.T;
import E5.r0;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s8.C4026b;
import u6.AbstractC4256a;
import y3.C4552j;

/* loaded from: classes3.dex */
public final class G implements t {

    /* renamed from: d0, reason: collision with root package name */
    public static final Object f4255d0 = new Object();

    /* renamed from: e0, reason: collision with root package name */
    public static ExecutorService f4256e0;

    /* renamed from: f0, reason: collision with root package name */
    public static int f4257f0;

    /* renamed from: A, reason: collision with root package name */
    public int f4258A;

    /* renamed from: B, reason: collision with root package name */
    public long f4259B;

    /* renamed from: C, reason: collision with root package name */
    public long f4260C;

    /* renamed from: D, reason: collision with root package name */
    public long f4261D;

    /* renamed from: E, reason: collision with root package name */
    public long f4262E;

    /* renamed from: F, reason: collision with root package name */
    public int f4263F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4264G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4265H;

    /* renamed from: I, reason: collision with root package name */
    public long f4266I;

    /* renamed from: J, reason: collision with root package name */
    public float f4267J;

    /* renamed from: K, reason: collision with root package name */
    public InterfaceC0532m[] f4268K;
    public ByteBuffer[] L;

    /* renamed from: M, reason: collision with root package name */
    public ByteBuffer f4269M;

    /* renamed from: N, reason: collision with root package name */
    public int f4270N;

    /* renamed from: O, reason: collision with root package name */
    public ByteBuffer f4271O;

    /* renamed from: P, reason: collision with root package name */
    public byte[] f4272P;

    /* renamed from: Q, reason: collision with root package name */
    public int f4273Q;

    /* renamed from: R, reason: collision with root package name */
    public int f4274R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f4275S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f4276T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f4277U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f4278V;

    /* renamed from: W, reason: collision with root package name */
    public int f4279W;

    /* renamed from: X, reason: collision with root package name */
    public x f4280X;

    /* renamed from: Y, reason: collision with root package name */
    public C f4281Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f4282Z;

    /* renamed from: a, reason: collision with root package name */
    public final C0529j f4283a;

    /* renamed from: a0, reason: collision with root package name */
    public long f4284a0;

    /* renamed from: b, reason: collision with root package name */
    public final G9.e f4285b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4286b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4287c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4288c0;

    /* renamed from: d, reason: collision with root package name */
    public final z f4289d;

    /* renamed from: e, reason: collision with root package name */
    public final Q f4290e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0532m[] f4291f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0532m[] f4292g;

    /* renamed from: h, reason: collision with root package name */
    public final C4026b f4293h;

    /* renamed from: i, reason: collision with root package name */
    public final w f4294i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque f4295j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4296l;

    /* renamed from: m, reason: collision with root package name */
    public b7.k f4297m;

    /* renamed from: n, reason: collision with root package name */
    public final A2.d f4298n;

    /* renamed from: o, reason: collision with root package name */
    public final A2.d f4299o;

    /* renamed from: p, reason: collision with root package name */
    public final H f4300p;

    /* renamed from: q, reason: collision with root package name */
    public F5.l f4301q;

    /* renamed from: r, reason: collision with root package name */
    public C4552j f4302r;

    /* renamed from: s, reason: collision with root package name */
    public D f4303s;

    /* renamed from: t, reason: collision with root package name */
    public D f4304t;

    /* renamed from: u, reason: collision with root package name */
    public AudioTrack f4305u;

    /* renamed from: v, reason: collision with root package name */
    public C0527h f4306v;

    /* renamed from: w, reason: collision with root package name */
    public E f4307w;

    /* renamed from: x, reason: collision with root package name */
    public E f4308x;

    /* renamed from: y, reason: collision with root package name */
    public r0 f4309y;

    /* renamed from: z, reason: collision with root package name */
    public ByteBuffer f4310z;

    public G(Dd.c cVar) {
        this.f4283a = (C0529j) cVar.f2642b;
        G9.e eVar = (G9.e) cVar.f2643c;
        this.f4285b = eVar;
        int i5 = u6.v.f46721a;
        this.f4287c = false;
        this.k = false;
        this.f4296l = 0;
        this.f4300p = (H) cVar.f2644d;
        C4026b c4026b = new C4026b(7);
        this.f4293h = c4026b;
        c4026b.e();
        this.f4294i = new w(new xa.d(this, 9));
        z zVar = new z();
        this.f4289d = zVar;
        Q q4 = new Q();
        q4.f4381m = u6.v.f46726f;
        this.f4290e = q4;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new M(), zVar, q4);
        Collections.addAll(arrayList, (InterfaceC0532m[]) eVar.f4685b);
        this.f4291f = (InterfaceC0532m[]) arrayList.toArray(new InterfaceC0532m[0]);
        this.f4292g = new InterfaceC0532m[]{new I()};
        this.f4267J = 1.0f;
        this.f4306v = C0527h.f4408g;
        this.f4279W = 0;
        this.f4280X = new x();
        r0 r0Var = r0.f3534d;
        this.f4308x = new E(r0Var, false, 0L, 0L);
        this.f4309y = r0Var;
        this.f4274R = -1;
        this.f4268K = new InterfaceC0532m[0];
        this.L = new ByteBuffer[0];
        this.f4295j = new ArrayDeque();
        this.f4298n = new A2.d(5);
        this.f4299o = new A2.d(5);
    }

    public static AudioFormat e(int i5, int i10, int i11) {
        return new AudioFormat.Builder().setSampleRate(i5).setChannelMask(i10).setEncoding(i11).build();
    }

    public static boolean n(AudioTrack audioTrack) {
        return u6.v.f46721a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void a(long j8) {
        r0 r0Var;
        boolean z2;
        C0535p c0535p;
        Handler handler;
        boolean zT = t();
        G9.e eVar = this.f4285b;
        if (zT) {
            r0Var = g().f4249a;
            eVar.getClass();
            float f10 = r0Var.f3535a;
            P p10 = (P) eVar.f4687d;
            if (p10.f4365c != f10) {
                p10.f4365c = f10;
                p10.f4371i = true;
            }
            float f11 = p10.f4366d;
            float f12 = r0Var.f3536b;
            if (f11 != f12) {
                p10.f4366d = f12;
                p10.f4371i = true;
            }
        } else {
            r0Var = r0.f3534d;
        }
        r0 r0Var2 = r0Var;
        int i5 = 0;
        if (t()) {
            boolean z10 = g().f4250b;
            ((N) eVar.f4686c).f4335m = z10;
            z2 = z10;
        } else {
            z2 = false;
        }
        this.f4295j.add(new E(r0Var2, z2, Math.max(0L, j8), (i() * 1000000) / this.f4304t.f4244e));
        InterfaceC0532m[] interfaceC0532mArr = this.f4304t.f4248i;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0532m interfaceC0532m : interfaceC0532mArr) {
            if (interfaceC0532m.isActive()) {
                arrayList.add(interfaceC0532m);
            } else {
                interfaceC0532m.flush();
            }
        }
        int size = arrayList.size();
        this.f4268K = (InterfaceC0532m[]) arrayList.toArray(new InterfaceC0532m[size]);
        this.L = new ByteBuffer[size];
        while (true) {
            InterfaceC0532m[] interfaceC0532mArr2 = this.f4268K;
            if (i5 >= interfaceC0532mArr2.length) {
                break;
            }
            InterfaceC0532m interfaceC0532m2 = interfaceC0532mArr2[i5];
            interfaceC0532m2.flush();
            this.L[i5] = interfaceC0532m2.c();
            i5++;
        }
        C4552j c4552j = this.f4302r;
        if (c4552j == null || (handler = (c0535p = ((K) c4552j.f48001b).f4314F0).f4433b) == null) {
            return;
        }
        handler.post(new RunnableC0534o(0, c0535p, z2));
    }

    public final void b(T t10, int[] iArr) {
        int i5;
        InterfaceC0532m[] interfaceC0532mArr;
        int iIntValue;
        int i10;
        int iP;
        int iIntValue2;
        int i11;
        int iH;
        int[] iArr2;
        boolean zEquals = "audio/raw".equals(t10.f3238l);
        int i12 = t10.f3252z;
        int i13 = t10.f3251y;
        if (zEquals) {
            int i14 = t10.f3222A;
            AbstractC4256a.e(u6.v.w(i14));
            int iP2 = u6.v.p(i14, i13);
            InterfaceC0532m[] interfaceC0532mArr2 = (this.f4287c && (i14 == 536870912 || i14 == 805306368 || i14 == 4)) ? this.f4292g : this.f4291f;
            int i15 = t10.f3223B;
            Q q4 = this.f4290e;
            q4.f4378i = i15;
            q4.f4379j = t10.f3224C;
            if (u6.v.f46721a < 21 && i13 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i16 = 0; i16 < 6; i16++) {
                    iArr2[i16] = i16;
                }
            } else {
                iArr2 = iArr;
            }
            this.f4289d.f4492i = iArr2;
            C0530k c0530k = new C0530k(i12, i13, i14);
            for (InterfaceC0532m interfaceC0532m : interfaceC0532mArr2) {
                try {
                    C0530k c0530kF = interfaceC0532m.f(c0530k);
                    if (interfaceC0532m.isActive()) {
                        c0530k = c0530kF;
                    }
                } catch (C0531l e7) {
                    throw new C0536q(e7, t10);
                }
            }
            int i17 = c0530k.f4424c;
            int i18 = c0530k.f4423b;
            int iK = u6.v.k(i18);
            iP = u6.v.p(i17, i18);
            interfaceC0532mArr = interfaceC0532mArr2;
            iIntValue = i17;
            i11 = iP2;
            iIntValue2 = iK;
            i10 = c0530k.f4422a;
            i5 = 0;
        } else {
            InterfaceC0532m[] interfaceC0532mArr3 = new InterfaceC0532m[0];
            if (u(t10, this.f4306v)) {
                String str = t10.f3238l;
                str.getClass();
                i5 = 1;
                interfaceC0532mArr = interfaceC0532mArr3;
                iIntValue = u6.k.a(str, t10.f3236i);
                i11 = -1;
                iIntValue2 = u6.v.k(i13);
                i10 = i12;
                iP = -1;
            } else {
                Pair pairA = this.f4283a.a(t10);
                if (pairA == null) {
                    throw new C0536q("Unable to configure passthrough for: " + t10, t10);
                }
                i5 = 2;
                interfaceC0532mArr = interfaceC0532mArr3;
                iIntValue = ((Integer) pairA.first).intValue();
                i10 = i12;
                iP = -1;
                iIntValue2 = ((Integer) pairA.second).intValue();
                i11 = -1;
            }
        }
        if (iIntValue == 0) {
            throw new C0536q("Invalid output encoding (mode=" + i5 + ") for: " + t10, t10);
        }
        if (iIntValue2 == 0) {
            throw new C0536q("Invalid output channel config (mode=" + i5 + ") for: " + t10, t10);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i10, iIntValue2, iIntValue);
        AbstractC4256a.i(minBufferSize != -2);
        double d3 = this.k ? 8.0d : 1.0d;
        this.f4300p.getClass();
        if (i5 == 0) {
            long j8 = i10;
            long j10 = 250000 * j8;
            long j11 = iP;
            iH = u6.v.h(minBufferSize * 4, S3.f.l((j10 * j11) / 1000000), S3.f.l(((750000 * j8) * j11) / 1000000));
        } else if (i5 == 1) {
            iH = S3.f.l((50000000 * H.a(iIntValue)) / 1000000);
        } else {
            if (i5 != 2) {
                throw new IllegalArgumentException();
            }
            iH = S3.f.l(((iIntValue == 5 ? 500000 : 250000) * H.a(iIntValue)) / 1000000);
        }
        this.f4286b0 = false;
        D d5 = new D(t10, i11, i5, iP, i10, iIntValue2, iIntValue, (((Math.max(minBufferSize, (int) (iH * d3)) + iP) - 1) / iP) * iP, interfaceC0532mArr);
        if (m()) {
            this.f4303s = d5;
        } else {
            this.f4304t = d5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r9.f4271O != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() throws java.lang.Exception {
        /*
            r9 = this;
            int r0 = r9.f4274R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.f4274R = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.f4274R
            G5.m[] r5 = r9.f4268K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.e()
        L1f:
            r9.p(r7)
            boolean r0 = r4.b()
            if (r0 != 0) goto L29
            goto L3a
        L29:
            int r0 = r9.f4274R
            int r0 = r0 + r1
            r9.f4274R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f4271O
            if (r0 == 0) goto L3b
            r9.v(r0, r7)
            java.nio.ByteBuffer r0 = r9.f4271O
            if (r0 == 0) goto L3b
        L3a:
            return r2
        L3b:
            r9.f4274R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.G.c():boolean");
    }

    public final void d() {
        if (m()) {
            this.f4259B = 0L;
            this.f4260C = 0L;
            this.f4261D = 0L;
            this.f4262E = 0L;
            this.f4288c0 = false;
            this.f4263F = 0;
            this.f4308x = new E(g().f4249a, g().f4250b, 0L, 0L);
            this.f4266I = 0L;
            this.f4307w = null;
            this.f4295j.clear();
            this.f4269M = null;
            this.f4270N = 0;
            this.f4271O = null;
            this.f4276T = false;
            this.f4275S = false;
            this.f4274R = -1;
            this.f4310z = null;
            this.f4258A = 0;
            this.f4290e.f4383o = 0L;
            int i5 = 0;
            while (true) {
                InterfaceC0532m[] interfaceC0532mArr = this.f4268K;
                if (i5 >= interfaceC0532mArr.length) {
                    break;
                }
                InterfaceC0532m interfaceC0532m = interfaceC0532mArr[i5];
                interfaceC0532m.flush();
                this.L[i5] = interfaceC0532m.c();
                i5++;
            }
            AudioTrack audioTrack = this.f4294i.f4462c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f4305u.pause();
            }
            if (n(this.f4305u)) {
                b7.k kVar = this.f4297m;
                kVar.getClass();
                this.f4305u.unregisterStreamEventCallback((F) kVar.f19397c);
                ((Handler) kVar.f19396b).removeCallbacksAndMessages(null);
            }
            if (u6.v.f46721a < 21 && !this.f4278V) {
                this.f4279W = 0;
            }
            D d3 = this.f4303s;
            if (d3 != null) {
                this.f4304t = d3;
                this.f4303s = null;
            }
            w wVar = this.f4294i;
            wVar.f4470l = 0L;
            wVar.f4481w = 0;
            wVar.f4480v = 0;
            wVar.f4471m = 0L;
            wVar.f4456C = 0L;
            wVar.f4459F = 0L;
            wVar.k = false;
            wVar.f4462c = null;
            wVar.f4465f = null;
            AudioTrack audioTrack2 = this.f4305u;
            C4026b c4026b = this.f4293h;
            c4026b.b();
            synchronized (f4255d0) {
                try {
                    if (f4256e0 == null) {
                        f4256e0 = Executors.newSingleThreadExecutor(new Q1.w("ExoPlayer:AudioTrackReleaseThread", 1));
                    }
                    f4257f0++;
                    f4256e0.execute(new C8.d(10, audioTrack2, c4026b));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f4305u = null;
        }
        this.f4299o.f272c = null;
        this.f4298n.f272c = null;
    }

    public final int f(T t10) {
        if ("audio/raw".equals(t10.f3238l)) {
            int i5 = t10.f3222A;
            if (!u6.v.w(i5)) {
                AbstractC0279p0.u(i5, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i5 != 2 && (!this.f4287c || i5 != 4)) {
                return 1;
            }
        } else if ((this.f4286b0 || !u(t10, this.f4306v)) && this.f4283a.a(t10) == null) {
            return 0;
        }
        return 2;
    }

    public final E g() {
        E e7 = this.f4307w;
        if (e7 != null) {
            return e7;
        }
        ArrayDeque arrayDeque = this.f4295j;
        return !arrayDeque.isEmpty() ? (E) arrayDeque.getLast() : this.f4308x;
    }

    public final long h() {
        return this.f4304t.f4242c == 0 ? this.f4259B / r0.f4241b : this.f4260C;
    }

    public final long i() {
        return this.f4304t.f4242c == 0 ? this.f4261D / r0.f4243d : this.f4262E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x02dc, code lost:
    
        if (r14 == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0105, code lost:
    
        if (r11.a() == 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(long r27, int r29, java.nio.ByteBuffer r30) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.G.j(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean k() {
        return m() && this.f4294i.b(i());
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l() throws G5.r {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.G.l():boolean");
    }

    public final boolean m() {
        return this.f4305u != null;
    }

    public final void o() {
        if (this.f4276T) {
            return;
        }
        this.f4276T = true;
        long jI = i();
        w wVar = this.f4294i;
        wVar.f4484z = wVar.a();
        wVar.f4482x = SystemClock.elapsedRealtime() * 1000;
        wVar.f4454A = jI;
        this.f4305u.stop();
        this.f4258A = 0;
    }

    public final void p(long j8) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.f4268K.length;
        int i5 = length;
        while (i5 >= 0) {
            if (i5 > 0) {
                byteBuffer = this.L[i5 - 1];
            } else {
                byteBuffer = this.f4269M;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC0532m.f4426a;
                }
            }
            if (i5 == length) {
                v(byteBuffer, j8);
            } else {
                InterfaceC0532m interfaceC0532m = this.f4268K[i5];
                if (i5 > this.f4274R) {
                    interfaceC0532m.d(byteBuffer);
                }
                ByteBuffer byteBufferC = interfaceC0532m.c();
                this.L[i5] = byteBufferC;
                if (byteBufferC.hasRemaining()) {
                    i5++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i5--;
            }
        }
    }

    public final void q() {
        d();
        for (InterfaceC0532m interfaceC0532m : this.f4291f) {
            interfaceC0532m.reset();
        }
        for (InterfaceC0532m interfaceC0532m2 : this.f4292g) {
            interfaceC0532m2.reset();
        }
        this.f4277U = false;
        this.f4286b0 = false;
    }

    public final void r(r0 r0Var, boolean z2) {
        E eG = g();
        if (r0Var.equals(eG.f4249a) && z2 == eG.f4250b) {
            return;
        }
        E e7 = new E(r0Var, z2, -9223372036854775807L, -9223372036854775807L);
        if (m()) {
            this.f4307w = e7;
        } else {
            this.f4308x = e7;
        }
    }

    public final void s(r0 r0Var) {
        if (m()) {
            try {
                this.f4305u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(r0Var.f3535a).setPitch(r0Var.f3536b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e7) {
                AbstractC4256a.D(e7, "DefaultAudioSink", "Failed to set playback params");
            }
            r0Var = new r0(this.f4305u.getPlaybackParams().getSpeed(), this.f4305u.getPlaybackParams().getPitch());
            float f10 = r0Var.f3535a;
            w wVar = this.f4294i;
            wVar.f4469j = f10;
            v vVar = wVar.f4465f;
            if (vVar != null) {
                vVar.a();
            }
        }
        this.f4309y = r0Var;
    }

    public final boolean t() {
        if (this.f4282Z || !"audio/raw".equals(this.f4304t.f4240a.f3238l)) {
            return false;
        }
        int i5 = this.f4304t.f4240a.f3222A;
        if (!this.f4287c) {
            return true;
        }
        int i10 = u6.v.f46721a;
        return (i5 == 536870912 || i5 == 805306368 || i5 == 4) ? false : true;
    }

    public final boolean u(T t10, C0527h c0527h) {
        int i5;
        int iK;
        int i10 = u6.v.f46721a;
        if (i10 >= 29 && (i5 = this.f4296l) != 0) {
            String str = t10.f3238l;
            str.getClass();
            int iA = u6.k.a(str, t10.f3236i);
            if (iA != 0 && (iK = u6.v.k(t10.f3251y)) != 0) {
                AudioFormat audioFormatE = e(t10.f3252z, iK, iA);
                AudioAttributes audioAttributes = (AudioAttributes) c0527h.a().f152b;
                int playbackOffloadSupport = i10 >= 31 ? AudioManager.getPlaybackOffloadSupport(audioFormatE, audioAttributes) : !AudioManager.isOffloadedPlaybackSupported(audioFormatE, audioAttributes) ? 0 : (i10 == 30 && u6.v.f46724d.startsWith("Pixel")) ? 2 : 1;
                if (playbackOffloadSupport != 0) {
                    if (playbackOffloadSupport == 1) {
                        boolean z2 = (t10.f3223B == 0 && t10.f3224C == 0) ? false : true;
                        boolean z10 = i5 == 1;
                        if (!z2 || !z10) {
                        }
                    } else if (playbackOffloadSupport != 2) {
                        throw new IllegalStateException();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void v(ByteBuffer byteBuffer, long j8) throws Exception {
        ByteBuffer byteBuffer2;
        int iWrite;
        int iWrite2;
        C4552j c4552j;
        E5.K k;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.f4271O;
            if (byteBuffer3 != null) {
                AbstractC4256a.e(byteBuffer3 == byteBuffer);
            } else {
                this.f4271O = byteBuffer;
                if (u6.v.f46721a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f4272P;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f4272P = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f4272P, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f4273Q = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i5 = u6.v.f46721a;
            if (i5 < 21) {
                long j10 = this.f4261D;
                w wVar = this.f4294i;
                int iA = wVar.f4464e - ((int) (j10 - (wVar.a() * wVar.f4463d)));
                if (iA > 0) {
                    iWrite = this.f4305u.write(this.f4272P, this.f4273Q, Math.min(iRemaining2, iA));
                    if (iWrite > 0) {
                        this.f4273Q += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
                byteBuffer2 = byteBuffer;
            } else if (this.f4282Z) {
                AbstractC4256a.i(j8 != -9223372036854775807L);
                AudioTrack audioTrack = this.f4305u;
                if (i5 >= 26) {
                    byteBuffer2 = byteBuffer;
                    iWrite2 = audioTrack.write(byteBuffer2, iRemaining2, 1, j8 * 1000);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.f4310z == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.f4310z = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.f4310z.putInt(1431633921);
                    }
                    if (this.f4258A == 0) {
                        this.f4310z.putInt(4, iRemaining2);
                        this.f4310z.putLong(8, j8 * 1000);
                        this.f4310z.position(0);
                        this.f4258A = iRemaining2;
                    }
                    int iRemaining3 = this.f4310z.remaining();
                    if (iRemaining3 > 0) {
                        iWrite = audioTrack.write(this.f4310z, iRemaining3, 1);
                        if (iWrite < 0) {
                            this.f4258A = 0;
                        } else if (iWrite < iRemaining3) {
                            iWrite = 0;
                        }
                    }
                    iWrite2 = audioTrack.write(byteBuffer2, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.f4258A = 0;
                    } else {
                        this.f4258A -= iWrite2;
                    }
                }
                iWrite = iWrite2;
            } else {
                byteBuffer2 = byteBuffer;
                iWrite = this.f4305u.write(byteBuffer2, iRemaining2, 1);
            }
            this.f4284a0 = SystemClock.elapsedRealtime();
            A2.d dVar = this.f4299o;
            if (iWrite < 0) {
                s sVar = new s(iWrite, this.f4304t.f4240a, ((i5 >= 24 && iWrite == -6) || iWrite == -32) && this.f4262E > 0);
                C4552j c4552j2 = this.f4302r;
                if (c4552j2 != null) {
                    c4552j2.n(sVar);
                }
                if (sVar.f4440b) {
                    throw sVar;
                }
                dVar.P(sVar);
                return;
            }
            dVar.f272c = null;
            if (n(this.f4305u)) {
                if (this.f4262E > 0) {
                    this.f4288c0 = false;
                }
                if (this.f4277U && (c4552j = this.f4302r) != null && iWrite < iRemaining2 && !this.f4288c0 && (k = ((K) c4552j.f48001b).f4323O0) != null) {
                    k.f3128a.f3155G = true;
                }
            }
            int i10 = this.f4304t.f4242c;
            if (i10 == 0) {
                this.f4261D += iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i10 != 0) {
                    AbstractC4256a.i(byteBuffer2 == this.f4269M);
                    this.f4262E = (this.f4263F * this.f4270N) + this.f4262E;
                }
                this.f4271O = null;
            }
        }
    }
}
