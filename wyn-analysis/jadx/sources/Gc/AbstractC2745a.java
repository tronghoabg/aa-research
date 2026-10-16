package gc;

import android.util.Log;
import fc.C2620a;
import fc.c;
import fc.d;
import fc.e;
import fc.f;
import fc.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: gc.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2745a {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f35861a = new ArrayList(Arrays.asList(new C2620a(0), new c(0), new c(1), new C2620a(2), new d(), new e(), new f(), new C2620a(1), new c(2), new g(), new C2620a(3)));

    public static fc.b a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = f35861a.iterator();
        while (it.hasNext()) {
            fc.b bVar = (fc.b) it.next();
            if (bVar.l()) {
                arrayList.add(bVar);
            }
        }
        if (arrayList.size() > 1) {
            StringBuilder sb2 = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sb2.append(((fc.b) it2.next()).d());
            }
            Log.e(AbstractC2745a.class.getName(), "MORE THAN ONE CORRESPONDING:" + ((Object) sb2) + "|" + ic.d.y());
        }
        if (arrayList.size() > 0) {
            return (fc.b) arrayList.get(0);
        }
        return null;
    }
}
