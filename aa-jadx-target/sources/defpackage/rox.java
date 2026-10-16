package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rox {
    static java.lang.Boolean a;
    public static defpackage.cno b;
    public static defpackage.cno c;
    private static java.lang.Boolean d;
    private static volatile java.lang.Object e;

    public rox(byte[] bArr, byte[] bArr2) {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    public static float A(float[] fArr, float f) {
        int i = 0;
        if (f <= fArr[0]) {
            return fArr[1];
        }
        int length = fArr.length;
        if (f >= fArr[length - 2]) {
            return fArr[length - 1];
        }
        while (true) {
            int length2 = fArr.length;
            if (i >= length2 - 2) {
                return fArr[length2 - 1];
            }
            float f2 = fArr[i];
            float f3 = fArr[i + 1];
            int i2 = i + 2;
            float f4 = fArr[i2];
            float f5 = fArr[i + 3];
            if (f >= f2 && f <= f4) {
                return f3 + ((f5 - f3) * ((f - f2) / (f4 - f2)));
            }
            i = i2;
        }
    }

    public static float[] B(int[] iArr, float f) {
        int length = iArr.length + 1;
        float[] fArr = new float[length + length];
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = i + i;
            int i3 = i2 + 2;
            fArr[i3] = fArr[i2];
            int i4 = i2 + 1;
            int i5 = i2 + 3;
            fArr[i5] = fArr[i4];
            float f2 = iArr[i];
            fArr[i3] = fArr[i3] + ((i & 1) == 0 ? f2 : f2 * f);
            fArr[i5] = fArr[i5] + f2;
        }
        return fArr;
    }

    public static float C(int i, int i2, int i3, int i4) {
        if (i4 >= i) {
            return 1.0f;
        }
        float f = i2;
        float f2 = i3;
        return ((((float) java.lang.Math.ceil((((((i - i4) + f) / f) * f) + f2) / 4.0f)) * 4.0f) - f2) / f;
    }

    public static final int D(float f, int i, int i2) {
        return java.lang.Math.round(i + (i2 * f));
    }

    public static final int E(float f, int i, int i2) {
        return java.lang.Math.round(i + (i2 * f));
    }

    public static final android.graphics.Rect F(java.lang.String str, float f, android.graphics.Typeface typeface) {
        android.graphics.Rect rect = new android.graphics.Rect();
        if (defpackage.ysr.bw(str)) {
            return rect;
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(f);
        paint.setTypeface(typeface);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: xzp */
    public static final uls G(ull ullVar, pku pkuVar, defpackage.ygw ygwVar, defpackage.ygw ygwVar2, java.util.List list, abdw abdwVar, byte[] bArr, abgj abgjVar, java.util.List list2, abho abhoVar, defpackage.ygw ygwVar3, abcp[] abcpVarArr, byte[] bArr2, int i, tpx tpxVar, defpackage.yhe yheVar) throws xzp {
        defpackage.ygw ygwVarO;
        defpackage.ysr.aM(abhoVar != null);
        java.util.List arrayList = list == null ? new java.util.ArrayList() : list;
        if (list2 == null) {
            int i2 = defpackage.ygw.d;
            ygwVarO = defpackage.ymx.a;
        } else {
            ygwVarO = defpackage.ygw.o(list2);
        }
        return new uls(ullVar, pkuVar, abhoVar, ygwVar, ygwVar2, arrayList, abdwVar, bArr, abgjVar, ygwVarO, ygwVar3, abcpVarArr == null ? new abcp[0] : abcpVarArr, bArr2, i, tpxVar, yheVar);
    }

    public static void H(defpackage.erh erhVar, abho abhoVar, pwj pwjVar) {
        int i = pwjVar.A;
    }

    public static void I(defpackage.erh erhVar, abho abhoVar, oht ohtVar, pwj pwjVar) {
        qcx qcxVar = qcm.a;
        qct qctVar = new qct("NetworkFetchEndToEndLatency".concat(java.lang.String.valueOf(qcm.b(abhoVar))), qcr.ae);
        qcs qcsVarA = qcm.a(abhoVar);
        qbx qbxVar = (qbx) ohtVar.b;
        ((j$.time.Duration) qbxVar.b).toMillis();
        ((j$.time.Duration) qbxVar.a).toMillis();
        ((qce) erhVar.S(qctVar)).getClass();
        int i = pwjVar.A;
    }

    public static boolean J(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (bArr[i3] != 0) {
                return true;
            }
        }
        return false;
    }

    public static android.content.Intent K(android.app.PendingIntent pendingIntent) {
        defpackage.sqs.aB(pendingIntent, "The target cannot be null!");
        return new android.content.Intent("com.google.android.gms.ui.UNPACKING_REDIRECT").setPackage("com.google.android.gms").setData(android.net.Uri.parse("intent://com.google.android.gms.auth.uiflows.common/".concat(java.lang.String.valueOf(java.lang.String.valueOf(java.util.UUID.randomUUID()))))).putExtra("target", pendingIntent);
    }

    public static qmj L(qnz qnzVar, java.lang.String str) {
        defpackage.sqs.aA(qnzVar);
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        new java.util.HashMap();
        try {
            java.util.Map mapA = sqp.a(new java.net.URI(defpackage.a.bA(str, "?")));
            qmj qmjVar = new qmj();
            qmjVar.e = (java.lang.String) mapA.get("utm_content");
            qmjVar.c = (java.lang.String) mapA.get("utm_medium");
            qmjVar.a = (java.lang.String) mapA.get("utm_campaign");
            qmjVar.b = (java.lang.String) mapA.get("utm_source");
            qmjVar.d = (java.lang.String) mapA.get("utm_term");
            qmjVar.f = (java.lang.String) mapA.get("utm_id");
            qmjVar.g = (java.lang.String) mapA.get("anid");
            qmjVar.h = (java.lang.String) mapA.get("gclid");
            qmjVar.i = (java.lang.String) mapA.get("dclid");
            qmjVar.j = (java.lang.String) mapA.get("aclid");
            return qmjVar;
        } catch (java.net.URISyntaxException e2) {
            qnzVar.p(5, "No valid campaign data found", e2, (java.lang.Object) null, (java.lang.Object) null);
            return null;
        }
    }

    public static java.lang.String M(java.util.Locale locale) {
        if (locale == null) {
            return null;
        }
        java.lang.String language = locale.getLanguage();
        if (android.text.TextUtils.isEmpty(language)) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(language.toLowerCase(locale));
        if (!android.text.TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase(locale));
        }
        return sb.toString();
    }

    public static void N(java.util.Map map, java.lang.String str, java.lang.String str2) {
        if (str2 == null || map.containsKey(str)) {
            return;
        }
        map.put(str, str2);
    }

    public static boolean O(android.content.Context context, java.lang.String str, boolean z) {
        try {
            android.content.pm.ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new android.content.ComponentName(context, str), 0);
            return receiverInfo != null && receiverInfo.enabled && (!z || receiverInfo.exported);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }

    public static java.security.MessageDigest P() {
        for (int i = 0; i < 2; i++) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static boolean Q(android.content.Context context) {
        defpackage.sqs.aA(context);
        java.lang.Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            android.content.pm.ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new android.content.ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                z = true;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        d = java.lang.Boolean.valueOf(z);
        return z;
    }

    public static boolean R(android.content.Context context) {
        defpackage.sqs.aA(context);
        java.lang.Boolean bool = a;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zO = O(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        a = java.lang.Boolean.valueOf(zO);
        return zO;
    }

    public static final byte[] S(java.io.ByteArrayOutputStream byteArrayOutputStream) {
        return byteArrayOutputStream.toByteArray();
    }

    public static java.lang.String T(java.lang.String str, int i) {
        if (i <= 0) {
            qny.a("index out of range for prefix", str);
            return "";
        }
        return str + i;
    }

    public static final void U(java.lang.String str) {
        try {
            try {
                sub subVar = stn.a;
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        android.util.Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + str);
                    }
                    httpURLConnection.disconnect();
                    sub subVar2 = stn.a;
                } catch (java.lang.Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (java.io.IOException e2) {
                e = e2;
                android.util.Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                sub subVar3 = stn.a;
            } catch (java.lang.IndexOutOfBoundsException e3) {
                android.util.Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + e3.getMessage(), e3);
                sub subVar4 = stn.a;
            } catch (java.lang.RuntimeException e4) {
                e = e4;
                android.util.Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                sub subVar5 = stn.a;
            }
        } catch (java.lang.Throwable th2) {
            sub subVar6 = stn.a;
            throw th2;
        }
    }

    public static android.app.PendingIntent V(mog mogVar, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent("com.google.android.gearhead.ACTION_HANDLE_NOTIFICATION_INTENT").setPackage("com.google.android.projection.gearhead");
        intent.putExtra("EXTRA_STREAMITEM_TYPE", mogVar.J());
        intent.putExtra("EXTRA_STREAMITEM_ID", mogVar.A());
        intent.putExtra("EXTRA_PAYLOAD", bundle);
        return defpackage.lxy.n().a(intent);
    }

    public static android.content.SharedPreferences W(android.content.Context context) {
        defpackage.ysr.bk(defpackage.jrm.a() == defpackage.jrm.PROJECTION, "FRX Prefs should only be accessed in the projection process!");
        return context.getSharedPreferences("com.google.android.projection.gearhead.frx.PREFERENCE_NAME", 0);
    }

    public static void X(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(new int[]{2130968814});
        viewGroup.addView(layoutInflater.inflate(typedArrayObtainStyledAttributes.getResourceId(0, 2131624052), viewGroup, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static boolean Y(android.content.Intent intent) {
        return intent != null && intent.hasCategory("com.google.android.gms.car.drivingMode.category.DEFAULT");
    }

    public static final boolean Z(android.content.Intent intent) {
        android.content.ComponentName componentNameA;
        java.lang.String stringExtra = intent.getStringExtra("android.intent.extra.PACKAGE_NAME");
        if (intent.getComponent() != null && intent.getComponent().getPackageName().equals(stringExtra)) {
            return true;
        }
        java.lang.String action = intent.getAction();
        android.net.Uri data = intent.getData();
        if (action == null || data == null) {
            return false;
        }
        defpackage.ygw ygwVar = defpackage.maw.a;
        if ("android.intent.action.VIEW".equals(intent.getAction()) && (("google.navigation".equals(intent.getScheme()) || "geo".equals(intent.getScheme())) && (componentNameA = defpackage.maw.a(defpackage.kit.b().e(), true)) != null)) {
            intent.setComponent(componentNameA);
            return true;
        }
        if (!"android.intent.action.CALL".equals(action) && !"android.intent.action.DIAL".equals(action)) {
            return false;
        }
        intent.setComponent(defpackage.mkt.b);
        return true;
    }

    public static final int a(android.content.Context context) {
        context.getClass();
        if (!(context instanceof android.app.Service)) {
            defpackage.rrx.a("CAR.PROJECTION.SCVH", null, "getTheme: context not an instance of service");
            return 0;
        }
        android.content.ComponentName componentName = new android.content.ComponentName(context, context.getClass());
        try {
            android.app.Service service = (android.app.Service) context;
            android.content.pm.ServiceInfo serviceInfo = service.getPackageManager().getServiceInfo(componentName, 128);
            serviceInfo.getClass();
            android.os.Bundle bundle = serviceInfo.metaData;
            int i = service.getApplicationInfo().theme;
            return bundle != null ? bundle.getInt("android.app.theme", i) : i;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            defpackage.rrx.d(6, "CAR.PROJECTION.SCVH", null, "Could not get theme for component %s; use the default theme", componentName);
            return 0;
        }
    }

    public static java.lang.Throwable aa(android.os.Bundle bundle) {
        bundle.setClassLoader(com.google.android.enterprise.connectedapps.internal.Bundler.class.getClassLoader());
        return (java.lang.Throwable) bundle.getSerializable("throwable");
    }

    public static qnv ab(int i, defpackage.rkc rkcVar, qmz qmzVar) {
        try {
            return al(qmzVar.b.c.getResources().getXml(i), rkcVar, qmzVar);
        } catch (android.content.res.Resources.NotFoundException e2) {
            qmzVar.p(5, "inflate() called with unknown resourceId", e2, (java.lang.Object) null, (java.lang.Object) null);
            return null;
        }
    }

    public static java.lang.Object ac(java.lang.Class cls) {
        qde.b();
        return defpackage.acmh.c(null, cls);
    }

    public static final qav ad(qat qatVar, abxr abxrVar, defpackage.abor aborVar) {
        qav qavVar = new qav(abxrVar, aborVar.q(), qatVar.a());
        if (!qavVar.b()) {
            ((defpackage.ype) qav.a.a(uzo.a).ai((char) 6998)).u("Attempted to build invalid UE3 params, see http://go/gmm-logging-errors#general-validity");
        }
        return qavVar;
    }

    public static final void ae(zck zckVar, defpackage.abor aborVar) {
        aborVar.t();
        yxg yxgVar = aborVar.b;
        yxg yxgVar2 = yxg.a;
        zckVar.getClass();
        yxgVar.c = zckVar;
        yxgVar.b |= 8;
    }

    public static java.lang.String ag(qag qagVar) {
        return qagVar.b().toString();
    }

    public static java.lang.String ah(android.content.Context context) {
        long jM;
        try {
            jM = hh$.ExternalSyntheticApiModelOutline0.m(context.getPackageManager().getPackageInfo(context.getPackageName(), 0));
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) qah.a.g()).p(e2)).ai((char) 6984)).y("Error trying to get versionCode from PackageManager for package: '%s'", context.getPackageName());
            jM = 0;
        }
        java.lang.Long lValueOf = java.lang.Long.valueOf(jM);
        lValueOf.getClass();
        return jM == 0 ? "1" : lValueOf.toString();
    }

    public static pxo ai(org.chromium.net.CronetException cronetException) {
        if (cronetException instanceof org.chromium.net.NetworkException) {
            switch (((org.chromium.net.NetworkException) cronetException).getErrorCode()) {
                case 1:
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                case 10:
                    return new pxo(pxn.c.d(cronetException));
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    return new pxo(pxn.k.d(cronetException));
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    return new pxo(pxn.b.d(cronetException));
                default:
                    return new pxo(pxn.a.d(cronetException));
            }
        }
        if (cronetException instanceof org.chromium.net.impl.CronetExceptionImpl) {
            int i = defpackage.xzm.a;
            cronetException.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList(4);
            arrayList.add(cronetException);
            boolean z = false;
            org.chromium.net.CronetException cause = cronetException;
            org.chromium.net.CronetException cause2 = cause;
            while (true) {
                cause = cause.getCause();
                if (cause == null) {
                    for (java.lang.Throwable th : j$.util.DesugarCollections.unmodifiableList(arrayList)) {
                        if ((th instanceof java.net.UnknownHostException) || (th instanceof java.net.ConnectException) || (th instanceof javax.net.ssl.SSLException)) {
                            return new pxo(pxn.k.d(cronetException));
                        }
                    }
                    break;
                }
                arrayList.add(cause);
                if (cause == cause2) {
                    throw new java.lang.IllegalArgumentException("Loop in causal chain detected.", cause);
                }
                if (z) {
                    cause2 = cause2.getCause();
                }
                z = !z;
            }
        }
        return new pxo(pxn.a.d(cronetException));
    }

    public static ajnd aj() {
        return defpackage.mce.b().g;
    }

    private static boolean ak(android.content.Context context, java.lang.String str) {
        if (defpackage.duw.c(context, str) == 0) {
            defpackage.rrx.d(2, "GH.FGSServiceUtil", null, "Has %s permission", str);
            return true;
        }
        defpackage.rrx.d(3, "GH.FGSServiceUtil", null, "Does not have %s permission", str);
        return false;
    }

    private static final qnv al(android.content.res.XmlResourceParser xmlResourceParser, defpackage.rkc rkcVar, qmz qmzVar) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    java.lang.String lowerCase = xmlResourceParser.getName().toLowerCase(java.util.Locale.US);
                    if (lowerCase.equals("screenname")) {
                        java.lang.String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
                        java.lang.String strTrim = xmlResourceParser.nextText().trim();
                        if (!android.text.TextUtils.isEmpty(attributeValue)) {
                            android.text.TextUtils.isEmpty(strTrim);
                        }
                    } else if (lowerCase.equals("string")) {
                        java.lang.String attributeValue2 = xmlResourceParser.getAttributeValue(null, "name");
                        java.lang.String strTrim2 = xmlResourceParser.nextText().trim();
                        if (!android.text.TextUtils.isEmpty(attributeValue2) && strTrim2 != null) {
                            if ("ga_appName".equals(attributeValue2)) {
                                ((qnv) rkcVar.a).a = strTrim2;
                            } else if ("ga_appVersion".equals(attributeValue2)) {
                                ((qnv) rkcVar.a).b = strTrim2;
                            } else if ("ga_logLevel".equals(attributeValue2)) {
                                ((qnv) rkcVar.a).c = strTrim2;
                            } else {
                                ((qnc) rkcVar.b).e().p(5, "String xml configuration name not recognized", attributeValue2, (java.lang.Object) null, (java.lang.Object) null);
                            }
                        }
                    } else if (lowerCase.equals("bool")) {
                        java.lang.String attributeValue3 = xmlResourceParser.getAttributeValue(null, "name");
                        java.lang.String strTrim3 = xmlResourceParser.nextText().trim();
                        if (!android.text.TextUtils.isEmpty(attributeValue3) && !android.text.TextUtils.isEmpty(strTrim3)) {
                            try {
                                boolean z = java.lang.Boolean.parseBoolean(strTrim3);
                                if ("ga_dryRun".equals(attributeValue3)) {
                                    ((qnv) rkcVar.a).e = z ? 1 : 0;
                                } else {
                                    ((qnc) rkcVar.b).e().p(5, "Bool xml configuration name not recognized", attributeValue3, (java.lang.Object) null, (java.lang.Object) null);
                                }
                            } catch (java.lang.NumberFormatException e2) {
                                qmzVar.p(5, "Error parsing bool configuration value", strTrim3, e2, (java.lang.Object) null);
                            }
                        }
                    } else if (lowerCase.equals("integer")) {
                        java.lang.String attributeValue4 = xmlResourceParser.getAttributeValue(null, "name");
                        java.lang.String strTrim4 = xmlResourceParser.nextText().trim();
                        if (!android.text.TextUtils.isEmpty(attributeValue4) && !android.text.TextUtils.isEmpty(strTrim4)) {
                            try {
                                int i = java.lang.Integer.parseInt(strTrim4);
                                if ("ga_dispatchPeriod".equals(attributeValue4)) {
                                    ((qnv) rkcVar.a).d = i;
                                } else {
                                    ((qnc) rkcVar.b).e().p(5, "Int xml configuration name not recognized", attributeValue4, (java.lang.Object) null, (java.lang.Object) null);
                                }
                            } catch (java.lang.NumberFormatException e3) {
                                qmzVar.p(5, "Error parsing int configuration value", strTrim4, e3, (java.lang.Object) null);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (java.io.IOException e4) {
            qmzVar.p(6, "Error parsing tracker configuration file", e4, (java.lang.Object) null, (java.lang.Object) null);
        } catch (org.xmlpull.v1.XmlPullParserException e5) {
            qmzVar.p(6, "Error parsing tracker configuration file", e5, (java.lang.Object) null, (java.lang.Object) null);
        }
        return (qnv) rkcVar.a;
    }

    public static java.lang.Class b(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException e2) {
            throw new defpackage.ryz("Error get Class:" + str + ", " + e2.getMessage(), e2);
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static java.lang.Object c(java.lang.Class cls, java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr, java.lang.Class... clsArr) {
        try {
            try {
                return cls.getDeclaredMethod(str, clsArr).invoke(obj, objArr);
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
                throw new defpackage.ryz(e2);
            }
        } catch (java.lang.NoSuchMethodException e3) {
            throw new defpackage.ryz("No method " + str + " for " + cls.getName() + " " + e3.toString());
        }
    }

    public static java.lang.String[] d() {
        return new java.lang.String[0];
    }

    public static final void e(java.lang.Object obj, java.lang.String str, java.lang.StringBuilder sb, rcu rcuVar) {
        defpackage.ygw ygwVarG;
        android.view.View view = (android.view.View) obj;
        sb.append(rcu.a(view));
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            defpackage.ygr ygrVar = new defpackage.ygr(4);
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                ygrVar.i(viewGroup.getChildAt(i));
            }
            ygwVarG = ygrVar.g();
        } else {
            int i2 = defpackage.ygw.d;
            ygwVarG = defpackage.ymx.a;
        }
        defpackage.you youVarListIterator = ygwVarG.listIterator(0);
        while (youVarListIterator.hasNext()) {
            E next = youVarListIterator.next();
            sb.append('\n');
            sb.append(str);
            if (youVarListIterator.hasNext()) {
                sb.append("├── ");
                e(next, str.concat("│   "), sb, rcuVar);
            } else {
                sb.append("└── ");
                e(next, str.concat("    "), sb, rcuVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int f(android.content.Context context, java.util.List list) {
        defpackage.you youVarListIterator = ((defpackage.ygw) list).listIterator(0);
        int i = 0;
        while (youVarListIterator.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) youVarListIterator.next();
            int iIntValue = num.intValue();
            if (iIntValue != 8) {
                if (iIntValue != 128) {
                    i |= iIntValue;
                    defpackage.rrx.d(2, "GH.FGSServiceUtil", null, "Skipping permission checks for %d foreground service type", num);
                } else if (ak(context, "android.permission.RECORD_AUDIO")) {
                    i |= iIntValue;
                }
            } else if (ak(context, "android.permission.ACCESS_COARSE_LOCATION") || ak(context, "android.permission.ACCESS_FINE_LOCATION")) {
                i |= iIntValue;
            }
        }
        return i;
    }

    public static /* synthetic */ java.lang.String g(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "DEATH_RECIPIENT";
        }
        if (i != 3) {
            return i != 4 ? "PRE_SETUP" : "USB_MONITOR";
        }
        return "CRASH_HANDLER";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int h(java.lang.String str) {
        switch (str.hashCode()) {
            case -2074104415:
                if (str.equals("PRE_SETUP")) {
                    return 5;
                }
                break;
            case -563112609:
                if (str.equals("USB_MONITOR")) {
                    return 4;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    return 1;
                }
                break;
            case 858471886:
                if (str.equals("DEATH_RECIPIENT")) {
                    return 2;
                }
                break;
            case 2029551218:
                if (str.equals("CRASH_HANDLER")) {
                    return 3;
                }
                break;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static rza i(java.lang.String str) {
        rza rzaVar = rza.a;
        if (android.text.TextUtils.isEmpty(str)) {
            return rzaVar;
        }
        try {
            rza rzaVarValueOf = rza.valueOf(str.toUpperCase(java.util.Locale.US));
            if (android.os.Build.VERSION.SDK_INT >= (rzaVarValueOf == rza.b ? 33 : 30)) {
                return rzaVarValueOf;
            }
            return null;
        } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException e2) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Unknown USB reset method %s", str), e2);
        }
    }

    public static final boolean j(android.graphics.Rect rect) {
        return (rect.left == 0 && rect.right == 0 && rect.top == 0 && rect.bottom == 0) ? false : true;
    }

    public static final boolean k(android.os.UserManager userManager) {
        return defpackage.c.a() && userManager.isPrivateProfile();
    }

    public static final defpackage.dfb l(java.lang.String str) {
        str.getClass();
        return new defpackage.dfb(str);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x0139  */
    /* JADX WARN: Code duplicated, block: B:95:0x013d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0173  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a2  */
    public static final void m(boolean z, defpackage.cgf cgfVar, defpackage.atb atbVar, defpackage.ath athVar, defpackage.cfy cfyVar, defpackage.cft cftVar, defpackage.affh affhVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        defpackage.atb atbVar2;
        int i5;
        int i6;
        defpackage.ath athVar2;
        int i7;
        int i8;
        defpackage.cfy cfyVar2;
        int i9;
        int i10;
        defpackage.cft cftVar2;
        int i11;
        int i12;
        int i13;
        boolean z2;
        defpackage.cgf cgfVar3;
        defpackage.ath athVar3;
        defpackage.bve bveVar2;
        defpackage.atb atbVar3;
        defpackage.cfy cfyVar3;
        defpackage.cft cftVar3;
        defpackage.bxl bxlVarJ;
        int i14;
        int i15;
        defpackage.cgf cgfVar4;
        int i16;
        int i17;
        defpackage.bve bveVar3;
        defpackage.bwc bwcVar;
        defpackage.afer aferVar;
        defpackage.bwc bwcVar2;
        defpackage.afer aferVar2;
        int i18;
        affhVar.getClass();
        int i19 = i & 6;
        defpackage.bve bveVarC = bveVar.c(564358900);
        if (i19 == 0) {
            i3 = (true != bveVarC.D(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i20 = i2 & 2;
        if (i20 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    atbVar2 = atbVar;
                    if (true != bveVarC.C(atbVar2)) {
                        i5 = 128;
                    } else {
                        i5 = 256;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        athVar2 = athVar;
                        if (true != bveVarC.C(athVar2)) {
                            i7 = 1024;
                        } else {
                            i7 = 2048;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            cfyVar2 = cfyVar;
                            if (true != bveVarC.C(cfyVar2)) {
                                i9 = 8192;
                            } else {
                                i9 = 16384;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 32;
                        if (i10 != 0) {
                            i3 |= 196608;
                            cftVar2 = cftVar;
                        } else if ((196608 & i) == 0) {
                            cftVar2 = cftVar;
                            int i21 = i3;
                            if (true != bveVarC.C(cftVar2)) {
                                i11 = 65536;
                            } else {
                                i11 = 131072;
                            }
                            i3 = i21 | i11;
                        } else {
                            cftVar2 = cftVar;
                        }
                        i12 = i3;
                        if ((i & 1572864) == 0) {
                            if (true != bveVarC.E(affhVar)) {
                                i18 = 524288;
                            } else {
                                i18 = 1048576;
                            }
                            i3 = i12 | i18;
                        }
                        i13 = i3;
                        if ((i3 & 599187) != 599186) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (bveVarC.I(z2, i13 & 1)) {
                            int i22 = i13 >> 15;
                            i14 = i13 >> 6;
                            i15 = i13 >> 3;
                            if (i20 != 0) {
                                cgfVar4 = defpackage.cgf.e;
                            } else {
                                cgfVar4 = cgfVar2;
                            }
                            if (i4 != 0) {
                                atbVar2 = defpackage.ati.a;
                            }
                            if (i6 != 0) {
                                athVar2 = defpackage.ati.c;
                            }
                            if (i8 != 0) {
                                cfyVar2 = defpackage.cfs.m;
                            }
                            if (i10 != 0) {
                                cftVar2 = defpackage.cfs.j;
                            }
                            i16 = i15 & 14;
                            i17 = i22 & 112;
                            if (z) {
                                bveVarC.v(-1980583059);
                                defpackage.cty ctyVarA = defpackage.atu.a(athVar2, cftVar2, bveVarC, ((((i14 & 112) | i16) | ((i13 >> 9) & 896)) >> 3) & 126);
                                bwcVar2 = (defpackage.bwc) bveVarC;
                                bveVar3 = bveVarC;
                                int iF = defpackage.a.f(bwcVar2.u);
                                defpackage.cdd cddVarAh = bwcVar2.ah();
                                defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar3, cgfVar4);
                                aferVar2 = defpackage.cwl.a;
                                bveVar3.w();
                                if (bwcVar2.t) {
                                    bveVar3.j(aferVar2);
                                } else {
                                    bveVar3.y();
                                }
                                defpackage.byw.c(bveVar3, ctyVarA, defpackage.cwl.e);
                                defpackage.byw.c(bveVar3, cddVarAh, defpackage.cwl.d);
                                defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                                defpackage.byw.b(bveVar3, defpackage.cwl.g);
                                defpackage.byw.c(bveVar3, cgfVarN, defpackage.cwl.c);
                                affhVar.invoke(new tdt(), bveVar3, java.lang.Integer.valueOf(i17));
                                bwcVar2.Y(true);
                                bwcVar2.Y(false);
                            } else {
                                bveVar3 = bveVarC;
                                bveVar3.v(-1980481100);
                                defpackage.cty ctyVarA2 = defpackage.awb.a(atbVar2, cfyVar2, bveVar3, (((i14 & 896) | (i15 & 126)) >> 3) & 126);
                                bwcVar = (defpackage.bwc) bveVar3;
                                int iF2 = defpackage.a.f(bwcVar.u);
                                defpackage.cdd cddVarAh2 = bwcVar.ah();
                                defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVar3, cgfVar4);
                                aferVar = defpackage.cwl.a;
                                bveVar3.w();
                                if (bwcVar.t) {
                                    bveVar3.j(aferVar);
                                } else {
                                    bveVar3.y();
                                }
                                defpackage.byw.c(bveVar3, ctyVarA2, defpackage.cwl.e);
                                defpackage.byw.c(bveVar3, cddVarAh2, defpackage.cwl.d);
                                defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF2), defpackage.cwl.f);
                                defpackage.byw.b(bveVar3, defpackage.cwl.g);
                                defpackage.byw.c(bveVar3, cgfVarN2, defpackage.cwl.c);
                                affhVar.invoke(new tdw(defpackage.awe.a), bveVar3, java.lang.Integer.valueOf(i17));
                                bwcVar.Y(true);
                                bwcVar.Y(false);
                            }
                            cgfVar3 = cgfVar4;
                            athVar3 = athVar2;
                            bveVar2 = bveVar3;
                            cfyVar3 = cfyVar2;
                            cftVar3 = cftVar2;
                            atbVar3 = atbVar2;
                        } else {
                            bveVarC.s();
                            cgfVar3 = cgfVar2;
                            athVar3 = athVar2;
                            bveVar2 = bveVarC;
                            atbVar3 = atbVar2;
                            cfyVar3 = cfyVar2;
                            cftVar3 = cftVar2;
                        }
                        bxlVarJ = bveVar2.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new tdu(z, cgfVar3, atbVar3, athVar3, cfyVar3, cftVar3, affhVar, i, i2);
                        }
                    }
                    i3 |= 24576;
                    cfyVar2 = cfyVar;
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                        cftVar2 = cftVar;
                    } else if ((196608 & i) == 0) {
                        cftVar2 = cftVar;
                        int i23 = i3;
                        if (true != bveVarC.C(cftVar2)) {
                            i11 = 65536;
                        } else {
                            i11 = 131072;
                        }
                        i3 = i23 | i11;
                    } else {
                        cftVar2 = cftVar;
                    }
                    i12 = i3;
                    if ((i & 1572864) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i18 = 524288;
                        } else {
                            i18 = 1048576;
                        }
                        i3 = i12 | i18;
                    }
                    i13 = i3;
                    if ((i3 & 599187) != 599186) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bveVarC.I(z2, i13 & 1)) {
                        int i24 = i13 >> 15;
                        i14 = i13 >> 6;
                        i15 = i13 >> 3;
                        if (i20 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            atbVar2 = defpackage.ati.a;
                        }
                        if (i6 != 0) {
                            athVar2 = defpackage.ati.c;
                        }
                        if (i8 != 0) {
                            cfyVar2 = defpackage.cfs.m;
                        }
                        if (i10 != 0) {
                            cftVar2 = defpackage.cfs.j;
                        }
                        i16 = i15 & 14;
                        i17 = i24 & 112;
                        if (z) {
                            bveVarC.v(-1980583059);
                            defpackage.cty ctyVarA3 = defpackage.atu.a(athVar2, cftVar2, bveVarC, ((((i14 & 112) | i16) | ((i13 >> 9) & 896)) >> 3) & 126);
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            bveVar3 = bveVarC;
                            int iF3 = defpackage.a.f(bwcVar2.u);
                            defpackage.cdd cddVarAh3 = bwcVar2.ah();
                            defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVar3, cgfVar4);
                            aferVar2 = defpackage.cwl.a;
                            bveVar3.w();
                            if (bwcVar2.t) {
                                bveVar3.j(aferVar2);
                            } else {
                                bveVar3.y();
                            }
                            defpackage.byw.c(bveVar3, ctyVarA3, defpackage.cwl.e);
                            defpackage.byw.c(bveVar3, cddVarAh3, defpackage.cwl.d);
                            defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF3), defpackage.cwl.f);
                            defpackage.byw.b(bveVar3, defpackage.cwl.g);
                            defpackage.byw.c(bveVar3, cgfVarN3, defpackage.cwl.c);
                            affhVar.invoke(new tdt(), bveVar3, java.lang.Integer.valueOf(i17));
                            bwcVar2.Y(true);
                            bwcVar2.Y(false);
                        } else {
                            bveVar3 = bveVarC;
                            bveVar3.v(-1980481100);
                            defpackage.cty ctyVarA4 = defpackage.awb.a(atbVar2, cfyVar2, bveVar3, (((i14 & 896) | (i15 & 126)) >> 3) & 126);
                            bwcVar = (defpackage.bwc) bveVar3;
                            int iF4 = defpackage.a.f(bwcVar.u);
                            defpackage.cdd cddVarAh4 = bwcVar.ah();
                            defpackage.cgf cgfVarN4 = defpackage.bzo.n(bveVar3, cgfVar4);
                            aferVar = defpackage.cwl.a;
                            bveVar3.w();
                            if (bwcVar.t) {
                                bveVar3.j(aferVar);
                            } else {
                                bveVar3.y();
                            }
                            defpackage.byw.c(bveVar3, ctyVarA4, defpackage.cwl.e);
                            defpackage.byw.c(bveVar3, cddVarAh4, defpackage.cwl.d);
                            defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF4), defpackage.cwl.f);
                            defpackage.byw.b(bveVar3, defpackage.cwl.g);
                            defpackage.byw.c(bveVar3, cgfVarN4, defpackage.cwl.c);
                            affhVar.invoke(new tdw(defpackage.awe.a), bveVar3, java.lang.Integer.valueOf(i17));
                            bwcVar.Y(true);
                            bwcVar.Y(false);
                        }
                        cgfVar3 = cgfVar4;
                        athVar3 = athVar2;
                        bveVar2 = bveVar3;
                        cfyVar3 = cfyVar2;
                        cftVar3 = cftVar2;
                        atbVar3 = atbVar2;
                    } else {
                        bveVarC.s();
                        cgfVar3 = cgfVar2;
                        athVar3 = athVar2;
                        bveVar2 = bveVarC;
                        atbVar3 = atbVar2;
                        cfyVar3 = cfyVar2;
                        cftVar3 = cftVar2;
                    }
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new tdu(z, cgfVar3, atbVar3, athVar3, cfyVar3, cftVar3, affhVar, i, i2);
                    }
                }
                i3 |= 3072;
                athVar2 = athVar;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        cfyVar2 = cfyVar;
                        if (true != bveVarC.C(cfyVar2)) {
                            i9 = 8192;
                        } else {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                        cftVar2 = cftVar;
                    } else if ((196608 & i) == 0) {
                        cftVar2 = cftVar;
                        int i25 = i3;
                        if (true != bveVarC.C(cftVar2)) {
                            i11 = 65536;
                        } else {
                            i11 = 131072;
                        }
                        i3 = i25 | i11;
                    } else {
                        cftVar2 = cftVar;
                    }
                    i12 = i3;
                    if ((i & 1572864) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i18 = 524288;
                        } else {
                            i18 = 1048576;
                        }
                        i3 = i12 | i18;
                    }
                    i13 = i3;
                    if ((i3 & 599187) != 599186) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bveVarC.I(z2, i13 & 1)) {
                        int i26 = i13 >> 15;
                        i14 = i13 >> 6;
                        i15 = i13 >> 3;
                        if (i20 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            atbVar2 = defpackage.ati.a;
                        }
                        if (i6 != 0) {
                            athVar2 = defpackage.ati.c;
                        }
                        if (i8 != 0) {
                            cfyVar2 = defpackage.cfs.m;
                        }
                        if (i10 != 0) {
                            cftVar2 = defpackage.cfs.j;
                        }
                        i16 = i15 & 14;
                        i17 = i26 & 112;
                        if (z) {
                            bveVarC.v(-1980583059);
                            defpackage.cty ctyVarA5 = defpackage.atu.a(athVar2, cftVar2, bveVarC, ((((i14 & 112) | i16) | ((i13 >> 9) & 896)) >> 3) & 126);
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            bveVar3 = bveVarC;
                            int iF5 = defpackage.a.f(bwcVar2.u);
                            defpackage.cdd cddVarAh5 = bwcVar2.ah();
                            defpackage.cgf cgfVarN5 = defpackage.bzo.n(bveVar3, cgfVar4);
                            aferVar2 = defpackage.cwl.a;
                            bveVar3.w();
                            if (bwcVar2.t) {
                                bveVar3.j(aferVar2);
                            } else {
                                bveVar3.y();
                            }
                            defpackage.byw.c(bveVar3, ctyVarA5, defpackage.cwl.e);
                            defpackage.byw.c(bveVar3, cddVarAh5, defpackage.cwl.d);
                            defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF5), defpackage.cwl.f);
                            defpackage.byw.b(bveVar3, defpackage.cwl.g);
                            defpackage.byw.c(bveVar3, cgfVarN5, defpackage.cwl.c);
                            affhVar.invoke(new tdt(), bveVar3, java.lang.Integer.valueOf(i17));
                            bwcVar2.Y(true);
                            bwcVar2.Y(false);
                        } else {
                            bveVar3 = bveVarC;
                            bveVar3.v(-1980481100);
                            defpackage.cty ctyVarA6 = defpackage.awb.a(atbVar2, cfyVar2, bveVar3, (((i14 & 896) | (i15 & 126)) >> 3) & 126);
                            bwcVar = (defpackage.bwc) bveVar3;
                            int iF6 = defpackage.a.f(bwcVar.u);
                            defpackage.cdd cddVarAh6 = bwcVar.ah();
                            defpackage.cgf cgfVarN6 = defpackage.bzo.n(bveVar3, cgfVar4);
                            aferVar = defpackage.cwl.a;
                            bveVar3.w();
                            if (bwcVar.t) {
                                bveVar3.j(aferVar);
                            } else {
                                bveVar3.y();
                            }
                            defpackage.byw.c(bveVar3, ctyVarA6, defpackage.cwl.e);
                            defpackage.byw.c(bveVar3, cddVarAh6, defpackage.cwl.d);
                            defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF6), defpackage.cwl.f);
                            defpackage.byw.b(bveVar3, defpackage.cwl.g);
                            defpackage.byw.c(bveVar3, cgfVarN6, defpackage.cwl.c);
                            affhVar.invoke(new tdw(defpackage.awe.a), bveVar3, java.lang.Integer.valueOf(i17));
                            bwcVar.Y(true);
                            bwcVar.Y(false);
                        }
                        cgfVar3 = cgfVar4;
                        athVar3 = athVar2;
                        bveVar2 = bveVar3;
                        cfyVar3 = cfyVar2;
                        cftVar3 = cftVar2;
                        atbVar3 = atbVar2;
                    } else {
                        bveVarC.s();
                        cgfVar3 = cgfVar2;
                        athVar3 = athVar2;
                        bveVar2 = bveVarC;
                        atbVar3 = atbVar2;
                        cfyVar3 = cfyVar2;
                        cftVar3 = cftVar2;
                    }
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new tdu(z, cgfVar3, atbVar3, athVar3, cfyVar3, cftVar3, affhVar, i, i2);
                    }
                }
                i3 |= 24576;
                cfyVar2 = cfyVar;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    cftVar2 = cftVar;
                } else if ((196608 & i) == 0) {
                    cftVar2 = cftVar;
                    int i27 = i3;
                    if (true != bveVarC.C(cftVar2)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 = i27 | i11;
                } else {
                    cftVar2 = cftVar;
                }
                i12 = i3;
                if ((i & 1572864) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i3 = i12 | i18;
                }
                i13 = i3;
                if ((i3 & 599187) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bveVarC.I(z2, i13 & 1)) {
                    int i28 = i13 >> 15;
                    i14 = i13 >> 6;
                    i15 = i13 >> 3;
                    if (i20 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        atbVar2 = defpackage.ati.a;
                    }
                    if (i6 != 0) {
                        athVar2 = defpackage.ati.c;
                    }
                    if (i8 != 0) {
                        cfyVar2 = defpackage.cfs.m;
                    }
                    if (i10 != 0) {
                        cftVar2 = defpackage.cfs.j;
                    }
                    i16 = i15 & 14;
                    i17 = i28 & 112;
                    if (z) {
                        bveVarC.v(-1980583059);
                        defpackage.cty ctyVarA7 = defpackage.atu.a(athVar2, cftVar2, bveVarC, ((((i14 & 112) | i16) | ((i13 >> 9) & 896)) >> 3) & 126);
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        bveVar3 = bveVarC;
                        int iF7 = defpackage.a.f(bwcVar2.u);
                        defpackage.cdd cddVarAh7 = bwcVar2.ah();
                        defpackage.cgf cgfVarN7 = defpackage.bzo.n(bveVar3, cgfVar4);
                        aferVar2 = defpackage.cwl.a;
                        bveVar3.w();
                        if (bwcVar2.t) {
                            bveVar3.j(aferVar2);
                        } else {
                            bveVar3.y();
                        }
                        defpackage.byw.c(bveVar3, ctyVarA7, defpackage.cwl.e);
                        defpackage.byw.c(bveVar3, cddVarAh7, defpackage.cwl.d);
                        defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF7), defpackage.cwl.f);
                        defpackage.byw.b(bveVar3, defpackage.cwl.g);
                        defpackage.byw.c(bveVar3, cgfVarN7, defpackage.cwl.c);
                        affhVar.invoke(new tdt(), bveVar3, java.lang.Integer.valueOf(i17));
                        bwcVar2.Y(true);
                        bwcVar2.Y(false);
                    } else {
                        bveVar3 = bveVarC;
                        bveVar3.v(-1980481100);
                        defpackage.cty ctyVarA8 = defpackage.awb.a(atbVar2, cfyVar2, bveVar3, (((i14 & 896) | (i15 & 126)) >> 3) & 126);
                        bwcVar = (defpackage.bwc) bveVar3;
                        int iF8 = defpackage.a.f(bwcVar.u);
                        defpackage.cdd cddVarAh8 = bwcVar.ah();
                        defpackage.cgf cgfVarN8 = defpackage.bzo.n(bveVar3, cgfVar4);
                        aferVar = defpackage.cwl.a;
                        bveVar3.w();
                        if (bwcVar.t) {
                            bveVar3.j(aferVar);
                        } else {
                            bveVar3.y();
                        }
                        defpackage.byw.c(bveVar3, ctyVarA8, defpackage.cwl.e);
                        defpackage.byw.c(bveVar3, cddVarAh8, defpackage.cwl.d);
                        defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF8), defpackage.cwl.f);
                        defpackage.byw.b(bveVar3, defpackage.cwl.g);
                        defpackage.byw.c(bveVar3, cgfVarN8, defpackage.cwl.c);
                        affhVar.invoke(new tdw(defpackage.awe.a), bveVar3, java.lang.Integer.valueOf(i17));
                        bwcVar.Y(true);
                        bwcVar.Y(false);
                    }
                    cgfVar3 = cgfVar4;
                    athVar3 = athVar2;
                    bveVar2 = bveVar3;
                    cfyVar3 = cfyVar2;
                    cftVar3 = cftVar2;
                    atbVar3 = atbVar2;
                } else {
                    bveVarC.s();
                    cgfVar3 = cgfVar2;
                    athVar3 = athVar2;
                    bveVar2 = bveVarC;
                    atbVar3 = atbVar2;
                    cfyVar3 = cfyVar2;
                    cftVar3 = cftVar2;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new tdu(z, cgfVar3, atbVar3, athVar3, cfyVar3, cftVar3, affhVar, i, i2);
                }
            }
            i3 |= 384;
            atbVar2 = atbVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    athVar2 = athVar;
                    if (true != bveVarC.C(athVar2)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        cfyVar2 = cfyVar;
                        if (true != bveVarC.C(cfyVar2)) {
                            i9 = 8192;
                        } else {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                        cftVar2 = cftVar;
                    } else if ((196608 & i) == 0) {
                        cftVar2 = cftVar;
                        int i29 = i3;
                        if (true != bveVarC.C(cftVar2)) {
                            i11 = 65536;
                        } else {
                            i11 = 131072;
                        }
                        i3 = i29 | i11;
                    } else {
                        cftVar2 = cftVar;
                    }
                    i12 = i3;
                    if ((i & 1572864) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i18 = 524288;
                        } else {
                            i18 = 1048576;
                        }
                        i3 = i12 | i18;
                    }
                    i13 = i3;
                    if ((i3 & 599187) != 599186) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bveVarC.I(z2, i13 & 1)) {
                        int i210 = i13 >> 15;
                        i14 = i13 >> 6;
                        i15 = i13 >> 3;
                        if (i20 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            atbVar2 = defpackage.ati.a;
                        }
                        if (i6 != 0) {
                            athVar2 = defpackage.ati.c;
                        }
                        if (i8 != 0) {
                            cfyVar2 = defpackage.cfs.m;
                        }
                        if (i10 != 0) {
                            cftVar2 = defpackage.cfs.j;
                        }
                        i16 = i15 & 14;
                        i17 = i210 & 112;
                        if (z) {
                            bveVarC.v(-1980583059);
                            defpackage.cty ctyVarA9 = defpackage.atu.a(athVar2, cftVar2, bveVarC, ((((i14 & 112) | i16) | ((i13 >> 9) & 896)) >> 3) & 126);
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            bveVar3 = bveVarC;
                            int iF9 = defpackage.a.f(bwcVar2.u);
                            defpackage.cdd cddVarAh9 = bwcVar2.ah();
                            defpackage.cgf cgfVarN9 = defpackage.bzo.n(bveVar3, cgfVar4);
                            aferVar2 = defpackage.cwl.a;
                            bveVar3.w();
                            if (bwcVar2.t) {
                                bveVar3.j(aferVar2);
                            } else {
                                bveVar3.y();
                            }
                            defpackage.byw.c(bveVar3, ctyVarA9, defpackage.cwl.e);
                            defpackage.byw.c(bveVar3, cddVarAh9, defpackage.cwl.d);
                            defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF9), defpackage.cwl.f);
                            defpackage.byw.b(bveVar3, defpackage.cwl.g);
                            defpackage.byw.c(bveVar3, cgfVarN9, defpackage.cwl.c);
                            affhVar.invoke(new tdt(), bveVar3, java.lang.Integer.valueOf(i17));
                            bwcVar2.Y(true);
                            bwcVar2.Y(false);
                        } else {
                            bveVar3 = bveVarC;
                            bveVar3.v(-1980481100);
                            defpackage.cty ctyVarA10 = defpackage.awb.a(atbVar2, cfyVar2, bveVar3, (((i14 & 896) | (i15 & 126)) >> 3) & 126);
                            bwcVar = (defpackage.bwc) bveVar3;
                            int iF10 = defpackage.a.f(bwcVar.u);
                            defpackage.cdd cddVarAh10 = bwcVar.ah();
                            defpackage.cgf cgfVarN10 = defpackage.bzo.n(bveVar3, cgfVar4);
                            aferVar = defpackage.cwl.a;
                            bveVar3.w();
                            if (bwcVar.t) {
                                bveVar3.j(aferVar);
                            } else {
                                bveVar3.y();
                            }
                            defpackage.byw.c(bveVar3, ctyVarA10, defpackage.cwl.e);
                            defpackage.byw.c(bveVar3, cddVarAh10, defpackage.cwl.d);
                            defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF10), defpackage.cwl.f);
                            defpackage.byw.b(bveVar3, defpackage.cwl.g);
                            defpackage.byw.c(bveVar3, cgfVarN10, defpackage.cwl.c);
                            affhVar.invoke(new tdw(defpackage.awe.a), bveVar3, java.lang.Integer.valueOf(i17));
                            bwcVar.Y(true);
                            bwcVar.Y(false);
                        }
                        cgfVar3 = cgfVar4;
                        athVar3 = athVar2;
                        bveVar2 = bveVar3;
                        cfyVar3 = cfyVar2;
                        cftVar3 = cftVar2;
                        atbVar3 = atbVar2;
                    } else {
                        bveVarC.s();
                        cgfVar3 = cgfVar2;
                        athVar3 = athVar2;
                        bveVar2 = bveVarC;
                        atbVar3 = atbVar2;
                        cfyVar3 = cfyVar2;
                        cftVar3 = cftVar2;
                    }
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new tdu(z, cgfVar3, atbVar3, athVar3, cfyVar3, cftVar3, affhVar, i, i2);
                    }
                }
                i3 |= 24576;
                cfyVar2 = cfyVar;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    cftVar2 = cftVar;
                } else if ((196608 & i) == 0) {
                    cftVar2 = cftVar;
                    int i211 = i3;
                    if (true != bveVarC.C(cftVar2)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 = i211 | i11;
                } else {
                    cftVar2 = cftVar;
                }
                i12 = i3;
                if ((i & 1572864) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i3 = i12 | i18;
                }
                i13 = i3;
                if ((i3 & 599187) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bveVarC.I(z2, i13 & 1)) {
                    int i212 = i13 >> 15;
                    i14 = i13 >> 6;
                    i15 = i13 >> 3;
                    if (i20 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        atbVar2 = defpackage.ati.a;
                    }
                    if (i6 != 0) {
                        athVar2 = defpackage.ati.c;
                    }
                    if (i8 != 0) {
                        cfyVar2 = defpackage.cfs.m;
                    }
                    if (i10 != 0) {
                        cftVar2 = defpackage.cfs.j;
                    }
                    i16 = i15 & 14;
                    i17 = i212 & 112;
                    if (z) {
                        bveVarC.v(-1980583059);
                        defpackage.cty ctyVarA11 = defpackage.atu.a(athVar2, cftVar2, bveVarC, ((((i14 & 112) | i16) | ((i13 >> 9) & 896)) >> 3) & 126);
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        bveVar3 = bveVarC;
                        int iF11 = defpackage.a.f(bwcVar2.u);
                        defpackage.cdd cddVarAh11 = bwcVar2.ah();
                        defpackage.cgf cgfVarN11 = defpackage.bzo.n(bveVar3, cgfVar4);
                        aferVar2 = defpackage.cwl.a;
                        bveVar3.w();
                        if (bwcVar2.t) {
                            bveVar3.j(aferVar2);
                        } else {
                            bveVar3.y();
                        }
                        defpackage.byw.c(bveVar3, ctyVarA11, defpackage.cwl.e);
                        defpackage.byw.c(bveVar3, cddVarAh11, defpackage.cwl.d);
                        defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF11), defpackage.cwl.f);
                        defpackage.byw.b(bveVar3, defpackage.cwl.g);
                        defpackage.byw.c(bveVar3, cgfVarN11, defpackage.cwl.c);
                        affhVar.invoke(new tdt(), bveVar3, java.lang.Integer.valueOf(i17));
                        bwcVar2.Y(true);
                        bwcVar2.Y(false);
                    } else {
                        bveVar3 = bveVarC;
                        bveVar3.v(-1980481100);
                        defpackage.cty ctyVarA12 = defpackage.awb.a(atbVar2, cfyVar2, bveVar3, (((i14 & 896) | (i15 & 126)) >> 3) & 126);
                        bwcVar = (defpackage.bwc) bveVar3;
                        int iF12 = defpackage.a.f(bwcVar.u);
                        defpackage.cdd cddVarAh12 = bwcVar.ah();
                        defpackage.cgf cgfVarN12 = defpackage.bzo.n(bveVar3, cgfVar4);
                        aferVar = defpackage.cwl.a;
                        bveVar3.w();
                        if (bwcVar.t) {
                            bveVar3.j(aferVar);
                        } else {
                            bveVar3.y();
                        }
                        defpackage.byw.c(bveVar3, ctyVarA12, defpackage.cwl.e);
                        defpackage.byw.c(bveVar3, cddVarAh12, defpackage.cwl.d);
                        defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF12), defpackage.cwl.f);
                        defpackage.byw.b(bveVar3, defpackage.cwl.g);
                        defpackage.byw.c(bveVar3, cgfVarN12, defpackage.cwl.c);
                        affhVar.invoke(new tdw(defpackage.awe.a), bveVar3, java.lang.Integer.valueOf(i17));
                        bwcVar.Y(true);
                        bwcVar.Y(false);
                    }
                    cgfVar3 = cgfVar4;
                    athVar3 = athVar2;
                    bveVar2 = bveVar3;
                    cfyVar3 = cfyVar2;
                    cftVar3 = cftVar2;
                    atbVar3 = atbVar2;
                } else {
                    bveVarC.s();
                    cgfVar3 = cgfVar2;
                    athVar3 = athVar2;
                    bveVar2 = bveVarC;
                    atbVar3 = atbVar2;
                    cfyVar3 = cfyVar2;
                    cftVar3 = cftVar2;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new tdu(z, cgfVar3, atbVar3, athVar3, cfyVar3, cftVar3, affhVar, i, i2);
                }
            }
            i3 |= 3072;
            athVar2 = athVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    cfyVar2 = cfyVar;
                    if (true != bveVarC.C(cfyVar2)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    cftVar2 = cftVar;
                } else if ((196608 & i) == 0) {
                    cftVar2 = cftVar;
                    int i213 = i3;
                    if (true != bveVarC.C(cftVar2)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 = i213 | i11;
                } else {
                    cftVar2 = cftVar;
                }
                i12 = i3;
                if ((i & 1572864) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i3 = i12 | i18;
                }
                i13 = i3;
                if ((i3 & 599187) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bveVarC.I(z2, i13 & 1)) {
                    int i214 = i13 >> 15;
                    i14 = i13 >> 6;
                    i15 = i13 >> 3;
                    if (i20 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        atbVar2 = defpackage.ati.a;
                    }
                    if (i6 != 0) {
                        athVar2 = defpackage.ati.c;
                    }
                    if (i8 != 0) {
                        cfyVar2 = defpackage.cfs.m;
                    }
                    if (i10 != 0) {
                        cftVar2 = defpackage.cfs.j;
                    }
                    i16 = i15 & 14;
                    i17 = i214 & 112;
                    if (z) {
                        bveVarC.v(-1980583059);
                        defpackage.cty ctyVarA13 = defpackage.atu.a(athVar2, cftVar2, bveVarC, ((((i14 & 112) | i16) | ((i13 >> 9) & 896)) >> 3) & 126);
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        bveVar3 = bveVarC;
                        int iF13 = defpackage.a.f(bwcVar2.u);
                        defpackage.cdd cddVarAh13 = bwcVar2.ah();
                        defpackage.cgf cgfVarN13 = defpackage.bzo.n(bveVar3, cgfVar4);
                        aferVar2 = defpackage.cwl.a;
                        bveVar3.w();
                        if (bwcVar2.t) {
                            bveVar3.j(aferVar2);
                        } else {
                            bveVar3.y();
                        }
                        defpackage.byw.c(bveVar3, ctyVarA13, defpackage.cwl.e);
                        defpackage.byw.c(bveVar3, cddVarAh13, defpackage.cwl.d);
                        defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF13), defpackage.cwl.f);
                        defpackage.byw.b(bveVar3, defpackage.cwl.g);
                        defpackage.byw.c(bveVar3, cgfVarN13, defpackage.cwl.c);
                        affhVar.invoke(new tdt(), bveVar3, java.lang.Integer.valueOf(i17));
                        bwcVar2.Y(true);
                        bwcVar2.Y(false);
                    } else {
                        bveVar3 = bveVarC;
                        bveVar3.v(-1980481100);
                        defpackage.cty ctyVarA14 = defpackage.awb.a(atbVar2, cfyVar2, bveVar3, (((i14 & 896) | (i15 & 126)) >> 3) & 126);
                        bwcVar = (defpackage.bwc) bveVar3;
                        int iF14 = defpackage.a.f(bwcVar.u);
                        defpackage.cdd cddVarAh14 = bwcVar.ah();
                        defpackage.cgf cgfVarN14 = defpackage.bzo.n(bveVar3, cgfVar4);
                        aferVar = defpackage.cwl.a;
                        bveVar3.w();
                        if (bwcVar.t) {
                            bveVar3.j(aferVar);
                        } else {
                            bveVar3.y();
                        }
                        defpackage.byw.c(bveVar3, ctyVarA14, defpackage.cwl.e);
                        defpackage.byw.c(bveVar3, cddVarAh14, defpackage.cwl.d);
                        defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF14), defpackage.cwl.f);
                        defpackage.byw.b(bveVar3, defpackage.cwl.g);
                        defpackage.byw.c(bveVar3, cgfVarN14, defpackage.cwl.c);
                        affhVar.invoke(new tdw(defpackage.awe.a), bveVar3, java.lang.Integer.valueOf(i17));
                        bwcVar.Y(true);
                        bwcVar.Y(false);
                    }
                    cgfVar3 = cgfVar4;
                    athVar3 = athVar2;
                    bveVar2 = bveVar3;
                    cfyVar3 = cfyVar2;
                    cftVar3 = cftVar2;
                    atbVar3 = atbVar2;
                } else {
                    bveVarC.s();
                    cgfVar3 = cgfVar2;
                    athVar3 = athVar2;
                    bveVar2 = bveVarC;
                    atbVar3 = atbVar2;
                    cfyVar3 = cfyVar2;
                    cftVar3 = cftVar2;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new tdu(z, cgfVar3, atbVar3, athVar3, cfyVar3, cftVar3, affhVar, i, i2);
                }
            }
            i3 |= 24576;
            cfyVar2 = cfyVar;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
                cftVar2 = cftVar;
            } else if ((196608 & i) == 0) {
                cftVar2 = cftVar;
                int i215 = i3;
                if (true != bveVarC.C(cftVar2)) {
                    i11 = 65536;
                } else {
                    i11 = 131072;
                }
                i3 = i215 | i11;
            } else {
                cftVar2 = cftVar;
            }
            i12 = i3;
            if ((i & 1572864) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i18 = 524288;
                } else {
                    i18 = 1048576;
                }
                i3 = i12 | i18;
            }
            i13 = i3;
            if ((i3 & 599187) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bveVarC.I(z2, i13 & 1)) {
                int i216 = i13 >> 15;
                i14 = i13 >> 6;
                i15 = i13 >> 3;
                if (i20 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    atbVar2 = defpackage.ati.a;
                }
                if (i6 != 0) {
                    athVar2 = defpackage.ati.c;
                }
                if (i8 != 0) {
                    cfyVar2 = defpackage.cfs.m;
                }
                if (i10 != 0) {
                    cftVar2 = defpackage.cfs.j;
                }
                i16 = i15 & 14;
                i17 = i216 & 112;
                if (z) {
                    bveVarC.v(-1980583059);
                    defpackage.cty ctyVarA15 = defpackage.atu.a(athVar2, cftVar2, bveVarC, ((((i14 & 112) | i16) | ((i13 >> 9) & 896)) >> 3) & 126);
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    bveVar3 = bveVarC;
                    int iF15 = defpackage.a.f(bwcVar2.u);
                    defpackage.cdd cddVarAh15 = bwcVar2.ah();
                    defpackage.cgf cgfVarN15 = defpackage.bzo.n(bveVar3, cgfVar4);
                    aferVar2 = defpackage.cwl.a;
                    bveVar3.w();
                    if (bwcVar2.t) {
                        bveVar3.j(aferVar2);
                    } else {
                        bveVar3.y();
                    }
                    defpackage.byw.c(bveVar3, ctyVarA15, defpackage.cwl.e);
                    defpackage.byw.c(bveVar3, cddVarAh15, defpackage.cwl.d);
                    defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF15), defpackage.cwl.f);
                    defpackage.byw.b(bveVar3, defpackage.cwl.g);
                    defpackage.byw.c(bveVar3, cgfVarN15, defpackage.cwl.c);
                    affhVar.invoke(new tdt(), bveVar3, java.lang.Integer.valueOf(i17));
                    bwcVar2.Y(true);
                    bwcVar2.Y(false);
                } else {
                    bveVar3 = bveVarC;
                    bveVar3.v(-1980481100);
                    defpackage.cty ctyVarA16 = defpackage.awb.a(atbVar2, cfyVar2, bveVar3, (((i14 & 896) | (i15 & 126)) >> 3) & 126);
                    bwcVar = (defpackage.bwc) bveVar3;
                    int iF16 = defpackage.a.f(bwcVar.u);
                    defpackage.cdd cddVarAh16 = bwcVar.ah();
                    defpackage.cgf cgfVarN16 = defpackage.bzo.n(bveVar3, cgfVar4);
                    aferVar = defpackage.cwl.a;
                    bveVar3.w();
                    if (bwcVar.t) {
                        bveVar3.j(aferVar);
                    } else {
                        bveVar3.y();
                    }
                    defpackage.byw.c(bveVar3, ctyVarA16, defpackage.cwl.e);
                    defpackage.byw.c(bveVar3, cddVarAh16, defpackage.cwl.d);
                    defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF16), defpackage.cwl.f);
                    defpackage.byw.b(bveVar3, defpackage.cwl.g);
                    defpackage.byw.c(bveVar3, cgfVarN16, defpackage.cwl.c);
                    affhVar.invoke(new tdw(defpackage.awe.a), bveVar3, java.lang.Integer.valueOf(i17));
                    bwcVar.Y(true);
                    bwcVar.Y(false);
                }
                cgfVar3 = cgfVar4;
                athVar3 = athVar2;
                bveVar2 = bveVar3;
                cfyVar3 = cfyVar2;
                cftVar3 = cftVar2;
                atbVar3 = atbVar2;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
                athVar3 = athVar2;
                bveVar2 = bveVarC;
                atbVar3 = atbVar2;
                cfyVar3 = cfyVar2;
                cftVar3 = cftVar2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new tdu(z, cgfVar3, atbVar3, athVar3, cfyVar3, cftVar3, affhVar, i, i2);
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                atbVar2 = atbVar;
                if (true != bveVarC.C(atbVar2)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    athVar2 = athVar;
                    if (true != bveVarC.C(athVar2)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        cfyVar2 = cfyVar;
                        if (true != bveVarC.C(cfyVar2)) {
                            i9 = 8192;
                        } else {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                        cftVar2 = cftVar;
                    } else if ((196608 & i) == 0) {
                        cftVar2 = cftVar;
                        int i217 = i3;
                        if (true != bveVarC.C(cftVar2)) {
                            i11 = 65536;
                        } else {
                            i11 = 131072;
                        }
                        i3 = i217 | i11;
                    } else {
                        cftVar2 = cftVar;
                    }
                    i12 = i3;
                    if ((i & 1572864) == 0) {
                        if (true != bveVarC.E(affhVar)) {
                            i18 = 524288;
                        } else {
                            i18 = 1048576;
                        }
                        i3 = i12 | i18;
                    }
                    i13 = i3;
                    if ((i3 & 599187) != 599186) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bveVarC.I(z2, i13 & 1)) {
                        int i218 = i13 >> 15;
                        i14 = i13 >> 6;
                        i15 = i13 >> 3;
                        if (i20 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i4 != 0) {
                            atbVar2 = defpackage.ati.a;
                        }
                        if (i6 != 0) {
                            athVar2 = defpackage.ati.c;
                        }
                        if (i8 != 0) {
                            cfyVar2 = defpackage.cfs.m;
                        }
                        if (i10 != 0) {
                            cftVar2 = defpackage.cfs.j;
                        }
                        i16 = i15 & 14;
                        i17 = i218 & 112;
                        if (z) {
                            bveVarC.v(-1980583059);
                            defpackage.cty ctyVarA17 = defpackage.atu.a(athVar2, cftVar2, bveVarC, ((((i14 & 112) | i16) | ((i13 >> 9) & 896)) >> 3) & 126);
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            bveVar3 = bveVarC;
                            int iF17 = defpackage.a.f(bwcVar2.u);
                            defpackage.cdd cddVarAh17 = bwcVar2.ah();
                            defpackage.cgf cgfVarN17 = defpackage.bzo.n(bveVar3, cgfVar4);
                            aferVar2 = defpackage.cwl.a;
                            bveVar3.w();
                            if (bwcVar2.t) {
                                bveVar3.j(aferVar2);
                            } else {
                                bveVar3.y();
                            }
                            defpackage.byw.c(bveVar3, ctyVarA17, defpackage.cwl.e);
                            defpackage.byw.c(bveVar3, cddVarAh17, defpackage.cwl.d);
                            defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF17), defpackage.cwl.f);
                            defpackage.byw.b(bveVar3, defpackage.cwl.g);
                            defpackage.byw.c(bveVar3, cgfVarN17, defpackage.cwl.c);
                            affhVar.invoke(new tdt(), bveVar3, java.lang.Integer.valueOf(i17));
                            bwcVar2.Y(true);
                            bwcVar2.Y(false);
                        } else {
                            bveVar3 = bveVarC;
                            bveVar3.v(-1980481100);
                            defpackage.cty ctyVarA18 = defpackage.awb.a(atbVar2, cfyVar2, bveVar3, (((i14 & 896) | (i15 & 126)) >> 3) & 126);
                            bwcVar = (defpackage.bwc) bveVar3;
                            int iF18 = defpackage.a.f(bwcVar.u);
                            defpackage.cdd cddVarAh18 = bwcVar.ah();
                            defpackage.cgf cgfVarN18 = defpackage.bzo.n(bveVar3, cgfVar4);
                            aferVar = defpackage.cwl.a;
                            bveVar3.w();
                            if (bwcVar.t) {
                                bveVar3.j(aferVar);
                            } else {
                                bveVar3.y();
                            }
                            defpackage.byw.c(bveVar3, ctyVarA18, defpackage.cwl.e);
                            defpackage.byw.c(bveVar3, cddVarAh18, defpackage.cwl.d);
                            defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF18), defpackage.cwl.f);
                            defpackage.byw.b(bveVar3, defpackage.cwl.g);
                            defpackage.byw.c(bveVar3, cgfVarN18, defpackage.cwl.c);
                            affhVar.invoke(new tdw(defpackage.awe.a), bveVar3, java.lang.Integer.valueOf(i17));
                            bwcVar.Y(true);
                            bwcVar.Y(false);
                        }
                        cgfVar3 = cgfVar4;
                        athVar3 = athVar2;
                        bveVar2 = bveVar3;
                        cfyVar3 = cfyVar2;
                        cftVar3 = cftVar2;
                        atbVar3 = atbVar2;
                    } else {
                        bveVarC.s();
                        cgfVar3 = cgfVar2;
                        athVar3 = athVar2;
                        bveVar2 = bveVarC;
                        atbVar3 = atbVar2;
                        cfyVar3 = cfyVar2;
                        cftVar3 = cftVar2;
                    }
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new tdu(z, cgfVar3, atbVar3, athVar3, cfyVar3, cftVar3, affhVar, i, i2);
                    }
                }
                i3 |= 24576;
                cfyVar2 = cfyVar;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    cftVar2 = cftVar;
                } else if ((196608 & i) == 0) {
                    cftVar2 = cftVar;
                    int i219 = i3;
                    if (true != bveVarC.C(cftVar2)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 = i219 | i11;
                } else {
                    cftVar2 = cftVar;
                }
                i12 = i3;
                if ((i & 1572864) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i3 = i12 | i18;
                }
                i13 = i3;
                if ((i3 & 599187) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bveVarC.I(z2, i13 & 1)) {
                    int i2110 = i13 >> 15;
                    i14 = i13 >> 6;
                    i15 = i13 >> 3;
                    if (i20 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        atbVar2 = defpackage.ati.a;
                    }
                    if (i6 != 0) {
                        athVar2 = defpackage.ati.c;
                    }
                    if (i8 != 0) {
                        cfyVar2 = defpackage.cfs.m;
                    }
                    if (i10 != 0) {
                        cftVar2 = defpackage.cfs.j;
                    }
                    i16 = i15 & 14;
                    i17 = i2110 & 112;
                    if (z) {
                        bveVarC.v(-1980583059);
                        defpackage.cty ctyVarA19 = defpackage.atu.a(athVar2, cftVar2, bveVarC, ((((i14 & 112) | i16) | ((i13 >> 9) & 896)) >> 3) & 126);
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        bveVar3 = bveVarC;
                        int iF19 = defpackage.a.f(bwcVar2.u);
                        defpackage.cdd cddVarAh19 = bwcVar2.ah();
                        defpackage.cgf cgfVarN19 = defpackage.bzo.n(bveVar3, cgfVar4);
                        aferVar2 = defpackage.cwl.a;
                        bveVar3.w();
                        if (bwcVar2.t) {
                            bveVar3.j(aferVar2);
                        } else {
                            bveVar3.y();
                        }
                        defpackage.byw.c(bveVar3, ctyVarA19, defpackage.cwl.e);
                        defpackage.byw.c(bveVar3, cddVarAh19, defpackage.cwl.d);
                        defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF19), defpackage.cwl.f);
                        defpackage.byw.b(bveVar3, defpackage.cwl.g);
                        defpackage.byw.c(bveVar3, cgfVarN19, defpackage.cwl.c);
                        affhVar.invoke(new tdt(), bveVar3, java.lang.Integer.valueOf(i17));
                        bwcVar2.Y(true);
                        bwcVar2.Y(false);
                    } else {
                        bveVar3 = bveVarC;
                        bveVar3.v(-1980481100);
                        defpackage.cty ctyVarA110 = defpackage.awb.a(atbVar2, cfyVar2, bveVar3, (((i14 & 896) | (i15 & 126)) >> 3) & 126);
                        bwcVar = (defpackage.bwc) bveVar3;
                        int iF110 = defpackage.a.f(bwcVar.u);
                        defpackage.cdd cddVarAh110 = bwcVar.ah();
                        defpackage.cgf cgfVarN110 = defpackage.bzo.n(bveVar3, cgfVar4);
                        aferVar = defpackage.cwl.a;
                        bveVar3.w();
                        if (bwcVar.t) {
                            bveVar3.j(aferVar);
                        } else {
                            bveVar3.y();
                        }
                        defpackage.byw.c(bveVar3, ctyVarA110, defpackage.cwl.e);
                        defpackage.byw.c(bveVar3, cddVarAh110, defpackage.cwl.d);
                        defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF110), defpackage.cwl.f);
                        defpackage.byw.b(bveVar3, defpackage.cwl.g);
                        defpackage.byw.c(bveVar3, cgfVarN110, defpackage.cwl.c);
                        affhVar.invoke(new tdw(defpackage.awe.a), bveVar3, java.lang.Integer.valueOf(i17));
                        bwcVar.Y(true);
                        bwcVar.Y(false);
                    }
                    cgfVar3 = cgfVar4;
                    athVar3 = athVar2;
                    bveVar2 = bveVar3;
                    cfyVar3 = cfyVar2;
                    cftVar3 = cftVar2;
                    atbVar3 = atbVar2;
                } else {
                    bveVarC.s();
                    cgfVar3 = cgfVar2;
                    athVar3 = athVar2;
                    bveVar2 = bveVarC;
                    atbVar3 = atbVar2;
                    cfyVar3 = cfyVar2;
                    cftVar3 = cftVar2;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new tdu(z, cgfVar3, atbVar3, athVar3, cfyVar3, cftVar3, affhVar, i, i2);
                }
            }
            i3 |= 3072;
            athVar2 = athVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    cfyVar2 = cfyVar;
                    if (true != bveVarC.C(cfyVar2)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    cftVar2 = cftVar;
                } else if ((196608 & i) == 0) {
                    cftVar2 = cftVar;
                    int i2111 = i3;
                    if (true != bveVarC.C(cftVar2)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 = i2111 | i11;
                } else {
                    cftVar2 = cftVar;
                }
                i12 = i3;
                if ((i & 1572864) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i3 = i12 | i18;
                }
                i13 = i3;
                if ((i3 & 599187) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bveVarC.I(z2, i13 & 1)) {
                    int i2112 = i13 >> 15;
                    i14 = i13 >> 6;
                    i15 = i13 >> 3;
                    if (i20 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        atbVar2 = defpackage.ati.a;
                    }
                    if (i6 != 0) {
                        athVar2 = defpackage.ati.c;
                    }
                    if (i8 != 0) {
                        cfyVar2 = defpackage.cfs.m;
                    }
                    if (i10 != 0) {
                        cftVar2 = defpackage.cfs.j;
                    }
                    i16 = i15 & 14;
                    i17 = i2112 & 112;
                    if (z) {
                        bveVarC.v(-1980583059);
                        defpackage.cty ctyVarA111 = defpackage.atu.a(athVar2, cftVar2, bveVarC, ((((i14 & 112) | i16) | ((i13 >> 9) & 896)) >> 3) & 126);
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        bveVar3 = bveVarC;
                        int iF111 = defpackage.a.f(bwcVar2.u);
                        defpackage.cdd cddVarAh111 = bwcVar2.ah();
                        defpackage.cgf cgfVarN111 = defpackage.bzo.n(bveVar3, cgfVar4);
                        aferVar2 = defpackage.cwl.a;
                        bveVar3.w();
                        if (bwcVar2.t) {
                            bveVar3.j(aferVar2);
                        } else {
                            bveVar3.y();
                        }
                        defpackage.byw.c(bveVar3, ctyVarA111, defpackage.cwl.e);
                        defpackage.byw.c(bveVar3, cddVarAh111, defpackage.cwl.d);
                        defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF111), defpackage.cwl.f);
                        defpackage.byw.b(bveVar3, defpackage.cwl.g);
                        defpackage.byw.c(bveVar3, cgfVarN111, defpackage.cwl.c);
                        affhVar.invoke(new tdt(), bveVar3, java.lang.Integer.valueOf(i17));
                        bwcVar2.Y(true);
                        bwcVar2.Y(false);
                    } else {
                        bveVar3 = bveVarC;
                        bveVar3.v(-1980481100);
                        defpackage.cty ctyVarA112 = defpackage.awb.a(atbVar2, cfyVar2, bveVar3, (((i14 & 896) | (i15 & 126)) >> 3) & 126);
                        bwcVar = (defpackage.bwc) bveVar3;
                        int iF112 = defpackage.a.f(bwcVar.u);
                        defpackage.cdd cddVarAh112 = bwcVar.ah();
                        defpackage.cgf cgfVarN112 = defpackage.bzo.n(bveVar3, cgfVar4);
                        aferVar = defpackage.cwl.a;
                        bveVar3.w();
                        if (bwcVar.t) {
                            bveVar3.j(aferVar);
                        } else {
                            bveVar3.y();
                        }
                        defpackage.byw.c(bveVar3, ctyVarA112, defpackage.cwl.e);
                        defpackage.byw.c(bveVar3, cddVarAh112, defpackage.cwl.d);
                        defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF112), defpackage.cwl.f);
                        defpackage.byw.b(bveVar3, defpackage.cwl.g);
                        defpackage.byw.c(bveVar3, cgfVarN112, defpackage.cwl.c);
                        affhVar.invoke(new tdw(defpackage.awe.a), bveVar3, java.lang.Integer.valueOf(i17));
                        bwcVar.Y(true);
                        bwcVar.Y(false);
                    }
                    cgfVar3 = cgfVar4;
                    athVar3 = athVar2;
                    bveVar2 = bveVar3;
                    cfyVar3 = cfyVar2;
                    cftVar3 = cftVar2;
                    atbVar3 = atbVar2;
                } else {
                    bveVarC.s();
                    cgfVar3 = cgfVar2;
                    athVar3 = athVar2;
                    bveVar2 = bveVarC;
                    atbVar3 = atbVar2;
                    cfyVar3 = cfyVar2;
                    cftVar3 = cftVar2;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new tdu(z, cgfVar3, atbVar3, athVar3, cfyVar3, cftVar3, affhVar, i, i2);
                }
            }
            i3 |= 24576;
            cfyVar2 = cfyVar;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
                cftVar2 = cftVar;
            } else if ((196608 & i) == 0) {
                cftVar2 = cftVar;
                int i2113 = i3;
                if (true != bveVarC.C(cftVar2)) {
                    i11 = 65536;
                } else {
                    i11 = 131072;
                }
                i3 = i2113 | i11;
            } else {
                cftVar2 = cftVar;
            }
            i12 = i3;
            if ((i & 1572864) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i18 = 524288;
                } else {
                    i18 = 1048576;
                }
                i3 = i12 | i18;
            }
            i13 = i3;
            if ((i3 & 599187) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bveVarC.I(z2, i13 & 1)) {
                int i2114 = i13 >> 15;
                i14 = i13 >> 6;
                i15 = i13 >> 3;
                if (i20 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    atbVar2 = defpackage.ati.a;
                }
                if (i6 != 0) {
                    athVar2 = defpackage.ati.c;
                }
                if (i8 != 0) {
                    cfyVar2 = defpackage.cfs.m;
                }
                if (i10 != 0) {
                    cftVar2 = defpackage.cfs.j;
                }
                i16 = i15 & 14;
                i17 = i2114 & 112;
                if (z) {
                    bveVarC.v(-1980583059);
                    defpackage.cty ctyVarA113 = defpackage.atu.a(athVar2, cftVar2, bveVarC, ((((i14 & 112) | i16) | ((i13 >> 9) & 896)) >> 3) & 126);
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    bveVar3 = bveVarC;
                    int iF113 = defpackage.a.f(bwcVar2.u);
                    defpackage.cdd cddVarAh113 = bwcVar2.ah();
                    defpackage.cgf cgfVarN113 = defpackage.bzo.n(bveVar3, cgfVar4);
                    aferVar2 = defpackage.cwl.a;
                    bveVar3.w();
                    if (bwcVar2.t) {
                        bveVar3.j(aferVar2);
                    } else {
                        bveVar3.y();
                    }
                    defpackage.byw.c(bveVar3, ctyVarA113, defpackage.cwl.e);
                    defpackage.byw.c(bveVar3, cddVarAh113, defpackage.cwl.d);
                    defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF113), defpackage.cwl.f);
                    defpackage.byw.b(bveVar3, defpackage.cwl.g);
                    defpackage.byw.c(bveVar3, cgfVarN113, defpackage.cwl.c);
                    affhVar.invoke(new tdt(), bveVar3, java.lang.Integer.valueOf(i17));
                    bwcVar2.Y(true);
                    bwcVar2.Y(false);
                } else {
                    bveVar3 = bveVarC;
                    bveVar3.v(-1980481100);
                    defpackage.cty ctyVarA114 = defpackage.awb.a(atbVar2, cfyVar2, bveVar3, (((i14 & 896) | (i15 & 126)) >> 3) & 126);
                    bwcVar = (defpackage.bwc) bveVar3;
                    int iF114 = defpackage.a.f(bwcVar.u);
                    defpackage.cdd cddVarAh114 = bwcVar.ah();
                    defpackage.cgf cgfVarN114 = defpackage.bzo.n(bveVar3, cgfVar4);
                    aferVar = defpackage.cwl.a;
                    bveVar3.w();
                    if (bwcVar.t) {
                        bveVar3.j(aferVar);
                    } else {
                        bveVar3.y();
                    }
                    defpackage.byw.c(bveVar3, ctyVarA114, defpackage.cwl.e);
                    defpackage.byw.c(bveVar3, cddVarAh114, defpackage.cwl.d);
                    defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF114), defpackage.cwl.f);
                    defpackage.byw.b(bveVar3, defpackage.cwl.g);
                    defpackage.byw.c(bveVar3, cgfVarN114, defpackage.cwl.c);
                    affhVar.invoke(new tdw(defpackage.awe.a), bveVar3, java.lang.Integer.valueOf(i17));
                    bwcVar.Y(true);
                    bwcVar.Y(false);
                }
                cgfVar3 = cgfVar4;
                athVar3 = athVar2;
                bveVar2 = bveVar3;
                cfyVar3 = cfyVar2;
                cftVar3 = cftVar2;
                atbVar3 = atbVar2;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
                athVar3 = athVar2;
                bveVar2 = bveVarC;
                atbVar3 = atbVar2;
                cfyVar3 = cfyVar2;
                cftVar3 = cftVar2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new tdu(z, cgfVar3, atbVar3, athVar3, cfyVar3, cftVar3, affhVar, i, i2);
            }
        }
        i3 |= 384;
        atbVar2 = atbVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                athVar2 = athVar;
                if (true != bveVarC.C(athVar2)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    cfyVar2 = cfyVar;
                    if (true != bveVarC.C(cfyVar2)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    cftVar2 = cftVar;
                } else if ((196608 & i) == 0) {
                    cftVar2 = cftVar;
                    int i2115 = i3;
                    if (true != bveVarC.C(cftVar2)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 = i2115 | i11;
                } else {
                    cftVar2 = cftVar;
                }
                i12 = i3;
                if ((i & 1572864) == 0) {
                    if (true != bveVarC.E(affhVar)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i3 = i12 | i18;
                }
                i13 = i3;
                if ((i3 & 599187) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bveVarC.I(z2, i13 & 1)) {
                    int i2116 = i13 >> 15;
                    i14 = i13 >> 6;
                    i15 = i13 >> 3;
                    if (i20 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i4 != 0) {
                        atbVar2 = defpackage.ati.a;
                    }
                    if (i6 != 0) {
                        athVar2 = defpackage.ati.c;
                    }
                    if (i8 != 0) {
                        cfyVar2 = defpackage.cfs.m;
                    }
                    if (i10 != 0) {
                        cftVar2 = defpackage.cfs.j;
                    }
                    i16 = i15 & 14;
                    i17 = i2116 & 112;
                    if (z) {
                        bveVarC.v(-1980583059);
                        defpackage.cty ctyVarA115 = defpackage.atu.a(athVar2, cftVar2, bveVarC, ((((i14 & 112) | i16) | ((i13 >> 9) & 896)) >> 3) & 126);
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        bveVar3 = bveVarC;
                        int iF115 = defpackage.a.f(bwcVar2.u);
                        defpackage.cdd cddVarAh115 = bwcVar2.ah();
                        defpackage.cgf cgfVarN115 = defpackage.bzo.n(bveVar3, cgfVar4);
                        aferVar2 = defpackage.cwl.a;
                        bveVar3.w();
                        if (bwcVar2.t) {
                            bveVar3.j(aferVar2);
                        } else {
                            bveVar3.y();
                        }
                        defpackage.byw.c(bveVar3, ctyVarA115, defpackage.cwl.e);
                        defpackage.byw.c(bveVar3, cddVarAh115, defpackage.cwl.d);
                        defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF115), defpackage.cwl.f);
                        defpackage.byw.b(bveVar3, defpackage.cwl.g);
                        defpackage.byw.c(bveVar3, cgfVarN115, defpackage.cwl.c);
                        affhVar.invoke(new tdt(), bveVar3, java.lang.Integer.valueOf(i17));
                        bwcVar2.Y(true);
                        bwcVar2.Y(false);
                    } else {
                        bveVar3 = bveVarC;
                        bveVar3.v(-1980481100);
                        defpackage.cty ctyVarA116 = defpackage.awb.a(atbVar2, cfyVar2, bveVar3, (((i14 & 896) | (i15 & 126)) >> 3) & 126);
                        bwcVar = (defpackage.bwc) bveVar3;
                        int iF116 = defpackage.a.f(bwcVar.u);
                        defpackage.cdd cddVarAh116 = bwcVar.ah();
                        defpackage.cgf cgfVarN116 = defpackage.bzo.n(bveVar3, cgfVar4);
                        aferVar = defpackage.cwl.a;
                        bveVar3.w();
                        if (bwcVar.t) {
                            bveVar3.j(aferVar);
                        } else {
                            bveVar3.y();
                        }
                        defpackage.byw.c(bveVar3, ctyVarA116, defpackage.cwl.e);
                        defpackage.byw.c(bveVar3, cddVarAh116, defpackage.cwl.d);
                        defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF116), defpackage.cwl.f);
                        defpackage.byw.b(bveVar3, defpackage.cwl.g);
                        defpackage.byw.c(bveVar3, cgfVarN116, defpackage.cwl.c);
                        affhVar.invoke(new tdw(defpackage.awe.a), bveVar3, java.lang.Integer.valueOf(i17));
                        bwcVar.Y(true);
                        bwcVar.Y(false);
                    }
                    cgfVar3 = cgfVar4;
                    athVar3 = athVar2;
                    bveVar2 = bveVar3;
                    cfyVar3 = cfyVar2;
                    cftVar3 = cftVar2;
                    atbVar3 = atbVar2;
                } else {
                    bveVarC.s();
                    cgfVar3 = cgfVar2;
                    athVar3 = athVar2;
                    bveVar2 = bveVarC;
                    atbVar3 = atbVar2;
                    cfyVar3 = cfyVar2;
                    cftVar3 = cftVar2;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new tdu(z, cgfVar3, atbVar3, athVar3, cfyVar3, cftVar3, affhVar, i, i2);
                }
            }
            i3 |= 24576;
            cfyVar2 = cfyVar;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
                cftVar2 = cftVar;
            } else if ((196608 & i) == 0) {
                cftVar2 = cftVar;
                int i2117 = i3;
                if (true != bveVarC.C(cftVar2)) {
                    i11 = 65536;
                } else {
                    i11 = 131072;
                }
                i3 = i2117 | i11;
            } else {
                cftVar2 = cftVar;
            }
            i12 = i3;
            if ((i & 1572864) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i18 = 524288;
                } else {
                    i18 = 1048576;
                }
                i3 = i12 | i18;
            }
            i13 = i3;
            if ((i3 & 599187) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bveVarC.I(z2, i13 & 1)) {
                int i2118 = i13 >> 15;
                i14 = i13 >> 6;
                i15 = i13 >> 3;
                if (i20 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    atbVar2 = defpackage.ati.a;
                }
                if (i6 != 0) {
                    athVar2 = defpackage.ati.c;
                }
                if (i8 != 0) {
                    cfyVar2 = defpackage.cfs.m;
                }
                if (i10 != 0) {
                    cftVar2 = defpackage.cfs.j;
                }
                i16 = i15 & 14;
                i17 = i2118 & 112;
                if (z) {
                    bveVarC.v(-1980583059);
                    defpackage.cty ctyVarA117 = defpackage.atu.a(athVar2, cftVar2, bveVarC, ((((i14 & 112) | i16) | ((i13 >> 9) & 896)) >> 3) & 126);
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    bveVar3 = bveVarC;
                    int iF117 = defpackage.a.f(bwcVar2.u);
                    defpackage.cdd cddVarAh117 = bwcVar2.ah();
                    defpackage.cgf cgfVarN117 = defpackage.bzo.n(bveVar3, cgfVar4);
                    aferVar2 = defpackage.cwl.a;
                    bveVar3.w();
                    if (bwcVar2.t) {
                        bveVar3.j(aferVar2);
                    } else {
                        bveVar3.y();
                    }
                    defpackage.byw.c(bveVar3, ctyVarA117, defpackage.cwl.e);
                    defpackage.byw.c(bveVar3, cddVarAh117, defpackage.cwl.d);
                    defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF117), defpackage.cwl.f);
                    defpackage.byw.b(bveVar3, defpackage.cwl.g);
                    defpackage.byw.c(bveVar3, cgfVarN117, defpackage.cwl.c);
                    affhVar.invoke(new tdt(), bveVar3, java.lang.Integer.valueOf(i17));
                    bwcVar2.Y(true);
                    bwcVar2.Y(false);
                } else {
                    bveVar3 = bveVarC;
                    bveVar3.v(-1980481100);
                    defpackage.cty ctyVarA118 = defpackage.awb.a(atbVar2, cfyVar2, bveVar3, (((i14 & 896) | (i15 & 126)) >> 3) & 126);
                    bwcVar = (defpackage.bwc) bveVar3;
                    int iF118 = defpackage.a.f(bwcVar.u);
                    defpackage.cdd cddVarAh118 = bwcVar.ah();
                    defpackage.cgf cgfVarN118 = defpackage.bzo.n(bveVar3, cgfVar4);
                    aferVar = defpackage.cwl.a;
                    bveVar3.w();
                    if (bwcVar.t) {
                        bveVar3.j(aferVar);
                    } else {
                        bveVar3.y();
                    }
                    defpackage.byw.c(bveVar3, ctyVarA118, defpackage.cwl.e);
                    defpackage.byw.c(bveVar3, cddVarAh118, defpackage.cwl.d);
                    defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF118), defpackage.cwl.f);
                    defpackage.byw.b(bveVar3, defpackage.cwl.g);
                    defpackage.byw.c(bveVar3, cgfVarN118, defpackage.cwl.c);
                    affhVar.invoke(new tdw(defpackage.awe.a), bveVar3, java.lang.Integer.valueOf(i17));
                    bwcVar.Y(true);
                    bwcVar.Y(false);
                }
                cgfVar3 = cgfVar4;
                athVar3 = athVar2;
                bveVar2 = bveVar3;
                cfyVar3 = cfyVar2;
                cftVar3 = cftVar2;
                atbVar3 = atbVar2;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
                athVar3 = athVar2;
                bveVar2 = bveVarC;
                atbVar3 = atbVar2;
                cfyVar3 = cfyVar2;
                cftVar3 = cftVar2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new tdu(z, cgfVar3, atbVar3, athVar3, cfyVar3, cftVar3, affhVar, i, i2);
            }
        }
        i3 |= 3072;
        athVar2 = athVar;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                cfyVar2 = cfyVar;
                if (true != bveVarC.C(cfyVar2)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
                cftVar2 = cftVar;
            } else if ((196608 & i) == 0) {
                cftVar2 = cftVar;
                int i2119 = i3;
                if (true != bveVarC.C(cftVar2)) {
                    i11 = 65536;
                } else {
                    i11 = 131072;
                }
                i3 = i2119 | i11;
            } else {
                cftVar2 = cftVar;
            }
            i12 = i3;
            if ((i & 1572864) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i18 = 524288;
                } else {
                    i18 = 1048576;
                }
                i3 = i12 | i18;
            }
            i13 = i3;
            if ((i3 & 599187) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bveVarC.I(z2, i13 & 1)) {
                int i21110 = i13 >> 15;
                i14 = i13 >> 6;
                i15 = i13 >> 3;
                if (i20 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i4 != 0) {
                    atbVar2 = defpackage.ati.a;
                }
                if (i6 != 0) {
                    athVar2 = defpackage.ati.c;
                }
                if (i8 != 0) {
                    cfyVar2 = defpackage.cfs.m;
                }
                if (i10 != 0) {
                    cftVar2 = defpackage.cfs.j;
                }
                i16 = i15 & 14;
                i17 = i21110 & 112;
                if (z) {
                    bveVarC.v(-1980583059);
                    defpackage.cty ctyVarA119 = defpackage.atu.a(athVar2, cftVar2, bveVarC, ((((i14 & 112) | i16) | ((i13 >> 9) & 896)) >> 3) & 126);
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    bveVar3 = bveVarC;
                    int iF119 = defpackage.a.f(bwcVar2.u);
                    defpackage.cdd cddVarAh119 = bwcVar2.ah();
                    defpackage.cgf cgfVarN119 = defpackage.bzo.n(bveVar3, cgfVar4);
                    aferVar2 = defpackage.cwl.a;
                    bveVar3.w();
                    if (bwcVar2.t) {
                        bveVar3.j(aferVar2);
                    } else {
                        bveVar3.y();
                    }
                    defpackage.byw.c(bveVar3, ctyVarA119, defpackage.cwl.e);
                    defpackage.byw.c(bveVar3, cddVarAh119, defpackage.cwl.d);
                    defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF119), defpackage.cwl.f);
                    defpackage.byw.b(bveVar3, defpackage.cwl.g);
                    defpackage.byw.c(bveVar3, cgfVarN119, defpackage.cwl.c);
                    affhVar.invoke(new tdt(), bveVar3, java.lang.Integer.valueOf(i17));
                    bwcVar2.Y(true);
                    bwcVar2.Y(false);
                } else {
                    bveVar3 = bveVarC;
                    bveVar3.v(-1980481100);
                    defpackage.cty ctyVarA1110 = defpackage.awb.a(atbVar2, cfyVar2, bveVar3, (((i14 & 896) | (i15 & 126)) >> 3) & 126);
                    bwcVar = (defpackage.bwc) bveVar3;
                    int iF1110 = defpackage.a.f(bwcVar.u);
                    defpackage.cdd cddVarAh1110 = bwcVar.ah();
                    defpackage.cgf cgfVarN1110 = defpackage.bzo.n(bveVar3, cgfVar4);
                    aferVar = defpackage.cwl.a;
                    bveVar3.w();
                    if (bwcVar.t) {
                        bveVar3.j(aferVar);
                    } else {
                        bveVar3.y();
                    }
                    defpackage.byw.c(bveVar3, ctyVarA1110, defpackage.cwl.e);
                    defpackage.byw.c(bveVar3, cddVarAh1110, defpackage.cwl.d);
                    defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF1110), defpackage.cwl.f);
                    defpackage.byw.b(bveVar3, defpackage.cwl.g);
                    defpackage.byw.c(bveVar3, cgfVarN1110, defpackage.cwl.c);
                    affhVar.invoke(new tdw(defpackage.awe.a), bveVar3, java.lang.Integer.valueOf(i17));
                    bwcVar.Y(true);
                    bwcVar.Y(false);
                }
                cgfVar3 = cgfVar4;
                athVar3 = athVar2;
                bveVar2 = bveVar3;
                cfyVar3 = cfyVar2;
                cftVar3 = cftVar2;
                atbVar3 = atbVar2;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
                athVar3 = athVar2;
                bveVar2 = bveVarC;
                atbVar3 = atbVar2;
                cfyVar3 = cfyVar2;
                cftVar3 = cftVar2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new tdu(z, cgfVar3, atbVar3, athVar3, cfyVar3, cftVar3, affhVar, i, i2);
            }
        }
        i3 |= 24576;
        cfyVar2 = cfyVar;
        i10 = i2 & 32;
        if (i10 != 0) {
            i3 |= 196608;
            cftVar2 = cftVar;
        } else if ((196608 & i) == 0) {
            cftVar2 = cftVar;
            int i21111 = i3;
            if (true != bveVarC.C(cftVar2)) {
                i11 = 65536;
            } else {
                i11 = 131072;
            }
            i3 = i21111 | i11;
        } else {
            cftVar2 = cftVar;
        }
        i12 = i3;
        if ((i & 1572864) == 0) {
            if (true != bveVarC.E(affhVar)) {
                i18 = 524288;
            } else {
                i18 = 1048576;
            }
            i3 = i12 | i18;
        }
        i13 = i3;
        if ((i3 & 599187) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bveVarC.I(z2, i13 & 1)) {
            int i21112 = i13 >> 15;
            i14 = i13 >> 6;
            i15 = i13 >> 3;
            if (i20 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            if (i4 != 0) {
                atbVar2 = defpackage.ati.a;
            }
            if (i6 != 0) {
                athVar2 = defpackage.ati.c;
            }
            if (i8 != 0) {
                cfyVar2 = defpackage.cfs.m;
            }
            if (i10 != 0) {
                cftVar2 = defpackage.cfs.j;
            }
            i16 = i15 & 14;
            i17 = i21112 & 112;
            if (z) {
                bveVarC.v(-1980583059);
                defpackage.cty ctyVarA1111 = defpackage.atu.a(athVar2, cftVar2, bveVarC, ((((i14 & 112) | i16) | ((i13 >> 9) & 896)) >> 3) & 126);
                bwcVar2 = (defpackage.bwc) bveVarC;
                bveVar3 = bveVarC;
                int iF1111 = defpackage.a.f(bwcVar2.u);
                defpackage.cdd cddVarAh1111 = bwcVar2.ah();
                defpackage.cgf cgfVarN1111 = defpackage.bzo.n(bveVar3, cgfVar4);
                aferVar2 = defpackage.cwl.a;
                bveVar3.w();
                if (bwcVar2.t) {
                    bveVar3.j(aferVar2);
                } else {
                    bveVar3.y();
                }
                defpackage.byw.c(bveVar3, ctyVarA1111, defpackage.cwl.e);
                defpackage.byw.c(bveVar3, cddVarAh1111, defpackage.cwl.d);
                defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF1111), defpackage.cwl.f);
                defpackage.byw.b(bveVar3, defpackage.cwl.g);
                defpackage.byw.c(bveVar3, cgfVarN1111, defpackage.cwl.c);
                affhVar.invoke(new tdt(), bveVar3, java.lang.Integer.valueOf(i17));
                bwcVar2.Y(true);
                bwcVar2.Y(false);
            } else {
                bveVar3 = bveVarC;
                bveVar3.v(-1980481100);
                defpackage.cty ctyVarA1112 = defpackage.awb.a(atbVar2, cfyVar2, bveVar3, (((i14 & 896) | (i15 & 126)) >> 3) & 126);
                bwcVar = (defpackage.bwc) bveVar3;
                int iF1112 = defpackage.a.f(bwcVar.u);
                defpackage.cdd cddVarAh1112 = bwcVar.ah();
                defpackage.cgf cgfVarN1112 = defpackage.bzo.n(bveVar3, cgfVar4);
                aferVar = defpackage.cwl.a;
                bveVar3.w();
                if (bwcVar.t) {
                    bveVar3.j(aferVar);
                } else {
                    bveVar3.y();
                }
                defpackage.byw.c(bveVar3, ctyVarA1112, defpackage.cwl.e);
                defpackage.byw.c(bveVar3, cddVarAh1112, defpackage.cwl.d);
                defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF1112), defpackage.cwl.f);
                defpackage.byw.b(bveVar3, defpackage.cwl.g);
                defpackage.byw.c(bveVar3, cgfVarN1112, defpackage.cwl.c);
                affhVar.invoke(new tdw(defpackage.awe.a), bveVar3, java.lang.Integer.valueOf(i17));
                bwcVar.Y(true);
                bwcVar.Y(false);
            }
            cgfVar3 = cgfVar4;
            athVar3 = athVar2;
            bveVar2 = bveVar3;
            cfyVar3 = cfyVar2;
            cftVar3 = cftVar2;
            atbVar3 = atbVar2;
        } else {
            bveVarC.s();
            cgfVar3 = cgfVar2;
            athVar3 = athVar2;
            bveVar2 = bveVarC;
            atbVar3 = atbVar2;
            cfyVar3 = cfyVar2;
            cftVar3 = cftVar2;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new tdu(z, cgfVar3, atbVar3, athVar3, cfyVar3, cftVar3, affhVar, i, i2);
        }
    }

    public static final void n(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        o(str, str2, java.util.Arrays.copyOf(objArr, objArr.length));
        throw new java.lang.IllegalStateException();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static java.lang.Object o(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.yqm.c(str).g()).ai(9010)).Y(str2, objArr);
        throw new java.lang.IllegalStateException(java.lang.String.format(str2, objArr));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static java.lang.Object p(java.lang.String str, java.lang.Throwable th, java.lang.String str2, java.lang.Object... objArr) {
        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.yqm.c(str).g()).p(th)).ai(9011)).Y(str2, objArr);
        throw new java.lang.IllegalStateException(java.lang.String.format(str2, objArr), th);
    }

    public static void q(defpackage.eqp eqpVar, defpackage.eqg eqgVar, defpackage.eqt eqtVar) {
        defpackage.tdd tddVar = new defpackage.tdd(eqtVar, eqpVar);
        eqpVar.eM(eqgVar, tddVar);
        eqgVar.getLifecycle().c(tddVar);
    }

    public static final void r(defpackage.eqs eqsVar, java.lang.Object obj) {
        eqsVar.getClass();
        java.util.Set set = (java.util.Set) eqsVar.e();
        if (set == null) {
            set = defpackage.afcg.a;
        }
        eqsVar.m(defpackage.afga.L(set, obj));
    }

    public static final void s(defpackage.eqs eqsVar, java.lang.Object obj) {
        eqsVar.getClass();
        java.util.Set set = (java.util.Set) eqsVar.e();
        if (set == null) {
            set = defpackage.afcg.a;
        }
        eqsVar.m(defpackage.afga.N(set, obj));
    }

    public static boolean t(uwm uwmVar, int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i != 3) {
            return ((i == 4 || i == 5) && uwmVar == uwm.f) ? false : true;
        }
        int iOrdinal = uwmVar.ordinal();
        return iOrdinal == 0 || iOrdinal == 2 || iOrdinal == 4 || iOrdinal == 12 || iOrdinal == 15 || iOrdinal == 6 || iOrdinal == 7 || iOrdinal == 8;
    }

    public static /* synthetic */ java.lang.String u(int i) {
        switch (i) {
            case 34962:
                return "VERTEX";
            case 34963:
                return "INDEX";
            default:
                return "null";
        }
    }

    public static abbg x() {
        defpackage.abor aborVarN = abbg.a.n();
        aborVarN.t();
        abbg abbgVar = aborVarN.b;
        abbgVar.c = 1;
        abbgVar.b = 1 | abbgVar.b;
        return aborVarN.q();
    }

    public static abbg y() {
        defpackage.abor aborVarN = abbg.a.n();
        aborVarN.t();
        abbg abbgVar = aborVarN.b;
        abbgVar.c = 6;
        abbgVar.b |= 1;
        return aborVarN.q();
    }

    public static abeo z(abeo abeoVar) {
        defpackage.aboj abojVar = abil.a;
        abeoVar.j(abojVar);
        defpackage.abon abonVar = abeoVar.w;
        defpackage.abow abowVar = abojVar.d;
        if (!abonVar.m(abowVar)) {
            return abeoVar;
        }
        abeoVar.j(abojVar);
        java.lang.Object objJ = abeoVar.w.j(abowVar);
        defpackage.abor aborVarK = ((abik) (objJ == null ? abojVar.b : abojVar.c(objJ))).K();
        aborVarK.t();
        abik abikVar = aborVarK.b;
        abikVar.c = null;
        abikVar.b &= -129;
        abik abikVarQ = aborVarK.q();
        defpackage.abot abotVar = (defpackage.abot) abeoVar.K();
        abotVar.bc(abojVar, abikVarQ);
        return abotVar.q();
    }

    public final synchronized void af() {
    }

    public final synchronized void v() {
        throw null;
    }

    public final synchronized void w() {
        throw null;
    }

    public rox() {
    }

    public rox(byte[] bArr, byte[] bArr2, char[] cArr) {
        new java.util.concurrent.atomic.AtomicReference();
    }
}
