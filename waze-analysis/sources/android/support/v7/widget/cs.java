package android.support.v7.widget;

import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cs implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        cu cuVar = (cu) obj;
        cu cuVar2 = (cu) obj2;
        RecyclerView recyclerView = cuVar.f1286d;
        if ((recyclerView == null) != (cuVar2.f1286d == null)) {
            return recyclerView != null ? -1 : 1;
        }
        boolean z = cuVar.f1283a;
        if (z != cuVar2.f1283a) {
            return !z ? 1 : -1;
        }
        int i2 = cuVar2.f1284b - cuVar.f1284b;
        if (i2 == 0 && (i2 = cuVar.f1285c - cuVar2.f1285c) == 0) {
            return 0;
        }
        return i2;
    }
}
