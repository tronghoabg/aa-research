package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahmr {
    public static final List<ahmf> toExpandedRecordsList(List<ahmf> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (ahmf ahmfVar : list) {
            int range = ahmfVar.getRange();
            for (int i = 0; i < range; i++) {
                arrayList.add(ahmfVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
