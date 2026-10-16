package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final /* synthetic */ class ahde {
    public static final ajhz a(String str) {
        try {
            aisj aisjVarC = ajhz.a.c(str, 0);
            if (aisjVarC == null) {
                throw new IllegalArgumentException(a.bq(str, "No subtype found for: \"", "\""));
            }
            ((String) aisjVarC.a().get(1)).toLowerCase(Locale.ROOT).getClass();
            ((String) aisjVarC.a().get(2)).toLowerCase(Locale.ROOT).getClass();
            ArrayList arrayList = new ArrayList();
            int i = aisjVarC.b().b;
            while (true) {
                int i2 = i + 1;
                if (i2 >= str.length()) {
                    return new ajhz(str, (String[]) arrayList.toArray(new String[0]));
                }
                aisj aisjVarC2 = ajhz.b.c(str, i2);
                if (aisjVarC2 == null) {
                    String strSubstring = str.substring(i2);
                    strSubstring.getClass();
                    throw new IllegalArgumentException(a.bC(str, strSubstring, "Parameter is not formatted correctly: \"", "\" for: \"", "\""));
                }
                aisl aislVar = ((aism) aisjVarC2).b;
                aisi aisiVarB = aislVar.b(1);
                String str2 = aisiVarB != null ? aisiVarB.a : null;
                if (str2 == null) {
                    i = aisjVarC2.b().b;
                } else {
                    aisi aisiVarB2 = aislVar.b(2);
                    String strSubstring2 = aisiVarB2 != null ? aisiVarB2.a : null;
                    if (strSubstring2 == null) {
                        aisi aisiVarB3 = aislVar.b(3);
                        aisiVarB3.getClass();
                        strSubstring2 = aisiVarB3.a;
                    } else if (afyh.M(strSubstring2, '\'') && afyh.B(strSubstring2, '\'') && strSubstring2.length() > 2) {
                        strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
                        strSubstring2.getClass();
                    }
                    arrayList.add(str2);
                    arrayList.add(strSubstring2);
                    i = aisjVarC2.b().b;
                }
            }
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final int b(String str) {
        if (affa.f(str, "http")) {
            return 80;
        }
        return !affa.f(str, "https") ? -1 : 443;
    }

    public static final void c(List list, StringBuilder sb) {
        afgy afgyVarL = afpt.l(afpt.m(0, list.size()), 2);
        int i = afgyVarL.a;
        int i2 = afgyVarL.b;
        int i3 = afgyVarL.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    public static /* synthetic */ int m(boolean z) {
        return z ? 1231 : 1237;
    }
}
