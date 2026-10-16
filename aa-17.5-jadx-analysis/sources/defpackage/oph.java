package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.widget.RemoteViews;

/* loaded from: classes2.dex */
public final class oph extends mva {
    public final RemoteViews a;
    public final AppWidgetProviderInfo b;

    public oph(RemoteViews remoteViews, AppWidgetProviderInfo appWidgetProviderInfo) {
        this.a = remoteViews;
        this.b = appWidgetProviderInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oph)) {
            return false;
        }
        oph ophVar = (oph) obj;
        return affa.f(this.a, ophVar.a) && affa.f(this.b, ophVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LiveRemoteViews(remoteViews=" + this.a + ", info=" + this.b + ")";
    }
}
