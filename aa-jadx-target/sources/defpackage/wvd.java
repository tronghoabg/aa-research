package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class wvd extends android.graphics.drawable.Drawable implements wvt {
    public static final /* synthetic */ int B = 0;
    private static final java.lang.String a = "wvd";
    private static final android.graphics.Paint b;
    private static final defpackage.wvc[] c;
    public defpackage.xei A;
    private boolean C;
    private defpackage.wvi D;
    private emw E;
    private float[] F;
    private final defpackage.xei G;
    private final defpackage.xei H;
    private final android.graphics.Matrix d;
    private final android.graphics.Path e;
    private final android.graphics.RectF f;
    private final android.graphics.RectF g;
    private final android.graphics.Region h;
    private final android.graphics.Region i;
    private final android.graphics.Paint j;
    private final android.graphics.Paint k;
    private final defpackage.wuu l;
    private final defpackage.wvk m;
    private android.graphics.PorterDuffColorFilter n;
    private final android.graphics.RectF o;
    public defpackage.wvb p;
    public final defpackage.wvr[] q;
    public final defpackage.wvr[] r;
    public final java.util.BitSet s;
    public boolean t;
    public boolean u;
    public final android.graphics.Path v;
    public int w;
    public boolean x;
    emv[] y;
    public float[] z;

    static {
        defpackage.xta xtaVar = new defpackage.xta((char[]) null);
        int i = 0;
        xtaVar.r(defpackage.wva.u(0));
        xtaVar.l(0.0f);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        b = paint;
        paint.setColor(-1);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        c = new defpackage.wvc[4];
        while (true) {
            defpackage.wvc[] wvcVarArr = c;
            int length = wvcVarArr.length;
            if (i >= 4) {
                return;
            }
            wvcVarArr[i] = new defpackage.wvc(i);
            i++;
        }
    }

    protected wvd(defpackage.wvb wvbVar) {
        this.H = new defpackage.xei(this);
        this.q = new defpackage.wvr[4];
        this.r = new defpackage.wvr[4];
        this.s = new java.util.BitSet(8);
        this.d = new android.graphics.Matrix();
        this.v = new android.graphics.Path();
        this.e = new android.graphics.Path();
        this.f = new android.graphics.RectF();
        this.g = new android.graphics.RectF();
        this.h = new android.graphics.Region();
        this.i = new android.graphics.Region();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.j = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.k = paint2;
        this.l = new defpackage.wuu();
        this.m = defpackage.wvk.a();
        this.o = new android.graphics.RectF();
        this.x = true;
        this.C = true;
        this.y = new emv[4];
        this.p = wvbVar;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        k();
        j(getState());
        this.G = new defpackage.xei(this);
    }

    public static defpackage.wvd G(android.content.Context context, float f, android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = android.content.res.ColorStateList.valueOf(defpackage.sqs.bC(context, "wvd"));
        }
        defpackage.wvd wvdVar = new defpackage.wvd();
        wvdVar.K(context);
        wvdVar.O(colorStateList);
        wvdVar.N(f);
        return wvdVar;
    }

    private final android.graphics.RectF b() {
        android.graphics.RectF rectF = this.g;
        rectF.set(F());
        float fW = w();
        rectF.inset(fW, fW);
        return rectF;
    }

    private final void c(android.graphics.RectF rectF, android.graphics.Path path) {
        H(rectF, path);
        if (this.p.j != 1.0f) {
            android.graphics.Matrix matrix = this.d;
            matrix.reset();
            float f = this.p.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.o, true);
    }

    private final void e(android.graphics.Canvas canvas) {
        if (this.s.cardinality() > 0) {
            android.util.Log.w(a, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.p.s != 0) {
            canvas.drawPath(this.v, this.l.e);
        }
        for (int i = 0; i < 4; i++) {
            defpackage.wvr[] wvrVarArr = this.q;
            defpackage.wuu wuuVar = this.l;
            wvrVarArr[i].c(wuuVar, this.p.r, canvas);
            this.r[i].c(wuuVar, this.p.r, canvas);
        }
        if (this.x) {
            int iB = B();
            int iC = C();
            canvas.translate(-iB, -iC);
            canvas.drawPath(this.v, b);
            canvas.translate(iB, iC);
        }
    }

    private final void f(int[] iArr, boolean z) {
        boolean z2;
        boolean z3;
        android.graphics.RectF rectFF = F();
        if (!this.p.a.e() || rectFF.isEmpty()) {
            return;
        }
        boolean z4 = z | (this.E == null);
        if (this.z == null) {
            this.z = new float[4];
        }
        defpackage.wvi wviVarB = this.p.a.b(iArr);
        float[] fArr = this.z;
        int length = fArr.length;
        float f = fArr[0];
        int i = 1;
        while (true) {
            int length2 = fArr.length;
            if (i >= 4) {
                if (wviVarB.h(F())) {
                    z2 = true;
                    break;
                }
            } else if (fArr[i] == f) {
                i++;
            }
            z2 = false;
            break;
        }
        this.C = z2;
        if (!z2) {
            this.t = true;
            this.u = true;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            float fA = defpackage.wvk.b(i2, wviVarB).a(rectFF);
            if (z4) {
                this.z[i2] = fA;
                z3 = true;
            } else {
                z3 = false;
            }
            emv emvVar = this.y[i2];
            if (emvVar != null) {
                emvVar.k(fA);
                if (z3) {
                    this.y[i2].l();
                }
            }
        }
        if (z4) {
            invalidateSelf();
        }
    }

    private final boolean g() {
        defpackage.wvb wvbVar = this.p;
        int i = wvbVar.q;
        return wvbVar.r > 0 && !X() && !this.v.isConvex() && android.os.Build.VERSION.SDK_INT < 29;
    }

    private final boolean h() {
        return (this.p.v == android.graphics.Paint.Style.FILL_AND_STROKE || this.p.v == android.graphics.Paint.Style.STROKE) && this.k.getStrokeWidth() > 0.0f;
    }

    private final boolean i() {
        return g() || !X();
    }

    private final boolean j(int[] iArr) {
        android.graphics.Paint paint;
        int color;
        int colorForState;
        android.graphics.Paint paint2;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.p.d != null && color2 != (colorForState2 = this.p.d.getColorForState(iArr, (color2 = (paint2 = this.j).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.p.e == null || color == (colorForState = this.p.e.getColorForState(iArr, (color = (paint = this.k).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    private final boolean k() {
        android.graphics.PorterDuffColorFilter porterDuffColorFilter;
        android.graphics.PorterDuffColorFilter porterDuffColorFilter2 = this.n;
        defpackage.wvb wvbVar = this.p;
        android.content.res.ColorStateList colorStateList = wvbVar.g;
        android.graphics.PorterDuff.Mode mode = wvbVar.h;
        if (colorStateList == null || mode == null) {
            int color = this.j.getColor();
            int iA = A(color);
            this.w = iA;
            porterDuffColorFilter = iA != color ? new android.graphics.PorterDuffColorFilter(iA, android.graphics.PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iA2 = A(colorStateList.getColorForState(getState(), 0));
            this.w = iA2;
            porterDuffColorFilter = new android.graphics.PorterDuffColorFilter(iA2, mode);
        }
        this.n = porterDuffColorFilter;
        defpackage.wvb wvbVar2 = this.p;
        android.content.res.ColorStateList colorStateList2 = wvbVar2.f;
        android.graphics.PorterDuff.Mode mode2 = wvbVar2.h;
        boolean z = wvbVar2.u;
        return (j$.util.Objects.equals(porterDuffColorFilter2, this.n) && j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) ? false : true;
    }

    protected final int A(int i) {
        float fZ = z();
        defpackage.wvb wvbVar = this.p;
        float f = fZ + wvbVar.n;
        defpackage.wpw wpwVar = wvbVar.b;
        return wpwVar != null ? wpwVar.a(i, f) : i;
    }

    public final int B() {
        defpackage.wvb wvbVar = this.p;
        double d = wvbVar.s;
        int i = wvbVar.t;
        return (int) (d * 0.0d);
    }

    public final int C() {
        defpackage.wvb wvbVar = this.p;
        double d = wvbVar.s;
        int i = wvbVar.t;
        return (int) (d * 1.0d);
    }

    public final android.content.res.ColorStateList D() {
        return this.p.d;
    }

    public final android.content.res.ColorStateList E() {
        return this.p.e;
    }

    public final android.graphics.RectF F() {
        android.graphics.RectF rectF = this.f;
        rectF.set(getBounds());
        return rectF;
    }

    protected final void H(android.graphics.RectF rectF, android.graphics.Path path) {
        this.m.c(this.p.a.a(), this.z, this.p.k, rectF, this.G, path);
    }

    public final void I(android.graphics.Canvas canvas, android.graphics.Paint paint, android.graphics.Path path, defpackage.wvi wviVar, float[] fArr, android.graphics.RectF rectF) {
        float fT = t(rectF, wviVar, fArr);
        if (fT < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fT * this.p.k;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    protected void J(android.graphics.Canvas canvas) {
        I(canvas, this.k, this.e, this.D, this.F, b());
    }

    public final void K(android.content.Context context) {
        this.p.b = new defpackage.wpw(context);
        W();
    }

    public final void L(wuy wuyVar) {
        d(this.p.a.d(wuyVar));
    }

    public final void M(emw emwVar) {
        if (this.E == emwVar) {
            return;
        }
        this.E = emwVar;
        int i = 0;
        while (true) {
            emv[] emvVarArr = this.y;
            int length = emvVarArr.length;
            if (i >= 4) {
                f(getState(), true);
                invalidateSelf();
                return;
            }
            if (emvVarArr[i] == null) {
                emvVarArr[i] = new emv(this, c[i]);
            }
            emv emvVar = this.y[i];
            emw emwVar2 = new emw();
            emwVar2.c((float) emwVar.b);
            double d = emwVar.a;
            emwVar2.e((float) (d * d));
            emvVar.s = emwVar2;
            i++;
        }
    }

    public final void N(float f) {
        defpackage.wvb wvbVar = this.p;
        if (wvbVar.o != f) {
            wvbVar.o = f;
            W();
        }
    }

    public final void O(android.content.res.ColorStateList colorStateList) {
        defpackage.wvb wvbVar = this.p;
        if (wvbVar.d != colorStateList) {
            wvbVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void P(float f) {
        defpackage.wvb wvbVar = this.p;
        if (wvbVar.k != f) {
            wvbVar.k = f;
            this.t = true;
            this.u = true;
            invalidateSelf();
        }
    }

    public final void Q(int i, int i2, int i3, int i4) {
        defpackage.wvb wvbVar = this.p;
        if (wvbVar.i == null) {
            wvbVar.i = new android.graphics.Rect();
        }
        this.p.i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public final void R(wvh wvhVar) {
        if (wvhVar instanceof defpackage.wvi) {
            d((defpackage.wvi) wvhVar);
            return;
        }
        defpackage.wvv wvvVar = (defpackage.wvv) wvhVar;
        defpackage.wvb wvbVar = this.p;
        if (wvbVar.a != wvvVar) {
            wvbVar.a = wvvVar;
            f(getState(), true);
            invalidateSelf();
        }
    }

    public final void S(float f, int i) {
        V(f);
        U(android.content.res.ColorStateList.valueOf(i));
    }

    public final void T(float f, android.content.res.ColorStateList colorStateList) {
        V(f);
        U(colorStateList);
    }

    public final void U(android.content.res.ColorStateList colorStateList) {
        defpackage.wvb wvbVar = this.p;
        if (wvbVar.e != colorStateList) {
            wvbVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void V(float f) {
        this.p.l = f;
        invalidateSelf();
    }

    public final void W() {
        float fZ = z();
        this.p.r = (int) java.lang.Math.ceil(0.75f * fZ);
        this.p.s = (int) java.lang.Math.ceil(fZ * 0.25f);
        k();
        if (i()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean X() {
        if (this.p.a.b(getState()).h(F())) {
            return this.z == null || this.C;
        }
        return false;
    }

    public final void Y() {
        this.l.a(-12303292);
        this.p.u = false;
        super.invalidateSelf();
    }

    public final void d(defpackage.wvi wviVar) {
        this.p.a = wviVar;
        this.z = null;
        this.F = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = this.j;
        paint.setColorFilter(this.n);
        int alpha = paint.getAlpha();
        int i = this.p.m;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        android.graphics.Paint paint2 = this.k;
        paint2.setColorFilter(null);
        paint2.setStrokeWidth(this.p.l);
        int alpha2 = paint2.getAlpha();
        int i2 = this.p.m;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean zI = i();
        if (this.p.v == android.graphics.Paint.Style.FILL_AND_STROKE || this.p.v == android.graphics.Paint.Style.FILL) {
            if (this.t) {
                if (zI) {
                    c(F(), this.v);
                }
                this.t = false;
            }
            if (g()) {
                canvas.save();
                canvas.translate(B(), C());
                if (this.x) {
                    android.graphics.Rect bounds = getBounds();
                    android.graphics.RectF rectF = this.o;
                    float fWidth = rectF.width() - bounds.width();
                    int iHeight = (int) (rectF.height() - bounds.height());
                    int i3 = (int) fWidth;
                    if (i3 < 0 || iHeight < 0) {
                        throw new java.lang.IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: " + i3 + " extra height: " + iHeight + " path bounds: " + java.lang.String.valueOf(rectF));
                    }
                    int iWidth = (int) rectF.width();
                    int i4 = this.p.r;
                    int i5 = iWidth + i4 + i4 + i3;
                    int iHeight2 = (int) rectF.height();
                    int i6 = this.p.r;
                    android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i5, iHeight2 + i6 + i6 + iHeight, android.graphics.Bitmap.Config.ARGB_8888);
                    android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmapCreateBitmap);
                    float f = (bounds.left - this.p.r) - i3;
                    float f2 = (bounds.top - this.p.r) - iHeight;
                    canvas2.translate(-f, -f2);
                    e(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (android.graphics.Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            I(canvas, paint, this.v, this.p.a.a(), this.z, F());
        }
        if (h()) {
            if (this.u) {
                defpackage.wvi wviVarEL = eL();
                defpackage.xei xeiVar = this.H;
                defpackage.xta xtaVar = new defpackage.xta(wviVarEL);
                xtaVar.j = xeiVar.f(wviVarEL.b);
                xtaVar.i = xeiVar.f(wviVarEL.c);
                xtaVar.f = xeiVar.f(wviVarEL.e);
                xtaVar.g = xeiVar.f(wviVarEL.d);
                this.D = new defpackage.wvi(xtaVar);
                if (this.z != null) {
                    if (this.F == null) {
                        this.F = new float[4];
                    }
                    float fW = w();
                    int i7 = 0;
                    while (true) {
                        float[] fArr = this.z;
                        int length = fArr.length;
                        if (i7 >= 4) {
                            break;
                        }
                        this.F[i7] = java.lang.Math.max(0.0f, fArr[i7] - fW);
                        i7++;
                    }
                } else {
                    this.F = null;
                }
                if (zI) {
                    this.m.c(this.D, this.F, this.p.k, b(), null, this.e);
                }
                this.u = false;
            }
            J(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final defpackage.wvi eL() {
        return this.p.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.p.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        int i = this.p.q;
        android.graphics.RectF rectFF = F();
        if (rectFF.isEmpty()) {
            return;
        }
        float fT = t(rectFF, this.p.a.a(), this.z);
        if (fT >= 0.0f) {
            outline.setRoundRect(getBounds(), fT * this.p.k);
            return;
        }
        if (this.t) {
            c(rectFF, this.v);
            this.t = false;
        }
        defpackage.wpv.e(outline, this.v);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.p.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.Region getTransparentRegion() {
        android.graphics.Region region = this.h;
        region.set(getBounds());
        android.graphics.RectF rectFF = F();
        android.graphics.Path path = this.v;
        c(rectFF, path);
        android.graphics.Region region2 = this.i;
        region2.setPath(path, region);
        region.op(region2, android.graphics.Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.t = true;
        this.u = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        android.content.res.ColorStateList colorStateList = this.p.g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        defpackage.wvb wvbVar = this.p;
        android.content.res.ColorStateList colorStateList2 = wvbVar.f;
        android.content.res.ColorStateList colorStateList3 = wvbVar.e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        android.content.res.ColorStateList colorStateList4 = this.p.d;
        return (colorStateList4 != null && colorStateList4.isStateful()) || this.p.a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        this.p = new defpackage.wvb(this.p);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(android.graphics.Rect rect) {
        this.t = true;
        this.u = true;
        super.onBoundsChange(rect);
        if (!this.p.a.e() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        emt[] emtVarArr = this.y;
        int length = emtVarArr.length;
        boolean z = false;
        for (int i = 0; i < 4; i++) {
            emt emtVar = emtVarArr[i];
            if (emtVar != null && emtVar.n) {
                z = true;
                break;
            }
        }
        f(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.p.a.e()) {
            f(iArr, false);
        }
        boolean z = j(iArr) || k();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        defpackage.wvb wvbVar = this.p;
        if (wvbVar.m != i) {
            wvbVar.m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.p.c = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(android.content.res.ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        this.p.g = colorStateList;
        k();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        defpackage.wvb wvbVar = this.p;
        if (wvbVar.h != mode) {
            wvbVar.h = mode;
            k();
            super.invalidateSelf();
        }
    }

    public final float t(android.graphics.RectF rectF, defpackage.wvi wviVar, float[] fArr) {
        if (fArr == null) {
            if (wviVar.h(rectF)) {
                return wviVar.b.a(rectF);
            }
            return -1.0f;
        }
        if (this.C) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final float u() {
        float[] fArr = this.z;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        android.graphics.RectF rectFF = F();
        return (((eL().b.a(rectFF) + eL().e.a(rectFF)) - eL().d.a(rectFF)) - defpackage.wvk.b(0, eL()).a(rectFF)) / 2.0f;
    }

    public final float v() {
        return this.p.o;
    }

    public final float w() {
        if (h()) {
            return this.k.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float x() {
        float[] fArr = this.z;
        return fArr != null ? fArr[3] : this.p.a.a().b.a(F());
    }

    public final float y() {
        float[] fArr = this.z;
        return fArr != null ? fArr[0] : this.p.a.a().c.a(F());
    }

    public final float z() {
        float fV = v();
        float f = this.p.p;
        return fV + 0.0f;
    }

    public wvd(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this(new defpackage.wvi(defpackage.wvi.l(context, attributeSet, i, i2)));
    }

    public wvd() {
        this(new defpackage.wvi());
    }

    public wvd(wvh wvhVar) {
        this(new defpackage.wvb(wvhVar));
    }

    public wvd(defpackage.wvi wviVar) {
        this(new defpackage.wvb(wviVar));
    }
}
