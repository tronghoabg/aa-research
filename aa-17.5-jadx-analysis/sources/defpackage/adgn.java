package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class adgn implements adgm {
    private static final wcj a;
    private static final wcj b;
    private static final wcj c;
    private static final wcj d;

    static {
        rju rjuVar = adew.b;
        int i = 2;
        a = rjuVar.v("45800021", new adgj(i), "EOgHGAQ");
        b = rjuVar.u("45800022", false);
        c = rjuVar.u("45776518", true);
        d = rjuVar.v("10", new adgj(i), "EOgHGAQ");
    }

    @Override // defpackage.adgm
    public final ajfz a(Context context) {
        return (ajfz) a.gv(context);
    }

    @Override // defpackage.adgm
    public final ajfz b(Context context) {
        return (ajfz) d.gv(context);
    }

    @Override // defpackage.adgm
    public final boolean c(Context context) {
        return ((Boolean) c.gv(context)).booleanValue();
    }
}
