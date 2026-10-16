package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class wte {
    public final ColorStateList a;
    public final String b;
    public String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public final ColorStateList k;
    public float l;
    public Typeface m;
    private final int n;
    private boolean o = false;
    private boolean p = false;

    public wte(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, fs.x);
        this.l = typedArrayObtainStyledAttributes.getDimension(0, BitmapDescriptorFactory.HUE_RED);
        this.k = wub.h(context, typedArrayObtainStyledAttributes, 3);
        wub.h(context, typedArrayObtainStyledAttributes, 4);
        wub.h(context, typedArrayObtainStyledAttributes, 5);
        this.d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int iG = wub.g(typedArrayObtainStyledAttributes, 12, 10);
        this.n = typedArrayObtainStyledAttributes.getResourceId(iG, 0);
        this.b = typedArrayObtainStyledAttributes.getString(iG);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.a = wub.h(context, typedArrayObtainStyledAttributes, 6);
        this.f = typedArrayObtainStyledAttributes.getFloat(7, BitmapDescriptorFactory.HUE_RED);
        this.g = typedArrayObtainStyledAttributes.getFloat(8, BitmapDescriptorFactory.HUE_RED);
        this.h = typedArrayObtainStyledAttributes.getFloat(9, BitmapDescriptorFactory.HUE_RED);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, wtb.a);
        this.i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.j = typedArrayObtainStyledAttributes2.getFloat(0, BitmapDescriptorFactory.HUE_RED);
        this.c = typedArrayObtainStyledAttributes2.getString(wub.g(typedArrayObtainStyledAttributes2, 3, 1));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private final void g() {
        Typeface typeface;
        String str;
        Typeface typefaceCreate = this.m;
        if (typefaceCreate == null && (str = this.b) != null) {
            typefaceCreate = Typeface.create(str, this.d);
            this.m = typefaceCreate;
        }
        if (typefaceCreate == null) {
            int i = this.e;
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i == 2) {
                typeface = Typeface.SERIF;
            } else {
                if (i != 3) {
                    typeface = Typeface.DEFAULT;
                    this.m = typeface;
                    this.m = Typeface.create(typeface, this.d);
                }
                typeface = Typeface.MONOSPACE;
            }
            this.m = typeface;
            this.m = Typeface.create(typeface, this.d);
        }
    }

    private final boolean h(Context context) {
        Context context2;
        Typeface typefaceD;
        String string;
        Typeface typefaceCreate;
        if (this.o) {
            return true;
        }
        int i = this.n;
        if (i == 0) {
            return false;
        }
        int i2 = dvb.a;
        Typeface typefaceCreate2 = null;
        if (context.isRestricted()) {
            context2 = context;
            typefaceD = null;
        } else {
            context2 = context;
            typefaceD = dvb.d(context2, i, new TypedValue(), 0, null, false, true);
        }
        if (typefaceD == null) {
            if (!this.p) {
                this.p = true;
                Resources resources = context2.getResources();
                if (i == 0 || !resources.getResourceTypeName(i).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.d);
                    }
                } else {
                    try {
                        XmlResourceParser xml = resources.getXml(i);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), dsl.b);
                                string = typedArrayObtainAttributes.getString(7);
                                typedArrayObtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.d);
                    }
                }
            }
            if (typefaceCreate2 == null) {
                return false;
            }
            typefaceD = typefaceCreate2;
        }
        this.m = typefaceD;
        this.o = true;
        return true;
    }

    public final Typeface a() {
        g();
        return this.m;
    }

    public final void b(Context context, wtf wtfVar) {
        if (!h(context)) {
            g();
        }
        int i = this.n;
        if (i == 0) {
            this.o = true;
            i = 0;
        }
        if (this.o) {
            wtfVar.b(this.m, true);
            return;
        }
        try {
            dvb.c(context, i, new wtc(this, wtfVar));
        } catch (Resources.NotFoundException unused) {
            this.o = true;
            wtfVar.a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font ".concat(String.valueOf(this.b)), e);
            this.o = true;
            wtfVar.a(-3);
        }
    }

    public final void c(Context context, TextPaint textPaint, wtf wtfVar) {
        d(context, textPaint, wtfVar);
        ColorStateList colorStateList = this.k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.h;
        float f2 = this.f;
        float f3 = this.g;
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void d(Context context, TextPaint textPaint, wtf wtfVar) {
        Typeface typeface;
        if (h(context) && this.o && (typeface = this.m) != null) {
            e(context, textPaint, typeface);
        } else {
            e(context, textPaint, a());
            b(context, new wtd(this, context, textPaint, wtfVar));
        }
    }

    public final void e(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceD = wpq.d(context.getResources().getConfiguration(), typeface);
        if (typefaceD != null) {
            typeface = typefaceD;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText(1 == (i & 1));
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : BitmapDescriptorFactory.HUE_RED);
        textPaint.setTextSize(this.l);
        textPaint.setFontVariationSettings(null);
        textPaint.setFontVariationSettings(this.c);
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
