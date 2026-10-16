package com.waze.settings.tree.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.waze.ifs.ui.aj;
import com.waze.settings.de;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends aj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        h.g.b.x.f(context, "context");
    }

    public final void f(com.waze.settings.tree.d.b bVar, de deVar) {
        Drawable drawable;
        h.g.b.x.f(bVar, "setting");
        h.g.b.x.f(deVar, "page");
        for (com.waze.settings.tree.d.g gVar : bVar.f()) {
            com.waze.settings.tree.d dVarM = gVar.m();
            if (dVarM instanceof com.waze.settings.tree.b) {
                drawable = ((com.waze.settings.tree.b) dVarM).a();
            } else if (dVarM instanceof com.waze.settings.tree.a) {
                drawable = ContextCompat.getDrawable(getContext(), ((com.waze.settings.tree.a) dVarM).a());
            } else {
                com.waze.shared_infra.i.h.g("Invalid SettingCardSelector option: ".concat(String.valueOf(gVar.t())));
                drawable = null;
            }
            com.waze.settings.tree.d dVarD = gVar.d();
            Context context = getContext();
            h.g.b.x.e(context, "getContext(...)");
            Drawable drawableP = com.waze.nightmode.e.p(dVarD, context);
            String strT = gVar.t();
            h.g.b.x.c(strT);
            a(strT, drawable, drawableP);
        }
        int iC = bVar.c();
        c(iC == -1 ? 0 : iC);
        e(new h(bVar, iC, this, deVar));
        setTag(bVar.s());
    }
}
