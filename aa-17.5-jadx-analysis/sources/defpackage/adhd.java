package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class adhd implements adhc {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = adgr.b;
        a = rjuVar.u("45367388", true);
        b = rjuVar.u("45373269", true);
    }

    @Override // defpackage.adhc
    public final boolean a(Context context) {
        return ((Boolean) a.gv(context)).booleanValue();
    }

    @Override // defpackage.adhc
    public final boolean b(Context context) {
        return ((Boolean) b.gv(context)).booleanValue();
    }
}
