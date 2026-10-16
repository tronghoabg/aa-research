package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class adie implements adid {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = adgr.b;
        a = rjuVar.u("13", false);
        b = rjuVar.u("10", true);
    }

    @Override // defpackage.adid
    public final boolean a(Context context) {
        return ((Boolean) a.gv(context)).booleanValue();
    }

    @Override // defpackage.adid
    public final boolean b(Context context) {
        return ((Boolean) b.gv(context)).booleanValue();
    }
}
