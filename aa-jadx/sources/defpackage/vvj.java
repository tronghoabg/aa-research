package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vvj {
    public final defpackage.afak a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public vvj(android.content.Context context, defpackage.afak afakVar, defpackage.aclm aclmVar, defpackage.aclm aclmVar2) {
        this.b = aclmVar;
        this.d = context;
        this.a = afakVar;
        this.c = aclmVar2;
    }

    public static boolean a(defpackage.vsh vshVar, defpackage.vsh vshVar2) {
        java.lang.Long l;
        java.lang.Long l2;
        java.lang.Long l3;
        java.lang.Long l4;
        if (!j$.util.Objects.equals(vshVar.d, vshVar2.d) || !j$.util.Objects.equals(vshVar.e, vshVar2.e) || (l = vshVar.b) == null || (l2 = vshVar.c) == null || (l3 = vshVar2.b) == null || (l4 = vshVar2.c) == null) {
            return false;
        }
        long jLongValue = l3.longValue() - l.longValue();
        long jLongValue2 = l4.longValue() - l2.longValue();
        if (jLongValue2 <= 0) {
            return false;
        }
        long jAbs = java.lang.Math.abs(jLongValue - jLongValue2);
        if (jAbs >= 25) {
            return ((double) jAbs) / ((double) jLongValue2) <= 3.472222222222222E-5d;
        }
        return true;
    }

    public vvj(java.lang.String str, defpackage.wep wepVar, defpackage.tmy tmyVar, defpackage.afak afakVar) {
        this.b = str;
        this.c = wepVar;
        this.d = tmyVar;
        this.a = afakVar;
    }
}
