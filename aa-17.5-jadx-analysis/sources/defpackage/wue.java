package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Objects;
import java.util.BitSet;

/* loaded from: classes.dex */
public class wue extends Drawable implements wuv {
    public static final /* synthetic */ int B = 0;
    private static final String a = "wue";
    private static final Paint b;
    private static final wud[] c;
    public ykd A;
    private boolean C;
    private wuk D;
    private emq E;
    private float[] F;
    private final wyd G;
    private final wyd H;
    private final Matrix d;
    private final Path e;
    private final RectF f;
    private final RectF g;
    private final Region h;
    private final Region i;
    private final Paint j;
    private final Paint k;
    private final wtv l;
    private final wum m;
    private PorterDuffColorFilter n;
    private final RectF o;
    public wuc p;
    public final wut[] q;
    public final wut[] r;
    public final BitSet s;
    public boolean t;
    public boolean u;
    public final Path v;
    public int w;
    public boolean x;
    emp[] y;
    public float[] z;

    static {
        wuj wujVar = new wuj();
        wujVar.k(new wuh());
        wujVar.e(BitmapDescriptorFactory.HUE_RED);
        Paint paint = new Paint(1);
        b = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        c = new wud[4];
        int i = 0;
        while (true) {
            wud[] wudVarArr = c;
            int length = wudVarArr.length;
            if (i >= 4) {
                return;
            }
            wudVarArr[i] = new wud(i);
            i++;
        }
    }

    protected wue(wuc wucVar) {
        this.H = new wyd(this, null);
        this.q = new wut[4];
        this.r = new wut[4];
        this.s = new BitSet(8);
        this.d = new Matrix();
        this.v = new Path();
        this.e = new Path();
        this.f = new RectF();
        this.g = new RectF();
        this.h = new Region();
        this.i = new Region();
        Paint paint = new Paint(1);
        this.j = paint;
        Paint paint2 = new Paint(1);
        this.k = paint2;
        this.l = new wtv();
        this.m = wum.a();
        this.o = new RectF();
        this.x = true;
        this.C = true;
        this.y = new emp[4];
        this.p = wucVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        k();
        j(getState());
        this.G = new wyd(this, null);
    }

