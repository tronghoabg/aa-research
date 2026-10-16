package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bj {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f1140a;

    /* renamed from: b, reason: collision with root package name */
    private gb f1141b;

    /* renamed from: c, reason: collision with root package name */
    private gb f1142c;

    /* renamed from: d, reason: collision with root package name */
    private gb f1143d;

    /* renamed from: e, reason: collision with root package name */
    private gb f1144e;

    /* renamed from: f, reason: collision with root package name */
    private gb f1145f;

    /* renamed from: g, reason: collision with root package name */
    private gb f1146g;

    /* renamed from: h, reason: collision with root package name */
    private gb f1147h;

    /* renamed from: i, reason: collision with root package name */
    private final bo f1148i;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f1151l;
    private boolean n;

    /* renamed from: j, reason: collision with root package name */
    private int f1149j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f1150k = -1;
    private String m = null;

    bj(TextView textView) {
        this.f1140a = textView;
        this.f1148i = new bo(textView);
    }

    static final void k(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
    }

    private static gb l(Context context, ae aeVar, int i2) {
        ColorStateList colorStateListA = aeVar.a(context, i2);
        if (colorStateListA == null) {
            return null;
        }
        gb gbVar = new gb();
        gbVar.f1543d = true;
        gbVar.f1540a = colorStateListA;
        return gbVar;
    }

    private final void m(Drawable drawable, gb gbVar) {
        if (drawable == null || gbVar == null) {
            return;
        }
        fj.h(drawable, gbVar, this.f1140a.getDrawableState());
    }

    private final void n(boolean z) {
        Typeface typeface = this.f1151l;
        if (typeface != null) {
            int i2 = this.f1150k;
            TextView textView = this.f1140a;
            if (i2 == -1) {
                textView.setTypeface(typeface, this.f1149j);
            } else {
                textView.setTypeface(typeface);
            }
        } else if (z) {
            this.f1140a.setTypeface(null);
        }
        String str = this.m;
        if (str != null) {
            bh.b(this.f1140a, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(TextView textView, Typeface typeface, int i2) {
        int i3 = bh.f1132a;
        String fontVariationSettings = textView.getFontVariationSettings();
        if (!TextUtils.isEmpty(fontVariationSettings)) {
            bh.b(textView, null);
        }
        textView.setTypeface(typeface, i2);
        if (TextUtils.isEmpty(fontVariationSettings)) {
            return;
        }
        bh.b(textView, fontVariationSettings);
    }

    private final void p() {
        gb gbVar = this.f1147h;
        this.f1141b = gbVar;
        this.f1142c = gbVar;
        this.f1143d = gbVar;
        this.f1144e = gbVar;
        this.f1145f = gbVar;
        this.f1146g = gbVar;
    }

    private final boolean q(Context context, gc gcVar) {
        String strP;
        Typeface typeface;
        Typeface typeface2;
        int[] iArr = android.support.v7.a.a.f479a;
        this.f1149j = gcVar.c(2, this.f1149j);
        int iC = gcVar.c(11, -1);
        this.f1150k = iC;
        if (iC != -1) {
            this.f1149j &= 2;
        }
        if (gcVar.s(13)) {
            this.m = gcVar.p(13);
        }
        if (gcVar.s(10) || gcVar.s(12)) {
            this.f1151l = null;
            int i2 = true == gcVar.s(12) ? 12 : 10;
            int i3 = this.f1150k;
            int i4 = this.f1149j;
            if (!context.isRestricted()) {
                try {
                    Typeface typefaceI = gcVar.i(i2, this.f1149j, new be(this, i3, i4, new WeakReference(this.f1140a)));
                    if (typefaceI != null) {
                        if (this.f1150k != -1) {
                            this.f1151l = Typeface.create(Typeface.create(typefaceI, 0), this.f1150k, (this.f1149j & 2) != 0);
                        } else {
                            this.f1151l = typefaceI;
                        }
                    }
                    this.n = this.f1151l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1151l == null && (strP = gcVar.p(i2)) != null) {
                if (this.f1150k != -1) {
                    this.f1151l = Typeface.create(Typeface.create(strP, 0), this.f1150k, (this.f1149j & 2) != 0);
                } else {
                    this.f1151l = Typeface.create(strP, this.f1149j);
                }
            }
            return true;
        }
        if (!gcVar.s(1)) {
            int i5 = this.f1150k;
            if (i5 == -1 || (typeface = this.f1151l) == null) {
                return false;
            }
            this.f1151l = Typeface.create(typeface, i5, (this.f1149j & 2) != 0);
            return true;
        }
        this.n = false;
        int iC2 = gcVar.c(1, 1);
        if (iC2 == 1) {
            typeface2 = Typeface.SANS_SERIF;
        } else {
            if (iC2 != 2) {
                if (iC2 == 3) {
                    typeface2 = Typeface.MONOSPACE;
                }
                return true;
            }
            typeface2 = Typeface.SERIF;
        }
        this.f1151l = typeface2;
        return true;
    }

    final ColorStateList a() {
        gb gbVar = this.f1147h;
        if (gbVar != null) {
            return gbVar.f1540a;
        }
        return null;
    }

    final PorterDuff.Mode b() {
        gb gbVar = this.f1147h;
        if (gbVar != null) {
            return gbVar.f1541b;
        }
        return null;
    }

    final void d() {
        if (this.f1141b != null || this.f1142c != null || this.f1143d != null || this.f1144e != null) {
            Drawable[] compoundDrawables = this.f1140a.getCompoundDrawables();
            m(compoundDrawables[0], this.f1141b);
            m(compoundDrawables[1], this.f1142c);
            m(compoundDrawables[2], this.f1143d);
            m(compoundDrawables[3], this.f1144e);
        }
        if (this.f1145f == null && this.f1146g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f1140a.getCompoundDrawablesRelative();
        m(compoundDrawablesRelative[0], this.f1145f);
        m(compoundDrawablesRelative[2], this.f1146g);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void e(android.util.AttributeSet r22, int r23) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.bj.e(android.util.AttributeSet, int):void");
    }

    final void f(WeakReference weakReference, Typeface typeface) {
        if (this.n) {
            this.f1151l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = this.f1149j;
                if (zIsAttachedToWindow) {
                    textView.post(new bf(textView, typeface, i2));
                } else {
                    o(textView, typeface, i2);
                }
            }
        }
    }

    final void g(Context context, int i2) {
        gc gcVarL = gc.l(context, i2, android.support.v7.a.a.w);
        if (gcVarL.s(14)) {
            h(gcVarL.r(14, false));
        }
        if (gcVarL.s(0) && gcVarL.b(0, -1) == 0) {
            this.f1140a.setTextSize(0, 0.0f);
        }
        boolean zQ = q(context, gcVarL);
        gcVarL.q();
        n(zQ);
    }

    final void h(boolean z) {
        this.f1140a.setAllCaps(z);
    }

    final void i(ColorStateList colorStateList) {
        gb gbVar = this.f1147h;
        if (gbVar == null) {
            gbVar = new gb();
            this.f1147h = gbVar;
        }
        gbVar.f1540a = colorStateList;
        gbVar.f1543d = colorStateList != null;
        p();
    }

    final void j(PorterDuff.Mode mode) {
        gb gbVar = this.f1147h;
        if (gbVar == null) {
            gbVar = new gb();
            this.f1147h = gbVar;
        }
        gbVar.f1541b = mode;
        gbVar.f1542c = mode != null;
        p();
    }
}
