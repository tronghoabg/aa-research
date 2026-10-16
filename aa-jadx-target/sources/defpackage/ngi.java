package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum ngi {
    DAY("day", defpackage.zbd.da),
    NIGHT("night", defpackage.zbd.db),
    CAR_CONTROLLED("car", defpackage.zbd.cZ);

    public static final defpackage.ygw d;
    public static final defpackage.ygw e;
    public static final defpackage.ygw f;
    public static final defpackage.ygw g;
    public static final defpackage.ngi h;
    public final java.lang.String i;
    public final defpackage.zbd j;

    static {
        defpackage.ngi ngiVar = DAY;
        defpackage.ngi ngiVar2 = NIGHT;
        defpackage.ngi ngiVar3 = CAR_CONTROLLED;
        defpackage.ygw ygwVarP = defpackage.ygw.p(values());
        d = ygwVarP;
        defpackage.ygw ygwVarS = defpackage.ygw.s(ngiVar3, ngiVar, ngiVar2);
        e = ygwVarS;
        f = (defpackage.ygw) j$.util.Collection.-EL.stream(ygwVarP).map(new defpackage.ngh(0)).collect(defpackage.yds.a);
        g = (defpackage.ygw) j$.util.Collection.-EL.stream(ygwVarS).map(new defpackage.ngh(0)).collect(defpackage.yds.a);
        h = ngiVar3;
    }

    ngi(java.lang.String str, defpackage.zbd zbdVar) {
        this.i = str;
        this.j = zbdVar;
    }

    public static defpackage.ngi a(java.lang.String str) {
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
