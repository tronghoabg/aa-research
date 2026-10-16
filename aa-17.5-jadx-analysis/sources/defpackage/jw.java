package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class jw {
    public Typeface b;
    public boolean c;
    private final TextView d;
    private nd e;
    private nd f;
    private nd g;
    private nd h;
    private nd i;
    private nd j;
    private final kb k;
    public int a = 0;
    private int l = -1;
    private String m = null;

    public jw(TextView textView) {
        this.d = textView;
        this.k = new kb(textView);
    }

    public static void b(TextView textView, Typeface typeface, int i) {
        zu zuVar = jv.a;
        String fontVariationSettings = textView.getFontVariationSettings();
        if (!TextUtils.isEmpty(fontVariationSettings)) {
            jv.b(textView, null);
        }
        textView.setTypeface(typeface, i);
        if (TextUtils.isEmpty(fontVariationSettings)) {
            return;
        }
        jv.b(textView, fontVariationSettings);
    }

    static final void f(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        eds.a(editorInfo, textView.getText());
    }

    private static nd g(Context context, jc jcVar, int i) {
        ColorStateList colorStateListA = jcVar.a(context, i);
        if (colorStateListA == null) {
            return null;
        }
        nd ndVar = new nd();
        ndVar.d = true;
        ndVar.a = colorStateListA;
        return ndVar;
    }

    private final void h(Drawable drawable, nd ndVar) {
        if (drawable == null || ndVar == null) {
            return;
        }
        mr.g(drawable, ndVar, this.d.getDrawableState());
    }

    private final void i(boolean z) {
        Typeface typeface = this.b;
        if (typeface != null) {
            int i = this.l;
            TextView textView = this.d;
            if (i == -1) {
                textView.setTypeface(typeface, this.a);
            } else {
                textView.setTypeface(typeface);
            }
        } else if (z) {
            this.d.setTypeface(null);
        }
        String str = this.m;
        if (str != null) {
            jv.b(this.d, str);
        }
    }

    private final boolean j(Context context, lah lahVar) {
        String strV;
        Typeface typeface;
        Typeface typeface2;
        int[] iArr = fs.a;
        this.a = lahVar.n(2, this.a);
        int iN = lahVar.n(11, -1);
        this.l = iN;
        if (iN != -1) {
            this.a &= 2;
        }
        if (lahVar.y(13)) {
            this.m = lahVar.v(13);
        }
        if (!lahVar.y(10) && !lahVar.y(12)) {
            if (!lahVar.y(1)) {
                int i = this.l;
                if (i == -1 || (typeface = this.b) == null) {
                    return false;
                }
                this.b = Typeface.create(typeface, i, (2 & this.a) != 0);
                return true;
            }
            this.c = false;
            int iN2 = lahVar.n(1, 1);
            if (iN2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else {
                if (iN2 != 2) {
                    if (iN2 == 3) {
                        typeface2 = Typeface.MONOSPACE;
                    }
                    return true;
                }
                typeface2 = Typeface.SERIF;
            }
            this.b = typeface2;
            return true;
        }
        Typeface typefaceD = null;
        this.b = null;
        int i2 = true == lahVar.y(12) ? 12 : 10;
        int i3 = this.l;
        int i4 = this.a;
        if (!context.isRestricted()) {
            jt jtVar = new jt(this, i3, i4, new WeakReference(this.d));
            try {
                int i5 = this.a;
                int resourceId = ((TypedArray) lahVar.a).getResourceId(i2, 0);
                if (resourceId != 0) {
                    if (lahVar.b == null) {
                        lahVar.b = new TypedValue();
                    }
                    Object obj = lahVar.c;
                    Object obj2 = lahVar.b;
                    int i6 = dvb.a;
                    if (!((Context) obj).isRestricted()) {
                        typefaceD = dvb.d((Context) obj, resourceId, (TypedValue) obj2, i5, jtVar, true, false);
                    }
                }
                if (typefaceD != null) {
                    if (this.l != -1) {
                        this.b = Typeface.create(Typeface.create(typefaceD, 0), this.l, (this.a & 2) != 0);
                    } else {
                        this.b = typefaceD;
                    }
                }
                this.c = this.b == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.b == null && (strV = lahVar.v(i2)) != null) {
            if (this.l != -1) {
                this.b = Typeface.create(Typeface.create(strV, 0), this.l, (2 & this.a) != 0);
            } else {
                this.b = Typeface.create(strV, this.a);
            }
        }
        return true;
    }

    final void a() {
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            h(compoundDrawables[0], this.e);
            h(compoundDrawables[1], this.f);
            h(compoundDrawables[2], this.g);
            h(compoundDrawables[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        h(compoundDrawablesRelative[0], this.i);
        h(compoundDrawablesRelative[2], this.j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.util.AttributeSet r25, int r26) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw.c(android.util.AttributeSet, int):void");
    }

    final void d(Context context, int i) {
        lah lahVar = new lah(context, context.obtainStyledAttributes(i, fs.x));
        if (lahVar.y(14)) {
            e(lahVar.x(14, false));
        }
        if (lahVar.y(0) && lahVar.m(0, -1) == 0) {
            this.d.setTextSize(0, BitmapDescriptorFactory.HUE_RED);
        }
        boolean zJ = j(context, lahVar);
        lahVar.w();
        i(zJ);
    }

    final void e(boolean z) {
        this.d.setAllCaps(z);
    }
}
