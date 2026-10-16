package androidx.camera.viewfinder.core.impl.quirk;

import h.a.i;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Quirks {
    private final List<Quirk> quirks;

    public Quirks(List<? extends Quirk> list) {
        x.f(list, "quirks");
        this.quirks = i.aq(list);
    }

    public final /* synthetic */ <T extends Quirk> boolean contains() {
        List<Quirk> list = this.quirks;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (Quirk quirk : list) {
            x.i();
            if (quirk instanceof Quirk) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ <T extends Quirk> T get() {
        Object next;
        Iterator it = this.quirks.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Class<?> cls = ((Quirk) next).getClass();
            x.i();
            if (cls == Quirk.class) {
                break;
            }
        }
        x.i();
        return (T) next;
    }

    public final void reset(List<? extends Quirk> list) {
        x.f(list, "quirks");
        this.quirks.clear();
        this.quirks.addAll(list);
    }
}