    public static wue G(Context context, float f, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(woy.s(context, "wue"));
        }
        wue wueVar = new wue();
        wueVar.K(context);
        wueVar.O(colorStateList);
        wueVar.N(f);
        return wueVar;
    }

    private final RectF b() {
        RectF rectF = this.g;
        rectF.set(F());
        float fW = w();
        rectF.inset(fW, fW);
        return rectF;
    }

    private final void c(RectF rectF, Path path) {
        H(rectF, path);
        if (this.p.j != 1.0f) {
            Matrix matrix = this.d;
            matrix.reset();
            float f = this.p.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.o, true);
    }

    private final void e(Canvas canvas) {
        if (this.s.cardinality() > 0) {
            Log.w(a, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.p.s != 0) {
            canvas.drawPath(this.v, this.l.e);
        }
        for (int i = 0; i < 4; i++) {
            wut[] wutVarArr = this.q;
            wtv wtvVar = this.l;
            wutVarArr[i].c(wtvVar, this.p.r, canvas);
            this.r[i].c(wtvVar, this.p.r, canvas);
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
        RectF rectFF = F();
        if (!this.p.a.e() || rectFF.isEmpty()) {
            return;
        }
        boolean z4 = z | (this.E == null);
        if (this.z == null) {
            this.z = new float[4];
        }
        wuk wukVarB = this.p.a.b(iArr);
        float[] fArr = this.z;
        int length = fArr.length;
        float f = fArr[0];
        int i = 1;
        while (true) {
            int length2 = fArr.length;
            if (i < 4) {
                if (fArr[i] != f) {
                    break;
                } else {
                    i++;
                }
            } else if (wukVarB.j(F())) {
                z2 = true;
            }
        }
        z2 = false;
        this.C = z2;
        if (!z2) {
            this.t = true;
            this.u = true;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            float fA = wum.b(i2, wukVarB).a(rectFF);
            if (z4) {
                this.z[i2] = fA;
                z3 = true;
            } else {
                z3 = false;
            }
            emp empVar = this.y[i2];
            if (empVar != null) {
                empVar.k(fA);
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
        wuc wucVar = this.p;
        int i = wucVar.q;
        return wucVar.r > 0 && !X() && !this.v.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    private final boolean h() {
        return (this.p.v == Paint.Style.FILL_AND_STROKE || this.p.v == Paint.Style.STROKE) && this.k.getStrokeWidth() > BitmapDescriptorFactory.HUE_RED;
    }

    private final boolean i() {
        return g() || !X();
    }

    private final boolean j(int[] iArr) {
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
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
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.n;
        wuc wucVar = this.p;
        ColorStateList colorStateList = wucVar.g;
        PorterDuff.Mode mode = wucVar.h;
        if (colorStateList == null || mode == null) {
            int color = this.j.getColor();
            int iA = A(color);
            this.w = iA;
            porterDuffColorFilter = iA != color ? new PorterDuffColorFilter(iA, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iA2 = A(colorStateList.getColorForState(getState(), 0));
            this.w = iA2;
            porterDuffColorFilter = new PorterDuffColorFilter(iA2, mode);
        }
        this.n = porterDuffColorFilter;
        wuc wucVar2 = this.p;
        ColorStateList colorStateList2 = wucVar2.f;
        PorterDuff.Mode mode2 = wucVar2.h;
        boolean z = wucVar2.u;
        return (Objects.equals(porterDuffColorFilter2, this.n) && Objects.equals(null, null)) ? false : true;
    }

    protected final int A(int i) {
        float fZ = z();
        wuc wucVar = this.p;
        float f = fZ + wucVar.n;
        woz wozVar = wucVar.b;
        return wozVar != null ? wozVar.a(i, f) : i;
    }

    public final int B() {
        wuc wucVar = this.p;
        double d = wucVar.s;
        int i = wucVar.t;
        return (int) (d * Math.sin(Math.toRadians(0.0d)));
    }

    public final int C() {
        wuc wucVar = this.p;
        double d = wucVar.s;
        int i = wucVar.t;
        return (int) (d * Math.cos(Math.toRadians(0.0d)));
    }

    public final ColorStateList D() {
        return this.p.d;
    }

    public final ColorStateList E() {
        return this.p.e;
    }

    public final RectF F() {
        RectF rectF = this.f;
        rectF.set(getBounds());
        return rectF;
    }

    protected final void H(RectF rectF, Path path) {
        this.m.c(this.p.a.a(), this.z, this.p.k, rectF, this.G, path);
    }

    public final void I(Canvas canvas, Paint paint, Path path, wuk wukVar, float[] fArr, RectF rectF) {
        float fT = t(rectF, wukVar, fArr);
        if (fT < BitmapDescriptorFactory.HUE_RED) {
            canvas.drawPath(path, paint);
        } else {
            float f = fT * this.p.k;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    protected void J(Canvas canvas) {
        I(canvas, this.k, this.e, this.D, this.F, b());
    }

    public final void K(Context context) {
        this.p.b = new woz(context);
        W();
    }

    public final void L(wtz wtzVar) {
        d(this.p.a.d(wtzVar));
    }

    public final void M(emq emqVar) {
        if (this.E == emqVar) {
            return;
        }
        this.E = emqVar;
        int i = 0;
        while (true) {
            emp[] empVarArr = this.y;
            int length = empVarArr.length;
            if (i >= 4) {
                f(getState(), true);
                invalidateSelf();
                return;
            }
            if (empVarArr[i] == null) {
                empVarArr[i] = new emp(this, c[i]);
            }
            emp empVar = this.y[i];
            emq emqVar2 = new emq();
            emqVar2.c((float) emqVar.b);
            double d = emqVar.a;
            emqVar2.e((float) (d * d));
            empVar.s = emqVar2;
            i++;
        }
    }

    public final void N(float f) {
        wuc wucVar = this.p;
        if (wucVar.o != f) {
            wucVar.o = f;
            W();
        }
    }

    public final void O(ColorStateList colorStateList) {
        wuc wucVar = this.p;
        if (wucVar.d != colorStateList) {
            wucVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void P(float f) {
        wuc wucVar = this.p;
        if (wucVar.k != f) {
            wucVar.k = f;
            this.t = true;
            this.u = true;
            invalidateSelf();
        }
    }

    public final void Q(int i, int i2, int i3, int i4) {
        wuc wucVar = this.p;
        if (wucVar.i == null) {
            wucVar.i = new Rect();
        }
        this.p.i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public final void R(wui wuiVar) {
        if (wuiVar instanceof wuk) {
            d((wuk) wuiVar);
            return;
        }
        wux wuxVar = (wux) wuiVar;
        wuc wucVar = this.p;
        if (wucVar.a != wuxVar) {
            wucVar.a = wuxVar;
            f(getState(), true);
            invalidateSelf();
        }
    }

    public final void S(float f, int i) {
        V(f);
        U(ColorStateList.valueOf(i));
    }

    public final void T(float f, ColorStateList colorStateList) {
        V(f);
        U(colorStateList);
    }

    public final void U(ColorStateList colorStateList) {
        wuc wucVar = this.p;
        if (wucVar.e != colorStateList) {
            wucVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void V(float f) {
        this.p.l = f;
        invalidateSelf();
    }

    public final void W() {
        float fZ = z();
        this.p.r = (int) Math.ceil(0.75f * fZ);
        this.p.s = (int) Math.ceil(fZ * 0.25f);
        k();
        if (i()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean X() {
        if (this.p.a.b(getState()).j(F())) {
            return this.z == null || this.C;
        }
        return false;
    }

    public final void Y() {
        this.l.a(-12303292);
        this.p.u = false;
        super.invalidateSelf();
    }

    @Override // defpackage.wuv
    public final void d(wuk wukVar) {
        this.p.a = wukVar;
        this.z = null;
        this.F = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.j;
        paint.setColorFilter(this.n);
        int alpha = paint.getAlpha();
        int i = this.p.m;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.k;
        paint2.setColorFilter(null);
        paint2.setStrokeWidth(this.p.l);
        int alpha2 = paint2.getAlpha();
        int i2 = this.p.m;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean zI = i();
        if (this.p.v == Paint.Style.FILL_AND_STROKE || this.p.v == Paint.Style.FILL) {
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
                    Rect bounds = getBounds();
                    RectF rectF = this.o;
                    float fWidth = rectF.width() - bounds.width();
                    int iHeight = (int) (rectF.height() - bounds.height());
                    int i3 = (int) fWidth;
                    if (i3 < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: " + i3 + " extra height: " + iHeight + " path bounds: " + String.valueOf(rectF));
                    }
                    int iWidth = (int) rectF.width();
                    int i4 = this.p.r;
                    int i5 = iWidth + i4 + i4 + i3;
                    int iHeight2 = (int) rectF.height();
                    int i6 = this.p.r;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, iHeight2 + i6 + i6 + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f = (bounds.left - this.p.r) - i3;
                    float f2 = (bounds.top - this.p.r) - iHeight;
                    canvas2.translate(-f, -f2);
                    e(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
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
                wuk wukVarFD = fD();
                wyd wydVar = this.H;
                wuj wujVar = new wuj(wukVarFD);
                wujVar.a = wydVar.a(wukVarFD.b);
                wujVar.b = wydVar.a(wukVarFD.c);
                wujVar.d = wydVar.a(wukVarFD.e);
                wujVar.c = wydVar.a(wukVarFD.d);
                this.D = new wuk(wujVar);
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
                        this.F[i7] = Math.max(BitmapDescriptorFactory.HUE_RED, fArr[i7] - fW);
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

    @Override // defpackage.wuv
    public final wuk fD() {
        return this.p.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.p.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        int i = this.p.q;
        RectF rectFF = F();
        if (rectFF.isEmpty()) {
            return;
        }
        float fT = t(rectFF, this.p.a.a(), this.z);
        if (fT >= BitmapDescriptorFactory.HUE_RED) {
            outline.setRoundRect(getBounds(), fT * this.p.k);
            return;
        }
        if (this.t) {
            c(rectFF, this.v);
            this.t = false;
        }
        woy.e(outline, this.v);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.p.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Region region = this.h;
        region.set(getBounds());
        RectF rectFF = F();
        Path path = this.v;
        c(rectFF, path);
        Region region2 = this.i;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
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
        ColorStateList colorStateList = this.p.g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        wuc wucVar = this.p;
        ColorStateList colorStateList2 = wucVar.f;
        ColorStateList colorStateList3 = wucVar.e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.p.d;
        return (colorStateList4 != null && colorStateList4.isStateful()) || this.p.a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.p = new wuc(this.p);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.t = true;
        this.u = true;
        super.onBoundsChange(rect);
        if (!this.p.a.e() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        emp[] empVarArr = this.y;
        int length = empVarArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < 4) {
                emp empVar = empVarArr[i];
                if (empVar != null && empVar.n) {
                    z = true;
                    break;
                }
                i++;
            } else {
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
        wuc wucVar = this.p;
        if (wucVar.m != i) {
            wucVar.m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.p.c = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.p.g = colorStateList;
        k();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        wuc wucVar = this.p;
        if (wucVar.h != mode) {
            wucVar.h = mode;
            k();
            super.invalidateSelf();
        }
    }

    public final float t(RectF rectF, wuk wukVar, float[] fArr) {
        if (fArr == null) {
            if (wukVar.j(rectF)) {
                return wukVar.b.a(rectF);
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
        RectF rectFF = F();
        return (((fD().b.a(rectFF) + fD().e.a(rectFF)) - fD().d.a(rectFF)) - wum.b(0, fD()).a(rectFF)) / 2.0f;
    }

    public final float v() {
        return this.p.o;
    }

    public final float w() {
        return h() ? this.k.getStrokeWidth() / 2.0f : BitmapDescriptorFactory.HUE_RED;
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
        return fV + BitmapDescriptorFactory.HUE_RED;
    }

    public wue(Context context, AttributeSet attributeSet, int i, int i2) {
        this(new wuk(wuk.l(context, attributeSet, i, i2)));
    }

    public wue() {
        this(new wuk());
    }

    public wue(wui wuiVar) {
        this(new wuc(wuiVar));
    }

    public wue(wuk wukVar) {
        this(new wuc(wukVar));
    }
}
