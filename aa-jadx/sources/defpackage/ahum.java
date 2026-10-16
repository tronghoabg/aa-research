package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahum {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> java.util.Collection<H> selectMostSpecificInEachOverridableGroup(java.util.Collection<? extends H> collection, defpackage.affc<? super H, ? extends defpackage.agbv> affcVar) {
        collection.getClass();
        affcVar.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(collection);
        defpackage.aiqv aiqvVarCreate = defpackage.aiqv.Companion.create();
        while (!linkedList.isEmpty()) {
            java.lang.Object objAz = defpackage.afga.az(linkedList);
            defpackage.aiqv aiqvVarCreate2 = defpackage.aiqv.Companion.create();
            java.util.Collection<defpackage.aaac> collectionExtractMembersOverridableInBothWays = defpackage.ahuj.extractMembersOverridableInBothWays(objAz, linkedList, affcVar, new defpackage.ahul(aiqvVarCreate2));
            if (collectionExtractMembersOverridableInBothWays.size() == 1 && aiqvVarCreate2.isEmpty()) {
                java.lang.Object objAG = defpackage.afga.aG(collectionExtractMembersOverridableInBothWays);
                objAG.getClass();
                aiqvVarCreate.add(objAG);
            } else {
                defpackage.aaac aaacVar = (java.lang.Object) defpackage.ahuj.selectMostSpecificMember(collectionExtractMembersOverridableInBothWays, affcVar);
                aaacVar.getClass();
                defpackage.agbv agbvVarInvoke = affcVar.invoke(aaacVar);
                for (defpackage.aaac aaacVar2 : collectionExtractMembersOverridableInBothWays) {
                    aaacVar2.getClass();
                    if (!defpackage.ahuj.isMoreSpecific(agbvVarInvoke, affcVar.invoke(aaacVar2))) {
                        aiqvVarCreate2.add(aaacVar2);
                    }
                }
                if (!aiqvVarCreate2.isEmpty()) {
                    aiqvVarCreate.addAll(aiqvVarCreate2);
                }
                aiqvVarCreate.add(aaacVar);
            }
        }
        return aiqvVarCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk selectMostSpecificInEachOverridableGroup$lambda$0(defpackage.aiqv aiqvVar, java.lang.Object obj) {
        obj.getClass();
        aiqvVar.add(obj);
        return defpackage.afbk.a;
    }
}
