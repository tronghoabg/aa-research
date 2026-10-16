package com.moloco.sdk.internal.ortb;

import Bf.i;
import com.moloco.sdk.internal.ortb.model.C1892f;
import com.moloco.sdk.internal.ortb.model.C1906u;
import com.moloco.sdk.internal.ortb.model.C1910y;
import ff.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final i f28680a = new i("\\$\\{AUCTION_PRICE\\}");

    public static final C1910y a(C1910y c1910y) {
        String strC;
        AbstractC3340k.e(c1910y, "<this>");
        List list = c1910y.f28880a;
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List<C1906u> list2 = ((C1892f) it.next()).f28799a;
            ArrayList arrayList2 = new ArrayList(p.a0(list2, 10));
            for (C1906u c1906u : list2) {
                float f10 = c1906u.f28865b;
                Float fValueOf = Float.valueOf(f10);
                String str = c1906u.f28864a;
                AbstractC3340k.e(str, "<this>");
                String string = fValueOf.toString();
                if (string == null) {
                    string = "";
                }
                i iVar = f28680a;
                String strC2 = iVar.c(str, string);
                String str2 = c1906u.f28866c;
                if (str2 != null) {
                    String string2 = Float.valueOf(f10).toString();
                    strC = iVar.c(str2, string2 != null ? string2 : "");
                } else {
                    strC = null;
                }
                arrayList2.add(new C1906u(strC2, f10, strC, c1906u.f28867d, c1906u.f28868e, c1906u.f28869f));
            }
            arrayList.add(new C1892f(arrayList2));
        }
        return new C1910y(arrayList);
    }
}
