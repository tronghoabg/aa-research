package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ahxs {
    private ahxs() {
    }

    public final ahxe create(String str, Collection<? extends aigl> collection) {
        str.getClass();
        collection.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((aigl) it.next()).getMemberScope());
        }
        aipr<ahxe> aiprVarListOfNonEmptyScopes = aiov.listOfNonEmptyScopes(arrayList);
        ahxe ahxeVarCreateOrSingle$org_jetbrains_kotlin_descriptors = ahwl.Companion.createOrSingle$org_jetbrains_kotlin_descriptors(str, aiprVarListOfNonEmptyScopes);
        return aiprVarListOfNonEmptyScopes.size() <= 1 ? ahxeVarCreateOrSingle$org_jetbrains_kotlin_descriptors : new ahxt(str, ahxeVarCreateOrSingle$org_jetbrains_kotlin_descriptors, null);
    }

    public /* synthetic */ ahxs(afeu afeuVar) {
        this();
    }
}
