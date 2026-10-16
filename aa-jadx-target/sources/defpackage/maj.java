package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class maj implements java.util.function.BiConsumer {
    private final /* synthetic */ int a;

    public /* synthetic */ maj(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.zbd zbdVar;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                int i = defpackage.mak.d;
                ((defpackage.eqs) obj2).j(0);
                break;
            case 1:
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.kzb.a.h()).p((java.lang.Throwable) obj)).ai(3615)).u("stopVoiceSession failed");
                defpackage.lam.a().d((defpackage.yxo) obj2);
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                java.lang.Long l = (java.lang.Long) obj2;
                ((defpackage.yqj) defpackage.moy.a.l().ai(5129)).M("Display state %d. Total duration: %d ms", num, l);
                int iIntValue = num.intValue();
                if (iIntValue == 1) {
                    zbdVar = defpackage.zbd.qc;
                } else if (iIntValue == 2) {
                    zbdVar = defpackage.zbd.qd;
                } else if (iIntValue == 3) {
                    zbdVar = defpackage.zbd.qe;
                } else if (iIntValue != 4) {
                    zbdVar = iIntValue != 6 ? defpackage.zbd.qh : defpackage.zbd.qg;
                } else {
                    zbdVar = defpackage.zbd.qf;
                }
                defpackage.oim oimVarU = defpackage.omf.u();
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.NO_FACET, zbdVar);
                rrvVarH.u(l.longValue());
                oimVarU.F(rrvVarH.l());
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) obj;
                ((defpackage.yqj) ozu.a.l().ai((char) 6235)).y("Broadcast expired, unable to fetch Uuids for: %s", bluetoothDevice);
                java.lang.Object obj3 = ((tsb) obj2).b;
                int i2 = defpackage.ygw.d;
                ((defpackage.doe) obj3).b(new ozt(bluetoothDevice, defpackage.ymx.a));
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((aeuq) obj).add(obj2);
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((aevg) obj).add(obj2);
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((aevl) obj).add(obj2);
                break;
            default:
                ((aeyh) obj).add(obj2);
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
        }
        return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
    }
}
