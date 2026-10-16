package android.support.v4.app;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ci {

    /* renamed from: a, reason: collision with root package name */
    public static final cq f265a = new co();

    /* renamed from: b, reason: collision with root package name */
    public static final cq f266b;

    static {
        cq cqVar = null;
        try {
            Class<?> cls = Class.forName("androidx.transition.FragmentTransitionSupport");
            h.g.b.x.d(cls, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            cqVar = (cq) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f266b = cqVar;
    }

    public static final String a(ArrayMap arrayMap, String str) {
        h.g.b.x.f(arrayMap, "<this>");
        h.g.b.x.f(str, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (h.g.b.x.n(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add((String) ((Map.Entry) it2.next()).getKey());
        }
        return (String) h.a.i.R(arrayList);
    }

    public static final void b(ar arVar, ar arVar2, boolean z, ArrayMap arrayMap, boolean z2) {
        h.g.b.x.f(arVar, "inFragment");
        h.g.b.x.f(arVar2, "outFragment");
        h.g.b.x.f(arrayMap, "sharedElements");
        SharedElementCallback enterTransitionCallback = z ? arVar2.getEnterTransitionCallback() : arVar.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayMap arrayMap2 = arrayMap;
            ArrayList arrayList = new ArrayList(arrayMap2.size());
            Iterator it = arrayMap2.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(arrayMap2.size());
            Iterator it2 = arrayMap2.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList3.add((String) ((Map.Entry) it2.next()).getKey());
            }
            ArrayList arrayList4 = arrayList3;
            if (z2) {
                enterTransitionCallback.onSharedElementStart(arrayList4, arrayList2, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList4, arrayList2, null);
            }
        }
    }

    public static final void c(List list, int i2) {
        h.g.b.x.f(list, "views");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i2);
        }
    }
}
