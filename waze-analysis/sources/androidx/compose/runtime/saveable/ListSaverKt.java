package androidx.compose.runtime.saveable;

import h.g.a.l;
import h.g.a.p;
import h.g.b.au;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ListSaverKt {
    public static final <Original, Saveable> Saver<Original, Object> listSaver(final p<? super SaverScope, ? super Original, ? extends List<? extends Saveable>> pVar, l<? super List<? extends Saveable>, ? extends Original> lVar) {
        p pVar2 = new p() { // from class: androidx.compose.runtime.saveable.ListSaverKt$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return ListSaverKt.listSaver$lambda$0(pVar, (SaverScope) obj, obj2);
            }
        };
        x.d(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        au.h(lVar, 1);
        return SaverKt.Saver(pVar2, lVar);
    }

    static final Object listSaver$lambda$0(p pVar, SaverScope saverScope, Object obj) {
        List list = (List) pVar.invoke(saverScope, obj);
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = list.get(i2);
            if (obj2 != null && !saverScope.canBeSaved(obj2)) {
                throw new IllegalArgumentException("item at index " + i2 + " can't be saved: " + obj2);
            }
        }
        if (list2.isEmpty()) {
            return null;
        }
        return new ArrayList(list2);
    }
}
