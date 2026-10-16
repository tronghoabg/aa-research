package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class qaf {
    private static final yob a = yob.c("com/google/android/apps/gmm/userevent3/eventid/EventIdUtil");

    public static zbp a(String str) {
        String[] strArrSplit;
        int length;
        if (woy.am(str) || (length = (strArrSplit = str.split(":")).length) > 2) {
            return null;
        }
        abnp abnpVarN = zbp.a.n();
        String str2 = strArrSplit[0];
        if (!woy.am(str2)) {
            zbq zbqVarB = b(str2);
            if (zbqVarB == null) {
                return null;
            }
            abnpVarN.t();
            zbp zbpVar = (zbp) abnpVarN.b;
            zbpVar.c = zbqVarB;
            zbpVar.b |= 1;
        }
        if (length == 2 && !strArrSplit[1].isEmpty()) {
            try {
                long j = Integer.parseInt(strArrSplit[1]);
                abnpVarN.t();
                zbp zbpVar2 = (zbp) abnpVarN.b;
                zbpVar2.b |= 2;
                zbpVar2.d = j;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return (zbp) abnpVarN.q();
    }

    public static zbq b(String str) {
        if (woy.am(str)) {
            return null;
        }
        abnp abnpVarN = zbq.a.n();
        try {
            abmw abmwVarJ = abmw.J(ytq.e.j(str));
            long j = ((abmt) abmwVarJ).j();
            long jL = ((abmt) abmwVarJ).l();
            int iL = ((abmt) abmwVarJ).l();
            int iL2 = ((abmt) abmwVarJ).l();
            abnpVarN.t();
            zbq zbqVar = (zbq) abnpVarN.b;
            zbqVar.b |= 1;
            zbqVar.c = ((j & 4294967295L) * 1000000) + jL;
            abnpVarN.t();
            zbq zbqVar2 = (zbq) abnpVarN.b;
            zbqVar2.b |= 2;
            zbqVar2.d = ((((iL >> 24) + 10) & 255) << 24) | (iL & 16777215);
            abnpVarN.t();
            zbq zbqVar3 = (zbq) abnpVarN.b;
            zbqVar3.b |= 4;
            zbqVar3.e = iL2;
            return (zbq) abnpVarN.q();
        } catch (IOException | IllegalArgumentException unused) {
            return null;
        }
    }

    public static String c(String str, int i) {
        return str + ":" + String.valueOf(i);
    }

    public static String d(zbq zbqVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        abnc abncVar = new abnc(byteArrayOutputStream, 4096);
        try {
            long j = zbqVar.c;
            abncVar.j((int) (j / 1000000));
            abncVar.n((int) (j % 1000000));
            abncVar.v(zbqVar.d - 167772160);
            abncVar.v(zbqVar.e);
            abncVar.c();
        } catch (IOException e) {
            ((ynz) ((ynz) a.a(uys.a).p(e)).ai((char) 6973)).u("EventIdMessage couldn't be encoded");
        }
        return ytq.e.f().i(byteArrayOutputStream.toByteArray());
    }
}
