package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class adih implements adig {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = adgr.b;
        a = rjuVar.u("14", true);
        b = rjuVar.t("15", "com.google.android.surveys.testapp,com.google.android.projection.gearhead,com.google.android.tvrecommendations,com.google.android.apps.tv.launcherx,com.google.android.gms");
    }

    @Override // defpackage.adig
    public final String a(Context context) {
        return (String) b.gv(context);
    }

    @Override // defpackage.adig
    public final boolean b(Context context) {
        return ((Boolean) a.gv(context)).booleanValue();
    }
}
