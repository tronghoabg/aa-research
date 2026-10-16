package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class adgu implements adgt {
    private static final wcj a;
    private static final wcj b;
    private static final wcj c;

    static {
        rju rjuVar = adgr.b;
        a = rjuVar.t("7", "SURVEYS");
        b = rjuVar.u("9", false);
        c = rjuVar.u("6", true);
    }

    @Override // defpackage.adgt
    public final String a(Context context) {
        return (String) a.gv(context);
    }

    @Override // defpackage.adgt
    public final boolean b(Context context) {
        return ((Boolean) b.gv(context)).booleanValue();
    }

    @Override // defpackage.adgt
    public final boolean c(Context context) {
        return ((Boolean) c.gv(context)).booleanValue();
    }
}
