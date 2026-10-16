package androidx.compose.runtime.saveable;

import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MapSaverKt {
    public static final <T> Saver<T, Object> mapSaver(final p<? super SaverScope, ? super T, ? extends Map<String, ? extends Object>> pVar, final l<? super Map<String, ? extends Object>, ? extends T> lVar) {
        return ListSaverKt.listSaver(new p() { // from class: androidx.compose.runtime.saveable.MapSaverKt$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return MapSaverKt.mapSaver$lambda$0(pVar, (SaverScope) obj, obj2);
            }
        }, new l() { // from class: androidx.compose.runtime.saveable.MapSaverKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return MapSaverKt.mapSaver$lambda$1(lVar, (List) obj);
            }
        });
    }

    static final List mapSaver$lambda$0(p pVar, SaverScope saverScope, Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) pVar.invoke(saverScope, obj)).entrySet()) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }

    static final Object mapSaver$lambda$1(l lVar, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.size() % 2 != 0) {
            throw new IllegalStateException("non-zero remainder");
        }
        for (int i2 = 0; i2 < list.size(); i2 += 2) {
            Object obj = list.get(i2);
            x.d(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, list.get(i2 + 1));
        }
        return lVar.invoke(linkedHashMap);
    }
}
