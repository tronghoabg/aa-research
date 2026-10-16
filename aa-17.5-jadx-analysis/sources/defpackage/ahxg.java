package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ahxg {
    public static final Set<ahnj> flatMapClassifierNamesOrNull(Iterable<? extends ahxe> iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet();
        Iterator<? extends ahxe> it = iterable.iterator();
        while (it.hasNext()) {
            Set<ahnj> classifierNames = it.next().getClassifierNames();
            if (classifierNames == null) {
                return null;
            }
            woy.cq(hashSet, classifierNames);
        }
        return hashSet;
    }
}
