package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kpo implements defpackage.xyd {
    private final /* synthetic */ int a;

    public /* synthetic */ kpo(int i) {
        this.a = i;
    }

    @Override // defpackage.xyd
    public final java.lang.Object a(java.lang.Object obj) {
        java.lang.String strD;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) obj;
                defpackage.yqm yqmVar = defpackage.kpt.a;
                if (bluetoothDevice == null) {
                    return java.lang.Boolean.FALSE;
                }
                ((defpackage.yqj) defpackage.kpt.a.l().ai((char) 3356)).y("Android Auto bluetooth connected: %s", bluetoothDevice.getAddress());
                return java.lang.Boolean.TRUE;
            case 1:
                return j$.util.OptionalInt.of(((java.lang.Integer) obj).intValue());
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return null;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return null;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return null;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.xoz xozVarB = defpackage.xoz.b(((defpackage.xox) obj).b);
                return xozVarB == null ? defpackage.xoz.SENSOR_LOCATION : xozVarB;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.xyn.g(((android.app.ActivityManager.RunningAppProcessInfo) obj).importanceReasonComponent);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.ygw.o((java.util.List) obj);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p((java.lang.RuntimeException) obj)).ai(9862)).u("Metric extension provider failed.");
                return null;
            case 9:
                return java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) obj));
            case 10:
                return java.lang.Boolean.FALSE;
            case 11:
                defpackage.wdm wdmVar = defpackage.wdn.a;
                return "";
            case 12:
                return new com.google.android.apps.auto.components.softminversion.SoftMinversionManager((android.content.Context) obj);
            case 13:
                return new com.google.android.apps.auto.components.headunit.HeadUnitUpdateManager((android.content.Context) obj);
            case 14:
                defpackage.wdf wdfVar = defpackage.acmi.a;
                return "com.google.android.projection.gearhead";
            default:
                android.content.Context context = (android.content.Context) obj;
                java.lang.String str = defpackage.addj.a;
                if (str != null) {
                    return str;
                }
                synchronized (defpackage.addj.class) {
                    strD = defpackage.addj.a;
                    if (strD == null) {
                        strD = defpackage.way.d(context, "com.google.android.gms.clearcut_client");
                        defpackage.addj.a = strD;
                    }
                    break;
                }
                return strD;
        }
    }
}
