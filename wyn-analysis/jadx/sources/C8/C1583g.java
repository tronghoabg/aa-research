package c8;

import E5.n0;
import U8.v0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
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
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import b1.AbstractC1492a;
import b8.C1519a;
import com.unity3d.services.UnityAdsConstants;
import j$.util.Objects;
import java.util.BitSet;
import zg.C4684x;

/* renamed from: c8.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1583g extends Drawable implements u {

    /* renamed from: w, reason: collision with root package name */
    public static final Paint f19728w;

    /* renamed from: a, reason: collision with root package name */
    public C1582f f19729a;

    /* renamed from: b, reason: collision with root package name */
    public final s[] f19730b;

    /* renamed from: c, reason: collision with root package name */
    public final s[] f19731c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f19732d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19733e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f19734f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f19735g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f19736h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f19737i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f19738j;
    public final Region k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f19739l;

    /* renamed from: m, reason: collision with root package name */
    public C1587k f19740m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f19741n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f19742o;

    /* renamed from: p, reason: collision with root package name */
    public final C1519a f19743p;

    /* renamed from: q, reason: collision with root package name */
    public final C4684x f19744q;

    /* renamed from: r, reason: collision with root package name */
    public final n0 f19745r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f19746s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f19747t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f19748u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f19749v;

    static {
        Paint paint = new Paint(1);
        f19728w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C1583g() {
        this(new C1587k());
    }

    public final void a(RectF rectF, Path path) {
        C1582f c1582f = this.f19729a;
        this.f19745r.c(c1582f.f19713a, c1582f.f19721i, rectF, this.f19744q, path);
        if (this.f19729a.f19720h != 1.0f) {
            Matrix matrix = this.f19734f;
            matrix.reset();
            float f10 = this.f19729a.f19720h;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f19748u, true);
    }

    public final int b(int i5) {
        int i10;
        C1582f c1582f = this.f19729a;
        float f10 = c1582f.f19724m + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + c1582f.f19723l;
        V7.a aVar = c1582f.f19714b;
        if (aVar == null || !aVar.f13161a || AbstractC1492a.d(i5, 255) != aVar.f13164d) {
            return i5;
        }
        float fMin = (aVar.f13165e <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0.0f : Math.min(((((float) Math.log1p(f10 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i5);
        int iS = v0.S(fMin, AbstractC1492a.d(i5, 255), aVar.f13162b);
        if (fMin > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (i10 = aVar.f13163c) != 0) {
            iS = AbstractC1492a.b(AbstractC1492a.d(i10, V7.a.f13160f), iS);
        }
        return AbstractC1492a.d(iS, iAlpha);
    }

    public final void c(Canvas canvas) {
        if (this.f19732d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i5 = this.f19729a.f19726o;
        Path path = this.f19735g;
        C1519a c1519a = this.f19743p;
        if (i5 != 0) {
            canvas.drawPath(path, c1519a.f19403a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            s sVar = this.f19730b[i10];
            int i11 = this.f19729a.f19725n;
            Matrix matrix = s.f19790b;
            sVar.a(matrix, c1519a, i11, canvas);
            this.f19731c[i10].a(matrix, c1519a, this.f19729a.f19725n, canvas);
        }
        if (this.f19749v) {
            double d3 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d3)) * this.f19729a.f19726o);
            int iCos = (int) (Math.cos(Math.toRadians(d3)) * this.f19729a.f19726o);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f19728w);
            canvas.translate(iSin, iCos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, C1587k c1587k, RectF rectF) {
        if (!c1587k.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = c1587k.f19767f.a(rectF) * this.f19729a.f19721i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f19741n;
        paint.setColorFilter(this.f19746s);
        int alpha = paint.getAlpha();
        int i5 = this.f19729a.k;
        paint.setAlpha(((i5 + (i5 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f19742o;
        paint2.setColorFilter(this.f19747t);
        paint2.setStrokeWidth(this.f19729a.f19722j);
        int alpha2 = paint2.getAlpha();
        int i10 = this.f19729a.k;
        paint2.setAlpha(((i10 + (i10 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f19733e;
        Path path = this.f19735g;
        if (z2) {
            boolean zG = g();
            float strokeWidth = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f10 = -(zG ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C1587k c1587k = this.f19729a.f19713a;
            C1586j c1586jE = c1587k.e();
            InterfaceC1579c c1578b = c1587k.f19766e;
            if (!(c1578b instanceof C1584h)) {
                c1578b = new C1578b(f10, c1578b);
            }
            c1586jE.f19755e = c1578b;
            InterfaceC1579c c1578b2 = c1587k.f19767f;
            if (!(c1578b2 instanceof C1584h)) {
                c1578b2 = new C1578b(f10, c1578b2);
            }
            c1586jE.f19756f = c1578b2;
            InterfaceC1579c c1578b3 = c1587k.f19769h;
            if (!(c1578b3 instanceof C1584h)) {
                c1578b3 = new C1578b(f10, c1578b3);
            }
            c1586jE.f19758h = c1578b3;
            InterfaceC1579c c1578b4 = c1587k.f19768g;
            if (!(c1578b4 instanceof C1584h)) {
                c1578b4 = new C1578b(f10, c1578b4);
            }
            c1586jE.f19757g = c1578b4;
            C1587k c1587kA = c1586jE.a();
            this.f19740m = c1587kA;
            float f11 = this.f19729a.f19721i;
            RectF rectF = this.f19738j;
            rectF.set(f());
            if (g()) {
                strokeWidth = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(strokeWidth, strokeWidth);
            this.f19745r.c(c1587kA, f11, rectF, null, this.f19736h);
            a(f(), path);
            this.f19733e = false;
        }
        C1582f c1582f = this.f19729a;
        c1582f.getClass();
        if (c1582f.f19725n > 0) {
            int i11 = Build.VERSION.SDK_INT;
            if (!this.f19729a.f19713a.d(f()) && !path.isConvex() && i11 < 29) {
                canvas.save();
                double d3 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d3)) * this.f19729a.f19726o), (int) (Math.cos(Math.toRadians(d3)) * this.f19729a.f19726o));
                if (this.f19749v) {
                    RectF rectF2 = this.f19748u;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f19729a.f19725n * 2) + ((int) rectF2.width()) + iWidth, (this.f19729a.f19725n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f12 = (getBounds().left - this.f19729a.f19725n) - iWidth;
                    float f13 = (getBounds().top - this.f19729a.f19725n) - iHeight;
                    canvas2.translate(-f12, -f13);
                    c(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f12, f13, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    c(canvas);
                    canvas.restore();
                }
            }
        }
        C1582f c1582f2 = this.f19729a;
        Paint.Style style = c1582f2.f19727p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, c1582f2.f19713a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f19742o;
        Path path = this.f19736h;
        C1587k c1587k = this.f19740m;
        RectF rectF = this.f19738j;
        rectF.set(f());
        float strokeWidth = g() ? paint.getStrokeWidth() / 2.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, c1587k, rectF);
    }

    public final RectF f() {
        RectF rectF = this.f19737i;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f19729a.f19727p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f19742o.getStrokeWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f19729a.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f19729a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f19729a.getClass();
        if (this.f19729a.f19713a.d(f())) {
            outline.setRoundRect(getBounds(), this.f19729a.f19713a.f19766e.a(f()) * this.f19729a.f19721i);
            return;
        }
        RectF rectFF = f();
        Path path = this.f19735g;
        a(rectFF, path);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            outline.setPath(path);
            return;
        }
        if (i5 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f19729a.f19719g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.k;
        region.set(bounds);
        RectF rectFF = f();
        Path path = this.f19735g;
        a(rectFF, path);
        Region region2 = this.f19739l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f19729a.f19714b = new V7.a(context);
        m();
    }

    public final void i(float f10) {
        C1582f c1582f = this.f19729a;
        if (c1582f.f19724m != f10) {
            c1582f.f19724m = f10;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f19733e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f19729a.f19717e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f19729a.getClass();
        ColorStateList colorStateList2 = this.f19729a.f19716d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f19729a.f19715c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(ColorStateList colorStateList) {
        C1582f c1582f = this.f19729a;
        if (c1582f.f19715c != colorStateList) {
            c1582f.f19715c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f19729a.f19715c == null || color2 == (colorForState2 = this.f19729a.f19715c.getColorForState(iArr, (color2 = (paint2 = this.f19741n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f19729a.f19716d == null || color == (colorForState = this.f19729a.f19716d.getColorForState(iArr, (color = (paint = this.f19742o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f19746s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f19747t;
        C1582f c1582f = this.f19729a;
        ColorStateList colorStateList = c1582f.f19717e;
        PorterDuff.Mode mode = c1582f.f19718f;
        Paint paint = this.f19741n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iB = b(color);
            porterDuffColorFilter = iB != color ? new PorterDuffColorFilter(iB, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f19746s = porterDuffColorFilter;
        this.f19729a.getClass();
        this.f19747t = null;
        this.f19729a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f19746s) && Objects.equals(porterDuffColorFilter3, this.f19747t)) ? false : true;
    }

    public final void m() {
        C1582f c1582f = this.f19729a;
        float f10 = c1582f.f19724m + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        c1582f.f19725n = (int) Math.ceil(0.75f * f10);
        this.f19729a.f19726o = (int) Math.ceil(f10 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f19729a = new C1582f(this.f19729a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f19733e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z2 = k(iArr) || l();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        C1582f c1582f = this.f19729a;
        if (c1582f.k != i5) {
            c1582f.k = i5;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f19729a.getClass();
        super.invalidateSelf();
    }

    @Override // c8.u
    public final void setShapeAppearanceModel(C1587k c1587k) {
        this.f19729a.f19713a = c1587k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i5) {
        setTintList(ColorStateList.valueOf(i5));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f19729a.f19717e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C1582f c1582f = this.f19729a;
        if (c1582f.f19718f != mode) {
            c1582f.f19718f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public C1583g(Context context, AttributeSet attributeSet, int i5, int i10) {
        this(C1587k.b(context, attributeSet, i5, i10).a());
    }

    public C1583g(C1587k c1587k) {
        this(new C1582f(c1587k));
    }

    public C1583g(C1582f c1582f) {
        n0 n0Var;
        this.f19730b = new s[4];
        this.f19731c = new s[4];
        this.f19732d = new BitSet(8);
        this.f19734f = new Matrix();
        this.f19735g = new Path();
        this.f19736h = new Path();
        this.f19737i = new RectF();
        this.f19738j = new RectF();
        this.k = new Region();
        this.f19739l = new Region();
        Paint paint = new Paint(1);
        this.f19741n = paint;
        Paint paint2 = new Paint(1);
        this.f19742o = paint2;
        this.f19743p = new C1519a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            n0Var = AbstractC1588l.f19773a;
        } else {
            n0Var = new n0();
        }
        this.f19745r = n0Var;
        this.f19748u = new RectF();
        this.f19749v = true;
        this.f19729a = c1582f;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f19744q = new C4684x(this);
    }
}
