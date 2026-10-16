package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class afyt implements agfy {
    private final agcu module;
    private final aiei storageManager;

    public afyt(aiei aieiVar, agcu agcuVar) {
        aieiVar.getClass();
        agcuVar.getClass();
        this.storageManager = aieiVar;
        this.module = agcuVar;
    }

    @Override // defpackage.agfy
    public agba createClass(ahnd ahndVar) {
        ahnf packageFqName;
        afzj functionalClassKindWithArity;
        ahndVar.getClass();
        if (ahndVar.isLocal() || ahndVar.isNestedClass()) {
            return null;
        }
        String strAsString = ahndVar.getRelativeClassName().asString();
        if (!afyh.u(strAsString, "Function", false) || (functionalClassKindWithArity = afzk.Companion.getDefault().getFunctionalClassKindWithArity((packageFqName = ahndVar.getPackageFqName()), strAsString)) == null) {
            return null;
        }
        agcu agcuVar = this.module;
        afzh afzhVarComponent1 = functionalClassKindWithArity.component1();
        int iComponent2 = functionalClassKindWithArity.component2();
        List<agdc> fragments = agcuVar.getPackage(packageFqName).getFragments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof afxr) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof afxx) {
                arrayList2.add(obj2);
            }
        }
        agdc agdcVar = (afxx) woy.bH(arrayList2);
        if (agdcVar == null) {
            agdcVar = (afxr) woy.bF(arrayList);
        }
        return new afyw(this.storageManager, agdcVar, afzhVarComponent1, iComponent2);
    }

    @Override // defpackage.agfy
    public Collection<agba> getAllContributedClassesIfPossible(ahnf ahnfVar) {
        ahnfVar.getClass();
        return afbg.a;
    }

    @Override // defpackage.agfy
    public boolean shouldCreateClass(ahnf ahnfVar, ahnj ahnjVar) {
        ahnfVar.getClass();
        ahnjVar.getClass();
        String strAsString = ahnjVar.asString();
        strAsString.getClass();
        return (afyh.g(strAsString, "Function", false) || afyh.g(strAsString, "KFunction", false) || afyh.g(strAsString, "SuspendFunction", false) || afyh.g(strAsString, "KSuspendFunction", false)) && afzk.Companion.getDefault().getFunctionalClassKindWithArity(ahnfVar, strAsString) != null;
    }
}
