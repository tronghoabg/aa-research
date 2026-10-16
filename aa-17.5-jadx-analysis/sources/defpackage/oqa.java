package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class oqa implements mnd {
    public final tcv a = new tcv(new ArrayList());

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        ComponentName componentName;
        printWriter.getClass();
        tcv tcvVar = this.a;
        printWriter.println("  WidgetStack (size = " + tcvVar.b() + "):");
        if (tcvVar.isEmpty()) {
            printWriter.println("    Empty");
            return;
        }
        int i = 0;
        ListIterator listIterator = tcvVar.listIterator(0);
        while (listIterator.hasNext()) {
            int i2 = i + 1;
            oqb oqbVar = (oqb) listIterator.next();
            AppWidgetProviderInfo appWidgetProviderInfo = oqbVar.b;
            if (appWidgetProviderInfo == null || (componentName = appWidgetProviderInfo.provider) == null) {
                componentName = oqbVar.e;
            }
            printWriter.println("    Widget #" + i + ": id=" + oqbVar.a + ", app='" + oqbVar.d + "', label='" + oqbVar.c + "', component=" + componentName + ", isLlm=" + oqbVar.a() + ", isReconfigurable=" + oqbVar.b());
            if (appWidgetProviderInfo != null) {
                printWriter.println("      AppWidgetInfo: minWidth=" + appWidgetProviderInfo.minWidth + ", minHeight=" + appWidgetProviderInfo.minHeight + ", minResizeWidth=" + appWidgetProviderInfo.minResizeWidth + ", minResizeHeight=" + appWidgetProviderInfo.minResizeHeight + ", resizeMode=" + appWidgetProviderInfo.resizeMode + ", configure=" + appWidgetProviderInfo.configure);
            }
            i = i2;
        }
    }
}
