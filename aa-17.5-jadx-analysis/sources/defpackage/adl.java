package defpackage;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class adl {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final kwp a(bux buxVar) {
        dlg dlgVar = (dlg) buxVar.f(dbc.d);
        boolean z = buxVar.z(dlgVar.a());
        Object objG = buxVar.g();
        if (z || objG == buw.a) {
            objG = new kwp(new adk(dlgVar), (byte[]) null);
            buxVar.x(objG);
        }
        return (kwp) objG;
    }
}
