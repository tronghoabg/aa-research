package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jx {
    public android.graphics.Typeface b;
    public boolean c;
    private final android.widget.TextView d;
    private ng e;
    private ng f;
    private ng g;
    private ng h;
    private ng i;
    private ng j;
    private final defpackage.kc k;
    public int a = 0;
    private int l = -1;
    private java.lang.String m = null;

    public jx(android.widget.TextView textView) {
        this.d = textView;
        this.k = new defpackage.kc(textView);
    }

    public static void b(android.widget.TextView textView, android.graphics.Typeface typeface, int i) {
        defpackage.aab aabVar = jw.a;
        java.lang.String strM = ep$.ExternalSyntheticApiModelOutline1.m(textView);
        if (!android.text.TextUtils.isEmpty(strM)) {
            jw.b(textView, (java.lang.String) null);
        }
        textView.setTypeface(typeface, i);
        if (android.text.TextUtils.isEmpty(strM)) {
            return;
        }
        jw.b(textView, strM);
    }

    static final void f(android.widget.TextView textView, android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        edz.a(editorInfo, textView.getText());
    }

    private static ng g(android.content.Context context, defpackage.jd jdVar, int i) {
        android.content.res.ColorStateList colorStateListA = jdVar.a(context, i);
        if (colorStateListA == null) {
            return null;
        }
        ng ngVar = new ng();
        ngVar.d = true;
        ngVar.a = colorStateListA;
        return ngVar;
    }

    private final void h(android.graphics.drawable.Drawable drawable, ng ngVar) {
        if (drawable == null || ngVar == null) {
            return;
        }
        defpackage.mu.g(drawable, ngVar, this.d.getDrawableState());
    }

    private final void i(boolean z) {
        android.graphics.Typeface typeface = this.b;
        if (typeface != null) {
            int i = this.l;
            android.widget.TextView textView = this.d;
            if (i == -1) {
                textView.setTypeface(typeface, this.a);
            } else {
                textView.setTypeface(typeface);
            }
        } else if (z) {
            this.d.setTypeface(null);
        }
        java.lang.String str = this.m;
        if (str != null) {
            jw.b(this.d, str);
        }
    }

    private final boolean j(android.content.Context context, defpackage.lam lamVar) {
        java.lang.String strV;
        android.graphics.Typeface typeface;
        android.graphics.Typeface typeface2;
        int[] iArr = defpackage.ft.a;
        this.a = lamVar.n(2, this.a);
        int iN = lamVar.n(11, -1);
        this.l = iN;
        if (iN != -1) {
            this.a &= 2;
        }
        if (lamVar.y(13)) {
            this.m = lamVar.v(13);
        }
        if (!lamVar.y(10) && !lamVar.y(12)) {
            if (!lamVar.y(1)) {
                int i = this.l;
                if (i == -1 || (typeface = this.b) == null) {
                    return false;
                }
                this.b = hh$.ExternalSyntheticApiModelOutline0.m(typeface, i, (2 & this.a) != 0);
                return true;
            }
            this.c = false;
            int iN2 = lamVar.n(1, 1);
            if (iN2 == 1) {
                typeface2 = android.graphics.Typeface.SANS_SERIF;
            } else {
                if (iN2 != 2) {
                    if (iN2 == 3) {
                        typeface2 = android.graphics.Typeface.MONOSPACE;
                    }
                    return true;
                }
                typeface2 = android.graphics.Typeface.SERIF;
            }
            this.b = typeface2;
            return true;
        }
        android.graphics.Typeface typefaceD = null;
        this.b = null;
        int i2 = true == lamVar.y(12) ? 12 : 10;
        int i3 = this.l;
        int i4 = this.a;
        if (!context.isRestricted()) {
            defpackage.ju juVar = new defpackage.ju(this, i3, i4, new java.lang.ref.WeakReference(this.d));
            try {
                int i5 = this.a;
                int resourceId = ((android.content.res.TypedArray) lamVar.a).getResourceId(i2, 0);
                if (resourceId != 0) {
                    if (lamVar.b == null) {
                        lamVar.b = new android.util.TypedValue();
                    }
                    java.lang.Object obj = lamVar.c;
                    java.lang.Object obj2 = lamVar.b;
                    java.util.WeakHashMap weakHashMap = defpackage.dvi.a;
                    if (!((android.content.Context) obj).isRestricted()) {
                        typefaceD = defpackage.dvi.d((android.content.Context) obj, resourceId, (android.util.TypedValue) obj2, i5, juVar, true, false);
                    }
                }
                if (typefaceD != null) {
                    if (this.l != -1) {
                        this.b = hh$.ExternalSyntheticApiModelOutline0.m(android.graphics.Typeface.create(typefaceD, 0), this.l, (this.a & 2) != 0);
                    } else {
                        this.b = typefaceD;
                    }
                }
                this.c = this.b == null;
            } catch (android.content.res.Resources.NotFoundException | java.lang.UnsupportedOperationException unused) {
            }
        }
        if (this.b == null && (strV = lamVar.v(i2)) != null) {
            if (this.l != -1) {
                this.b = hh$.ExternalSyntheticApiModelOutline0.m(android.graphics.Typeface.create(strV, 0), this.l, (2 & this.a) != 0);
            } else {
                this.b = android.graphics.Typeface.create(strV, this.a);
            }
        }
        return true;
    }

    final void a() {
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            android.graphics.drawable.Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            h(compoundDrawables[0], this.e);
            h(compoundDrawables[1], this.f);
            h(compoundDrawables[2], this.g);
            h(compoundDrawables[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        h(compoundDrawablesRelative[0], this.i);
        h(compoundDrawablesRelative[2], this.j);
    }

    /* JADX WARN: Code duplicated, block: B:188:0x038c  */
    /* JADX WARN: Code duplicated, block: B:189:0x038e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0395  */
    /* JADX WARN: Code duplicated, block: B:195:0x039c  */
    /* JADX WARN: Code duplicated, block: B:197:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:199:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:219:0x040f  */
    /* JADX WARN: Code duplicated, block: B:221:0x0417  */
    /* JADX WARN: Code duplicated, block: B:223:0x0428  */
    /* JADX WARN: Code duplicated, block: B:224:0x042b  */
    /* JADX WARN: Code duplicated, block: B:227:0x0433  */
    /* JADX WARN: Code duplicated, block: B:230:0x0447 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:231:0x0449  */
    /* JADX WARN: Code duplicated, block: B:233:0x044e  */
    /* JADX WARN: Code duplicated, block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c(android.util.AttributeSet attributeSet, int i) {
        boolean zX;
        boolean z;
        java.lang.String strV;
        int i2;
        boolean z2;
        float fM;
        int i3;
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        int i4;
        android.graphics.drawable.Drawable[] compoundDrawablesRelative;
        int i5;
        int resourceId;
        android.widget.TextView textView = this.d;
        android.content.Context context = textView.getContext();
        defpackage.jd jdVarD = defpackage.jd.d();
        int[] iArr = defpackage.ft.h;
        defpackage.lam lamVar = new defpackage.lam(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
        defpackage.ebt.m(textView, textView.getContext(), iArr, attributeSet, (android.content.res.TypedArray) lamVar.a, i, 0);
        int iQ = lamVar.q(0, -1);
        if (lamVar.y(3)) {
            this.e = g(context, jdVarD, lamVar.q(3, 0));
        }
        if (lamVar.y(1)) {
            this.f = g(context, jdVarD, lamVar.q(1, 0));
        }
        if (lamVar.y(4)) {
            this.g = g(context, jdVarD, lamVar.q(4, 0));
        }
        if (lamVar.y(2)) {
            this.h = g(context, jdVarD, lamVar.q(2, 0));
        }
        if (lamVar.y(5)) {
            this.i = g(context, jdVarD, lamVar.q(5, 0));
        }
        if (lamVar.y(6)) {
            this.j = g(context, jdVarD, lamVar.q(6, 0));
        }
        lamVar.w();
        boolean z3 = textView.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod;
        if (iQ != -1) {
            defpackage.lam lamVar2 = new defpackage.lam(context, context.obtainStyledAttributes(iQ, defpackage.ft.x));
            if (z3 || !lamVar2.y(14)) {
                zX = false;
                z = false;
            } else {
                zX = lamVar2.x(14, false);
                z = true;
            }
            j(context, lamVar2);
            strV = lamVar2.y(15) ? lamVar2.v(15) : null;
            lamVar2.w();
        } else {
            zX = false;
            z = false;
            strV = null;
        }
        defpackage.lam lamVar3 = new defpackage.lam(context, context.obtainStyledAttributes(attributeSet, defpackage.ft.x, i, 0));
        if (!z3 && lamVar3.y(14)) {
            zX = lamVar3.x(14, false);
            z = true;
        }
        if (lamVar3.y(15)) {
            strV = lamVar3.v(15);
        }
        if (lamVar3.y(0) && lamVar3.m(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        j(context, lamVar3);
        lamVar3.w();
        if (!z3 && z) {
            e(zX);
        }
        i(false);
        if (strV != null) {
            a$.ExternalSyntheticApiModelOutline2.m(textView, a$.ExternalSyntheticApiModelOutline2.m(strV));
        }
        defpackage.kc kcVar = this.k;
        android.content.Context context2 = kcVar.h;
        int[] iArr2 = defpackage.ft.i;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        android.widget.TextView textView2 = kcVar.g;
        defpackage.ebt.m(textView2, textView2.getContext(), iArr2, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            kcVar.a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(2) ? typedArrayObtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(1) ? typedArrayObtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) <= 0) {
            i2 = 0;
        } else {
            android.content.res.TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            i2 = 0;
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr3[i6] = typedArrayObtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                kcVar.e = defpackage.kc.b(iArr3);
                int[] iArr4 = kcVar.e;
                int length2 = iArr4.length;
                boolean z4 = length2 > 0;
                kcVar.f = z4;
                if (z4) {
                    kcVar.a = 1;
                    kcVar.c = iArr4[0];
                    kcVar.d = iArr4[length2 - 1];
                    kcVar.b = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!kcVar.a()) {
            kcVar.a = i2;
        } else if (kcVar.a == 1) {
            boolean z5 = kcVar.f;
            if (!z5) {
                android.util.DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i5 = 2;
                    dimension2 = android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i5 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = android.util.TypedValue.applyDimension(i5, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new java.lang.IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    throw new java.lang.IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= 0.0f) {
                    throw new java.lang.IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                kcVar.a = 1;
                kcVar.c = dimension2;
                kcVar.d = dimension3;
                kcVar.b = dimension;
                kcVar.f = i2;
                z5 = false;
            }
            if (kcVar.a() && (!z5 || kcVar.e.length == 0)) {
                int iFloor = ((int) java.lang.Math.floor((kcVar.d - kcVar.c) / kcVar.b)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i7 = 0; i7 < iFloor; i7++) {
                    iArr5[i7] = java.lang.Math.round(kcVar.c + (i7 * kcVar.b));
                }
                kcVar.e = defpackage.kc.b(iArr5);
            }
        }
        if (kcVar.a != 0) {
            int[] iArr6 = kcVar.e;
            if (iArr6.length > 0) {
                defpackage.aab aabVar = jw.a;
                if (ep$.ExternalSyntheticApiModelOutline1.m(textView) != -1.0f) {
                    ep$.ExternalSyntheticApiModelOutline1.m(textView, java.lang.Math.round(kcVar.c), java.lang.Math.round(kcVar.d), java.lang.Math.round(kcVar.b), 0);
                } else {
                    ep$.ExternalSyntheticApiModelOutline1.m(textView, iArr6, 0);
                }
            }
        }
        defpackage.lam lamVar4 = new defpackage.lam(context, context.obtainStyledAttributes(attributeSet, iArr2));
        int iQ2 = lamVar4.q(8, -1);
        android.graphics.drawable.Drawable drawableC = iQ2 != -1 ? jdVarD.c(context, iQ2) : null;
        int iQ3 = lamVar4.q(13, -1);
        android.graphics.drawable.Drawable drawableC2 = iQ3 != -1 ? jdVarD.c(context, iQ3) : null;
        int iQ4 = lamVar4.q(9, -1);
        android.graphics.drawable.Drawable drawableC3 = iQ4 != -1 ? jdVarD.c(context, iQ4) : null;
        int iQ5 = lamVar4.q(6, -1);
        android.graphics.drawable.Drawable drawableC4 = iQ5 != -1 ? jdVarD.c(context, iQ5) : null;
        int iQ6 = lamVar4.q(10, -1);
        android.graphics.drawable.Drawable drawableC5 = iQ6 != -1 ? jdVarD.c(context, iQ6) : null;
        int iQ7 = lamVar4.q(7, -1);
        android.graphics.drawable.Drawable drawableC6 = iQ7 != -1 ? jdVarD.c(context, iQ7) : null;
        if (drawableC5 != null) {
            if (drawableC4 != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableC5 == null) {
                drawableC5 = compoundDrawablesRelative[0];
            }
            if (drawableC2 == null) {
                drawableC2 = compoundDrawablesRelative[1];
            }
            if (drawableC6 == null) {
                drawableC6 = compoundDrawablesRelative[2];
            }
            if (true == z2) {
                drawableC4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableC5, drawableC2, drawableC6, drawableC4);
        } else if (drawableC6 != null) {
            if (drawableC4 != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableC5 == null) {
                drawableC5 = compoundDrawablesRelative[0];
            }
            if (drawableC2 == null) {
                drawableC2 = compoundDrawablesRelative[1];
            }
            if (drawableC6 == null) {
                drawableC6 = compoundDrawablesRelative[2];
            }
            if (true == z2) {
                drawableC4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableC5, drawableC2, drawableC6, drawableC4);
        } else if (drawableC != null || drawableC2 != null || drawableC3 != null || drawableC4 != null) {
            android.graphics.drawable.Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            android.graphics.drawable.Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableC == null) {
                    drawableC = compoundDrawables[0];
                }
                if (drawableC2 == null) {
                    drawableC2 = compoundDrawables[1];
                }
                if (drawableC3 == null) {
                    drawableC3 = compoundDrawables[2];
                }
                if (drawableC4 == null) {
                    drawableC4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableC, drawableC2, drawableC3, drawableC4);
            } else {
                if (drawableC2 == null) {
                    drawableC2 = compoundDrawablesRelative2[1];
                }
                if (drawableC4 == null) {
                    drawableC4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableC2, compoundDrawablesRelative2[2], drawableC4);
            }
        }
        if (lamVar4.y(11)) {
            textView.setCompoundDrawableTintList(lamVar4.r(11));
        }
        if (lamVar4.y(12)) {
            int iN = lamVar4.n(12, -1);
            android.graphics.Rect rect = defpackage.kp.a;
            textView.setCompoundDrawableTintMode(defpackage.a.Q(iN, null));
        }
        int iM = lamVar4.m(15, -1);
        int iM2 = lamVar4.m(18, -1);
        if (lamVar4.y(19)) {
            android.util.TypedValue typedValuePeekValue = ((android.content.res.TypedArray) lamVar4.a).peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                fM = lamVar4.m(19, -1);
            } else {
                i3 = typedValuePeekValue.data & 15;
                fM = android.util.TypedValue.complexToFloat(typedValuePeekValue.data);
            }
            lamVar4.w();
            if (iM != -1) {
                defpackage.ebl.p(iM);
                jx$.ExternalSyntheticApiModelOutline3.m(textView, iM);
            }
            if (iM2 != -1) {
                defpackage.ebl.p(iM2);
                fontMetricsInt = textView.getPaint().getFontMetricsInt();
                if (textView.getIncludeFontPadding()) {
                    i4 = fontMetricsInt.bottom;
                } else {
                    i4 = fontMetricsInt.descent;
                }
                if (iM2 > java.lang.Math.abs(i4)) {
                    textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), iM2 - i4);
                }
            }
            if (fM != -1.0f) {
                if (i3 == -1) {
                    defpackage.dtf.b(textView, (int) fM);
                } else {
                    defpackage.dtf.c(textView, i3, fM);
                }
            }
        }
        fM = -1.0f;
        i3 = -1;
        lamVar4.w();
        if (iM != -1) {
            defpackage.ebl.p(iM);
            jx$.ExternalSyntheticApiModelOutline3.m(textView, iM);
        }
        if (iM2 != -1) {
            defpackage.ebl.p(iM2);
            fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i4 = fontMetricsInt.bottom;
            } else {
                i4 = fontMetricsInt.descent;
            }
            if (iM2 > java.lang.Math.abs(i4)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), iM2 - i4);
            }
        }
        if (fM != -1.0f) {
            if (i3 == -1) {
                defpackage.dtf.b(textView, (int) fM);
            } else {
                defpackage.dtf.c(textView, i3, fM);
            }
        }
    }

    final void d(android.content.Context context, int i) {
        defpackage.lam lamVar = new defpackage.lam(context, context.obtainStyledAttributes(i, defpackage.ft.x));
        if (lamVar.y(14)) {
            e(lamVar.x(14, false));
        }
        if (lamVar.y(0) && lamVar.m(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        boolean zJ = j(context, lamVar);
        lamVar.w();
        i(zJ);
    }

    final void e(boolean z) {
        this.d.setAllCaps(z);
    }
}
