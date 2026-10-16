package com.waze.destination_cell.b;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.waze.R;
import com.waze.navigate.AddressItem;
import com.waze.resources.ResourcesNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class k extends com.waze.destination_cell.view.d {

    /* renamed from: a, reason: collision with root package name */
    AddressItem f23512a;

    k(com.waze.destination_cell.view.c cVar) {
        super(cVar);
    }

    protected void e(com.waze.destination_cell.a.a aVar) {
        super.l();
        com.waze.destination_cell.view.c cVar = this.f23556b;
        cVar.o(aVar.e());
        cVar.g(aVar.a());
        cVar.m(aVar.d());
        if (aVar.i() != 2) {
            aVar.i();
            cVar.n(R.color.content_p2);
        } else {
            cVar.n(R.color.primary_variant);
        }
        h(aVar);
        if ((aVar instanceof com.waze.favorites.d) && ((com.waze.favorites.d) aVar).j()) {
            cVar.d(com.waze.destination_cell.view.b.EDITING);
        } else if (aVar.h()) {
            cVar.d(com.waze.destination_cell.view.b.MORE_OPTION);
        } else if (aVar.i() == 2) {
            cVar.d(com.waze.destination_cell.view.b.CHEVRON);
        }
    }

    protected void h(com.waze.destination_cell.a.a aVar) {
        if (!TextUtils.isEmpty(aVar.f())) {
            com.waze.utils.i.a().d(aVar.f(), new j(this, aVar, 0), aVar);
            return;
        }
        if (!TextUtils.isEmpty(aVar.g()) && !aVar.g().equals("category_menu_default")) {
            com.waze.destination_cell.view.c cVar = this.f23556b;
            Drawable skinDrawable = ResourcesNativeManager.getInstance().getSkinDrawable(cVar.getResources(), com.waze.resources.a.c(aVar.g()));
            if (skinDrawable != null) {
                cVar.i(skinDrawable);
                return;
            }
        }
        if (aVar.c() != null) {
            this.f23556b.k(aVar.c().intValue());
        }
    }

    public final void i(com.waze.destination_cell.a.a aVar) {
        this.f23512a = aVar.b();
        e(aVar);
    }
}
