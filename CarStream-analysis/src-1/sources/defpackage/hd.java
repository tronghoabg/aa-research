package defpackage;

import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class hd extends AppWidgetHostView {
    public final /* synthetic */ id a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd(id idVar, Context context) {
        super(context);
        this.a = idVar;
    }

    @Override // android.appwidget.AppWidgetHostView
    public final void updateAppWidget(RemoteViews remoteViews) throws NumberFormatException {
        super.updateAppWidget(remoteViews);
        id idVar = this.a;
        if (idVar.c == null) {
            return;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        idVar.c(idVar.c, map, map2);
        String str = (String) map.get("speed_limit_widget_text_view");
        if (str == null) {
            str = "";
        }
        int i = -1;
        try {
            int i2 = Integer.parseInt(str.replaceAll("[^0-9]", ""));
            if (i2 > 0) {
                i = i2;
            }
        } catch (Exception unused) {
        }
        ArrayList arrayList = new ArrayList();
        Bitmap bitmap = (Bitmap) map2.get("warning_alert_image");
        String str2 = (String) map.get("warning_speed_distance_text_view");
        if (str2 == null) {
            str2 = "";
        }
        idVar.a(arrayList, bitmap, str2);
        Bitmap bitmap2 = (Bitmap) map2.get("second_warning_alert_image");
        String str3 = (String) map.get("second_warning_speed_distance_text_view");
        idVar.a(arrayList, bitmap2, str3 != null ? str3 : "");
        w7.c(arrayList, i);
    }
}
