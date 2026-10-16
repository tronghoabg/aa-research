package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class adga implements adfz {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = adew.b;
        a = rjuVar.u("45738533", true);
        b = rjuVar.v("12", new acze(19), "EAAYAg");
    }

    @Override // defpackage.adfz
    public final ajfz a(Context context) {
        return (ajfz) b.gv(context);
    }

    @Override // defpackage.adfz
    public final boolean b(Context context) {
        return ((Boolean) a.gv(context)).booleanValue();
    }
}
