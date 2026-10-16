package defpackage;

import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;

/* loaded from: classes.dex */
public final class opn extends AppWidgetHost {
    public opn(Context context) {
        super(context, 24);
    }

    @Override // android.appwidget.AppWidgetHost
    protected final AppWidgetHostView onCreateView(Context context, int i, AppWidgetProviderInfo appWidgetProviderInfo) {
        context.getClass();
        appWidgetProviderInfo.getClass();
        return new oog(context);
    }
}
