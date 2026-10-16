package androidx.compose.foundation.text.input.internal;

import h.a.i;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldLayoutStateCacheKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> mergeNullableLists(List<? extends T> list, List<? extends T> list2) {
        List<? extends T> list3;
        List<? extends T> list4 = list;
        if ((list4 == null || list4.isEmpty()) && ((list3 = list2) == null || list3.isEmpty())) {
            return null;
        }
        if (list4 == null || list4.isEmpty()) {
            return list2;
        }
        List<? extends T> list5 = list2;
        if (list5 == null || list5.isEmpty()) {
            return list;
        }
        List listB = i.b();
        listB.addAll(list4);
        listB.addAll(list5);
        return i.a(listB);
    }
}
