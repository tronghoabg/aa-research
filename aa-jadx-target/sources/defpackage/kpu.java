package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kpu {
    public kpu() {
        defpackage.thf thfVar = defpackage.thf.g;
        thfVar.k = new defpackage.kpu(null);
        thfVar.j = defpackage.acpv.a.fF().p();
    }

    public static final defpackage.zaa a(java.lang.String str, defpackage.tgs tgsVar, int i) {
        java.lang.String strName = tgsVar.name();
        defpackage.tgu tguVar = defpackage.tgu.GEARHEAD_COLD_HU_SERVICE_DISCOVERY_COMPLETED;
        return defpackage.zaa.valueOf(java.lang.String.format("%s_%s_%s_%s", "WIRELESS", strName, i + (-1) != 1 ? "TCP" : "RFCOMM", str));
    }

    public static final void b(defpackage.yxo yxoVar) {
        defpackage.lam.a();
        defpackage.lam.e(yxoVar, null);
    }

    public static defpackage.kxi c() {
        return (defpackage.kxi) defpackage.mkp.a.i(defpackage.kxi.class);
    }

    public kpu(byte[] bArr) {
    }
}
