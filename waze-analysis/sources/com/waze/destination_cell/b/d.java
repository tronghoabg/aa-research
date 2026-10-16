package com.waze.destination_cell.b;

import android.content.res.Resources;
import android.text.TextUtils;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.ResourceDownloadType;
import com.waze.lm;
import com.waze.location.bg;
import com.waze.menus.SideMenuAutoCompleteRecycler;
import com.waze.menus.q;
import com.waze.navigate.AddressItem;
import com.waze.resources.ResourcesNativeManager;
import com.waze.search.stats.s;
import com.waze.search.t;
import com.waze.search.v2.gb;
import h.g.b.x;
import j$.util.Objects;
import l.a.bjz;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d extends a {

    /* renamed from: c, reason: collision with root package name */
    private final String f23497c;

    /* renamed from: d, reason: collision with root package name */
    private final SideMenuAutoCompleteRecycler f23498d;

    public d(com.waze.destination_cell.view.c cVar, String str, SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler) {
        super(cVar);
        this.f23497c = str;
        this.f23498d = sideMenuAutoCompleteRecycler;
    }

    @Override // com.waze.destination_cell.b.a
    protected final /* bridge */ /* synthetic */ void c(com.waze.menus.k kVar) {
        super.c((q) kVar);
        if (TextUtils.isEmpty(((q) this.f23492a).e())) {
            com.waze.destination_cell.view.c cVar = this.f23556b;
            cVar.k((NativeManager.getInstance().isDebug() && ((q) this.f23492a).b().e() == 1) ? R.drawable.cell_icon_location_debug : ((q) this.f23492a).c());
            cVar.j(((q) this.f23492a).n());
            return;
        }
        String strE = ((q) this.f23492a).e();
        com.waze.destination_cell.view.c cVar2 = this.f23556b;
        ResourcesNativeManager resourcesNativeManager = ResourcesNativeManager.getInstance();
        Resources resources = cVar2.getResources();
        ResourceDownloadType resourceDownloadType = ResourceDownloadType.RES_DOWNLOAD_AD_IMAGE;
        Objects.requireNonNull(cVar2);
        resourcesNativeManager.getOrDownloadSkinDrawable(resources, strE, resourceDownloadType, new b(cVar2, 2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.waze.destination_cell.view.d
    public final void f() {
        com.waze.search.stats.c cVar;
        AddressItem addressItemT;
        com.waze.sharedui.utils.c cVarF;
        com.waze.menus.k kVar = this.f23492a;
        if (kVar == null) {
            com.waze.shared_infra.i.h.g("AutoCompleteResultItemPresenter: AutoCompleteItem was null on destination cell clicked.");
            return;
        }
        com.waze.j.d dVarB = ((q) kVar).b();
        if (dVarB.e() == 5 || dVarB.e() == 6) {
            String strB = dVarB.b();
            x.f(strB, "query");
            com.waze.sharedui.a.e eVarE = lm.d().e();
            if (eVarE != null) {
                t tVar = new t();
                tVar.g(strB);
                tVar.h(eVarE, 1);
            }
        } else {
            com.waze.j.d dVarB2 = ((q) this.f23492a).b();
            if (dVarB2.e() == 4) {
                com.waze.ads.c.e.g("ADS_CATEGORY_AUTOCOMPLETE_INFO", ((q) this.f23492a).a(), false, this.f23497c, dVarB2.n(), dVarB2.m());
            }
            if (dVarB2.e() != 3 || dVarB2.t() == null) {
                this.f23498d.aY();
                NativeManager.getInstance().autoCompleteVenueGet(null, dVarB2.n(), dVarB2.m(), dVarB2.b(), false, 0, dVarB2.k(), this.f23497c);
            } else {
                this.f23498d.aX(dVarB2.t());
            }
        }
        com.waze.shared_infra.h.c cVarF2 = dVarB.f();
        Integer numValueOf = (!((q) this.f23492a).d().h() || (cVarF = bg.f(((q) this.f23492a).d())) == null) ? null : Integer.valueOf((int) cVarF.f39085b);
        s sVarA = s.f36105a.a();
        Long lValueOf = this.f23497c != null ? Long.valueOf(r2.trim().length()) : null;
        x.f(dVarB, "result");
        int iE = dVarB.e() - 1;
        if (iE != 2) {
            cVar = iE != 4 ? iE != 5 ? com.waze.search.stats.c.f36015d : dVarB instanceof com.waze.j.e ? com.waze.search.stats.c.f36018g : com.waze.search.stats.c.f36013b : com.waze.search.stats.c.f36014c;
        } else {
            AddressItem addressItemT2 = dVarB.t();
            cVar = addressItemT2 != null ? addressItemT2.getType() == 5 ? com.waze.search.stats.c.f36016e : addressItemT2.getType() == 8 ? com.waze.search.stats.c.f36017f : addressItemT2.getImage() != null ? com.waze.search.stats.c.f36015d : com.waze.search.stats.c.f36013b : com.waze.search.stats.c.f36015d;
        }
        com.waze.search.stats.c cVar2 = cVar;
        Long lValueOf2 = Long.valueOf(((q) this.f23492a).a());
        Integer numValueOf2 = Integer.valueOf(((q) this.f23492a).a());
        com.waze.search.stats.b bVarK = gb.k(dVarB.l());
        String strH = ((q) this.f23492a).h() == null ? "" : ((q) this.f23492a).h();
        com.waze.j.d dVarB3 = ((q) this.f23492a).b();
        String strD = dVarB3.d();
        if (dVarB3.e() == 3 && (addressItemT = dVarB3.t()) != null && (addressItemT.getCategory().intValue() == 1 || addressItemT.getCategory().intValue() == 5)) {
            strD = strD.replaceAll(".", "\\#");
        }
        sVarA.d(cVar2, lValueOf2, numValueOf2, lValueOf, numValueOf, null, bVarK, strH, strD, null, cVarF2, bjz.MOBILE_ANDROID);
    }
}
