package defpackage;

/* loaded from: classes2.dex */
public class ajyg implements ajuh {
    @Override // defpackage.ajuh
    public final String a() {
        return "path";
    }

    @Override // defpackage.ajuj
    public final void b(ajuu ajuuVar, String str) throws ajut {
        if (true == ahku.a(str)) {
            str = "/";
        }
        ajuuVar.l(str);
    }

    @Override // defpackage.ajuj
    public final boolean d(ajui ajuiVar, ajul ajulVar) {
        ahgm.e(ajuiVar, "Cookie");
        String strD = ajuiVar.d();
        if (strD == null) {
            strD = "/";
        }
        if (strD.length() > 1 && strD.endsWith("/")) {
            strD = strD.substring(0, strD.length() - 1);
        }
        String str = ajulVar.c;
        return str.startsWith(strD) && (strD.equals("/") || str.length() == strD.length() || str.charAt(strD.length()) == '/');
    }

    @Override // defpackage.ajuj
    public void c(ajui ajuiVar, ajul ajulVar) throws ajut {
    }
}
