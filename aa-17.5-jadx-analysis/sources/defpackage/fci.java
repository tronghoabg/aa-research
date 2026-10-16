package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class fci {
    public static volatile fci a;
    public static final Object b = new Object();
    public final Context e;
    public final Set d = new HashSet();
    final Map c = new HashMap();

    public fci(Context context) {
        this.e = context.getApplicationContext();
    }

    public final void a(Class cls, Set set) {
        if (fdi.b()) {
            cls.getSimpleName();
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        Map map = this.c;
        if (map.containsKey(cls)) {
            this.c.get(cls);
            return;
        }
        set.add(cls);
        try {
            fcj fcjVar = (fcj) cls.getDeclaredConstructor(null).newInstance(null);
            List<Class> listB = fcjVar.b();
            if (!listB.isEmpty()) {
                for (Class cls2 : listB) {
                    if (!map.containsKey(cls2)) {
                        a(cls2, set);
                    }
                }
            }
            Object objA = fcjVar.a(this.e);
            set.remove(cls);
            map.put(cls, objA);
        } catch (Throwable th) {
            throw new fck(th);
        }
    }
}
