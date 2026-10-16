package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahti {
    static /* synthetic */ java.lang.String accessor$RenderingUtilsKt$lambda0(java.lang.String str) {
        renderFlexibleMutabilityOrArrayElementVarianceType$lambda$0(str);
        return str;
    }

    public static final java.lang.String renderFlexibleMutabilityOrArrayElementVarianceType(java.lang.String str, java.lang.String str2, defpackage.afer<java.lang.String> aferVar, defpackage.afer<java.lang.String> aferVar2, defpackage.affc<? super java.lang.String, java.lang.String> affcVar) {
        str.getClass();
        str2.getClass();
        aferVar.getClass();
        aferVar2.getClass();
        affcVar.getClass();
        java.lang.String strInvoke = aferVar.invoke();
        java.lang.String strValueOf = java.lang.String.valueOf(strInvoke);
        java.lang.String strReplacePrefixesInTypeRepresentations = replacePrefixesInTypeRepresentations(str, strValueOf.concat("Mutable"), str2, strInvoke, java.lang.String.valueOf(strInvoke).concat("(Mutable)"));
        if (strReplacePrefixesInTypeRepresentations != null) {
            return strReplacePrefixesInTypeRepresentations;
        }
        java.lang.String strValueOf2 = java.lang.String.valueOf(strInvoke);
        java.lang.String strValueOf3 = java.lang.String.valueOf(strInvoke);
        java.lang.String strValueOf4 = java.lang.String.valueOf(strInvoke);
        java.lang.String strReplacePrefixesInTypeRepresentations2 = replacePrefixesInTypeRepresentations(str, strValueOf2.concat("MutableMap.MutableEntry"), str2, strValueOf3.concat("Map.Entry"), strValueOf4.concat("(Mutable)Map.(Mutable)Entry"));
        if (strReplacePrefixesInTypeRepresentations2 != null) {
            return strReplacePrefixesInTypeRepresentations2;
        }
        java.lang.String strInvoke2 = aferVar2.invoke();
        java.lang.String strInvoke3 = affcVar.invoke("Array<");
        java.lang.String strValueOf5 = java.lang.String.valueOf(strInvoke2);
        java.lang.String strValueOf6 = java.lang.String.valueOf(strInvoke3);
        java.lang.String strInvoke4 = affcVar.invoke("Array<out ");
        java.lang.String strValueOf7 = java.lang.String.valueOf(strInvoke2);
        java.lang.String strValueOf8 = java.lang.String.valueOf(strInvoke4);
        java.lang.String strInvoke5 = affcVar.invoke("Array<(out) ");
        java.lang.String strValueOf9 = java.lang.String.valueOf(strInvoke2);
        java.lang.String strValueOf10 = java.lang.String.valueOf(strInvoke5);
        java.lang.String strReplacePrefixesInTypeRepresentations3 = replacePrefixesInTypeRepresentations(str, strValueOf5.concat(strValueOf6), str2, strValueOf7.concat(strValueOf8), strValueOf9.concat(strValueOf10));
        if (strReplacePrefixesInTypeRepresentations3 != null) {
            return strReplacePrefixesInTypeRepresentations3;
        }
        return null;
    }

    public static /* synthetic */ java.lang.String renderFlexibleMutabilityOrArrayElementVarianceType$default(java.lang.String str, java.lang.String str2, defpackage.afer aferVar, defpackage.afer aferVar2, defpackage.affc affcVar, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            affcVar = defpackage.ahth.INSTANCE;
        }
        return renderFlexibleMutabilityOrArrayElementVarianceType(str, str2, aferVar, aferVar2, affcVar);
    }

    private static final java.lang.String renderFlexibleMutabilityOrArrayElementVarianceType$lambda$0(java.lang.String str) {
        str.getClass();
        return str;
    }

    public static final java.lang.String renderFqName(java.util.List<defpackage.ahoj> list) {
        list.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (defpackage.ahoj ahojVar : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(defpackage.ahok.render$default(ahojVar, false, 1, null));
        }
        return sb.toString();
    }

    public static final java.lang.String replacePrefixesInTypeRepresentations(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        if (!defpackage.afzh.g(str, str2, false) || !defpackage.afzh.g(str3, str4, false)) {
            return null;
        }
        java.lang.String strSubstring = str.substring(str2.length());
        strSubstring.getClass();
        java.lang.String strSubstring2 = str3.substring(str4.length());
        strSubstring2.getClass();
        boolean zF = defpackage.afga.f(strSubstring, strSubstring2);
        java.lang.String strConcat = str5.concat(strSubstring);
        if (zF) {
            return strConcat;
        }
        if (!typeStringsDifferOnlyInNullability(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    public static final boolean typeStringsDifferOnlyInNullability(java.lang.String str, java.lang.String str2) {
        str.getClass();
        str2.getClass();
        if (defpackage.afga.f(str, defpackage.afzh.J(str2, "?", ""))) {
            return true;
        }
        if (defpackage.afzh.e(str2, "?", false)) {
            if (defpackage.afga.f(str + '?', str2)) {
                return true;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return defpackage.afga.f(sb.toString(), str2);
    }
}
