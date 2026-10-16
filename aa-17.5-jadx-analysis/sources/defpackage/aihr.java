package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aihr extends aine<aihn<?>, aihn<?>> implements Iterable<aihn<?>>, afgc {
    public static final aihq Companion = new aihq(null);
    private static final aihr Empty = new aihr(afbe.a);

    private aihr(List<? extends aihn<?>> list) {
        for (aihn<?> aihnVar : list) {
            registerComponent((afhe) aihnVar.getKey(), (afhg) aihnVar);
        }
    }

    public final aihr add(aihr aihrVar) {
        aihn aihnVarAdd;
        aihrVar.getClass();
        if (isEmpty() && aihrVar.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.getIndices().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            aihn<?> aihnVar = getArrayMap().get(iIntValue);
            aihn<?> aihnVar2 = aihrVar.getArrayMap().get(iIntValue);
            if (aihnVar == null) {
                aihnVarAdd = null;
                if (aihnVar2 != null) {
                    aihnVarAdd = aihnVar2.add(null);
                }
            } else {
                aihnVarAdd = aihnVar.add(aihnVar2);
            }
            aiow.addIfNotNull(arrayList, aihnVarAdd);
        }
        return Companion.create(arrayList);
    }

    public final boolean contains(aihn<?> aihnVar) {
        aihnVar.getClass();
        return getArrayMap().get(Companion.getId((afhe) aihnVar.getKey())) != null;
    }

    @Override // defpackage.aimy
    protected aioo<aihn<?>, aihn<?>> getTypeRegistry() {
        return Companion;
    }

    public final aihr intersect(aihr aihrVar) {
        aihn aihnVarIntersect;
        aihrVar.getClass();
        if (isEmpty() && aihrVar.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.getIndices().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            aihn<?> aihnVar = getArrayMap().get(iIntValue);
            aihn<?> aihnVar2 = aihrVar.getArrayMap().get(iIntValue);
            if (aihnVar == null) {
                aihnVarIntersect = null;
                if (aihnVar2 != null) {
                    aihnVarIntersect = aihnVar2.intersect(null);
                }
            } else {
                aihnVarIntersect = aihnVar.intersect(aihnVar2);
            }
            aiow.addIfNotNull(arrayList, aihnVarIntersect);
        }
        return Companion.create(arrayList);
    }

    public final aihr plus(aihn<?> aihnVar) {
        aihnVar.getClass();
        if (contains(aihnVar)) {
            return this;
        }
        if (isEmpty()) {
            return new aihr(aihnVar);
        }
        return Companion.create(woy.bZ(woy.cf(this), aihnVar));
    }

    public final aihr remove(aihn<?> aihnVar) {
        aihnVar.getClass();
        if (isEmpty()) {
            return this;
        }
        aina<aihn<?>> arrayMap = getArrayMap();
        ArrayList arrayList = new ArrayList();
        for (aihn<?> aihnVar2 : arrayMap) {
            if (!affa.f(aihnVar2, aihnVar)) {
                arrayList.add(aihnVar2);
            }
        }
        return arrayList.size() != getArrayMap().getSize() ? Companion.create(arrayList) : this;
    }

    private aihr(aihn<?> aihnVar) {
        this((List<? extends aihn<?>>) woy.bg(aihnVar));
    }

    public /* synthetic */ aihr(List list, afeu afeuVar) {
        this((List<? extends aihn<?>>) list);
    }
}
