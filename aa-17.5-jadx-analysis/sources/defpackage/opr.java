package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class opr implements lhg, mnd {
    public static final opp a = new opp();
    public static final afgl b = new ofw(mki.b, 4);
    public static final yph c = yph.c("GH.WidgetManager");
    public final Context d;
    public final AppWidgetManager e;
    public final opn f;
    public final oqa g;
    public int h;
    public Set i;
    public final eqm j;
    public final eqj k;
    private final aezr l;
    private String m;
    private aivh n;

    public opr() throws JSONException {
        int i;
        AppWidgetProviderInfo appWidgetInfo;
        Context context = mki.a.c;
        context.getClass();
        this.d = context;
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        appWidgetManager.getClass();
        this.e = appWidgetManager;
        this.f = new opn(context);
        this.l = woy.dG(new ooq(this, 12));
        oqa oqaVar = new oqa();
        String string = a().getString("widget_stack", null);
        if (string != null) {
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    int i3 = jSONObject.getInt("widgetId");
                    String string2 = jSONObject.getString("label");
                    string2.getClass();
                    String string3 = jSONObject.getString("appName");
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
                    ComponentName componentName = (jSONObject.has("pendingPackageName") && jSONObject.has("pendingClassName")) ? new ComponentName(jSONObject.getString("pendingPackageName"), jSONObject.getString("pendingClassName")) : null;
                    if (appWidgetInfo != null || componentName != null) {
                        arrayList.add(new oqb(i, appWidgetInfo, string2, string3, componentName));
                    }
                }
            } catch (JSONException e) {
                ((ype) ((ype) c.g()).p(e)).u("Failed to load widgets");
            }
            oqaVar.a.clear();
            oqaVar.a.addAll(arrayList);
        }
        this.g = oqaVar;
        this.h = -1;
        afbg afbgVar = afbg.a;
        this.i = afbgVar;
        eqm eqmVar = new eqm(afbgVar);
        this.j = eqmVar;
        this.k = eqmVar;
    }

    public final SharedPreferences a() {
        Object objA = this.l.a();
        objA.getClass();
        return (SharedPreferences) objA;
    }

    public final opo b(int i, AppWidgetProviderInfo appWidgetProviderInfo) throws JSONException, PackageManager.NameNotFoundException {
        if (appWidgetProviderInfo.configure != null) {
            c.l().y("Configuration needed for %s", appWidgetProviderInfo);
            return new opo(2, i, appWidgetProviderInfo);
        }
        c.l().y("No configuration needed, adding %s", appWidgetProviderInfo);
        g(i, appWidgetProviderInfo);
        return new opo(0, i, appWidgetProviderInfo);
    }

    @Override // defpackage.lhg
    public final void c() {
        if (lec.a.a().f() && !a().contains("widget_stack")) {
            this.n = ahnc.d(ahni.b(mkm.a.b()), null, 0, new nba(this, (afck) null, 7), 3);
        }
        mnc.a().b(mnb.C, this);
    }

    @Override // defpackage.lhg
    public final void d() {
        aivh aivhVar = this.n;
        if (aivhVar != null) {
            aivhVar.s(null);
        }
        if (lec.a.a().f()) {
            afbg afbgVar = afbg.a;
            this.i = afbgVar;
            this.j.m(afbgVar);
        }
        mnc.a().d(mnb.C);
    }

    public final String e(int i) {
        return a().getString(a.bp(i, "last_widget_col_"), null);
    }

    public final String f() {
        String str;
        Object next;
        ActivityInfo activityInfo;
        String str2 = this.m;
        if (str2 != null) {
            return str2;
        }
        List<ResolveInfo> listQueryIntentActivities = this.d.getPackageManager().queryIntentActivities(new Intent("com.android.launcher3.widgets.ACTION_CREATE"), 1048576);
        listQueryIntentActivities.getClass();
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ResolveInfo) next).activityInfo != null) {
                break;
            }
        }
        ResolveInfo resolveInfo = (ResolveInfo) next;
        if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null) {
            str = activityInfo.packageName;
        }
        this.m = str;
        return str;
    }

    public final void g(int i, AppWidgetProviderInfo appWidgetProviderInfo) throws JSONException, PackageManager.NameNotFoundException {
        appWidgetProviderInfo.getClass();
        PackageManager packageManager = this.d.getPackageManager();
        ComponentName componentName = appWidgetProviderInfo.provider;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(componentName.getPackageName(), 0);
            applicationInfo.getClass();
            String string = packageManager.getApplicationLabel(applicationInfo).toString();
            String strLoadLabel = appWidgetProviderInfo.loadLabel(packageManager);
            if (strLoadLabel == null) {
                strLoadLabel = "Unknown Widget";
            }
            this.g.a.add(new oqb(i, appWidgetProviderInfo, strLoadLabel, string, null));
            this.f.startListening();
            i();
        } catch (Exception e) {
            ((ype) ((ype) c.h()).p(e)).y("Failed to get app name for %s", componentName.getPackageName());
            this.f.deleteAppWidgetId(i);
        }
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        printWriter.getClass();
        printWriter.println("WidgetManager Status:");
        printWriter.println("  LLM Package Name: ".concat(String.valueOf(f())));
        printWriter.println("  Binding Widget ID: " + this.h);
        printWriter.println("  Incompatible Widgets (" + this.i.size() + "):");
        if (this.i.isEmpty()) {
            printWriter.println("    None");
        } else {
            for (opq opqVar : this.i) {
                printWriter.println("    " + opqVar.a + " (minSize: " + opqVar.b + "x" + opqVar.c + ", screenSize: " + opqVar.d + "x" + opqVar.e + ")");
            }
        }
        this.g.h(printWriter);
    }

    public final void i() throws JSONException {
        ComponentName componentName;
        List<oqb> listCf = woy.cf(this.g.a);
        JSONArray jSONArray = new JSONArray();
        for (oqb oqbVar : listCf) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("widgetId", oqbVar.a);
            jSONObject.put("label", oqbVar.c);
            jSONObject.put("appName", oqbVar.d);
            AppWidgetProviderInfo appWidgetProviderInfo = oqbVar.b;
            if (appWidgetProviderInfo != null && (componentName = appWidgetProviderInfo.provider) != null) {
                jSONObject.put("packageName", componentName.getPackageName());
                jSONObject.put("className", componentName.getClassName());
            }
            ComponentName componentName2 = oqbVar.e;
            if (componentName2 != null) {
                jSONObject.put("pendingPackageName", componentName2.getPackageName());
                jSONObject.put("pendingClassName", componentName2.getClassName());
            }
            jSONArray.put(jSONObject);
        }
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.getClass();
        editorEdit.putString("widget_stack", jSONArray.toString());
        editorEdit.apply();
    }

    public final boolean j(ComponentName componentName) {
        Set set = (Set) this.j.e();
        return set != null && set.contains(componentName);
    }
}
