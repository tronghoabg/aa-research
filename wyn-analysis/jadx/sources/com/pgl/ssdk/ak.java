package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class ak implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f32500a = {999999.0f, 999999.0f, 999999.0f};

    /* renamed from: b, reason: collision with root package name */
    public static boolean f32501b = true;

    /* renamed from: c, reason: collision with root package name */
    private static volatile ak f32502c;

    /* renamed from: i, reason: collision with root package name */
    private final Context f32508i;

    /* renamed from: d, reason: collision with root package name */
    private Sensor f32503d = null;

    /* renamed from: e, reason: collision with root package name */
    private Sensor f32504e = null;

    /* renamed from: f, reason: collision with root package name */
    private Sensor f32505f = null;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f32506g = false;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f32507h = false;

    /* renamed from: j, reason: collision with root package name */
    private AtomicReference<a> f32509j = new AtomicReference<>();
    private long k = 999999;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f32510a;

        /* renamed from: b, reason: collision with root package name */
        public float[] f32511b = null;

        /* renamed from: c, reason: collision with root package name */
        public float[] f32512c = null;

        /* renamed from: d, reason: collision with root package name */
        public float[] f32513d = null;

        public a(long j8) {
            this.f32510a = j8;
        }
    }

    private ak(Context context) {
        this.f32508i = context;
    }

    public static ak a(Context context) {
        if (f32502c == null) {
            synchronized (ak.class) {
                try {
                    if (f32502c == null) {
                        f32502c = new ak(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (f32501b) {
            f32502c.c();
        }
        return f32502c;
    }

    private void c() {
        if (this.f32507h) {
            return;
        }
        try {
            SensorManager sensorManager = (SensorManager) this.f32508i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                this.f32503d = sensorManager.getDefaultSensor(1);
                this.f32504e = sensorManager.getDefaultSensor(2);
                this.f32505f = sensorManager.getDefaultSensor(4);
            }
        } catch (Exception unused) {
        }
        this.f32507h = true;
    }

    private void e() {
        this.k = -1L;
        this.f32506g = false;
        try {
            SensorManager sensorManager = (SensorManager) this.f32508i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
        } catch (Exception unused) {
        }
    }

    public Object[] b() {
        Object[] objArr = new Object[6];
        a aVar = this.f32509j.get();
        if (!f32501b || aVar == null) {
            a(objArr);
            return objArr;
        }
        int i5 = 0;
        do {
            if ((this.f32503d == null || aVar.f32511b != null) && ((this.f32504e == null || aVar.f32512c != null) && (this.f32505f == null || aVar.f32513d != null))) {
                break;
            }
            ay.a(50L);
            i5++;
        } while (i5 <= 20);
        e();
        this.f32506g = false;
        a(objArr, aVar);
        this.f32509j.set(null);
        return objArr;
    }

    public boolean d() {
        if (this.f32503d != null) {
            try {
                SensorManager sensorManager = (SensorManager) this.f32508i.getApplicationContext().getSystemService("sensor");
                if (sensorManager != null) {
                    boolean zRegisterListener = sensorManager.registerListener(this, this.f32503d, 2);
                    Sensor sensor = this.f32504e;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 2);
                    }
                    Sensor sensor2 = this.f32505f;
                    if (sensor2 != null) {
                        sensorManager.registerListener(this, sensor2, 2);
                    }
                    if (zRegisterListener) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.k = jCurrentTimeMillis;
                        this.f32509j.set(new a(jCurrentTimeMillis));
                        this.f32506g = true;
                    } else {
                        e();
                    }
                }
            } catch (Throwable unused) {
                e();
            }
        }
        return this.f32506g;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i5) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        a aVar = this.f32509j.get();
        if (aVar == null) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            if (aVar.f32511b == null) {
                aVar.f32511b = sensorEvent.values;
            }
        } else if (type == 2) {
            if (aVar.f32512c == null) {
                aVar.f32512c = sensorEvent.values;
            }
        } else if (type == 4 && aVar.f32513d == null) {
            aVar.f32513d = sensorEvent.values;
        }
    }

    public void a() {
        if (!f32501b || this.f32506g) {
            return;
        }
        d();
    }

    private static void a(Object[] objArr) {
        Float fValueOf = Float.valueOf(999999.0f);
        objArr[0] = fValueOf;
        objArr[1] = fValueOf;
        objArr[2] = fValueOf;
        objArr[3] = 999999L;
        float[] fArr = f32500a;
        objArr[4] = fArr;
        objArr[5] = fArr;
    }

    private static void a(Object[] objArr, a aVar) {
        float[] fArr = aVar.f32511b;
        if (fArr != null) {
            float[] fArr2 = aVar.f32512c;
            float[] fArrA = fArr2 != null ? a(objArr, fArr, fArr2) : a(objArr, fArr);
            objArr[0] = Float.valueOf(fArrA[0]);
            objArr[1] = Float.valueOf(fArrA[1]);
            objArr[2] = Float.valueOf(fArrA[2]);
            objArr[4] = aVar.f32511b;
        } else {
            objArr[0] = Float.valueOf(999999.0f);
            objArr[1] = Float.valueOf(999999.0f);
            objArr[2] = Float.valueOf(999999.0f);
            objArr[4] = f32500a;
        }
        objArr[3] = Long.valueOf(aVar.f32510a);
        float[] fArr3 = aVar.f32513d;
        if (fArr3 != null) {
            objArr[5] = fArr3;
        } else {
            objArr[5] = f32500a;
        }
    }

    private static float[] a(Object[] objArr, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float fSqrt = 1.0f / ((float) Math.sqrt((f12 * f12) + ((f11 * f11) + (f10 * f10))));
        return new float[]{999999.0f, (((float) Math.toDegrees((float) Math.asin(-(f11 * fSqrt)))) + 360.0f) % 360.0f, (((float) Math.toDegrees((float) Math.atan2(-(f10 * fSqrt), f12 * fSqrt))) + 360.0f) % 360.0f};
    }

    private static float[] a(Object[] objArr, float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        SensorManager.getRotationMatrix(fArr3, new float[9], fArr, fArr2);
        SensorManager.getOrientation(fArr3, new float[3]);
        return new float[]{(((float) Math.toDegrees(r2[0])) + 360.0f) % 360.0f, (((float) Math.toDegrees(r2[1])) + 360.0f) % 360.0f, (((float) Math.toDegrees(r2[2])) + 360.0f) % 360.0f};
    }
}
