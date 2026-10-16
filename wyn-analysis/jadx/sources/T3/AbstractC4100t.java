package t3;

import android.view.ViewGroup;
import com.wynauto.wyn.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k1.S;
import x.C4412e;

/* renamed from: t3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4100t {

    /* renamed from: a, reason: collision with root package name */
    public static final C4081a f45721a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f45722b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f45723c;

    static {
        C4081a c4081a = new C4081a();
        c4081a.f45727y = false;
        c4081a.J(new C4088h(2));
        c4081a.J(new C4086f());
        c4081a.J(new C4088h(1));
        f45721a = c4081a;
        f45722b = new ThreadLocal();
        f45723c = new ArrayList();
    }

    public static void a(ViewGroup viewGroup, AbstractC4096p abstractC4096p) {
        ArrayList arrayList = f45723c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap weakHashMap = S.f38779a;
        if (viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (abstractC4096p == null) {
                abstractC4096p = f45721a;
            }
            AbstractC4096p abstractC4096pClone = abstractC4096p.clone();
            ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC4096p) it.next()).v(viewGroup);
                }
            }
            if (abstractC4096pClone != null) {
                abstractC4096pClone.h(viewGroup, true);
            }
            if (viewGroup.getTag(R.id.transition_current_scene) != null) {
                throw new ClassCastException();
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (abstractC4096pClone != null) {
                ViewTreeObserverOnPreDrawListenerC4099s viewTreeObserverOnPreDrawListenerC4099s = new ViewTreeObserverOnPreDrawListenerC4099s();
                viewTreeObserverOnPreDrawListenerC4099s.f45719a = abstractC4096pClone;
                viewTreeObserverOnPreDrawListenerC4099s.f45720b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC4099s);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC4099s);
            }
        }
    }

    public static C4412e b() {
        C4412e c4412e;
        ThreadLocal threadLocal = f45722b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c4412e = (C4412e) weakReference.get()) != null) {
            return c4412e;
        }
        C4412e c4412e2 = new C4412e(0);
        threadLocal.set(new WeakReference(c4412e2));
        return c4412e2;
    }
}
