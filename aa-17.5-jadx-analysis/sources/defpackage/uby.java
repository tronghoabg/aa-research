package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
final class uby extends ubi {
    public yfq C;
    public yfq D;
    public int E;
    public int F;
    private uin K;
    private float N;
    private float O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private double T;
    private boolean V;
    private int W;
    private int X;
    private int Y;
    public ubm q;
    public ubm r;
    public ubm s;
    public uim t;
    public tpv u;
    public boolean v;
    public float w;
    public float x;
    public volatile boolean y;
    public volatile boolean z;
    private final Object G = new Object();
    public final Object o = new Object();
    public final uew p = new uew();
    private final uew H = new uew();
    private final uew I = new uew();
    private volatile float J = BitmapDescriptorFactory.HUE_RED;
    private final tpf L = new tpf();
    private final tpf M = new tpf();
    public float A = 1.0f;
    public float B = 1.0f;
    private float S = BitmapDescriptorFactory.HUE_RED;
    private final tpf U = new tpf();

    static int J(int i) {
        char c = '\r';
        switch (i - 1) {
            case 0:
                c = '\n';
                break;
            case 1:
            case 2:
            case 3:
                c = '\t';
                break;
            case 4:
                c = 11;
                break;
            case 5:
            case 6:
            case 7:
                c = 6;
                break;
            case 8:
            case 9:
            case 10:
                c = 7;
                break;
            case 11:
                c = 14;
                break;
            case 12:
            case 13:
            case 14:
                break;
            default:
                c = 15;
                break;
        }
        uin uinVar = uin.a[c];
        if (uinVar == null) {
            return 4;
        }
        switch (uinVar.c) {
            case 5:
                return 1;
            case 6:
                return 5;
            case 7:
                return 3;
            case 8:
            case 12:
            default:
                throw new IllegalArgumentException("Unknown position");
            case 9:
                return 2;
            case 10:
                return 9;
            case 11:
                return 8;
            case 13:
                return 4;
            case 14:
                return 7;
            case 15:
                return 6;
        }
    }

    private final void L(float f) {
        int i;
        int i2;
        if (this.S == f && this.W == this.E && this.X == this.F) {
            return;
        }
        this.S = f;
        this.W = this.E;
        this.X = this.F;
        int iC = (int) (this.q.c() * f);
        int iA = (int) (this.q.a() * f);
        this.p.h(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.0d, iC / 2.0f, iA / 2.0f);
        ubm ubmVar = this.r;
        if (ubmVar != null) {
            float fC = ubmVar.c() * f;
            float fA = ubmVar.a() * f;
            int i3 = (int) (this.N * f);
            i = iC;
            i2 = iA;
            Q((int) fC, (int) fA, i, i2, i3, this.E, ubmVar.j, this.H);
        } else {
            i = iC;
            i2 = iA;
        }
        ubm ubmVar2 = this.s;
        if (ubmVar2 != null) {
            float fC2 = ubmVar2.c() * f;
            float fA2 = ubmVar2.a() * f;
            int i4 = (int) (this.O * f);
            Q((int) fC2, (int) fA2, i, i2, i4, this.F, ubmVar2.j, this.I);
        }
        synchronized (this.G) {
            if (this.r != null) {
                tpf tpfVar = this.L;
                tpf tpfVar2 = this.H.a;
                tpfVar.n(tpfVar2.b / f, tpfVar2.c / f);
            }
            if (this.s != null) {
                tpf tpfVar3 = this.M;
                tpf tpfVar4 = this.I.a;
                tpfVar3.n(tpfVar4.b / f, tpfVar4.c / f);
            }
        }
    }

    private final void M(float f, float f2, float f3, float f4, float f5, tpf tpfVar, tpf tpfVar2) {
        float fA = this.K.a() * f5;
        float fB = this.K.b() * f5;
        float f6 = ((fA * f) / 2.0f) + (f3 * f5);
        float f7 = tpfVar.b;
        float f8 = tpfVar.c;
        float f9 = ((fB * f2) / 2.0f) + (f4 * f5);
        tpfVar2.n((f6 * f7) + (f9 * (-f8)), (f6 * f8) + (f7 * f9));
    }

