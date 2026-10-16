package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dmh {
    public static int A(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i) {
        if (u(xmlPullParser, str)) {
            return typedArray.getResourceId(i, 0);
        }
        return 0;
    }

    public static final int B(android.content.res.TypedArray typedArray, int i) {
        typedArray.getClass();
        C(typedArray, i);
        return typedArray.getInt(i, 0);
    }

    public static final void C(android.content.res.TypedArray typedArray, int i) {
        if (!typedArray.hasValue(i)) {
            throw new java.lang.IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static java.util.List D(android.content.res.Resources resources, int i) {
        if (i == 0) {
            return java.util.Collections.EMPTY_LIST;
        }
        android.content.res.TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return java.util.Collections.EMPTY_LIST;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(S(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(S(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void E(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static int F(android.content.Context context, java.lang.String str, int i, int i2, java.lang.String str2) {
        int iM;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        java.lang.String strPermissionToOp = android.app.AppOpsManager.permissionToOp(str);
        if (strPermissionToOp == null) {
            return 0;
        }
        if (str2 == null) {
            java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int iMyUid = android.os.Process.myUid();
        java.lang.String packageName = context.getPackageName();
        if (iMyUid == i2 && j$.util.Objects.equals(packageName, str2) && android.os.Build.VERSION.SDK_INT >= 29) {
            android.app.AppOpsManager appOpsManager = (android.app.AppOpsManager) context.getSystemService(android.app.AppOpsManager.class);
            iM = defpackage.dsn.s(appOpsManager, strPermissionToOp, android.os.Binder.getCallingUid(), str2);
            if (iM == 0) {
                iM = defpackage.dsn.s(appOpsManager, strPermissionToOp, i2, alh$.ExternalSyntheticApiModelOutline0.m(context));
            }
        } else {
            iM = defpackage.dlv.m(context, strPermissionToOp, str2);
        }
        return iM == 0 ? 0 : -2;
    }

    public static int G(android.content.Context context, java.lang.String str) {
        return F(context, str, android.os.Process.myPid(), android.os.Process.myUid(), context.getPackageName());
    }

    public static final boolean H() {
        int iAr;
        return defpackage.acqh.k() && (iAr = defpackage.a.ar(defpackage.acqh.d().c)) != 0 && iAr == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void I(com.google.android.gms.car.lifecycle.CarActivityLayoutConfig carActivityLayoutConfig) {
        int i;
        defpackage.ysr.bk(!carActivityLayoutConfig.a().isEmpty(), "There must be at least one display");
        defpackage.ygw ygwVarA = carActivityLayoutConfig.a();
        int size = ygwVarA.size();
        int i2 = 0;
        while (i2 < size) {
            com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig carDisplayLayoutConfig = (com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig) ygwVarA.get(i2);
            defpackage.ysr.bk(!carDisplayLayoutConfig.a().isEmpty(), "Each display must contain at least 1 region");
            defpackage.ygw ygwVarA2 = carDisplayLayoutConfig.a();
            int size2 = ygwVarA2.size();
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 < size2) {
                    com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig carActivityRegionLayoutConfig = (com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) ygwVarA2.get(i3);
                    com.google.android.gms.car.display.CarRegionId carRegionId = carActivityRegionLayoutConfig.c;
                    defpackage.ysr.bn(carActivityRegionLayoutConfig.b != null, "Fallback intent is null for %s", carRegionId);
                    defpackage.ysr.bn(carActivityRegionLayoutConfig.a != null, "Initial intent is null for %s", carRegionId);
                    i3++;
                }
            }
            i2 = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J(com.google.android.gms.car.lifecycle.CarActivityLayoutConfig carActivityLayoutConfig) {
        int i;
        int i2 = 0;
        defpackage.zf zfVar = new defpackage.zf(0);
        defpackage.zf zfVar2 = new defpackage.zf(0);
        defpackage.ygf ygfVar = new defpackage.ygf(null);
        defpackage.ygw ygwVarA = carActivityLayoutConfig.a();
        int size = ygwVarA.size();
        int i3 = 0;
        while (i3 < size) {
            defpackage.ygw ygwVarA2 = ((com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig) ygwVarA.get(i3)).a();
            int size2 = ygwVarA2.size();
            int i4 = i2;
            while (true) {
                i = i3 + 1;
                if (i4 < size2) {
                    com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig carActivityRegionLayoutConfig = (com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) ygwVarA2.get(i4);
                    com.google.android.gms.car.display.CarRegionGroup carRegionGroup = carActivityRegionLayoutConfig.e;
                    if (carRegionGroup != null) {
                        com.google.android.gms.car.display.CarRegionId carRegionId = carActivityRegionLayoutConfig.c;
                        java.util.Set<com.google.android.gms.car.display.CarRegionId> setG = ygfVar.c(carRegionGroup);
                        if (!setG.isEmpty()) {
                            for (com.google.android.gms.car.display.CarRegionId carRegionId2 : setG) {
                                if (zfVar.contains(carRegionId2)) {
                                    defpackage.ysr.bq(carActivityRegionLayoutConfig.a.getComponent() == null ? 1 : i2, "There can be at most one region with a non null component on its initial intent. Group %s has both %s and %s", carRegionGroup, carRegionId, carRegionId2);
                                }
                                if (zfVar2.contains(carRegionId2)) {
                                    defpackage.ysr.bq(carActivityRegionLayoutConfig.b.getComponent() == null, "There can be at most one region with a non null component on its fallback intent. Group %s has both %s and %s", carRegionGroup, carRegionId, carRegionId2);
                                }
                                i2 = 0;
                            }
                        }
                        if (carActivityRegionLayoutConfig.a.getComponent() != null) {
                            zfVar.add(carRegionId);
                        }
                        if (carActivityRegionLayoutConfig.b.getComponent() != null) {
                            zfVar2.add(carRegionId);
                        }
                        ygfVar.t(carRegionGroup, carRegionId);
                    }
                    i4++;
                    i2 = 0;
                }
            }
            i3 = i;
        }
    }

    public static boolean K(int i) {
        int i2 = (int) defpackage.acsa.a.fF().i();
        return i2 != -1 && i >= i2;
    }

    public static java.lang.String L(defpackage.ove oveVar) {
        int iOrdinal = oveVar.ordinal();
        if (iOrdinal == 1) {
            return "TTS";
        }
        if (iOrdinal == 2) {
            return "SYSTEM";
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? "UNKNOWN" : "VOICE";
        }
        return "MEDIA";
    }

    public static java.lang.String M(int i) {
        if (i == 1) {
            return "TTS";
        }
        if (i != 2) {
            return i != 3 ? "VOICE" : "MEDIA";
        }
        return "SYSTEM";
    }

    public static int N(int i) {
        if (i == 16000) {
            return 1024;
        }
        if (i == 44100 || i == 48000) {
            return 2048;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Unsupported sample rate: "));
    }

    public static int O(defpackage.xlk xlkVar, int i) {
        if (defpackage.itj.a(xlkVar)) {
            return 1024;
        }
        return N(i);
    }

    public static int P(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        int i3 = 1;
        if (i2 != 1) {
            int i4 = i2 != 3 ? 1024 : 2048;
            return (i4 + i4) * i3;
        }
        i3 = 2;
        return (i4 + i4) * i3;
    }

    public static int Q(int i) {
        int i2 = i - 1;
        return (i2 == 1 || i2 == 3) ? 48000 : 16000;
    }

    public static final int R(com.google.android.gms.car.CarAudioConfiguration carAudioConfiguration) {
        int i = carAudioConfiguration.a;
        int i2 = carAudioConfiguration.b;
        int iN = N(i);
        int i3 = iN + iN;
        return (i2 == 12 || i2 == 12) ? i3 + i3 : i3;
    }

    private static java.util.List S(java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            arrayList.add(android.util.Base64.decode(str, 0));
        }
        return arrayList;
    }

    public static final java.lang.Void a(java.lang.String str) {
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final void b(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public static /* synthetic */ java.lang.String c(java.util.List list, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, defpackage.affc affcVar, int i) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((i & 2) != 0) {
            charSequence2 = "";
        }
        sb.append(charSequence2);
        int size = list.size();
        byte b = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte b2 = (i & 8) != 0 ? (byte) -1 : (byte) 0;
            defpackage.affc affcVar2 = null;
            if (i2 >= size) {
                b = b2;
                break;
            }
            java.lang.Object obj = list.get(i2);
            i3++;
            if (i3 > 1) {
                sb.append(1 != (i & 1) ? charSequence : ", ");
            }
            if (b2 >= 0 && i3 > 0) {
                break;
            }
            if ((i & 32) == 0) {
                affcVar2 = affcVar;
            }
            defpackage.a.j(sb, obj, affcVar2);
            i2++;
        }
        if (b >= 0 && i3 > 0) {
            sb.append((java.lang.CharSequence) ((i & 16) != 0 ? "..." : null));
        }
        if ((i & 4) != 0) {
            charSequence3 = "";
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public static final float d(float f, float f2, float f3, float f4, float f5) {
        return f + ((f2 - f) * java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, f3 == f4 ? 0.0f : (f5 - f3) / (f4 - f3))));
    }

    public static final float e(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float fD;
        float fAbs = java.lang.Math.abs(f);
        float fSignum = java.lang.Math.signum(f);
        int iBinarySearch = java.util.Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            fD = fArr2[iBinarySearch];
        } else {
            int i = -(iBinarySearch + 1);
            int i2 = i - 1;
            int length = fArr.length - 1;
            float f5 = 0.0f;
            if (i2 >= length) {
                float f6 = fArr[length];
                float f7 = fArr2[length];
                if (f6 == 0.0f) {
                    return 0.0f;
                }
                return f * (f7 / f6);
            }
            if (i2 == -1) {
                f2 = fArr[0];
                f3 = fArr2[0];
                f4 = 0.0f;
            } else {
                float f8 = fArr[i2];
                f2 = fArr[i];
                f5 = fArr2[i2];
                f3 = fArr2[i];
                f4 = f8;
            }
            fD = d(f5, f3, f4, f2, fAbs);
        }
        return fSignum * fD;
    }

    public static final long f(double d) {
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits((float) d);
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        return (jFloatToRawIntBits & 4294967295L) | 4294967296L;
    }

    public static final long g(int i) {
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(i);
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        return (jFloatToRawIntBits & 4294967295L) | 4294967296L;
    }

    public static final long h(long j, float f) {
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f);
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        return j | (jFloatToRawIntBits & 4294967295L);
    }

    public static final void i(long j) {
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        if ((j & 1095216660480L) == 0) {
            defpackage.dlv.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void j() {
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
    }

    public static float k(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i, float f) {
        return !u(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int l(android.content.Context context, int i, int i2) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static int m(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i, int i2) {
        return !u(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int n(android.content.res.TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static android.content.res.TypedArray o(android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static java.lang.CharSequence p(android.content.res.TypedArray typedArray, int i, int i2) {
        java.lang.CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static java.lang.String q(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i) {
        if (u(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static java.lang.String r(android.content.res.TypedArray typedArray, int i, int i2) {
        java.lang.String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean s(android.content.res.TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static boolean t(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i, boolean z) {
        return !u(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    public static boolean u(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static java.lang.CharSequence[] v(android.content.res.TypedArray typedArray, int i, int i2) {
        java.lang.CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static int w(android.content.res.TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    public static int x(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i) {
        if (u(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    public static android.content.res.ColorStateList y(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme) {
        if (!u(xmlPullParser, "tint")) {
            return null;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        typedArray.getValue(1, typedValue);
        if (typedValue.type == 2) {
            typedValue.toString();
            throw new java.lang.UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(typedValue.toString()));
        }
        if (typedValue.type >= 28 && typedValue.type <= 31) {
            return android.content.res.ColorStateList.valueOf(typedValue.data);
        }
        android.content.res.Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        int i = defpackage.dvc.a;
        try {
            return defpackage.dvc.a(resources, resources.getXml(resourceId), theme);
        } catch (java.lang.Exception e) {
            android.util.Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static defpackage.dvd z(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme, java.lang.String str, int i) {
        defpackage.dvd dvdVar;
        float f;
        float f2;
        android.graphics.Shader radialGradient;
        int i2;
        android.content.res.TypedArray typedArrayObtainStyledAttributes;
        if (u(xmlPullParser, str)) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return new defpackage.dvd(null, null, typedValue.data);
            }
            android.content.res.Resources resources = typedArray.getResources();
            try {
                android.content.res.XmlResourceParser xml = resources.getXml(typedArray.getResourceId(i, 0));
                android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xml);
                while (true) {
                    int next = xml.next();
                    if (next == 2) {
                        java.lang.String name = xml.getName();
                        int iHashCode = name.hashCode();
                        if (iHashCode != 89650992) {
                            if (iHashCode == 1191572447 && name.equals("selector")) {
                                android.content.res.ColorStateList colorStateListB = defpackage.dvc.b(resources, xml, attributeSetAsAttributeSet, theme);
                                dvdVar = new defpackage.dvd(null, colorStateListB, colorStateListB.getDefaultColor());
                                break;
                            }
                            throw new org.xmlpull.v1.XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
                        }
                        if (name.equals("gradient")) {
                            java.lang.String name2 = xml.getName();
                            if (!name2.equals("gradient")) {
                                throw new org.xmlpull.v1.XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
                            }
                            int[] iArr = defpackage.dss.e;
                            android.content.res.TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
                            float f3 = !u(xml, "startX") ? 0.0f : typedArrayObtainAttributes.getFloat(8, 0.0f);
                            float f4 = !u(xml, "startY") ? 0.0f : typedArrayObtainAttributes.getFloat(9, 0.0f);
                            float f5 = !u(xml, "endX") ? 0.0f : typedArrayObtainAttributes.getFloat(10, 0.0f);
                            float f6 = !u(xml, "endY") ? 0.0f : typedArrayObtainAttributes.getFloat(11, 0.0f);
                            float f7 = !u(xml, "centerX") ? 0.0f : typedArrayObtainAttributes.getFloat(3, 0.0f);
                            float f8 = !u(xml, "centerY") ? 0.0f : typedArrayObtainAttributes.getFloat(4, 0.0f);
                            int i3 = !u(xml, "type") ? 0 : typedArrayObtainAttributes.getInt(2, 0);
                            int iX = x(typedArrayObtainAttributes, xml, "startColor", 0);
                            boolean zU = u(xml, "centerColor");
                            int iX2 = x(typedArrayObtainAttributes, xml, "centerColor", 7);
                            int iX3 = x(typedArrayObtainAttributes, xml, "endColor", 1);
                            int i4 = 1;
                            int i5 = !u(xml, "tileMode") ? 0 : typedArrayObtainAttributes.getInt(6, 0);
                            float f9 = !u(xml, "gradientRadius") ? 0.0f : typedArrayObtainAttributes.getFloat(5, 0.0f);
                            typedArrayObtainAttributes.recycle();
                            int depth = xml.getDepth() + 1;
                            java.util.ArrayList arrayList = new java.util.ArrayList(20);
                            int i6 = i5;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(20);
                            while (true) {
                                int next2 = xml.next();
                                f = f3;
                                if (next2 == i4) {
                                    f2 = f4;
                                    break;
                                }
                                int depth2 = xml.getDepth();
                                f2 = f4;
                                if (depth2 < depth && next2 == 3) {
                                    break;
                                }
                                if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                                    int[] iArr2 = defpackage.dss.f;
                                    if (theme == null) {
                                        typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                                        i2 = 0;
                                    } else {
                                        i2 = 0;
                                        typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                                    }
                                    boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
                                    boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(1);
                                    if (!zHasValue || !zHasValue2) {
                                        throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.valueOf(xml.getPositionDescription()).concat(": <item> tag requires a 'color' attribute and a 'offset' attribute!"));
                                    }
                                    int color = typedArrayObtainStyledAttributes.getColor(0, 0);
                                    float f10 = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
                                    typedArrayObtainStyledAttributes.recycle();
                                    arrayList2.add(java.lang.Integer.valueOf(color));
                                    arrayList.add(java.lang.Float.valueOf(f10));
                                }
                                f3 = f;
                                f4 = f2;
                                i4 = 1;
                            }
                            se seVar = arrayList2.size() > 0 ? new se(arrayList2, arrayList) : null;
                            if (seVar == null) {
                                seVar = zU ? new se(iX, iX2, iX3) : new se(iX, iX3);
                            }
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    radialGradient = new android.graphics.LinearGradient(f, f2, f5, f6, (int[]) seVar.b, (float[]) seVar.a, dtg.i(i6));
                                } else {
                                    radialGradient = new android.graphics.SweepGradient(f7, f8, (int[]) seVar.b, (float[]) seVar.a);
                                }
                            } else {
                                if (f9 <= 0.0f) {
                                    throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                                }
                                float f11 = f8;
                                float f12 = f7;
                                radialGradient = new android.graphics.RadialGradient(f12, f11, f9, (int[]) seVar.b, (float[]) seVar.a, dtg.i(i6));
                            }
                            dvdVar = new defpackage.dvd(radialGradient, null, 0);
                            break;
                        }
                        throw new org.xmlpull.v1.XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
                    }
                    if (next == 1) {
                        throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
                    }
                }
            } catch (java.lang.Exception e) {
                android.util.Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                dvdVar = null;
            }
            if (dvdVar != null) {
                return dvdVar;
            }
        }
        return new defpackage.dvd(null, null, 0);
    }
}
