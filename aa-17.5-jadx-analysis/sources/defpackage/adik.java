package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class adik implements adij {
    private static final wcj a;
    private static final wcj b;
    private static final wcj c;
    private static final wcj d;

    static {
        rju rjuVar = adgr.b;
        a = rjuVar.t("20", "com.google.android.surveys.testapp,com.google.android.tvrecommendations,com.google.android.apps.tv.launcherx");
        b = rjuVar.u("18", false);
        c = rjuVar.u("22", true);
        d = rjuVar.u("21", false);
    }

    @Override // defpackage.adij
    public final String a(Context context) {
        return (String) a.gv(context);
    }

    @Override // defpackage.adij
    public final boolean b(Context context) {
        return ((Boolean) b.gv(context)).booleanValue();
    }

    @Override // defpackage.adij
    public final boolean c(Context context) {
        return ((Boolean) c.gv(context)).booleanValue();
    }

    @Override // defpackage.adij
    public final boolean d(Context context) {
        return ((Boolean) d.gv(context)).booleanValue();
    }
}
