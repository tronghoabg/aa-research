package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eae {
    private final android.content.Context a;
    private final defpackage.eaf b;
    private android.view.VelocityTracker c;
    private float d;
    private int e = -1;
    private int f = -1;
    private int g = -1;
    private final int[] h = {Integer.MAX_VALUE, 0};

    public eae(android.content.Context context, defpackage.eaf eafVar) {
        this.a = context;
        this.b = eafVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x0156  */
    public final void a(android.view.MotionEvent motionEvent, int i) {
        char c;
        int iF;
        int deviceId;
        int source;
        int identifier;
        char c2;
        int iF2;
        boolean z;
        boolean z2;
        float fM;
        int i2;
        long j;
        float fA;
        boolean z3;
        int i3 = i;
        int source2 = motionEvent.getSource();
        int deviceId2 = motionEvent.getDeviceId();
        if (this.f == source2 && this.g == deviceId2 && this.e == i3) {
            z = false;
        } else {
            android.content.Context context = this.a;
            int[] iArr = this.h;
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                iF = axd$.ExternalSyntheticApiModelOutline0.m(viewConfiguration, deviceId3, i3, source3);
            } else {
                if (defpackage.ebl.g(deviceId3, i3, source3)) {
                    android.content.res.Resources resources = context.getResources();
                    int identifier2 = (source3 == 4194304 && i3 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    viewConfiguration.getClass();
                    c = 0;
                    iF = defpackage.ebl.f(resources, identifier2, new ebu(viewConfiguration, 0), Integer.MAX_VALUE);
                } else {
                    iF = Integer.MAX_VALUE;
                }
                iArr[c] = iF;
                deviceId = motionEvent.getDeviceId();
                source = motionEvent.getSource();
                if (android.os.Build.VERSION.SDK_INT >= 34) {
                    iF2 = axd$.ExternalSyntheticApiModelOutline0.m$1(viewConfiguration, deviceId, i3, source);
                } else {
                    if (defpackage.ebl.g(deviceId, i3, source)) {
                        android.content.res.Resources resources2 = context.getResources();
                        if (source == 4194304 || i3 != 26) {
                            i3 = i3;
                            identifier = -1;
                        } else {
                            identifier = resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
                            i3 = 26;
                        }
                        viewConfiguration.getClass();
                        c2 = 1;
                        iF2 = defpackage.ebl.f(resources2, identifier, new ebu(viewConfiguration, 1), Integer.MIN_VALUE);
                    } else {
                        iF2 = Integer.MIN_VALUE;
                    }
                    iArr[c2] = iF2;
                    this.f = source2;
                    this.g = deviceId2;
                    this.e = i3;
                    i3 = i3;
                    z = true;
                }
                c2 = 1;
                iArr[c2] = iF2;
                this.f = source2;
                this.g = deviceId2;
                this.e = i3;
                i3 = i3;
                z = true;
            }
            c = 0;
            iArr[c] = iF;
            deviceId = motionEvent.getDeviceId();
            source = motionEvent.getSource();
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                iF2 = axd$.ExternalSyntheticApiModelOutline0.m$1(viewConfiguration, deviceId, i3, source);
            } else {
                if (defpackage.ebl.g(deviceId, i3, source)) {
                    iF2 = Integer.MIN_VALUE;
                } else {
                    android.content.res.Resources resources3 = context.getResources();
                    if (source == 4194304) {
                        i3 = i3;
                        identifier = -1;
                    } else {
                        i3 = i3;
                        identifier = -1;
                    }
                    viewConfiguration.getClass();
                    c2 = 1;
                    iF2 = defpackage.ebl.f(resources3, identifier, new ebu(viewConfiguration, 1), Integer.MIN_VALUE);
                }
                iArr[c2] = iF2;
                this.f = source2;
                this.g = deviceId2;
                this.e = i3;
                i3 = i3;
                z = true;
            }
            c2 = 1;
            iArr[c2] = iF2;
            this.f = source2;
            this.g = deviceId2;
            this.e = i3;
            i3 = i3;
            z = true;
        }
        int[] iArr2 = this.h;
        int i4 = iArr2[0];
        android.view.VelocityTracker velocityTrackerObtain = this.c;
        if (i4 == Integer.MAX_VALUE) {
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.recycle();
                this.c = null;
                return;
            }
            return;
        }
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = android.view.VelocityTracker.obtain();
            this.c = velocityTrackerObtain;
        }
        java.util.Map map = ebb.a;
        velocityTrackerObtain.addMovement(motionEvent);
        int i5 = 20;
        if (android.os.Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            java.util.Map map2 = ebb.a;
            if (!map2.containsKey(velocityTrackerObtain)) {
                map2.put(velocityTrackerObtain, new ebc());
            }
            ebc ebcVar = (ebc) map2.get(velocityTrackerObtain);
            long eventTime = motionEvent.getEventTime();
            int i6 = ebcVar.d;
            if (i6 != 0 && eventTime - ebcVar.b[ebcVar.e] > 40) {
                ebcVar.d = 0;
                ebcVar.c = 0.0f;
                i6 = 0;
            }
            int i7 = (ebcVar.e + 1) % 20;
            ebcVar.e = i7;
            if (i6 != 20) {
                ebcVar.d = i6 + 1;
            }
            ebcVar.a[i7] = motionEvent.getAxisValue(26);
            ebcVar.b[ebcVar.e] = eventTime;
        }
        velocityTrackerObtain.computeCurrentVelocity(1000, Float.MAX_VALUE);
        ebc ebcVarA = ebb.a(velocityTrackerObtain);
        if (ebcVarA != null) {
            int i8 = ebcVarA.d;
            if (i8 < 2) {
                z2 = z;
                fA = 0.0f;
            } else {
                int i9 = ebcVarA.e;
                long[] jArr = ebcVarA.b;
                long j2 = jArr[i9];
                int i10 = (i9 + 20) - (i8 - 1);
                while (true) {
                    i2 = i10 % 20;
                    j = jArr[i2];
                    if (j2 - j <= 100) {
                        break;
                    }
                    i10 = i2 + 1;
                    ebcVarA.d--;
                }
                int i11 = ebcVarA.d;
                if (i11 < 2) {
                    z2 = z;
                    fA = 0.0f;
                } else if (i11 == 2) {
                    int i12 = (i2 + 1) % 20;
                    long j3 = jArr[i12];
                    if (j == j3) {
                        z2 = z;
                        fA = 0.0f;
                    } else {
                        fA = ebcVarA.a[i12] / (j3 - j);
                        z2 = z;
                    }
                } else {
                    float fAbs = 0.0f;
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < ebcVarA.d - 1) {
                        int i15 = i13 + i2;
                        int i16 = i15 % 20;
                        int i17 = (i15 + 1) % i5;
                        long j4 = jArr[i16];
                        if (jArr[i17] != j4) {
                            i14++;
                            float fA2 = ebc.a(fAbs);
                            z3 = z;
                            float f = ebcVarA.a[i17] / (jArr[i17] - j4);
                            fAbs += (f - fA2) * java.lang.Math.abs(f);
                            if (i14 == 1) {
                                fAbs *= 0.5f;
                            }
                        } else {
                            z3 = z;
                        }
                        i13++;
                        z = z3;
                        i5 = 20;
                    }
                    z2 = z;
                    fA = ebc.a(fAbs);
                }
            }
            float f2 = fA * 1000.0f;
            ebcVarA.c = f2;
            if (f2 < -3.4028235E38f) {
                ebcVarA.c = -3.4028235E38f;
            } else if (ebcVarA.c > Float.MAX_VALUE) {
                ebcVarA.c = Float.MAX_VALUE;
            }
        } else {
            z2 = z;
        }
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            fM = axd$.ExternalSyntheticApiModelOutline0.m(velocityTrackerObtain, i3);
        } else {
            ebc ebcVarA2 = ebb.a(velocityTrackerObtain);
            fM = (ebcVarA2 == null || i3 != 26) ? 0.0f : ebcVarA2.c;
        }
        defpackage.eaf eafVar = this.b;
        float fA3 = fM * eafVar.a();
        float fSignum = java.lang.Math.signum(fA3);
        if (z2 || (fSignum != java.lang.Math.signum(this.d) && fSignum != 0.0f)) {
            eafVar.b();
        }
        if (java.lang.Math.abs(fA3) >= iArr2[0]) {
            int i18 = iArr2[1];
            float fMax = java.lang.Math.max(-i18, java.lang.Math.min(fA3, i18));
            this.d = true == eafVar.c(fMax) ? fMax : 0.0f;
        }
    }
}
