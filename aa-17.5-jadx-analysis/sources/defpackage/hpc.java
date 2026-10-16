package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class hpc extends hnl {
    public static final hpb b = new hpb();
    private final List c;

    public hpc(List list) {
        super(hnm.g);
        this.c = list;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("InsightGrid items cannot be empty.");
        }
    }

    @Override // defpackage.hnl
    public final List b() {
        List<hqd> list = this.c;
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        for (hqd hqdVar : list) {
            arrayList.add(hdk.e(hqdVar.a, hqdVar.b.name()));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpc) && affa.f(this.c, ((hpc) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
