package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oqt implements defpackage.mnj {
    public final defpackage.tdr a = new defpackage.tdr(new java.util.ArrayList());

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        android.content.ComponentName componentName;
        printWriter.getClass();
        defpackage.tdr tdrVar = this.a;
        printWriter.println("  WidgetStack (size = " + tdrVar.b() + "):");
        if (tdrVar.isEmpty()) {
            printWriter.println("    Empty");
            return;
        }
        int i = 0;
        java.util.ListIterator listIterator = tdrVar.listIterator(0);
        while (listIterator.hasNext()) {
            int i2 = i + 1;
            defpackage.oqu oquVar = (defpackage.oqu) listIterator.next();
            android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo = oquVar.b;
            if (appWidgetProviderInfo == null || (componentName = appWidgetProviderInfo.provider) == null) {
                componentName = oquVar.e;
            }
            printWriter.println("    Widget #" + i + ": id=" + oquVar.a + ", app='" + oquVar.d + "', label='" + oquVar.c + "', component=" + componentName + ", isLlm=" + oquVar.a() + ", isReconfigurable=" + oquVar.b());
            if (appWidgetProviderInfo != null) {
                printWriter.println("      AppWidgetInfo: minWidth=" + appWidgetProviderInfo.minWidth + ", minHeight=" + appWidgetProviderInfo.minHeight + ", minResizeWidth=" + appWidgetProviderInfo.minResizeWidth + ", minResizeHeight=" + appWidgetProviderInfo.minResizeHeight + ", resizeMode=" + appWidgetProviderInfo.resizeMode + ", configure=" + appWidgetProviderInfo.configure);
            }
            i = i2;
        }
    }
}
