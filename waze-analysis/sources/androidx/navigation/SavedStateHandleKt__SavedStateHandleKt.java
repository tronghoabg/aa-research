package androidx.navigation;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.serialization.RouteDeserializerKt;
import androidx.navigation.serialization.RouteSerializerKt;
import h.a.r;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.l.c;
import h.l.s;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.b.b;
import kotlinx.b.p;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class SavedStateHandleKt__SavedStateHandleKt {
    public static final <T> T toRoute(SavedStateHandle savedStateHandle, c<T> cVar, Map<s, NavType> map) {
        x.f(savedStateHandle, "<this>");
        x.f(cVar, "route");
        x.f(map, "typeMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b bVarA = p.a(cVar);
        for (NamedNavArgument namedNavArgument : RouteSerializerKt.generateNavArguments(bVarA, map)) {
            linkedHashMap.put(namedNavArgument.getName(), namedNavArgument.getArgument().getType());
        }
        return (T) RouteDeserializerKt.decodeArguments(bVarA, savedStateHandle, linkedHashMap);
    }

    public static /* synthetic */ Object toRoute$default(SavedStateHandle savedStateHandle, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = r.j();
        }
        x.f(savedStateHandle, "<this>");
        x.f(map, "typeMap");
        x.i();
        int i3 = ar.f48106a;
        return SavedStateHandleKt.toRoute(savedStateHandle, new m(Object.class), map);
    }

    public static /* synthetic */ Object toRoute$default(SavedStateHandle savedStateHandle, c cVar, Map map, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            map = r.j();
        }
        return SavedStateHandleKt.toRoute(savedStateHandle, cVar, map);
    }

    public static final /* synthetic */ <T> T toRoute(SavedStateHandle savedStateHandle, Map<s, NavType> map) {
        x.f(savedStateHandle, "<this>");
        x.f(map, "typeMap");
        x.i();
        int i2 = ar.f48106a;
        return (T) SavedStateHandleKt.toRoute(savedStateHandle, new m(Object.class), map);
    }
}
