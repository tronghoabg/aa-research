package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ahnk {
    public static final String render(ahnj ahnjVar, boolean z) {
        ahnjVar.getClass();
        String strAsStringStripSpecialMarkers = z ? ahnjVar.asStringStripSpecialMarkers() : ahnjVar.asString();
        strAsStringStripSpecialMarkers.getClass();
        if ((z && ahnjVar.isSpecial()) || !shouldBeEscaped(strAsStringStripSpecialMarkers)) {
            return strAsStringStripSpecialMarkers;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("`" + strAsStringStripSpecialMarkers);
        sb.append('`');
        return sb.toString();
    }

    public static /* synthetic */ String render$default(ahnj ahnjVar, boolean z, int i, Object obj) {
        return render(ahnjVar, 1 == ((z ? 1 : 0) & ((i & 1) ^ 1)));
    }

    private static final String renderFqName(List<ahnj> list) {
        StringBuilder sb = new StringBuilder();
        for (ahnj ahnjVar : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(render$default(ahnjVar, false, 1, null));
        }
        return sb.toString();
    }

    private static final boolean shouldBeEscaped(String str) {
        if (ahsa.KEYWORDS.contains(str)) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return true;
            }
        }
        return str.length() == 0 || !Character.isJavaIdentifierStart(str.codePointAt(0));
    }

    public static final String render(ahnh ahnhVar) {
        ahnhVar.getClass();
        return renderFqName(ahnhVar.pathSegments());
    }
}
