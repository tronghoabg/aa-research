package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iwa {
    private static defpackage.iwa c;
    public java.lang.Object a;
    public java.lang.Object b;

    public iwa(byte[] bArr) {
        this.b = new defpackage.dkd(defpackage.dfc.a, defpackage.dgc.a, (defpackage.dgc) null);
        defpackage.dkd dkdVar = (defpackage.dkd) this.b;
        this.a = new defpackage.djh(dkdVar.a, dkdVar.b);
    }

    public static defpackage.iwa a() {
        defpackage.iwa iwaVar = c;
        if (iwaVar != null) {
            return iwaVar;
        }
        defpackage.iwa iwaVar2 = new defpackage.iwa();
        c = iwaVar2;
        return iwaVar2;
    }

    public final defpackage.dkd b(java.util.List list) {
        long jG;
        defpackage.djg djgVar = null;
        try {
            int size = list.size();
            int i = 0;
            defpackage.djg djgVar2 = null;
            while (i < size) {
                try {
                    defpackage.djg djgVar3 = (defpackage.djg) list.get(i);
                    try {
                        djgVar3.a((defpackage.djh) this.a);
                        i++;
                        djgVar2 = djgVar3;
                    } catch (java.lang.Exception e) {
                        e = e;
                        djgVar = djgVar3;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("Error while applying EditCommand batch to buffer (length=" + ((defpackage.djh) this.a).c() + ", composition=" + ((defpackage.djh) this.a).e() + ", selection=" + defpackage.dgc.f(((defpackage.djh) this.a).d()) + "):");
                        sb.append('\n');
                        defpackage.afga.bn(list, sb, "\n", "", "", -1, "...", new defpackage.dbj(djgVar, 8));
                        throw new java.lang.RuntimeException(sb.toString(), e);
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                    djgVar = djgVar2;
                }
            }
            defpackage.dfb dfbVar = new defpackage.dfb(((defpackage.djh) this.a).toString());
            long jD = ((defpackage.djh) this.a).d();
            defpackage.dgc dgcVar = true != defpackage.dgc.j(((defpackage.dkd) this.b).b) ? new defpackage.dgc(jD) : null;
            if (dgcVar != null) {
                jG = dgcVar.b;
            } else {
                int i2 = (int) (jD >> 32);
                int i3 = (int) (jD & 4294967295L);
                jG = defpackage.dax.g(java.lang.Math.max(i2, i3), java.lang.Math.min(i2, i3));
            }
            defpackage.dkd dkdVar = new defpackage.dkd(dfbVar, jG, ((defpackage.djh) this.a).e());
            this.b = dkdVar;
            return dkdVar;
        } catch (java.lang.Exception e3) {
            e = e3;
        }
    }

    private iwa() {
        this.a = new java.lang.ref.WeakReference(null);
        this.b = new java.lang.ref.WeakReference(null);
    }
}
