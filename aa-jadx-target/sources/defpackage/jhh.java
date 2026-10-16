package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class jhh extends defpackage.jha implements android.graphics.SurfaceTexture.OnFrameAvailableListener, defpackage.jhf, defpackage.jhv {
    private static final defpackage.yqm M = defpackage.yqm.c("CAR.WM.WIN.GL");
    public volatile float E;
    public android.animation.ValueAnimator F;
    protected java.nio.FloatBuffer G;
    public long H;
    public long I;
    final java.util.concurrent.atomic.AtomicInteger J;
    public volatile boolean K;
    protected final float[] L;
    private final boolean N;
    private volatile boolean O;
    private int P;
    private volatile android.graphics.SurfaceTexture Q;
    private volatile android.view.Surface R;
    private boolean S;
    private final java.lang.Integer[] T;
    private final float[] U;
    private final java.util.concurrent.atomic.AtomicInteger V;
    private final defpackage.yfd W;
    private final java.util.concurrent.atomic.AtomicReference X;
    private boolean Y;
    private float[] Z;
    private final float[] aa;
    private final float[] ab;
    private final float[] ac;
    private final java.util.concurrent.atomic.AtomicInteger ad;
    private final boolean ae;
    private int af;
    private long ag;
    private java.nio.FloatBuffer ah;
    private final java.lang.Runnable ai;

    public jhh(defpackage.jkr jkrVar, int i, defpackage.jhk jhkVar, com.google.android.gms.car.display.CarRegionId carRegionId, java.util.UUID uuid, android.content.ComponentName componentName) {
        defpackage.jiz jizVar = new defpackage.jiz(jhkVar.a());
        defpackage.acwv acwvVar = defpackage.acwv.a;
        super(jkrVar, i, jhkVar, carRegionId, uuid, componentName, acwvVar.fF().s() && android.os.Build.VERSION.SDK_INT >= 29, jizVar);
        this.E = 0.0f;
        boolean zG = defpackage.actb.a.fF().g();
        this.N = zG;
        this.O = !zG;
        this.P = 0;
        this.T = new java.lang.Integer[4];
        this.U = new float[16];
        this.H = -1L;
        this.I = -1L;
        this.J = new java.util.concurrent.atomic.AtomicInteger(0);
        this.V = new java.util.concurrent.atomic.AtomicInteger(0);
        this.W = new defpackage.yfd((int) acwvVar.fF().f());
        this.X = new java.util.concurrent.atomic.AtomicReference();
        this.K = false;
        this.Z = new float[16];
        this.L = new float[16];
        this.aa = new float[16];
        this.ab = new float[4];
        this.ac = new float[2];
        this.ad = new java.util.concurrent.atomic.AtomicInteger(0);
        this.ae = acwvVar.fF().p();
        this.ai = new defpackage.ire(this, 17);
    }

    private final int bc() {
        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams = this.k;
        return projectionWindowDecorationParams.h ? this.f.d : (this.f.d - projectionWindowDecorationParams.b) - projectionWindowDecorationParams.d;
    }

    private final int bd() {
        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams = this.k;
        return projectionWindowDecorationParams.h ? this.f.c : (this.f.c - projectionWindowDecorationParams.c) - projectionWindowDecorationParams.a;
    }

    private final defpackage.jhm be(boolean z) {
        float f;
        float fIntValue;
        float f2;
        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams = this.k;
        float[] fArr = new float[16];
        if (this.Y) {
            fArr = this.Z;
        }
        defpackage.jkr jkrVar = this.c;
        float f3 = fArr[12];
        float f4 = fArr[13];
        defpackage.jhi jhiVar = ((defpackage.inh) jkrVar).w;
        jhiVar.getClass();
        java.lang.Integer[] numArr = this.T;
        int iIntValue = numArr[0].intValue();
        int i = jhiVar.b;
        int i2 = iIntValue + i;
        int iIntValue2 = numArr[1].intValue();
        int i3 = jhiVar.c;
        int iIntValue3 = numArr[2].intValue() + i;
        int iIntValue4 = numArr[3].intValue() + i3;
        float f5 = jhiVar.d;
        float fIntValue2 = iIntValue4;
        float f6 = iIntValue2 + i3;
        if (f5 > 1.0f) {
            float f7 = jhiVar.e;
            f3 *= f7;
            float fIntValue3 = numArr[0].intValue();
            float f8 = i;
            fIntValue = (numArr[2].intValue() * f7) + f8;
            f = (f7 * fIntValue3) + f8;
        } else {
            float f9 = iIntValue3;
            f = i2;
            if (f5 < 1.0f) {
                f4 *= f5;
                float fIntValue4 = numArr[1].intValue() * f5;
                float f10 = i3;
                fIntValue2 = (numArr[3].intValue() * f5) + f10;
                f6 = f10 + fIntValue4;
            }
            fIntValue = f9;
        }
        if (z) {
            com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams2 = this.k;
            if (!projectionWindowDecorationParams2.equals(com.google.android.gms.car.ProjectionWindowDecorationParams.a()) && ((!projectionWindowDecorationParams2.h && !projectionWindowDecorationParams2.i) || !w().equals(b))) {
                if (f5 > 1.0f) {
                    float f11 = jhiVar.e;
                    f -= projectionWindowDecorationParams.a * f11;
                    f2 = f11 * projectionWindowDecorationParams.c;
                } else {
                    f -= projectionWindowDecorationParams.a;
                    f2 = projectionWindowDecorationParams.c;
                }
                fIntValue += f2;
                if (f5 < 1.0f) {
                    float f12 = jhiVar.e;
                    f6 -= projectionWindowDecorationParams.d * f12;
                    fIntValue2 += f12 * projectionWindowDecorationParams.b;
                } else {
                    f6 -= projectionWindowDecorationParams.d;
                    fIntValue2 += projectionWindowDecorationParams.b;
                }
            }
        }
        return new defpackage.jhm(this, java.lang.Math.max(f, f + f3), java.lang.Math.min(fIntValue2, fIntValue2 + f4), java.lang.Math.min(fIntValue, f3 + fIntValue), java.lang.Math.max(f6, f4 + f6));
    }

    private final defpackage.jib bf(defpackage.jhz jhzVar) {
        return jhzVar.f(this.J.get() > 0);
    }

    private final boolean bg() {
        if (this.y) {
            java.util.concurrent.TimeUnit.MILLISECONDS.getClass();
            return false;
        }
        if (!this.n && !aZ()) {
            java.util.concurrent.TimeUnit.MILLISECONDS.getClass();
            return false;
        }
        if (this.J.get() > 0) {
            return true;
        }
        java.util.concurrent.TimeUnit.MILLISECONDS.getClass();
        return false;
    }

    private static boolean bh(defpackage.jhz jhzVar) {
        return jhzVar != null && jhzVar.c() && jhzVar.d();
    }

    private final float[] bi(defpackage.jhm jhmVar) {
        float f = this.f.a;
        float f2 = this.f.b;
        float f3 = this.f.f;
        float f4 = this.f.e;
        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams = this.k;
        if (!projectionWindowDecorationParams.h) {
            f += projectionWindowDecorationParams.a;
            f2 += projectionWindowDecorationParams.d;
            f3 -= projectionWindowDecorationParams.b;
            f4 -= projectionWindowDecorationParams.c;
        }
        float f5 = jhmVar.a;
        float f6 = jhmVar.d;
        float f7 = jhmVar.c;
        float f8 = jhmVar.b;
        float f9 = f5 - f;
        float fMin = java.lang.Math.min(java.lang.Math.max(f9 == 0.0f ? 0.0f : f9 / bd(), 0.0f), 1.0f);
        float f10 = f4 - f7;
        float fMin2 = java.lang.Math.min(java.lang.Math.max(1.0f - (f10 == 0.0f ? 0.0f : f10 / bd()), 0.0f), 1.0f);
        float f11 = f8 - f2;
        float fMin3 = java.lang.Math.min(java.lang.Math.max(f11 == 0.0f ? 0.0f : f11 / bc(), 0.0f), 1.0f);
        float f12 = f3 - f6;
        float fMin4 = java.lang.Math.min(java.lang.Math.max(1.0f - (f12 == 0.0f ? 0.0f : f12 / bc()), 0.0f), 1.0f);
        return new float[]{f5, f8, 0.0f, fMin, fMin3, f7, f8, 0.0f, fMin2, fMin3, f5, f6, 0.0f, fMin, fMin4, f7, f6, 0.0f, fMin2, fMin4};
    }

    private static final float bj(float f, int i) {
        if (defpackage.tis.f(f, 1.0f, 1.0E-4f)) {
            return 0.0f;
        }
        return (i * (1.0f - f)) / 2.0f;
    }

    @Override // defpackage.jha
    protected final synchronized void S() {
        if (this.Q != null) {
            bb();
        }
        av(false);
        this.X.set(null);
        this.J.set(0);
        this.V.set(0);
    }

    @Override // defpackage.jhf
    public final void T() {
        defpackage.jhz jhzVar = (defpackage.jhz) this.X.get();
        if (jhzVar == null || !jhzVar.c()) {
            this.Y = false;
        } else {
            this.Y = true;
            this.Z = bf(jhzVar).a;
        }
    }

    @Override // defpackage.jha
    protected final void Z() {
        synchronized (this) {
            aW();
        }
    }

    @Override // defpackage.jha
    public final boolean aA() {
        return this.O;
    }

    @Override // defpackage.jha, defpackage.jhv
    public final void aJ() {
        super.aJ();
        this.r.postDelayed(this.ai, 100L);
    }

    @Override // defpackage.jhl
    public final android.view.Surface aL() {
        return this.R;
    }

    @Override // defpackage.jhl
    public final defpackage.jhm aM() {
        return be(true);
    }

    @Override // defpackage.jhl
    public final synchronized com.google.android.gms.car.DrawingSpec aN() {
        if (this.R == null) {
            return null;
        }
        this.S = true;
        int iBd = bd();
        int iBc = bc();
        int iD = this.c.d();
        android.view.Surface surface = this.R;
        surface.getClass();
        return new com.google.android.gms.car.DrawingSpec(iBd, iBc, iD, surface, o(), (int) defpackage.acwp.a.fF().b(), -1, null);
    }

    @Override // defpackage.jhl
    public final java.lang.String aO() {
        if (!defpackage.acvt.a.fF().m()) {
            return toString();
        }
        java.lang.String strF = F();
        com.google.android.gms.car.display.CarRegionId carRegionId = this.A;
        java.lang.Integer[] numArr = this.T;
        return "GlProjectionWindow { " + strF + " : region=" + java.lang.String.valueOf(carRegionId) + ", vertices=" + java.util.Arrays.toString(numArr) + ", windowInsets=" + w().toString() + ", visible=" + this.n + "}";
    }

    @Override // defpackage.jhl
    public final synchronized void aP() {
        ((defpackage.yqj) M.l().ai((char) 2140)).y("animationEnded %s", this);
        if (this.z != this.f.g) {
            bm(this.z);
        }
        this.X.set(null);
    }

    @Override // defpackage.jhl
    public final synchronized void aQ(defpackage.jhz jhzVar, boolean z) {
        ((defpackage.yqj) M.l().ai(2141)).P("animationStarted isRemoval:%b %s", z, this);
        int iA = jhzVar.a();
        if (iA == -1) {
            bm(this.z - 1);
        } else if (iA == 1) {
            bm(this.z + 1);
        }
        this.X.set(jhzVar);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x047c  */
    /* JADX WARN: Code duplicated, block: B:125:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:126:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:128:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:135:0x0502  */
    /* JADX WARN: Code duplicated, block: B:138:0x0511  */
    /* JADX WARN: Code duplicated, block: B:140:0x0531  */
    /* JADX WARN: Code duplicated, block: B:89:0x03a1  */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    protected void aR(defpackage.jkb jkbVar, float f, float[] fArr, defpackage.jhm jhmVar, int i) {
        float[] fArr2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        float f7;
        int i3;
        ?? r9;
        int i4;
        java.nio.FloatBuffer floatBufferAsFloatBuffer;
        defpackage.jkr jkrVar;
        defpackage.jhi jhiVar;
        float f8;
        float f9;
        jhw jhwVar;
        float f10;
        float f11;
        float fMax;
        float fMin;
        float fMax2;
        float fMin2;
        float f12;
        float fD;
        int i5;
        defpackage.jkr jkrVar2;
        int i6;
        float f13;
        float f14;
        float f15;
        float fMin3;
        float f16;
        float f17;
        int i7;
        int i8;
        java.util.concurrent.TimeUnit.SECONDS.getClass();
        F();
        boolean zEquals = this.k.equals(com.google.android.gms.car.ProjectionWindowDecorationParams.a());
        boolean z4 = f != 1.0f;
        boolean z5 = z4 || this.x || !zEquals;
        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams2 = this.k;
        if (zEquals) {
            z5 = z5;
            projectionWindowDecorationParams2 = projectionWindowDecorationParams2;
            fArr2 = null;
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = 0.0f;
            f5 = 0.0f;
            f6 = 0.0f;
        } else {
            defpackage.jix jixVarA = this.m.a(be(false), jhmVar);
            float f18 = jixVarA.a;
            float fMax3 = jhmVar.a - jixVarA.b;
            float fMax4 = jhmVar.b - jixVarA.e;
            float fMin4 = jhmVar.c + jixVarA.d;
            float fMin5 = jhmVar.d + jixVarA.c;
            if (bh((defpackage.jhz) this.X.get())) {
                defpackage.jhi jhiVar2 = ((defpackage.inh) this.c).w;
                jhiVar2.getClass();
                java.lang.Integer[] numArr = this.T;
                int iIntValue = numArr[0].intValue();
                int i9 = jhiVar2.b;
                fMax3 = java.lang.Math.max(fMax3, iIntValue + i9);
                int iIntValue2 = numArr[1].intValue();
                int i10 = jhiVar2.c;
                fMax4 = java.lang.Math.max(fMax4, iIntValue2 + i10);
                fMin4 = java.lang.Math.min(fMin4, numArr[2].intValue() + i9);
                fMin5 = java.lang.Math.min(fMin5, numArr[3].intValue() + i10);
            }
            float f19 = fMin4 - fMax3;
            float f20 = fMin5 - fMax4;
            fArr2 = new float[]{f19 / 2.0f, f20 / 2.0f};
            float f21 = fMin4;
            com.google.android.gms.car.DropShadowParams dropShadowParams = projectionWindowDecorationParams2.k;
            if (dropShadowParams != null) {
                jkbVar.d(7);
                defpackage.jkd jkdVarB = jkbVar.b(7);
                float[] fArr3 = this.aa;
                f16 = f18;
                f17 = fMax3;
                java.lang.System.arraycopy(fArr, 0, fArr3, 0, 16);
                defpackage.jkr jkrVar3 = this.c;
                defpackage.jhi jhiVar3 = ((defpackage.inh) jkrVar3).w;
                jhiVar3.getClass();
                float f22 = f17 + fArr2[0];
                float f23 = fMax4 + fArr2[1];
                float f24 = f22 - jhiVar3.b;
                float f25 = f23 - jhiVar3.c;
                android.opengl.Matrix.translateM(fArr3, 0, f24, f25, 0.0f);
                float f26 = dropShadowParams.c;
                float f27 = f26 + f26;
                android.opengl.Matrix.scaleM(fArr3, 0, (f19 + f27) / f19, (f20 + f27) / f20, 1.0f);
                android.opengl.Matrix.translateM(fArr3, 0, -f24, -f25, 0.0f);
                float f28 = jhiVar3.d;
                int i11 = dropShadowParams.a;
                float f29 = dropShadowParams.b;
                float f30 = i11;
                if (f28 > 1.0f) {
                    f30 *= jhiVar3.e;
                } else if (f28 < 1.0f) {
                    f29 *= f28;
                }
                android.opengl.Matrix.translateM(fArr3, 0, f30, f29, 0.0f);
                int i12 = jkdVarB.a;
                float[] fArr4 = this.ab;
                int i13 = dropShadowParams.d;
                int iGlGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(i12, "uColor");
                fArr4[0] = android.graphics.Color.red(i13) / 255.0f;
                fArr4[1] = android.graphics.Color.green(i13) / 255.0f;
                fArr4[2] = android.graphics.Color.blue(i13) / 255.0f;
                fArr4[3] = android.graphics.Color.alpha(i13) / 255.0f;
                android.opengl.GLES20.glUniform4fv(iGlGetUniformLocation, 1, fArr4, 0);
                android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(i12, "uRadius"), (jkrVar3.d() / 160.0f) * f16);
                android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(i12, "uShadowRadius"), f26);
                float[] fArr5 = this.ac;
                float f31 = f22 + f30;
                int iGlGetUniformLocation2 = android.opengl.GLES20.glGetUniformLocation(i12, "uCenterPosition");
                fArr5[0] = f31;
                fArr5[1] = f23 + f29;
                android.opengl.GLES20.glUniform2fv(iGlGetUniformLocation2, 1, fArr5, 0);
                android.opengl.GLES20.glUniform2fv(android.opengl.GLES20.glGetUniformLocation(i12, "uHalfSize"), 1, fArr2, 0);
                android.opengl.GLES20.glUniformMatrix4fv(jkdVarB.b, 1, false, fArr3, 0);
                this.G.position(0);
                int i14 = jkdVarB.d;
                android.opengl.GLES20.glVertexAttribPointer(i14, 3, 5126, false, 20, (java.nio.Buffer) this.G);
                android.opengl.GLES20.glEnableVertexAttribArray(i14);
                int i15 = jkdVarB.c;
                if (i15 != -1) {
                    i7 = 1;
                    i8 = 0;
                    android.opengl.GLES20.glUniformMatrix4fv(i15, 1, false, this.U, 0);
                } else {
                    i7 = 1;
                    i8 = 0;
                }
                android.opengl.GLES20.glEnable(3042);
                android.opengl.GLES20.glBlendFunc(i7, 771);
                android.opengl.GLES20.glDrawArrays(5, i8, 4);
            } else {
                f16 = f18;
                f17 = fMax3;
            }
            f4 = f21;
            f3 = fMin5;
            f6 = f16;
            f2 = f17;
            f5 = fMax4;
        }
        boolean zAB = aB();
        if (z4) {
            if (zEquals) {
                projectionWindowDecorationParams = projectionWindowDecorationParams2;
                jkbVar = jkbVar;
                z = zAB;
                i2 = 1;
                z2 = true;
            } else if (zAB) {
                i2 = 9;
                projectionWindowDecorationParams = projectionWindowDecorationParams2;
                z2 = true;
                z = true;
            } else {
                projectionWindowDecorationParams = projectionWindowDecorationParams2;
                if (projectionWindowDecorationParams.j > 0) {
                    i2 = 6;
                    jkbVar = jkbVar;
                    z2 = true;
                    z = false;
                    z3 = true;
                } else {
                    jkbVar = jkbVar;
                    i2 = 4;
                    z2 = true;
                    z = false;
                }
            }
            z3 = false;
        } else {
            projectionWindowDecorationParams = projectionWindowDecorationParams2;
            if (zEquals != 0) {
                jkbVar = jkbVar;
                z = zAB;
                i2 = 0;
                z2 = false;
            } else if (zAB) {
                i2 = 8;
                z2 = false;
                z = true;
            } else {
                jkbVar = jkbVar;
                if (projectionWindowDecorationParams.j > 0) {
                    i2 = 5;
                    z2 = false;
                    z = false;
                    z3 = true;
                } else {
                    i2 = 3;
                    z2 = false;
                    z = false;
                }
            }
            z3 = false;
        }
        jkbVar.d(i2);
        defpackage.jkd jkdVarB2 = jkbVar.b(i2);
        if (z2) {
            android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(jkdVarB2.a, "uAlphaMask"), f);
        }
        if (z5) {
            android.opengl.GLES20.glEnable(3042);
            android.opengl.GLES20.glBlendFunc(1, 771);
        } else {
            android.opengl.GLES20.glDisable(3042);
        }
        if (zEquals == 0) {
            fArr2.getClass();
            int i16 = jkdVarB2.a;
            f7 = 80.0f;
            defpackage.jkr jkrVar4 = this.c;
            float f32 = f2;
            android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(i16, "uRadius"), (jkrVar4.d() / 160.0f) * f6);
            float f33 = -java.lang.Math.min(f6, 0.7f);
            int i17 = projectionWindowDecorationParams.g;
            float f34 = i17 == 2 ? 1.0f : 0.5f;
            if (i17 == 2) {
                f33 = 0.0f;
            }
            android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(i16, "uSmoothstepLow"), f33 * (jkrVar4.d() / 160.0f));
            android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(i16, "uSmoothstepHigh"), (jkrVar4.d() / 160.0f) * f34);
            int iGlGetUniformLocation3 = android.opengl.GLES20.glGetUniformLocation(i16, "uMarginAlpha");
            if (iGlGetUniformLocation3 != -1) {
                android.opengl.GLES20.glUniform1f(iGlGetUniformLocation3, z ? this.E : 0.0f);
            }
            if (z) {
                defpackage.jhi jhiVar4 = ((defpackage.inh) jkrVar4).w;
                jhiVar4.getClass();
                int iGlGetUniformLocation4 = android.opengl.GLES20.glGetUniformLocation(i16, "uOriginalCenterPosition");
                if (iGlGetUniformLocation4 != -1) {
                    float f35 = jhiVar4.d;
                    int i18 = jhiVar4.c;
                    int i19 = jhiVar4.b;
                    android.graphics.Rect rectU = u();
                    jkrVar2 = jkrVar4;
                    float f36 = rectU.left;
                    float f37 = rectU.right;
                    int i20 = jhiVar4.g;
                    int i21 = i20 - rectU.bottom;
                    int i22 = i20 - rectU.top;
                    float fMax5 = f36 / java.lang.Math.max(f35, 1.0f);
                    float fMax6 = f37 / java.lang.Math.max(f35, 1.0f);
                    float fMin6 = i21 * java.lang.Math.min(f35, 1.0f);
                    float fMin7 = i22 * java.lang.Math.min(f35, 1.0f);
                    android.opengl.GLES20.glUniform2f(iGlGetUniformLocation4, ((fMax5 + fMax6) / 2.0f) + i19, ((fMin6 + fMin7) / 2.0f) + i18);
                    android.opengl.GLES20.glUniform2f(android.opengl.GLES20.glGetUniformLocation(i16, "uOriginalHalfSize"), (fMax6 - fMax5) / 2.0f, (fMin7 - fMin6) / 2.0f);
                    int iGlGetUniformLocation5 = android.opengl.GLES20.glGetUniformLocation(i16, "uFadeMargin");
                    int i23 = this.k.l.a;
                    float fD2 = (jkrVar2.d() / 160.0f) * 80.0f;
                    if (i23 == 1) {
                        fMin3 = fD2 / java.lang.Math.max(f35, 1.0f);
                    } else {
                        fMin3 = i23 == 2 ? fD2 * java.lang.Math.min(f35, 1.0f) : 0.0f;
                    }
                    android.opengl.GLES20.glUniform1f(iGlGetUniformLocation5, fMin3);
                } else {
                    jkrVar2 = jkrVar4;
                }
            } else {
                jkrVar2 = jkrVar4;
            }
            boolean z6 = this.l;
            if (z6) {
                i6 = i16;
                defpackage.jhm jhmVar2 = new defpackage.jhm(this, f32, f13, f14, f15);
                if (!aZ() && !jhmVar2.equals(this.p)) {
                    java.lang.Runnable runnable = this.B;
                    if (z6 && android.os.Build.VERSION.SDK_INT >= 29 && this.j) {
                        defpackage.jgz jgzVar = this.r;
                        if (!jgzVar.hasCallbacks(runnable)) {
                            f13 = f3;
                            f14 = f4;
                            f15 = f5;
                            jgzVar.postDelayed(runnable, 5000L);
                        }
                    }
                    f13 = f3;
                    f14 = f4;
                    f15 = f5;
                    f13 = f3;
                    f14 = f4;
                    f15 = f5;
                    f13 = f3;
                    f14 = f4;
                    f15 = f5;
                    f13 = f3;
                    f14 = f4;
                    f15 = f5;
                    this.p = jhmVar2;
                }
            } else {
                i6 = i16;
            }
            f13 = f3;
            f14 = f4;
            f15 = f5;
            f13 = f3;
            f14 = f4;
            f15 = f5;
            android.opengl.GLES20.glUniform2fv(android.opengl.GLES20.glGetUniformLocation(i6, "uCenterPosition"), 1, new float[]{f32 + fArr2[0], f5 + fArr2[1]}, 0);
            android.opengl.GLES20.glUniform2fv(android.opengl.GLES20.glGetUniformLocation(i6, "uHalfSize"), 1, fArr2, 0);
            if (z3) {
                int iGlGetUniformLocation6 = android.opengl.GLES20.glGetUniformLocation(i6, "uBorderColor");
                int iGlGetUniformLocation7 = android.opengl.GLES20.glGetUniformLocation(i6, "uCenterToInnerBorderSize");
                r9 = 0;
                i3 = 1;
                android.opengl.GLES20.glUniform4fv(iGlGetUniformLocation6, 1, new float[]{android.graphics.Color.red(i) / 255.0f, android.graphics.Color.green(i) / 255.0f, android.graphics.Color.blue(i) / 255.0f, android.graphics.Color.alpha(i) / 255.0f}, 0);
                float fD3 = projectionWindowDecorationParams.j * (jkrVar2.d() / 160.0f);
                android.opengl.GLES20.glUniform2fv(iGlGetUniformLocation7, 1, new float[]{fArr2[0] - fD3, fArr2[1] - fD3}, 0);
            }
            android.opengl.GLES20.glUniformMatrix4fv(jkdVarB2.b, i3, r9, fArr, r9);
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(36197, this.P);
            if (z) {
                android.graphics.Rect rectU2 = u();
                jkrVar = this.c;
                jhiVar = ((defpackage.inh) jkrVar).w;
                jhiVar.getClass();
                defpackage.jhm jhmVarBk = bk(jhmVar);
                f8 = rectU2.left;
                f9 = rectU2.right;
                int i24 = rectU2.bottom;
                int i25 = jhiVar.g;
                int i26 = i25 - i24;
                int i27 = i25 - rectU2.top;
                jhwVar = this.C;
                f10 = i27;
                f11 = i26;
                if ((jhwVar == null && jhwVar.m) || this.E > 0.0f) {
                    fD = (jkrVar.d() / 160.0f) * f7;
                    i5 = this.k.l.a;
                    if (i5 == 1) {
                        float fMax7 = fD * java.lang.Math.max(jhiVar.d, 1.0f);
                        f8 -= fMax7;
                        f9 += fMax7;
                    } else if (i5 == 2) {
                        float fMin8 = fD / java.lang.Math.min(jhiVar.d, 1.0f);
                        f11 -= fMin8;
                        f10 += fMin8;
                    }
                }
                fMax = java.lang.Math.max(jhmVarBk.a, f8);
                fMin = java.lang.Math.min(jhmVarBk.c, f9);
                fMax2 = java.lang.Math.max(jhmVarBk.b, f11);
                fMin2 = java.lang.Math.min(jhmVarBk.d, f10);
                if (fMax < fMin || fMax2 >= fMin2) {
                    f12 = fMax;
                    fMin2 = fMax2;
                } else {
                    f12 = fMin;
                }
                float[] fArrBi = bi(new defpackage.jhm(this, fMax, fMin2, f12, fMax2));
                floatBufferAsFloatBuffer = this.ah;
                if (floatBufferAsFloatBuffer == null) {
                    floatBufferAsFloatBuffer = java.nio.ByteBuffer.allocateDirect(80).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
                    this.ah = floatBufferAsFloatBuffer;
                }
                floatBufferAsFloatBuffer.clear();
                i4 = 0;
                floatBufferAsFloatBuffer.put(fArrBi).position(0);
            } else {
                i4 = 0;
                floatBufferAsFloatBuffer = this.G;
            }
            java.nio.FloatBuffer floatBuffer = floatBufferAsFloatBuffer;
            floatBuffer.position(i4);
            int i28 = jkdVarB2.d;
            android.opengl.GLES20.glVertexAttribPointer(i28, 3, 5126, false, 20, (java.nio.Buffer) floatBuffer);
            android.opengl.GLES20.glEnableVertexAttribArray(i28);
            floatBuffer.position(3);
            int i29 = jkdVarB2.e;
            android.opengl.GLES20.glVertexAttribPointer(i29, 2, 5126, false, 20, (java.nio.Buffer) floatBuffer);
            android.opengl.GLES20.glEnableVertexAttribArray(i29);
            android.opengl.GLES20.glUniformMatrix4fv(jkdVarB2.c, 1, false, this.U, 0);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
        }
        f7 = 80.0f;
        i3 = 1;
        r9 = 0;
        android.opengl.GLES20.glUniformMatrix4fv(jkdVarB2.b, i3, r9, fArr, r9);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(36197, this.P);
        if (z) {
            android.graphics.Rect rectU3 = u();
            jkrVar = this.c;
            jhiVar = ((defpackage.inh) jkrVar).w;
            jhiVar.getClass();
            defpackage.jhm jhmVarBk2 = bk(jhmVar);
            f8 = rectU3.left;
            f9 = rectU3.right;
            int i210 = rectU3.bottom;
            int i211 = jhiVar.g;
            int i212 = i211 - i210;
            int i213 = i211 - rectU3.top;
            jhwVar = this.C;
            f10 = i213;
            f11 = i212;
            if (jhwVar == null) {
                fD = (jkrVar.d() / 160.0f) * f7;
                i5 = this.k.l.a;
                if (i5 == 1) {
                    float fMax8 = fD * java.lang.Math.max(jhiVar.d, 1.0f);
                    f8 -= fMax8;
                    f9 += fMax8;
                } else if (i5 == 2) {
                    float fMin9 = fD / java.lang.Math.min(jhiVar.d, 1.0f);
                    f11 -= fMin9;
                    f10 += fMin9;
                }
            } else {
                fD = (jkrVar.d() / 160.0f) * f7;
                i5 = this.k.l.a;
                if (i5 == 1) {
                    float fMax9 = fD * java.lang.Math.max(jhiVar.d, 1.0f);
                    f8 -= fMax9;
                    f9 += fMax9;
                } else if (i5 == 2) {
                    float fMin10 = fD / java.lang.Math.min(jhiVar.d, 1.0f);
                    f11 -= fMin10;
                    f10 += fMin10;
                }
            }
            fMax = java.lang.Math.max(jhmVarBk2.a, f8);
            fMin = java.lang.Math.min(jhmVarBk2.c, f9);
            fMax2 = java.lang.Math.max(jhmVarBk2.b, f11);
            fMin2 = java.lang.Math.min(jhmVarBk2.d, f10);
            if (fMax < fMin) {
                f12 = fMax;
                fMin2 = fMax2;
            } else {
                f12 = fMax;
                fMin2 = fMax2;
            }
            float[] fArrBi2 = bi(new defpackage.jhm(this, fMax, fMin2, f12, fMax2));
            floatBufferAsFloatBuffer = this.ah;
            if (floatBufferAsFloatBuffer == null) {
                floatBufferAsFloatBuffer = java.nio.ByteBuffer.allocateDirect(80).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
                this.ah = floatBufferAsFloatBuffer;
            }
            floatBufferAsFloatBuffer.clear();
            i4 = 0;
            floatBufferAsFloatBuffer.put(fArrBi2).position(0);
        } else {
            i4 = 0;
            floatBufferAsFloatBuffer = this.G;
        }
        java.nio.FloatBuffer floatBuffer2 = floatBufferAsFloatBuffer;
        floatBuffer2.position(i4);
        int i214 = jkdVarB2.d;
        android.opengl.GLES20.glVertexAttribPointer(i214, 3, 5126, false, 20, (java.nio.Buffer) floatBuffer2);
        android.opengl.GLES20.glEnableVertexAttribArray(i214);
        floatBuffer2.position(3);
        int i215 = jkdVarB2.e;
        android.opengl.GLES20.glVertexAttribPointer(i215, 2, 5126, false, 20, (java.nio.Buffer) floatBuffer2);
        android.opengl.GLES20.glEnableVertexAttribArray(i215);
        android.opengl.GLES20.glUniformMatrix4fv(jkdVarB2.c, 1, false, this.U, 0);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
    }

    @Override // defpackage.jhl
    public final void aS(java.io.PrintWriter printWriter) {
        printWriter.println(this);
        try {
            defpackage.yfd yfdVar = this.W;
            if (yfdVar.size() <= 300) {
                printWriter.println("frameUpdateTimestamps=" + defpackage.ysr.ap(yfdVar));
                return;
            }
            j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(yfdVar).filter(new defpackage.hmj(6));
            int i = defpackage.ygw.d;
            defpackage.ygw ygwVar = (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
            printWriter.println("frameUpdateTimestamps");
            int i2 = 0;
            while (i2 < ygwVar.size()) {
                for (int i3 = 0; i3 < 300 && i2 < ygwVar.size(); i3++) {
                    printWriter.print(java.lang.String.valueOf(ygwVar.get(i2)) + ", ");
                    i2++;
                }
                printWriter.println();
            }
            printWriter.println("Timestamps Complete");
        } catch (java.util.ConcurrentModificationException unused) {
            printWriter.println("concurrent modification happened");
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a5 A[Catch: all -> 0x00c1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x0017, B:10:0x0028, B:12:0x008c, B:13:0x008e, B:19:0x0095, B:20:0x0096, B:22:0x00a5, B:23:0x00a7, B:29:0x00ae, B:30:0x00af, B:33:0x00b9, B:34:0x00c0, B:14:0x008f, B:15:0x0091, B:24:0x00a8, B:25:0x00aa), top: B:38:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.jhl
    public synchronized void aT(defpackage.jjn jjnVar) throws defpackage.jkc {
        if (!(jjnVar instanceof defpackage.jkb)) {
            throw new java.lang.IllegalArgumentException("GlProjectionWindowImpl requires a GlCompositionContext");
        }
        defpackage.yqm yqmVar = M;
        ((defpackage.yqj) yqmVar.l().ai((char) 2145)).y("init %s", this);
        int iJ = j();
        if (iJ != 0 && iJ != 5) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 2146)).y("window init called while not cleaned up %s", this);
            S();
            aU();
        }
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.P = i;
        android.opengl.GLES20.glBindTexture(36197, i);
        defpackage.jkc.a(yqmVar, "glBindTexture mTextureID");
        defpackage.jhi jhiVar = ((defpackage.inh) this.c).w;
        jhiVar.getClass();
        float fA = ((defpackage.jkb) jjnVar).a(jhiVar);
        android.opengl.GLES20.glTexParameterf(36197, 10241, fA);
        android.opengl.GLES20.glTexParameterf(36197, 10240, fA);
        android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
        defpackage.jkc.a(yqmVar, "glTexParameter");
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.P);
        int iBd = bd();
        int iBc = bc();
        surfaceTexture.setDefaultBufferSize(iBd, iBc);
        this.R = new android.view.Surface(surfaceTexture);
        surfaceTexture.setOnFrameAvailableListener(this);
        this.Q = surfaceTexture;
        boolean z = this.x;
        if (z) {
            synchronized (this.t) {
                this.v = 1;
            }
            bb();
            this.J.set(0);
            this.V.set(0);
            if (!z) {
                synchronized (this.t) {
                    this.v = 1;
                }
            }
            android.opengl.GLES20.glBindTexture(36197, 0);
            this.r.f(iBd, iBc);
        } else {
            bb();
            this.J.set(0);
            this.V.set(0);
            if (!z) {
                synchronized (this.t) {
                    this.v = 1;
                }
            }
            android.opengl.GLES20.glBindTexture(36197, 0);
            this.r.f(iBd, iBc);
        }
        throw th;
    }

    protected synchronized void aU() {
        ((defpackage.yqj) M.l().ai((char) 2152)).u("releaseSurfacesAndTextures");
        if (this.R != null) {
            this.R.release();
            this.R = null;
        }
        if (this.Q != null) {
            this.Q.release();
            this.Q = null;
        }
        int i = this.P;
        if (i != 0) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i}, 0);
            android.opengl.GLES20.glFinish();
            this.P = 0;
        }
    }

    @Override // defpackage.jhl
    public final synchronized void aV() {
        this.S = false;
        notify();
    }

    protected void aW() {
        defpackage.jhh jhhVar;
        defpackage.jhm jhmVar;
        com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams = this.k;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.f.a + projectionWindowDecorationParams.a);
        java.lang.Integer[] numArr = this.T;
        numArr[0] = numValueOf;
        numArr[1] = java.lang.Integer.valueOf(this.f.b + projectionWindowDecorationParams.d);
        numArr[2] = java.lang.Integer.valueOf(this.f.e - projectionWindowDecorationParams.c);
        numArr[3] = java.lang.Integer.valueOf(this.f.f - projectionWindowDecorationParams.b);
        if (projectionWindowDecorationParams.h) {
            jhmVar = new defpackage.jhm(this, this.f.a, this.f.f, this.f.e, this.f.b);
            jhhVar = this;
        } else {
            jhhVar = this;
            jhmVar = new defpackage.jhm(jhhVar, numArr[0].intValue(), numArr[3].intValue(), numArr[2].intValue(), numArr[1].intValue());
        }
        float[] fArrBi = jhhVar.bi(jhmVar);
        java.nio.FloatBuffer floatBufferAsFloatBuffer = java.nio.ByteBuffer.allocateDirect(80).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        jhhVar.G = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArrBi).position(0);
        ((defpackage.yqj) M.l().ai((char) 2153)).y("setNewVerticesData %s", jhhVar);
    }

    @Override // defpackage.jhl
    public final synchronized void aX(long j) {
        boolean z;
        ((defpackage.yqj) M.l().ai((char) 2157)).y("teardown %s", this);
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime + j;
        while (true) {
            z = this.S;
            if (!z || jElapsedRealtime >= j2) {
                break;
            }
            try {
                wait(j);
            } catch (java.lang.InterruptedException unused) {
            }
            jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        }
        if (z) {
            ((defpackage.yqj) ((defpackage.yqj) M.h()).ai((char) 2158)).y("Tearing down window that's still in use: %s", this);
        }
        aU();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.ad;
        int i = atomicInteger.get();
        if (i > 0) {
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.PROJECTION_WINDOW_MANAGER, defpackage.zbd.Hn);
            rrvVarH.w(i);
            com.google.android.gms.car.display.CarRegionId carRegionId = this.A;
            if (carRegionId != null) {
                rrvVarH.n(carRegionId);
            }
            android.content.ComponentName componentName = this.s;
            if (componentName != null) {
                rrvVarH.p(componentName);
            }
            defpackage.rqt.a(((defpackage.inh) this.c).l).c(rrvVarH.l());
            atomicInteger.set(0);
        }
    }

    final void aY(boolean z) {
        if (this.N) {
            synchronized (this.u) {
                if (z == this.O) {
                    return;
                }
                this.O = z;
                if (this.n && this.o) {
                    bn();
                }
            }
        }
    }

    @Override // defpackage.jhl
    public final boolean aZ() {
        defpackage.jhz jhzVar = (defpackage.jhz) this.X.get();
        return jhzVar != null && jhzVar.c();
    }

    @Override // defpackage.jha
    protected final void af() {
        if (this.Q != null) {
            this.Q.setDefaultBufferSize(bd(), bc());
        }
    }

    @Override // defpackage.jhf
    public final synchronized boolean ai(defpackage.jjn jjnVar, float[] fArr, defpackage.jhm jhmVar, int i) throws java.lang.Throwable {
        java.lang.Throwable th;
        float f;
        float[] fArr2;
        try {
            try {
                try {
                    if (!bg()) {
                        aY(false);
                        return false;
                    }
                    defpackage.jhz jhzVar = (defpackage.jhz) this.X.get();
                    float f2 = this.w;
                    if (jhzVar != null) {
                        defpackage.jib jibVarBf = bf(jhzVar);
                        if (bh(jhzVar)) {
                            float[] fArr3 = jibVarBf.a;
                            fArr3[12] = bj(fArr3[0], bd());
                            fArr3[13] = bj(fArr3[5], bc());
                        }
                        float[] fArr4 = this.L;
                        android.opengl.Matrix.multiplyMM(fArr4, 0, fArr, 0, jibVarBf.a, 0);
                        float f3 = jibVarBf.b;
                        f = f3 != 1.0f ? f3 : f2;
                        fArr2 = fArr4;
                    } else {
                        if (f2 == 0.0f) {
                            java.util.concurrent.TimeUnit.MILLISECONDS.getClass();
                            aY(false);
                            return false;
                        }
                        fArr2 = fArr;
                        f = f2;
                    }
                    this.V.incrementAndGet();
                    aR((defpackage.jkb) jjnVar, f, fArr2, jhmVar, i);
                    aY(true);
                    return true;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
        throw th;
    }

    @Override // defpackage.jhf
    public final synchronized boolean as() {
        boolean z = false;
        if (this.Q == null) {
            return false;
        }
        jhw jhwVar = this.C;
        synchronized (this.t) {
            if (j() >= 3) {
                if (aZ() || (jhwVar != null && jhwVar.m)) {
                    z = true;
                }
                return z;
            }
            long j = this.H;
            if (j == this.I) {
                return aZ() || (jhwVar != null && jhwVar.m) || this.K;
            }
            this.I = j;
            return true;
        }
    }

    @Override // defpackage.jha, defpackage.jhl
    public final void at(boolean z) {
        synchronized (this.u) {
            super.at(z);
            if (!z && this.O) {
                aY(false);
            }
        }
    }

    @Override // defpackage.jha
    public final void av(boolean z) {
        synchronized (this.u) {
            super.av(z);
            if (!z && this.O) {
                aY(false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // defpackage.jhl
    public final boolean ba() {
        boolean z;
        if (bg()) {
            defpackage.jkr jkrVar = this.c;
            java.util.UUID uuid = this.e;
            defpackage.inh inhVar = (defpackage.inh) jkrVar;
            if (inhVar.u == null || !inhVar.u.equals(uuid)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (!z) {
            this.ad.getAndIncrement();
        }
        return aG() && z;
    }

    public synchronized boolean bb() {
        android.graphics.SurfaceTexture surfaceTexture = this.Q;
        if (surfaceTexture != null) {
            synchronized (this.t) {
                if (j() < 3) {
                    surfaceTexture.updateTexImage();
                    surfaceTexture.getTransformMatrix(this.U);
                    long timestamp = surfaceTexture.getTimestamp();
                    if (timestamp == this.H) {
                        return aZ();
                    }
                    this.W.add(java.lang.Long.valueOf(timestamp));
                    this.H = timestamp;
                    this.J.getAndIncrement();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jha, defpackage.jhv
    public final void bp(android.view.MotionEvent motionEvent) {
        super.bp(motionEvent);
        this.r.removeCallbacks(this.ai);
        android.animation.ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.E = 1.0f;
        this.c.T();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        boolean z = true;
        boolean z2 = false;
        if (this.ae) {
            long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            if (this.ag == 0) {
                this.ag = jElapsedRealtimeNanos;
            } else {
                int i = this.af + 1;
                this.af = i;
                if (i == 60) {
                    defpackage.yqj yqjVar = (defpackage.yqj) M.l().ai(2151);
                    java.lang.String strF = F();
                    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                    long j = jElapsedRealtimeNanos - this.ag;
                    java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.NANOSECONDS;
                    yqjVar.ae(strF, 60.0d / ((j / 1000000) / 1000.0d));
                    this.af = 0;
                    this.ag = jElapsedRealtimeNanos;
                }
            }
        }
        synchronized (this.t) {
            if (j() == 2) {
                if (this.n) {
                    z2 = true;
                    z = false;
                } else {
                    z = false;
                }
            } else if (j() == 1) {
                z = false;
            }
        }
        if (z) {
            ((defpackage.yqj) M.l().ai(2150)).y("onFrameAvailable for non-active window %s", this);
            return;
        }
        bb();
        if (z2) {
            java.util.concurrent.TimeUnit.MILLISECONDS.getClass();
            defpackage.jkr jkrVar = this.c;
            if (((defpackage.inh) jkrVar).C) {
                ((defpackage.inh) jkrVar).aj.j();
                return;
            } else {
                ((defpackage.yqj) defpackage.inh.a.l().ai(529)).u("onFrameAvailable called but composition not running");
                return;
            }
        }
        java.util.concurrent.TimeUnit.MILLISECONDS.getClass();
        defpackage.jkr jkrVar2 = this.c;
        if (((defpackage.inh) jkrVar2).C) {
            defpackage.ina inaVar = ((defpackage.inh) jkrVar2).s;
        } else {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.f()).ai((char) 528)).u("onFrameAvailableForHiddenWindow called but composition not running");
        }
    }

    @Override // defpackage.jha
    public final java.lang.String toString() {
        java.lang.String string = super.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(string.substring(0, string.length() - 1));
        sb.append(",anim=");
        sb.append(aZ());
        sb.append(",surface=");
        sb.append(this.R);
        sb.append(",nupdated=");
        sb.append(this.J.get());
        sb.append(",nrendered=");
        sb.append(this.V.get());
        sb.append(",nonDrawnTouches=");
        sb.append(this.ad.get());
        sb.append(",tid=");
        sb.append(this.P);
        android.graphics.SurfaceTexture surfaceTexture = this.Q;
        if (surfaceTexture != null) {
            sb.append(", timestamp=");
            sb.append(surfaceTexture.getTimestamp());
        }
        sb.append(",vertices=");
        sb.append(java.util.Arrays.toString(this.T));
        sb.append('}');
        return sb.toString();
    }

    @Override // defpackage.jhf
    public final defpackage.jhm x() {
        return be(false);
    }
}
