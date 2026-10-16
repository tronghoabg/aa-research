package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ccw {
    public java.lang.Object a;
    public final java.lang.Object b;
    public java.lang.Object c;
    private final java.lang.Object d;
    private java.lang.Object e;

    public ccw() {
        this.d = new java.lang.Object();
        this.b = new defpackage.ccu();
        this.e = new defpackage.aan(16);
        this.c = new defpackage.aan(16);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dzn, java.lang.Object] */
    private final void f(android.graphics.Typeface typeface) {
        this.e = typeface;
        this.d.a(typeface);
    }

    public final defpackage.buv a(defpackage.ccv ccvVar, defpackage.afer aferVar) {
        int i;
        int i2;
        int i3;
        defpackage.afgt afgtVar = new defpackage.afgt();
        afgtVar.a = -1;
        synchronized (this.d) {
            java.lang.Object obj = this.a;
            if (obj != null) {
                ccvVar.b((java.lang.Throwable) obj);
                return defpackage.buu.a;
            }
            java.lang.Object obj2 = this.b;
            do {
                i = ((defpackage.ccu) obj2).get();
                i2 = i + 1;
            } while (!((defpackage.ccu) obj2).compareAndSet(i, i2));
            int i4 = 134217727 & i2;
            afgtVar.a = (i2 >>> 27) & 15;
            ((defpackage.aan) this.e).p(ccvVar);
            if (i4 == 1 && aferVar != null) {
                try {
                    aferVar.invoke();
                } catch (java.lang.Throwable th) {
                    synchronized (this.d) {
                        if (this.a == null) {
                            this.a = th;
                            java.lang.Object obj3 = this.e;
                            java.lang.Object[] objArr = ((defpackage.aan) obj3).a;
                            int i5 = ((defpackage.aan) obj3).b;
                            for (int i6 = 0; i6 < i5; i6++) {
                                ((defpackage.ccv) objArr[i6]).b(th);
                            }
                            ((defpackage.aan) this.e).k();
                            java.lang.Object obj4 = this.b;
                            do {
                                i3 = ((defpackage.ccu) obj4).get();
                            } while (!((defpackage.ccu) obj4).compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                        }
                    }
                }
            }
            return new defpackage.bxb(new defpackage.axl(ccvVar, this, afgtVar, 4));
        }
    }

    public final void b(defpackage.affc affcVar) {
        int i;
        synchronized (this.d) {
            java.lang.Object obj = this.e;
            this.e = this.c;
            this.c = obj;
            java.lang.Object obj2 = this.b;
            do {
                i = ((defpackage.ccu) obj2).get();
            } while (!((defpackage.ccu) obj2).compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
            int i2 = ((defpackage.aan) obj).b;
            for (int i3 = 0; i3 < i2; i3++) {
                affcVar.invoke(((defpackage.aan) obj).c(i3));
            }
            ((defpackage.aan) obj).k();
        }
    }

    public final boolean c() {
        return (((defpackage.ccu) this.b).get() & 134217727) > 0;
    }

    public final void d(android.graphics.Typeface typeface) {
        this.c = typeface;
        f(typeface);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    public final boolean e(java.lang.String str) {
        int iM;
        java.lang.String strM;
        android.graphics.fonts.FontVariationAxis[] fontVariationAxisArrM;
        int length;
        java.lang.Object obj = this.b;
        java.lang.Object typeface = this.c;
        android.widget.TextView textView = (android.widget.TextView) obj;
        android.text.TextPaint paint = textView.getPaint();
        if (this.e != paint.getTypeface()) {
            android.util.Log.w("FontVarSettings", "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint().");
            typeface = paint.getTypeface();
        }
        if (android.os.Build.VERSION.SDK_INT < 31 || (iM = a$.ExternalSyntheticApiModelOutline0.m(textView.getContext().getResources().getConfiguration())) == Integer.MAX_VALUE) {
            iM = 0;
        }
        defpackage.aab aabVar = jw.a;
        android.graphics.Typeface typeface2 = (android.graphics.Typeface) typeface;
        jv jvVar = new jv(typeface2, str, iM);
        defpackage.aab aabVar2 = jw.a;
        android.graphics.Typeface typeface3 = (android.graphics.Typeface) aabVar2.b(jvVar);
        if (typeface3 == null) {
            android.graphics.Paint paint2 = jw.b;
            if (paint2 == null) {
                paint2 = new android.graphics.Paint();
                jw.b = paint2;
            }
            if (iM != 0) {
                if (android.text.TextUtils.isEmpty(str)) {
                    fontVariationAxisArrM = new android.graphics.fonts.FontVariationAxis[0];
                } else {
                    fontVariationAxisArrM = a$.ExternalSyntheticApiModelOutline1.m(str);
                    if (fontVariationAxisArrM == null) {
                        strM = str;
                    }
                }
                int i = 0;
                boolean z = false;
                while (true) {
                    length = fontVariationAxisArrM.length;
                    if (i >= length) {
                        break;
                    }
                    android.graphics.fonts.FontVariationAxis fontVariationAxis = fontVariationAxisArrM[i];
                    if ("wght".equals(a$.ExternalSyntheticApiModelOutline1.m(fontVariationAxis))) {
                        fontVariationAxisArrM[i] = new android.graphics.fonts.FontVariationAxis("wght", jw.a(a$.ExternalSyntheticApiModelOutline1.m(fontVariationAxis) + iM));
                        z = true;
                    }
                    i++;
                }
                if (!z) {
                    android.graphics.fonts.FontVariationAxis[] fontVariationAxisArr = new android.graphics.fonts.FontVariationAxis[length + 1];
                    java.lang.System.arraycopy(fontVariationAxisArrM, 0, fontVariationAxisArr, 0, length);
                    fontVariationAxisArr[length] = new android.graphics.fonts.FontVariationAxis("wght", jw.a(iM + 400));
                    fontVariationAxisArrM = fontVariationAxisArr;
                }
                strM = a$.ExternalSyntheticApiModelOutline1.m(fontVariationAxisArrM);
            } else {
                strM = str;
            }
            if (j$.util.Objects.equals(a$.ExternalSyntheticApiModelOutline1.m(paint2), strM)) {
                a$.ExternalSyntheticApiModelOutline1.m(paint2, (java.lang.String) null);
            }
            paint2.setTypeface(typeface2);
            if (a$.ExternalSyntheticApiModelOutline1.m(paint2, strM)) {
                typeface3 = paint2.getTypeface();
                aabVar2.c(jvVar, typeface3);
            } else {
                typeface3 = null;
            }
        }
        if (typeface3 == null) {
            return false;
        }
        f(typeface3);
        this.a = str;
        return true;
    }

    public ccw(android.widget.TextView textView, defpackage.dzn dznVar) {
        this.b = textView;
        this.d = dznVar;
    }
}
