package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class adib implements adia {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = adgr.b;
        a = rjuVar.u("12", true);
        b = rjuVar.u("11", true);
    }

    @Override // defpackage.adia
    public final boolean a(Context context) {
        return ((Boolean) a.gv(context)).booleanValue();
    }

    @Override // defpackage.adia
    public final boolean b(Context context) {
        return ((Boolean) b.gv(context)).booleanValue();
    }
}
