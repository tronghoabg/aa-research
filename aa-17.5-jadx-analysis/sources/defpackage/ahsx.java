package defpackage;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class ahsx implements Comparator {
    public static final ahsx INSTANCE = new ahsx();

    private ahsx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Integer compareInternal(agbi agbiVar, agbi agbiVar2) {
        int declarationPriority = getDeclarationPriority(agbiVar2) - getDeclarationPriority(agbiVar);
        if (declarationPriority != 0) {
            return Integer.valueOf(declarationPriority);
        }
        if (ahst.isEnumEntry(agbiVar) && ahst.isEnumEntry(agbiVar2)) {
            return 0;
        }
        int iCompareTo = agbiVar.getName().compareTo(agbiVar2.getName());
        if (iCompareTo != 0) {
            return Integer.valueOf(iCompareTo);
        }
        return null;
    }

    private static int getDeclarationPriority(agbi agbiVar) {
        if (ahst.isEnumEntry(agbiVar)) {
            return 8;
        }
        if (agbiVar instanceof agbh) {
            return 7;
        }
        if (agbiVar instanceof agdn) {
            return ((agdn) agbiVar).getExtensionReceiverParameter() == null ? 6 : 5;
        }
        if (agbiVar instanceof agcj) {
            return ((agcj) agbiVar).getExtensionReceiverParameter() == null ? 4 : 3;
        }
        if (agbiVar instanceof agba) {
            return 2;
        }
        return agbiVar instanceof aged ? 1 : 0;
    }

    @Override // java.util.Comparator
    public int compare(agbi agbiVar, agbi agbiVar2) {
        Integer numCompareInternal = compareInternal(agbiVar, agbiVar2);
        if (numCompareInternal != null) {
            return numCompareInternal.intValue();
        }
        return 0;
    }
}
