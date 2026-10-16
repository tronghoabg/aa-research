package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cmv implements defpackage.cmt {
    private boolean A;
    private int B;
    private int C;
    private defpackage.ckz D;
    private int E;
    private final defpackage.khb F;
    private final defpackage.cmj a;
    private final android.graphics.RenderNode b;
    private long c;
    private android.graphics.Paint d;
    private android.graphics.Matrix e;
    private boolean f;
    private float g;
    private int h;
    private long i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private long o;
    private long p;
    private float q;
    private float r;
    private float s;
    private float t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private int y;
    private boolean z;

    public cmv(defpackage.khb khbVar, defpackage.cmj cmjVar) {
        this.F = khbVar;
        this.a = cmjVar;
        android.graphics.RenderNode renderNode = new android.graphics.RenderNode("graphicsLayer");
        this.b = renderNode;
        this.c = 0L;
        alh$.ExternalSyntheticApiModelOutline0.m(renderNode, false);
        P(renderNode, 0);
        this.g = 1.0f;
        this.h = 3;
        this.i = 9205357640488583168L;
        this.j = 1.0f;
        this.k = 1.0f;
        this.o = -72057594037927936L;
        this.p = -72057594037927936L;
        this.t = 8.0f;
        this.E = 0;
    }

    private final void O() {
        boolean z = this.u;
        boolean z2 = z && !this.f;
        boolean z3 = z && this.f;
        if (z2 != this.z) {
            this.z = z2;
            alh$.ExternalSyntheticApiModelOutline0.m(this.b, z2);
        }
        if (z3 != this.A) {
            this.A = z3;
            alh$.ExternalSyntheticApiModelOutline0.m$1(this.b, z3);
        }
    }

    private final void P(android.graphics.RenderNode renderNode, int i) {
        android.graphics.Paint paint = this.d;
        if (i == 1) {
            alh$.ExternalSyntheticApiModelOutline0.m(renderNode, true, paint);
            alh$.ExternalSyntheticApiModelOutline0.m$2(renderNode, true);
        } else {
            alh$.ExternalSyntheticApiModelOutline0.m(renderNode, false, paint);
            alh$.ExternalSyntheticApiModelOutline0.m$2(renderNode, true);
        }
    }

    private final void Q() {
        if (this.E != 1 && this.h == 3 && this.D == null) {
            P(this.b, 0);
        } else {
            P(this.b, 1);
        }
    }

    private final void R() {
        long j = this.i;
        long j2 = 9223372034707292159L & j;
        android.graphics.RenderNode renderNode = this.b;
        if (j2 == 9205357640488583168L) {
            alh$.ExternalSyntheticApiModelOutline0.m$3(renderNode, (java.lang.Float.intBitsToFloat((int) (this.c >> 32)) / 2.0f) + this.v);
            alh$.ExternalSyntheticApiModelOutline0.m$5(renderNode, (java.lang.Float.intBitsToFloat((int) (4294967295L & this.c)) / 2.0f) + this.w);
        } else {
            alh$.ExternalSyntheticApiModelOutline0.m$3(renderNode, java.lang.Float.intBitsToFloat((int) (j >> 32)) + this.v);
            alh$.ExternalSyntheticApiModelOutline0.m$5(renderNode, java.lang.Float.intBitsToFloat((int) (this.i & 4294967295L)) + this.w);
        }
    }

    private final void S() {
        int i = this.B;
        alh$.ExternalSyntheticApiModelOutline0.m(this.b, i - this.v, this.C - this.w, i + ((int) java.lang.Float.intBitsToFloat((int) (this.c >> 32))) + this.x, this.C + ((int) java.lang.Float.intBitsToFloat((int) (this.c & 4294967295L))) + this.y);
    }

    @Override // defpackage.cmt
    public final void A(int i, int i2, int i3, int i4) {
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0) {
            defpackage.ckn.a("Outsets cannot be negative! Left: " + i + ", Top: " + i2 + ", Right: " + i3 + ", Bottom: " + i4);
        }
        int i5 = this.v;
        if (i == i5 && i2 == this.w && i3 == this.x && i4 == this.y) {
            return;
        }
        boolean z = true;
        if (i == i5 && i2 == this.w) {
            z = false;
        }
        this.v = i;
        this.w = i2;
        this.x = i3;
        this.y = i4;
        S();
        if (z) {
            R();
        }
    }

    @Override // defpackage.cmt
    public final void B(long j) {
        this.i = j;
        R();
    }

    @Override // defpackage.cmt
    public final void C(int i, int i2, long j) {
        this.B = i;
        this.C = i2;
        long j2 = this.c;
        long jF = defpackage.dlv.f(j);
        this.c = defpackage.dlv.f(j);
        S();
        if ((j2 == jF) || this.i != 9205357640488583168L) {
            return;
        }
        android.graphics.RenderNode renderNode = this.b;
        alh$.ExternalSyntheticApiModelOutline0.m$3(renderNode, (((int) (j >> 32)) / 2.0f) + this.v);
        alh$.ExternalSyntheticApiModelOutline0.m$5(renderNode, (((int) (j & 4294967295L)) / 2.0f) + this.w);
    }

    @Override // defpackage.cmt
    public final void D(defpackage.ckz ckzVar) {
        this.D = ckzVar;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            a$.ExternalSyntheticApiModelOutline0.m(this.b, ckzVar != null ? ckzVar.a() : null);
        }
    }

    @Override // defpackage.cmt
    public final void E(float f) {
        this.q = f;
        alh$.ExternalSyntheticApiModelOutline0.m$10(this.b, f);
    }

    @Override // defpackage.cmt
    public final void F(float f) {
        this.r = f;
        alh$.ExternalSyntheticApiModelOutline0.m$8(this.b, f);
    }

    @Override // defpackage.cmt
    public final void G(float f) {
        this.s = f;
        alh$.ExternalSyntheticApiModelOutline0.m$2(this.b, f);
    }

    @Override // defpackage.cmt
    public final void H(float f) {
        this.j = f;
        alh$.ExternalSyntheticApiModelOutline0.m(this.b, f);
    }

    @Override // defpackage.cmt
    public final void I(float f) {
        this.k = f;
        alh$.ExternalSyntheticApiModelOutline0.m$4(this.b, f);
    }

    @Override // defpackage.cmt
    public final void J(float f) {
        this.n = f;
        alh$.ExternalSyntheticApiModelOutline0.m$6(this.b, f);
    }

    @Override // defpackage.cmt
    public final void K(long j) {
        this.p = j;
        float[] fArr = defpackage.clr.a;
        alh$.ExternalSyntheticApiModelOutline0.m(this.b, (int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32));
    }

    @Override // defpackage.cmt
    public final void L(float f) {
        this.l = f;
        alh$.ExternalSyntheticApiModelOutline0.m$11(this.b, f);
    }

    @Override // defpackage.cmt
    public final void M(float f) {
        this.m = f;
        alh$.ExternalSyntheticApiModelOutline0.m$1(this.b, f);
    }

    @Override // defpackage.cmt
    public final boolean N() {
        return alh$.ExternalSyntheticApiModelOutline0.m(this.b);
    }

    @Override // defpackage.cmt
    public final float a() {
        return this.g;
    }

    @Override // defpackage.cmt
    public final float b() {
        return this.t;
    }

    @Override // defpackage.cmt
    public final float c() {
        return this.q;
    }

    @Override // defpackage.cmt
    public final float d() {
        return this.r;
    }

    @Override // defpackage.cmt
    public final float e() {
        return this.s;
    }

    @Override // defpackage.cmt
    public final float f() {
        return this.j;
    }

    @Override // defpackage.cmt
    public final float g() {
        return this.k;
    }

    @Override // defpackage.cmt
    public final float h() {
        return this.n;
    }

    @Override // defpackage.cmt
    public final float i() {
        return this.l;
    }

    @Override // defpackage.cmt
    public final float j() {
        return this.m;
    }

    @Override // defpackage.cmt
    public final int k() {
        return this.h;
    }

    @Override // defpackage.cmt
    public final int l() {
        return this.E;
    }

    @Override // defpackage.cmt
    public final long m() {
        return this.o;
    }

    @Override // defpackage.cmt
    public final long n() {
        return this.p;
    }

    @Override // defpackage.cmt
    public final android.graphics.Matrix o() {
        android.graphics.Matrix matrix = this.e;
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            this.e = matrix;
        }
        alh$.ExternalSyntheticApiModelOutline0.m(this.b, matrix);
        return matrix;
    }

    @Override // defpackage.cmt
    public final defpackage.ckz p() {
        return this.D;
    }

    @Override // defpackage.cmt
    public final void q() {
        alh$.ExternalSyntheticApiModelOutline0.m$1(this.b);
    }

    @Override // defpackage.cmt
    public final void r(defpackage.ckc ckcVar) {
        android.graphics.Canvas canvas = defpackage.cjn.a;
        ckcVar.getClass();
        alh$.ExternalSyntheticApiModelOutline0.m(((defpackage.cjm) ckcVar).a, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [ckc, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.cmt
    public final void s(defpackage.dlo dloVar, defpackage.dlz dlzVar, defpackage.cmq cmqVar, defpackage.affc affcVar) {
        android.graphics.RecordingCanvas recordingCanvasM = alh$.ExternalSyntheticApiModelOutline0.m(this.b);
        float f = this.v;
        float f2 = this.w;
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f2);
        try {
            ?? r5 = this.F.a;
            android.graphics.Canvas canvas = ((defpackage.cjm) r5).a;
            ((defpackage.cjm) r5).a = recordingCanvasM;
            defpackage.cmj cmjVar = this.a;
            defpackage.cmi cmiVar = cmjVar.b;
            cmiVar.f(dloVar);
            cmiVar.g(dlzVar);
            cmiVar.a = cmqVar;
            cmiVar.h(this.c);
            cmiVar.e(r5);
            if (this.v > 0.0f || this.w > 0.0f) {
                long j = (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
                int i = (int) (j >> 32);
                int i2 = (int) (4294967295L & j);
                r5.i(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2));
                affcVar.invoke(cmjVar);
                r5.i(-java.lang.Float.intBitsToFloat(i), -java.lang.Float.intBitsToFloat(i2));
            } else {
                affcVar.invoke(cmjVar);
            }
            ((defpackage.cjm) r5).a = canvas;
        } finally {
            alh$.ExternalSyntheticApiModelOutline0.m(this.b);
        }
    }

    @Override // defpackage.cmt
    public final void t(float f) {
        this.g = f;
        alh$.ExternalSyntheticApiModelOutline0.m$7(this.b, f);
    }

    @Override // defpackage.cmt
    public final void u(long j) {
        this.o = j;
        float[] fArr = defpackage.clr.a;
        alh$.ExternalSyntheticApiModelOutline0.m$1(this.b, (int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32));
    }

    @Override // defpackage.cmt
    public final void v(int i) {
        this.h = i;
        android.graphics.Paint paint = this.d;
        if (paint == null) {
            paint = new android.graphics.Paint();
            this.d = paint;
        }
        alh$.ExternalSyntheticApiModelOutline0.m(paint, defpackage.bzo.w(i));
        Q();
    }

    @Override // defpackage.cmt
    public final void w(float f) {
        this.t = f;
        alh$.ExternalSyntheticApiModelOutline0.m$9(this.b, f);
    }

    @Override // defpackage.cmt
    public final void x(boolean z) {
        this.u = z;
        O();
    }

    @Override // defpackage.cmt
    public final void y(int i) {
        this.E = i;
        Q();
    }

    @Override // defpackage.cmt
    public final void z(android.graphics.Outline outline, long j) {
        alh$.ExternalSyntheticApiModelOutline0.m(this.b, outline);
        this.f = outline != null;
        O();
    }
}
