package android.support.v7.widget;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bu {

    /* renamed from: a, reason: collision with root package name */
    private final bs f1183a;

    /* renamed from: b, reason: collision with root package name */
    private final List f1184b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final IdentityHashMap f1185c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final List f1186d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private bt f1187e = new bt();

    /* renamed from: f, reason: collision with root package name */
    private final gt f1188f = new gt();

    /* renamed from: g, reason: collision with root package name */
    private final fp f1189g = new fp();

    bu(bs bsVar) {
        this.f1183a = bsVar;
    }

    private final int t(dr drVar) {
        dr drVar2;
        Iterator it = this.f1186d.iterator();
        int i2 = 0;
        while (it.hasNext() && (drVar2 = (dr) it.next()) != drVar) {
            i2 += drVar2.f1370b;
        }
        return i2;
    }

    private final bt u(int i2) {
        bt btVar = this.f1187e;
        if (btVar.f1182c) {
            btVar = new bt();
        } else {
            btVar.f1182c = true;
        }
        Iterator it = this.f1186d.iterator();
        int i3 = i2;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dr drVar = (dr) it.next();
            int i4 = drVar.f1370b;
            if (i4 > i3) {
                btVar.f1180a = drVar;
                btVar.f1181b = i3;
                break;
            }
            i3 -= i4;
        }
        if (btVar.f1180a != null) {
            return btVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i2);
    }

    private final dr v(fe feVar) {
        dr drVar = (dr) this.f1185c.get(feVar);
        if (drVar != null) {
            return drVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + feVar + ", seems like it is not bound by this adapter: " + this);
    }

    private final void w() {
        ea eaVar;
        Iterator it = this.f1186d.iterator();
        while (true) {
            if (!it.hasNext()) {
                eaVar = ea.f1385a;
                break;
            }
            dr drVar = (dr) it.next();
            ea stateRestorationPolicy = drVar.f1369a.getStateRestorationPolicy();
            eaVar = ea.f1387c;
            if (stateRestorationPolicy == eaVar || (stateRestorationPolicy == ea.f1386b && drVar.f1370b == 0)) {
                break;
            }
        }
        bs bsVar = this.f1183a;
        if (eaVar != bsVar.getStateRestorationPolicy()) {
            bsVar.a(eaVar);
        }
    }

    private final void x(bt btVar) {
        btVar.f1182c = false;
        btVar.f1180a = null;
        btVar.f1181b = -1;
        this.f1187e = btVar;
    }

    public final int a(int i2) {
        bt btVarU = u(i2);
        int iA = btVarU.f1180a.a(btVarU.f1181b);
        x(btVarU);
        return iA;
    }

    public final int b(eb ebVar, fe feVar, int i2) {
        dr drVar = (dr) this.f1185c.get(feVar);
        if (drVar == null) {
            return -1;
        }
        int iT = i2 - t(drVar);
        eb ebVar2 = drVar.f1369a;
        int itemCount = ebVar2.getItemCount();
        if (iT >= 0 && iT < itemCount) {
            return ebVar2.findRelativeAdapterPositionIn(ebVar, feVar, iT);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + iT + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + feVar + "adapter:" + ebVar);
    }

    public final int c() {
        Iterator it = this.f1186d.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((dr) it.next()).f1370b;
        }
        return i2;
    }

    public final fe d(ViewGroup viewGroup, int i2) {
        dr drVar = (dr) this.f1188f.f1593a.get(i2);
        if (drVar != null) {
            return drVar.b(viewGroup, i2);
        }
        throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i2);
    }

    public final void e(RecyclerView recyclerView) {
        List list = this.f1184b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        list.add(new WeakReference(recyclerView));
        Iterator it2 = this.f1186d.iterator();
        while (it2.hasNext()) {
            ((dr) it2.next()).f1369a.onAttachedToRecyclerView(recyclerView);
        }
    }

    public final void f(fe feVar, int i2) {
        bt btVarU = u(i2);
        this.f1185c.put(feVar, btVarU.f1180a);
        dr drVar = btVarU.f1180a;
        drVar.f1369a.bindViewHolder(feVar, btVarU.f1181b);
        x(btVarU);
    }

    public final void g(RecyclerView recyclerView) {
        List list = this.f1184b;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) list.get(size);
            if (weakReference.get() == null) {
                list.remove(size);
            } else if (weakReference.get() == recyclerView) {
                list.remove(size);
                break;
            }
        }
        Iterator it = this.f1186d.iterator();
        while (it.hasNext()) {
            ((dr) it.next()).f1369a.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public final void h(dr drVar, int i2, int i3, Object obj) {
        this.f1183a.notifyItemRangeChanged(i2 + t(drVar), i3, obj);
    }

    public final void i(dr drVar, int i2, int i3) {
        this.f1183a.notifyItemRangeInserted(i2 + t(drVar), i3);
    }

    public final void j(dr drVar, int i2, int i3) {
        int iT = t(drVar);
        this.f1183a.notifyItemMoved(i2 + iT, i3 + iT);
    }

    public final void k(dr drVar, int i2, int i3) {
        this.f1183a.notifyItemRangeRemoved(i2 + t(drVar), i3);
    }

    public final void l(fe feVar) {
        v(feVar).f1369a.onViewAttachedToWindow(feVar);
    }

    public final void m(fe feVar) {
        v(feVar).f1369a.onViewDetachedFromWindow(feVar);
    }

    public final void n(fe feVar) {
        IdentityHashMap identityHashMap = this.f1185c;
        dr drVar = (dr) identityHashMap.get(feVar);
        if (drVar != null) {
            drVar.f1369a.onViewRecycled(feVar);
            identityHashMap.remove(feVar);
        } else {
            throw new IllegalStateException("Cannot find wrapper for " + feVar + ", seems like it is not bound by this adapter: " + this);
        }
    }

    public final boolean o(fe feVar) {
        IdentityHashMap identityHashMap = this.f1185c;
        dr drVar = (dr) identityHashMap.get(feVar);
        if (drVar != null) {
            boolean zOnFailedToRecycleView = drVar.f1369a.onFailedToRecycleView(feVar);
            identityHashMap.remove(feVar);
            return zOnFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + feVar + ", seems like it is not bound by this adapter: " + this);
    }

    final void p(eb ebVar) {
        List list = this.f1186d;
        int size = list.size();
        if (size < 0 || size > list.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + list.size() + ". Given:" + size);
        }
        if (ebVar.hasStableIds()) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                i2 = -1;
                break;
            } else if (((dr) list.get(i2)).f1369a == ebVar) {
                break;
            } else {
                i2++;
            }
        }
        if ((i2 == -1 ? null : (dr) list.get(i2)) != null) {
            return;
        }
        dr drVar = new dr(ebVar, this, this.f1188f, this.f1189g.a());
        list.add(size, drVar);
        Iterator it = this.f1184b.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                ebVar.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (drVar.f1370b > 0) {
            this.f1183a.notifyItemRangeInserted(t(drVar), drVar.f1370b);
        }
        w();
    }

    public final void q() {
        this.f1183a.notifyDataSetChanged();
        w();
    }

    public final void r() {
        w();
    }

    public final void s(int i2) {
        bt btVarU = u(i2);
        btVarU.f1180a.c(btVarU.f1181b);
        x(btVarU);
    }
}
