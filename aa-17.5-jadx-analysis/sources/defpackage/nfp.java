package defpackage;

import j$.util.Collection;

/* loaded from: classes.dex */
public enum nfp {
    DAY("day", yzy.da),
    NIGHT("night", yzy.db),
    CAR_CONTROLLED("car", yzy.cZ);

    public static final yfq d;
    public static final yfq e;
    public static final yfq f;
    public static final yfq g;
    public static final nfp h;
    public final String i;
    public final yzy j;

    static {
        nfp nfpVar = DAY;
        nfp nfpVar2 = NIGHT;
        nfp nfpVar3 = CAR_CONTROLLED;
        yfq yfqVarP = yfq.p(values());
        d = yfqVarP;
        yfq yfqVarS = yfq.s(nfpVar3, nfpVar, nfpVar2);
        e = yfqVarS;
        f = (yfq) Collection.EL.stream(yfqVarP).map(new nsb(1)).collect(ycm.a);
        g = (yfq) Collection.EL.stream(yfqVarS).map(new nsb(1)).collect(ycm.a);
        h = nfpVar3;
    }

    nfp(String str, yzy yzyVar) {
        this.i = str;
        this.j = yzyVar;
    }

    public static nfp a(String str) {
        if (str == null) {
            return h;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 98260) {
            if (iHashCode != 99228) {
                if (iHashCode == 104817688 && str.equals("night")) {
                    return NIGHT;
                }
            } else if (str.equals("day")) {
                return DAY;
            }
        } else if (str.equals("car")) {
            return CAR_CONTROLLED;
        }
        return h;
    }
}
