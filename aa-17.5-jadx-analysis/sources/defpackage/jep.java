package defpackage;

import j$.util.Collection;

/* loaded from: classes.dex */
public final class jep {
    static final yfs a;
    public static final yfy b;
    private static final yfy c;

    static {
        yfr yfrVar = new yfr();
        yfrVar.b(10, xny.SENSOR_LOCATION);
        yfrVar.b(1, xny.SENSOR_COMPASS);
        yfrVar.b(2, xny.SENSOR_SPEED);
        yfrVar.b(3, xny.SENSOR_RPM);
        yfrVar.b(4, xny.SENSOR_ODOMETER);
        yfrVar.b(5, xny.SENSOR_FUEL);
        yfrVar.b(6, xny.SENSOR_PARKING_BRAKE);
        yfrVar.b(7, xny.SENSOR_GEAR);
        yfrVar.b(8, xny.SENSOR_OBDII_DIAGNOSTIC_CODE);
        yfrVar.b(9, xny.SENSOR_NIGHT_MODE);
        yfrVar.b(12, xny.SENSOR_ENVIRONMENT_DATA);
        yfrVar.b(13, xny.SENSOR_HVAC_DATA);
        yfrVar.b(11, xny.SENSOR_DRIVING_STATUS_DATA);
        yfrVar.b(14, xny.SENSOR_ACCELEROMETER_DATA);
        yfrVar.b(15, xny.SENSOR_DEAD_RECKONING_DATA);
        yfrVar.b(16, xny.SENSOR_DOOR_DATA);
        yfrVar.b(17, xny.SENSOR_GPS_SATELLITE_DATA);
        yfrVar.b(18, xny.SENSOR_GYROSCOPE_DATA);
        yfrVar.b(19, xny.SENSOR_LIGHT_DATA);
        yfrVar.b(20, xny.SENSOR_PASSENGER_DATA);
        yfrVar.b(21, xny.SENSOR_TIRE_PRESSURE_DATA);
        yfrVar.b(22, xny.SENSOR_TOLL_CARD);
        yfrVar.b(23, xny.SENSOR_VEHICLE_ENERGY_MODEL_DATA);
        yfrVar.b(24, xny.SENSOR_TRAILER_DATA);
        yfrVar.b(23, xny.SENSOR_RAW_VEHICLE_ENERGY_MODEL);
        yfrVar.b(25, xny.SENSOR_RAW_EV_TRIP_SETTINGS);
        yfs yfsVarA = yfrVar.a();
        a = yfsVarA;
        yfu yfuVar = new yfu(4);
        yfuVar.e(10, yzy.JJ);
        yfuVar.e(1, yzy.JK);
        yfuVar.e(2, yzy.JL);
        yfuVar.e(3, yzy.JM);
        yfuVar.e(4, yzy.JN);
        yfuVar.e(5, yzy.JO);
        yfuVar.e(6, yzy.JP);
        yfuVar.e(7, yzy.JQ);
        yfuVar.e(8, yzy.JR);
        yfuVar.e(9, yzy.JS);
        yfuVar.e(12, yzy.JT);
        yfuVar.e(13, yzy.JU);
        yfuVar.e(11, yzy.JV);
        yfuVar.e(14, yzy.JW);
        yfuVar.e(15, yzy.JX);
        yfuVar.e(16, yzy.JY);
        yfuVar.e(17, yzy.JZ);
        yfuVar.e(18, yzy.Ka);
        yfuVar.e(19, yzy.Kb);
        yfuVar.e(20, yzy.Kc);
        yfuVar.e(21, yzy.Kd);
        yfuVar.e(22, yzy.Ke);
        yfuVar.e(23, yzy.Kf);
        yfuVar.e(25, yzy.Kj);
        yfuVar.e(24, yzy.Kg);
        b = yfuVar.d(true);
        c = (yfy) Collection.EL.stream(yfsVarA.u()).collect(ycm.a(new ilq(12), new ilq(13)));
    }

    public static int a(int i) {
        return ((Integer) c.getOrDefault(Integer.valueOf(i), 0)).intValue();
    }

    public static yfq b(int i) {
        yfq yfqVarC = a.c(Integer.valueOf(i));
        woy.Q(!yfqVarC.isEmpty(), "Invalid protoSensorType %s", i);
        return yfqVarC;
    }
}
