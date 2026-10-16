package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class adgk implements adgi {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = adew.b;
        a = rjuVar.u("45782874", false);
        b = rjuVar.v("9", new adgj(0), "EOgHGAQ");
    }

    @Override // defpackage.adgi
    public final ajfz a(Context context) {
        return (ajfz) b.gv(context);
    }

    @Override // defpackage.adgi
    public final boolean b(Context context) {
        return ((Boolean) a.gv(context)).booleanValue();
    }
}
