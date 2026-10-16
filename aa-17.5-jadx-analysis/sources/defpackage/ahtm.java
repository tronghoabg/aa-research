package defpackage;

import java.util.Collection;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class ahtm {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> selectMostSpecificInEachOverridableGroup(Collection<? extends H> collection, afec<? super H, ? extends agav> afecVar) {
        collection.getClass();
        afecVar.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        aipv aipvVarCreate = aipv.Companion.create();
        while (!linkedList.isEmpty()) {
            Object objBF = woy.bF(linkedList);
            aipv aipvVarCreate2 = aipv.Companion.create();
            Collection<aaac> collectionExtractMembersOverridableInBothWays = ahtj.extractMembersOverridableInBothWays(objBF, linkedList, afecVar, new ahtl(aipvVarCreate2));
            if (collectionExtractMembersOverridableInBothWays.size() == 1 && aipvVarCreate2.isEmpty()) {
                Object objBM = woy.bM(collectionExtractMembersOverridableInBothWays);
                objBM.getClass();
                aipvVarCreate.add(objBM);
            } else {
                aaac aaacVar = (Object) ahtj.selectMostSpecificMember(collectionExtractMembersOverridableInBothWays, afecVar);
                aaacVar.getClass();
                agav agavVarInvoke = afecVar.invoke(aaacVar);
                for (aaac aaacVar2 : collectionExtractMembersOverridableInBothWays) {
                    aaacVar2.getClass();
                    if (!ahtj.isMoreSpecific(agavVarInvoke, afecVar.invoke(aaacVar2))) {
                        aipvVarCreate2.add(aaacVar2);
                    }
                }
                if (!aipvVarCreate2.isEmpty()) {
                    aipvVarCreate.addAll(aipvVarCreate2);
                }
                aipvVarCreate.add(aaacVar);
            }
        }
        return aipvVarCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak selectMostSpecificInEachOverridableGroup$lambda$0(aipv aipvVar, Object obj) {
        obj.getClass();
        aipvVar.add(obj);
        return afak.a;
    }
}
