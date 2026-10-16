package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class agdb {
    private final aiea<agcz, agba> classes;
    private final agcu module;
    private final aiea<ahnf, agdc> packageFragments;
    private final aiei storageManager;

    public agdb(aiei aieiVar, agcu agcuVar) {
        aieiVar.getClass();
        agcuVar.getClass();
        this.storageManager = aieiVar;
        this.module = agcuVar;
        this.packageFragments = aieiVar.createMemoizedFunction(new agcx(this));
        this.classes = aieiVar.createMemoizedFunction(new agcy(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agba classes$lambda$0(agdb agdbVar, agcz agczVar) {
        agdc agdcVarInvoke;
        agczVar.getClass();
        ahnd ahndVarComponent1 = agczVar.component1();
        List<Integer> listComponent2 = agczVar.component2();
        if (ahndVarComponent1.isLocal()) {
            Objects.toString(ahndVarComponent1);
            throw new UnsupportedOperationException("Unresolved local class: ".concat(String.valueOf(ahndVarComponent1)));
        }
        ahnd outerClassId = ahndVarComponent1.getOuterClassId();
        if (outerClassId == null || (agdcVarInvoke = agdbVar.getClass(outerClassId, woy.bR(listComponent2, 1))) == null) {
            agdcVarInvoke = agdbVar.packageFragments.invoke(ahndVarComponent1.getPackageFqName());
        }
        agbi agbiVar = agdcVarInvoke;
        boolean zIsNestedClass = ahndVarComponent1.isNestedClass();
        aiei aieiVar = agdbVar.storageManager;
        ahnj shortClassName = ahndVarComponent1.getShortClassName();
        Integer num = (Integer) woy.bH(listComponent2);
        return new agda(aieiVar, agbiVar, shortClassName, zIsNestedClass, num != null ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agdc packageFragments$lambda$0(agdb agdbVar, ahnf ahnfVar) {
        ahnfVar.getClass();
        return new aghb(agdbVar.module, ahnfVar);
    }

    public final agba getClass(ahnd ahndVar, List<Integer> list) {
        ahndVar.getClass();
        list.getClass();
        return this.classes.invoke(new agcz(ahndVar, list));
    }
}
