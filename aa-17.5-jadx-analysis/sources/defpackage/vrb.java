package defpackage;

/* loaded from: classes.dex */
public final class vrb extends vzk {
    public vrb(ajgu ajguVar) {
        super(ajguVar);
    }

    @Override // defpackage.vzk
    protected final void a(rju rjuVar) {
        double d;
        ajgu ajguVar = this.b;
        if ((ajguVar.b & 256) != 0) {
            ajem ajemVar = ajguVar.k;
            if (ajemVar == null) {
                ajemVar = ajem.a;
            }
            ajel ajelVar = ajemVar.c;
            if (ajelVar == null) {
                ajelVar = ajel.a;
            }
            ajeu ajeuVar = ajelVar.j;
            if (ajeuVar == null) {
                ajeuVar = ajeu.a;
            }
            long j = 0;
            if (ajeuVar.d <= 0) {
                return;
            }
            ajem ajemVar2 = ajguVar.k;
            if (ajemVar2 == null) {
                ajemVar2 = ajem.a;
            }
            ajel ajelVar2 = ajemVar2.c;
            if (ajelVar2 == null) {
                ajelVar2 = ajel.a;
            }
            ajeu ajeuVar2 = ajelVar2.j;
            if (ajeuVar2 == null) {
                ajeuVar2 = ajeu.a;
            }
            if ((ajeuVar2.b & 33554432) != 0) {
                ajet ajetVar = ajeuVar2.M;
                if (ajetVar == null) {
                    ajetVar = ajet.a;
                }
                d = ajetVar.d;
            } else {
                d = 0.0d;
            }
            double d2 = ajeuVar2.d;
            long j2 = ajeuVar2.ao + ajeuVar2.ap;
            String str = d / d2 > 0.85d ? "fg" : "bg";
            if (j2 > 0) {
                rjuVar.y("TCT", str, Long.valueOf(j2));
            }
            rjuVar.y("RTB", str, Long.valueOf(ajeuVar2.d));
            aboh<ajet> abohVar = ajeuVar2.l;
            int i = 0;
            if (!abohVar.isEmpty()) {
                long j3 = 0;
                int i2 = 0;
                for (ajet ajetVar2 : abohVar) {
                    i2 += ajetVar2.c;
                    j3 += ajetVar2.d;
                }
                rjuVar.y("SMC", str, Integer.valueOf(i2));
                rjuVar.y("SMD", str, Long.valueOf(j3));
            }
            aboh<ajet> abohVar2 = ajeuVar2.i;
            if (!abohVar2.isEmpty()) {
                long j4 = 0;
                int i3 = 0;
                for (ajet ajetVar3 : abohVar2) {
                    i3 += ajetVar3.c;
                    j4 += ajetVar3.d;
                }
                rjuVar.y("PWC", str, Integer.valueOf(i3));
                rjuVar.y("PWD", str, Long.valueOf(j4));
            }
            aboh<ajet> abohVar3 = ajeuVar2.h;
            if (!abohVar3.isEmpty()) {
                for (ajet ajetVar4 : abohVar3) {
                    i += ajetVar4.c;
                    j += ajetVar4.d;
                }
                rjuVar.y("FWC", str, Integer.valueOf(i));
                rjuVar.y("FWD", str, Long.valueOf(j));
            }
            rjuVar.y("MTB", str, Long.valueOf(ajeuVar2.Z));
            rjuVar.y("MRB", str, Long.valueOf(ajeuVar2.Y));
            rjuVar.y("MTM", str, Long.valueOf(ajeuVar2.C));
            rjuVar.y("MRM", str, Long.valueOf(ajeuVar2.B));
            rjuVar.y("WTB", str, Long.valueOf(ajeuVar2.ab));
            rjuVar.y("WRB", str, Long.valueOf(ajeuVar2.aa));
            rjuVar.y("WTM", str, Long.valueOf(ajeuVar2.u));
            rjuVar.y("WRM", str, Long.valueOf(ajeuVar2.t));
        }
    }
}
