package com.waze.reports;

import com.waze.NativeManager;
import com.waze.config.ConfigValues;
import com.waze.settings.gw;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    private static NativeManager.VenueCategory[] f33635a;

    /* renamed from: b, reason: collision with root package name */
    private static HashMap f33636b;

    /* renamed from: c, reason: collision with root package name */
    private static HashMap f33637c;

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList f33638d;

    /* renamed from: e, reason: collision with root package name */
    private static gw[] f33639e;

    public static String a(String str) {
        if (f33636b == null) {
            if (f33635a == null) {
                return null;
            }
            f33636b = new HashMap();
            for (NativeManager.VenueCategory venueCategory : f33635a) {
                f33636b.put(venueCategory.id, venueCategory.label);
            }
        }
        return (String) f33636b.get(str);
    }

    public static List b(List list) {
        if (f33635a == null) {
            return new ArrayList(list);
        }
        ArrayList arrayList = new ArrayList();
        for (NativeManager.VenueCategory venueCategory : f33635a) {
            if (list.contains(venueCategory.id)) {
                arrayList.add(venueCategory.id);
            }
        }
        return arrayList;
    }

    static /* synthetic */ void c() {
        NativeManager.VenueCategory[] venueCategoryArrVenueProviderGetCategories = NativeManager.getInstance().venueProviderGetCategories();
        if (venueCategoryArrVenueProviderGetCategories == null) {
            return;
        }
        List listAsList = Arrays.asList(ConfigValues.CONFIG_VALUE_CRISIS_RESPONSE_UNEDITABLE_CATEGORIES.b().split(","));
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (true) {
            if (i2 >= venueCategoryArrVenueProviderGetCategories.length) {
                break;
            }
            NativeManager.VenueCategory venueCategory = venueCategoryArrVenueProviderGetCategories[i2];
            if (listAsList.contains(venueCategory.id)) {
                com.waze.shared_infra.i.h.a("Skipping category " + venueCategory.id + "  because it's uneditable");
            } else {
                hashSet.add(venueCategory.id);
            }
            i2++;
        }
        ArrayList arrayList = new ArrayList();
        for (NativeManager.VenueCategory venueCategory2 : venueCategoryArrVenueProviderGetCategories) {
            if (listAsList.contains(venueCategory2.id)) {
                com.waze.shared_infra.i.h.a("Skipping category " + venueCategory2.id + " because it's uneditable");
            } else {
                String str = venueCategory2.parent;
                if (com.google.d.b.an.f(str) || hashSet.contains(str)) {
                    arrayList.add(venueCategory2);
                } else {
                    com.waze.shared_infra.i.h.c("Category " + venueCategory2.id + " refers to a missing or uneditable parent " + venueCategory2.parent + ", not adding it to the list");
                }
            }
        }
        f33635a = (NativeManager.VenueCategory[]) arrayList.toArray(new NativeManager.VenueCategory[0]);
    }

    public static void d() {
        if (f33635a != null) {
            return;
        }
        NativeManager.Post(new bb(1, null));
    }

    public static gw[] e() {
        int i2;
        if (f33637c == null) {
            if (f33635a == null) {
                return null;
            }
            f33637c = new HashMap();
            f33638d = new ArrayList();
            for (NativeManager.VenueCategory venueCategory : f33635a) {
                String str = venueCategory.id;
                String str2 = venueCategory.parent;
                if (com.google.d.b.an.f(str2)) {
                    f33638d.add(str);
                    Map.EL.putIfAbsent(f33637c, str, new ArrayList());
                } else {
                    if (((List) Map.EL.putIfAbsent(f33637c, str2, new ArrayList())) == null) {
                        com.waze.shared_infra.i.h.j("Child category " + str + " found before parent category " + str2 + ", is the config out of order?");
                    }
                    ((List) f33637c.get(str2)).add(str);
                }
            }
        }
        gw[] gwVarArr = f33639e;
        if (gwVarArr == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = f33638d;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                String str3 = (String) arrayList2.get(i3);
                gw gwVar = new gw(str3, a(str3), false);
                gwVar.f37354g = true;
                gwVar.f37356i = com.waze.av.c.b.a(null, str3, com.waze.design_components.b.d.I, com.waze.design_components.b.e.f23313b);
                arrayList.add(gwVar);
                Iterator it = ((List) f33637c.get(str3)).iterator();
                while (true) {
                    i2 = i3 + 1;
                    if (it.hasNext()) {
                        String str4 = (String) it.next();
                        arrayList.add(new gw(str4, a(str4), false));
                    }
                }
                i3 = i2;
            }
            f33639e = (gw[]) arrayList.toArray(new gw[0]);
        } else {
            for (gw gwVar2 : gwVarArr) {
                gwVar2.f37348a = false;
                gwVar2.f37353f = 0.0f;
            }
        }
        return f33639e;
    }
}
