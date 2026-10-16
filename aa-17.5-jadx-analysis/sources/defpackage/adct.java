package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class adct implements adcs {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = adck.b;
        a = rjuVar.u("45729759", false);
        b = rjuVar.u("45729445", false);
    }

    @Override // defpackage.adcs
    public final boolean a(Context context) {
        return ((Boolean) a.gv(context)).booleanValue();
    }

    @Override // defpackage.adcs
    public final boolean b(Context context) {
        return ((Boolean) b.gv(context)).booleanValue();
    }
}
