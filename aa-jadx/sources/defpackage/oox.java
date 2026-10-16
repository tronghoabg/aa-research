package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oox extends defpackage.oow {
    private static final defpackage.yqm c = defpackage.yqm.c("GH.WidgetHostView");
    private boolean d;

    public final void a(float f, float f2) {
        ((defpackage.yqj) c.f()).R("scaledWidth = %s x %s on %s", java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2), java.lang.Integer.valueOf(getContext().getDisplay().getDisplayId()));
        android.os.Bundle bundle = new android.os.Bundle();
        int i = (int) f;
        bundle.putInt("appWidgetMinWidth", i);
        bundle.putInt("appWidgetMaxWidth", i);
        int i2 = (int) f2;
        bundle.putInt("appWidgetMinHeight", i2);
        bundle.putInt("appWidgetMaxHeight", i2);
        if (android.os.Build.VERSION.SDK_INT >= 37) {
            bundle.putInt("appWidgetDisplayId", getContext().getDisplay().getDisplayId());
        }
        updateAppWidgetSize(bundle, defpackage.afga.aa(new android.util.SizeF(f, f2)));
    }

    @Override // android.appwidget.AppWidgetHostView
    public final void setAppWidget(int i, android.appwidget.AppWidgetProviderInfo appWidgetProviderInfo) {
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
