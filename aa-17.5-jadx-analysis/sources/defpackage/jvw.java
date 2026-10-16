package defpackage;

import android.location.Location;
import android.os.SystemClock;
import androidx.car.app.hardware.common.CarValue;
import androidx.car.app.hardware.info.CarHardwareLocation;

/* loaded from: classes2.dex */
public final class jvw extends jvv {
    private static final yph e = yph.c("CarApp.H.Har");

    public jvw(int i, int i2, ruj rujVar) {
        super(i, i2, rujVar, 10);
    }

    private static int c(int[] iArr, int i) {
        int i2 = iArr[i] & 255;
        int i3 = iArr[i + 1] << 8;
        int i4 = iArr[i + 2] << 16;
        return ((iArr[i + 3] << 24) & (-16777216)) | (65280 & i3) | i2 | (16711680 & i4);
    }

    @Override // defpackage.qse
    public final void d(int i, long j, float[] fArr, byte[] bArr) {
        int[] iArr;
        Location location = new Location("Car-GPS");
        if (bArr == null) {
            iArr = new int[0];
        } else {
            int[] iArr2 = new int[bArr.length];
            for (int i2 = 0; i2 < bArr.length; i2++) {
                iArr2[i2] = bArr[i2];
            }
            iArr = iArr2;
        }
        int i3 = iArr[0];
        if ((i3 & 1) != 0) {
            if (iArr.length < 5) {
                ((ype) ((ype) e.h()).ai((char) 2788)).u("Invalid latitude data from CarService.");
            } else {
                location.setLatitude(c(iArr, 1) * 1.0E-7d);
            }
        }
        if ((i3 & 2) != 0) {
            if (iArr.length < 9) {
                ((ype) ((ype) e.h()).ai((char) 2787)).u("Invalid longitude data from CarService.");
            } else {
                location.setLongitude(c(iArr, 5) * 1.0E-7d);
            }
        }
        if ((i3 & 4) != 0) {
            if (fArr == null || fArr.length < 3) {
                ((ype) ((ype) e.h()).ai((char) 2786)).u("Invalid location accuracy data from CarService.");
            } else {
                location.setAccuracy(fArr[2]);
            }
        }
        if ((i3 & 8) != 0) {
            if (fArr == null || fArr.length < 4) {
                ((ype) ((ype) e.h()).ai((char) 2785)).u("Invalid location altitude data from CarService.");
            } else {
                location.setAltitude(fArr[3]);
            }
        }
        if ((i3 & 16) != 0) {
            if (fArr == null || fArr.length < 5) {
                ((ype) ((ype) e.h()).ai((char) 2784)).u("Invalid location speed data from CarService.");
            } else {
                location.setSpeed(fArr[4]);
            }
        }
        if ((i3 & 32) != 0) {
            if (fArr == null || fArr.length < 6) {
                ((ype) ((ype) e.h()).ai((char) 2783)).u("Invalid location bearing data from CarService.");
            } else {
                location.setBearing(fArr[5]);
            }
        }
        location.setElapsedRealtimeNanos(j);
        location.setTime(System.currentTimeMillis() - ((SystemClock.elapsedRealtimeNanos() - j) / 1000000));
        b(new CarHardwareLocation(new CarValue(location, j, 1)));
    }
}
