package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aijv {
    private static final agcs<aiki<aiky>> REFINER_CAPABILITY = new agcs<>("KotlinTypeRefiner");

    public static final agcs<aiki<aiky>> getREFINER_CAPABILITY() {
        return REFINER_CAPABILITY;
    }

    public static final List<aigl> refineTypes(aiju aijuVar, Iterable<? extends aigl> iterable) {
        aijuVar.getClass();
        iterable.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(iterable, 10));
        Iterator<? extends aigl> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(aijuVar.refineType((ailw) it.next()));
        }
        return arrayList;
    }
}
