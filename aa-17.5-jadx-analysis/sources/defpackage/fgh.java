package defpackage;

import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class fgh {
    private static final fgc b = new fgm(null);
    private static final ThreadLocal c = new ThreadLocal();
    public static final ArrayList a = new ArrayList();

    public static yw a() {
        yw ywVar;
        ThreadLocal threadLocal = c;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (ywVar = (yw) weakReference.get()) != null) {
            return ywVar;
        }
        yw ywVar2 = new yw();
        threadLocal.set(new WeakReference(ywVar2));
        return ywVar2;
    }

    public static void b(ViewGroup viewGroup, fgc fgcVar) {
        ArrayList arrayList = a;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (fgcVar == null) {
            fgcVar = b;
        }
        fgc fgcVarClone = fgcVar.clone();
        d(viewGroup, fgcVarClone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        c(viewGroup, fgcVarClone);
    }

    public static void c(ViewGroup viewGroup, fgc fgcVar) {
        if (fgcVar == null || viewGroup == null) {
            return;
        }
        fgg fggVar = new fgg(fgcVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(fggVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(fggVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(ViewGroup viewGroup, fgc fgcVar) {
        ArrayList arrayList = (ArrayList) a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((fgc) arrayList.get(i)).v(viewGroup);
            }
        }
        if (fgcVar != null) {
            fgcVar.q(viewGroup, true);
        }
        sx sxVarV = sx.v(viewGroup);
        if (sxVarV != null) {
            sx.v((ViewGroup) sxVarV.b);
        }
    }
}
