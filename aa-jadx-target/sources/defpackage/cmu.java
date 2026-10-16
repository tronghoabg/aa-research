package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cmu implements defpackage.cmt {
    private static final java.util.concurrent.atomic.AtomicBoolean a = new java.util.concurrent.atomic.AtomicBoolean(true);
    private int A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private defpackage.ckz H;
    private final defpackage.khb I;
    private final defpackage.cmj b;
    private final android.view.RenderNode c;
    private long d;
    private android.graphics.Paint e;
    private android.graphics.Matrix f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private float k;
    private boolean l;
    private long m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private long s;
    private long t;
    private float u;
    private float v;
    private float w;
    private float x;
    private boolean y;
    private int z;

    public cmu(android.view.View view, defpackage.khb khbVar, defpackage.cmj cmjVar) {
        this.I = khbVar;
        this.b = cmjVar;
        android.view.RenderNode renderNodeCreate = android.view.RenderNode.create("Compose", view);
        this.c = renderNodeCreate;
        this.d = 0L;
        this.h = 0L;
        if (a.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            renderNodeCreate.setAmbientShadowColor(renderNodeCreate.getAmbientShadowColor());
            renderNodeCreate.setSpotShadowColor(renderNodeCreate.getSpotShadowColor());
            O();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        Q(0);
        this.i = 0;
        this.j = 3;
        this.k = 1.0f;
        this.m = 9205357640488583168L;
        this.n = 1.0f;
        this.o = 1.0f;
        this.s = -72057594037927936L;
        this.t = -72057594037927936L;
        this.x = 8.0f;
    }

    private final void P() {
        boolean z = this.y;
        boolean z2 = z && !this.g;
        boolean z3 = z && this.g;
        if (z2 != this.D) {
            this.D = z2;
            this.c.setClipToBounds(z2);
        }
        if (z3 != this.E) {
            this.E = z3;
            this.c.setClipToOutline(z3);
        }
    }

    private final void Q(int i) {
        android.view.RenderNode renderNode = this.c;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.e);
            renderNode.setHasOverlappingRendering(true);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.e);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final void R() {
        if (this.i != 1 && this.j == 3) {
            Q(0);
        } else {
            Q(1);
        }
    }

    private final void S() {
        long j = this.m;
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            this.l = false;
            android.view.RenderNode renderNode = this.c;
            renderNode.setPivotX(java.lang.Float.intBitsToFloat((int) (j >> 32)) + this.z);
            renderNode.setPivotY(java.lang.Float.intBitsToFloat((int) (this.m & 4294967295L)) + this.A);
            return;
        }
        this.l = true;
        android.view.RenderNode renderNode2 = this.c;
        renderNode2.setPivotX((((int) (this.d >> 32)) / 2.0f) + this.z);
        renderNode2.setPivotY((((int) (4294967295L & this.d)) / 2.0f) + this.A);
    }

    private final void T() {
        int i = this.F;
        int i2 = i - this.z;
        int i3 = this.G;
        int i4 = i3 - this.A;
        long j = this.d;
        this.c.setLeftTopRightBottom(i2, i4, i + ((int) (j >> 32)) + this.B, i3 + ((int) (j & 4294967295L)) + this.C);
    }

    @Override // defpackage.cmt
    public final void A(int i, int i2, int i3, int i4) {
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0) {
            defpackage.ckn.a("Outsets cannot be negative! Left: " + i + ", Top: " + i2 + ", Right: " + i3 + ", Bottom: " + i4);
        }
        int i5 = this.z;
        if (i == i5 && i2 == this.A && i3 == this.B && i4 == this.C) {
            return;
        }
        boolean z = true;
        if (i == i5 && i2 == this.A) {
            z = false;
        }
        this.z = i;
        this.A = i2;
        this.B = i3;
        this.C = i4;
        T();
        if (z) {
            S();
        }
    }

    @Override // defpackage.cmt
    public final void B(long j) {
        this.m = j;
        S();
    }

    @Override // defpackage.cmt
    public final void C(int i, int i2, long j) {
        this.F = i;
        this.G = i2;
        long j2 = this.d;
        this.d = j;
        T();
        if (j2 == j) {
            return;
        }
        if (this.l || this.m == 9205357640488583168L) {
            android.view.RenderNode renderNode = this.c;
            renderNode.setPivotX((((int) (j >> 32)) / 2.0f) + this.z);
            renderNode.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.A);
        }
    }

    @Override // defpackage.cmt
    public final void D(defpackage.ckz ckzVar) {
        this.H = ckzVar;
    }

    @Override // defpackage.cmt
    public final void E(float f) {
        this.u = f;
        this.c.setRotationX(f);
    }

    @Override // defpackage.cmt
    public final void F(float f) {
        this.v = f;
        this.c.setRotationY(f);
    }

    @Override // defpackage.cmt
    public final void G(float f) {
        this.w = f;
        this.c.setRotation(f);
    }

    @Override // defpackage.cmt
    public final void H(float f) {
        this.n = f;
        this.c.setScaleX(f);
    }

    @Override // defpackage.cmt
    public final void I(float f) {
        this.o = f;
        this.c.setScaleY(f);
    }

    @Override // defpackage.cmt
    public final void J(float f) {
        this.r = f;
        this.c.setElevation(f);
    }

    @Override // defpackage.cmt
    public final void K(long j) {
        this.t = j;
        float[] fArr = defpackage.clr.a;
        this.c.setSpotShadowColor((int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32));
    }

    @Override // defpackage.cmt
    public final void L(float f) {
        this.p = f;
        this.c.setTranslationX(f);
    }

    @Override // defpackage.cmt
    public final void M(float f) {
        this.q = f;
        this.c.setTranslationY(f);
    }

    @Override // defpackage.cmt
    public final boolean N() {
        return this.c.isValid();
    }

    public final void O() {
        this.c.discardDisplayList();
    }

    @Override // defpackage.cmt
    public final float a() {
        return this.k;
    }

    @Override // defpackage.cmt
    public final float b() {
        return this.x;
    }

    @Override // defpackage.cmt
    public final float c() {
        return this.u;
    }

    @Override // defpackage.cmt
    public final float d() {
        return this.v;
    }

    @Override // defpackage.cmt
    public final float e() {
        return this.w;
    }

    @Override // defpackage.cmt
    public final float f() {
        return this.n;
    }

    @Override // defpackage.cmt
    public final float g() {
        return this.o;
    }

    @Override // defpackage.cmt
    public final float h() {
        return this.r;
    }

    @Override // defpackage.cmt
    public final float i() {
        return this.p;
    }

    @Override // defpackage.cmt
    public final float j() {
        return this.q;
    }

    @Override // defpackage.cmt
    public final int k() {
        return this.j;
    }

    @Override // defpackage.cmt
    public final int l() {
        return this.i;
    }

    @Override // defpackage.cmt
    public final long m() {
        return this.s;
    }

    @Override // defpackage.cmt
    public final long n() {
        return this.t;
    }

    @Override // defpackage.cmt
    public final android.graphics.Matrix o() {
        android.graphics.Matrix matrix = this.f;
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            this.f = matrix;
        }
        this.c.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.cmt
    public final defpackage.ckz p() {
        return this.H;
    }

    @Override // defpackage.cmt
    public final void q() {
        O();
    }

    @Override // defpackage.cmt
    public final void r(defpackage.ckc ckcVar) {
        android.graphics.Canvas canvas = defpackage.cjn.a;
        ckcVar.getClass();
        android.view.DisplayListCanvas displayListCanvas = ((defpackage.cjm) ckcVar).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [ckc, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.cmt
    public final void s(defpackage.dlo dloVar, defpackage.dlz dlzVar, defpackage.cmq cmqVar, defpackage.affc affcVar) throws java.lang.Throwable {
        android.view.DisplayListCanvas displayListCanvas;
        defpackage.cmj cmjVar;
        defpackage.dlo dloVarC;
        defpackage.dlz dlzVarD;
        defpackage.ckc ckcVarB;
        long jA;
        defpackage.cmq cmqVar2;
        android.view.DisplayListCanvas displayListCanvasStart = this.c.start(java.lang.Math.max(((int) (this.d >> 32)) + this.z + this.B, (int) (this.h >> 32)), java.lang.Math.max(((int) (this.d & 4294967295L)) + this.A + this.C, (int) (this.h & 4294967295L)));
        float f = this.z;
        float f2 = this.A;
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f2);
        try {
            defpackage.khb khbVar = this.I;
            ?? r14 = khbVar.a;
            android.graphics.Canvas canvas = ((defpackage.cjm) r14).a;
            ((defpackage.cjm) r14).a = displayListCanvasStart;
            android.view.DisplayListCanvas displayListCanvas2 = null;
            try {
                if (this.z <= 0.0f) {
                    try {
                        if (this.A > 0.0f) {
                            displayListCanvas2 = displayListCanvasStart;
                            long j = (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
                            int i = (int) (j >> 32);
                            int i2 = (int) (j & 4294967295L);
                            r14.i(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2));
                            cmjVar = this.b;
                            long jF = defpackage.dlv.f(this.d);
                            defpackage.cmi cmiVar = cmjVar.b;
                            dloVarC = cmiVar.c();
                            dlzVarD = cmiVar.d();
                            ckcVarB = cmiVar.b();
                            jA = cmiVar.a();
                            cmqVar2 = cmiVar.a;
                            cmiVar.f(dloVar);
                            cmiVar.g(dlzVar);
                            cmiVar.e(r14);
                            cmiVar.h(jF);
                            cmiVar.a = cmqVar;
                            r14.g();
                            try {
                                affcVar.invoke(cmjVar);
                                r14.e();
                                defpackage.cmi cmiVar2 = cmjVar.b;
                                cmiVar2.f(dloVarC);
                                cmiVar2.g(dlzVarD);
                                cmiVar2.e(ckcVarB);
                                cmiVar2.h(jA);
                                cmiVar2.a = cmqVar2;
                                r14.i(-java.lang.Float.intBitsToFloat(i), -java.lang.Float.intBitsToFloat(i2));
                            } catch (java.lang.Throwable th) {
                                displayListCanvas = displayListCanvas2;
                                try {
                                    r14.e();
                                    defpackage.cmi cmiVar3 = cmjVar.b;
                                    cmiVar3.f(dloVarC);
                                    cmiVar3.g(dlzVarD);
                                    cmiVar3.e(ckcVarB);
                                    cmiVar3.h(jA);
                                    cmiVar3.a = cmqVar2;
                                    throw th;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    this.c.end(displayListCanvas);
                                    throw th;
                                }
                            }
                        } else {
                            defpackage.cmj cmjVar2 = this.b;
                            long jF2 = defpackage.dlv.f(this.d);
                            defpackage.cmi cmiVar4 = cmjVar2.b;
                            defpackage.dlo dloVarC2 = cmiVar4.c();
                            defpackage.dlz dlzVarD2 = cmiVar4.d();
                            defpackage.ckc ckcVarB2 = cmiVar4.b();
                            displayListCanvas2 = displayListCanvasStart;
                            long jA2 = cmiVar4.a();
                            defpackage.cmq cmqVar3 = cmiVar4.a;
                            cmiVar4.f(dloVar);
                            cmiVar4.g(dlzVar);
                            cmiVar4.e(r14);
                            cmiVar4.h(jF2);
                            cmiVar4.a = cmqVar;
                            r14.g();
                            try {
                                affcVar.invoke(cmjVar2);
                                r14.e();
                                defpackage.cmi cmiVar5 = cmjVar2.b;
                                cmiVar5.f(dloVarC2);
                                cmiVar5.g(dlzVarD2);
                                cmiVar5.e(ckcVarB2);
                                cmiVar5.h(jA2);
                                cmiVar5.a = cmqVar3;
                            } catch (java.lang.Throwable th3) {
                                r14.e();
                                defpackage.cmi cmiVar6 = cmjVar2.b;
                                cmiVar6.f(dloVarC2);
                                cmiVar6.g(dlzVarD2);
                                cmiVar6.e(ckcVarB2);
                                cmiVar6.h(jA2);
                                cmiVar6.a = cmqVar3;
                                throw th3;
                            }
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        displayListCanvas2 = displayListCanvasStart;
                        displayListCanvas = displayListCanvas2;
                        this.c.end(displayListCanvas);
                        throw th;
                    }
                } else {
                    displayListCanvas2 = displayListCanvasStart;
                    long j2 = (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
                    int i3 = (int) (j2 >> 32);
                    int i4 = (int) (j2 & 4294967295L);
                    r14.i(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i4));
                    cmjVar = this.b;
                    long jF3 = defpackage.dlv.f(this.d);
                    defpackage.cmi cmiVar7 = cmjVar.b;
                    dloVarC = cmiVar7.c();
                    dlzVarD = cmiVar7.d();
                    ckcVarB = cmiVar7.b();
                    jA = cmiVar7.a();
                    cmqVar2 = cmiVar7.a;
                    cmiVar7.f(dloVar);
                    cmiVar7.g(dlzVar);
                    cmiVar7.e(r14);
                    cmiVar7.h(jF3);
                    cmiVar7.a = cmqVar;
                    r14.g();
                    affcVar.invoke(cmjVar);
                    r14.e();
                    defpackage.cmi cmiVar8 = cmjVar.b;
                    cmiVar8.f(dloVarC);
                    cmiVar8.g(dlzVarD);
                    cmiVar8.e(ckcVarB);
                    cmiVar8.h(jA);
                    cmiVar8.a = cmqVar2;
                    r14.i(-java.lang.Float.intBitsToFloat(i3), -java.lang.Float.intBitsToFloat(i4));
                }
                ((defpackage.cjm) khbVar.a).a = canvas;
                this.c.end(displayListCanvas2);
            } catch (java.lang.Throwable th5) {
                th = th5;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            displayListCanvas = displayListCanvasStart;
        }
    }

    @Override // defpackage.cmt
    public final void t(float f) {
        this.k = f;
        this.c.setAlpha(f);
    }

    @Override // defpackage.cmt
    public final void u(long j) {
        this.s = j;
        float[] fArr = defpackage.clr.a;
        this.c.setAmbientShadowColor((int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32));
    }

    @Override // defpackage.cmt
    public final void v(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        android.graphics.Paint paint = this.e;
        if (paint == null) {
            paint = new android.graphics.Paint();
            this.e = paint;
        }
        paint.setXfermode(new android.graphics.PorterDuffXfermode(defpackage.bzo.x(i)));
        R();
    }

    @Override // defpackage.cmt
    public final void w(float f) {
        this.x = f;
        this.c.setCameraDistance(-f);
    }

    @Override // defpackage.cmt
    public final void x(boolean z) {
        this.y = z;
        P();
    }

    @Override // defpackage.cmt
    public final void y(int i) {
        this.i = i;
        R();
    }

    @Override // defpackage.cmt
    public final void z(android.graphics.Outline outline, long j) {
        this.h = j;
        this.c.setOutline(outline);
        this.g = outline != null;
        P();
    }
}
