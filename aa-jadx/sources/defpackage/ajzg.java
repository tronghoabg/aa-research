package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ajzg implements defpackage.ajvh {
    @Override // defpackage.ajvh
    public final java.lang.String a() {
        return "path";
    }

    @Override // defpackage.ajvj
    public final void b(defpackage.ajvu ajvuVar, java.lang.String str) throws defpackage.ajvt {
        if (true == defpackage.agwh.a(str)) {
            str = "/";
        }
        ajvuVar.l(str);
    }

    @Override // defpackage.ajvj
    public final boolean d(defpackage.ajvi ajviVar, defpackage.ajvl ajvlVar) {
        defpackage.aguw.e(ajviVar, "Cookie");
        java.lang.String strD = ajviVar.d();
        if (strD == null) {
            strD = "/";
        }
        if (strD.length() > 1 && strD.endsWith("/")) {
            strD = strD.substring(0, strD.length() - 1);
        }
        java.lang.String str = ajvlVar.c;
        return str.startsWith(strD) && (strD.equals("/") || str.length() == strD.length() || str.charAt(strD.length()) == '/');
    }

    @Override // defpackage.ajvj
    public void c(defpackage.ajvi ajviVar, defpackage.ajvl ajvlVar) throws defpackage.ajvt {
    }
}
