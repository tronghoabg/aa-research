package defpackage;

import android.appwidget.AppWidgetProviderInfo;

/* loaded from: classes2.dex */
public final class opo {
    public final int a;
    public final int b;
    public final AppWidgetProviderInfo c;

    public opo(int i, int i2, AppWidgetProviderInfo appWidgetProviderInfo) {
        this.a = i;
        this.b = i2;
        this.c = appWidgetProviderInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opo)) {
            return false;
        }
        opo opoVar = (opo) obj;
        return this.a == opoVar.a && this.b == opoVar.b && affa.f(this.c, opoVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "AddWidgetStatus(status=" + this.a + ", widgetId=" + this.b + ", providerInfo=" + this.c + ")";
    }
}
