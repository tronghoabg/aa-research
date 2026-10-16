package defpackage;

import android.appwidget.AppWidgetProviderInfo;

/* loaded from: classes2.dex */
public final class opi extends mva {
    public final int a;
    public final AppWidgetProviderInfo b;

    public opi(int i, AppWidgetProviderInfo appWidgetProviderInfo) {
        this.a = i;
        this.b = appWidgetProviderInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opi)) {
            return false;
        }
        opi opiVar = (opi) obj;
        return this.a == opiVar.a && affa.f(this.b, opiVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LiveWidget(widgetId=" + this.a + ", info=" + this.b + ")";
    }
}
