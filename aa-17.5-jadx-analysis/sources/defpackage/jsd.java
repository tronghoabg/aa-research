package defpackage;

import android.util.Pair;
import j$.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class jsd {
    public final Map a = new HashMap();

    public abstract Object a(Pair pair);

    public final Object b(Pair pair) {
        return Map.EL.computeIfAbsent(this.a, pair, new gjm(this, 10));
    }

    public final void c(Consumer consumer) {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public final void d(Pair pair) {
        this.a.remove(pair);
    }
}