    private final boolean N() {
        if (this.Q) {
            return false;
        }
        int i = this.q.j;
        ubm ubmVar = this.r;
        boolean z = ubmVar == null || (this.E == 1 && ubmVar.j == 1);
        ubm ubmVar2 = this.s;
        return i == 1 && z && (ubmVar2 == null || (this.F == 1 && ubmVar2.j == 1));
    }

    private final boolean O() {
        ubm ubmVar = this.q;
        if ((ubmVar.e.size() != 1 || ubmVar.i != 2) && this.Y != 3) {
            return false;
        }
        ubm ubmVar2 = this.r;
        if (ubmVar2 != null && !ubmVar2.j()) {
            return false;
        }
        ubm ubmVar3 = this.s;
        return ubmVar3 == null || ubmVar3.j();
    }

    private static final double P(ttn ttnVar, ubx ubxVar) {
        float f;
        uim uimVar = ubxVar.a;
        if (uimVar.b()) {
            int i = uimVar.c;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                f = uimVar.b;
            } else {
                if (i2 != 1) {
                    throw new RuntimeException(null, null);
                }
                f = ttnVar.n + uimVar.b;
            }
        } else {
            f = ttnVar.n;
        }
        return f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void Q(int i, int i2, int i3, int i4, int i5, int i6, int i7, uew uewVar) {
        int i8;
        int i9;
        if (i6 == 0) {
            throw null;
        }
        int i10 = (i3 + i) / 2;
        int i11 = (i4 + i2) / 2;
        int i12 = 0;
        switch (i6 - 1) {
            case 0:
                i8 = 0;
                break;
            case 1:
                i8 = (-i11) - i5;
                break;
            case 2:
                i8 = 0;
                i12 = i10 + i5;
                break;
            case 3:
                i8 = i11 + i5;
                break;
            case 4:
                i9 = (-i10) - i5;
                int i13 = i12;
                i12 = i9;
                i8 = i13;
                break;
            case 5:
                i12 = i11 + i5;
                i9 = i10 + i5;
                int i132 = i12;
                i12 = i9;
                i8 = i132;
                break;
            case 6:
                i12 = i11 + i5;
                i9 = (-i10) - i5;
                int i1322 = i12;
                i12 = i9;
                i8 = i1322;
                break;
            case 7:
                i12 = i10 + i5;
                i8 = (-i11) - i5;
                break;
            default:
                i12 = (-i11) - i5;
                i9 = (-i10) - i5;
                int i13222 = i12;
                i12 = i9;
                i8 = i13222;
                break;
        }
        if (i6 == 4 || i6 == 2) {
            if (i7 == 0) {
                throw null;
            }
            if (i7 == 2) {
                i12 = ((i - i3) / 2) - 10;
            } else if (i7 == 3) {
                i12 = ((i3 - i) / 2) + 10;
            }
        }
        uewVar.h(i12, i8, 0.0d, i / 2.0f, i2 / 2.0f);
    }

