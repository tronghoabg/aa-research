package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.SizeF;

/* loaded from: classes2.dex */
public final class oog extends oof {
    private static final yph c = yph.c("GH.WidgetHostView");
    private boolean d;

    public final void a(float f, float f2) {
        ((ype) c.f()).R("scaledWidth = %s x %s on %s", Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(getContext().getDisplay().getDisplayId()));
        Bundle bundle = new Bundle();
        int i = (int) f;
        bundle.putInt("appWidgetMinWidth", i);
        bundle.putInt("appWidgetMaxWidth", i);
        int i2 = (int) f2;
        bundle.putInt("appWidgetMinHeight", i2);
        bundle.putInt("appWidgetMaxHeight", i2);
        if (Build.VERSION.SDK_INT >= 37) {
            bundle.putInt("appWidgetDisplayId", getContext().getDisplay().getDisplayId());
        }
        updateAppWidgetSize(bundle, woy.bg(new SizeF(f, f2)));
    }

    @Override // android.appwidget.AppWidgetHostView
    public final void setAppWidget(int i, AppWidgetProviderInfo appWidgetProviderInfo) {
        this.d = true;
        super.setAppWidget(i, appWidgetProviderInfo);
        this.d = false;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (this.d) {
            return;
        }
        super.setPadding(i, i2, i3, i4);
    }
}
