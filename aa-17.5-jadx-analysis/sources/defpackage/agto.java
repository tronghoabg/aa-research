package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class agto {
    public static final List<ahnj> getPropertyNamesCandidatesByAccessorName(ahnj ahnjVar) {
        ahnjVar.getClass();
        String strAsString = ahnjVar.asString();
        strAsString.getClass();
        return agth.isGetterName(strAsString) ? woy.bj(propertyNameByGetMethodName(ahnjVar)) : agth.isSetterName(strAsString) ? propertyNamesBySetMethodName(ahnjVar) : agsc.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(ahnjVar);
    }

    public static final ahnj propertyNameByGetMethodName(ahnj ahnjVar) {
        ahnjVar.getClass();
        ahnj ahnjVarPropertyNameFromAccessorMethodName$default = propertyNameFromAccessorMethodName$default(ahnjVar, "get", false, null, 12, null);
        return ahnjVarPropertyNameFromAccessorMethodName$default == null ? propertyNameFromAccessorMethodName$default(ahnjVar, "is", false, null, 8, null) : ahnjVarPropertyNameFromAccessorMethodName$default;
    }

    public static final ahnj propertyNameBySetMethodName(ahnj ahnjVar, boolean z) {
        ahnjVar.getClass();
        return propertyNameFromAccessorMethodName$default(ahnjVar, "set", false, true != z ? null : "is", 4, null);
    }

    private static final ahnj propertyNameFromAccessorMethodName(ahnj ahnjVar, String str, boolean z, String str2) {
        if (ahnjVar.isSpecial()) {
            return null;
        }
        String identifier = ahnjVar.getIdentifier();
        identifier.getClass();
        if (!afyh.g(identifier, str, false) || identifier.length() == str.length()) {
            return null;
        }
        char cCharAt = identifier.charAt(str.length());
        if (cCharAt >= 'a' && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return ahnj.identifier(str2.concat(afyh.m(identifier, str)));
        }
        if (!z) {
            return ahnjVar;
        }
        String strDecapitalizeSmartForCompiler = aiou.decapitalizeSmartForCompiler(afyh.m(identifier, str), true);
        if (ahnj.isValidIdentifier(strDecapitalizeSmartForCompiler)) {
            return ahnj.identifier(strDecapitalizeSmartForCompiler);
        }
        return null;
    }

    static /* synthetic */ ahnj propertyNameFromAccessorMethodName$default(ahnj ahnjVar, String str, boolean z, String str2, int i, Object obj) {
        boolean z2 = z | (!((i & 4) == 0));
        if ((i & 8) != 0) {
            str2 = null;
        }
        return propertyNameFromAccessorMethodName(ahnjVar, str, z2, str2);
    }

    public static final List<ahnj> propertyNamesBySetMethodName(ahnj ahnjVar) {
        ahnjVar.getClass();
        return woy.da(new ahnj[]{propertyNameBySetMethodName(ahnjVar, false), propertyNameBySetMethodName(ahnjVar, true)});
    }
}
