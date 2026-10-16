package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zfl extends zfe {
    private List b;

    public zfl(yfg yfgVar, boolean z) {
        List arrayList;
        super(yfgVar, z, true);
        if (yfgVar.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = yfgVar.size();
            wub.G(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i = 0; i < yfgVar.size(); i++) {
            arrayList.add(null);
        }
        this.b = arrayList;
        u();
    }

    @Override // defpackage.zfe
    public final void e(int i, Object obj) {
        List list = this.b;
        if (list != null) {
            list.set(i, new kwp(obj, (byte[]) null));
        }
    }

    @Override // defpackage.zfe
    public final void g() {
        List<kwp> list = this.b;
        if (list != null) {
            int size = list.size();
            wub.G(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (kwp kwpVar : list) {
                arrayList.add(kwpVar != null ? kwpVar.a : null);
            }
            o(DesugarCollections.unmodifiableList(arrayList));
        }
    }

    @Override // defpackage.zfe
    public final void w(int i) {
        super.w(i);
        this.b = null;
    }
}
