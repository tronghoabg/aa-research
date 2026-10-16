package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cmx implements defpackage.cmt {
    private static final android.graphics.Canvas a = new defpackage.cmw();
    private float A;
    private int B;
    private int C;
    private int D;
    private int E;
    private defpackage.ckz F;
    private final defpackage.khb G;
    private final defpackage.cna b;
    private final defpackage.cmz c;
    private final android.content.res.Resources d;
    private final android.graphics.Rect e;
    private android.graphics.Paint f;
    private int g;
    private int h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private float o;
    private boolean p;
    private long q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private long w;
    private long x;
    private float y;
    private float z;

    public /* synthetic */ cmx(defpackage.cna cnaVar) {
        defpackage.khb khbVar = new defpackage.khb((short[]) null);
        defpackage.cmj cmjVar = new defpackage.cmj();
        this.b = cnaVar;
        this.G = khbVar;
        defpackage.cmz cmzVar = new defpackage.cmz(cnaVar, khbVar, cmjVar);
        this.c = cmzVar;
        this.d = cnaVar.getResources();
        this.e = new android.graphics.Rect();
        cnaVar.addView(cmzVar);
        cmzVar.setClipBounds(null);
        this.i = 0L;
        android.view.View.generateViewId();
        this.m = 3;
        this.n = 0;
        this.o = 1.0f;
        this.q = 9205357640488583168L;
        this.r = 1.0f;
        this.s = 1.0f;
        this.w = -72057594037927936L;
        this.x = -72057594037927936L;
    }

    private final void P(int i) {
        defpackage.cmz cmzVar = this.c;
        android.graphics.Paint paint = this.f;
        if (i == 1) {
            cmzVar.setLayerType(2, paint);
        } else {
            cmzVar.setLayerType(0, paint);
        }
        if (!cmzVar.c) {
            cmzVar.c = true;
            cmzVar.invalidate();
        }
    }

    private final void Q() {
        if (O()) {
            this.j = true;
        }
        defpackage.cmz cmzVar = this.c;
        int i = this.g;
        int i2 = i - this.B;
        int i3 = this.h;
        int i4 = i3 - this.C;
        long j = this.i;
        cmzVar.layout(i2, i4, i + ((int) (j >> 32)) + this.D, i3 + ((int) (j & 4294967295L)) + this.E);
    }

    private final void R() {
        if (this.n != 1 && this.m == 3) {
            P(0);
        } else {
            P(1);
        }
    }

    private final void S() {
        if (!this.p) {
            long j = this.q;
            if (j != 9205357640488583168L) {
                defpackage.cmz cmzVar = this.c;
                cmzVar.setPivotX(java.lang.Float.intBitsToFloat((int) (j >> 32)) + this.B);
                cmzVar.setPivotY(java.lang.Float.intBitsToFloat((int) (4294967295L & this.q)) + this.C);
                return;
            }
        }
        defpackage.cmz cmzVar2 = this.c;
        cmzVar2.setPivotX((((int) (this.i >> 32)) / 2.0f) + this.B);
        cmzVar2.setPivotY((((int) (4294967295L & this.i)) / 2.0f) + this.C);
    }

    @Override // defpackage.cmt
    public final void A(int i, int i2, int i3, int i4) {
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0) {
            defpackage.ckn.a("Outsets cannot be negative! Left: " + i + ", Top: " + i2 + ", Right: " + i3 + ", Bottom: " + i4);
        }
        int i5 = this.B;
        if (i == i5 && i2 == this.C && i3 == this.D && i4 == this.E) {
            return;
        }
        boolean z = true;
        if (i == i5 && i2 == this.C) {
            z = false;
        }
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = i4;
        Q();
        if (z) {
            S();
        }
    }

    @Override // defpackage.cmt
    public final void B(long j) {
        this.q = j;
        this.p = (j & 9223372034707292159L) == 9205357640488583168L;
        S();
    }

    @Override // defpackage.cmt
    public final void C(int i, int i2, long j) {
        if (this.i != j) {
            this.g = i;
            this.h = i2;
            this.i = j;
            Q();
            return;
        }
        int i3 = this.g;
        if (i3 != i) {
            this.c.offsetLeftAndRight(i - i3);
        }
        int i4 = this.h;
        if (i4 != i2) {
            this.c.offsetTopAndBottom(i2 - i4);
        }
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.cmt
    public final void D(defpackage.ckz ckzVar) {
        this.F = ckzVar;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            a$.ExternalSyntheticApiModelOutline0.m(this.c, ckzVar != null ? ckzVar.a() : null);
        }
    }

    @Override // defpackage.cmt
    public final void E(float f) {
        this.y = f;
        this.c.setRotationX(f);
    }

    @Override // defpackage.cmt
    public final void F(float f) {
        this.z = f;
        this.c.setRotationY(f);
    }

    @Override // defpackage.cmt
    public final void G(float f) {
        this.A = f;
        this.c.setRotation(f);
    }

    @Override // defpackage.cmt
    public final void H(float f) {
        this.r = f;
        this.c.setScaleX(f);
    }

    @Override // defpackage.cmt
    public final void I(float f) {
        this.s = f;
        this.c.setScaleY(f);
    }

    @Override // defpackage.cmt
    public final void J(float f) {
        this.v = f;
        this.c.setElevation(f);
    }

    @Override // defpackage.cmt
    public final void K(long j) {
        this.x = j;
        float[] fArr = defpackage.clr.a;
        hh$.ExternalSyntheticApiModelOutline0.m$1(this.c, (int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32));
    }

    @Override // defpackage.cmt
    public final void L(float f) {
        this.t = f;
        this.c.setTranslationX(f);
    }

    @Override // defpackage.cmt
    public final void M(float f) {
        this.u = f;
        this.c.setTranslationY(f);
    }

    @Override // defpackage.cmt
    public final /* synthetic */ boolean N() {
        return true;
    }

    public final boolean O() {
        return this.l || this.c.getClipToOutline();
    }

    @Override // defpackage.cmt
    public final float a() {
        return this.o;
    }

    @Override // defpackage.cmt
    public final float b() {
        return this.c.getCameraDistance() / this.d.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.cmt
    public final float c() {
        return this.y;
    }

    @Override // defpackage.cmt
    public final float d() {
        return this.z;
    }

    @Override // defpackage.cmt
    public final float e() {
        return this.A;
    }

    @Override // defpackage.cmt
    public final float f() {
        return this.r;
    }

    @Override // defpackage.cmt
    public final float g() {
        return this.s;
    }

    @Override // defpackage.cmt
    public final float h() {
        return this.v;
    }

    @Override // defpackage.cmt
    public final float i() {
        return this.t;
    }

    @Override // defpackage.cmt
    public final float j() {
        return this.u;
    }

    @Override // defpackage.cmt
    public final int k() {
        return this.m;
    }

    @Override // defpackage.cmt
    public final int l() {
        return this.n;
    }

    @Override // defpackage.cmt
    public final long m() {
        return this.w;
    }

    @Override // defpackage.cmt
    public final long n() {
        return this.x;
    }

    @Override // defpackage.cmt
    public final android.graphics.Matrix o() {
        return this.c.getMatrix();
    }

    @Override // defpackage.cmt
    public final defpackage.ckz p() {
        return this.F;
    }

    @Override // defpackage.cmt
    public final void q() {
        this.b.removeViewInLayout(this.c);
    }

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
    public final void r(defpackage.ckc ckcVar) {
        if (this.j) {
            defpackage.cmz cmzVar = this.c;
            android.graphics.Rect rect = null;
            if (O() && !this.k) {
                rect = this.e;
                rect.left = 0;
                rect.top = 0;
                rect.right = cmzVar.getWidth();
                rect.bottom = cmzVar.getHeight();
            }
            cmzVar.setClipBounds(rect);
        }
        android.graphics.Canvas canvas = defpackage.cjn.a;
        ckcVar.getClass();
        if (((defpackage.cjm) ckcVar).a.isHardwareAccelerated()) {
            defpackage.cna cnaVar = this.b;
            defpackage.cmz cmzVar2 = this.c;
            cnaVar.a(ckcVar, cmzVar2, cmzVar2.getDrawingTime());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5, types: [ckc, java.lang.Object] */
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
    public final void s(defpackage.dlo dloVar, defpackage.dlz dlzVar, defpackage.cmq cmqVar, defpackage.affc affcVar) {
        defpackage.cmz cmzVar = this.c;
        if (cmzVar.getParent() == null) {
            this.b.addView(cmzVar);
        }
        float f = this.B;
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(this.C)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32);
        int i = (int) (jFloatToRawIntBits & 4294967295L);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i);
        cmzVar.d = dloVar;
        cmzVar.e = dlzVar;
        cmzVar.f = affcVar;
        cmzVar.g = cmqVar;
        cmzVar.h = fIntBitsToFloat;
        cmzVar.i = fIntBitsToFloat2;
        if (cmzVar.isAttachedToWindow()) {
            cmzVar.setVisibility(4);
            cmzVar.setVisibility(0);
            try {
                defpackage.khb khbVar = this.G;
                android.graphics.Canvas canvas = a;
                ?? r9 = khbVar.a;
                android.graphics.Canvas canvas2 = ((defpackage.cjm) r9).a;
                ((defpackage.cjm) r9).a = canvas;
                this.b.a(r9, cmzVar, cmzVar.getDrawingTime());
                ((defpackage.cjm) r9).a = canvas2;
            } catch (java.lang.ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.cmt
    public final void t(float f) {
        this.o = f;
        this.c.setAlpha(f);
    }

    @Override // defpackage.cmt
    public final void u(long j) {
        this.w = j;
        float[] fArr = defpackage.clr.a;
        hh$.ExternalSyntheticApiModelOutline0.m(this.c, (int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32));
    }

    @Override // defpackage.cmt
    public final void v(int i) {
        this.m = i;
        android.graphics.Paint paint = this.f;
        if (paint == null) {
            paint = new android.graphics.Paint();
            this.f = paint;
        }
        paint.setXfermode(new android.graphics.PorterDuffXfermode(defpackage.bzo.x(i)));
        R();
    }

    @Override // defpackage.cmt
    public final void w(float f) {
        this.c.setCameraDistance(f * this.d.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.cmt
    public final void x(boolean z) {
        this.l = z && !this.k;
        this.j = true;
        this.c.setClipToOutline(z && this.k);
    }

    @Override // defpackage.cmt
    public final void y(int i) {
        this.n = i;
        R();
    }

    @Override // defpackage.cmt
    public final void z(android.graphics.Outline outline, long j) {
        defpackage.cmz cmzVar = this.c;
        cmzVar.b = outline;
        cmzVar.invalidateOutline();
        if (O() && outline != null) {
            cmzVar.setClipToOutline(true);
            if (this.l) {
                this.l = false;
                this.j = true;
            }
        }
        this.k = outline != null;
    }
}
