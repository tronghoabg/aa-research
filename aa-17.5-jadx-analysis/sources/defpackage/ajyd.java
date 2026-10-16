package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
public class ajyd implements ajuh {
    static boolean e(String str, String str2) {
        if (!ajug.a(str2) && !ajug.b(str2)) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            if (str2.endsWith(str)) {
                int length = str2.length() - str.length();
                if (length == 0) {
                    return true;
                }
                if (length > 1 && str2.charAt(length - 1) == '.') {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ajuh
    public String a() {
        return "domain";
    }

    @Override // defpackage.ajuj
    public void b(ajuu ajuuVar, String str) throws ajut {
        if (ahku.a(str)) {
            throw new ajut("Blank or null value for domain attribute");
        }
        if (str.endsWith(".")) {
            return;
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        ajuuVar.j(str.toLowerCase(Locale.ROOT));
    }

    @Override // defpackage.ajuj
    public void c(ajui ajuiVar, ajul ajulVar) throws ajut {
        ahgm.e(ajuiVar, "Cookie");
        String strB = ajuiVar.b();
        if (strB == null) {
            throw new ajun("Cookie 'domain' may not be null");
        }
        String str = ajulVar.a;
        if (!str.equals(strB) && !e(strB, str)) {
            throw new ajun(a.bC(str, strB, "Illegal 'domain' attribute \"", "\". Domain of origin: \"", "\""));
        }
    }

    @Override // defpackage.ajuj
    public boolean d(ajui ajuiVar, ajul ajulVar) {
        ahgm.e(ajuiVar, "Cookie");
        String strB = ajuiVar.b();
        if (strB == null) {
            return false;
        }
        if (strB.startsWith(".")) {
            strB = strB.substring(1);
        }
        String str = ajulVar.a;
        String lowerCase = strB.toLowerCase(Locale.ROOT);
        if (str.equals(lowerCase)) {
            return true;
        }
        if ((ajuiVar instanceof ajyc) && ((ajyc) ajuiVar).p("domain")) {
            return e(lowerCase, str);
        }
        return false;
    }
}
