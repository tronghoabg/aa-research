package androidx.camera.viewfinder.core.impl.quirk;

import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DeviceQuirks {
    public static final DeviceQuirks INSTANCE = new DeviceQuirks();
    private static final Quirks QUIRKS = new Quirks(DeviceQuirksLoader.loadQuirks());

    private DeviceQuirks() {
    }

    public final /* synthetic */ <T extends Quirk> boolean contains() {
        List<Quirk> list = QUIRKS.quirks;
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
        Iterator it = QUIRKS.quirks.iterator();
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

    public final void reload() {
        QUIRKS.reset(DeviceQuirksLoader.loadQuirks());
    }
}
