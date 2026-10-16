package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ep extends defpackage.bc {
    private defpackage.er m;

    public ep(byte[] bArr) {
        super(null);
        A();
    }

    private final void A() {
        getSavedStateRegistry().c("androidx:appcompat", new defpackage.bi((android.content.ContextWrapper) this, 2));
        u(new defpackage.eo((android.content.ContextWrapper) this, 0));
    }

    @Override // defpackage.od, android.app.Activity
    public final void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        w();
        p().e(view, layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x018f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0199  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:122:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:125:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:128:0x0215  */
    /* JADX WARN: Code duplicated, block: B:131:0x0231  */
    /* JADX WARN: Code duplicated, block: B:134:0x0249  */
    /* JADX WARN: Code duplicated, block: B:137:0x025c  */
    /* JADX WARN: Code duplicated, block: B:140:0x026b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0275  */
    /* JADX WARN: Code duplicated, block: B:146:0x027f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0289  */
    /* JADX WARN: Code duplicated, block: B:151:0x028f  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d5 A[Catch: all -> 0x02ec, TRY_LEAVE, TryCatch #4 {, blocks: (B:160:0x02b7, B:162:0x02bb, B:166:0x02d3, B:167:0x02d5, B:169:0x02d9, B:176:0x02ea, B:175:0x02e1, B:165:0x02cc), top: B:195:0x02b7, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x02b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x02bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x02d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:75:0x010c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0110  */
    /* JADX WARN: Code duplicated, block: B:79:0x0139  */
    /* JADX WARN: Code duplicated, block: B:81:0x0142  */
    /* JADX WARN: Code duplicated, block: B:86:0x0152  */
    /* JADX WARN: Code duplicated, block: B:89:0x015c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0166  */
    /* JADX WARN: Code duplicated, block: B:95:0x0178  */
    /* JADX WARN: Code duplicated, block: B:98:0x0185  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [bc, ep] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8, types: [org.xmlpull.v1.XmlSerializer] */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(android.content.Context context) {
        android.content.Context context2;
        android.content.res.Configuration configuration;
        android.content.res.Configuration configuration2;
        android.content.res.Configuration configuration3;
        defpackage.pl plVar;
        android.content.Context context3;
        android.content.res.Resources.Theme theme;
        java.lang.reflect.Method method;
        android.content.res.Configuration configuration4;
        android.os.LocaleList localeListM;
        android.os.LocaleList localeListM2;
        defpackage.ff ffVar = (defpackage.ff) p();
        ffVar.C = true;
        int iV = ffVar.v(context, ffVar.u());
        if (defpackage.ff.p(context) && defpackage.er.p(context)) {
            if (android.os.Build.VERSION.SDK_INT < 33) {
                synchronized (defpackage.er.h) {
                    defpackage.dwh dwhVar = defpackage.er.c;
                    if (dwhVar == null) {
                        if (defpackage.er.d == null) {
                            defpackage.er.d = defpackage.dwh.c(dsu.a(context));
                        }
                        if (!defpackage.er.d.f()) {
                            defpackage.er.c = defpackage.er.d;
                        }
                    } else if (!dwhVar.equals(defpackage.er.d)) {
                        defpackage.dwh dwhVar2 = defpackage.er.c;
                        defpackage.er.d = dwhVar2;
                        java.lang.String strD = dwhVar2.d();
                        synchronized (dsu.a) {
                            ?? Equals = strD.equals("");
                            if (Equals != 0) {
                                context.deleteFile("android.support.v7.app.AppCompatDelegate.application_locales_record_file");
                            } else {
                                try {
                                    Equals = context.openFileOutput("android.support.v7.app.AppCompatDelegate.application_locales_record_file", 0);
                                    ?? NewSerializer = android.util.Xml.newSerializer();
                                    try {
                                        try {
                                            NewSerializer.setOutput(Equals, null);
                                            NewSerializer.startDocument("UTF-8", java.lang.Boolean.TRUE);
                                            NewSerializer.startTag(null, "locales");
                                            NewSerializer.attribute(null, "application_locales", strD);
                                            NewSerializer.endTag(null, "locales");
                                            NewSerializer.endDocument();
                                            if (Equals != 0) {
                                                try {
                                                    Equals.close();
                                                } catch (java.io.IOException unused) {
                                                }
                                            }
                                        } catch (java.lang.Exception e) {
                                            android.util.Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e);
                                            if (Equals != 0) {
                                                Equals.close();
                                            }
                                        }
                                    } catch (java.lang.Throwable th) {
                                        if (Equals == 0) {
                                            throw th;
                                        }
                                        try {
                                            Equals.close();
                                            throw th;
                                        } catch (java.io.IOException unused2) {
                                            throw th;
                                        }
                                    }
                                } catch (java.io.FileNotFoundException unused3) {
                                    Equals = java.lang.String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "android.support.v7.app.AppCompatDelegate.application_locales_record_file");
                                    android.util.Log.w("AppLocalesStorageHelper", (java.lang.String) Equals);
                                }
                            }
                        }
                    }
                }
            } else if (!defpackage.er.e) {
                defpackage.er.a.execute(new defpackage.ag(context, 17));
            }
        }
        defpackage.dwh dwhVarA = ffVar.A(context);
        if (context instanceof android.view.ContextThemeWrapper) {
            context2 = context;
            try {
                ((android.view.ContextThemeWrapper) context2).applyOverrideConfiguration(ffVar.x(context2, iV, dwhVarA, null, false));
            } catch (java.lang.IllegalStateException unused4) {
                if (context2 instanceof defpackage.pl) {
                    try {
                        ((defpackage.pl) context2).b(ffVar.x(context2, iV, dwhVarA, null, false));
                    } catch (java.lang.IllegalStateException unused5) {
                        if (defpackage.ff.i) {
                            android.content.res.Configuration configuration5 = new android.content.res.Configuration();
                            configuration5.uiMode = -1;
                            configuration5.fontScale = 0.0f;
                            configuration = context2.createConfigurationContext(configuration5).getResources().getConfiguration();
                            configuration2 = context2.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (configuration.equals(configuration2)) {
                                configuration3 = null;
                            } else {
                                configuration4 = new android.content.res.Configuration();
                                configuration4.fontScale = 0.0f;
                                if (configuration2 != null) {
                                    if (configuration.fontScale != configuration2.fontScale) {
                                        configuration4.fontScale = configuration2.fontScale;
                                    }
                                    if (configuration.mcc != configuration2.mcc) {
                                        configuration4.mcc = configuration2.mcc;
                                    }
                                    if (configuration.mnc != configuration2.mnc) {
                                        configuration4.mnc = configuration2.mnc;
                                    }
                                    localeListM = a$.ExternalSyntheticApiModelOutline2.m(configuration);
                                    localeListM2 = a$.ExternalSyntheticApiModelOutline2.m(configuration2);
                                    if (!a$.ExternalSyntheticApiModelOutline2.m(localeListM, localeListM2)) {
                                        a$.ExternalSyntheticApiModelOutline2.m(configuration4, localeListM2);
                                        configuration4.locale = configuration2.locale;
                                    }
                                    if (configuration.touchscreen != configuration2.touchscreen) {
                                        configuration4.touchscreen = configuration2.touchscreen;
                                    }
                                    if (configuration.keyboard != configuration2.keyboard) {
                                        configuration4.keyboard = configuration2.keyboard;
                                    }
                                    if (configuration.keyboardHidden != configuration2.keyboardHidden) {
                                        configuration4.keyboardHidden = configuration2.keyboardHidden;
                                    }
                                    if (configuration.navigation != configuration2.navigation) {
                                        configuration4.navigation = configuration2.navigation;
                                    }
                                    if (configuration.navigationHidden != configuration2.navigationHidden) {
                                        configuration4.navigationHidden = configuration2.navigationHidden;
                                    }
                                    if (configuration.orientation != configuration2.orientation) {
                                        configuration4.orientation = configuration2.orientation;
                                    }
                                    if ((configuration.screenLayout & 15) != (configuration2.screenLayout & 15)) {
                                        configuration4.screenLayout |= configuration2.screenLayout & 15;
                                    }
                                    if ((configuration.screenLayout & 192) != (configuration2.screenLayout & 192)) {
                                        configuration4.screenLayout |= configuration2.screenLayout & 192;
                                    }
                                    if ((configuration.screenLayout & 48) != (configuration2.screenLayout & 48)) {
                                        configuration4.screenLayout |= configuration2.screenLayout & 48;
                                    }
                                    if ((configuration.screenLayout & 768) != (configuration2.screenLayout & 768)) {
                                        configuration4.screenLayout |= configuration2.screenLayout & 768;
                                    }
                                    if ((ep$.ExternalSyntheticApiModelOutline1.m(configuration) & 3) != (ep$.ExternalSyntheticApiModelOutline1.m(configuration2) & 3)) {
                                        ep$.ExternalSyntheticApiModelOutline1.m(configuration4, ep$.ExternalSyntheticApiModelOutline1.m(configuration4) | (ep$.ExternalSyntheticApiModelOutline1.m(configuration2) & 3));
                                    }
                                    if ((ep$.ExternalSyntheticApiModelOutline1.m(configuration) & 12) != (ep$.ExternalSyntheticApiModelOutline1.m(configuration2) & 12)) {
                                        ep$.ExternalSyntheticApiModelOutline1.m(configuration4, ep$.ExternalSyntheticApiModelOutline1.m(configuration4) | (ep$.ExternalSyntheticApiModelOutline1.m(configuration2) & 12));
                                    }
                                    if ((configuration.uiMode & 15) != (configuration2.uiMode & 15)) {
                                        configuration4.uiMode |= configuration2.uiMode & 15;
                                    }
                                    if ((configuration.uiMode & 48) != (configuration2.uiMode & 48)) {
                                        configuration4.uiMode |= configuration2.uiMode & 48;
                                    }
                                    if (configuration.screenWidthDp != configuration2.screenWidthDp) {
                                        configuration4.screenWidthDp = configuration2.screenWidthDp;
                                    }
                                    if (configuration.screenHeightDp != configuration2.screenHeightDp) {
                                        configuration4.screenHeightDp = configuration2.screenHeightDp;
                                    }
                                    if (configuration.smallestScreenWidthDp != configuration2.smallestScreenWidthDp) {
                                        configuration4.smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
                                    }
                                    if (configuration.densityDpi != configuration2.densityDpi) {
                                        configuration4.densityDpi = configuration2.densityDpi;
                                    }
                                }
                                configuration3 = configuration4;
                            }
                            android.content.res.Configuration configurationX = ffVar.x(context2, iV, dwhVarA, configuration3, true);
                            plVar = new defpackage.pl(context2, 2132149898);
                            plVar.b(configurationX);
                            try {
                                if (context2.getTheme() != null) {
                                    theme = plVar.getTheme();
                                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                                        ep$.ExternalSyntheticApiModelOutline0.m(theme);
                                    } else {
                                        synchronized (dvh.a) {
                                            if (dvh.c) {
                                                method = dvh.b;
                                                if (method != null) {
                                                    method.invoke(theme, null);
                                                }
                                            } else {
                                                try {
                                                    dvh.b = android.content.res.Resources.Theme.class.getDeclaredMethod("rebase", null);
                                                    dvh.b.setAccessible(true);
                                                } catch (java.lang.NoSuchMethodException e2) {
                                                    android.util.Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                                                }
                                                dvh.c = true;
                                                method = dvh.b;
                                                if (method != null) {
                                                    try {
                                                        method.invoke(theme, null);
                                                    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e3) {
                                                        android.util.Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                                                        dvh.b = null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (java.lang.NullPointerException unused6) {
                            }
                            context3 = plVar;
                        }
                        super.attachBaseContext(context3);
                    }
                } else if (defpackage.ff.i) {
                    android.content.res.Configuration configuration6 = new android.content.res.Configuration();
                    configuration6.uiMode = -1;
                    configuration6.fontScale = 0.0f;
                    configuration = context2.createConfigurationContext(configuration6).getResources().getConfiguration();
                    configuration2 = context2.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration4 = new android.content.res.Configuration();
                        configuration4.fontScale = 0.0f;
                        if (configuration2 != null) {
                            if (configuration.fontScale != configuration2.fontScale) {
                                configuration4.fontScale = configuration2.fontScale;
                            }
                            if (configuration.mcc != configuration2.mcc) {
                                configuration4.mcc = configuration2.mcc;
                            }
                            if (configuration.mnc != configuration2.mnc) {
                                configuration4.mnc = configuration2.mnc;
                            }
                            localeListM = a$.ExternalSyntheticApiModelOutline2.m(configuration);
                            localeListM2 = a$.ExternalSyntheticApiModelOutline2.m(configuration2);
                            if (!a$.ExternalSyntheticApiModelOutline2.m(localeListM, localeListM2)) {
                                a$.ExternalSyntheticApiModelOutline2.m(configuration4, localeListM2);
                                configuration4.locale = configuration2.locale;
                            }
                            if (configuration.touchscreen != configuration2.touchscreen) {
                                configuration4.touchscreen = configuration2.touchscreen;
                            }
                            if (configuration.keyboard != configuration2.keyboard) {
                                configuration4.keyboard = configuration2.keyboard;
                            }
                            if (configuration.keyboardHidden != configuration2.keyboardHidden) {
                                configuration4.keyboardHidden = configuration2.keyboardHidden;
                            }
                            if (configuration.navigation != configuration2.navigation) {
                                configuration4.navigation = configuration2.navigation;
                            }
                            if (configuration.navigationHidden != configuration2.navigationHidden) {
                                configuration4.navigationHidden = configuration2.navigationHidden;
                            }
                            if (configuration.orientation != configuration2.orientation) {
                                configuration4.orientation = configuration2.orientation;
                            }
                            if ((configuration.screenLayout & 15) != (configuration2.screenLayout & 15)) {
                                configuration4.screenLayout |= configuration2.screenLayout & 15;
                            }
                            if ((configuration.screenLayout & 192) != (configuration2.screenLayout & 192)) {
                                configuration4.screenLayout |= configuration2.screenLayout & 192;
                            }
                            if ((configuration.screenLayout & 48) != (configuration2.screenLayout & 48)) {
                                configuration4.screenLayout |= configuration2.screenLayout & 48;
                            }
                            if ((configuration.screenLayout & 768) != (configuration2.screenLayout & 768)) {
                                configuration4.screenLayout |= configuration2.screenLayout & 768;
                            }
                            if ((ep$.ExternalSyntheticApiModelOutline1.m(configuration) & 3) != (ep$.ExternalSyntheticApiModelOutline1.m(configuration2) & 3)) {
                                ep$.ExternalSyntheticApiModelOutline1.m(configuration4, ep$.ExternalSyntheticApiModelOutline1.m(configuration4) | (ep$.ExternalSyntheticApiModelOutline1.m(configuration2) & 3));
                            }
                            if ((ep$.ExternalSyntheticApiModelOutline1.m(configuration) & 12) != (ep$.ExternalSyntheticApiModelOutline1.m(configuration2) & 12)) {
                                ep$.ExternalSyntheticApiModelOutline1.m(configuration4, ep$.ExternalSyntheticApiModelOutline1.m(configuration4) | (ep$.ExternalSyntheticApiModelOutline1.m(configuration2) & 12));
                            }
                            if ((configuration.uiMode & 15) != (configuration2.uiMode & 15)) {
                                configuration4.uiMode |= configuration2.uiMode & 15;
                            }
                            if ((configuration.uiMode & 48) != (configuration2.uiMode & 48)) {
                                configuration4.uiMode |= configuration2.uiMode & 48;
                            }
                            if (configuration.screenWidthDp != configuration2.screenWidthDp) {
                                configuration4.screenWidthDp = configuration2.screenWidthDp;
                            }
                            if (configuration.screenHeightDp != configuration2.screenHeightDp) {
                                configuration4.screenHeightDp = configuration2.screenHeightDp;
                            }
                            if (configuration.smallestScreenWidthDp != configuration2.smallestScreenWidthDp) {
                                configuration4.smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
                            }
                            if (configuration.densityDpi != configuration2.densityDpi) {
                                configuration4.densityDpi = configuration2.densityDpi;
                            }
                        }
                        configuration3 = configuration4;
                    } else {
                        configuration3 = null;
                    }
                    android.content.res.Configuration configurationX2 = ffVar.x(context2, iV, dwhVarA, configuration3, true);
                    plVar = new defpackage.pl(context2, 2132149898);
                    plVar.b(configurationX2);
                    if (context2.getTheme() != null) {
                        theme = plVar.getTheme();
                        if (android.os.Build.VERSION.SDK_INT >= 29) {
                            ep$.ExternalSyntheticApiModelOutline0.m(theme);
                        } else {
                            synchronized (dvh.a) {
                                if (dvh.c) {
                                    dvh.b = android.content.res.Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    dvh.b.setAccessible(true);
                                    dvh.c = true;
                                    method = dvh.b;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                } else {
                                    method = dvh.b;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                }
                            }
                        }
                    }
                    context3 = plVar;
                }
                super.attachBaseContext(context3);
            }
            context3 = context2;
            super.attachBaseContext(context3);
        }
        context2 = context;
        if (context2 instanceof defpackage.pl) {
            ((defpackage.pl) context2).b(ffVar.x(context2, iV, dwhVarA, null, false));
            context3 = context2;
        } else if (defpackage.ff.i) {
            android.content.res.Configuration configuration7 = new android.content.res.Configuration();
            configuration7.uiMode = -1;
            configuration7.fontScale = 0.0f;
            configuration = context2.createConfigurationContext(configuration7).getResources().getConfiguration();
            configuration2 = context2.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration4 = new android.content.res.Configuration();
                configuration4.fontScale = 0.0f;
                if (configuration2 != null && configuration.diff(configuration2) != 0) {
                    if (configuration.fontScale != configuration2.fontScale) {
                        configuration4.fontScale = configuration2.fontScale;
                    }
                    if (configuration.mcc != configuration2.mcc) {
                        configuration4.mcc = configuration2.mcc;
                    }
                    if (configuration.mnc != configuration2.mnc) {
                        configuration4.mnc = configuration2.mnc;
                    }
                    localeListM = a$.ExternalSyntheticApiModelOutline2.m(configuration);
                    localeListM2 = a$.ExternalSyntheticApiModelOutline2.m(configuration2);
                    if (!a$.ExternalSyntheticApiModelOutline2.m(localeListM, localeListM2)) {
                        a$.ExternalSyntheticApiModelOutline2.m(configuration4, localeListM2);
                        configuration4.locale = configuration2.locale;
                    }
                    if (configuration.touchscreen != configuration2.touchscreen) {
                        configuration4.touchscreen = configuration2.touchscreen;
                    }
                    if (configuration.keyboard != configuration2.keyboard) {
                        configuration4.keyboard = configuration2.keyboard;
                    }
                    if (configuration.keyboardHidden != configuration2.keyboardHidden) {
                        configuration4.keyboardHidden = configuration2.keyboardHidden;
                    }
                    if (configuration.navigation != configuration2.navigation) {
                        configuration4.navigation = configuration2.navigation;
                    }
                    if (configuration.navigationHidden != configuration2.navigationHidden) {
                        configuration4.navigationHidden = configuration2.navigationHidden;
                    }
                    if (configuration.orientation != configuration2.orientation) {
                        configuration4.orientation = configuration2.orientation;
                    }
                    if ((configuration.screenLayout & 15) != (configuration2.screenLayout & 15)) {
                        configuration4.screenLayout |= configuration2.screenLayout & 15;
                    }
                    if ((configuration.screenLayout & 192) != (configuration2.screenLayout & 192)) {
                        configuration4.screenLayout |= configuration2.screenLayout & 192;
                    }
                    if ((configuration.screenLayout & 48) != (configuration2.screenLayout & 48)) {
                        configuration4.screenLayout |= configuration2.screenLayout & 48;
                    }
                    if ((configuration.screenLayout & 768) != (configuration2.screenLayout & 768)) {
                        configuration4.screenLayout |= configuration2.screenLayout & 768;
                    }
                    if ((ep$.ExternalSyntheticApiModelOutline1.m(configuration) & 3) != (ep$.ExternalSyntheticApiModelOutline1.m(configuration2) & 3)) {
                        ep$.ExternalSyntheticApiModelOutline1.m(configuration4, ep$.ExternalSyntheticApiModelOutline1.m(configuration4) | (ep$.ExternalSyntheticApiModelOutline1.m(configuration2) & 3));
                    }
                    if ((ep$.ExternalSyntheticApiModelOutline1.m(configuration) & 12) != (ep$.ExternalSyntheticApiModelOutline1.m(configuration2) & 12)) {
                        ep$.ExternalSyntheticApiModelOutline1.m(configuration4, ep$.ExternalSyntheticApiModelOutline1.m(configuration4) | (ep$.ExternalSyntheticApiModelOutline1.m(configuration2) & 12));
                    }
                    if ((configuration.uiMode & 15) != (configuration2.uiMode & 15)) {
                        configuration4.uiMode |= configuration2.uiMode & 15;
                    }
                    if ((configuration.uiMode & 48) != (configuration2.uiMode & 48)) {
                        configuration4.uiMode |= configuration2.uiMode & 48;
                    }
                    if (configuration.screenWidthDp != configuration2.screenWidthDp) {
                        configuration4.screenWidthDp = configuration2.screenWidthDp;
                    }
                    if (configuration.screenHeightDp != configuration2.screenHeightDp) {
                        configuration4.screenHeightDp = configuration2.screenHeightDp;
                    }
                    if (configuration.smallestScreenWidthDp != configuration2.smallestScreenWidthDp) {
                        configuration4.smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
                    }
                    if (configuration.densityDpi != configuration2.densityDpi) {
                        configuration4.densityDpi = configuration2.densityDpi;
                    }
                }
                configuration3 = configuration4;
            } else {
                configuration3 = null;
            }
            android.content.res.Configuration configurationX3 = ffVar.x(context2, iV, dwhVarA, configuration3, true);
            plVar = new defpackage.pl(context2, 2132149898);
            plVar.b(configurationX3);
            if (context2.getTheme() != null) {
                theme = plVar.getTheme();
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    ep$.ExternalSyntheticApiModelOutline0.m(theme);
                } else {
                    synchronized (dvh.a) {
                        if (dvh.c) {
                            dvh.b = android.content.res.Resources.Theme.class.getDeclaredMethod("rebase", null);
                            dvh.b.setAccessible(true);
                            dvh.c = true;
                            method = dvh.b;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        } else {
                            method = dvh.b;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        }
                    }
                }
            }
            context3 = plVar;
        } else {
            context3 = context2;
        }
        super.attachBaseContext(context3);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        defpackage.ef efVarO = o();
        if (getWindow().hasFeature(0)) {
            if (efVarO == null || !efVarO.l()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.cs, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        defpackage.ef efVarO = o();
        if (keyCode == 82 && efVarO != null && efVarO.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final android.view.View findViewById(int i) {
        return p().d(i);
    }

    @Override // android.app.Activity
    public final android.view.MenuInflater getMenuInflater() {
        return p().c();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        p().g();
    }

    public final defpackage.ef o() {
        return p().b();
    }

    @Override // defpackage.od, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p().s();
    }

    @Override // defpackage.bc, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        p().h();
    }

    @Override // defpackage.bc, defpackage.od, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        android.content.Intent intentJ;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        defpackage.ef efVarO = o();
        if (menuItem.getItemId() != 16908332 || efVarO == null || (efVarO.a() & 4) == 0 || (intentJ = defpackage.dlv.j(this)) == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentJ)) {
            navigateUpTo(intentJ);
            return true;
        }
        duv duvVar = new duv(this);
        android.content.Intent intentJ2 = defpackage.dlv.j(this);
        if (intentJ2 == null) {
            intentJ2 = defpackage.dlv.j(this);
        }
        if (intentJ2 != null) {
            android.content.ComponentName component = intentJ2.getComponent();
            if (component == null) {
                component = intentJ2.resolveActivity(duvVar.a.getPackageManager());
            }
            duvVar.b(component);
            duvVar.a(intentJ2);
        }
        duvVar.c();
        try {
            finishAffinity();
            return true;
        } catch (java.lang.IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected final void onPostCreate(android.os.Bundle bundle) {
        super.onPostCreate(bundle);
        ((defpackage.ff) p()).H();
    }

    @Override // defpackage.bc, android.app.Activity
    protected final void onPostResume() {
        super.onPostResume();
        p().i();
    }

    @Override // defpackage.bc, android.app.Activity
    protected void onStart() {
        super.onStart();
        ((defpackage.ff) p()).S(true, false);
    }

    @Override // defpackage.bc, android.app.Activity
    protected void onStop() {
        super.onStop();
        p().j();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(java.lang.CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        p().o(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        defpackage.ef efVarO = o();
        if (getWindow().hasFeature(0)) {
            if (efVarO == null || !efVarO.q()) {
                super.openOptionsMenu();
            }
        }
    }

    public final defpackage.er p() {
        if (this.m == null) {
            int i = defpackage.er.b;
            this.m = new defpackage.ff(this, null, this);
        }
        return this.m;
    }

    public final void q(android.support.v7.widget.Toolbar toolbar) {
        defpackage.ff ffVar = (defpackage.ff) p();
        if (ffVar.j instanceof android.app.Activity) {
            defpackage.ef efVarB = ffVar.b();
            if (efVarB instanceof defpackage.fs) {
                throw new java.lang.IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            ffVar.o = null;
            if (efVarB != null) {
                efVarB.e();
            }
            ffVar.n = null;
            if (toolbar != null) {
                defpackage.fm fmVar = new defpackage.fm(toolbar, ffVar.B(), ffVar.m);
                ffVar.n = fmVar;
                ffVar.m.d = fmVar.d;
                if (!toolbar.A) {
                    toolbar.A = true;
                    toolbar.w();
                }
            } else {
                ffVar.m.d = null;
            }
            ffVar.g();
        }
    }

    @Override // defpackage.od, android.app.Activity
    public final void setContentView(int i) {
        w();
        p().l(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((defpackage.ff) p()).E = i;
    }

    public ep() {
        A();
    }

    @Override // defpackage.od, android.app.Activity
    public final void setContentView(android.view.View view) {
        w();
        p().m(view);
    }

    @Override // defpackage.od, android.app.Activity
    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        w();
        p().n(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
