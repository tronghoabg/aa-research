package com.waze.authentication;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Pane;
import androidx.car.app.model.Row;
import androidx.car.app.model.Toggle;
import androidx.car.app.navigation.model.MapController;
import androidx.car.app.navigation.model.MapTemplate;
import androidx.core.graphics.drawable.IconCompat;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKeys;
import com.waze.R;
import com.waze.car_lib.p.dh;
import com.waze.search.h.cd;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class ax {
    public /* synthetic */ ax(byte[] bArr) {
    }

    private static SharedPreferences a(Context context, String str) {
        SharedPreferences sharedPreferencesCreate = EncryptedSharedPreferences.create("com.waze.authentication", str, context, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        h.g.b.x.e(sharedPreferencesCreate, "create(...)");
        return sharedPreferencesCreate;
    }

    public static SharedPreferences c(Context context) {
        Object objA;
        h.g.b.x.f(context, "context");
        String orCreate = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC);
        try {
            h.g.b.x.c(orCreate);
            objA = a(context, orCreate);
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            com.waze.shared_infra.i.h.j("recreating auth shared preferences: ".concat(String.valueOf(thC.getMessage())));
            context.deleteSharedPreferences("com.waze.authentication");
            h.g.b.x.c(orCreate);
            objA = a(context, orCreate);
        }
        return (SharedPreferences) objA;
    }

    public static /* synthetic */ com.waze.search.e.r d(com.waze.w.i iVar, com.waze.search.e.j jVar) {
        if ((iVar instanceof com.waze.w.f) || (iVar instanceof com.waze.w.e)) {
            return com.waze.search.e.r.f35647a;
        }
        if (!(iVar instanceof com.waze.w.h)) {
            throw new h.i();
        }
        com.waze.w.h hVar = (com.waze.w.h) iVar;
        com.waze.w.g gVarC = hVar.c();
        com.waze.w.g gVar = com.waze.w.g.f45428a;
        int iOrdinal = gVarC.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return cd.a(hVar.d(), jVar);
            }
            throw new h.i();
        }
        com.waze.ui.ac.i iVarE = hVar.e();
        if (iVarE != null) {
            com.waze.search.e.r rVar = iVarE instanceof com.waze.ui.ac.h ? com.waze.search.e.r.f35649c : com.waze.search.e.r.f35647a;
            if (rVar != null) {
                return rVar;
            }
        }
        return com.waze.search.e.r.f35647a;
    }

    public static /* synthetic */ com.waze.ui.ac.i e(com.waze.w.i iVar) {
        if (iVar instanceof com.waze.w.f) {
            return new com.waze.ui.ac.f(com.waze.design_components.b.d.ar.c(com.waze.design_components.b.e.f23312a));
        }
        if (!(iVar instanceof com.waze.w.h)) {
            if (iVar instanceof com.waze.w.e) {
                return new com.waze.ui.ac.f(com.waze.design_components.b.d.aj.c(com.waze.design_components.b.e.f23312a));
            }
            throw new h.i();
        }
        com.waze.w.h hVar = (com.waze.w.h) iVar;
        com.waze.w.g gVarC = hVar.c();
        com.waze.w.g gVar = com.waze.w.g.f45428a;
        int iOrdinal = gVarC.ordinal();
        if (iOrdinal == 0) {
            com.waze.ui.ac.i iVarE = hVar.e();
            return iVarE == null ? new com.waze.ui.ac.f(com.waze.design_components.b.d.I.c(com.waze.design_components.b.e.f23312a)) : iVarE;
        }
        if (iOrdinal == 1) {
            return cd.b(hVar.d());
        }
        throw new h.i();
    }

    public static /* synthetic */ com.waze.settings.v f(com.waze.w.i iVar, com.waze.shared_infra.o.a aVar, h.g.a.l lVar, com.waze.j.n nVar, h.g.a.a aVar2) {
        com.waze.search.e.k kVar;
        if (((Boolean) aVar2.invoke()).booleanValue() && nVar != null) {
            String strB = new com.waze.sharedui.utils.c(nVar.a()).b(aVar);
            h.g.b.x.e(strB, "getFullFormattedString(...)");
            return new com.waze.search.e.k(new com.waze.ui.ac.m(strB));
        }
        com.waze.sharedui.utils.c cVar = (com.waze.sharedui.utils.c) lVar.invoke(iVar.b().d());
        if (cVar != null) {
            String strB2 = cVar.b(aVar);
            h.g.b.x.e(strB2, "getFullFormattedString(...)");
            kVar = new com.waze.search.e.k(new com.waze.ui.ac.m(strB2));
        } else {
            kVar = null;
        }
        return kVar;
    }

    public static MapTemplate g(Context context, com.waze.car_lib.p.ak akVar, boolean z, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.l lVar, h.g.a.a aVar4, h.g.a.a aVar5) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(akVar, "state");
        h.g.b.x.f(aVar, "firstActionClicked");
        h.g.b.x.f(aVar2, "secondActionClicked");
        h.g.b.x.f(aVar3, "onCloseClicked");
        h.g.b.x.f(lVar, "onPanModeChanged");
        h.g.b.x.f(aVar4, "zoomInClicked");
        h.g.b.x.f(aVar5, "zoomOutClicked");
        MapTemplate.Builder builder = new MapTemplate.Builder();
        Header.Builder builder2 = new Header.Builder();
        com.waze.n.aq aqVarF = akVar.f();
        int i2 = 0;
        if (h.g.b.x.n(aqVarF, com.waze.car_lib.p.ag.f20542a)) {
            builder2.setStartHeaderAction(Action.BACK);
        } else {
            boolean zN = h.g.b.x.n(aqVarF, com.waze.car_lib.p.ah.f20543a);
            int i3 = R.drawable.icon_outline_routes_30px;
            if (zN) {
                builder2.setStartHeaderAction(Action.BACK);
                Integer numC = akVar.c();
                if (numC != null) {
                    numC.intValue();
                } else {
                    i3 = R.drawable.icon_outline_close_30px;
                }
                builder2.addEndHeaderAction(dh.G(i3, context, false, aVar3, 12));
            } else {
                if (!(aqVarF instanceof com.waze.car_lib.p.ai)) {
                    throw new h.i();
                }
                Integer numC2 = akVar.c();
                if (numC2 != null) {
                    numC2.intValue();
                } else {
                    i3 = R.drawable.icon_outline_close_30px;
                }
                builder2.addEndHeaderAction(dh.G(i3, context, false, aVar3, 12));
                builder2.setTitle(((com.waze.car_lib.p.ai) akVar.f()).a());
            }
        }
        builder.setHeader(builder2.build());
        Pane.Builder builder3 = new Pane.Builder();
        Row.Builder builder4 = new Row.Builder();
        builder4.setTitle(akVar.e());
        builder4.addText(akVar.d());
        builder3.addRow(builder4.build());
        com.waze.car_lib.p.af afVarA = akVar.a();
        if (afVarA != null) {
            builder3.addAction(dh.I(afVarA.a(), afVarA.c(), afVarA.b(), new com.waze.car_lib.screens.b.a(aVar, 5)));
        }
        com.waze.car_lib.p.af afVarB = akVar.b();
        if (afVarB != null) {
            builder3.addAction(dh.I(afVarB.a(), afVarB.c(), afVarB.b(), new com.waze.car_lib.screens.b.a(aVar2, 6)));
        }
        builder.setPane(builder3.build());
        MapController.Builder builder5 = new MapController.Builder();
        builder5.setPanModeListener(new com.waze.car_lib.p.ae(lVar, i2));
        builder5.setMapActionStrip(dh.K(context, z, aVar4, aVar5));
        builder.setMapController(builder5.build());
        MapTemplate mapTemplateBuild = builder.build();
        h.g.b.x.e(mapTemplateBuild, "build(...)");
        return mapTemplateBuild;
    }

    public static MapTemplate h(Context context, com.waze.n.ac acVar, h.g.a.a aVar, final h.g.a.l lVar) {
        h.g.b.x.f(context, "carContext");
        h.g.b.x.f(acVar, "state");
        h.g.b.x.f(aVar, "onCloseClicked");
        h.g.b.x.f(lVar, "onItemClicked");
        if (!(acVar instanceof com.waze.car_lib.p.ac)) {
            if (!(acVar instanceof com.waze.car_lib.p.ad)) {
                throw new h.i();
            }
            new Header.Builder().setStartHeaderAction(Action.BACK);
            throw null;
        }
        MapTemplate.Builder builder = new MapTemplate.Builder();
        ItemList.Builder builder2 = new ItemList.Builder();
        com.waze.car_lib.p.ac acVar2 = (com.waze.car_lib.p.ac) acVar;
        for (final com.waze.n.aq aqVar : acVar2.b()) {
            int i2 = 0;
            if (aqVar instanceof com.waze.car_lib.p.y) {
                com.waze.car_lib.p.y yVar = (com.waze.car_lib.p.y) aqVar;
                for (com.waze.car_lib.p.aa aaVar : yVar.b()) {
                    Row.Builder builder3 = new Row.Builder();
                    builder3.setTitle(aaVar.d());
                    Integer numB = aaVar.b();
                    if (numB != null) {
                        CarIcon.Builder builder4 = new CarIcon.Builder(IconCompat.createWithResource(context, numB.intValue()));
                        builder4.setTint(CarColor.PRIMARY);
                        builder3.setImage(builder4.build());
                    }
                    builder2.addItem(builder3.build());
                }
                builder2.setOnSelectedListener(new ItemList.OnSelectedListener() { // from class: com.waze.car_lib.p.u
                    @Override // androidx.car.app.model.ItemList.OnSelectedListener
                    public final void onSelected(int i3) {
                        lVar.invoke(((aa) ((y) aqVar).b().get(i3)).c());
                    }
                });
                Iterator it = yVar.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (h.g.b.x.n(((com.waze.car_lib.p.aa) it.next()).c(), yVar.a())) {
                        break;
                    }
                    i2++;
                }
                builder2.setSelectedIndex(i2);
            } else if (aqVar instanceof com.waze.car_lib.p.z) {
                for (final com.waze.car_lib.p.ab abVar : ((com.waze.car_lib.p.z) aqVar).a()) {
                    Row.Builder builder5 = new Row.Builder();
                    builder5.setTitle(abVar.c());
                    CarIcon.Builder builder6 = new CarIcon.Builder(IconCompat.createWithResource(context, abVar.a()));
                    builder6.setTint(CarColor.PRIMARY);
                    builder5.setImage(builder6.build());
                    Toggle.Builder builder7 = new Toggle.Builder(new Toggle.OnCheckedChangeListener() { // from class: com.waze.car_lib.p.v
                        @Override // androidx.car.app.model.Toggle.OnCheckedChangeListener
                        public final void onCheckedChange(boolean z) {
                            lVar.invoke(abVar.b());
                        }
                    });
                    builder7.setChecked(abVar.d());
                    builder5.setToggle(builder7.build());
                    builder2.addItem(builder5.build());
                }
            } else {
                if (!(aqVar instanceof com.waze.car_lib.p.x)) {
                    throw new h.i();
                }
                for (com.waze.car_lib.p.aa aaVar2 : ((com.waze.car_lib.p.x) aqVar).a()) {
                    Row.Builder builder8 = new Row.Builder();
                    builder8.setTitle(aaVar2.d());
                    Integer numB2 = aaVar2.b();
                    if (numB2 != null) {
                        CarIcon.Builder builder9 = new CarIcon.Builder(IconCompat.createWithResource(context, numB2.intValue()));
                        builder9.setTint(CarColor.PRIMARY);
                        builder8.setImage(builder9.build());
                    }
                    Boolean boolA = aaVar2.a();
                    if (boolA != null) {
                        boolA.booleanValue();
                        builder8.setBrowsable(true);
                    }
                    builder8.setOnClickListener(new com.waze.car_lib.p.w(lVar, aaVar2, i2));
                    builder2.addItem(builder8.build());
                }
            }
        }
        builder.setItemList(builder2.build());
        Header.Builder builder10 = new Header.Builder();
        builder10.setTitle(acVar2.a());
        builder10.setStartHeaderAction(Action.BACK);
        builder.setHeader(builder10.build());
        MapTemplate mapTemplateBuild = builder.build();
        h.g.b.x.e(mapTemplateBuild, "build(...)");
        return mapTemplateBuild;
    }

    private ax() {
        throw null;
    }
}
