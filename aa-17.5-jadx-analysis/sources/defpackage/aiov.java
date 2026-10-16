package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class aiov {
    public static final aiyk a(aiyk aiykVar, aiyk aiykVar2, aiyk aiykVar3, afei afeiVar) {
        return new hcg(new aiyk[]{aiykVar, aiykVar2, aiykVar3}, afeiVar, 17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Collection<T> concat(Collection<? extends T> collection, Collection<? extends T> collection2) {
        collection2.getClass();
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final aipr<ahxe> listOfNonEmptyScopes(Iterable<? extends ahxe> iterable) {
        iterable.getClass();
        aipr<ahxe> aiprVar = new aipr<>();
        for (ahxe ahxeVar : iterable) {
            ahxe ahxeVar2 = ahxeVar;
            if (ahxeVar2 != null && ahxeVar2 != ahxd.INSTANCE) {
                aiprVar.add(ahxeVar);
            }
        }
        return aiprVar;
    }
}
