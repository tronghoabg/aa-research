package defpackage;

import android.view.PointerIcon;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ebg {
    public static void a(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    public static final airp b(View view) {
        return afrg.f(view.getParent(), ebs.a);
    }

    public static final List c(Map map, afec afecVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            euo euoVar = (euo) entry.getValue();
            Boolean boolValueOf = euoVar != null ? Boolean.valueOf(euoVar.b) : null;
            boolValueOf.getClass();
            if (!boolValueOf.booleanValue() && !euoVar.c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) afecVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
