package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class fhu extends fhm {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public fhs b;
    public boolean c;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public fhu(fhs fhsVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = fhsVar;
        this.d = c(fhsVar.c, fhsVar.d);
    }

    static int a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    public static fhu b(Resources resources, int i, Resources.Theme theme) {
        fhu fhuVar = new fhu();
        int i2 = dvb.a;
        fhuVar.e = resources.getDrawable(i, theme);
        return fhuVar;
    }

    final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.j;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        Matrix matrix = this.i;
        canvas.getMatrix(matrix);
        float[] fArr = this.h;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != BitmapDescriptorFactory.HUE_RED || fAbs4 != BitmapDescriptorFactory.HUE_RED) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (rect.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), BitmapDescriptorFactory.HUE_RED);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        fhs fhsVar = this.b;
        Bitmap bitmap = fhsVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != fhsVar.f.getHeight()) {
            fhsVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            fhsVar.k = true;
        }
        boolean z = this.c;
        fhs fhsVar2 = this.b;
        if (!z) {
            fhsVar2.a(iMin, iMin2);
        } else if (fhsVar2.k || fhsVar2.g != fhsVar2.c || fhsVar2.h != fhsVar2.d || fhsVar2.j != fhsVar2.e || fhsVar2.i != fhsVar2.b.getRootAlpha()) {
            this.b.a(iMin, iMin2);
            fhs fhsVar3 = this.b;
            fhsVar3.g = fhsVar3.c;
            fhsVar3.h = fhsVar3.d;
            fhsVar3.i = fhsVar3.b.getRootAlpha();
            fhsVar3.j = fhsVar3.e;
            fhsVar3.k = false;
        }
        fhs fhsVar4 = this.b;
        if (fhsVar4.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (fhsVar4.l == null) {
                fhsVar4.l = new Paint();
                fhsVar4.l.setFilterBitmap(true);
            }
            fhsVar4.l.setAlpha(fhsVar4.b.getRootAlpha());
            fhsVar4.l.setColorFilter(colorFilter);
            paint = fhsVar4.l;
        }
        canvas.drawBitmap(fhsVar4.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getColorFilter() : this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return new fht(drawable.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        fhs fhsVar = this.b;
        fhsVar.b = new fhr();
        TypedArray typedArrayO = dlz.o(resources, theme, attributeSet, fhf.a);
        fhs fhsVar2 = this.b;
        fhr fhrVar = fhsVar2.b;
        fhsVar2.d = a.R(dlz.m(typedArrayO, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListY = dlz.y(typedArrayO, xmlPullParser, theme);
        if (colorStateListY != null) {
            fhsVar2.c = colorStateListY;
        }
        fhsVar2.e = dlz.t(typedArrayO, xmlPullParser, "autoMirrored", 5, fhsVar2.e);
        fhrVar.g = dlz.k(typedArrayO, xmlPullParser, "viewportWidth", 7, fhrVar.g);
        float fK = dlz.k(typedArrayO, xmlPullParser, "viewportHeight", 8, fhrVar.h);
        fhrVar.h = fK;
        if (fhrVar.g <= BitmapDescriptorFactory.HUE_RED) {
            throw new XmlPullParserException(String.valueOf(typedArrayO.getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
        }
        if (fK <= BitmapDescriptorFactory.HUE_RED) {
            throw new XmlPullParserException(String.valueOf(typedArrayO.getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
        }
        int i5 = 3;
        fhrVar.e = typedArrayO.getDimension(3, fhrVar.e);
        int i6 = 2;
        float dimension = typedArrayO.getDimension(2, fhrVar.f);
        fhrVar.f = dimension;
        if (fhrVar.e <= BitmapDescriptorFactory.HUE_RED) {
            throw new XmlPullParserException(String.valueOf(typedArrayO.getPositionDescription()).concat("<vector> tag requires width > 0"));
        }
        if (dimension <= BitmapDescriptorFactory.HUE_RED) {
            throw new XmlPullParserException(String.valueOf(typedArrayO.getPositionDescription()).concat("<vector> tag requires height > 0"));
        }
        fhrVar.setAlpha(dlz.k(typedArrayO, xmlPullParser, "alpha", 4, fhrVar.getAlpha()));
        boolean z2 = false;
        String string = typedArrayO.getString(0);
        if (string != null) {
            fhrVar.j = string;
            fhrVar.l.put(string, fhrVar);
        }
        typedArrayO.recycle();
        fhsVar.a = getChangingConfigurations();
        int i7 = 1;
        fhsVar.k = true;
        fhs fhsVar3 = this.b;
        fhr fhrVar2 = fhsVar3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(fhrVar2.d);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z3 = true;
        while (eventType != i7 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
            if (eventType == i6) {
                String name = xmlPullParser.getName();
                fhp fhpVar = (fhp) arrayDeque.peek();
                if (fhpVar != null) {
                    if ("path".equals(name)) {
                        fho fhoVar = new fho();
                        TypedArray typedArrayO2 = dlz.o(resources, theme, attributeSet, fhf.c);
                        fhoVar.a = null;
                        if (dlz.u(xmlPullParser, "pathData")) {
                            String string2 = typedArrayO2.getString(0);
                            if (string2 != null) {
                                fhoVar.n = string2;
                            }
                            String string3 = typedArrayO2.getString(2);
                            if (string3 != null) {
                                fhoVar.m = dtd.d(string3);
                            }
                            fhoVar.d = dlz.z(typedArrayO2, xmlPullParser, theme, "fillColor", 1);
                            i3 = depth;
                            fhoVar.f = dlz.k(typedArrayO2, xmlPullParser, "fillAlpha", 12, fhoVar.f);
                            int iM = dlz.m(typedArrayO2, xmlPullParser, "strokeLineCap", 8, -1);
                            Paint.Cap cap = fhoVar.j;
                            if (iM == 0) {
                                cap = Paint.Cap.BUTT;
                            } else if (iM == 1) {
                                cap = Paint.Cap.ROUND;
                            } else if (iM == 2) {
                                cap = Paint.Cap.SQUARE;
                            }
                            fhoVar.j = cap;
                            int iM2 = dlz.m(typedArrayO2, xmlPullParser, "strokeLineJoin", 9, -1);
                            Paint.Join join = fhoVar.k;
                            if (iM2 == 0) {
                                join = Paint.Join.MITER;
                            } else if (iM2 == 1) {
                                join = Paint.Join.ROUND;
                            } else if (iM2 == 2) {
                                join = Paint.Join.BEVEL;
                            }
                            fhoVar.k = join;
                            fhoVar.l = dlz.k(typedArrayO2, xmlPullParser, "strokeMiterLimit", 10, fhoVar.l);
                            fhoVar.b = dlz.z(typedArrayO2, xmlPullParser, theme, "strokeColor", 3);
                            fhoVar.e = dlz.k(typedArrayO2, xmlPullParser, "strokeAlpha", 11, fhoVar.e);
                            fhoVar.c = dlz.k(typedArrayO2, xmlPullParser, "strokeWidth", 4, fhoVar.c);
                            fhoVar.h = dlz.k(typedArrayO2, xmlPullParser, "trimPathEnd", 6, fhoVar.h);
                            fhoVar.i = dlz.k(typedArrayO2, xmlPullParser, "trimPathOffset", 7, fhoVar.i);
                            fhoVar.g = dlz.k(typedArrayO2, xmlPullParser, "trimPathStart", 5, fhoVar.g);
                            fhoVar.o = dlz.m(typedArrayO2, xmlPullParser, "fillType", 13, fhoVar.o);
                        } else {
                            i3 = depth;
                        }
                        typedArrayO2.recycle();
                        fhpVar.b.add(fhoVar);
                        if (fhoVar.getPathName() != null) {
                            fhrVar2.l.put(fhoVar.getPathName(), fhoVar);
                        }
                        int i8 = fhsVar3.a;
                        z = false;
                        i2 = 3;
                        z3 = false;
                    } else {
                        i3 = depth;
                        if ("clip-path".equals(name)) {
                            fhn fhnVar = new fhn();
                            if (dlz.u(xmlPullParser, "pathData")) {
                                TypedArray typedArrayO3 = dlz.o(resources, theme, attributeSet, fhf.d);
                                String string4 = typedArrayO3.getString(0);
                                if (string4 != null) {
                                    fhnVar.n = string4;
                                }
                                String string5 = typedArrayO3.getString(1);
                                if (string5 != null) {
                                    fhnVar.m = dtd.d(string5);
                                }
                                fhnVar.o = dlz.m(typedArrayO3, xmlPullParser, "fillType", 2, 0);
                                typedArrayO3.recycle();
                            }
                            fhpVar.b.add(fhnVar);
                            if (fhnVar.getPathName() != null) {
                                fhrVar2.l.put(fhnVar.getPathName(), fhnVar);
                            }
                            int i9 = fhsVar3.a;
                            z = false;
                            i2 = 3;
                        } else if ("group".equals(name)) {
                            fhp fhpVar2 = new fhp();
                            TypedArray typedArrayO4 = dlz.o(resources, theme, attributeSet, fhf.b);
                            fhpVar2.l = null;
                            fhpVar2.c = dlz.k(typedArrayO4, xmlPullParser, "rotation", 5, fhpVar2.c);
                            fhpVar2.d = typedArrayO4.getFloat(1, fhpVar2.d);
                            fhpVar2.e = typedArrayO4.getFloat(2, fhpVar2.e);
                            fhpVar2.f = dlz.k(typedArrayO4, xmlPullParser, "scaleX", 3, fhpVar2.f);
                            fhpVar2.g = dlz.k(typedArrayO4, xmlPullParser, "scaleY", 4, fhpVar2.g);
                            fhpVar2.h = dlz.k(typedArrayO4, xmlPullParser, "translateX", 6, fhpVar2.h);
                            fhpVar2.i = dlz.k(typedArrayO4, xmlPullParser, "translateY", 7, fhpVar2.i);
                            z = false;
                            String string6 = typedArrayO4.getString(0);
                            if (string6 != null) {
                                fhpVar2.m = string6;
                            }
                            fhpVar2.a();
                            typedArrayO4.recycle();
                            fhpVar.b.add(fhpVar2);
                            arrayDeque.push(fhpVar2);
                            if (fhpVar2.getGroupName() != null) {
                                fhrVar2.l.put(fhpVar2.getGroupName(), fhpVar2);
                            }
                            int i10 = fhsVar3.a;
                            i2 = 3;
                        } else {
                            z = false;
                        }
                    }
                    i = 1;
                    i4 = 2;
                } else {
                    z = z2;
                    i3 = depth;
                }
                i2 = 3;
                i = 1;
                i4 = 2;
            } else {
                i = i7;
                z = z2;
                i2 = i5;
                i3 = depth;
                i4 = i6;
                if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i5 = i2;
            i6 = i4;
            depth = i3;
            z2 = z;
            i7 = i;
        }
        if (z3) {
            throw new XmlPullParserException("no path defined");
        }
        this.d = c(fhsVar.c, fhsVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        fhs fhsVar = this.b;
        if (fhsVar == null) {
            return false;
        }
        if (fhsVar.b()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            this.b = new fhs(this.b);
            this.g = true;
        }
        return this;
    }

    @Override // defpackage.fhm, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        fhs fhsVar = this.b;
        ColorStateList colorStateList = fhsVar.c;
        boolean z = false;
        if (colorStateList != null && (mode = fhsVar.d) != null) {
            this.d = c(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (fhsVar.b()) {
            boolean zC = fhsVar.b.d.c(iArr);
            fhsVar.k |= zC;
            if (zC) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        fhs fhsVar = this.b;
        if (fhsVar.c != colorStateList) {
            fhsVar.c = colorStateList;
            this.d = c(colorStateList, fhsVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        fhs fhsVar = this.b;
        if (fhsVar.d != mode) {
            fhsVar.d = mode;
            this.d = c(fhsVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public fhu() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new fhs();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
