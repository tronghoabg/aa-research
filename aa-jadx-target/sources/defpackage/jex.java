package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jex {
    static final defpackage.ygy a;
    public static final defpackage.yhe b;
    private static final defpackage.yhe c;

    static {
        defpackage.ygx ygxVar = new defpackage.ygx();
        ygxVar.b(10, defpackage.xoz.SENSOR_LOCATION);
        ygxVar.b(1, defpackage.xoz.SENSOR_COMPASS);
        ygxVar.b(2, defpackage.xoz.SENSOR_SPEED);
        ygxVar.b(3, defpackage.xoz.SENSOR_RPM);
        ygxVar.b(4, defpackage.xoz.SENSOR_ODOMETER);
        ygxVar.b(5, defpackage.xoz.SENSOR_FUEL);
        ygxVar.b(6, defpackage.xoz.SENSOR_PARKING_BRAKE);
        ygxVar.b(7, defpackage.xoz.SENSOR_GEAR);
        ygxVar.b(8, defpackage.xoz.SENSOR_OBDII_DIAGNOSTIC_CODE);
        ygxVar.b(9, defpackage.xoz.SENSOR_NIGHT_MODE);
        ygxVar.b(12, defpackage.xoz.SENSOR_ENVIRONMENT_DATA);
        ygxVar.b(13, defpackage.xoz.SENSOR_HVAC_DATA);
        ygxVar.b(11, defpackage.xoz.SENSOR_DRIVING_STATUS_DATA);
        ygxVar.b(14, defpackage.xoz.SENSOR_ACCELEROMETER_DATA);
        ygxVar.b(15, defpackage.xoz.SENSOR_DEAD_RECKONING_DATA);
        ygxVar.b(16, defpackage.xoz.SENSOR_DOOR_DATA);
        ygxVar.b(17, defpackage.xoz.SENSOR_GPS_SATELLITE_DATA);
        ygxVar.b(18, defpackage.xoz.SENSOR_GYROSCOPE_DATA);
        ygxVar.b(19, defpackage.xoz.SENSOR_LIGHT_DATA);
        ygxVar.b(20, defpackage.xoz.SENSOR_PASSENGER_DATA);
        ygxVar.b(21, defpackage.xoz.SENSOR_TIRE_PRESSURE_DATA);
        ygxVar.b(22, defpackage.xoz.SENSOR_TOLL_CARD);
        ygxVar.b(23, defpackage.xoz.SENSOR_VEHICLE_ENERGY_MODEL_DATA);
        ygxVar.b(24, defpackage.xoz.SENSOR_TRAILER_DATA);
        ygxVar.b(23, defpackage.xoz.SENSOR_RAW_VEHICLE_ENERGY_MODEL);
        ygxVar.b(25, defpackage.xoz.SENSOR_RAW_EV_TRIP_SETTINGS);
        defpackage.ygy ygyVarA = ygxVar.a();
        a = ygyVarA;
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f(10, defpackage.zbd.JN);
        yhaVar.f(1, defpackage.zbd.JO);
        yhaVar.f(2, defpackage.zbd.JP);
        yhaVar.f(3, defpackage.zbd.JQ);
        yhaVar.f(4, defpackage.zbd.JR);
        yhaVar.f(5, defpackage.zbd.JS);
        yhaVar.f(6, defpackage.zbd.JT);
        yhaVar.f(7, defpackage.zbd.JU);
        yhaVar.f(8, defpackage.zbd.JV);
        yhaVar.f(9, defpackage.zbd.JW);
        yhaVar.f(12, defpackage.zbd.JX);
        yhaVar.f(13, defpackage.zbd.JY);
        yhaVar.f(11, defpackage.zbd.JZ);
        yhaVar.f(14, defpackage.zbd.Ka);
        yhaVar.f(15, defpackage.zbd.Kb);
        yhaVar.f(16, defpackage.zbd.Kc);
        yhaVar.f(17, defpackage.zbd.Kd);
        yhaVar.f(18, defpackage.zbd.Ke);
        yhaVar.f(19, defpackage.zbd.Kf);
        yhaVar.f(20, defpackage.zbd.Kg);
        yhaVar.f(21, defpackage.zbd.Kh);
        yhaVar.f(22, defpackage.zbd.Ki);
        yhaVar.f(23, defpackage.zbd.Kj);
        yhaVar.f(25, defpackage.zbd.Kn);
        yhaVar.f(24, defpackage.zbd.Kk);
        b = yhaVar.d(true);
        c = (defpackage.yhe) j$.util.Collection.-EL.stream(ygyVarA.u()).collect(defpackage.yds.a(new defpackage.ilz(11), new defpackage.ilz(12)));
    }

    public static int a(int i) {
        return ((java.lang.Integer) c.getOrDefault(java.lang.Integer.valueOf(i), 0)).intValue();
    }

    public static defpackage.ygw b(int i) {
        defpackage.ygw ygwVarA = a.c(java.lang.Integer.valueOf(i));
        defpackage.ysr.ba(!ygwVarA.isEmpty(), "Invalid protoSensorType %s", i);
        return ygwVarA;
    }
}
