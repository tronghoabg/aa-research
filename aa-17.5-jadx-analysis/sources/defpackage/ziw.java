package defpackage;

import java.util.Collections;
import java.util.Random;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ziw {
    public static final Random a = new Random();

    public static ygr a(Set set, aat aatVar, ziv zivVar) {
        if (!aatVar.containsKey(zivVar)) {
            return yly.a;
        }
        ygp ygpVar = new ygp();
        for (ziv zivVar2 : (Set) aatVar.get(zivVar)) {
            if (set.contains(zivVar2)) {
                ygpVar.c(zivVar2);
            } else {
                ygpVar.k(a(set, aatVar, zivVar2));
            }
        }
        return ygpVar.g();
    }

    public static void b(aat aatVar, ziv zivVar, ziv zivVar2) {
        Set setNewSetFromMap = (Set) aatVar.get(zivVar);
        if (setNewSetFromMap == null) {
            setNewSetFromMap = Collections.newSetFromMap(new yw());
            aatVar.put(zivVar, setNewSetFromMap);
        }
        setNewSetFromMap.add(zivVar2);
    }
}
