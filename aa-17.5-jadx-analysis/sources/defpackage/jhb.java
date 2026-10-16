package defpackage;

import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.Surface;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class jhb extends jgs implements SurfaceTexture.OnFrameAvailableListener, jgz, jho {
    private static final yph L = yph.c("CAR.WM.WIN.GL");
    public volatile float D;
    ValueAnimator E;
    protected FloatBuffer F;
    public long G;
    public long H;
    final AtomicInteger I;
    volatile boolean J;
    protected final float[] K;
    private final boolean M;
    private volatile boolean N;
    private int O;
    private volatile SurfaceTexture P;
    private volatile Surface Q;
    private boolean R;
    private final Integer[] S;
    private final float[] T;
    private final AtomicInteger U;
    private final ydx V;
    private final AtomicReference W;
    private boolean X;
    private float[] Y;
    private final float[] Z;
    private final float[] aa;
    private final float[] ab;
    private final AtomicInteger ac;
    private final boolean ad;
    private int ae;
    private long af;
    private FloatBuffer ag;
    private final Runnable ah;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public jhb(defpackage.jkk r13, int r14, defpackage.jhe r15, com.google.android.gms.car.display.CarRegionId r16, java.util.UUID r17, android.content.ComponentName r18) {
        /*
            r12 = this;
            jis r8 = new jis
            java.lang.String r0 = r15.a()
            r8.<init>(r0)
            acvt r9 = defpackage.acvt.a
            acvu r0 = r9.gu()
            boolean r0 = r0.s()
            r10 = 1
            r11 = 0
            if (r0 == 0) goto L29
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L29
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r10
            goto L34
        L29:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r11
        L34:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r13 = 0
            r12.D = r13
            acrz r13 = defpackage.acrz.a
            acsa r13 = r13.gu()
            boolean r13 = r13.h()
            r12.M = r13
            r13 = r13 ^ r10
            r12.N = r13
            r12.O = r11
            r13 = 4
            java.lang.Integer[] r14 = new java.lang.Integer[r13]
            r12.S = r14
            r14 = 16
            float[] r15 = new float[r14]
            r12.T = r15
            r1 = -1
            r12.G = r1
            r12.H = r1
            java.util.concurrent.atomic.AtomicInteger r15 = new java.util.concurrent.atomic.AtomicInteger
            r15.<init>(r11)
            r12.I = r15
            java.util.concurrent.atomic.AtomicInteger r15 = new java.util.concurrent.atomic.AtomicInteger
            r15.<init>(r11)
            r12.U = r15
            acvu r15 = r9.gu()
            long r1 = r15.f()
            int r15 = (int) r1
            ydx r1 = new ydx
            r1.<init>(r15)
            r12.V = r1
            java.util.concurrent.atomic.AtomicReference r15 = new java.util.concurrent.atomic.AtomicReference
            r15.<init>()
            r12.W = r15
            r12.J = r11
            float[] r15 = new float[r14]
            r12.Y = r15
            float[] r15 = new float[r14]
            r12.K = r15
            float[] r14 = new float[r14]
            r12.Z = r14
            float[] r13 = new float[r13]
            r12.aa = r13
            r13 = 2
            float[] r14 = new float[r13]
            r12.ab = r14
            java.util.concurrent.atomic.AtomicInteger r14 = new java.util.concurrent.atomic.AtomicInteger
            r14.<init>(r11)
            r12.ac = r14
            acvu r14 = r9.gu()
            boolean r14 = r14.p()
            r12.ad = r14
            jgw r14 = new jgw
            r14.<init>(r12, r13)
            r12.ah = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhb.<init>(jkk, int, jhe, com.google.android.gms.car.display.CarRegionId, java.util.UUID, android.content.ComponentName):void");
    }

    private final int ba() {
        ProjectionWindowDecorationParams projectionWindowDecorationParams = this.j;
        return projectionWindowDecorationParams.h ? this.e.d : (this.e.d - projectionWindowDecorationParams.b) - projectionWindowDecorationParams.d;
    }

    private final int bb() {
        ProjectionWindowDecorationParams projectionWindowDecorationParams = this.j;
        return projectionWindowDecorationParams.h ? this.e.c : (this.e.c - projectionWindowDecorationParams.c) - projectionWindowDecorationParams.a;
    }

    private final jhg bc(boolean z) {
        float f;
        float fIntValue;
        float f2;
        ProjectionWindowDecorationParams projectionWindowDecorationParams = this.j;
        float[] fArr = new float[16];
        if (this.X) {
            fArr = this.Y;
        }
        jkk jkkVar = this.c;
        float f3 = fArr[12];
        float f4 = fArr[13];
        jhc jhcVar = ((ina) jkkVar).w;
        jhcVar.getClass();
        Integer[] numArr = this.S;
        int iIntValue = numArr[0].intValue();
        int i = jhcVar.b;
        int i2 = iIntValue + i;
        int iIntValue2 = numArr[1].intValue();
        int i3 = jhcVar.c;
        int iIntValue3 = numArr[2].intValue() + i;
        int iIntValue4 = numArr[3].intValue() + i3;
        float f5 = jhcVar.d;
        float fIntValue2 = iIntValue4;
        float fIntValue3 = iIntValue2 + i3;
        if (f5 > 1.0f) {
            float f6 = jhcVar.e;
            f3 *= f6;
            float fIntValue4 = numArr[0].intValue();
            float f7 = i;
            fIntValue = (numArr[2].intValue() * f6) + f7;
            f = (f6 * fIntValue4) + f7;
        } else {
            float f8 = iIntValue3;
            f = i2;
            if (f5 < 1.0f) {
                f4 *= f5;
                float f9 = i3;
                fIntValue2 = (numArr[3].intValue() * f5) + f9;
                fIntValue3 = f9 + (numArr[1].intValue() * f5);
            }
            fIntValue = f8;
        }
        if (z) {
            ProjectionWindowDecorationParams projectionWindowDecorationParams2 = this.j;
            if (!projectionWindowDecorationParams2.equals(ProjectionWindowDecorationParams.a()) && ((!projectionWindowDecorationParams2.h && !projectionWindowDecorationParams2.i) || !v().equals(b))) {
                if (f5 > 1.0f) {
                    float f10 = jhcVar.e;
                    f -= projectionWindowDecorationParams.a * f10;
                    f2 = f10 * projectionWindowDecorationParams.c;
                } else {
                    f -= projectionWindowDecorationParams.a;
                    f2 = projectionWindowDecorationParams.c;
                }
                fIntValue += f2;
                if (f5 < 1.0f) {
                    float f11 = jhcVar.e;
                    fIntValue3 -= projectionWindowDecorationParams.d * f11;
                    fIntValue2 += f11 * projectionWindowDecorationParams.b;
                } else {
                    fIntValue3 -= projectionWindowDecorationParams.d;
                    fIntValue2 += projectionWindowDecorationParams.b;
                }
            }
        }
        return new jhg(this, Math.max(f, f + f3), Math.min(fIntValue2, fIntValue2 + f4), Math.min(fIntValue, f3 + fIntValue), Math.max(fIntValue3, f4 + fIntValue3));
    }

    private final jhu bd(jhs jhsVar) {
        return jhsVar.f(this.I.get() > 0);
    }

    private final boolean be() {
        if (this.x) {
            TimeUnit.MILLISECONDS.getClass();
            return false;
        }
        if (!this.m && !aX()) {
            TimeUnit.MILLISECONDS.getClass();
            return false;
        }
        if (this.I.get() > 0) {
            return true;
        }
        TimeUnit.MILLISECONDS.getClass();
        return false;
    }

    private static boolean bf(jhs jhsVar) {
        return jhsVar != null && jhsVar.c() && jhsVar.d();
    }

    private final float[] bg(jhg jhgVar) {
        float f = this.e.a;
        float f2 = this.e.b;
        float f3 = this.e.f;
        float f4 = this.e.e;
        if (!this.j.h) {
            f += r4.a;
            f2 += r4.d;
            f3 -= r4.b;
            f4 -= r4.c;
        }
        float f5 = jhgVar.a;
        float f6 = jhgVar.d;
        float f7 = jhgVar.c;
        float f8 = jhgVar.b;
        float f9 = f5 - f;
        float fMin = Math.min(Math.max(f9 == BitmapDescriptorFactory.HUE_RED ? 0.0f : f9 / bb(), BitmapDescriptorFactory.HUE_RED), 1.0f);
        float f10 = f4 - f7;
        float fMin2 = Math.min(Math.max(1.0f - (f10 == BitmapDescriptorFactory.HUE_RED ? 0.0f : f10 / bb()), BitmapDescriptorFactory.HUE_RED), 1.0f);
        float f11 = f8 - f2;
        float fMin3 = Math.min(Math.max(f11 == BitmapDescriptorFactory.HUE_RED ? 0.0f : f11 / ba(), BitmapDescriptorFactory.HUE_RED), 1.0f);
        float f12 = f3 - f6;
        float fMin4 = Math.min(Math.max(1.0f - (f12 == BitmapDescriptorFactory.HUE_RED ? 0.0f : f12 / ba()), BitmapDescriptorFactory.HUE_RED), 1.0f);
        return new float[]{f5, f8, BitmapDescriptorFactory.HUE_RED, fMin, fMin3, f7, f8, BitmapDescriptorFactory.HUE_RED, fMin2, fMin3, f5, f6, BitmapDescriptorFactory.HUE_RED, fMin, fMin4, f7, f6, BitmapDescriptorFactory.HUE_RED, fMin2, fMin4};
    }

    private static final float bh(float f, int i) {
        return thg.d(f, 1.0f, 1.0E-4f) ? BitmapDescriptorFactory.HUE_RED : (i * (1.0f - f)) / 2.0f;
    }

    @Override // defpackage.jgs
    protected final synchronized void R() {
        if (this.P != null) {
            aZ();
        }
        at(false);
        this.W.set(null);
        this.I.set(0);
        this.U.set(0);
    }

    @Override // defpackage.jgz
    public final synchronized boolean S(jjh jjhVar, float[] fArr, jhg jhgVar, int i) throws Throwable {
        Throwable th;
        jhb jhbVar;
        float f;
        float[] fArr2;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                jhbVar = this;
                th = th;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            if (!be()) {
                aW(false);
                return false;
            }
            jhs jhsVar = (jhs) this.W.get();
            float fBi = bi();
            if (jhsVar != null) {
                jhu jhuVarBd = bd(jhsVar);
                if (bf(jhsVar)) {
                    float[] fArr3 = jhuVarBd.a;
                    fArr3[12] = bh(fArr3[0], bb());
                    fArr3[13] = bh(fArr3[5], ba());
                }
                float[] fArr4 = this.K;
                Matrix.multiplyMM(fArr4, 0, fArr, 0, jhuVarBd.a, 0);
                float f2 = jhuVarBd.b;
                f = f2 != 1.0f ? f2 : fBi;
                fArr2 = fArr4;
            } else {
                if (fBi == BitmapDescriptorFactory.HUE_RED) {
                    TimeUnit.MILLISECONDS.getClass();
                    aW(false);
                    return false;
                }
                fArr2 = fArr;
                f = fBi;
            }
            this.U.incrementAndGet();
            aP((jju) jjhVar, f, fArr2, jhgVar, i);
            aW(true);
            return true;
        } catch (Throwable th4) {
            th = th4;
            jhbVar = this;
            throw th;
        }
    }

    @Override // defpackage.jgs
    protected final void Y() {
        synchronized (this) {
            aU();
        }
    }

    @Override // defpackage.jgz
    @ResultIgnorabilityUnspecified
    public final jhg a() {
        return bc(false);
    }

    @Override // defpackage.jgs, defpackage.jho
    public final void aH() {
        super.aH();
        this.q.postDelayed(this.ah, 100L);
    }

    @Override // defpackage.jhf
    public final Surface aJ() {
        return this.Q;
    }

    @Override // defpackage.jhf
    public final jhg aK() {
        return bc(true);
    }

    @Override // defpackage.jhf
    public final synchronized DrawingSpec aL() {
        if (this.Q == null) {
            return null;
        }
        this.R = true;
        int iBb = bb();
        int iBa = ba();
        int iD = this.c.d();
        Surface surface = this.Q;
        surface.getClass();
        return new DrawingSpec(iBb, iBa, iD, surface, o(), (int) acvn.a.gu().b(), -1, null);
    }

    @Override // defpackage.jhf
    public final String aM() {
        if (!acur.a.gu().n()) {
            return toString();
        }
        String strE = E();
        CarRegionId carRegionId = this.z;
        Integer[] numArr = this.S;
        return "GlProjectionWindow { " + strE + " : region=" + String.valueOf(carRegionId) + ", vertices=" + Arrays.toString(numArr) + ", windowInsets=" + v().toString() + ", visible=" + this.m + "}";
    }

    @Override // defpackage.jhf
    public final synchronized void aN() {
        ((ype) L.l().ai((char) 2139)).y("animationEnded %s", this);
        if (this.y != this.e.g) {
            bl(this.y);
        }
        this.W.set(null);
    }

    @Override // defpackage.jhf
    public final synchronized void aO(jhs jhsVar, boolean z) {
        ((ype) L.l().ai(2140)).P("animationStarted isRemoval:%b %s", z, this);
        int iA = jhsVar.a();
        if (iA == -1) {
            bl(this.y - 1);
        } else if (iA == 1) {
            bl(this.y + 1);
        }
        this.W.set(jhsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03a1  */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void aP(defpackage.jju r48, float r49, float[] r50, defpackage.jhg r51, int r52) {
        /*
            Method dump skipped, instructions count: 1379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhb.aP(jju, float, float[], jhg, int):void");
    }

    @Override // defpackage.jhf
    public final void aQ(PrintWriter printWriter) {
        printWriter.println(this);
        try {
            ydx ydxVar = this.V;
            if (ydxVar.size() <= 300) {
                printWriter.println("frameUpdateTimestamps=" + yrm.ap(ydxVar));
                return;
            }
            Stream streamFilter = Collection.EL.stream(ydxVar).filter(new hmd(5));
            int i = yfq.d;
            yfq yfqVar = (yfq) streamFilter.collect(ycm.a);
            printWriter.println("frameUpdateTimestamps");
            int i2 = 0;
            while (i2 < yfqVar.size()) {
                for (int i3 = 0; i3 < 300 && i2 < yfqVar.size(); i3++) {
                    printWriter.print(String.valueOf(yfqVar.get(i2)) + ", ");
                    i2++;
                }
                printWriter.println();
            }
            printWriter.println("Timestamps Complete");
        } catch (ConcurrentModificationException unused) {
            printWriter.println("concurrent modification happened");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5 A[Catch: all -> 0x00c1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x0017, B:10:0x0028, B:12:0x008c, B:13:0x008e, B:19:0x0095, B:20:0x0096, B:22:0x00a5, B:23:0x00a7, B:29:0x00ae, B:30:0x00af, B:33:0x00b9, B:34:0x00c0, B:14:0x008f, B:15:0x0091, B:24:0x00a8, B:25:0x00aa), top: B:38:0x0001, inners: #1, #2 }] */
    @Override // defpackage.jhf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void aR(defpackage.jjh r7) throws defpackage.jjv {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r7 instanceof defpackage.jju     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto Lb9
            yph r0 = defpackage.jhb.L     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "init %s"
            r2 = 2144(0x860, float:3.004E-42)
            defpackage.a.bQ(r0, r1, r6, r2)     // Catch: java.lang.Throwable -> Lc1
            int r1 = r6.j()     // Catch: java.lang.Throwable -> Lc1
            if (r1 == 0) goto L28
            r2 = 5
            if (r1 == r2) goto L28
            yop r1 = r0.f()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "window init called while not cleaned up %s"
            r3 = 2145(0x861, float:3.006E-42)
            defpackage.a.bF(r1, r2, r6, r3)     // Catch: java.lang.Throwable -> Lc1
            r6.R()     // Catch: java.lang.Throwable -> Lc1
            r6.aS()     // Catch: java.lang.Throwable -> Lc1
        L28:
            r1 = 1
            int[] r2 = new int[r1]     // Catch: java.lang.Throwable -> Lc1
            r3 = 0
            android.opengl.GLES20.glGenTextures(r1, r2, r3)     // Catch: java.lang.Throwable -> Lc1
            r2 = r2[r3]     // Catch: java.lang.Throwable -> Lc1
            r6.O = r2     // Catch: java.lang.Throwable -> Lc1
            r4 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r4, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "glBindTexture mTextureID"
            defpackage.jjv.a(r0, r2)     // Catch: java.lang.Throwable -> Lc1
            jkk r2 = r6.c     // Catch: java.lang.Throwable -> Lc1
            ina r2 = (defpackage.ina) r2     // Catch: java.lang.Throwable -> Lc1
            jhc r2 = r2.w     // Catch: java.lang.Throwable -> Lc1
            r2.getClass()     // Catch: java.lang.Throwable -> Lc1
            jju r7 = (defpackage.jju) r7     // Catch: java.lang.Throwable -> Lc1
            int r7 = r7.a(r2)     // Catch: java.lang.Throwable -> Lc1
            float r7 = (float) r7     // Catch: java.lang.Throwable -> Lc1
            r2 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameterf(r4, r2, r7)     // Catch: java.lang.Throwable -> Lc1
            r2 = 10240(0x2800, float:1.4349E-41)
            android.opengl.GLES20.glTexParameterf(r4, r2, r7)     // Catch: java.lang.Throwable -> Lc1
            r7 = 10242(0x2802, float:1.4352E-41)
            r2 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r4, r7, r2)     // Catch: java.lang.Throwable -> Lc1
            r7 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r4, r7, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r7 = "glTexParameter"
            defpackage.jjv.a(r0, r7)     // Catch: java.lang.Throwable -> Lc1
            android.graphics.SurfaceTexture r7 = new android.graphics.SurfaceTexture     // Catch: java.lang.Throwable -> Lc1
            int r0 = r6.O     // Catch: java.lang.Throwable -> Lc1
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lc1
            int r0 = r6.bb()     // Catch: java.lang.Throwable -> Lc1
            int r2 = r6.ba()     // Catch: java.lang.Throwable -> Lc1
            r7.setDefaultBufferSize(r0, r2)     // Catch: java.lang.Throwable -> Lc1
            android.view.Surface r5 = new android.view.Surface     // Catch: java.lang.Throwable -> Lc1
            r5.<init>(r7)     // Catch: java.lang.Throwable -> Lc1
            r6.Q = r5     // Catch: java.lang.Throwable -> Lc1
            r7.setOnFrameAvailableListener(r6)     // Catch: java.lang.Throwable -> Lc1
            r6.P = r7     // Catch: java.lang.Throwable -> Lc1
            boolean r7 = r6.w     // Catch: java.lang.Throwable -> Lc1
            if (r7 == 0) goto L96
            java.lang.Object r5 = r6.s     // Catch: java.lang.Throwable -> Lc1
            monitor-enter(r5)     // Catch: java.lang.Throwable -> Lc1
            r6.u = r1     // Catch: java.lang.Throwable -> L93
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L93
            goto L96
        L93:
            r7 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L93
            throw r7     // Catch: java.lang.Throwable -> Lc1
        L96:
            r6.aZ()     // Catch: java.lang.Throwable -> Lc1
            java.util.concurrent.atomic.AtomicInteger r5 = r6.I     // Catch: java.lang.Throwable -> Lc1
            r5.set(r3)     // Catch: java.lang.Throwable -> Lc1
            java.util.concurrent.atomic.AtomicInteger r5 = r6.U     // Catch: java.lang.Throwable -> Lc1
            r5.set(r3)     // Catch: java.lang.Throwable -> Lc1
            if (r7 != 0) goto Laf
            java.lang.Object r7 = r6.s     // Catch: java.lang.Throwable -> Lc1
            monitor-enter(r7)     // Catch: java.lang.Throwable -> Lc1
            r6.u = r1     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lac
            goto Laf
        Lac:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lac
            throw r0     // Catch: java.lang.Throwable -> Lc1
        Laf:
            android.opengl.GLES20.glBindTexture(r4, r3)     // Catch: java.lang.Throwable -> Lc1
            jgr r7 = r6.q     // Catch: java.lang.Throwable -> Lc1
            r7.f(r0, r2)     // Catch: java.lang.Throwable -> Lc1
            monitor-exit(r6)
            return
        Lb9:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = "GlProjectionWindowImpl requires a GlCompositionContext"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lc1
            throw r7     // Catch: java.lang.Throwable -> Lc1
        Lc1:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhb.aR(jjh):void");
    }

    protected synchronized void aS() {
        ((ype) L.l().ai((char) 2151)).u("releaseSurfacesAndTextures");
        if (this.Q != null) {
            this.Q.release();
            this.Q = null;
        }
        if (this.P != null) {
            this.P.release();
            this.P = null;
        }
        int i = this.O;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            GLES20.glFinish();
            this.O = 0;
        }
    }

    @Override // defpackage.jhf
    public final synchronized void aT() {
        this.R = false;
        notify();
    }

    protected void aU() {
        jhb jhbVar;
        jhg jhgVar;
        ProjectionWindowDecorationParams projectionWindowDecorationParams = this.j;
        Integer numValueOf = Integer.valueOf(this.e.a + projectionWindowDecorationParams.a);
        Integer[] numArr = this.S;
        numArr[0] = numValueOf;
        numArr[1] = Integer.valueOf(this.e.b + projectionWindowDecorationParams.d);
        numArr[2] = Integer.valueOf(this.e.e - projectionWindowDecorationParams.c);
        numArr[3] = Integer.valueOf(this.e.f - projectionWindowDecorationParams.b);
        if (projectionWindowDecorationParams.h) {
            jhgVar = new jhg(this, this.e.a, this.e.f, this.e.e, this.e.b);
            jhbVar = this;
        } else {
            jhbVar = this;
            jhgVar = new jhg(jhbVar, numArr[0].intValue(), numArr[3].intValue(), numArr[2].intValue(), numArr[1].intValue());
        }
        float[] fArrBg = jhbVar.bg(jhgVar);
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        jhbVar.F = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArrBg).position(0);
        ((ype) L.l().ai((char) 2152)).y("setNewVerticesData %s", jhbVar);
    }

    @Override // defpackage.jhf
    public final synchronized void aV(long j) {
        boolean z;
        ((ype) L.l().ai((char) 2156)).y("teardown %s", this);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime + j;
        while (true) {
            z = this.R;
            if (!z || jElapsedRealtime >= j2) {
                break;
            }
            try {
                wait(j);
            } catch (InterruptedException unused) {
            }
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        if (z) {
            ((ype) ((ype) L.h()).ai((char) 2157)).y("Tearing down window that's still in use: %s", this);
        }
        aS();
        AtomicInteger atomicInteger = this.ac;
        int i = atomicInteger.get();
        if (i > 0) {
            rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzz.PROJECTION_WINDOW_MANAGER, yzy.Hj);
            rrbVarH.w(i);
            CarRegionId carRegionId = this.z;
            if (carRegionId != null) {
                rrbVarH.n(carRegionId);
            }
            ComponentName componentName = this.r;
            if (componentName != null) {
                rrbVarH.p(componentName);
            }
            rpz.a(((ina) this.c).l).c(rrbVarH.l());
            atomicInteger.set(0);
        }
    }

    final void aW(boolean z) {
        if (this.M) {
            synchronized (this.t) {
                if (z == this.N) {
                    return;
                }
                this.N = z;
                if (this.m && this.n) {
                    aq();
                }
            }
        }
    }

    @Override // defpackage.jhf
    public final boolean aX() {
        jhs jhsVar = (jhs) this.W.get();
        return jhsVar != null && jhsVar.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // defpackage.jhf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean aY() {
        /*
            r5 = this;
            boolean r0 = r5.be()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1c
            jkk r0 = r5.c
            java.util.UUID r3 = r5.d
            ina r0 = (defpackage.ina) r0
            java.util.UUID r4 = r0.u
            if (r4 == 0) goto L1c
            java.util.UUID r0 = r0.u
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1c
            r0 = r1
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 != 0) goto L24
            java.util.concurrent.atomic.AtomicInteger r3 = r5.ac
            r3.getAndIncrement()
        L24:
            boolean r5 = r5.aE()
            if (r5 == 0) goto L2d
            if (r0 == 0) goto L2d
            return r1
        L2d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhb.aY():boolean");
    }

    public synchronized boolean aZ() {
        SurfaceTexture surfaceTexture = this.P;
        if (surfaceTexture != null) {
            synchronized (this.s) {
                if (j() < 3) {
                    surfaceTexture.updateTexImage();
                    surfaceTexture.getTransformMatrix(this.T);
                    long timestamp = surfaceTexture.getTimestamp();
                    if (timestamp == this.G) {
                        return aX();
                    }
                    this.V.add(Long.valueOf(timestamp));
                    this.G = timestamp;
                    this.I.getAndIncrement();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jgs
    protected final void ae() {
        if (this.P != null) {
            this.P.setDefaultBufferSize(bb(), ba());
        }
    }

    @Override // defpackage.jgz
    public final synchronized boolean ah() {
        boolean z = false;
        if (this.P == null) {
            return false;
        }
        jhp jhpVar = this.B;
        synchronized (this.s) {
            if (j() >= 3) {
                if (aX() || (jhpVar != null && jhpVar.m)) {
                    z = true;
                }
                return z;
            }
            long j = this.G;
            if (j == this.H) {
                return aX() || (jhpVar != null && jhpVar.m) || this.J;
            }
            this.H = j;
            return true;
        }
    }

    @Override // defpackage.jgs, defpackage.jhf
    public final void ar(boolean z) {
        synchronized (this.t) {
            super.ar(z);
            if (!z && this.N) {
                aW(false);
            }
        }
    }

    @Override // defpackage.jgs
    public final void at(boolean z) {
        synchronized (this.t) {
            super.at(z);
            if (!z && this.N) {
                aW(false);
            }
        }
    }

    @Override // defpackage.jgs
    protected final boolean ay() {
        return this.N;
    }

    @Override // defpackage.jgs, defpackage.jho
    public final void bn(MotionEvent motionEvent) {
        super.bn(motionEvent);
        this.q.removeCallbacks(this.ah);
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.D = 1.0f;
        this.c.T();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFrameAvailable(android.graphics.SurfaceTexture r11) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhb.onFrameAvailable(android.graphics.SurfaceTexture):void");
    }

    @Override // defpackage.jgs
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString().substring(0, r0.length() - 1));
        sb.append(",anim=");
        sb.append(aX());
        sb.append(",surface=");
        sb.append(this.Q);
        sb.append(",nupdated=");
        sb.append(this.I.get());
        sb.append(",nrendered=");
        sb.append(this.U.get());
        sb.append(",nonDrawnTouches=");
        sb.append(this.ac.get());
        sb.append(",tid=");
        sb.append(this.O);
        SurfaceTexture surfaceTexture = this.P;
        if (surfaceTexture != null) {
            sb.append(", timestamp=");
            sb.append(surfaceTexture.getTimestamp());
        }
        sb.append(",vertices=");
        sb.append(Arrays.toString(this.S));
        sb.append('}');
        return sb.toString();
    }

    @Override // defpackage.jgz
    public final void w() {
        jhs jhsVar = (jhs) this.W.get();
        if (jhsVar == null || !jhsVar.c()) {
            this.X = false;
        } else {
            this.X = true;
            this.Y = bd(jhsVar).a;
        }
    }
}
