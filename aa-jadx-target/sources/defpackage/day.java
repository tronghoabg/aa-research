package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class day {
    public static final void a(android.view.View view, float[] fArr, android.graphics.Matrix matrix, int[] iArr) {
        matrix.reset();
        alh$.ExternalSyntheticApiModelOutline0.m(view, matrix);
        android.view.ViewParent parent = view.getParent();
        while (parent instanceof android.view.View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        defpackage.bzo.r(fArr, matrix);
    }

    public static final void b(android.view.View view) {
        alh$.ExternalSyntheticApiModelOutline0.m(view, false);
    }

    public static final boolean c(android.view.MotionEvent motionEvent, int i) {
        return (java.lang.Float.floatToRawIntBits(alh$.ExternalSyntheticApiModelOutline0.m(motionEvent, i)) & Integer.MAX_VALUE) < 2139095040 && (java.lang.Float.floatToRawIntBits(alh$.ExternalSyntheticApiModelOutline0.m$1(motionEvent, i)) & Integer.MAX_VALUE) < 2139095040;
    }

    public static final android.view.View d(android.view.View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = java.lang.Math.min(v(view, 2131429869), v(view, 2131429872));
        android.view.View view2 = view;
        int i = 0;
        android.view.View view3 = view2;
        while (view != null) {
            if (i == iMin) {
                if (!(view.getParent() instanceof android.view.ViewGroup)) {
                    return view2;
                }
            } else if (e(view) == null) {
                i++;
                java.lang.Object objB = defpackage.edd.b(view);
                android.view.View view4 = view2;
                view2 = view;
                view = objB instanceof android.view.View ? (android.view.View) objB : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final defpackage.dbi e(android.view.View view) {
        java.lang.Object tag = view.getTag(2131427501);
        java.lang.ref.WeakReference weakReference = tag instanceof java.lang.ref.WeakReference ? (java.lang.ref.WeakReference) tag : null;
        if (weakReference != null) {
            return (defpackage.dbi) weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0257 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0259 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x025c  */
    /* JADX WARN: Code duplicated, block: B:111:0x025f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0262  */
    /* JADX WARN: Code duplicated, block: B:115:0x02af  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    public static final defpackage.ddb f(android.content.res.Resources.Theme theme, android.content.res.Resources resources, android.content.res.XmlResourceParser xmlResourceParser, int i) throws org.xmlpull.v1.XmlPullParserException {
        long jK;
        int i2;
        java.util.List list;
        java.util.List list2;
        int i3;
        int i4;
        int iB;
        int i5;
        int iB2;
        int i6;
        int i7;
        android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xmlResourceParser);
        defpackage.cpp cppVar = new defpackage.cpp(xmlResourceParser);
        int[] iArr = defpackage.cpq.a;
        android.content.res.TypedArray typedArrayC = cppVar.c(resources, theme, attributeSetAsAttributeSet, defpackage.cpq.a);
        org.xmlpull.v1.XmlPullParser xmlPullParser = cppVar.a;
        boolean z = !defpackage.dmh.u(xmlPullParser, "autoMirrored") ? false : typedArrayC.getBoolean(5, false);
        cppVar.e(typedArrayC.getChangingConfigurations());
        float fA = cppVar.a(typedArrayC, "viewportWidth", 7, 0.0f);
        float fA2 = cppVar.a(typedArrayC, "viewportHeight", 8, 0.0f);
        if (fA <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.valueOf(typedArrayC.getPositionDescription()).concat("<VectorGraphic> tag requires viewportWidth > 0"));
        }
        if (fA2 <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.valueOf(typedArrayC.getPositionDescription()).concat("<VectorGraphic> tag requires viewportHeight > 0"));
        }
        float f = cppVar.f(typedArrayC, 3);
        float f2 = cppVar.f(typedArrayC, 2);
        if (typedArrayC.hasValue(1)) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            typedArrayC.getValue(1, typedValue);
            if (typedValue.type == 2) {
                float[] fArr = defpackage.clr.a;
                jK = defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u);
            } else {
                android.content.res.ColorStateList colorStateListY = defpackage.dmh.y(typedArrayC, xmlPullParser, theme);
                cppVar.e(typedArrayC.getChangingConfigurations());
                if (colorStateListY != null) {
                    jK = ((long) colorStateListY.getDefaultColor()) << 32;
                } else {
                    float[] fArr2 = defpackage.clr.a;
                    jK = defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u);
                }
            }
        } else {
            float[] fArr3 = defpackage.clr.a;
            jK = defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u);
        }
        int i8 = typedArrayC.getInt(6, -1);
        cppVar.e(typedArrayC.getChangingConfigurations());
        if (i8 == -1) {
            i2 = 5;
        } else if (i8 == 3) {
            i2 = 3;
        } else if (i8 == 5) {
            i2 = 5;
        } else if (i8 != 9) {
            switch (i8) {
                case 14:
                    i2 = 13;
                    break;
                case 15:
                    i2 = 14;
                    break;
                case 16:
                    i2 = 12;
                    break;
                default:
                    i2 = 5;
                    break;
            }
        } else {
            i2 = 9;
        }
        float f3 = (f / resources.getDisplayMetrics().density) + 0.0f;
        float f4 = (f2 / resources.getDisplayMetrics().density) + 0.0f;
        typedArrayC.recycle();
        long j = jK;
        int i9 = 6;
        float f5 = 0.0f;
        char c = '\f';
        defpackage.cnn cnnVar = new defpackage.cnn(null, f3, f4, fA, fA2, j, i2, z, 1);
        int i10 = 0;
        while (!defpackage.a.b(xmlResourceParser)) {
            int eventType = xmlPullParser.getEventType();
            if (eventType != 2) {
                if (eventType != 3) {
                    c = c;
                    f5 = f5;
                } else if (defpackage.afga.f("group", xmlPullParser.getName())) {
                    int i11 = i10 + 1;
                    for (int i12 = 0; i12 < i11; i12++) {
                        cnnVar.d();
                    }
                    int[] iArr2 = cppVar.c;
                    if (iArr2 == null || (i7 = cppVar.d) == 0) {
                        i10 = 0;
                    } else {
                        int i13 = i7 - 1;
                        cppVar.d = i13;
                        i10 = iArr2[i13];
                    }
                }
                xmlResourceParser.next();
                f5 = f5;
                c = c;
                i9 = 6;
            } else {
                java.lang.String name = xmlPullParser.getName();
                if (name != null) {
                    int iHashCode = name.hashCode();
                    if (iHashCode != -1649314686) {
                        if (iHashCode != 3433509) {
                            if (iHashCode == 98629247 && name.equals("group")) {
                                android.content.res.TypedArray typedArrayC2 = cppVar.c(resources, theme, attributeSetAsAttributeSet, defpackage.cpq.b);
                                float fA3 = cppVar.a(typedArrayC2, "rotation", 5, f5);
                                float fG = cppVar.g(typedArrayC2, 1);
                                float fG2 = cppVar.g(typedArrayC2, 2);
                                float fA4 = cppVar.a(typedArrayC2, "scaleX", 3, 1.0f);
                                float fA5 = cppVar.a(typedArrayC2, "scaleY", 4, 1.0f);
                                float fA6 = cppVar.a(typedArrayC2, "translateX", i9, f5);
                                float fA7 = cppVar.a(typedArrayC2, "translateY", 7, f5);
                                java.lang.String strD = cppVar.d(typedArrayC2, 0);
                                java.lang.String str = strD == null ? "" : strD;
                                typedArrayC2.recycle();
                                cnnVar.b(str, fA3, fG, fG2, fA4, fA5, fA6, fA7, defpackage.cov.a);
                                int[] iArrCopyOf = cppVar.c;
                                if (iArrCopyOf == null) {
                                    iArrCopyOf = new int[4];
                                    cppVar.c = iArrCopyOf;
                                } else {
                                    int i14 = cppVar.d;
                                    int length = iArrCopyOf.length;
                                    if (i14 >= length) {
                                        iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, length + length);
                                        iArrCopyOf.getClass();
                                        cppVar.c = iArrCopyOf;
                                    }
                                }
                                int i15 = cppVar.d;
                                cppVar.d = i15 + 1;
                                iArrCopyOf[i15] = i10;
                                i10 = 0;
                            }
                        } else if (name.equals("path")) {
                            android.content.res.TypedArray typedArrayC3 = cppVar.c(resources, theme, attributeSetAsAttributeSet, defpackage.cpq.c);
                            if (!defpackage.dmh.u(xmlPullParser, "pathData")) {
                                throw new java.lang.IllegalArgumentException("No path data available");
                            }
                            java.lang.String strD2 = cppVar.d(typedArrayC3, 0);
                            java.lang.String str2 = strD2 == null ? "" : strD2;
                            java.lang.String strD3 = cppVar.d(typedArrayC3, 2);
                            if (strD3 == null) {
                                list2 = defpackage.cov.a;
                            } else {
                                defpackage.cok cokVar = cppVar.e;
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                cokVar.b(strD3, arrayList);
                                list2 = arrayList;
                            }
                            defpackage.dvd dvdVarH = cppVar.h(typedArrayC3, theme, "fillColor", 1);
                            float fA8 = cppVar.a(typedArrayC3, "fillAlpha", 12, 1.0f);
                            int iB3 = cppVar.b(typedArrayC3, "strokeLineCap", 8, -1);
                            if (iB3 != 0) {
                                if (iB3 != 1) {
                                    i3 = 2;
                                    if (iB3 == 2) {
                                        i4 = 2;
                                    }
                                } else {
                                    i3 = 2;
                                    i4 = 1;
                                }
                                iB = cppVar.b(typedArrayC3, "strokeLineJoin", 9, -1);
                                if (iB == 0) {
                                    i5 = 0;
                                } else if (iB != 1) {
                                    i5 = 1;
                                } else if (iB != i3) {
                                    i5 = 0;
                                } else {
                                    i5 = i3;
                                }
                                float fA9 = cppVar.a(typedArrayC3, "strokeMiterLimit", 10, 4.0f);
                                defpackage.dvd dvdVarH2 = cppVar.h(typedArrayC3, theme, "strokeColor", 3);
                                float fA10 = cppVar.a(typedArrayC3, "strokeAlpha", 11, 1.0f);
                                float fA11 = cppVar.a(typedArrayC3, "strokeWidth", 4, 1.0f);
                                float fA12 = cppVar.a(typedArrayC3, "trimPathEnd", 6, 1.0f);
                                f5 = 0.0f;
                                float fA13 = cppVar.a(typedArrayC3, "trimPathOffset", 7, 0.0f);
                                float fA14 = cppVar.a(typedArrayC3, "trimPathStart", 5, 0.0f);
                                iB2 = cppVar.b(typedArrayC3, "fillType", 13, 0);
                                typedArrayC3.recycle();
                                defpackage.cka ckaVarK = defpackage.dai.K(dvdVarH);
                                defpackage.cka ckaVarK2 = defpackage.dai.K(dvdVarH2);
                                if (iB2 == 0) {
                                    i6 = 0;
                                } else {
                                    i6 = 1;
                                }
                                cnnVar.c(list2, i6, str2, ckaVarK, fA8, ckaVarK2, fA10, fA11, i4, i5, fA9, fA14, fA12, fA13);
                            } else {
                                i3 = 2;
                            }
                            i4 = 0;
                            iB = cppVar.b(typedArrayC3, "strokeLineJoin", 9, -1);
                            if (iB == 0) {
                                i5 = 0;
                            } else if (iB != 1) {
                                i5 = 1;
                            } else if (iB != i3) {
                                i5 = 0;
                            } else {
                                i5 = i3;
                            }
                            float fA15 = cppVar.a(typedArrayC3, "strokeMiterLimit", 10, 4.0f);
                            defpackage.dvd dvdVarH3 = cppVar.h(typedArrayC3, theme, "strokeColor", 3);
                            float fA16 = cppVar.a(typedArrayC3, "strokeAlpha", 11, 1.0f);
                            float fA17 = cppVar.a(typedArrayC3, "strokeWidth", 4, 1.0f);
                            float fA18 = cppVar.a(typedArrayC3, "trimPathEnd", 6, 1.0f);
                            f5 = 0.0f;
                            float fA19 = cppVar.a(typedArrayC3, "trimPathOffset", 7, 0.0f);
                            float fA110 = cppVar.a(typedArrayC3, "trimPathStart", 5, 0.0f);
                            iB2 = cppVar.b(typedArrayC3, "fillType", 13, 0);
                            typedArrayC3.recycle();
                            defpackage.cka ckaVarK3 = defpackage.dai.K(dvdVarH);
                            defpackage.cka ckaVarK4 = defpackage.dai.K(dvdVarH3);
                            if (iB2 == 0) {
                                i6 = 0;
                            } else {
                                i6 = 1;
                            }
                            cnnVar.c(list2, i6, str2, ckaVarK3, fA8, ckaVarK4, fA16, fA17, i4, i5, fA15, fA110, fA18, fA19);
                        } else {
                            f5 = f5;
                        }
                        c = '\f';
                    } else {
                        c = c;
                        f5 = f5;
                        if (name.equals("clip-path")) {
                            i10++;
                            android.content.res.TypedArray typedArrayC4 = cppVar.c(resources, theme, attributeSetAsAttributeSet, defpackage.cpq.d);
                            java.lang.String strD4 = cppVar.d(typedArrayC4, 0);
                            java.lang.String str3 = strD4 == null ? "" : strD4;
                            java.lang.String strD5 = cppVar.d(typedArrayC4, 1);
                            if (strD5 == null) {
                                list = defpackage.cov.a;
                            } else {
                                defpackage.cok cokVar2 = cppVar.e;
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                cokVar2.b(strD5, arrayList2);
                                list = arrayList2;
                            }
                            typedArrayC4.recycle();
                            cnnVar.b(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list);
                        }
                    }
                }
                xmlResourceParser.next();
                f5 = f5;
                c = c;
                i9 = 6;
            }
            xmlResourceParser.next();
            f5 = f5;
            c = c;
            i9 = 6;
        }
        return new defpackage.ddb(cnnVar.a(), i | cppVar.b);
    }

    public static final defpackage.cno g(android.content.res.Resources.Theme theme, android.content.res.Resources resources, int i) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        resources.getValue(i, typedValue, true);
        android.content.res.XmlResourceParser xml = resources.getXml(i);
        defpackage.a.am(xml);
        return f(theme, resources, xml, typedValue.changingConfigurations).a;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    public static final defpackage.cne h(int i, defpackage.bve bveVar, int i2) {
        android.util.TypedValue typedValue;
        boolean z;
        android.content.Context context = (android.content.Context) bveVar.f(defpackage.daj.b);
        android.content.res.Resources resources = (android.content.res.Resources) bveVar.f(defpackage.daj.c);
        defpackage.ldx ldxVar = (defpackage.ldx) bveVar.f(defpackage.daj.e);
        synchronized (ldxVar) {
            java.lang.Object obj = ldxVar.a;
            typedValue = (android.util.TypedValue) ((defpackage.zo) obj).a(i);
            z = true;
            if (typedValue == null) {
                typedValue = new android.util.TypedValue();
                resources.getValue(i, typedValue, true);
                ((defpackage.zo) obj).h(i, typedValue);
            }
        }
        java.lang.CharSequence charSequence = typedValue.string;
        if (charSequence != null && afzh.C(charSequence, ".xml")) {
            bveVar.v(-1771798434);
            android.content.res.Resources.Theme theme = context.getTheme();
            int i3 = typedValue.changingConfigurations;
            defpackage.kwv kwvVar = (defpackage.kwv) bveVar.f(defpackage.daj.d);
            defpackage.ddc ddcVar = new defpackage.ddc(theme, i);
            ?? r2 = kwvVar.a;
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) r2).get(ddcVar);
            defpackage.ddb ddbVarF = weakReference != null ? (defpackage.ddb) weakReference.get() : null;
            if (ddbVarF == null) {
                android.content.res.XmlResourceParser xml = resources.getXml(i);
                defpackage.a.am(xml);
                if (!defpackage.afga.f(xml.getName(), "vector")) {
                    throw new java.lang.IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                }
                ddbVarF = f(theme, resources, xml, i3);
                r2.put(ddcVar, new java.lang.ref.WeakReference(ddbVarF));
            }
            defpackage.cow cowVarP = defpackage.dai.P(ddbVarF.a, bveVar);
            bveVar.o();
            return cowVarP;
        }
        bveVar.v(-1771643000);
        java.lang.Object theme2 = context.getTheme();
        boolean zC = bveVar.C(charSequence);
        if ((((i2 & 14) ^ 6) <= 4 || !bveVar.A(i)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean zC2 = zC | z | bveVar.C(theme2);
        java.lang.Object objG = bveVar.g();
        if (zC2 || objG == defpackage.bvd.a) {
            try {
                objG = defpackage.vm.h(resources, i);
                bveVar.x(objG);
            } catch (java.lang.Exception e) {
                java.util.Objects.toString(charSequence);
                throw new ddd("Error attempting to load resource: ".concat(java.lang.String.valueOf(charSequence)), e);
            }
        }
        defpackage.cnc cncVar = new defpackage.cnc((defpackage.cjr) objG);
        bveVar.o();
        return cncVar;
    }

    public static final float i(android.text.Layout layout, int i, android.graphics.Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        java.lang.ThreadLocal threadLocal = defpackage.dgq.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i)) - lineLeft) + paint.measureText("…");
        android.text.Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment != null && defpackage.dhb.a[paragraphAlignment.ordinal()] == 1) {
            fAbs = java.lang.Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            fAbs = java.lang.Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return fAbs + width;
    }

    public static final float j(android.text.Layout layout, int i, android.graphics.Paint paint) {
        float width;
        float width2;
        java.lang.ThreadLocal threadLocal = defpackage.dgq.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i))) + paint.measureText("…");
        android.text.Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment != null && defpackage.dhb.a[paragraphAlignment.ordinal()] == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - lineRight) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - lineRight;
        }
        return width - width2;
    }

    public static final android.text.StaticLayout k(defpackage.dgm dgmVar) {
        android.text.StaticLayout.Builder builderObtain = android.text.StaticLayout.Builder.obtain(dgmVar.a, 0, dgmVar.b, dgmVar.c, dgmVar.d);
        builderObtain.setTextDirection(dgmVar.e);
        builderObtain.setAlignment(dgmVar.f);
        builderObtain.setMaxLines(dgmVar.g);
        builderObtain.setEllipsize(dgmVar.h);
        builderObtain.setEllipsizedWidth(dgmVar.i);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(false);
        builderObtain.setBreakStrategy(dgmVar.k);
        builderObtain.setHyphenationFrequency(0);
        builderObtain.setIndents(null, null);
        ep$.ExternalSyntheticApiModelOutline1.m(builderObtain, dgmVar.j);
        hh$.ExternalSyntheticApiModelOutline0.m(builderObtain, true);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            ag$.ExternalSyntheticApiModelOutline0.m(builderObtain, ag$.ExternalSyntheticApiModelOutline0.m(ag$.ExternalSyntheticApiModelOutline0.m$1(ag$.ExternalSyntheticApiModelOutline0.m(new android.graphics.text.LineBreakConfig.Builder(), dgmVar.l), 0)));
        }
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            hz$.ExternalSyntheticApiModelOutline2.m(builderObtain, false);
        }
        return builderObtain.build();
    }

    public static final boolean l(android.text.Spanned spanned, java.lang.Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x021c A[EDGE_INSN: B:108:0x021c->B:153:0x02cd BREAK  A[LOOP:3: B:91:0x01d2->B:105:0x0209], PHI: r16 r22
  0x021c: PHI (r16v4 int) = (r16v2 int), (r16v2 int), (r16v2 int), (r16v2 int), (r16v2 int), (r16v7 int), (r16v7 int), (r16v9 int) binds: [B:107:0x021a, B:132:0x026a, B:135:0x0273, B:174:0x021c, B:175:0x021c, B:168:0x021c, B:169:0x021c, B:60:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x021c: PHI (r22v3 dgj[]) = (r22v1 dgj[]), (r22v1 dgj[]), (r22v1 dgj[]), (r22v1 dgj[]), (r22v1 dgj[]), (r22v5 dgj[]), (r22v5 dgj[]), (r22v6 dgj[]) binds: [B:107:0x021a, B:132:0x026a, B:135:0x0273, B:174:0x021c, B:175:0x021c, B:168:0x021c, B:169:0x021c, B:60:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final int m(defpackage.dgp dgpVar, android.text.Layout layout, defpackage.oln olnVar, int i, android.graphics.RectF rectF, defpackage.dgv dgvVar, defpackage.affg affgVar, boolean z) {
        int i2;
        defpackage.dgj[] dgjVarArr;
        float f;
        int i3;
        defpackage.dgj[] dgjVarArr2;
        int i4;
        int i5;
        int iB;
        int i6;
        int iE;
        float f2;
        int iE2;
        int i7;
        int iF;
        int i8;
        int iF2;
        float f3;
        java.text.Bidi bidiCreateLineBidi;
        boolean z2;
        boolean z3;
        float fA;
        float fA2;
        float fA3;
        defpackage.dgp dgpVar2 = dgpVar;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i9 = lineEnd - lineStart;
        int i10 = i9 + i9;
        float[] fArr = new float[i10];
        int iL = dgpVar2.l(i);
        int iJ = dgpVar2.j(i);
        int i11 = iJ - iL;
        if (i10 < i11 + i11) {
            defpackage.dki.c("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        defpackage.lfo lfoVar = new defpackage.lfo(dgpVar2);
        int i12 = 0;
        boolean z4 = dgpVar2.m(i) == 1;
        int i13 = 0;
        while (iL < iJ) {
            int i14 = iL + 1;
            boolean zQ = dgpVar2.q(iL);
            if (z4) {
                if (zQ) {
                    z2 = true;
                    z3 = true;
                } else {
                    fA = lfoVar.a(iL, false, false, true);
                    fA3 = lfoVar.a(i14, true, true, true);
                }
                fA2 = fA3;
                fArr[i13] = fA;
                fArr[i13 + 1] = fA2;
                i13 += 2;
                dgpVar2 = dgpVar;
                iL = i14;
            } else {
                z2 = true;
                z3 = zQ;
            }
            if (z4) {
                fA3 = lfoVar.a(iL, false, false, false);
                fA = lfoVar.a(i14, z2, z2, false);
            } else {
                if (z3) {
                    fA3 = lfoVar.a(iL, false, false, z2);
                    fA = lfoVar.a(i14, z2, z2, z2);
                } else {
                    fA = lfoVar.a(iL, false, false, false);
                    fA2 = lfoVar.a(i14, z2, z2, false);
                }
                fArr[i13] = fA;
                fArr[i13 + 1] = fA2;
                i13 += 2;
                dgpVar2 = dgpVar;
                iL = i14;
            }
            fA2 = fA3;
            fArr[i13] = fA;
            fArr[i13 + 1] = fA2;
            i13 += 2;
            dgpVar2 = dgpVar;
            iL = i14;
        }
        android.text.Layout layout2 = (android.text.Layout) olnVar.c;
        int lineStart2 = layout2.getLineStart(i);
        int lineEnd2 = layout2.getLineEnd(i);
        int iF3 = olnVar.f(lineStart2, false);
        int iG = olnVar.g(iF3);
        int i15 = lineStart2 - iG;
        int i16 = lineEnd2 - iG;
        java.text.Bidi bidiI = olnVar.i(iF3);
        if (bidiI == null || (bidiCreateLineBidi = bidiI.createLineBidi(i15, i16)) == null) {
            i2 = 0;
            dgjVarArr = new defpackage.dgj[]{new defpackage.dgj(lineStart2, lineEnd2, layout2.isRtlCharAt(lineStart2))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            dgjVarArr = new defpackage.dgj[runCount];
            int i17 = 0;
            while (i17 < runCount) {
                int i18 = i12;
                java.text.Bidi bidi = bidiCreateLineBidi;
                dgjVarArr[i17] = new defpackage.dgj(bidiCreateLineBidi.getRunStart(i17) + lineStart2, bidiCreateLineBidi.getRunLimit(i17) + lineStart2, bidiCreateLineBidi.getRunLevel(i17) % 2 == 1 ? 1 : i18);
                i17++;
                bidiCreateLineBidi = bidi;
                i12 = i18;
            }
            i2 = i12;
        }
        defpackage.afhy afiaVar = z ? new defpackage.afia(i2, defpackage.afga.bH(dgjVarArr)) : new defpackage.afhy(defpackage.afga.bH(dgjVarArr), i2, -1);
        int i19 = afiaVar.b;
        int i20 = afiaVar.a;
        int i21 = afiaVar.c;
        if ((i21 <= 0 || i20 > i19) && (i21 >= 0 || i19 > i20)) {
            return -1;
        }
        while (true) {
            defpackage.dgj dgjVar = dgjVarArr[i20];
            boolean z5 = dgjVar.c;
            if (z5) {
                int i22 = (dgjVar.b - 1) - lineStart;
                f = fArr[i22 + i22];
            } else {
                int i23 = dgjVar.a - lineStart;
                f = fArr[i23 + i23];
            }
            float fW = z5 ? w(dgjVar.a, lineStart, fArr) : w(dgjVar.b - 1, lineStart, fArr);
            if (!z) {
                i3 = i21;
                dgjVarArr2 = dgjVarArr;
                if (!x(rectF, f, fW)) {
                    iE2 = -1;
                    break;
                }
                if ((z5 || rectF.right < fW) && (!z5 || rectF.left > f)) {
                    int i24 = dgjVar.a;
                    i4 = dgjVar.b;
                    while (true) {
                        i5 = 1;
                        if (i4 - i24 <= 1) {
                            break;
                        }
                        int i25 = (i4 + i24) / 2;
                        int i26 = i25 - lineStart;
                        float f4 = fArr[i26 + i26];
                        if ((z5 || f4 <= rectF.right) && (!z5 || f4 >= rectF.left)) {
                            i24 = i25;
                        } else {
                            i4 = i25;
                        }
                    }
                    if (true != z5) {
                        i4 = i24;
                    }
                } else {
                    i4 = dgjVar.b - 1;
                    i5 = 1;
                }
                int iF4 = dgvVar.f(i4 + i5);
                if (iF4 == -1 || (iB = dgvVar.b(iF4)) <= (i6 = dgjVar.a)) {
                    iE2 = -1;
                    break;
                }
                int iE3 = defpackage.afqt.e(iF4, i6);
                int iF5 = defpackage.afqt.f(iB, dgjVar.b);
                android.graphics.RectF rectF2 = new android.graphics.RectF(0.0f, lineTop, 0.0f, lineBottom);
                while (true) {
                    if (z5) {
                        iE = iE3;
                        int i27 = (iF5 - 1) - lineStart;
                        f2 = fArr[i27 + i27];
                    } else {
                        iE = iE3;
                        int i28 = iE - lineStart;
                        f2 = fArr[i28 + i28];
                    }
                    rectF2.left = f2;
                    rectF2.right = z5 ? w(iE, lineStart, fArr) : w(iF5 - 1, lineStart, fArr);
                    if (((java.lang.Boolean) affgVar.invoke(rectF2, rectF)).booleanValue()) {
                        iE2 = iF5;
                        break;
                    }
                    iF5 = dgvVar.e(iF5);
                    if (iF5 == -1 || iF5 <= i6) {
                        iE2 = -1;
                        break;
                    }
                    iE = defpackage.afqt.e(dgvVar.f(iF5), i6);
                }
            } else {
                if (x(rectF, f, fW)) {
                    if ((z5 || rectF.left > f) && (!z5 || rectF.right < fW)) {
                        int i29 = dgjVar.a;
                        i7 = dgjVar.b;
                        while (true) {
                            i3 = i21;
                            if (i7 - i29 <= 1) {
                                break;
                            }
                            int i30 = (i7 + i29) / 2;
                            int i31 = i30 - lineStart;
                            float f5 = fArr[i31 + i31];
                            if ((z5 || f5 <= rectF.left) && (!z5 || f5 >= rectF.right)) {
                                i29 = i30;
                            } else {
                                i7 = i30;
                            }
                            i21 = i3;
                        }
                        if (true != z5) {
                            i7 = i29;
                        }
                    } else {
                        i7 = dgjVar.a;
                        i3 = i21;
                    }
                    int iB2 = dgvVar.b(i7);
                    if (iB2 != -1 && (iF = dgvVar.f(iB2)) < (i8 = dgjVar.b)) {
                        dgjVarArr2 = dgjVarArr;
                        iE2 = defpackage.afqt.e(iF, dgjVar.a);
                        int iF6 = defpackage.afqt.f(iB2, i8);
                        android.graphics.RectF rectF3 = new android.graphics.RectF(0.0f, lineTop, 0.0f, lineBottom);
                        while (true) {
                            if (z5) {
                                iF2 = iF6;
                                int i32 = (iF2 - 1) - lineStart;
                                f3 = fArr[i32 + i32];
                            } else {
                                iF2 = iF6;
                                int i33 = iE2 - lineStart;
                                f3 = fArr[i33 + i33];
                            }
                            rectF3.left = f3;
                            rectF3.right = z5 ? w(iE2, lineStart, fArr) : w(iF2 - 1, lineStart, fArr);
                            if (((java.lang.Boolean) affgVar.invoke(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iE2 = dgvVar.c(iE2);
                            if (iE2 != -1 && iE2 < i8) {
                                iF2 = defpackage.afqt.f(dgvVar.b(iE2), i8);
                            }
                        }
                    }
                    iE2 = -1;
                    break;
                } else {
                    i3 = i21;
                }
                dgjVarArr2 = dgjVarArr;
                iE2 = -1;
                break;
            }
            if (iE2 >= 0) {
                return iE2;
            }
            if (i20 == i19) {
                return -1;
            }
            i20 += i3;
            dgjVarArr = dgjVarArr2;
            i21 = i3;
        }
    }

    public static final void n(java.lang.String str, char[] cArr, int i, int i2, int i3) {
        str.getClass();
        str.getChars(i2, i3, cArr, i);
    }

    public static final void o(java.lang.String str, char[] cArr, int i) {
        n(str, cArr, i, 0, str.length());
    }

    public static final long p(long j, long j2) {
        int iB;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        int i3 = (int) (j2 >> 32);
        int i4 = (int) (4294967295L & j2);
        int iD = defpackage.dgc.d(j);
        int iC = defpackage.dgc.c(j);
        if ((java.lang.Math.min(i3, i4) < java.lang.Math.max(i, i2)) && (java.lang.Math.min(i, i2) < java.lang.Math.max(i3, i4))) {
            if (defpackage.dgc.g(j2, j)) {
                iD = defpackage.dgc.d(j2);
                iC = iD;
            } else {
                if (defpackage.dgc.g(j, j2)) {
                    iB = defpackage.dgc.b(j2);
                } else {
                    int iMin = java.lang.Math.min(i3, i4);
                    if (iD >= java.lang.Math.max(i3, i4) || iMin > iD) {
                        iC = defpackage.dgc.d(j2);
                    } else {
                        iD = defpackage.dgc.d(j2);
                        iB = defpackage.dgc.b(j2);
                    }
                }
                iC -= iB;
            }
        } else if (iC > defpackage.dgc.d(j2)) {
            iD -= defpackage.dgc.b(j2);
            iB = defpackage.dgc.b(j2);
            iC -= iB;
        }
        return defpackage.dax.g(iD, iC);
    }

    public static final boolean q(char c, char c2) {
        return java.lang.Character.isHighSurrogate(c) && java.lang.Character.isLowSurrogate(c2);
    }

    public static final boolean r(defpackage.cjj cjjVar, float f, float f2) {
        if (f > cjjVar.d || cjjVar.b > f) {
            return false;
        }
        return f2 <= cjjVar.e && cjjVar.c <= f2;
    }

    public static final java.lang.String s(defpackage.dij dijVar, android.content.Context context) {
        float fB;
        defpackage.dln.t(context);
        int iAi = defpackage.a.ai(context);
        if (iAi == 0) {
            return defpackage.dmh.c(dijVar.a, null, null, null, new defpackage.cyw(12), 31);
        }
        java.util.List list = dijVar.a;
        int size = list.size();
        java.lang.String strConcat = "";
        boolean z = false;
        for (int i = 0; i < size; i++) {
            defpackage.dig digVar = (defpackage.dig) list.get(i);
            if (defpackage.afga.f(digVar.a(), "wght")) {
                fB = defpackage.afqt.d(digVar.b() + iAi, 1.0f, 1000.0f);
                z = true;
            } else {
                fB = digVar.b();
            }
            if (i != 0) {
                strConcat = strConcat.concat(",");
            }
            strConcat = ((java.lang.Object) strConcat) + "'" + digVar.a() + "' " + fB;
        }
        if (z) {
            return strConcat;
        }
        float fD = defpackage.afqt.d(iAi + 400.0f, 1.0f, 1000.0f);
        if (!list.isEmpty()) {
            strConcat = strConcat.concat(",");
        }
        return ((java.lang.Object) strConcat) + "'wght' " + fD;
    }

    public static final android.graphics.Typeface t(java.lang.String str, defpackage.dil dilVar, int i) {
        if (i == 0) {
            if (defpackage.afga.f(dilVar, defpackage.dil.k) && (str == null || str.length() == 0)) {
                return android.graphics.Typeface.DEFAULT;
            }
            i = 0;
        }
        if (i == 0 && defpackage.afga.f(dilVar, defpackage.dil.n) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT_BOLD;
        }
        return hh$.ExternalSyntheticApiModelOutline0.m(str == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(str, 0), dilVar.o, 1 == i);
    }

    public static /* synthetic */ defpackage.dhy u(defpackage.kwv kwvVar, defpackage.div divVar, defpackage.dil dilVar, int i) {
        defpackage.dij dijVar = new defpackage.dij(new defpackage.dig[0]);
        java.util.List list = dijVar.a;
        if (list.size() > 1) {
            int size = list.size() - 1;
            int i2 = 0;
            while (i2 < size) {
                java.lang.String strA = ((defpackage.dig) list.get(i2)).a();
                i2++;
                if (strA.compareTo(((defpackage.dig) list.get(i2)).a()) > 0) {
                    defpackage.dig[] digVarArr = (defpackage.dig[]) defpackage.afga.aW(list, new defpackage.azq(7)).toArray(new defpackage.dig[0]);
                    dijVar = new defpackage.dij((defpackage.dig[]) java.util.Arrays.copyOf(digVarArr, digVarArr.length));
                    break;
                }
            }
        }
        return new defpackage.diw((java.lang.String) kwvVar.a, divVar, dilVar, i, dijVar);
    }

    private static final int v(android.view.View view, int i) {
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        java.lang.Object obj = null;
        while (view != null) {
            java.lang.Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!defpackage.afga.f(tag, obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i2 = i3;
            }
            i3++;
            java.lang.Object objB = defpackage.edd.b(view);
            view = objB instanceof android.view.View ? (android.view.View) objB : null;
        }
        return i2;
    }

    private static final float w(int i, int i2, float[] fArr) {
        int i3 = i - i2;
        return fArr[i3 + i3 + 1];
    }

    private static final boolean x(android.graphics.RectF rectF, float f, float f2) {
        return f2 >= rectF.left && f <= rectF.right;
    }
}
