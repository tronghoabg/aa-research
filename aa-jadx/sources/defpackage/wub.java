package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wub {
    public final android.content.res.ColorStateList a;
    public final java.lang.String b;
    public java.lang.String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public final android.content.res.ColorStateList k;
    public float l;
    public android.graphics.Typeface m;
    private final int n;
    private boolean o = false;
    private boolean p = false;

    public wub(android.content.Context context, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, defpackage.ft.x);
        this.l = typedArrayObtainStyledAttributes.getDimension(0, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        this.k = defpackage.sqs.bi(context, typedArrayObtainStyledAttributes, 3);
        defpackage.sqs.bi(context, typedArrayObtainStyledAttributes, 4);
        defpackage.sqs.bi(context, typedArrayObtainStyledAttributes, 5);
        this.d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int iBh = defpackage.sqs.bh(typedArrayObtainStyledAttributes, 12, 10);
        this.n = typedArrayObtainStyledAttributes.getResourceId(iBh, 0);
        this.b = typedArrayObtainStyledAttributes.getString(iBh);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.a = defpackage.sqs.bi(context, typedArrayObtainStyledAttributes, 6);
        this.f = typedArrayObtainStyledAttributes.getFloat(7, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        this.g = typedArrayObtainStyledAttributes.getFloat(8, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        this.h = typedArrayObtainStyledAttributes.getFloat(9, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        typedArrayObtainStyledAttributes.recycle();
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, defpackage.wty.a);
        this.i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.j = typedArrayObtainStyledAttributes2.getFloat(0, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        this.c = typedArrayObtainStyledAttributes2.getString(defpackage.sqs.bh(typedArrayObtainStyledAttributes2, 3, 1));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private final void g() {
        android.graphics.Typeface typeface;
        java.lang.String str;
        android.graphics.Typeface typefaceCreate = this.m;
        if (typefaceCreate == null && (str = this.b) != null) {
            typefaceCreate = android.graphics.Typeface.create(str, this.d);
            this.m = typefaceCreate;
        }
        if (typefaceCreate == null) {
            int i = this.e;
            if (i == 1) {
                typeface = android.graphics.Typeface.SANS_SERIF;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        typeface = android.graphics.Typeface.DEFAULT;
                        this.m = typeface;
                    } else {
                        typeface = android.graphics.Typeface.MONOSPACE;
                    }
                    this.m = android.graphics.Typeface.create(typeface, this.d);
                }
                typeface = android.graphics.Typeface.SERIF;
            }
            this.m = typeface;
            this.m = android.graphics.Typeface.create(typeface, this.d);
        }
    }

    private final boolean h(android.content.Context context) {
        android.content.Context context2;
        android.graphics.Typeface typefaceD;
        java.lang.String string;
        android.graphics.Typeface typefaceCreate;
        if (this.o) {
            return true;
        }
        int i = this.n;
        if (i == 0) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = defpackage.dvi.a;
        android.graphics.Typeface typefaceCreate2 = null;
        if (context.isRestricted()) {
            context2 = context;
            typefaceD = null;
        } else {
            context2 = context;
            typefaceD = defpackage.dvi.d(context2, i, new android.util.TypedValue(), 0, null, false, true);
        }
        if (typefaceD == null) {
            if (!this.p) {
                this.p = true;
                android.content.res.Resources resources = context2.getResources();
                if (i == 0 || !resources.getResourceTypeName(i).equals("font")) {
                    string = null;
                    break;
                }
                try {
                    android.content.res.XmlResourceParser xml = resources.getXml(i);
                    while (true) {
                        if (xml.getEventType() == 1) {
                            string = null;
                            break;
                        }
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            android.content.res.TypedArray typedArrayObtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xml), defpackage.dss.b);
                            string = typedArrayObtainAttributes.getString(7);
                            typedArrayObtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                        string = null;
                        break;
                    }
                } catch (java.lang.Throwable unused) {
                }
                if (string != null && (typefaceCreate = android.graphics.Typeface.create(string, 0)) != android.graphics.Typeface.DEFAULT) {
                    typefaceCreate2 = android.graphics.Typeface.create(typefaceCreate, this.d);
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

    public final android.graphics.Typeface a() {
        g();
        return this.m;
    }

    public final void b(android.content.Context context, defpackage.wuc wucVar) {
        if (!h(context)) {
            g();
        }
        int i = this.n;
        if (i == 0) {
            this.o = true;
            i = 0;
        }
        if (this.o) {
            wucVar.b(this.m, true);
            return;
        }
        try {
            defpackage.dvi.c(context, i, new defpackage.wtz(this, wucVar));
        } catch (android.content.res.Resources.NotFoundException unused) {
            this.o = true;
            wucVar.a(1);
        } catch (java.lang.Exception e) {
            android.util.Log.d("TextAppearance", "Error loading font ".concat(java.lang.String.valueOf(this.b)), e);
            this.o = true;
            wucVar.a(-3);
        }
    }

    public final void c(android.content.Context context, android.text.TextPaint textPaint, defpackage.wuc wucVar) {
        d(context, textPaint, wucVar);
        android.content.res.ColorStateList colorStateList = this.k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.h;
        float f2 = this.f;
        float f3 = this.g;
        android.content.res.ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void d(android.content.Context context, android.text.TextPaint textPaint, defpackage.wuc wucVar) {
        android.graphics.Typeface typeface;
        if (h(context) && this.o && (typeface = this.m) != null) {
            e(context, textPaint, typeface);
        } else {
            e(context, textPaint, a());
            b(context, new defpackage.wua(this, context, textPaint, wucVar));
        }
    }

    public final void e(android.content.Context context, android.text.TextPaint textPaint, android.graphics.Typeface typeface) {
        android.graphics.Typeface typefaceI = defpackage.wpu.i(context.getResources().getConfiguration(), typeface);
        if (typefaceI != null) {
            typeface = typefaceI;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText(1 == (i & 1));
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        textPaint.setTextSize(this.l);
        textPaint.setFontVariationSettings(null);
        textPaint.setFontVariationSettings(this.c);
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
