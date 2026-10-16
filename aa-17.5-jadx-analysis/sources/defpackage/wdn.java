package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class wdn {
    public final wae a;
    public final xyc b;
    public final String c;
    public final boolean d;
    private final String e;

    public wdn(final wae waeVar, final String str, final String str2, final boolean z) {
        this.a = waeVar;
        this.c = str;
        this.e = str2;
        this.d = z;
        this.b = wub.L(new xyc() { // from class: wdj
            @Override // defpackage.xyc
            public final Object gu() {
                boolean z2 = z;
                wae waeVar2 = waeVar;
                Context contextA = z2 ? tmz.a(waeVar2.c) : waeVar2.c;
                String str3 = str2;
                return String.valueOf(wac.b(contextA)) + File.separator + "phenotype" + File.separator + "shared" + File.separator + (str3.isEmpty() ? "" : String.valueOf(str3).concat(String.valueOf(File.separator))) + str + ".pb";
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, xyc] */
    public final wdm a() throws IOException {
        String strSubstring;
        int i;
        wdk wdkVar;
        wdk wdkVar2;
        String str;
        wbh wbhVarB;
        boolean z = this.d;
        if (!z && !tmz.e(this.a.c)) {
            return new wdm(wdo.a, new wdl(3, 17, false));
        }
        if (wac.c()) {
            return new wdm(wdo.a, new wdl(3, 18, false));
        }
        wae waeVar = this.a;
        wdh wdhVarC = waeVar.f.c(z);
        String str2 = this.c;
        zhp zhpVar = zhp.FILE;
        int iIndexOf = str2.indexOf("#");
        if (iIndexOf >= 0) {
            strSubstring = str2.substring(0, iIndexOf);
        } else {
            if (str2.contains("@")) {
                throw new IllegalArgumentException("Invalid package name: ".concat(String.valueOf(str2)));
            }
            strSubstring = str2;
        }
        strSubstring.getClass();
        if (!wdhVarC.h) {
            i = 14;
        } else if (!wdhVarC.a || !wdhVarC.b.contains(zhpVar)) {
            i = 3;
        } else if (wdhVarC.c.B()) {
            i = 4;
        } else {
            List list = wdhVarC.f;
            i = (list.isEmpty() || list.contains(strSubstring)) ? wdhVarC.g.contains(strSubstring) ? 6 : 0 : 5;
        }
        if (i != 0) {
            wdkVar2 = new wdk(null, new wdl(i, true));
        } else {
            try {
                str = wdhVarC.e;
            } catch (Exception e) {
                woy.aG(Level.WARNING, this.a.b(), e, "Failed to read shared file for %s", this.c);
                wdkVar = new wdk(wbh.a, new wdl(3, 10, false));
            }
            if (str.isEmpty()) {
                xxh xxhVar = (xxh) waeVar.g.gu();
                if (!xxhVar.f()) {
                    woy.aG(Level.WARNING, waeVar.b(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                    wdkVar = new wdk(wbh.a, new wdl(3, 7, false));
                    wdkVar2 = wdkVar;
                } else if (z) {
                    int i2 = tmz.a;
                    str = ((ApplicationInfo) xxhVar.b()).deviceProtectedDataDir;
                } else {
                    str = ((ApplicationInfo) xxhVar.b()).dataDir;
                }
            }
            nfh nfhVar = new nfh(wdhVarC.c, str2, this.e);
            File file = new File(str + File.separator + wdhVarC.d + File.separator + new File(((String) nfhVar.a.gu()) + "/" + ((String) nfhVar.c.gu()) + ".pb").toString());
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    if (!wdhVarC.k.b || file.length() <= 12288) {
                        int i3 = abmw.l;
                        wbhVarB = wbh.b(new abmv(fileInputStream), false);
                    } else {
                        int i4 = abmw.l;
                        wbhVarB = wbh.b(new abmv(fileInputStream), true);
                    }
                    wdk wdkVar3 = new wdk(wbhVarB, new wdl(5, 2, false));
                    fileInputStream.close();
                    wdkVar2 = wdkVar3;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (abon e2) {
                woy.aG(Level.SEVERE, this.a.b(), e2, "Failed to parse snapshot from shared storage for %s", this.c);
                wdkVar2 = new wdk(null, new wdl(9, false));
            } catch (FileNotFoundException unused) {
                woy.aG(Level.INFO, this.a.b(), null, "Shared storage file not found for %s", this.c);
                wdkVar2 = new wdk(null, new wdl(8, false));
            }
        }
        if (wdkVar2.a != null) {
            wbh wbhVar = wdkVar2.a;
            wbhVar.getClass();
            return new wdm(wbhVar, wdkVar2.b);
        }
        wdl wdlVar = wdkVar2.b;
        try {
            FileInputStream fileInputStream2 = new FileInputStream((String) this.b.gu());
            try {
                abnj abnjVar = abnj.a;
                wdo wdoVar = wdo.a;
                int i5 = abmw.l;
                abnv abnvVarC = abnv.C(wdoVar, new abmv(fileInputStream2), abnjVar);
                abnv.U(abnvVarC);
                wdm wdmVar = new wdm((wdo) abnvVarC, new wdl(4, wdlVar.c, wdlVar.a));
                fileInputStream2.close();
                return wdmVar;
            } catch (Throwable th3) {
                try {
                    fileInputStream2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException | RuntimeException unused2) {
            woy.aG(Level.INFO, this.a.b(), null, "Unable to retrieve flag snapshot for %s, using defaults.", this.c);
            return wdlVar.a ? new wdm(wdo.a, new wdl(3, 11, true)) : new wdm(wbh.a, new wdl(3, 16, false));
        }
    }

    public final zgp b(String str) {
        wae waeVar = this.a;
        six sixVarE = waeVar.e();
        String str2 = this.c;
        str2.getClass();
        str.getClass();
        return zfb.f(six.f(((suq) sixVarE.a).g(str2, str).a(zfq.a, new waz())), new wdi(), waeVar.b());
    }

    @ResultIgnorabilityUnspecified
    public final zgp c(wdo wdoVar) {
        return wub.ac(new pfl(this, wdoVar, 9), this.a.b());
    }

    public final boolean d() {
        wdq wdqVar = this.a.f;
        boolean z = this.d;
        zhp zhpVar = zhp.FILE;
        if (z) {
            wbl wblVarB = wdqVar.b();
            return wblVarB.e && new abof(wblVarB.i, wbl.a).contains(zhpVar);
        }
        wbj wbjVarA = wdqVar.a();
        return wbjVarA.e && new abof(wbjVarA.j, wbj.a).contains(zhpVar);
    }
}
