package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oqu {
    public final int a;
    public final android.appwidget.AppWidgetProviderInfo b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final android.content.ComponentName e;

    public oqu(int i, android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo, java.lang.String str, java.lang.String str2, android.content.ComponentName componentName) {
        str2.getClass();
        this.a = i;
        this.b = appWidgetProviderInfo;
        this.c = str;
        this.d = str2;
        this.e = componentName;
    }

    public final boolean a() {
        android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo = this.b;
        return appWidgetProviderInfo != null && defpackage.afga.f(appWidgetProviderInfo.provider.getPackageName(), defpackage.oqk.a.a().f());
    }

    public final boolean b() {
        android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo = this.b;
        return appWidgetProviderInfo != null && 1 == (appWidgetProviderInfo.widgetFeatures & 1);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.oqu)) {
            return false;
        }
        defpackage.oqu oquVar = (defpackage.oqu) obj;
        return this.a == oquVar.a && defpackage.afga.f(this.b, oquVar.b) && defpackage.afga.f(this.c, oquVar.c) && defpackage.afga.f(this.d, oquVar.d) && defpackage.afga.f(this.e, oquVar.e);
    }

    public final int hashCode() {
        android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo = this.b;
        int iHashCode = (((((this.a * 31) + (appWidgetProviderInfo == null ? 0 : appWidgetProviderInfo.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        android.content.ComponentName componentName = this.e;
        return (iHashCode * 31) + (componentName != null ? componentName.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "WidgetStackItem(widgetId=" + this.a + ", appWidgetInfo=" + this.b + ", label=" + this.c + ", appName=" + this.d + ", pendingComponent=" + this.e + ")";
    }
}
