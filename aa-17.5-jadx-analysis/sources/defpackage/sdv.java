package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class sdv extends rwr implements sdg {
    public boolean e;
    public rwp f;
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final Object b = new Object();
    private final Handler g = new sss(Looper.getMainLooper());
    public final sdg c = new sea();
    public int d = 31;

    @Override // defpackage.rws
    public final void a(int i, byte[] bArr) {
        abnv abnvVar;
        if (i == 13) {
            xny xnyVarB = xny.b(13);
            int i2 = rvb.b;
            byte[] bArr2 = null;
            if (bArr == null) {
                abnvVar = null;
            } else {
                xnyVarB.getClass();
                try {
                    switch (xnyVarB) {
                        case SENSOR_LOCATION:
                            abnvVar = (xkh) abnv.B(xkh.a, bArr, abnj.a());
                            break;
                        case SENSOR_COMPASS:
                            abnvVar = (xit) abnv.B(xit.a, bArr, abnj.a());
                            break;
                        case SENSOR_SPEED:
                            abnvVar = (xog) abnv.B(xog.a, bArr, abnj.a());
                            break;
                        case SENSOR_RPM:
                            abnvVar = (xnq) abnv.B(xnq.a, bArr, abnj.a());
                            break;
                        case SENSOR_ODOMETER:
                            abnvVar = (xlu) abnv.B(xlu.a, bArr, abnj.a());
                            break;
                        case SENSOR_FUEL:
                            abnvVar = (xjj) abnv.B(xjj.a, bArr, abnj.a());
                            break;
                        case SENSOR_PARKING_BRAKE:
                            abnvVar = (xly) abnv.B(xly.a, bArr, abnj.a());
                            break;
                        case SENSOR_GEAR:
                            abnvVar = (xjl) abnv.x(xjl.a, bArr);
                            break;
                        case SENSOR_OBDII_DIAGNOSTIC_CODE:
                            abnvVar = (xjb) abnv.B(xjb.a, bArr, abnj.a());
                            break;
                        case SENSOR_NIGHT_MODE:
                            abnvVar = (xlt) abnv.B(xlt.a, bArr, abnj.a());
                            break;
                        case SENSOR_ENVIRONMENT_DATA:
                            abnvVar = (xjg) abnv.B(xjg.a, bArr, abnj.a());
                            break;
                        case SENSOR_HVAC_DATA:
                            abnvVar = (xjr) abnv.B(xjr.a, bArr, abnj.a());
                            break;
                        case SENSOR_DRIVING_STATUS_DATA:
                            abnvVar = (xjf) abnv.B(xjf.a, bArr, abnj.a());
                            break;
                        case SENSOR_DEAD_RECKONING_DATA:
                            abnvVar = (xja) abnv.B(xja.a, bArr, abnj.a());
                            break;
                        case SENSOR_PASSENGER_DATA:
                            abnvVar = (xlz) abnv.B(xlz.a, bArr, abnj.a());
                            break;
                        case SENSOR_DOOR_DATA:
                            abnvVar = (xjd) abnv.B(xjd.a, bArr, abnj.a());
                            break;
                        case SENSOR_LIGHT_DATA:
                            abnvVar = (xkg) abnv.x(xkg.a, bArr);
                            break;
                        case SENSOR_TIRE_PRESSURE_DATA:
                            abnvVar = (xoj) abnv.B(xoj.a, bArr, abnj.a());
                            break;
                        case SENSOR_ACCELEROMETER_DATA:
                            abnvVar = (xgy) abnv.B(xgy.a, bArr, abnj.a());
                            break;
                        case SENSOR_GYROSCOPE_DATA:
                            abnvVar = (xjp) abnv.B(xjp.a, bArr, abnj.a());
                            break;
                        case SENSOR_GPS_SATELLITE_DATA:
                            abnvVar = (xjo) abnv.x(xjo.a, bArr);
                            break;
                        case SENSOR_TOLL_CARD:
                            abnvVar = (xok) abnv.B(xok.a, bArr, abnj.a());
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid type " + xnyVarB.name());
                    }
                } catch (abon e) {
                    throw new RuntimeException("Invalid bytes", e);
                }
            }
            xjf xjfVar = (xjf) abnvVar;
            if (xjfVar != null) {
                synchronized (this.b) {
                    int i3 = xjfVar.b;
                    this.d = i3;
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        this.g.post(new rgm((sdf) it.next(), i3, 7, bArr2));
                    }
                }
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final void d(rwp rwpVar) {
        synchronized (this.b) {
            if (rwpVar != null) {
                try {
                    this.f = rwpVar;
                    rwpVar.f(this);
                    this.e = true;
                } catch (RemoteException unused) {
                    this.e = false;
                }
            }
        }
    }

    @Override // defpackage.rws
    public final void b() {
    }

    @Override // defpackage.rws
    public final void c() {
    }
}
