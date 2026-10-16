package defpackage;

/* loaded from: classes3.dex */
public final class ahey implements ahex {
    public static final ahey INSTANCE = new ahey();

    private ahey() {
    }

    @Override // defpackage.ahex
    public ahew boxType(ahew ahewVar) {
        ahewVar.getClass();
        if (ahewVar instanceof ahev) {
            ahev ahevVar = (ahev) ahewVar;
            if (ahevVar.getJvmPrimitiveType() != null) {
                String internalName = ahwd.byFqNameWithoutInnerClasses(ahevVar.getJvmPrimitiveType().getWrapperFqName()).getInternalName();
                internalName.getClass();
                return createObjectType(internalName);
            }
        }
        return ahewVar;
    }

    @Override // defpackage.ahex
    public ahew createFromString(String str) {
        ahwe ahweVar;
        str.getClass();
        str.length();
        char cCharAt = str.charAt(0);
        ahwe[] ahweVarArrValues = ahwe.values();
        int length = ahweVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ahweVar = null;
                break;
            }
            ahweVar = ahweVarArrValues[i];
            if (ahweVar.getDesc().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (ahweVar != null) {
            return new ahev(ahweVar);
        }
        if (cCharAt == 'V') {
            return new ahev(null);
        }
        if (cCharAt == '[') {
            String strSubstring = str.substring(1);
            strSubstring.getClass();
            return new ahes(createFromString(strSubstring));
        }
        if (cCharAt == 'L') {
            afyh.B(str, ';');
        }
        String strSubstring2 = str.substring(1, str.length() - 1);
        strSubstring2.getClass();
        return new aheu(strSubstring2);
    }

    @Override // defpackage.ahex
    public aheu createObjectType(String str) {
        str.getClass();
        return new aheu(str);
    }

    @Override // defpackage.ahex
    public ahew createPrimitiveType(afyi afyiVar) {
        afyiVar.getClass();
        afyh afyhVar = afyi.Companion;
        switch (afyiVar.ordinal()) {
            case 0:
                return ahew.Companion.getBOOLEAN$org_jetbrains_kotlin_descriptors_jvm();
            case 1:
                return ahew.Companion.getCHAR$org_jetbrains_kotlin_descriptors_jvm();
            case 2:
                return ahew.Companion.getBYTE$org_jetbrains_kotlin_descriptors_jvm();
            case 3:
                return ahew.Companion.getSHORT$org_jetbrains_kotlin_descriptors_jvm();
            case 4:
                return ahew.Companion.getINT$org_jetbrains_kotlin_descriptors_jvm();
            case 5:
                return ahew.Companion.getFLOAT$org_jetbrains_kotlin_descriptors_jvm();
            case 6:
                return ahew.Companion.getLONG$org_jetbrains_kotlin_descriptors_jvm();
            case 7:
                return ahew.Companion.getDOUBLE$org_jetbrains_kotlin_descriptors_jvm();
            default:
                throw new aezs();
        }
    }

    @Override // defpackage.ahex
    public ahew getJavaLangClassType() {
        return createObjectType("java/lang/Class");
    }

    @Override // defpackage.ahex
    public String toString(ahew ahewVar) {
        String desc;
        ahewVar.getClass();
        if (ahewVar instanceof ahes) {
            return "[" + toString(((ahes) ahewVar).getElementType());
        }
        if (ahewVar instanceof ahev) {
            ahwe jvmPrimitiveType = ((ahev) ahewVar).getJvmPrimitiveType();
            return (jvmPrimitiveType == null || (desc = jvmPrimitiveType.getDesc()) == null) ? "V" : desc;
        }
        if (!(ahewVar instanceof aheu)) {
            throw new aezs();
        }
        return "L" + ((aheu) ahewVar).getInternalName() + ';';
    }
}
