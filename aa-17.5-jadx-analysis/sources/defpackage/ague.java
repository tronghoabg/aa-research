package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class ague {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static agel getAnnotationParameterByName(ahnj ahnjVar, agba agbaVar) {
        if (ahnjVar == null) {
            $$$reportNull$$$0(19);
        }
        if (agbaVar == null) {
            $$$reportNull$$$0(20);
        }
        Collection<agaz> constructors = agbaVar.getConstructors();
        if (constructors.size() != 1) {
            return null;
        }
        for (agel agelVar : constructors.iterator().next().getValueParameters()) {
            if (agelVar.getName().equals(ahnjVar)) {
                return agelVar;
            }
        }
        return null;
    }

    private static <D extends agax> Collection<D> resolveOverrides(ahnj ahnjVar, Collection<D> collection, Collection<D> collection2, agba agbaVar, ahzh ahzhVar, ahtj ahtjVar, boolean z) {
        if (ahnjVar == null) {
            $$$reportNull$$$0(12);
        }
        if (collection == null) {
            $$$reportNull$$$0(13);
        }
        if (collection2 == null) {
            $$$reportNull$$$0(14);
        }
        if (agbaVar == null) {
            $$$reportNull$$$0(15);
        }
        if (ahzhVar == null) {
            $$$reportNull$$$0(16);
        }
        if (ahtjVar == null) {
            $$$reportNull$$$0(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ahtjVar.generateOverridesInFunctionGroup(ahnjVar, collection, collection2, agbaVar, new agud(ahzhVar, linkedHashSet, z));
        return linkedHashSet;
    }

    public static <D extends agax> Collection<D> resolveOverridesForNonStaticMembers(ahnj ahnjVar, Collection<D> collection, Collection<D> collection2, agba agbaVar, ahzh ahzhVar, ahtj ahtjVar) {
        if (ahnjVar == null) {
            $$$reportNull$$$0(0);
        }
        if (collection == null) {
            $$$reportNull$$$0(1);
        }
        if (collection2 == null) {
            $$$reportNull$$$0(2);
        }
        if (agbaVar == null) {
            $$$reportNull$$$0(3);
        }
        if (ahzhVar == null) {
            $$$reportNull$$$0(4);
        }
        if (ahtjVar == null) {
            $$$reportNull$$$0(5);
        }
        return resolveOverrides(ahnjVar, collection, collection2, agbaVar, ahzhVar, ahtjVar, false);
    }

    public static <D extends agax> Collection<D> resolveOverridesForStaticMembers(ahnj ahnjVar, Collection<D> collection, Collection<D> collection2, agba agbaVar, ahzh ahzhVar, ahtj ahtjVar) {
        if (ahnjVar == null) {
            $$$reportNull$$$0(6);
        }
        if (collection == null) {
            $$$reportNull$$$0(7);
        }
        if (collection2 == null) {
            $$$reportNull$$$0(8);
        }
        if (agbaVar == null) {
            $$$reportNull$$$0(9);
        }
        if (ahzhVar == null) {
            $$$reportNull$$$0(10);
        }
        if (ahtjVar == null) {
            $$$reportNull$$$0(11);
        }
        return resolveOverrides(ahnjVar, collection, collection2, agbaVar, ahzhVar, ahtjVar, true);
    }
}
