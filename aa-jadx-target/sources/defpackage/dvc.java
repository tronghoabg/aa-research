package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dvc {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.ThreadLocal b = new java.lang.ThreadLocal();

    public static android.content.res.ColorStateList a(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
            }
        } while (next != 1);
        throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0138  */
    /* JADX WARN: Code duplicated, block: B:77:0x0149  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r37v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static android.content.res.ColorStateList b(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth;
        int color;
        float f;
        int[] iArr;
        double d;
        float f2;
        int i;
        android.util.TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        java.lang.String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        java.lang.Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr3 = defpackage.dss.a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i2, i2);
                int resourceId = ObtainAttributes.getResourceId(i2, -1);
                if (resourceId != -1) {
                    java.lang.ThreadLocal threadLocal = b;
                    android.util.TypedValue typedValue2 = (android.util.TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new android.util.TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r4);
                    if (typedValue.type < 28 || typedValue.type > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (java.lang.Exception unused) {
                            color = ObtainAttributes.getColor(i2, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i2, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i2, -65281);
                }
                float f3 = 1.0f;
                if (ObtainAttributes.hasValue(r4)) {
                    f = ObtainAttributes.getFloat(r4, 1.0f);
                } else {
                    f = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                float f4 = (android.os.Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                ?? r16 = r4;
                int i4 = i2;
                int i5 = i4;
                while (i5 < attributeCount) {
                    float f5 = f3;
                    int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != 2130968637 && attributeNameResource != 2130969676) {
                        int i6 = i4 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i4] = attributeNameResource;
                        i4 = i6;
                    }
                    i5++;
                    f3 = f5;
                }
                float f6 = f3;
                int[] iArrTrimStateSet = android.util.StateSet.trimStateSet(iArr4, i4);
                float f7 = 100.0f;
                boolean z = (f4 < 0.0f || f4 > 100.0f) ? false : r16 == true ? 1 : 0;
                boolean z2 = z;
                if (f != f6) {
                    int iC = defpackage.duc.c((int) ((android.graphics.Color.alpha(color) * f) + 0.5f), 0, 255);
                    if (z2) {
                        dva dvaVarB = dva.b(color);
                        float f8 = dvaVarB.a;
                        float f9 = dvaVarB.b;
                        d = f9;
                        dvj dvjVar = dvj.a;
                        if (d >= 1.0d) {
                            iArr = iArr2;
                            if (java.lang.Math.round(f4) <= 0.0d && java.lang.Math.round(f4) < 100.0d) {
                                float fMin = f8 < 0.0f ? 0.0f : java.lang.Math.min(360.0f, f8);
                                float f10 = f9;
                                boolean z3 = r16 == true ? 1 : 0;
                                float f11 = 0.0f;
                                dva dvaVar = null;
                                while (true) {
                                    if (java.lang.Math.abs(f11 - f9) < 0.4f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        if (dvaVar != null) {
                                            color = dvaVar.a(dvjVar);
                                            break;
                                        }
                                        color = dvb.b(f4);
                                        break;
                                    }
                                    float f12 = 1000.0f;
                                    float f13 = f7;
                                    float f14 = 0.0f;
                                    float f15 = 1000.0f;
                                    dva dvaVar2 = null;
                                    while (true) {
                                        if (java.lang.Math.abs(f14 - f13) <= 0.01f) {
                                            iArrTrimStateSet = iArrTrimStateSet;
                                            depth2 = depth2;
                                            fMin = fMin;
                                            f7 = f7;
                                            break;
                                        }
                                        f7 = f7;
                                        float f16 = f14 + ((f13 - f14) / 2.0f);
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        int iA = dva.c(f16, f10, fMin).a(dvjVar);
                                        int i7 = dvb.e;
                                        float fA = dvb.a(android.graphics.Color.red(iA));
                                        float fA2 = dvb.a(android.graphics.Color.green(iA));
                                        float fA3 = dvb.a(android.graphics.Color.blue(iA));
                                        float[] fArr = dvb.d[r16 == true ? 1 : 0];
                                        float f17 = (((fA * fArr[0]) + (fA2 * fArr[r16 == true ? 1 : 0])) + (fA3 * fArr[2])) / f7;
                                        float fCbrt = f17 <= 0.008856452f ? f17 * 903.2963f : (((float) java.lang.Math.cbrt(f17)) * 116.0f) - 16.0f;
                                        float fAbs = java.lang.Math.abs(f4 - fCbrt);
                                        if (fAbs < 0.2f) {
                                            f2 = fCbrt;
                                            dva dvaVarB2 = dva.b(iA);
                                            dva dvaVarC = dva.c(dvaVarB2.c, dvaVarB2.b, fMin);
                                            float f18 = dvaVarB2.d;
                                            float f19 = dvaVarC.d;
                                            float f20 = dvaVarB2.e;
                                            float f21 = dvaVarC.e;
                                            float f22 = dvaVarB2.f - dvaVarC.f;
                                            float f23 = f20 - f21;
                                            float f24 = f18 - f19;
                                            double dSqrt = java.lang.Math.sqrt((f24 * f24) + (f23 * f23) + (f22 * f22));
                                            depth2 = depth2;
                                            fMin = fMin;
                                            float fPow = (float) (java.lang.Math.pow(dSqrt, 0.63d) * 1.41d);
                                            if (fPow <= f6) {
                                                dvaVar2 = dvaVarB2;
                                                f15 = fPow;
                                                f12 = fAbs;
                                            }
                                        } else {
                                            f2 = fCbrt;
                                            depth2 = depth2;
                                            fMin = fMin;
                                        }
                                        if (f12 == 0.0f && f15 == 0.0f) {
                                            break;
                                        }
                                        if (f2 >= f4) {
                                            f13 = f16;
                                        }
                                        if (f2 < f4) {
                                            f14 = f16;
                                        }
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        f7 = f7;
                                        depth2 = depth2;
                                        fMin = fMin;
                                    }
                                    dva dvaVar3 = dvaVar2;
                                    if (!z3) {
                                        if (dvaVar3 != null) {
                                            dvaVar = dvaVar3;
                                        }
                                        if (dvaVar3 != null) {
                                            f11 = f10;
                                        }
                                        if (dvaVar3 == null) {
                                            f9 = f10;
                                        }
                                        f10 = f11 + ((f9 - f11) / 2.0f);
                                    } else {
                                        if (dvaVar3 != null) {
                                            color = dvaVar3.a(dvjVar);
                                            break;
                                        }
                                        f10 = f11 + ((f9 - f11) / 2.0f);
                                        z3 = false;
                                    }
                                }
                            }
                        } else {
                            iArr = iArr2;
                        }
                        color = dvb.b(f4);
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                        iArr = iArr2;
                    }
                    color = (16777215 & color) | (iC << 24);
                } else if (z) {
                    z2 = r16 == true ? 1 : 0;
                    int iC2 = defpackage.duc.c((int) ((android.graphics.Color.alpha(color) * f) + 0.5f), 0, 255);
                    if (z2) {
                        dva dvaVarB3 = dva.b(color);
                        float f25 = dvaVarB3.a;
                        float f26 = dvaVarB3.b;
                        d = f26;
                        dvj dvjVar2 = dvj.a;
                        if (d >= 1.0d) {
                            iArr = iArr2;
                            if (java.lang.Math.round(f4) <= 0.0d) {
                            }
                        } else {
                            iArr = iArr2;
                        }
                        color = dvb.b(f4);
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                        iArr = iArr2;
                    }
                    color = (16777215 & color) | (iC2 << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                    iArr = iArr2;
                }
                int i8 = i3 + 1;
                if (i8 > iArr.length) {
                    int[] iArr5 = new int[dti.b(i3)];
                    i = 0;
                    java.lang.System.arraycopy(iArr, 0, iArr5, 0, i3);
                    iArr2 = iArr5;
                } else {
                    i = 0;
                    iArr2 = iArr;
                }
                iArr2[i3] = color;
                if (i8 > objArr.length) {
                    java.lang.Object[] objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), dti.b(i3));
                    java.lang.System.arraycopy(objArr, i, objArr2, i, i3);
                    objArr = objArr2;
                }
                objArr[i3] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i3 = i8;
                r4 = r16 == true ? 1 : 0;
                depth2 = depth2;
                i2 = 0;
            } else {
                iArr2 = iArr2;
                r4 = r4 == true ? 1 : 0;
                depth2 = depth2;
                i2 = 0;
            }
        }
        int[] iArr6 = new int[i3];
        int[][] iArr7 = new int[i3][];
        java.lang.System.arraycopy(iArr2, 0, iArr6, 0, i3);
        java.lang.System.arraycopy(objArr, 0, iArr7, 0, i3);
        return new android.content.res.ColorStateList(iArr7, iArr6);
    }
}
