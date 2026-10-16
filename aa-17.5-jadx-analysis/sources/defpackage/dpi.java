package defpackage;

import j$.util.Objects;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class dpi extends dpg {
    private static final ArrayList f;

    static {
        ArrayList arrayList = new ArrayList();
        f = arrayList;
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    public final dph C() {
        if (this.a.size() > 0) {
            return (dph) this.a.get(0);
        }
        return null;
    }

    public final void D(dph dphVar) {
        if (this.a.size() > 0) {
            this.a.set(0, dphVar);
        } else {
            this.a.add(dphVar);
        }
    }

    @Override // defpackage.dpg, defpackage.dph
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpi) || Objects.equals(x(), ((dpi) obj).x())) {
            return super.equals(obj);
        }
        return false;
    }
}
