package defpackage;

import android.support.v4.app.Fragment;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class cd {
    public static final ck a = new cj();
    public static final ck b;

    static {
        ck ckVar = null;
        try {
            Class<?> cls = Class.forName("fev");
            cls.getClass();
            ckVar = (ck) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = ckVar;
    }

    public static final void a(Fragment fragment, Fragment fragment2, boolean z, yw ywVar, boolean z2) {
        if ((z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(ywVar.d);
            Iterator it = ywVar.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(ywVar.d);
            Iterator it2 = ywVar.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public static final void b(List list, int i) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
