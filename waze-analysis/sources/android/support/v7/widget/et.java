package android.support.v7.widget;

import android.util.SparseArray;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.poolingcontainer.PoolingContainer;
import com.waze.strings.DisplayStrings;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class et {

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f1429a;

    /* renamed from: b, reason: collision with root package name */
    ArrayList f1430b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f1431c;

    /* renamed from: d, reason: collision with root package name */
    int f1432d;

    /* renamed from: e, reason: collision with root package name */
    es f1433e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ RecyclerView f1434f;

    /* renamed from: g, reason: collision with root package name */
    private final List f1435g;

    public et(RecyclerView recyclerView) {
        this.f1434f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1429a = arrayList;
        this.f1430b = null;
        this.f1431c = new ArrayList();
        this.f1435g = DesugarCollections.unmodifiableList(arrayList);
        this.f1432d = 2;
    }

    private final void s() {
        RecyclerView recyclerView;
        eb ebVar;
        es esVar = this.f1433e;
        if (esVar == null || (ebVar = (recyclerView = this.f1434f).m) == null || !recyclerView.q) {
            return;
        }
        esVar.f1428c.add(ebVar);
    }

    private final void t(eb ebVar, boolean z) {
        es esVar = this.f1433e;
        if (esVar == null) {
            return;
        }
        Set set = esVar.f1428c;
        set.remove(ebVar);
        if (set.size() != 0 || z) {
            return;
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = esVar.f1426a;
            if (i2 >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((er) sparseArray.get(sparseArray.keyAt(i2))).f1422a;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                PoolingContainer.callPoolingContainerOnRelease(((fe) arrayList.get(i3)).itemView);
            }
            i2++;
        }
    }

    public final int a(int i2) {
        if (i2 >= 0) {
            RecyclerView recyclerView = this.f1434f;
            fb fbVar = recyclerView.E;
            if (i2 < fbVar.a()) {
                return !fbVar.f1463g ? i2 : recyclerView.f939f.a(i2);
            }
        }
        StringBuilder sb = new StringBuilder("invalid position ");
        sb.append(i2);
        sb.append(". State item count is ");
        RecyclerView recyclerView2 = this.f1434f;
        sb.append(recyclerView2.E.a());
        sb.append(recyclerView2.t());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    final es b() {
        if (this.f1433e == null) {
            this.f1433e = new es();
            s();
        }
        return this.f1433e;
    }

    public final View c(int i2) {
        return r(i2, Long.MAX_VALUE).itemView;
    }

    public final List d() {
        return this.f1435g;
    }

    final void e(fe feVar, boolean z) {
        RecyclerView.E(feVar);
        RecyclerView recyclerView = this.f1434f;
        View view = feVar.itemView;
        fg fgVar = recyclerView.I;
        if (fgVar != null) {
            AccessibilityDelegateCompat itemDelegate = fgVar.getItemDelegate();
            ViewCompat.setAccessibilityDelegate(view, itemDelegate instanceof ff ? ((ff) itemDelegate).a(view) : null);
        }
        if (z) {
            List list = recyclerView.o;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((eu) list.get(i2)).a();
            }
            eb ebVar = recyclerView.m;
            if (ebVar != null) {
                ebVar.onViewRecycled(feVar);
            }
            if (recyclerView.E != null) {
                recyclerView.f941h.i(feVar);
            }
        }
        feVar.mBindingAdapter = null;
        feVar.mOwnerRecyclerView = null;
        b().c(feVar);
    }

    public final void f() {
        this.f1429a.clear();
        j();
    }

    final void g() {
        s();
    }

    final void h() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1431c;
            if (i2 >= arrayList.size()) {
                t(this.f1434f.m, false);
                return;
            } else {
                PoolingContainer.callPoolingContainerOnRelease(((fe) arrayList.get(i2)).itemView);
                i2++;
            }
        }
    }

    final void i(View view) {
        fe feVarP = RecyclerView.p(view);
        feVarP.mScrapContainer = null;
        feVarP.mInChangeScrap = false;
        feVarP.clearReturnedFromScrapFlag();
        m(feVarP);
    }

    final void j() {
        ArrayList arrayList = this.f1431c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.f1434f.D.b();
                return;
            }
            k(size);
        }
    }

    final void k(int i2) {
        int i3 = RecyclerView.O;
        ArrayList arrayList = this.f1431c;
        e((fe) arrayList.get(i2), true);
        arrayList.remove(i2);
    }

    public final void l(View view) {
        fe feVarP = RecyclerView.p(view);
        if (feVarP.isTmpDetached()) {
            this.f1434f.removeDetachedView(view, false);
        }
        if (feVarP.isScrap()) {
            feVarP.unScrap();
        } else if (feVarP.wasReturnedFromScrap()) {
            feVarP.clearReturnedFromScrapFlag();
        }
        m(feVarP);
        RecyclerView recyclerView = this.f1434f;
        if (recyclerView.y == null || feVarP.isRecyclable()) {
            return;
        }
        recyclerView.y.i(feVarP);
    }

    final void m(fe feVar) {
        boolean z;
        boolean z2 = false;
        if (feVar.isScrap() || feVar.itemView.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(feVar.isScrap());
            sb.append(" isAttached:");
            sb.append(feVar.itemView.getParent() != null);
            sb.append(this.f1434f.t());
            throw new IllegalArgumentException(sb.toString());
        }
        if (feVar.isTmpDetached()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + feVar + this.f1434f.t());
        }
        if (feVar.shouldIgnore()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(this.f1434f.t()));
        }
        boolean zDoesTransientStatePreventRecycling = feVar.doesTransientStatePreventRecycling();
        RecyclerView recyclerView = this.f1434f;
        eb ebVar = recyclerView.m;
        if ((ebVar != null && zDoesTransientStatePreventRecycling && ebVar.onFailedToRecycleView(feVar)) || feVar.isRecyclable()) {
            if (this.f1432d <= 0 || feVar.hasAnyOfTheFlags(DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_IN_LANE_LABEL)) {
                z = false;
            } else {
                ArrayList arrayList = this.f1431c;
                int size = arrayList.size();
                if (size >= this.f1432d && size > 0) {
                    k(0);
                    size--;
                }
                if (size > 0 && !recyclerView.D.d(feVar.mPosition)) {
                    do {
                        size--;
                        if (size < 0) {
                            break;
                        }
                    } while (recyclerView.D.d(((fe) arrayList.get(size)).mPosition));
                    size++;
                }
                arrayList.add(size, feVar);
                z = true;
            }
            if (z) {
                z = false;
            } else {
                e(feVar, true);
            }
            z2 = z;
        } else {
            z = false;
        }
        recyclerView.f941h.i(feVar);
        if (z2 || z || !zDoesTransientStatePreventRecycling) {
            return;
        }
        PoolingContainer.callPoolingContainerOnRelease(feVar.itemView);
        feVar.mBindingAdapter = null;
        feVar.mOwnerRecyclerView = null;
    }

    final void n(View view) {
        eh ehVar;
        fe feVarP = RecyclerView.p(view);
        if (!feVarP.hasAnyOfTheFlags(12) && feVarP.isUpdated() && (ehVar = this.f1434f.y) != null && feVarP.getUnmodifiedPayloads().isEmpty() && ehVar.f1392a && !feVarP.isInvalid()) {
            if (this.f1430b == null) {
                this.f1430b = new ArrayList();
            }
            feVarP.setScrapContainer(this, true);
            this.f1430b.add(feVarP);
            return;
        }
        if (feVarP.isInvalid() && !feVarP.isRemoved()) {
            RecyclerView recyclerView = this.f1434f;
            if (!recyclerView.m.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.t()));
            }
        }
        feVarP.setScrapContainer(this, false);
        this.f1429a.add(feVarP);
    }

    final void o(fe feVar) {
        if (feVar.mInChangeScrap) {
            this.f1430b.remove(feVar);
        } else {
            this.f1429a.remove(feVar);
        }
        feVar.mScrapContainer = null;
        feVar.mInChangeScrap = false;
        feVar.clearReturnedFromScrapFlag();
    }

    final void p() {
        en enVar = this.f1434f.n;
        this.f1432d = (enVar != null ? enVar.y : 0) + 2;
        ArrayList arrayList = this.f1431c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || arrayList.size() <= this.f1432d) {
                return;
            } else {
                k(size);
            }
        }
    }

    final void q(eb ebVar, eb ebVar2) {
        f();
        t(ebVar, true);
        es esVarB = b();
        if (ebVar != null) {
            esVarB.f1427b--;
        }
        if (esVarB.f1427b == 0) {
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = esVarB.f1426a;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ArrayList arrayList = ((er) sparseArray.valueAt(i2)).f1422a;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    PoolingContainer.callPoolingContainerOnRelease(((fe) arrayList.get(i3)).itemView);
                }
                arrayList.clear();
                i2++;
            }
        }
        if (ebVar2 != null) {
            esVarB.f1427b++;
        }
        s();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final android.support.v7.widget.fe r(int r25, long r26) {
        /*
            Method dump skipped, instructions count: 1139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.et.r(int, long):android.support.v7.widget.fe");
    }
}
