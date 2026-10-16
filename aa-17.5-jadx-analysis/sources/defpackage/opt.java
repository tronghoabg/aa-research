package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class opt {
    public final String a;
    public final String b;
    public final AppWidgetProviderInfo c;
    public final Drawable d;
    public final String e;

    public opt(String str, String str2, AppWidgetProviderInfo appWidgetProviderInfo, Drawable drawable, String str3) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = appWidgetProviderInfo;
        this.d = drawable;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opt)) {
            return false;
        }
        opt optVar = (opt) obj;
        return affa.f(this.a, optVar.a) && affa.f(this.b, optVar.b) && affa.f(this.c, optVar.c) && affa.f(this.d, optVar.d) && affa.f(this.e, optVar.e);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        String str = this.e;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "WidgetPickerItem(label=" + this.a + ", appName=" + this.b + ", providerInfo=" + this.c + ", appIcon=" + this.d + ", description=" + this.e + ")";
    }
}
