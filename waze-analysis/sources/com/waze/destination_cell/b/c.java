package com.waze.destination_cell.b;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.waze.R;
import com.waze.ResourceDownloadType;
import com.waze.b.u;
import com.waze.lm;
import com.waze.menus.SideMenuAutoCompleteRecycler;
import com.waze.navigate.AddressItem;
import com.waze.resources.ResourcesNativeManager;
import com.waze.search.stats.s;
import com.waze.search.t;
import h.g.b.x;
import l.a.bjz;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name */
    private final SideMenuAutoCompleteRecycler f23496c;

    public c(com.waze.destination_cell.view.c cVar, SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler) {
        super(cVar);
        this.f23496c = sideMenuAutoCompleteRecycler;
    }

    public static /* synthetic */ void e(c cVar, Drawable drawable) {
        if (drawable == null) {
            cVar.h();
            return;
        }
        com.waze.destination_cell.view.c cVar2 = cVar.f23556b;
        x.f(drawable, "drawable");
        cVar2.i(drawable);
    }

    private final void h() {
        this.f23556b.k(((com.waze.menus.i) this.f23492a).c());
    }

    private static final void i() {
        s.f36105a.a().n(com.waze.search.stats.k.f36058a, null, null, null, null, null, bjz.MOBILE_ANDROID);
    }

    @Override // com.waze.destination_cell.b.a
    protected final /* synthetic */ void c(com.waze.menus.k kVar) {
        super.c((com.waze.menus.i) kVar);
        if (((com.waze.menus.i) this.f23492a).b() == com.waze.menus.j.f29726a) {
            com.waze.menus.a aVar = (com.waze.menus.a) this.f23492a;
            AddressItem addressItemA = aVar.a();
            if (!TextUtils.isEmpty(addressItemA.getImageUrl())) {
                com.waze.utils.i.a().d(addressItemA.getImageUrl(), new j(this, addressItemA, 1), addressItemA);
                return;
            }
            if (addressItemA.hasIcon()) {
                com.waze.destination_cell.view.c cVar = this.f23556b;
                Drawable skinDrawable = ResourcesNativeManager.getInstance().getSkinDrawable(cVar.getResources(), com.waze.resources.a.c(addressItemA.getIcon()));
                if (skinDrawable == null && addressItemA.getImage() != null) {
                    cVar.k(aVar.c());
                    return;
                } else if (skinDrawable != null) {
                    cVar.i(skinDrawable);
                    return;
                }
            }
        }
        if (TextUtils.isEmpty(((com.waze.menus.i) this.f23492a).e())) {
            h();
            return;
        }
        ResourcesNativeManager.getInstance().getOrDownloadSkinDrawable(this.f23556b.getResources(), ((com.waze.menus.i) this.f23492a).e(), ResourceDownloadType.RES_DOWNLOAD_AD_IMAGE, new b(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.waze.destination_cell.view.d
    public final void f() {
        if (this.f23492a == null) {
            com.waze.shared_infra.i.h.g("AutoCompleteDefaultItemPresenter: AutoCompleteItem was null on destination cell clicked.");
        }
        com.waze.menus.j jVar = com.waze.menus.j.f29726a;
        switch (((com.waze.menus.i) this.f23492a).b().ordinal()) {
            case 0:
                this.f23496c.aT(((com.waze.menus.a) this.f23492a).a());
                break;
            case 1:
                i();
                this.f23496c.aW();
                break;
            case 2:
                i();
                this.f23496c.aV();
                break;
            case 3:
                i();
                t.i();
                break;
            case 4:
                i();
                com.waze.sharedui.a.e eVarE = lm.d().e();
                if (eVarE != null) {
                    t tVar = new t();
                    tVar.d("charging_station");
                    com.waze.shared_infra.o.b.a().c(R.string.EV_STANDALONE_SEARCH_CHARGING_STATIONS_RESULTS_SCREEN_TITLE, new Object[0]);
                    tVar.h(eVarE, 1);
                    break;
                }
                break;
            case 5:
                i();
                final SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler = this.f23496c;
                final com.waze.menus.i iVar = (com.waze.menus.i) this.f23492a;
                new com.waze.bb.c(sideMenuAutoCompleteRecycler.getContext(), ((com.waze.b.s) u.f16171a.a().a().d()).d(), new com.waze.bb.b() { // from class: com.waze.menus.x
                    @Override // com.waze.bb.b
                    public final void a(boolean z) {
                        SideMenuAutoCompleteRecycler.aO(sideMenuAutoCompleteRecycler, iVar, z);
                    }
                }).show();
                break;
            case 6:
                this.f23496c.aU();
                break;
        }
    }
}
