package com.google.android.gms.car;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.ea;
import defpackage.mgj;
import defpackage.qsc;
import defpackage.qsd;
import defpackage.spu;
import defpackage.tse;
import defpackage.urf;

/* loaded from: classes.dex */
public class CarSensorEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarSensorEvent> CREATOR = new ea(13);
    final int a;
    public final int b;
    public final long c;
    public final float[] d;
    public final byte[] e;

    public CarSensorEvent(int i, long j, int i2, int i3) {
        this.a = 3;
        this.b = i;
        this.c = j;
        this.d = new float[i2];
        this.e = new byte[i3];
    }

    public static int a(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] << 8;
        int i4 = bArr[i + 2] << 16;
        return ((bArr[i + 3] << 24) & (-16777216)) | (65280 & i3) | i2 | (16711680 & i4);
    }

    public static void d(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    @ResultIgnorabilityUnspecified
    public final Location b(Location location) {
        c(10);
        if (location == null) {
            location = new Location("Car-GPS");
        }
        byte b = this.e[0];
        if ((b & 1) != 0) {
            if (this.a >= 2) {
                location.setLatitude(a(r0, 1) * 1.0E-7d);
            } else {
                location.setLatitude(this.d[0]);
            }
        }
        if ((b & 2) != 0) {
            if (this.a >= 2) {
                location.setLongitude(a(r0, 5) * 1.0E-7d);
            } else {
                location.setLongitude(this.d[1]);
            }
        }
        if ((b & 4) != 0) {
            location.setAccuracy(this.d[2]);
        }
        if ((b & 8) != 0) {
            location.setAltitude(this.d[3]);
        }
        if ((b & 16) != 0) {
            location.setSpeed(this.d[4]);
        }
        if ((b & 32) != 0) {
            location.setBearing(this.d[5]);
        }
        long j = this.c;
        location.setElapsedRealtimeNanos(j);
        location.setTime(System.currentTimeMillis() - ((SystemClock.elapsedRealtimeNanos() - j) / 1000000));
        return location;
    }

    public final void c(int i) {
        int i2 = this.b;
        if (i2 != i) {
            throw new UnsupportedOperationException(String.format("Invalid sensor type: expected %d, got %d", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    @ResultIgnorabilityUnspecified
    public final void e(qsc qscVar) {
        c(2);
        if (qscVar == null) {
            qscVar = new qsc();
        }
        float[] fArr = this.d;
        qscVar.a = fArr[0];
        if (this.a >= 3) {
            byte b = this.e[0];
            float f = fArr[1];
        }
    }

    @ResultIgnorabilityUnspecified
    public final void f(qsd qsdVar) {
        c(6);
        if (qsdVar == null) {
            qsdVar = new qsd();
        }
        qsdVar.a = this.e[0] == 1;
    }

    @ResultIgnorabilityUnspecified
    public final tse g() {
        c(11);
        tse tseVar = new tse();
        tseVar.a = this.e[0];
        return tseVar;
    }

    @ResultIgnorabilityUnspecified
    public final void h(mgj mgjVar) {
        c(7);
        if (mgjVar == null) {
            mgjVar = new mgj(null);
        }
        mgjVar.a = this.e[0];
    }

    public final urf i() {
        c(22);
        urf urfVar = new urf();
        urfVar.a = this.e[0] == 1;
        return urfVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[type:");
        sb.append(Integer.toHexString(this.b));
        sb.append("timestamp:");
        sb.append(this.c);
        float[] fArr = this.d;
        if (fArr != null && (fArr.length) > 0) {
            sb.append(" float values:");
            for (float f : fArr) {
                sb.append(" ");
                sb.append(f);
            }
        }
        byte[] bArr = this.e;
        if (bArr != null && (bArr.length) > 0) {
            sb.append(" byte values:");
            for (byte b : bArr) {
                sb.append(" ");
                sb.append((int) b);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.b);
        parcel.writeInt(524290);
        parcel.writeLong(this.c);
        float[] fArr = this.d;
        if (fArr != null) {
            int iL2 = spu.l(parcel, 3);
            parcel.writeFloatArray(fArr);
            spu.m(parcel, iL2);
        }
        byte[] bArr = this.e;
        if (bArr != null) {
            int iL3 = spu.l(parcel, 4);
            parcel.writeByteArray(bArr);
            spu.m(parcel, iL3);
        }
        int i2 = this.a;
        parcel.writeInt(263144);
        parcel.writeInt(i2);
        spu.m(parcel, iL);
    }

    public CarSensorEvent(int i, long j, float[] fArr, byte[] bArr) {
        this.a = 3;
        this.b = i;
        this.c = j;
        this.d = fArr;
        this.e = bArr;
    }

    public CarSensorEvent(int i, int i2, long j, float[] fArr, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = fArr;
        this.e = bArr;
    }
}
