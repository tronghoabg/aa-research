package com.waze.sharedui;

import android.content.Context;
import com.waze.R;
import com.waze.sharedui.g.p;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends c {
    public static b a(int i2, String str) {
        return new i(i2, str);
    }

    public static b b() {
        return new i(0, "");
    }

    public static b c() {
        return new i(-1, "");
    }

    @Override // com.waze.sharedui.c, com.waze.sharedui.b
    public final void openErrorDialog(Context context, Runnable runnable) {
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        p pVar = new p(context);
        pVar.h(aVarA.c(R.string.CARPOOL_ERR_GENERAL_TEMP, new Object[0]));
        pVar.c(aVarA.c(R.string.OK, new Object[0]), null);
        pVar.b(R.drawable.error_icon);
        pVar.j();
        pVar.i();
        com.waze.shared_infra.i.h.a("EditTimeslot - did show error dialog");
    }
}
