package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aiif {
    private aiif() {
    }

    public static final long a(long j) {
        return j < 0 ? aisq.b : aisq.a;
    }

    public static final long b(long j, long j2, aiss aissVar) {
        long j3 = j - j2;
        if (((~(j3 ^ j2)) & (j3 ^ j)) >= 0) {
            return afzc.d(j3, aissVar);
        }
        aiss aissVar2 = aiss.c;
        if (aissVar.compareTo(aissVar2) >= 0) {
            return aisq.j(a(j3));
        }
        long jConvert = aissVar.h.convert(1L, aissVar2.h);
        long j4 = (j / jConvert) - (j2 / jConvert);
        long j5 = (j % jConvert) - (j2 % jConvert);
        long j6 = aisq.a;
        return aisq.h(afzc.d(j4, aissVar2), afzc.d(j5, aissVar));
    }

    public static /* synthetic */ aiig createByConstructorsMap$default(aiif aiifVar, Map map, boolean z, int i, Object obj) {
        return aiifVar.createByConstructorsMap(map, z & ((i & 2) == 0));
    }

    public final aiit create(aiid aiidVar, List<? extends aiin> list) {
        aiidVar.getClass();
        list.getClass();
        List<agee> parameters = aiidVar.getParameters();
        parameters.getClass();
        agee ageeVar = (agee) woy.bL(parameters);
        if (ageeVar == null || !ageeVar.isCapturedFromOuterDeclaration()) {
            return new aigf(parameters, list);
        }
        List<agee> parameters2 = aiidVar.getParameters();
        parameters2.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(parameters2, 10));
        Iterator<T> it = parameters2.iterator();
        while (it.hasNext()) {
            arrayList.add(((agee) it.next()).getTypeConstructor());
        }
        return createByConstructorsMap$default(this, woy.bc(woy.ci(arrayList, list)), false, 2, null);
    }

    public final aiig createByConstructorsMap(Map<aiid, ? extends aiin> map) {
        map.getClass();
        return createByConstructorsMap$default(this, map, false, 2, null);
    }

    public /* synthetic */ aiif(afeu afeuVar) {
        this();
    }

    public final aiig createByConstructorsMap(Map<aiid, ? extends aiin> map, boolean z) {
        map.getClass();
        return new aiie(map, z);
    }

    public final aiit create(aigl aiglVar) {
        aiglVar.getClass();
        return create(aiglVar.getConstructor(), aiglVar.getArguments());
    }
}
