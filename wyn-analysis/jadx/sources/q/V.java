package q;

import K8.C0694f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import i.AbstractC2820a;
import j1.AbstractC3076d;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import ka.AbstractC3256n;
import n1.InterfaceC3577k;
import r7.AbstractC3935e;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f43707a;

    /* renamed from: b, reason: collision with root package name */
    public C0694f f43708b;

    /* renamed from: c, reason: collision with root package name */
    public C0694f f43709c;

    /* renamed from: d, reason: collision with root package name */
    public C0694f f43710d;

    /* renamed from: e, reason: collision with root package name */
    public C0694f f43711e;

    /* renamed from: f, reason: collision with root package name */
    public C0694f f43712f;

    /* renamed from: g, reason: collision with root package name */
    public C0694f f43713g;

    /* renamed from: h, reason: collision with root package name */
    public C0694f f43714h;

    /* renamed from: i, reason: collision with root package name */
    public final C3811f0 f43715i;

    /* renamed from: j, reason: collision with root package name */
    public int f43716j = 0;
    public int k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f43717l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f43718m;

    public V(TextView textView) {
        this.f43707a = textView;
        this.f43715i = new C3811f0(textView);
    }

    public static C0694f c(Context context, C3830p c3830p, int i5) {
        ColorStateList colorStateListI;
        synchronized (c3830p) {
            colorStateListI = c3830p.f43866a.i(context, i5);
        }
        if (colorStateListI == null) {
            return null;
        }
        C0694f c0694f = new C0694f();
        c0694f.f6640b = true;
        c0694f.f6641c = colorStateListI;
        return c0694f;
    }

    public final void a(Drawable drawable, C0694f c0694f) {
        if (drawable == null || c0694f == null) {
            return;
        }
        C3830p.e(drawable, c0694f, this.f43707a.getDrawableState());
    }

    public final void b() {
        C0694f c0694f = this.f43708b;
        TextView textView = this.f43707a;
        if (c0694f != null || this.f43709c != null || this.f43710d != null || this.f43711e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f43708b);
            a(compoundDrawables[1], this.f43709c);
            a(compoundDrawables[2], this.f43710d);
            a(compoundDrawables[3], this.f43711e);
        }
        if (this.f43712f == null && this.f43713g == null) {
            return;
        }
        Drawable[] drawableArrA = P.a(textView);
        a(drawableArrA[0], this.f43712f);
        a(drawableArrA[2], this.f43713g);
    }

    public final ColorStateList d() {
        C0694f c0694f = this.f43714h;
        if (c0694f != null) {
            return (ColorStateList) c0694f.f6641c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        C0694f c0694f = this.f43714h;
        if (c0694f != null) {
            return (PorterDuff.Mode) c0694f.f6642d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AttributeSet attributeSet, int i5) throws Resources.NotFoundException {
        boolean z2;
        boolean z10;
        String string;
        String string2;
        ColorStateList colorStateList;
        int resourceId;
        int i10;
        int resourceId2;
        TextView textView = this.f43707a;
        Context context = textView.getContext();
        C3830p c3830pA = C3830p.a();
        int[] iArr = AbstractC2820a.f36445h;
        md.J jS = md.J.s(context, attributeSet, iArr, i5, 0);
        k1.S.l(textView, textView.getContext(), iArr, attributeSet, (TypedArray) jS.f40581b, i5);
        TypedArray typedArray = (TypedArray) jS.f40581b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f43708b = c(context, c3830pA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f43709c = c(context, c3830pA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f43710d = c(context, c3830pA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f43711e = c(context, c3830pA, typedArray.getResourceId(2, 0));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f43712f = c(context, c3830pA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f43713g = c(context, c3830pA, typedArray.getResourceId(6, 0));
        }
        jS.v();
        boolean z11 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC2820a.f36460x;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            md.J j8 = new md.J(context, typedArrayObtainStyledAttributes);
            if (z11 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z10 = false;
            } else {
                z10 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            m(context, j8);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (i11 < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            j8.v();
        } else {
            z2 = false;
            z10 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i5, 0);
        md.J j10 = new md.J(context, typedArrayObtainStyledAttributes2);
        if (!z11 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z10 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        boolean z12 = z10;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        String str = string2;
        if (i11 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i11 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        m(context, j10);
        j10.v();
        if (!z11 && z2) {
            textView.setAllCaps(z12);
        }
        Typeface typeface = this.f43717l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.f43716j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            T.d(textView, string);
        }
        if (str != null) {
            if (i11 >= 24) {
                S.b(textView, S.a(str));
            } else {
                P.c(textView, Q.a(str.split(",")[0]));
            }
        }
        int[] iArr3 = AbstractC2820a.f36446i;
        C3811f0 c3811f0 = this.f43715i;
        Context context2 = c3811f0.f43780j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i5, 0);
        TextView textView2 = c3811f0.f43779i;
        k1.S.l(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i5);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c3811f0.f43771a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i12 = 0; i12 < length; i12++) {
                    iArr4[i12] = typedArrayObtainTypedArray.getDimensionPixelSize(i12, -1);
                }
                c3811f0.f43776f = C3811f0.b(iArr4);
                c3811f0.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c3811f0.j()) {
            c3811f0.f43771a = 0;
        } else if (c3811f0.f43771a == 1) {
            if (!c3811f0.f43777g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i10 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i10 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i10, 112.0f, displayMetrics);
                }
                float f10 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c3811f0.k(dimension2, f10, dimension);
            }
            c3811f0.h();
        }
        if (v1.f43928b && c3811f0.f43771a != 0) {
            int[] iArr5 = c3811f0.f43776f;
            if (iArr5.length > 0) {
                if (T.a(textView) != -1.0f) {
                    T.b(textView, Math.round(c3811f0.f43774d), Math.round(c3811f0.f43775e), Math.round(c3811f0.f43773c), 0);
                } else {
                    T.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? c3830pA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? c3830pA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? c3830pA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? c3830pA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? c3830pA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? c3830pA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] drawableArrA = P.a(textView);
            if (drawableB5 == null) {
                drawableB5 = drawableArrA[0];
            }
            if (drawableB2 == null) {
                drawableB2 = drawableArrA[1];
            }
            if (drawableB6 == null) {
                drawableB6 = drawableArrA[2];
            }
            if (drawableB4 == null) {
                drawableB4 = drawableArrA[3];
            }
            P.b(textView, drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] drawableArrA2 = P.a(textView);
            Drawable drawable = drawableArrA2[0];
            if (drawable == null && drawableArrA2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = drawableArrA2[1];
                }
                Drawable drawable2 = drawableArrA2[2];
                if (drawableB4 == null) {
                    drawableB4 = drawableArrA2[3];
                }
                P.b(textView, drawable, drawableB2, drawable2, drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = Y0.e.getColorStateList(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintList(colorStateList);
            } else if (textView instanceof InterfaceC3577k) {
                ((InterfaceC3577k) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeC = AbstractC3827n0.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintMode(modeC);
            } else if (textView instanceof InterfaceC3577k) {
                ((InterfaceC3577k) textView).setSupportCompoundDrawablesTintMode(modeC);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            AbstractC3935e.L(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            AbstractC3935e.M(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            AbstractC3076d.c(dimensionPixelSize3);
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r1, 1.0f);
            }
        }
    }

    public final void g(Context context, int i5) throws Resources.NotFoundException {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i5, AbstractC2820a.f36460x);
        md.J j8 = new md.J(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f43707a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        m(context, j8);
        if (i10 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            T.d(textView, string);
        }
        j8.v();
        Typeface typeface = this.f43717l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f43716j);
        }
    }

    public final void h(int i5, int i10, int i11, int i12) {
        C3811f0 c3811f0 = this.f43715i;
        if (c3811f0.j()) {
            DisplayMetrics displayMetrics = c3811f0.f43780j.getResources().getDisplayMetrics();
            c3811f0.k(TypedValue.applyDimension(i12, i5, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (c3811f0.h()) {
                c3811f0.a();
            }
        }
    }

    public final void i(int[] iArr, int i5) {
        C3811f0 c3811f0 = this.f43715i;
        if (c3811f0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i5 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c3811f0.f43780j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArrCopyOf[i10] = Math.round(TypedValue.applyDimension(i5, iArr[i10], displayMetrics));
                    }
                }
                c3811f0.f43776f = C3811f0.b(iArrCopyOf);
                if (!c3811f0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c3811f0.f43777g = false;
            }
            if (c3811f0.h()) {
                c3811f0.a();
            }
        }
    }

    public final void j(int i5) {
        C3811f0 c3811f0 = this.f43715i;
        if (c3811f0.j()) {
            if (i5 == 0) {
                c3811f0.f43771a = 0;
                c3811f0.f43774d = -1.0f;
                c3811f0.f43775e = -1.0f;
                c3811f0.f43773c = -1.0f;
                c3811f0.f43776f = new int[0];
                c3811f0.f43772b = false;
                return;
            }
            if (i5 != 1) {
                throw new IllegalArgumentException(AbstractC3256n.g(i5, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c3811f0.f43780j.getResources().getDisplayMetrics();
            c3811f0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c3811f0.h()) {
                c3811f0.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f43714h == null) {
            this.f43714h = new C0694f();
        }
        C0694f c0694f = this.f43714h;
        c0694f.f6641c = colorStateList;
        c0694f.f6640b = colorStateList != null;
        this.f43708b = c0694f;
        this.f43709c = c0694f;
        this.f43710d = c0694f;
        this.f43711e = c0694f;
        this.f43712f = c0694f;
        this.f43713g = c0694f;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.f43714h == null) {
            this.f43714h = new C0694f();
        }
        C0694f c0694f = this.f43714h;
        c0694f.f6642d = mode;
        c0694f.f6639a = mode != null;
        this.f43708b = c0694f;
        this.f43709c = c0694f;
        this.f43710d = c0694f;
        this.f43711e = c0694f;
        this.f43712f = c0694f;
        this.f43713g = c0694f;
    }

    public final void m(Context context, md.J j8) {
        String string;
        int i5 = this.f43716j;
        TypedArray typedArray = (TypedArray) j8.f40581b;
        this.f43716j = typedArray.getInt(2, i5);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.k = i11;
            if (i11 != -1) {
                this.f43716j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f43718m = false;
                int i12 = typedArray.getInt(1, 1);
                if (i12 == 1) {
                    this.f43717l = Typeface.SANS_SERIF;
                    return;
                } else if (i12 == 2) {
                    this.f43717l = Typeface.SERIF;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f43717l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f43717l = null;
        int i13 = typedArray.hasValue(12) ? 12 : 10;
        int i14 = this.k;
        int i15 = this.f43716j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceP = j8.p(i13, this.f43716j, new O(this, i14, i15, new WeakReference(this.f43707a)));
                if (typefaceP != null) {
                    if (i10 < 28 || this.k == -1) {
                        this.f43717l = typefaceP;
                    } else {
                        this.f43717l = U.a(Typeface.create(typefaceP, 0), this.k, (this.f43716j & 2) != 0);
                    }
                }
                this.f43718m = this.f43717l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f43717l != null || (string = typedArray.getString(i13)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.f43717l = Typeface.create(string, this.f43716j);
        } else {
            this.f43717l = U.a(Typeface.create(string, 0), this.k, (this.f43716j & 2) != 0);
        }
    }
}
