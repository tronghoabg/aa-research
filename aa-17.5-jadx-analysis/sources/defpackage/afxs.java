package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class afxs {
    public static final afxs INSTANCE = new afxs();
    private static final Set<ahnd> classIds;

    static {
        Set<afyi> set = afyi.NUMBER_TYPES;
        afyo afyoVar = afyo.INSTANCE;
        ArrayList arrayList = new ArrayList(woy.bp(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(afyo.getPrimitiveFqName((afyi) it.next()));
        }
        List listBZ = woy.bZ(woy.bZ(woy.bZ(arrayList, afyn.string.toSafe()), afyn._boolean.toSafe()), afyn._enum.toSafe());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ahnc ahncVar = ahnd.Companion;
        Iterator it2 = listBZ.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(ahncVar.topLevel((ahnf) it2.next()));
        }
        classIds = linkedHashSet;
    }

    private afxs() {
    }

    public final Set<ahnd> allClassesWithIntrinsicCompanions() {
        return classIds;
    }

    public final Set<ahnd> getClassIds() {
        return classIds;
    }
}
