package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class agsv {
    public static final agcc PACKAGE_VISIBILITY;
    public static final agcc PROTECTED_AND_PACKAGE;
    public static final agcc PROTECTED_STATIC_VISIBILITY;
    private static final Map<agey, agcc> visibilitiesMapping;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    static {
        agss agssVar = new agss(agjb.INSTANCE);
        PACKAGE_VISIBILITY = agssVar;
        agst agstVar = new agst(agjd.INSTANCE);
        PROTECTED_STATIC_VISIBILITY = agstVar;
        agsu agsuVar = new agsu(agjc.INSTANCE);
        PROTECTED_AND_PACKAGE = agsuVar;
        visibilitiesMapping = new HashMap();
        recordVisibilityMapping(agssVar);
        recordVisibilityMapping(agstVar);
        recordVisibilityMapping(agsuVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean areInSamePackage(agbi agbiVar, agbi agbiVar2) {
        if (agbiVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agbiVar2 == null) {
            $$$reportNull$$$0(3);
        }
        agdc agdcVar = (agdc) ahst.getParentOfType(agbiVar, agdc.class, false);
        agdc agdcVar2 = (agdc) ahst.getParentOfType(agbiVar2, agdc.class, false);
        return (agdcVar2 == null || agdcVar == null || !agdcVar.getFqName().equals(agdcVar2.getFqName())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isVisibleForProtectedAndPackage(ahya ahyaVar, agbm agbmVar, agbi agbiVar) {
        if (agbmVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agbiVar == null) {
            $$$reportNull$$$0(1);
        }
        if (areInSamePackage(ahst.unwrapFakeOverrideToAnyDeclaration(agbmVar), agbiVar)) {
            return true;
        }
        return agcb.PROTECTED.isVisible(ahyaVar, agbmVar, agbiVar, false);
    }

    private static void recordVisibilityMapping(agcc agccVar) {
        visibilitiesMapping.put(agccVar.getDelegate(), agccVar);
    }

    public static agcc toDescriptorVisibility(agey ageyVar) {
        if (ageyVar == null) {
            $$$reportNull$$$0(4);
        }
        agcc agccVar = visibilitiesMapping.get(ageyVar);
        return agccVar == null ? agcb.toDescriptorVisibility(ageyVar) : agccVar;
    }
}
