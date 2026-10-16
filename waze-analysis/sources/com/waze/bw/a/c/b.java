package com.waze.bw.a.c;

import androidx.car.app.CarContext;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.waze.R;
import com.waze.av.b.aa;
import com.waze.car_lib.p.db;
import com.waze.car_lib.screens.bx;
import com.waze.sound.en;
import h.g.b.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class b {
    public /* synthetic */ b(byte[] bArr) {
    }

    private static Action a(CarContext carContext, com.waze.design_components.b.d dVar, h.g.a.a aVar) {
        CarContext carContext2 = carContext;
        int color = ContextCompat.getColor(carContext2, R.color.always_white);
        Action.Builder builder = new Action.Builder();
        CarIcon.Builder builder2 = new CarIcon.Builder(IconCompat.createWithResource(carContext2, dVar.b()));
        builder2.setTint(CarColor.createCustom(color, color));
        builder.setIcon(builder2.build());
        builder.setOnClickListener(new db(aVar, 13));
        builder.setFlags(2);
        Action actionBuild = builder.build();
        x.e(actionBuild, "build(...)");
        return actionBuild;
    }

    public static ActionStrip b(CarContext carContext, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, h.g.a.a aVar5, h.g.a.a aVar6) {
        Action actionA;
        x.f(carContext, "carContext");
        x.f(aVar, "onHomeClicked");
        x.f(aVar2, "onWorkClicked");
        x.f(aVar3, "onSavedPlacesClicked");
        x.f(aVar4, "onSearchClicked");
        x.f(aVar5, "onSettingsClicked");
        int iOrdinal = ((z2 && z3) ? z4 ? a.f17628b : a.f17627a : (z2 || !z3) ? z2 ? a.f17627a : a.f17629c : a.f17628b).ordinal();
        if (iOrdinal == 0) {
            actionA = a(carContext, com.waze.design_components.b.d.f23304e, aVar);
        } else if (iOrdinal == 1) {
            actionA = a(carContext, com.waze.design_components.b.d.f23309j, aVar2);
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            actionA = null;
        }
        boolean z6 = aVar6 != null;
        ActionStrip.Builder builder = new ActionStrip.Builder();
        if (actionA != null) {
            builder.addAction(actionA);
        }
        if (!z6 || actionA == null || (z && !z5)) {
            builder.addAction(a(carContext, com.waze.design_components.b.d.M, aVar3));
        }
        builder.addAction(a(carContext, com.waze.design_components.b.d.aj, aVar4));
        if (!z) {
            builder.addAction(a(carContext, com.waze.design_components.b.d.f23310k, aVar5));
        } else if (z5) {
            builder.addAction(a(carContext, com.waze.design_components.b.d.ch, new en(8)));
        }
        if (z6) {
            builder.addAction(bx.d(carContext, aVar6));
        }
        ActionStrip actionStripBuild = builder.build();
        x.e(actionStripBuild, "build(...)");
        return actionStripBuild;
    }

    public static List c(List list, long j2) {
        x.f(list, "<this>");
        if (list.size() <= 1) {
            return list;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (!x.n(linkedHashMap.get(Integer.valueOf(i2)), false)) {
                int iE = h.a.i.e(list);
                if (i3 <= iE) {
                    int i4 = i3;
                    while (true) {
                        if (!linkedHashMap.containsKey(Integer.valueOf(i2))) {
                            if (com.waze.sharedui.utils.f.a(((aa) list.get(i2)).a().d(), ((aa) list.get(i4)).a().d()) < j2) {
                                linkedHashMap.put(Integer.valueOf(i4), false);
                            }
                        }
                        if (i4 == iE) {
                            break;
                        }
                        i4++;
                    }
                }
                linkedHashMap.put(Integer.valueOf(i2), true);
            }
            i2 = i3;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            aa aaVar = ((Boolean) entry.getValue()).booleanValue() ? (aa) list.get(((Number) entry.getKey()).intValue()) : null;
            if (aaVar != null) {
                arrayList.add(aaVar);
            }
        }
        return arrayList;
    }

    private b() {
        throw null;
    }
}
