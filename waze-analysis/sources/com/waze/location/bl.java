package com.waze.location;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bl implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private static final float f25367a = (float) Math.toRadians(90.0d);

    /* renamed from: b, reason: collision with root package name */
    private final SensorManager f25368b;

    /* renamed from: c, reason: collision with root package name */
    private final Sensor f25369c;

    /* renamed from: d, reason: collision with root package name */
    private final Sensor f25370d;

    /* renamed from: e, reason: collision with root package name */
    private final Sensor f25371e;

    /* renamed from: f, reason: collision with root package name */
    private final Sensor f25372f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f25373g;

    /* renamed from: h, reason: collision with root package name */
    private long f25374h;

    /* renamed from: i, reason: collision with root package name */
    private long f25375i;

    /* renamed from: j, reason: collision with root package name */
    private final bk f25376j;

    /* renamed from: k, reason: collision with root package name */
    private long f25377k;

    /* renamed from: l, reason: collision with root package name */
    private final float[] f25378l;
    private final float[] m;
    private boolean n;
    private boolean o;
    private boolean p;
    private final float[] q;
    private final bk r;
    private float s;
    private float t;
    private long u;
    private final com.google.firebase.messaging.l v;

    public bl(com.google.firebase.messaging.l lVar, SensorManager sensorManager) {
        h.g.b.x.f(lVar, "listener");
        this.v = lVar;
        this.f25368b = sensorManager;
        this.f25369c = sensorManager != null ? sensorManager.getDefaultSensor(16) : null;
        this.f25370d = sensorManager != null ? sensorManager.getDefaultSensor(10) : null;
        this.f25371e = sensorManager != null ? sensorManager.getDefaultSensor(9) : null;
        this.f25372f = sensorManager != null ? sensorManager.getDefaultSensor(14) : null;
        this.f25376j = new bk(null);
        this.f25378l = new float[3];
        this.m = new float[3];
        this.p = true;
        this.q = new float[4];
        this.r = new bk(null);
    }

    private final void b() {
        this.f25376j.i();
        this.f25377k = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r21 = this;
            r0 = r21
            android.hardware.Sensor r3 = r0.f25369c
            if (r3 == 0) goto L92
            android.hardware.Sensor r7 = r0.f25371e
            if (r7 == 0) goto L92
            android.hardware.Sensor r10 = r0.f25370d
            if (r10 != 0) goto L10
            goto L92
        L10:
            r14 = 1
            r0.p = r14
            r0.b()
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r6.<init>(r1)
            android.hardware.SensorManager r15 = r0.f25368b
            r16 = 0
            if (r15 == 0) goto L38
            r2 = r0
            android.hardware.SensorEventListener r2 = (android.hardware.SensorEventListener) r2
            r4 = 5000(0x1388, float:7.006E-42)
            r5 = 166500(0x28a64, float:2.33316E-40)
            r1 = r15
            boolean r2 = r1.registerListener(r2, r3, r4, r5, r6)
            r20 = r6
            if (r2 != r14) goto L3a
            r1 = r14
            goto L3c
        L38:
            r20 = r6
        L3a:
            r1 = r16
        L3c:
            if (r15 == 0) goto L51
            r9 = r0
            android.hardware.SensorEventListener r9 = (android.hardware.SensorEventListener) r9
            r11 = 20000(0x4e20, float:2.8026E-41)
            r12 = 166500(0x28a64, float:2.33316E-40)
            r8 = r15
            r13 = r20
            boolean r2 = r8.registerListener(r9, r10, r11, r12, r13)
            if (r2 != r14) goto L51
            r2 = r14
            goto L53
        L51:
            r2 = r16
        L53:
            r1 = r1 & r2
            if (r15 == 0) goto L69
            r5 = r0
            android.hardware.SensorEventListener r5 = (android.hardware.SensorEventListener) r5
            r6 = r7
            r7 = 20000(0x4e20, float:2.8026E-41)
            r8 = 166500(0x28a64, float:2.33316E-40)
            r4 = r15
            r9 = r20
            boolean r2 = r4.registerListener(r5, r6, r7, r8, r9)
            if (r2 != r14) goto L69
            goto L6b
        L69:
            r14 = r16
        L6b:
            r1 = r1 & r14
            android.hardware.Sensor r2 = r0.f25372f
            if (r2 == 0) goto L80
            if (r15 == 0) goto L80
            r16 = r0
            android.hardware.SensorEventListener r16 = (android.hardware.SensorEventListener) r16
            r18 = 20000(0x4e20, float:2.8026E-41)
            r19 = 166500(0x28a64, float:2.33316E-40)
            r17 = r2
            r15.registerListener(r16, r17, r18, r19, r20)
        L80:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "started, successful "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.waze.shared_infra.i.h.a(r0)
            return
        L92:
            android.hardware.Sensor r1 = r0.f25371e
            android.hardware.Sensor r0 = r0.f25370d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Missing sensors, not running "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.waze.shared_infra.i.h.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.location.bl.a():void");
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
        h.g.b.x.f(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        h.g.b.x.f(sensorEvent, NotificationCompat.CATEGORY_EVENT);
        float[] fArr = sensorEvent.values;
        int type = sensorEvent.sensor.getType();
        if (type == 9) {
            float[] fArr2 = this.f25378l;
            fArr2[0] = fArr[0];
            fArr2[1] = fArr[1];
            fArr2[2] = fArr[2];
            this.n = true;
        } else if (type == 10) {
            float f2 = this.s;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[2];
            this.s = Math.max(f2, (f3 * f3) + (f4 * f4) + (f5 * f5));
        } else if (type == 14) {
            float[] fArr3 = this.m;
            fArr3[0] = fArr[0];
            fArr3[1] = fArr[1];
            fArr3[2] = fArr[2];
            this.o = true;
        } else if (type == 16) {
            float[] fArr4 = this.q;
            float f6 = fArr[0];
            fArr4[0] = f6;
            float f7 = fArr[1];
            fArr4[1] = f7;
            float f8 = fArr[2];
            fArr4[2] = f8;
            if (fArr.length >= 6 && this.f25373g == null) {
                this.f25373g = new float[]{fArr[3], fArr[4], fArr[5]};
            }
            float[] fArr5 = this.f25373g;
            if (fArr5 != null) {
                fArr4[0] = f6 - fArr5[0];
                fArr4[1] = f7 - fArr5[1];
                h.g.b.x.c(fArr5);
                fArr4[2] = f8 - fArr5[2];
            }
            float f9 = this.t;
            float f10 = fArr4[0];
            float f11 = fArr4[1];
            float f12 = fArr4[2];
            this.t = Math.max(f9, (f10 * f10) + (f11 * f11) + (f12 * f12));
            if (this.f25374h != 0 && sensorEvent.timestamp > this.f25374h) {
                long j2 = sensorEvent.timestamp - this.f25374h;
                bk bkVar = this.r;
                bkVar.g(fArr4, j2 * 1.0E-9f);
                this.f25376j.e(bkVar);
                this.f25377k += j2;
            }
            this.f25374h = sensorEvent.timestamp;
            this.f25375i = System.currentTimeMillis();
        }
        if (sensorEvent.timestamp < this.u + 333000000 || !this.n) {
            return;
        }
        if (this.p || this.f25377k > 0) {
            long j3 = this.f25375i;
            float f13 = this.t;
            float f14 = f25367a;
            float fSqrt = f13 > f14 * f14 ? (float) Math.sqrt(f13) : Float.NaN;
            float f15 = this.s;
            float fSqrt2 = f15 > 9.0f ? (float) Math.sqrt(f15) : Float.NaN;
            this.t = 0.0f;
            this.s = 0.0f;
            if (this.p) {
                this.f25376j.i();
            }
            bk bkVar2 = this.f25376j;
            bkVar2.f();
            ((LocationSensorListener) this.v.f10212a).lambda$initRotationVectors$1(j3, this.p ? 0L : this.f25377k, bk.h(bkVar2), (float[]) this.f25378l.clone(), this.o ? (float[]) this.m.clone() : new float[]{Float.NaN, Float.NaN, Float.NaN}, fSqrt, fSqrt2);
            this.p = false;
            b();
            this.u = sensorEvent.timestamp;
        }
    }
}
