package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vrw extends defpackage.wag {
    public vrw(ajht ajhtVar) {
        super(ajhtVar);
    }

    @Override // defpackage.wag
    protected final void a(defpackage.rkq rkqVar) {
        double d;
        ajht ajhtVar = this.b;
        if ((ajhtVar.b & 256) != 0) {
            ajfl ajflVar = ajhtVar.k;
            if (ajflVar == null) {
                ajflVar = ajfl.a;
            }
            ajfk ajfkVar = ajflVar.c;
            if (ajfkVar == null) {
                ajfkVar = ajfk.a;
            }
            ajft ajftVar = ajfkVar.j;
            if (ajftVar == null) {
                ajftVar = ajft.a;
            }
            long j = 0;
            if (ajftVar.d <= 0) {
                return;
            }
            ajfl ajflVar2 = ajhtVar.k;
            if (ajflVar2 == null) {
                ajflVar2 = ajfl.a;
            }
            ajfk ajfkVar2 = ajflVar2.c;
            if (ajfkVar2 == null) {
                ajfkVar2 = ajfk.a;
            }
            ajft ajftVar2 = ajfkVar2.j;
            if (ajftVar2 == null) {
                ajftVar2 = ajft.a;
            }
            if ((ajftVar2.b & 33554432) != 0) {
                ajfs ajfsVar = ajftVar2.M;
                if (ajfsVar == null) {
                    ajfsVar = ajfs.a;
                }
                d = ajfsVar.d;
            } else {
                d = 0.0d;
            }
            double d2 = ajftVar2.d;
            long j2 = ajftVar2.ao + ajftVar2.ap;
            java.lang.String str = d / d2 > 0.85d ? "fg" : "bg";
            if (j2 > 0) {
                rkqVar.y("TCT", str, java.lang.Long.valueOf(j2));
            }
            rkqVar.y("RTB", str, java.lang.Long.valueOf(ajftVar2.d));
            defpackage.abpj<ajfs> abpjVar = ajftVar2.l;
            int i = 0;
            if (!abpjVar.isEmpty()) {
                long j3 = 0;
                int i2 = 0;
                for (ajfs ajfsVar2 : abpjVar) {
                    i2 += ajfsVar2.c;
                    j3 += ajfsVar2.d;
                }
                rkqVar.y("SMC", str, java.lang.Integer.valueOf(i2));
                rkqVar.y("SMD", str, java.lang.Long.valueOf(j3));
            }
            defpackage.abpj<ajfs> abpjVar2 = ajftVar2.i;
            if (!abpjVar2.isEmpty()) {
                long j4 = 0;
                int i3 = 0;
                for (ajfs ajfsVar3 : abpjVar2) {
                    i3 += ajfsVar3.c;
                    j4 += ajfsVar3.d;
                }
                rkqVar.y("PWC", str, java.lang.Integer.valueOf(i3));
                rkqVar.y("PWD", str, java.lang.Long.valueOf(j4));
            }
            defpackage.abpj<ajfs> abpjVar3 = ajftVar2.h;
            if (!abpjVar3.isEmpty()) {
                for (ajfs ajfsVar4 : abpjVar3) {
                    i += ajfsVar4.c;
                    j += ajfsVar4.d;
                }
                rkqVar.y("FWC", str, java.lang.Integer.valueOf(i));
                rkqVar.y("FWD", str, java.lang.Long.valueOf(j));
            }
            rkqVar.y("MTB", str, java.lang.Long.valueOf(ajftVar2.Z));
            rkqVar.y("MRB", str, java.lang.Long.valueOf(ajftVar2.Y));
            rkqVar.y("MTM", str, java.lang.Long.valueOf(ajftVar2.C));
            rkqVar.y("MRM", str, java.lang.Long.valueOf(ajftVar2.B));
            rkqVar.y("WTB", str, java.lang.Long.valueOf(ajftVar2.ab));
            rkqVar.y("WRB", str, java.lang.Long.valueOf(ajftVar2.aa));
            rkqVar.y("WTM", str, java.lang.Long.valueOf(ajftVar2.u));
            rkqVar.y("WRM", str, java.lang.Long.valueOf(ajftVar2.t));
        }
    }
}
