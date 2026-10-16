package com.waze.design_components;

import android.R;
import android.app.Activity;
import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.android.material.snackbar.r;
import com.waze.design_components.c.i;
import com.waze.design_components.c.j;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class d {
    public /* synthetic */ d(byte[] bArr) {
    }

    public static void a(Activity activity, String str, b bVar) {
        x.f(activity, "activity");
        x.f(str, "snackbarLabel");
        r rVarB = r.B(activity.findViewById(R.id.content), str);
        Activity activity2 = activity;
        rVarB.E(ContextCompat.getColor(activity2, com.waze.R.color.on_primary));
        rVarB.C(ContextCompat.getColor(activity2, com.waze.R.color.background_default_negative));
        rVarB.D((int) (activity.getResources().getDisplayMetrics().density * 75.0f));
        rVarB.x();
        rVarB.A(new c(bVar));
        rVarB.t();
    }

    public static i c(Context context, j jVar) {
        x.f(context, "context");
        x.f(jVar, "wazeDialogData");
        i iVar = new i(context);
        iVar.b(jVar);
        iVar.show();
        return iVar;
    }

    private d() {
        throw null;
    }
}
