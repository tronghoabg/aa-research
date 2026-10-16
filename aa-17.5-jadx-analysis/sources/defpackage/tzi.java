package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class tzi {
    public tzv a;
    public final List c = new CopyOnWriteArrayList();
    public final plb b = new plb(50, pkz.INDOOR_ACTIVE_LEVELS, null, null);

    public final tzx a(tzv tzvVar) {
        if (tzvVar == null) {
            return null;
        }
        acjs acjsVar = (acjs) this.b.h(tzvVar.b);
        if (acjsVar == null) {
            return tzvVar.a();
        }
        int i = acjsVar.a;
        if (i != -1) {
            return tzvVar.b(i);
        }
        return null;
    }

    public final String toString() {
        return String.format("[focused: %s]", this.a);
    }
}
