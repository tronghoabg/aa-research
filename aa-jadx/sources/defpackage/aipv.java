package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aipv {
    public static final int a(java.lang.String str, int i) {
        return (str.charAt(i) << 7) + str.charAt(i + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> java.util.Collection<T> concat(java.util.Collection<? extends T> collection, java.util.Collection<? extends T> collection2) {
        collection2.getClass();
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof java.util.LinkedHashSet) {
            ((java.util.LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final defpackage.aiqr<defpackage.ahye> listOfNonEmptyScopes(java.lang.Iterable<? extends defpackage.ahye> iterable) {
        iterable.getClass();
        defpackage.aiqr<defpackage.ahye> aiqrVar = new defpackage.aiqr<>();
        for (defpackage.ahye ahyeVar : iterable) {
            defpackage.ahye ahyeVar2 = ahyeVar;
            if (ahyeVar2 != null && ahyeVar2 != defpackage.ahyd.INSTANCE) {
                aiqrVar.add(ahyeVar);
            }
        }
        return aiqrVar;
    }
}
