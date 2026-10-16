package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ahsi {
    static /* synthetic */ String accessor$RenderingUtilsKt$lambda0(String str) {
        renderFlexibleMutabilityOrArrayElementVarianceType$lambda$0(str);
        return str;
    }

    public static final String renderFlexibleMutabilityOrArrayElementVarianceType(String str, String str2, afdr<String> afdrVar, afdr<String> afdrVar2, afec<? super String, String> afecVar) {
        str.getClass();
        str2.getClass();
        afdrVar.getClass();
        afdrVar2.getClass();
        afecVar.getClass();
        String strInvoke = afdrVar.invoke();
        String strValueOf = String.valueOf(strInvoke);
        String strReplacePrefixesInTypeRepresentations = replacePrefixesInTypeRepresentations(str, strValueOf.concat("Mutable"), str2, strInvoke, String.valueOf(strInvoke).concat("(Mutable)"));
        if (strReplacePrefixesInTypeRepresentations != null) {
            return strReplacePrefixesInTypeRepresentations;
        }
        String strValueOf2 = String.valueOf(strInvoke);
        String strValueOf3 = String.valueOf(strInvoke);
        String strValueOf4 = String.valueOf(strInvoke);
        String strReplacePrefixesInTypeRepresentations2 = replacePrefixesInTypeRepresentations(str, strValueOf2.concat("MutableMap.MutableEntry"), str2, strValueOf3.concat("Map.Entry"), strValueOf4.concat("(Mutable)Map.(Mutable)Entry"));
        if (strReplacePrefixesInTypeRepresentations2 != null) {
            return strReplacePrefixesInTypeRepresentations2;
        }
        String strInvoke2 = afdrVar2.invoke();
        String strInvoke3 = afecVar.invoke("Array<");
        String strValueOf5 = String.valueOf(strInvoke2);
        String strValueOf6 = String.valueOf(strInvoke3);
        String strInvoke4 = afecVar.invoke("Array<out ");
        String strValueOf7 = String.valueOf(strInvoke2);
        String strValueOf8 = String.valueOf(strInvoke4);
        String strInvoke5 = afecVar.invoke("Array<(out) ");
        String strValueOf9 = String.valueOf(strInvoke2);
        String strValueOf10 = String.valueOf(strInvoke5);
        String strReplacePrefixesInTypeRepresentations3 = replacePrefixesInTypeRepresentations(str, strValueOf5.concat(strValueOf6), str2, strValueOf7.concat(strValueOf8), strValueOf9.concat(strValueOf10));
        if (strReplacePrefixesInTypeRepresentations3 != null) {
            return strReplacePrefixesInTypeRepresentations3;
        }
        return null;
    }

    public static /* synthetic */ String renderFlexibleMutabilityOrArrayElementVarianceType$default(String str, String str2, afdr afdrVar, afdr afdrVar2, afec afecVar, int i, Object obj) {
        if ((i & 16) != 0) {
            afecVar = ahsh.INSTANCE;
        }
        return renderFlexibleMutabilityOrArrayElementVarianceType(str, str2, afdrVar, afdrVar2, afecVar);
    }

    private static final String renderFlexibleMutabilityOrArrayElementVarianceType$lambda$0(String str) {
        str.getClass();
        return str;
    }

    public static final String renderFqName(List<ahnj> list) {
        list.getClass();
        StringBuilder sb = new StringBuilder();
        for (ahnj ahnjVar : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(ahnk.render$default(ahnjVar, false, 1, null));
        }
        return sb.toString();
    }

    public static final String replacePrefixesInTypeRepresentations(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        if (!afyh.g(str, str2, false) || !afyh.g(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        strSubstring.getClass();
        String strSubstring2 = str3.substring(str4.length());
        strSubstring2.getClass();
        boolean zF = affa.f(strSubstring, strSubstring2);
        String strConcat = str5.concat(strSubstring);
        if (zF) {
            return strConcat;
        }
        if (!typeStringsDifferOnlyInNullability(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    public static final boolean typeStringsDifferOnlyInNullability(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (affa.f(str, afyh.J(str2, "?", ""))) {
            return true;
        }
        if (afyh.e(str2, "?", false)) {
            if (affa.f(str + '?', str2)) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return affa.f(sb.toString(), str2);
    }
}
