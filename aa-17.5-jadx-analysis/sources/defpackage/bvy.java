package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class bvy implements afdr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bvy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.afdr
    public final /* synthetic */ Object invoke() {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            return ((agg) obj).d();
        }
        List list = ((bvz) obj).a;
        aan aanVar = new aan(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            bzd bzdVar = (bzd) list.get(i2);
            Object obj2 = bzdVar.b;
            bys.b(aanVar, obj2 != null ? new bwe(Integer.valueOf(bzdVar.a), obj2) : Integer.valueOf(bzdVar.a), bzdVar);
        }
        return new bys(aanVar);
    }
}
