package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class adfu implements adft {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = adew.b;
        a = rjuVar.u("45359255", false);
        b = rjuVar.u("36", true);
    }

    @Override // defpackage.adft
    public final boolean a(Context context) {
        return ((Boolean) a.gv(context)).booleanValue();
    }

    @Override // defpackage.adft
    public final boolean b(Context context) {
        return ((Boolean) b.gv(context)).booleanValue();
    }
}