    private final double R(usy usyVar, float f, float f2, ubx ubxVar, too tooVar, float[] fArr, tpf tpfVar) {
        ttn ttnVarO = usyVar.o();
        float f3 = ttnVarO.m;
        uim uimVar = ubxVar.a;
        boolean z = uimVar.b() && uimVar.c == 2;
        if (uimVar.b()) {
            if ((f3 > -1.0E-4f && f3 < 1.0E-4f) || z) {
                double dP = P(ttnVarO, ubxVar) - ttnVarO.n;
                if (N()) {
                    dP = (((dP + 360.0d) + 90.0d) % 180.0d) - 90.0d;
                }
                double radians = Math.toRadians(dP);
                tpfVar.b = (float) Math.cos(radians);
                tpfVar.c = (float) Math.sin(radians);
                return radians;
            }
            float f4 = -uimVar.b;
            float f5 = ttnVarO.l;
            double radians2 = Math.toRadians(f4);
            double dA = ton.a(f5) * 100.0f;
            double dCos = Math.cos(radians2) * dA;
            double dSin = dA * Math.sin(radians2);
            too tooVar2 = uimVar.a;
            tooVar.r(tooVar2.a + ((int) dCos), tooVar2.b + ((int) dSin));
            if (tsw.l(usyVar, tooVar, fArr, true)) {
                float f6 = fArr[0] - f;
                tpfVar.b = f6;
                tpfVar.c = fArr[1] - f2;
                if (f6 < BitmapDescriptorFactory.HUE_RED && N()) {
                    tpfVar.b = -tpfVar.b;
                    tpfVar.c = -tpfVar.c;
                }
                tpf.k(tpfVar, tpfVar);
                return Math.atan2(tpfVar.c, tpfVar.b);
            }
        }
        tpfVar.b = 1.0f;
        tpfVar.c = BitmapDescriptorFactory.HUE_RED;
        return 0.0d;
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final boolean C() {
        return (f() == null || this.y) ? false : true;
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final boolean D() {
        return (g() == null || this.z) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d A[Catch: all -> 0x008a, TryCatch #0 {, blocks: (B:6:0x0009, B:7:0x000b, B:9:0x0010, B:11:0x0018, B:12:0x001a, B:14:0x0020, B:15:0x0022, B:16:0x0027, B:18:0x002d, B:19:0x0031, B:21:0x0035, B:22:0x0039, B:24:0x003d, B:25:0x0045, B:27:0x0049, B:28:0x0051, B:30:0x0055, B:32:0x0059, B:33:0x005b, B:37:0x0066, B:39:0x006c, B:41:0x0070, B:43:0x0074, B:44:0x0076, B:47:0x007f, B:50:0x0084, B:51:0x0088), top: B:56:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035 A[Catch: all -> 0x008a, TryCatch #0 {, blocks: (B:6:0x0009, B:7:0x000b, B:9:0x0010, B:11:0x0018, B:12:0x001a, B:14:0x0020, B:15:0x0022, B:16:0x0027, B:18:0x002d, B:19:0x0031, B:21:0x0035, B:22:0x0039, B:24:0x003d, B:25:0x0045, B:27:0x0049, B:28:0x0051, B:30:0x0055, B:32:0x0059, B:33:0x005b, B:37:0x0066, B:39:0x006c, B:41:0x0070, B:43:0x0074, B:44:0x0076, B:47:0x007f, B:50:0x0084, B:51:0x0088), top: B:56:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d A[Catch: all -> 0x008a, TryCatch #0 {, blocks: (B:6:0x0009, B:7:0x000b, B:9:0x0010, B:11:0x0018, B:12:0x001a, B:14:0x0020, B:15:0x0022, B:16:0x0027, B:18:0x002d, B:19:0x0031, B:21:0x0035, B:22:0x0039, B:24:0x003d, B:25:0x0045, B:27:0x0049, B:28:0x0051, B:30:0x0055, B:32:0x0059, B:33:0x005b, B:37:0x0066, B:39:0x006c, B:41:0x0070, B:43:0x0074, B:44:0x0076, B:47:0x007f, B:50:0x0084, B:51:0x0088), top: B:56:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049 A[Catch: all -> 0x008a, TryCatch #0 {, blocks: (B:6:0x0009, B:7:0x000b, B:9:0x0010, B:11:0x0018, B:12:0x001a, B:14:0x0020, B:15:0x0022, B:16:0x0027, B:18:0x002d, B:19:0x0031, B:21:0x0035, B:22:0x0039, B:24:0x003d, B:25:0x0045, B:27:0x0049, B:28:0x0051, B:30:0x0055, B:32:0x0059, B:33:0x005b, B:37:0x0066, B:39:0x006c, B:41:0x0070, B:43:0x0074, B:44:0x0076, B:47:0x007f, B:50:0x0084, B:51:0x0088), top: B:56:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055 A[Catch: all -> 0x008a, TryCatch #0 {, blocks: (B:6:0x0009, B:7:0x000b, B:9:0x0010, B:11:0x0018, B:12:0x001a, B:14:0x0020, B:15:0x0022, B:16:0x0027, B:18:0x002d, B:19:0x0031, B:21:0x0035, B:22:0x0039, B:24:0x003d, B:25:0x0045, B:27:0x0049, B:28:0x0051, B:30:0x0055, B:32:0x0059, B:33:0x005b, B:37:0x0066, B:39:0x006c, B:41:0x0070, B:43:0x0074, B:44:0x0076, B:47:0x007f, B:50:0x0084, B:51:0x0088), top: B:56:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010 A[Catch: all -> 0x008a, TryCatch #0 {, blocks: (B:6:0x0009, B:7:0x000b, B:9:0x0010, B:11:0x0018, B:12:0x001a, B:14:0x0020, B:15:0x0022, B:16:0x0027, B:18:0x002d, B:19:0x0031, B:21:0x0035, B:22:0x0039, B:24:0x003d, B:25:0x0045, B:27:0x0049, B:28:0x0051, B:30:0x0055, B:32:0x0059, B:33:0x005b, B:37:0x0066, B:39:0x006c, B:41:0x0070, B:43:0x0074, B:44:0x0076, B:47:0x007f, B:50:0x0084, B:51:0x0088), top: B:56:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void G(defpackage.tqx r7, boolean r8) {
        /*
            r6 = this;
            defpackage.vaq.d()
            java.lang.Object r0 = r6.o
            monitor-enter(r0)
            r1 = 1
            if (r8 == 0) goto Lb
            r6.v = r1     // Catch: java.lang.Throwable -> L8a
        Lb:
            int r8 = r7.b     // Catch: java.lang.Throwable -> L8a
            r8 = r8 & r1
            if (r8 == 0) goto L27
            uim r8 = r6.t     // Catch: java.lang.Throwable -> L8a
            too r8 = r8.a     // Catch: java.lang.Throwable -> L8a
            aaih r2 = r7.c     // Catch: java.lang.Throwable -> L8a
            if (r2 != 0) goto L1a
            aaih r2 = defpackage.aaih.a     // Catch: java.lang.Throwable -> L8a
        L1a:
            double r2 = r2.d     // Catch: java.lang.Throwable -> L8a
            aaih r4 = r7.c     // Catch: java.lang.Throwable -> L8a
            if (r4 != 0) goto L22
            aaih r4 = defpackage.aaih.a     // Catch: java.lang.Throwable -> L8a
        L22:
            double r4 = r4.c     // Catch: java.lang.Throwable -> L8a
            r8.t(r2, r4)     // Catch: java.lang.Throwable -> L8a
        L27:
            int r8 = r7.b     // Catch: java.lang.Throwable -> L8a
            r2 = r8 & 2
            if (r2 == 0) goto L31
            float r2 = r7.d     // Catch: java.lang.Throwable -> L8a
            r6.A = r2     // Catch: java.lang.Throwable -> L8a
        L31:
            r2 = r8 & 4
            if (r2 == 0) goto L39
            float r2 = r7.e     // Catch: java.lang.Throwable -> L8a
            r6.B = r2     // Catch: java.lang.Throwable -> L8a
        L39:
            r2 = r8 & 16
            if (r2 == 0) goto L45
            int r2 = r7.g     // Catch: java.lang.Throwable -> L8a
            float r2 = defpackage.uqw.s(r2)     // Catch: java.lang.Throwable -> L8a
            r6.w = r2     // Catch: java.lang.Throwable -> L8a
        L45:
            r2 = r8 & 32
            if (r2 == 0) goto L51
            int r2 = r7.h     // Catch: java.lang.Throwable -> L8a
            float r2 = defpackage.uqw.s(r2)     // Catch: java.lang.Throwable -> L8a
            r6.x = r2     // Catch: java.lang.Throwable -> L8a
        L51:
            r8 = r8 & 8
            if (r8 == 0) goto L88
            tqw r8 = r7.f     // Catch: java.lang.Throwable -> L8a
            if (r8 != 0) goto L5b
            tqw r8 = defpackage.tqw.a     // Catch: java.lang.Throwable -> L8a
        L5b:
            int r8 = r8.d     // Catch: java.lang.Throwable -> L8a
            int r8 = defpackage.a.ap(r8)     // Catch: java.lang.Throwable -> L8a
            if (r8 != 0) goto L64
            goto L88
        L64:
            if (r8 == r1) goto L88
            uim r6 = r6.t     // Catch: java.lang.Throwable -> L8a
            tqw r7 = r7.f     // Catch: java.lang.Throwable -> L8a
            if (r7 != 0) goto L6f
            tqw r8 = defpackage.tqw.a     // Catch: java.lang.Throwable -> L8a
            goto L70
        L6f:
            r8 = r7
        L70:
            float r8 = r8.c     // Catch: java.lang.Throwable -> L8a
            if (r7 != 0) goto L76
            tqw r7 = defpackage.tqw.a     // Catch: java.lang.Throwable -> L8a
        L76:
            int r7 = r7.d     // Catch: java.lang.Throwable -> L8a
            int r7 = defpackage.a.ap(r7)     // Catch: java.lang.Throwable -> L8a
            if (r7 != 0) goto L7f
            r7 = r1
        L7f:
            int r7 = r7 + (-1)
            if (r7 == r1) goto L84
            r1 = 2
        L84:
            r6.c = r1     // Catch: java.lang.Throwable -> L8a
            r6.b = r8     // Catch: java.lang.Throwable -> L8a
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8a
            return
        L8a:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uby.G(tqx, boolean):void");
    }

    final void H(int i) {
        ubm ubmVar = this.r;
        if (ubmVar != null) {
            ubmVar.l(i);
        }
    }

    final void I(int i) {
        ubm ubmVar = this.s;
        if (ubmVar != null) {
            ubmVar.l(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(defpackage.udx r2, defpackage.ujf r3, int r4, defpackage.uim r5, defpackage.ubm r6, defpackage.uin r7, defpackage.ubm r8, defpackage.ubm r9, int r10, int r11, boolean r12, boolean r13, defpackage.utf r14, defpackage.ueu r15, defpackage.tpv r16, defpackage.yfq r17, defpackage.yfq r18) {
        /*
            r1 = this;
            r0 = r15
            super.F(r2, r4, r14, r15)
            r1.t = r5
            r1.q = r6
            r1.K = r7
            r1.r = r8
            r1.s = r9
            r1.E = r10
            r1.F = r11
            r1.P = r12
            boolean r4 = r2.aa()
            r1.Q = r4
            r1.R = r13
            r4 = r16
            r1.u = r4
            r4 = r17
            r1.C = r4
            r4 = r18
            r1.D = r4
            r4 = 1
            r5 = 0
            if (r8 == 0) goto L2e
            r6 = r4
            goto L2f
        L2e:
            r6 = r5
        L2f:
            r1.y = r6
            if (r9 == 0) goto L34
            goto L35
        L34:
            r4 = r5
        L35:
            r1.z = r4
            r1.v = r5
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.A = r4
            r1.B = r4
            r4 = 2
            r5 = 0
            if (r3 == 0) goto L5a
            float r6 = r3.A
            r1.w = r6
            float r6 = r3.B
            r1.x = r6
            float r6 = r3.C
            r1.N = r6
            boolean r6 = r3.o()
            if (r6 == 0) goto L60
            int r3 = r3.R
            r1.Y = r3
            goto L62
        L5a:
            r1.w = r5
            r1.x = r5
            r1.N = r5
        L60:
            r1.Y = r4
        L62:
            abjt r2 = r2.p()
            if (r2 == 0) goto L6e
            int r2 = r2.d
            float r2 = (float) r2
            r1.O = r2
            return
        L6e:
            r1.O = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uby.K(udx, ujf, int, uim, ubm, uin, ubm, ubm, int, int, boolean, boolean, utf, ueu, tpv, yfq, yfq):void");
    }

    @Override // defpackage.ubf
    public final float b() {
        return this.J;
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final long c(ube ubeVar) {
        return Math.max(0L, 0L);
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final tpv d() {
        return this.u;
    }

    @Override // defpackage.ubf
    public final uew e() {
        return this.p;
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final uew f() {
        if (this.r != null) {
            return this.H;
        }
        return null;
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final uew g() {
        if (this.s != null) {
            return this.I;
        }
        return null;
    }

    @Override // defpackage.ubi
    protected final void h() {
        this.q.e();
        ubm ubmVar = this.r;
        if (ubmVar != null) {
            ubmVar.e();
        }
        ubm ubmVar2 = this.s;
        if (ubmVar2 != null) {
            ubmVar2.e();
        }
        int i = yfq.d;
        yfq yfqVar = yls.a;
        this.C = yfqVar;
        this.D = yfqVar;
        this.E = 0;
        this.P = false;
        this.y = false;
        this.z = false;
        this.v = false;
        this.J = BitmapDescriptorFactory.HUE_RED;
        this.A = 1.0f;
        this.S = BitmapDescriptorFactory.HUE_RED;
        this.W = 0;
        this.X = 0;
        this.B = 1.0f;
        super.h();
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final void i() {
        if (this.q.i()) {
            if ((this.r == null || !this.y || this.r.i()) && this.s != null && this.z) {
                this.s.i();
            }
        }
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final void j(boolean z) {
        this.y = z;
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final void k(boolean z) {
        this.z = z;
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final void l(ubf ubfVar, float f) {
        ubm ubmVar;
        ubm ubmVar2;
        if (ubfVar instanceof uby) {
            uby ubyVar = (uby) ubfVar;
            this.q.o(ubyVar.q, this.n);
            ubm ubmVar3 = this.r;
            if (ubmVar3 != null && (ubmVar2 = ubyVar.r) != null) {
                ubmVar3.o(ubmVar2, this.n);
            }
            ubm ubmVar4 = this.s;
            if (ubmVar4 == null || (ubmVar = ubyVar.s) == null) {
                return;
            }
            ubmVar4.o(ubmVar, this.n);
        }
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final boolean m() {
        if (this.q.f) {
            return true;
        }
        ubm ubmVar = this.r;
        if (ubmVar != null && ubmVar.f) {
            return true;
        }
        ubm ubmVar2 = this.s;
        return ubmVar2 != null && ubmVar2.f;
    }

    @Override // defpackage.ubi, defpackage.ubf
    public final boolean o() {
        return this.P;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ubi, defpackage.ump
    @ResultIgnorabilityUnspecified
    public final int p(umk umkVar, boolean z, too tooVar) {
        tpv tpvVar;
        vaq.d();
        if (!this.P) {
            return 1;
        }
        if (this.b.ae() && (tpvVar = this.u) != null && !tpvVar.a()) {
            return 1;
        }
        synchronized (this.o) {
            tooVar.A(this.t.a);
        }
        ubk ubkVar = (ubk) this.q.g.get();
        if (ubkVar.b()) {
            float f = ubkVar.g;
            yfq yfqVar = ubkVar.d;
            int size = yfqVar.size();
            for (int i = 0; i < size; i++) {
                tpf tpfVar = (tpf) yfqVar.get(i);
                uwk uwkVar = (uwk) ubkVar.a.get(i);
                tpf tpfVar2 = ubkVar.e;
                if (umkVar.b(tpfVar2.b + (tpfVar.b * f), tpfVar2.c + (tpfVar.c * f), ubkVar.f, uwkVar.a * f, uwkVar.b * f)) {
                    return 2;
                }
            }
        }
        if (this.r != null && this.y && z && this.r.h(umkVar)) {
            return 3;
        }
        return (this.s != null && this.z && this.s.h(umkVar)) ? 4 : 1;
    }

    @Override // defpackage.ubf
    public final void q(udc udcVar, usy usyVar) {
        float f = usyVar.o().l;
        this.V = true;
        if (f >= this.l || this.b.aj()) {
            ubx ubxVar = udcVar.i;
            ubxVar.a(this);
            ubk ubkVarD = this.q.d();
            float[] fArr = udcVar.g;
            float f2 = ubxVar.e;
            float f3 = ubxVar.f;
            too tooVar = ubxVar.a.a;
            if (!tsw.l(usyVar, tooVar, fArr, true)) {
                this.V = false;
                return;
            }
            float f4 = fArr[0];
            float f5 = fArr[1];
            if (O()) {
                this.T = Math.toRadians(P(usyVar.o(), ubxVar));
                this.q.g(f4, f5);
                return;
            }
            float fG = ubxVar.b * tsw.g(usyVar, tooVar);
            tpf tpfVar = udcVar.c;
            too tooVar2 = udcVar.f;
            tpf tpfVar2 = this.U;
            this.T = R(usyVar, f4, f5, ubxVar, tooVar2, fArr, tpfVar2);
            M(ubkVarD.h, ubkVarD.i, f2, f3, fG, tpfVar2, tpfVar);
            float f6 = tpfVar.b + f4;
            float f7 = f5 + tpfVar.c;
            this.q.g(f6, f7);
            synchronized (this.G) {
                if (this.r != null && this.y) {
                    tpf tpfVar3 = udcVar.d;
                    tpf.e(this.L, tpfVar2, tpfVar3);
                    tpfVar3.m(fG);
                    float f8 = tpfVar3.b;
                    float f9 = tpfVar3.c;
                    ubm ubmVar = this.r;
                    ubmVar.getClass();
                    ubmVar.g(f8 + f6, f9 + f7);
                }
                if (this.s != null && this.z) {
                    tpf tpfVar4 = udcVar.e;
                    tpf.e(this.M, tpfVar2, tpfVar4);
                    tpfVar4.m(fG);
                    float f10 = tpfVar4.b;
                    float f11 = tpfVar4.c;
                    ubm ubmVar2 = this.s;
                    ubmVar2.getClass();
                    ubmVar2.g(f6 + f10, f7 + f11);
                }
            }
            this.J = this.q.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    @Override // defpackage.ubf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(defpackage.udc r50, defpackage.usy r51, com.google.android.libraries.geo.mapcore.renderer.LabelRenderer r52) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uby.r(udc, usy, com.google.android.libraries.geo.mapcore.renderer.LabelRenderer):boolean");
    }

    @Override // defpackage.ubf
    @ResultIgnorabilityUnspecified
    public final boolean s(udc udcVar, usy usyVar) {
        ubx ubxVar = udcVar.i;
        ubxVar.a(this);
        L(ubxVar.b);
        uim uimVar = ubxVar.a;
        too tooVar = uimVar.a;
        float[] fArr = udcVar.g;
        float f = ubxVar.e;
        float f2 = ubxVar.f;
        float f3 = ubxVar.b;
        if (!tsw.l(usyVar, tooVar, fArr, true)) {
            return false;
        }
        tpf tpfVar = udcVar.a;
        tpf tpfVar2 = udcVar.b;
        float f4 = f3;
        tpf tpfVar3 = udcVar.c;
        tpf tpfVar4 = udcVar.d;
        tpf tpfVar5 = udcVar.e;
        tpfVar.n(fArr[0], fArr[1]);
        if (!usyVar.z().j) {
            float fG = tsw.g(usyVar, tooVar) * f4;
            L(fG);
            f4 = fG;
        }
        if (!uimVar.b()) {
            float fC = this.q.c();
            float fA = this.q.a();
            float fA2 = this.K.a();
            float f5 = ((fA2 * f4) * fC) / 2.0f;
            tpfVar2.n(f5 + (f * f4), (((this.K.b() * f4) * fA) / 2.0f) + (f2 * f4));
            uew uewVar = this.p;
            tpf.p(tpfVar, uewVar.a, tpfVar);
            tpf.g(tpfVar, tpfVar2, tpfVar);
            uewVar.d(tpfVar);
            if (this.r != null) {
                this.H.d(tpfVar);
            }
            if (this.s == null) {
                return true;
            }
            this.I.d(tpfVar);
            return true;
        }
        double dR = R(usyVar, tpfVar.b, tpfVar.c, ubxVar, udcVar.f, fArr, tpfVar3);
        float f6 = f4;
        M(this.q.c(), this.q.a(), f, f2, f6, tpfVar3, tpfVar2);
        tpf.g(tpfVar, tpfVar2, tpfVar);
        uew uewVar2 = this.p;
        uewVar2.h(tpfVar.b, tpfVar.c, dR, uewVar2.b(), uewVar2.a());
        if (this.r != null) {
            tpf.e(this.L, tpfVar3, tpfVar4);
            tpfVar4.m(f6);
            tpf.g(tpfVar4, tpfVar, tpfVar4);
            uew uewVar3 = this.H;
            uewVar3.h(tpfVar4.b, tpfVar4.c, dR, uewVar3.b(), uewVar3.a());
        }
        if (this.s == null) {
            return true;
        }
        tpf.e(this.M, tpfVar3, tpfVar5);
        tpfVar5.m(f6);
        tpf.g(tpfVar5, tpfVar, tpfVar5);
        uew uewVar4 = this.I;
        uewVar4.h(tpfVar5.b, tpfVar5.c, dR, uewVar4.b(), uewVar4.a());
        return true;
    }
}
