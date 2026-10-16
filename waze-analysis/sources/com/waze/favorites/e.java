package com.waze.favorites;

import android.support.v7.widget.fe;
import com.waze.an.c.w;
import com.waze.ui.z.as;
import j$.util.Objects;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends android.support.v7.widget.a.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FavoritesActivity f23801a;

    e(FavoritesActivity favoritesActivity) {
        Objects.requireNonNull(favoritesActivity);
        this.f23801a = favoritesActivity;
    }

    @Override // android.support.v7.widget.a.f
    public final void c(fe feVar, int i2) {
        w wVarB;
        if (i2 == 2) {
            FavoritesActivity favoritesActivity = this.f23801a;
            favoritesActivity.n = (a) favoritesActivity.f23784h.get(feVar.getAdapterPosition());
            favoritesActivity.m = feVar.itemView;
            com.waze.view.anim.g.d(favoritesActivity.m).translationZ(as.h(favoritesActivity.getResources(), 16));
            return;
        }
        if (i2 == 0) {
            FavoritesActivity favoritesActivity2 = this.f23801a;
            if (favoritesActivity2.m != null) {
                com.waze.view.anim.g.d(favoritesActivity2.m).translationZ(0.0f);
            }
            if (favoritesActivity2.n != null) {
                w wVarB2 = favoritesActivity2.n.b();
                int iIndexOf = favoritesActivity2.f23784h.indexOf(favoritesActivity2.n);
                if (iIndexOf == 0) {
                    wVarB = null;
                } else {
                    wVarB = ((a) favoritesActivity2.f23784h.get(iIndexOf - 1)).b();
                }
                ((k) com.waze.web.r.h(k.class)).f(wVarB2, wVarB);
            }
        }
    }

    @Override // android.support.v7.widget.a.f
    public final void d() {
        FavoritesActivity favoritesActivity = this.f23801a;
        favoritesActivity.n = null;
        favoritesActivity.m = null;
    }

    @Override // android.support.v7.widget.a.f
    public final int e() {
        return (true != this.f23801a.f23786l ? 0 : 3) << 16;
    }

    @Override // android.support.v7.widget.a.f
    public final void g(fe feVar, fe feVar2) {
        FavoritesActivity favoritesActivity = this.f23801a;
        int adapterPosition = feVar.getAdapterPosition();
        int adapterPosition2 = feVar2.getAdapterPosition();
        Collections.swap(favoritesActivity.f23784h, adapterPosition, adapterPosition2);
        favoritesActivity.f23785k.j().notifyItemMoved(adapterPosition2, adapterPosition);
    }
}
