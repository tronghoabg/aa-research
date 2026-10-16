package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oqk implements defpackage.lhn, defpackage.mnj {
    public static final defpackage.oqi a = new defpackage.oqi();
    public static final defpackage.afhl b = new defpackage.ogs(defpackage.mkp.b, 3);
    public static final defpackage.yqm c = defpackage.yqm.c("GH.WidgetManager");
    public final android.content.Context d;
    public final android.appwidget.AppWidgetManager e;
    public final defpackage.oqg f;
    public final defpackage.oqt g;
    public int h;
    public java.util.Set i;
    public final defpackage.eqs j;
    public final defpackage.eqp k;
    private final defpackage.afar l;
    private java.lang.String m;
    private aiwg n;

    public oqk() {
        int i;
        android.appwidget.AppWidgetProviderInfo appWidgetInfo;
        android.content.Context context = defpackage.mkp.a.c;
        context.getClass();
        this.d = context;
        android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context);
        appWidgetManager.getClass();
        this.e = appWidgetManager;
        this.f = new defpackage.oqg(context);
        this.l = defpackage.afga.cA(new defpackage.oph(this, 15));
        defpackage.oqt oqtVar = new defpackage.oqt();
        java.lang.String string = a().getString("widget_stack", null);
        if (string != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(string);
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    int i3 = jSONObject.getInt("widgetId");
                    java.lang.String string2 = jSONObject.getString("label");
                    string2.getClass();
                    java.lang.String string3 = jSONObject.getString("appName");
                    string3.getClass();
                    if (i3 == -1) {
                        i = -1;
                        appWidgetInfo = null;
                    } else if (this.e.getAppWidgetInfo(i3) != null) {
                        i = i3;
                        appWidgetInfo = this.e.getAppWidgetInfo(i3);
                    } else {
                        appWidgetInfo = null;
                        i = i3;
                    }
                    android.content.ComponentName componentName = (jSONObject.has("pendingPackageName") && jSONObject.has("pendingClassName")) ? new android.content.ComponentName(jSONObject.getString("pendingPackageName"), jSONObject.getString("pendingClassName")) : null;
                    if (appWidgetInfo != null || componentName != null) {
                        arrayList.add(new oqu(i, appWidgetInfo, string2, string3, componentName));
                    }
                }
            } catch (org.json.JSONException e) {
                ((defpackage.yqj) ((defpackage.yqj) c.g()).p(e)).u("Failed to load widgets");
            }
            oqtVar.a.clear();
            oqtVar.a.addAll(arrayList);
        }
        this.g = oqtVar;
        this.h = -1;
        defpackage.afcg afcgVar = defpackage.afcg.a;
        this.i = afcgVar;
        defpackage.eqs eqsVar = new defpackage.eqs(afcgVar);
        this.j = eqsVar;
        this.k = eqsVar;
    }

    public final android.content.SharedPreferences a() {
        java.lang.Object objA = this.l.a();
        objA.getClass();
        return (android.content.SharedPreferences) objA;
    }

    public final oqh b(int i, android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo) throws org.json.JSONException {
        int iM = jx$.ExternalSyntheticApiModelOutline3.m(appWidgetProviderInfo) & 4;
        if (appWidgetProviderInfo.configure != null && iM == 0) {
            c.l().y("Configuration needed for %s", appWidgetProviderInfo);
            return new oqh(2, i, appWidgetProviderInfo);
        }
        c.l().y("No configuration needed, adding %s", appWidgetProviderInfo);
        g(i, appWidgetProviderInfo);
        return new oqh(0, i, appWidgetProviderInfo);
    }

    @Override // defpackage.lhn
    public final void d() {
        aiwg aiwgVar = this.n;
        if (aiwgVar != null) {
            aiwgVar.s((java.util.concurrent.CancellationException) null);
        }
        if (defpackage.leh.a.a().f()) {
            defpackage.afcg afcgVar = defpackage.afcg.a;
            this.i = afcgVar;
            this.j.m(afcgVar);
        }
        defpackage.mni.a().d(defpackage.mnh.C);
    }

    public final java.lang.String e(int i) {
        return a().getString(defpackage.a.bo(i, "last_widget_col_"), null);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (defpackage.leh.a.a().f() && !a().contains("widget_stack")) {
            this.n = ahoc.d(ahoi.b(defpackage.mks.a.b()), (defpackage.afdo) null, 0, new defpackage.nbo(this, (defpackage.afdk) null, 7), 3);
        }
        defpackage.mni.a().b(defpackage.mnh.C, this);
    }

    public final java.lang.String f() {
        java.lang.String str;
        java.lang.Object next;
        android.content.pm.ActivityInfo activityInfo;
        java.lang.String str2 = this.m;
        if (str2 != null) {
            return str2;
        }
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = this.d.getPackageManager().queryIntentActivities(new android.content.Intent("com.android.launcher3.widgets.ACTION_CREATE"), 1048576);
        listQueryIntentActivities.getClass();
        java.util.Iterator<T> it = listQueryIntentActivities.iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((android.content.pm.ResolveInfo) next).activityInfo == null);
        android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) next;
        if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null) {
            str = activityInfo.packageName;
        }
        this.m = str;
        return str;
    }

    public final void g(int i, android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo) throws org.json.JSONException {
        appWidgetProviderInfo.getClass();
        android.content.pm.PackageManager packageManager = this.d.getPackageManager();
        android.content.ComponentName componentName = appWidgetProviderInfo.provider;
        try {
            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(componentName.getPackageName(), 0);
            applicationInfo.getClass();
            java.lang.String string = packageManager.getApplicationLabel(applicationInfo).toString();
            java.lang.String strLoadLabel = appWidgetProviderInfo.loadLabel(packageManager);
            if (strLoadLabel == null) {
                strLoadLabel = "Unknown Widget";
            }
            this.g.a.add(new oqu(i, appWidgetProviderInfo, strLoadLabel, string, (android.content.ComponentName) null));
            this.f.startListening();
            i();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, oqv.a, defpackage.zbd.NF);
            if (componentName != null) {
                rrvVarH.p(componentName);
            }
            defpackage.omf.u().F(rrvVarH.l());
        } catch (java.lang.Exception e) {
            ((defpackage.yqj) ((defpackage.yqj) c.h()).p(e)).y("Failed to get app name for %s", componentName.getPackageName());
            this.f.deleteAppWidgetId(i);
        }
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        printWriter.getClass();
        printWriter.println("WidgetManager Status:");
        printWriter.println("  LLM Package Name: ".concat(java.lang.String.valueOf(f())));
        printWriter.println("  Binding Widget ID: " + this.h);
        printWriter.println("  Incompatible Widgets (" + this.i.size() + "):");
        if (this.i.isEmpty()) {
            printWriter.println("    None");
        } else {
            for (oqj oqjVar : this.i) {
                printWriter.println("    " + oqjVar.a + " (minSize: " + oqjVar.b + "x" + oqjVar.c + ", screenSize: " + oqjVar.d + "x" + oqjVar.e + ")");
            }
        }
        this.g.h(printWriter);
    }

    public final void i() throws org.json.JSONException {
        android.content.ComponentName componentName;
        java.util.List<oqu> listAZ = defpackage.afga.aZ(this.g.a);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (oqu oquVar : listAZ) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("widgetId", oquVar.a);
            jSONObject.put("label", oquVar.c);
            jSONObject.put("appName", oquVar.d);
            android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo = oquVar.b;
            if (appWidgetProviderInfo != null && (componentName = appWidgetProviderInfo.provider) != null) {
                jSONObject.put("packageName", componentName.getPackageName());
                jSONObject.put("className", componentName.getClassName());
            }
            android.content.ComponentName componentName2 = oquVar.e;
            if (componentName2 != null) {
                jSONObject.put("pendingPackageName", componentName2.getPackageName());
                jSONObject.put("pendingClassName", componentName2.getClassName());
            }
            jSONArray.put(jSONObject);
        }
        android.content.SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.getClass();
        editorEdit.putString("widget_stack", jSONArray.toString());
        editorEdit.apply();
    }

    public final boolean j(android.content.ComponentName componentName) {
        java.util.Set set = (java.util.Set) this.j.e();
        return set != null && set.contains(componentName);
    }
}
