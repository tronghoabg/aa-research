package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class aho implements aew {
    private final List a;

    public aho(List list) {
        this.a = list;
    }

    @Override // defpackage.aec
    public final agr c(bii biiVar) {
        List list = this.a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new aezu(Long.valueOf(((Number) r3.a).intValue() * 1000000), ((aew) ((aezu) list.get(i)).b).c(biiVar)));
        }
        return new aih(arrayList);
    }
}
