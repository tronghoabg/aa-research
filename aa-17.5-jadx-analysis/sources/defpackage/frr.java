package defpackage;

import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class frr implements frm {
    private static final ajhg a;
    private static final ajhg b;
    private final String c;
    private final ftc d;
    private final aezr e;
    private final aezr f;

    static {
        ajhf ajhfVar = new ajhf();
        ajhfVar.a();
        ajhfVar.b = true;
        a = ahdw.i(ajhfVar);
        ajhf ajhfVar2 = new ajhf();
        ajhfVar2.a();
        ajhfVar2.b();
        b = ahdw.i(ajhfVar2);
    }

    public frr(String str, ftc ftcVar, aezr aezrVar, aezr aezrVar2) {
        this.c = str;
        this.d = ftcVar;
        this.e = aezrVar;
        this.f = aezrVar2;
    }

    public static final String c(String str, ajhz ajhzVar) {
        String str2 = ajhzVar != null ? ajhzVar.c : null;
        if (str2 == null || afyh.g(str2, "text/plain", false)) {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            singleton.getClass();
            String strC = ftw.c(singleton, str);
            if (strC != null) {
                return strC;
            }
        }
        if (str2 != null) {
            return afyh.q(str2, ';', str2);
        }
        return null;
    }

    private final fqv d(ajih ajihVar) {
        return a.bj(ajihVar.c(), this.d.a);
    }

    private final ajid e() {
        ajic ajicVar = new ajic();
        String strConcat = this.c;
        if (afyh.g(strConcat, "ws:", true)) {
            String strSubstring = strConcat.substring(3);
            strSubstring.getClass();
            strConcat = "http:".concat(strSubstring);
        } else if (afyh.g(strConcat, "wss:", true)) {
            String strSubstring2 = strConcat.substring(4);
            strSubstring2.getClass();
            strConcat = "https:".concat(strSubstring2);
        }
        ajhw ajhwVar = new ajhw();
        ajhwVar.c(null, strConcat);
        ajicVar.a = ajhwVar.a();
        ftc ftcVar = this.d;
        ajicVar.d = ahdw.j(ftcVar.i);
        for (Map.Entry entry : ftcVar.j.b.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            afhe afheVarL = affa.l((Class) key);
            afheVarL.getClass();
            ajicVar.c = ajicVar.c.a(afheVarL, value);
        }
        fsr fsrVar = ftcVar.m;
        fsr fsrVar2 = ftcVar.n;
        boolean z = fsrVar.e;
        boolean z2 = fsrVar2.e;
        if (!z2 && z) {
            ajicVar.a(ajhg.b);
        } else if (!z2 || z) {
            if (!z2) {
                ajicVar.a(b);
            }
        } else if (fsrVar.f) {
            ajicVar.a(ajhg.a);
        } else {
            ajicVar.a(a);
        }
        return new ajid(ajicVar);
    }

    private final ajnf f() {
        Object objA = this.f.a();
        objA.getClass();
        return (ajnf) ((lvz) objA).b;
    }

    private final fqv g(frh frhVar) {
        return a.bk(frhVar.a.a(1), f(), this.c, frhVar);
    }

    private final fsk h(frh frhVar) throws Throwable {
        Throwable th;
        fsk fskVar;
        try {
            ajna ajnaVarB = ahfm.b(f().f(frhVar.a()));
            try {
                fskVar = new fsk(ajnaVarB);
                try {
                    ajnaVarB.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    ajnaVarB.close();
                } catch (Throwable th4) {
                    adqs.y(th3, th4);
                }
                th = th3;
                fskVar = null;
            }
            if (th == null) {
                return fskVar;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    private static final int i(ajif ajifVar) {
        return ajifVar.i != null ? 4 : 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03ad A[Catch: Exception -> 0x0424, TRY_ENTER, TryCatch #18 {Exception -> 0x0424, blocks: (B:208:0x03ad, B:210:0x03bb, B:212:0x03c1, B:214:0x03ca, B:216:0x03d2, B:225:0x040c), top: B:271:0x03ab }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03ca A[Catch: Exception -> 0x0424, TryCatch #18 {Exception -> 0x0424, blocks: (B:208:0x03ad, B:210:0x03bb, B:212:0x03c1, B:214:0x03ca, B:216:0x03d2, B:225:0x040c), top: B:271:0x03ab }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x024b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082 A[Catch: Exception -> 0x0050, TRY_ENTER, TryCatch #0 {Exception -> 0x0050, blocks: (B:20:0x0049, B:82:0x01c5, B:33:0x0082, B:40:0x00ac, B:42:0x00b6, B:44:0x00d3, B:46:0x00df, B:69:0x0149, B:47:0x00ea, B:49:0x00f2, B:50:0x00f9, B:52:0x0101, B:53:0x010c, B:55:0x0114, B:56:0x0119, B:58:0x0121, B:60:0x012d, B:67:0x0145, B:72:0x0171, B:74:0x0179, B:76:0x017d, B:79:0x01ae, B:36:0x0094, B:38:0x009c, B:78:0x0193), top: B:239:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:20:0x0049, B:82:0x01c5, B:33:0x0082, B:40:0x00ac, B:42:0x00b6, B:44:0x00d3, B:46:0x00df, B:69:0x0149, B:47:0x00ea, B:49:0x00f2, B:50:0x00f9, B:52:0x0101, B:53:0x010c, B:55:0x0114, B:56:0x0119, B:58:0x0121, B:60:0x012d, B:67:0x0145, B:72:0x0171, B:74:0x0179, B:76:0x017d, B:79:0x01ae, B:36:0x0094, B:38:0x009c, B:78:0x0193), top: B:239:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c3  */
    @Override // defpackage.frm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.afck r28) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frr.a(afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ajid r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frr.b(ajid, afck):java.lang.Object");
    }
}
