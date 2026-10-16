package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class ahpq extends ahpx {
    public ahpq(int i) {
        super(i, null);
    }

    @Override // defpackage.ahpx
    public void makeImmutable() {
        if (!isImmutable()) {
            for (int i = 0; i < getNumArrayEntries(); i++) {
                Map.Entry arrayEntryAt = getArrayEntryAt(i);
                if (((ahoh) arrayEntryAt.getKey()).isRepeated()) {
                    arrayEntryAt.setValue(DesugarCollections.unmodifiableList((List) arrayEntryAt.getValue()));
                }
            }
            for (Map.Entry entry : getOverflowEntries()) {
                if (((ahoh) entry.getKey()).isRepeated()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.makeImmutable();
    }

    @Override // defpackage.ahpx, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((ahpq) obj, (ahoh) obj2);
    }
}
