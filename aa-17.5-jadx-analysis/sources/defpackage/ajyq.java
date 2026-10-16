package defpackage;

import java.util.Locale;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
public final class ajyq extends ajyd {
    @Override // defpackage.ajyd, defpackage.ajuh
    public final String a() {
        return "domain";
    }

    @Override // defpackage.ajyd, defpackage.ajuj
    public final void b(ajuu ajuuVar, String str) throws ajut {
        if (ahku.a(str)) {
            throw new ajut("Blank or null value for domain attribute");
        }
        ajuuVar.j(str);
    }

    @Override // defpackage.ajyd, defpackage.ajuj
    public final void c(ajui ajuiVar, ajul ajulVar) throws ajut {
        String str = ajulVar.a;
        String strB = ajuiVar.b();
        if (!str.equals(strB) && !ajyd.e(strB, str)) {
            throw new ajun(a.bC(str, strB, "Illegal domain attribute \"", "\". Domain of origin: \"", "\""));
        }
        if (str.contains(".")) {
            int iCountTokens = new StringTokenizer(strB, ".").countTokens();
            String upperCase = strB.toUpperCase(Locale.ROOT);
            if (upperCase.endsWith(".COM") || upperCase.endsWith(".EDU") || upperCase.endsWith(".NET") || upperCase.endsWith(".GOV") || upperCase.endsWith(".MIL") || upperCase.endsWith(".ORG") || upperCase.endsWith(".INT")) {
                if (iCountTokens < 2) {
                    throw new ajun(a.bq(strB, "Domain attribute \"", "\" violates the Netscape cookie specification for special domains"));
                }
            } else if (iCountTokens < 3) {
                throw new ajun(a.bq(strB, "Domain attribute \"", "\" violates the Netscape cookie specification"));
            }
        }
    }

    @Override // defpackage.ajyd, defpackage.ajuj
    public final boolean d(ajui ajuiVar, ajul ajulVar) {
        ahgm.e(ajuiVar, "Cookie");
        String strB = ajuiVar.b();
        if (strB == null) {
            return false;
        }
        return ajulVar.a.endsWith(strB);
    }
}
