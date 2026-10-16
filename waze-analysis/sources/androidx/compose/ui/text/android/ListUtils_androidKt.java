package androidx.compose.ui.text.android;

import android.R;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ListUtils_androidKt {
    public static final <T> void fastForEach(List<? extends T> list, l<? super T, ab> lVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            lVar.invoke(list.get(i2));
        }
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c2, l<? super T, ? extends R> lVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            c2.add(lVar.invoke(list.get(i2)));
        }
        return c2;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, p<? super T, ? super T, ? extends R> pVar) {
        if (list.size() <= 1) {
            return i.h();
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        R.array arrayVar = list.get(0);
        int iE = i.e(list);
        while (i2 < iE) {
            i2++;
            T t = list.get(i2);
            arrayList.add(pVar.invoke(arrayVar, t));
            arrayVar = t;
        }
        return arrayList;
    }
}
