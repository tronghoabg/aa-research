package android.support.v7.widget;

import android.util.SparseArray;
import androidx.customview.poolingcontainer.PoolingContainer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class es {

    /* renamed from: a, reason: collision with root package name */
    final SparseArray f1426a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    int f1427b = 0;

    /* renamed from: c, reason: collision with root package name */
    final Set f1428c = Collections.newSetFromMap(new IdentityHashMap());

    static final long f(long j2, long j3) {
        return j2 == 0 ? j3 : ((j2 / 4) * 3) + (j3 / 4);
    }

    private final er g(int i2) {
        SparseArray sparseArray = this.f1426a;
        er erVar = (er) sparseArray.get(i2);
        if (erVar != null) {
            return erVar;
        }
        er erVar2 = new er();
        sparseArray.put(i2, erVar2);
        return erVar2;
    }

    final void a(int i2, long j2) {
        er erVarG = g(i2);
        erVarG.f1425d = f(erVarG.f1425d, j2);
    }

    final void b(int i2, long j2) {
        er erVarG = g(i2);
        erVarG.f1424c = f(erVarG.f1424c, j2);
    }

    public final void c(fe feVar) {
        int itemViewType = feVar.getItemViewType();
        ArrayList arrayList = g(itemViewType).f1422a;
        int i2 = ((er) this.f1426a.get(itemViewType)).f1423b;
        if (arrayList.size() >= 5) {
            PoolingContainer.callPoolingContainerOnRelease(feVar.itemView);
            return;
        }
        int i3 = RecyclerView.O;
        feVar.resetInternal();
        arrayList.add(feVar);
    }

    final boolean d(int i2, long j2, long j3) {
        long j4 = g(i2).f1425d;
        return j4 == 0 || j2 + j4 < j3;
    }

    final boolean e(int i2, long j2, long j3) {
        long j4 = g(i2).f1424c;
        return j4 == 0 || j2 + j4 < j3;
    }
}
