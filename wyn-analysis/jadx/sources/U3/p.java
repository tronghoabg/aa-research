package u3;

import a1.AbstractC1312b;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p7.AbstractC3772b;
import x.C4412e;

/* loaded from: classes.dex */
public final class p extends AbstractC4245g {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f46637j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public n f46638b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f46639c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f46640d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f46641e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46642f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f46643g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f46644h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f46645i;

    public p() {
        this.f46642f = true;
        this.f46643g = new float[9];
        this.f46644h = new Matrix();
        this.f46645i = new Rect();
        n nVar = new n();
        nVar.f46627c = null;
        nVar.f46628d = f46637j;
        nVar.f46626b = new m();
        this.f46638b = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f46586a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f46645i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f46640d;
        if (colorFilter == null) {
            colorFilter = this.f46639c;
        }
        Matrix matrix = this.f46644h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f46643g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fAbs4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        n nVar = this.f46638b;
        Bitmap bitmap = nVar.f46630f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != nVar.f46630f.getHeight()) {
            nVar.f46630f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            nVar.k = true;
        }
        if (this.f46642f) {
            n nVar2 = this.f46638b;
            if (nVar2.k || nVar2.f46631g != nVar2.f46627c || nVar2.f46632h != nVar2.f46628d || nVar2.f46634j != nVar2.f46629e || nVar2.f46633i != nVar2.f46626b.getRootAlpha()) {
                n nVar3 = this.f46638b;
                nVar3.f46630f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f46630f);
                m mVar = nVar3.f46626b;
                mVar.a(mVar.f46617g, m.f46610p, canvas2, iMin, iMin2);
                n nVar4 = this.f46638b;
                nVar4.f46631g = nVar4.f46627c;
                nVar4.f46632h = nVar4.f46628d;
                nVar4.f46633i = nVar4.f46626b.getRootAlpha();
                nVar4.f46634j = nVar4.f46629e;
                nVar4.k = false;
            }
        } else {
            n nVar5 = this.f46638b;
            nVar5.f46630f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f46630f);
            m mVar2 = nVar5.f46626b;
            mVar2.a(mVar2.f46617g, m.f46610p, canvas3, iMin, iMin2);
        }
        n nVar6 = this.f46638b;
        if (nVar6.f46626b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f46635l == null) {
                Paint paint2 = new Paint();
                nVar6.f46635l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f46635l.setAlpha(nVar6.f46626b.getRootAlpha());
            nVar6.f46635l.setColorFilter(colorFilter);
            paint = nVar6.f46635l;
        }
        canvas.drawBitmap(nVar6.f46630f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f46586a;
        return drawable != null ? drawable.getAlpha() : this.f46638b.f46626b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f46586a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f46638b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f46586a;
        return drawable != null ? drawable.getColorFilter() : this.f46640d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f46586a != null && Build.VERSION.SDK_INT >= 24) {
            return new o(this.f46586a.getConstantState());
        }
        this.f46638b.f46625a = getChangingConfigurations();
        return this.f46638b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f46586a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f46638b.f46626b.f46619i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f46586a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f46638b.f46626b.f46618h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f46586a;
        return drawable != null ? drawable.isAutoMirrored() : this.f46638b.f46629e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        n nVar = this.f46638b;
        if (nVar == null) {
            return false;
        }
        m mVar = nVar.f46626b;
        if (mVar.f46623n == null) {
            mVar.f46623n = Boolean.valueOf(mVar.f46617g.a());
        }
        if (mVar.f46623n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f46638b.f46627c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f46641e && super.mutate() == this) {
            n nVar = this.f46638b;
            n nVar2 = new n();
            nVar2.f46627c = null;
            nVar2.f46628d = f46637j;
            if (nVar != null) {
                nVar2.f46625a = nVar.f46625a;
                m mVar = new m(nVar.f46626b);
                nVar2.f46626b = mVar;
                if (nVar.f46626b.f46615e != null) {
                    mVar.f46615e = new Paint(nVar.f46626b.f46615e);
                }
                if (nVar.f46626b.f46614d != null) {
                    nVar2.f46626b.f46614d = new Paint(nVar.f46626b.f46614d);
                }
                nVar2.f46627c = nVar.f46627c;
                nVar2.f46628d = nVar.f46628d;
                nVar2.f46629e = nVar.f46629e;
            }
            this.f46638b = nVar2;
            this.f46641e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f46638b;
        ColorStateList colorStateList = nVar.f46627c;
        if (colorStateList == null || (mode = nVar.f46628d) == null) {
            z2 = false;
        } else {
            this.f46639c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        m mVar = nVar.f46626b;
        if (mVar.f46623n == null) {
            mVar.f46623n = Boolean.valueOf(mVar.f46617g.a());
        }
        if (mVar.f46623n.booleanValue()) {
            boolean zB = nVar.f46626b.f46617g.b(iArr);
            nVar.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j8) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j8);
        } else {
            super.scheduleSelf(runnable, j8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.setAlpha(i5);
        } else if (this.f46638b.f46626b.getRootAlpha() != i5) {
            this.f46638b.f46626b.setRootAlpha(i5);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f46638b.f46629e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f46640d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i5) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            Fe.b.Q(drawable, i5);
        } else {
            setTintList(ColorStateList.valueOf(i5));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.f46638b;
        if (nVar.f46627c != colorStateList) {
            nVar.f46627c = colorStateList;
            this.f46639c = a(colorStateList, nVar.f46628d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.f46638b;
        if (nVar.f46628d != mode) {
            nVar.f46628d = mode;
            this.f46639c = a(nVar.f46627c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z10) {
        Drawable drawable = this.f46586a;
        return drawable != null ? drawable.setVisible(z2, z10) : super.setVisible(z2, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        m mVar;
        boolean z2;
        int i5;
        int i10;
        int i11;
        char c10;
        int i12;
        Paint.Cap cap;
        Paint.Join join;
        Resources resources2 = resources;
        Drawable drawable = this.f46586a;
        if (drawable != null) {
            drawable.inflate(resources2, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f46638b;
        nVar.f46626b = new m();
        TypedArray typedArrayI = AbstractC1312b.i(resources2, theme, attributeSet, AbstractC4239a.f46563a);
        n nVar2 = this.f46638b;
        m mVar2 = nVar2.f46626b;
        int i13 = !AbstractC1312b.f(xmlPullParser, "tintMode") ? -1 : typedArrayI.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i14 = 3;
        if (i13 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i13 != 5) {
            if (i13 != 9) {
                switch (i13) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.f46628d = mode;
        ColorStateList colorStateListC = AbstractC1312b.c(typedArrayI, xmlPullParser, theme);
        if (colorStateListC != null) {
            nVar2.f46627c = colorStateListC;
        }
        boolean z10 = nVar2.f46629e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = typedArrayI.getBoolean(5, z10);
        }
        nVar2.f46629e = z10;
        float f10 = mVar2.f46620j;
        boolean z11 = false;
        int i15 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = typedArrayI.getFloat(7, f10);
        }
        mVar2.f46620j = f10;
        float f11 = mVar2.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = typedArrayI.getFloat(8, f11);
        }
        mVar2.k = f11;
        if (mVar2.f46620j <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            mVar2.f46618h = typedArrayI.getDimension(3, mVar2.f46618h);
            int i16 = 2;
            float dimension = typedArrayI.getDimension(2, mVar2.f46619i);
            mVar2.f46619i = dimension;
            if (mVar2.f46618h <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float alpha = mVar2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayI.getFloat(4, alpha);
                }
                mVar2.setAlpha(alpha);
                String string = typedArrayI.getString(0);
                if (string != null) {
                    mVar2.f46622m = string;
                    mVar2.f46624o.put(string, mVar2);
                }
                typedArrayI.recycle();
                nVar.f46625a = getChangingConfigurations();
                nVar.k = true;
                n nVar3 = this.f46638b;
                m mVar3 = nVar3.f46626b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(mVar3.f46617g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z12 = true;
                while (eventType != i15 && (xmlPullParser.getDepth() >= depth || eventType != i14)) {
                    if (eventType == i16) {
                        String name = xmlPullParser.getName();
                        C4248j c4248j = (C4248j) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        C4412e c4412e = mVar3.f46624o;
                        mVar = mVar3;
                        if (zEquals) {
                            C4247i c4247i = new C4247i();
                            c4247i.f46588e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            c4247i.f46590g = 1.0f;
                            c4247i.f46591h = 1.0f;
                            i5 = depth;
                            c4247i.f46592i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            c4247i.f46593j = 1.0f;
                            c4247i.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c4247i.f46594l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            c4247i.f46595m = join2;
                            c4247i.f46596n = 4.0f;
                            TypedArray typedArrayI2 = AbstractC1312b.i(resources2, theme, attributeSet, AbstractC4239a.f46565c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayI2.getString(0);
                                if (string2 != null) {
                                    c4247i.f46608b = string2;
                                }
                                String string3 = typedArrayI2.getString(2);
                                if (string3 != null) {
                                    c4247i.f46607a = AbstractC3772b.n(string3);
                                }
                                c4247i.f46589f = AbstractC1312b.d(typedArrayI2, xmlPullParser, theme, "fillColor", 1);
                                float f12 = c4247i.f46591h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f12 = typedArrayI2.getFloat(12, f12);
                                }
                                c4247i.f46591h = f12;
                                int i17 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayI2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = c4247i.f46594l;
                                if (i17 == 0) {
                                    cap = cap2;
                                } else if (i17 != 1) {
                                    cap = i17 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                c4247i.f46594l = cap;
                                int i18 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayI2.getInt(9, -1) : -1;
                                Paint.Join join3 = c4247i.f46595m;
                                if (i18 == 0) {
                                    join = join2;
                                } else if (i18 != 1) {
                                    join = i18 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                c4247i.f46595m = join;
                                float f13 = c4247i.f46596n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f13 = typedArrayI2.getFloat(10, f13);
                                }
                                c4247i.f46596n = f13;
                                c4247i.f46587d = AbstractC1312b.d(typedArrayI2, xmlPullParser, theme, "strokeColor", 3);
                                float f14 = c4247i.f46590g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f14 = typedArrayI2.getFloat(11, f14);
                                }
                                c4247i.f46590g = f14;
                                float f15 = c4247i.f46588e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f15 = typedArrayI2.getFloat(4, f15);
                                }
                                c4247i.f46588e = f15;
                                float f16 = c4247i.f46593j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f16 = typedArrayI2.getFloat(6, f16);
                                }
                                c4247i.f46593j = f16;
                                float f17 = c4247i.k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f17 = typedArrayI2.getFloat(7, f17);
                                }
                                c4247i.k = f17;
                                float f18 = c4247i.f46592i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f18 = typedArrayI2.getFloat(5, f18);
                                }
                                c4247i.f46592i = f18;
                                int i19 = c4247i.f46609c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i19 = typedArrayI2.getInt(13, i19);
                                }
                                c4247i.f46609c = i19;
                            }
                            typedArrayI2.recycle();
                            c4248j.f46598b.add(c4247i);
                            if (c4247i.getPathName() != null) {
                                c4412e.put(c4247i.getPathName(), c4247i);
                            }
                            nVar3.f46625a = nVar3.f46625a;
                            z2 = false;
                            c10 = 5;
                            i12 = 1;
                            z12 = false;
                        } else {
                            i5 = depth;
                            if ("clip-path".equals(name)) {
                                C4246h c4246h = new C4246h();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayI3 = AbstractC1312b.i(resources2, theme, attributeSet, AbstractC4239a.f46566d);
                                    String string4 = typedArrayI3.getString(0);
                                    if (string4 != null) {
                                        c4246h.f46608b = string4;
                                    }
                                    String string5 = typedArrayI3.getString(1);
                                    if (string5 != null) {
                                        c4246h.f46607a = AbstractC3772b.n(string5);
                                    }
                                    c4246h.f46609c = !AbstractC1312b.f(xmlPullParser, "fillType") ? 0 : typedArrayI3.getInt(2, 0);
                                    typedArrayI3.recycle();
                                }
                                c4248j.f46598b.add(c4246h);
                                if (c4246h.getPathName() != null) {
                                    c4412e.put(c4246h.getPathName(), c4246h);
                                }
                                nVar3.f46625a = nVar3.f46625a;
                            } else if ("group".equals(name)) {
                                C4248j c4248j2 = new C4248j();
                                TypedArray typedArrayI4 = AbstractC1312b.i(resources2, theme, attributeSet, AbstractC4239a.f46564b);
                                float f19 = c4248j2.f46599c;
                                if (AbstractC1312b.f(xmlPullParser, "rotation")) {
                                    c10 = 5;
                                    f19 = typedArrayI4.getFloat(5, f19);
                                } else {
                                    c10 = 5;
                                }
                                c4248j2.f46599c = f19;
                                i12 = 1;
                                c4248j2.f46600d = typedArrayI4.getFloat(1, c4248j2.f46600d);
                                c4248j2.f46601e = typedArrayI4.getFloat(2, c4248j2.f46601e);
                                float f20 = c4248j2.f46602f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f20 = typedArrayI4.getFloat(3, f20);
                                }
                                c4248j2.f46602f = f20;
                                float f21 = c4248j2.f46603g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f21 = typedArrayI4.getFloat(4, f21);
                                }
                                c4248j2.f46603g = f21;
                                float f22 = c4248j2.f46604h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f22 = typedArrayI4.getFloat(6, f22);
                                }
                                c4248j2.f46604h = f22;
                                float f23 = c4248j2.f46605i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f23 = typedArrayI4.getFloat(7, f23);
                                }
                                c4248j2.f46605i = f23;
                                z2 = false;
                                String string6 = typedArrayI4.getString(0);
                                if (string6 != null) {
                                    c4248j2.k = string6;
                                }
                                c4248j2.c();
                                typedArrayI4.recycle();
                                c4248j.f46598b.add(c4248j2);
                                arrayDeque.push(c4248j2);
                                if (c4248j2.getGroupName() != null) {
                                    c4412e.put(c4248j2.getGroupName(), c4248j2);
                                }
                                nVar3.f46625a = nVar3.f46625a;
                            }
                            z2 = false;
                            c10 = 5;
                            i12 = 1;
                        }
                        i11 = i12;
                        i10 = 3;
                    } else {
                        mVar = mVar3;
                        z2 = z11;
                        i5 = depth;
                        i10 = i14;
                        i11 = 1;
                        if (eventType == i10 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    z11 = z2;
                    i14 = i10;
                    i15 = i11;
                    mVar3 = mVar;
                    depth = i5;
                    i16 = 2;
                    resources2 = resources;
                }
                if (!z12) {
                    this.f46639c = a(nVar.f46627c, nVar.f46628d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayI.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f46642f = true;
        this.f46643g = new float[9];
        this.f46644h = new Matrix();
        this.f46645i = new Rect();
        this.f46638b = nVar;
        this.f46639c = a(nVar.f46627c, nVar.f46628d);
    }
}
