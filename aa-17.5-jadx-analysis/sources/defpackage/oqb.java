package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class oqb {
    public final int a;
    public final AppWidgetProviderInfo b;
    public final String c;
    public final String d;
    public final ComponentName e;

    public oqb(int i, AppWidgetProviderInfo appWidgetProviderInfo, String str, String str2, ComponentName componentName) {
        str2.getClass();
        this.a = i;
        this.b = appWidgetProviderInfo;
        this.c = str;
        this.d = str2;
        this.e = componentName;
    }

    public final boolean a() {
        AppWidgetProviderInfo appWidgetProviderInfo = this.b;
        return appWidgetProviderInfo != null && affa.f(appWidgetProviderInfo.provider.getPackageName(), opr.a.a().f());
    }

    public final boolean b() {
        AppWidgetProviderInfo appWidgetProviderInfo = this.b;
        return appWidgetProviderInfo != null && 1 == (appWidgetProviderInfo.widgetFeatures & 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqb)) {
            return false;
        }
        oqb oqbVar = (oqb) obj;
        return this.a == oqbVar.a && affa.f(this.b, oqbVar.b) && affa.f(this.c, oqbVar.c) && affa.f(this.d, oqbVar.d) && affa.f(this.e, oqbVar.e);
    }

    public final int hashCode() {
        AppWidgetProviderInfo appWidgetProviderInfo = this.b;
        int iHashCode = (((((this.a * 31) + (appWidgetProviderInfo == null ? 0 : appWidgetProviderInfo.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        ComponentName componentName = this.e;
        return (iHashCode * 31) + (componentName != null ? componentName.hashCode() : 0);
    }

    public final String toString() {
        return "WidgetStackItem(widgetId=" + this.a + ", appWidgetInfo=" + this.b + ", label=" + this.c + ", appName=" + this.d + ", pendingComponent=" + this.e + ")";
    }
}
