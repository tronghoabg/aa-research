package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahqq extends defpackage.ahqx {
    public ahqq(int i) {
        super(i, null);
    }

    @Override // defpackage.ahqx
    public void makeImmutable() {
        if (!isImmutable()) {
            for (int i = 0; i < getNumArrayEntries(); i++) {
                java.util.Map.Entry arrayEntryAt = getArrayEntryAt(i);
                if (((defpackage.ahph) arrayEntryAt.getKey()).isRepeated()) {
                    arrayEntryAt.setValue(j$.util.DesugarCollections.unmodifiableList((java.util.List) arrayEntryAt.getValue()));
                }
            }
            for (java.util.Map.Entry entry : getOverflowEntries()) {
                if (((defpackage.ahph) entry.getKey()).isRepeated()) {
                    entry.setValue(j$.util.DesugarCollections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.makeImmutable();
    }

    @Override // defpackage.ahqx, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return super.put((defpackage.ahph) obj, obj2);
    }
}
