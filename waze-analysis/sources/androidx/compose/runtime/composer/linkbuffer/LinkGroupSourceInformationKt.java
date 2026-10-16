package androidx.compose.runtime.composer.linkbuffer;

import h.g.a.l;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LinkGroupSourceInformationKt {
    private static final <T> int fastIndexOf(ArrayList<T> arrayList, l<? super T, Boolean> lVar) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (lVar.invoke(arrayList.get(i2)).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    private static final <T> T fastLastOrNull(ArrayList<T> arrayList, l<? super T, Boolean> lVar) {
        T t;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            t = arrayList.get(size);
        } while (!lVar.invoke(t).booleanValue());
        return t;
    }
}
