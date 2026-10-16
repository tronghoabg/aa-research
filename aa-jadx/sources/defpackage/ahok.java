package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahok {
    public static final java.lang.String render(defpackage.ahoj ahojVar, boolean z) {
        ahojVar.getClass();
        java.lang.String strAsStringStripSpecialMarkers = z ? ahojVar.asStringStripSpecialMarkers() : ahojVar.asString();
        strAsStringStripSpecialMarkers.getClass();
        if ((z && ahojVar.isSpecial()) || !shouldBeEscaped(strAsStringStripSpecialMarkers)) {
            return strAsStringStripSpecialMarkers;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("`" + strAsStringStripSpecialMarkers);
        sb.append('`');
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String render$default(defpackage.ahoj ahojVar, boolean z, int i, java.lang.Object obj) {
        return render(ahojVar, 1 == ((z ? 1 : 0) & ((i & 1) ^ 1)));
    }

    private static final java.lang.String renderFqName(java.util.List<defpackage.ahoj> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (defpackage.ahoj ahojVar : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(render$default(ahojVar, false, 1, null));
        }
        return sb.toString();
    }

    private static final boolean shouldBeEscaped(java.lang.String str) {
        if (defpackage.ahta.KEYWORDS.contains(str)) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!java.lang.Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return true;
            }
        }
        return str.length() == 0 || !java.lang.Character.isJavaIdentifierStart(str.codePointAt(0));
    }

    public static final java.lang.String render(defpackage.ahoh ahohVar) {
        ahohVar.getClass();
        return renderFqName(ahohVar.pathSegments());
    }
}
