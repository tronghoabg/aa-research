package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fia extends defpackage.fhs {
    static final android.graphics.PorterDuff.Mode a = android.graphics.PorterDuff.Mode.SRC_IN;
    public defpackage.fhy b;
    public boolean c;
    private android.graphics.PorterDuffColorFilter d;
    private android.graphics.ColorFilter f;
    private boolean g;
    private final float[] h;
    private final android.graphics.Matrix i;
    private final android.graphics.Rect j;

    public fia(defpackage.fhy fhyVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new android.graphics.Matrix();
        this.j = new android.graphics.Rect();
        this.b = fhyVar;
        this.d = c(fhyVar.c, fhyVar.d);
    }

    static int a(int i, float f) {
        return (i & 16777215) | (((int) (android.graphics.Color.alpha(i) * f)) << 24);
    }

    public static defpackage.fia b(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
        defpackage.fia fiaVar = new defpackage.fia();
        java.util.WeakHashMap weakHashMap = defpackage.dvi.a;
        fiaVar.e = resources.getDrawable(i, theme);
        return fiaVar;
    }

    final android.graphics.PorterDuffColorFilter c(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint;
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        android.graphics.Rect rect = this.j;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        android.graphics.ColorFilter colorFilter = this.f;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        android.graphics.Matrix matrix = this.i;
        canvas.getMatrix(matrix);
        float[] fArr = this.h;
        matrix.getValues(fArr);
        float fAbs = java.lang.Math.abs(fArr[0]);
        float fAbs2 = java.lang.Math.abs(fArr[4]);
        float fAbs3 = java.lang.Math.abs(fArr[1]);
        float fAbs4 = java.lang.Math.abs(fArr[3]);
        if (fAbs3 != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || fAbs4 != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        float fWidth = rect.width();
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = java.lang.Math.min(2048, (int) (fWidth * fAbs));
        int iMin2 = java.lang.Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        defpackage.fhy fhyVar = this.b;
        android.graphics.Bitmap bitmap = fhyVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != fhyVar.f.getHeight()) {
            fhyVar.f = android.graphics.Bitmap.createBitmap(iMin, iMin2, android.graphics.Bitmap.Config.ARGB_8888);
            fhyVar.k = true;
        }
        boolean z = this.c;
        defpackage.fhy fhyVar2 = this.b;
        if (!z) {
            fhyVar2.a(iMin, iMin2);
        } else if (fhyVar2.k || fhyVar2.g != fhyVar2.c || fhyVar2.h != fhyVar2.d || fhyVar2.j != fhyVar2.e || fhyVar2.i != fhyVar2.b.getRootAlpha()) {
            this.b.a(iMin, iMin2);
            defpackage.fhy fhyVar3 = this.b;
            fhyVar3.g = fhyVar3.c;
            fhyVar3.h = fhyVar3.d;
            fhyVar3.i = fhyVar3.b.getRootAlpha();
            fhyVar3.j = fhyVar3.e;
            fhyVar3.k = false;
        }
        defpackage.fhy fhyVar4 = this.b;
        if (fhyVar4.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (fhyVar4.l == null) {
                fhyVar4.l = new android.graphics.Paint();
                fhyVar4.l.setFilterBitmap(true);
            }
            fhyVar4.l.setAlpha(fhyVar4.b.getRootAlpha());
            fhyVar4.l.setColorFilter(colorFilter);
            paint = fhyVar4.l;
        }
        canvas.drawBitmap(fhyVar4.f, (android.graphics.Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getColorFilter() : this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return new defpackage.fhz(drawable.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i;
        boolean z;
        int i2;
        int i3;
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        defpackage.fhy fhyVar = this.b;
        fhyVar.b = new defpackage.fhx();
        android.content.res.TypedArray typedArrayO = defpackage.dmh.o(resources, theme, attributeSet, defpackage.fhl.a);
        defpackage.fhy fhyVar2 = this.b;
        defpackage.fhx fhxVar = fhyVar2.b;
        fhyVar2.d = defpackage.a.Q(defpackage.dmh.m(typedArrayO, xmlPullParser, "tintMode", 6, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        android.content.res.ColorStateList colorStateListY = defpackage.dmh.y(typedArrayO, xmlPullParser, theme);
        if (colorStateListY != null) {
            fhyVar2.c = colorStateListY;
        }
        fhyVar2.e = defpackage.dmh.t(typedArrayO, xmlPullParser, "autoMirrored", 5, fhyVar2.e);
        fhxVar.g = defpackage.dmh.k(typedArrayO, xmlPullParser, "viewportWidth", 7, fhxVar.g);
        float fK = defpackage.dmh.k(typedArrayO, xmlPullParser, "viewportHeight", 8, fhxVar.h);
        fhxVar.h = fK;
        if (fhxVar.g <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.valueOf(typedArrayO.getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
        }
        if (fK <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.valueOf(typedArrayO.getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
        }
        int i4 = 3;
        fhxVar.e = typedArrayO.getDimension(3, fhxVar.e);
        int i5 = 2;
        float dimension = typedArrayO.getDimension(2, fhxVar.f);
        fhxVar.f = dimension;
        if (fhxVar.e <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.valueOf(typedArrayO.getPositionDescription()).concat("<vector> tag requires width > 0"));
        }
        if (dimension <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.valueOf(typedArrayO.getPositionDescription()).concat("<vector> tag requires height > 0"));
        }
        fhxVar.setAlpha(defpackage.dmh.k(typedArrayO, xmlPullParser, "alpha", 4, fhxVar.getAlpha()));
        boolean z2 = false;
        java.lang.String string = typedArrayO.getString(0);
        if (string != null) {
            fhxVar.j = string;
            fhxVar.l.put(string, fhxVar);
        }
        typedArrayO.recycle();
        fhyVar.a = getChangingConfigurations();
        int i6 = 1;
        fhyVar.k = true;
        defpackage.fhy fhyVar3 = this.b;
        defpackage.fhx fhxVar2 = fhyVar3.b;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        arrayDeque.push(fhxVar2.d);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z3 = true;
        while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i4)) {
            if (eventType == i5) {
                java.lang.String name = xmlPullParser.getName();
                defpackage.fhv fhvVar = (defpackage.fhv) arrayDeque.peek();
                if (fhvVar != null) {
                    if ("path".equals(name)) {
                        defpackage.fhu fhuVar = new defpackage.fhu();
                        android.content.res.TypedArray typedArrayO2 = defpackage.dmh.o(resources, theme, attributeSet, defpackage.fhl.c);
                        fhuVar.a = null;
                        if (defpackage.dmh.u(xmlPullParser, "pathData")) {
                            java.lang.String string2 = typedArrayO2.getString(0);
                            if (string2 != null) {
                                fhuVar.n = string2;
                            }
                            java.lang.String string3 = typedArrayO2.getString(2);
                            if (string3 != null) {
                                fhuVar.m = defpackage.dtk.d(string3);
                            }
                            fhuVar.d = defpackage.dmh.z(typedArrayO2, xmlPullParser, theme, "fillColor", 1);
                            fhuVar.f = defpackage.dmh.k(typedArrayO2, xmlPullParser, "fillAlpha", 12, fhuVar.f);
                            int iM = defpackage.dmh.m(typedArrayO2, xmlPullParser, "strokeLineCap", 8, -1);
                            android.graphics.Paint.Cap cap = fhuVar.j;
                            if (iM == 0) {
                                cap = android.graphics.Paint.Cap.BUTT;
                            } else if (iM == 1) {
                                cap = android.graphics.Paint.Cap.ROUND;
                            } else if (iM == 2) {
                                cap = android.graphics.Paint.Cap.SQUARE;
                            }
                            fhuVar.j = cap;
                            int iM2 = defpackage.dmh.m(typedArrayO2, xmlPullParser, "strokeLineJoin", 9, -1);
                            android.graphics.Paint.Join join = fhuVar.k;
                            if (iM2 == 0) {
                                join = android.graphics.Paint.Join.MITER;
                            } else if (iM2 == 1) {
                                join = android.graphics.Paint.Join.ROUND;
                            } else if (iM2 == 2) {
                                join = android.graphics.Paint.Join.BEVEL;
                            }
                            fhuVar.k = join;
                            fhuVar.l = defpackage.dmh.k(typedArrayO2, xmlPullParser, "strokeMiterLimit", 10, fhuVar.l);
                            fhuVar.b = defpackage.dmh.z(typedArrayO2, xmlPullParser, theme, "strokeColor", 3);
                            fhuVar.e = defpackage.dmh.k(typedArrayO2, xmlPullParser, "strokeAlpha", 11, fhuVar.e);
                            fhuVar.c = defpackage.dmh.k(typedArrayO2, xmlPullParser, "strokeWidth", 4, fhuVar.c);
                            fhuVar.h = defpackage.dmh.k(typedArrayO2, xmlPullParser, "trimPathEnd", 6, fhuVar.h);
                            fhuVar.i = defpackage.dmh.k(typedArrayO2, xmlPullParser, "trimPathOffset", 7, fhuVar.i);
                            fhuVar.g = defpackage.dmh.k(typedArrayO2, xmlPullParser, "trimPathStart", 5, fhuVar.g);
                            fhuVar.o = defpackage.dmh.m(typedArrayO2, xmlPullParser, "fillType", 13, fhuVar.o);
                        }
                        typedArrayO2.recycle();
                        fhvVar.b.add(fhuVar);
                        if (fhuVar.getPathName() != null) {
                            fhxVar2.l.put(fhuVar.getPathName(), fhuVar);
                        }
                        int i7 = fhyVar3.a;
                        z = false;
                        i2 = 3;
                        z3 = false;
                    } else {
                        depth = depth;
                        if ("clip-path".equals(name)) {
                            defpackage.fht fhtVar = new defpackage.fht();
                            if (defpackage.dmh.u(xmlPullParser, "pathData")) {
                                android.content.res.TypedArray typedArrayO3 = defpackage.dmh.o(resources, theme, attributeSet, defpackage.fhl.d);
                                java.lang.String string4 = typedArrayO3.getString(0);
                                if (string4 != null) {
                                    fhtVar.n = string4;
                                }
                                java.lang.String string5 = typedArrayO3.getString(1);
                                if (string5 != null) {
                                    fhtVar.m = defpackage.dtk.d(string5);
                                }
                                fhtVar.o = defpackage.dmh.m(typedArrayO3, xmlPullParser, "fillType", 2, 0);
                                typedArrayO3.recycle();
                            }
                            fhvVar.b.add(fhtVar);
                            if (fhtVar.getPathName() != null) {
                                fhxVar2.l.put(fhtVar.getPathName(), fhtVar);
                            }
                            int i8 = fhyVar3.a;
                            z = false;
                            i2 = 3;
                        } else if ("group".equals(name)) {
                            defpackage.fhv fhvVar2 = new defpackage.fhv();
                            android.content.res.TypedArray typedArrayO4 = defpackage.dmh.o(resources, theme, attributeSet, defpackage.fhl.b);
                            fhvVar2.l = null;
                            fhvVar2.c = defpackage.dmh.k(typedArrayO4, xmlPullParser, "rotation", 5, fhvVar2.c);
                            fhvVar2.d = typedArrayO4.getFloat(1, fhvVar2.d);
                            fhvVar2.e = typedArrayO4.getFloat(2, fhvVar2.e);
                            fhvVar2.f = defpackage.dmh.k(typedArrayO4, xmlPullParser, "scaleX", 3, fhvVar2.f);
                            fhvVar2.g = defpackage.dmh.k(typedArrayO4, xmlPullParser, "scaleY", 4, fhvVar2.g);
                            fhvVar2.h = defpackage.dmh.k(typedArrayO4, xmlPullParser, "translateX", 6, fhvVar2.h);
                            fhvVar2.i = defpackage.dmh.k(typedArrayO4, xmlPullParser, "translateY", 7, fhvVar2.i);
                            z = false;
                            java.lang.String string6 = typedArrayO4.getString(0);
                            if (string6 != null) {
                                fhvVar2.m = string6;
                            }
                            fhvVar2.a();
                            typedArrayO4.recycle();
                            fhvVar.b.add(fhvVar2);
                            arrayDeque.push(fhvVar2);
                            if (fhvVar2.getGroupName() != null) {
                                fhxVar2.l.put(fhvVar2.getGroupName(), fhvVar2);
                            }
                            int i9 = fhyVar3.a;
                            i2 = 3;
                        } else {
                            z = false;
                        }
                    }
                    i = 1;
                    i3 = 2;
                } else {
                    z = z2;
                    depth = depth;
                }
                i2 = 3;
                i = 1;
                i3 = 2;
            } else {
                i = i6;
                z = z2;
                i2 = i4;
                depth = depth;
                i3 = i5;
                if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i4 = i2;
            i5 = i3;
            depth = depth;
            z2 = z;
            i6 = i;
        }
        if (z3) {
            throw new org.xmlpull.v1.XmlPullParserException("no path defined");
        }
        this.d = c(fhyVar.c, fhyVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        defpackage.fhy fhyVar = this.b;
        if (fhyVar == null) {
            return false;
        }
        if (fhyVar.b()) {
            return true;
        }
        android.content.res.ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            this.b = new defpackage.fhy(this.b);
            this.g = true;
        }
        return this;
    }

    @Override // defpackage.fhs, android.graphics.drawable.Drawable
    protected final void onBoundsChange(android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        android.graphics.PorterDuff.Mode mode;
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        defpackage.fhy fhyVar = this.b;
        android.content.res.ColorStateList colorStateList = fhyVar.c;
        boolean z = false;
        if (colorStateList != null && (mode = fhyVar.d) != null) {
            this.d = c(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (fhyVar.b()) {
            boolean zC = fhyVar.b.d.c(iArr);
            fhyVar.k |= zC;
            if (zC) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(java.lang.Runnable runnable, long j) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(android.content.res.ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        defpackage.fhy fhyVar = this.b;
        if (fhyVar.c != colorStateList) {
            fhyVar.c = colorStateList;
            this.d = c(colorStateList, fhyVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        defpackage.fhy fhyVar = this.b;
        if (fhyVar.d != mode) {
            fhyVar.d = mode;
            this.d = c(fhyVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(java.lang.Runnable runnable) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public fia() {
        this.c = true;
        this.h = new float[9];
        this.i = new android.graphics.Matrix();
        this.j = new android.graphics.Rect();
        this.b = new defpackage.fhy();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
