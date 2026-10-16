package defpackage;

import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class gd extends AppWidgetHost {
    public final /* synthetic */ id a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(id idVar, Context context) {
        super(context, 22177);
        this.a = idVar;
    }

    @Override // android.appwidget.AppWidgetHost
    public final AppWidgetHostView onCreateView(Context context, int i, AppWidgetProviderInfo appWidgetProviderInfo) {
        return new hd(this.a, context);
    }
}
