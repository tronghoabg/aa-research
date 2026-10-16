package androidx.navigation;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.navigation.serialization.RouteDeserializerKt;
import androidx.savedstate.SavedStateWriter;
import h.a.r;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.k;
import h.l.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.b.p;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class NavBackStackEntryKt__NavBackStackEntryKt {
    public static final <T> T toRoute(NavBackStackEntry navBackStackEntry, c cVar) {
        k[] kVarArr;
        x.f(navBackStackEntry, "<this>");
        x.f(cVar, "route");
        Bundle arguments = navBackStackEntry.getArguments();
        if (arguments == null) {
            Map mapJ = r.j();
            if (mapJ.isEmpty()) {
                kVarArr = new k[0];
            } else {
                ArrayList arrayList = new ArrayList(mapJ.size());
                for (Map.Entry entry : mapJ.entrySet()) {
                    arrayList.add(new k((String) entry.getKey(), entry.getValue()));
                }
                kVarArr = (k[]) arrayList.toArray(new k[0]);
            }
            arguments = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
            SavedStateWriter.m13355constructorimpl(arguments);
        }
        Map<String, NavArgument> arguments2 = navBackStackEntry.getDestination().getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.a(arguments2.size()));
        Iterator<T> it = arguments2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            linkedHashMap.put(entry2.getKey(), ((NavArgument) entry2.getValue()).getType());
        }
        return (T) RouteDeserializerKt.decodeArguments(p.a(cVar), arguments, linkedHashMap);
    }

    public static final /* synthetic */ <T> T toRoute(NavBackStackEntry navBackStackEntry) {
        x.f(navBackStackEntry, "<this>");
        x.i();
        int i2 = ar.f48106a;
        return (T) NavBackStackEntryKt.toRoute(navBackStackEntry, new m(Object.class));
    }
}
