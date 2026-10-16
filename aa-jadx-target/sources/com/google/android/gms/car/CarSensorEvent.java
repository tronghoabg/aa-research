package com.google.android.gms.car;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class CarSensorEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.CarSensorEvent> CREATOR = new defpackage.ea(13);
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

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final android.location.Location b(android.location.Location location) {
        c(10);
        if (location == null) {
            location = new android.location.Location("Car-GPS");
        }
        byte[] bArr = this.e;
        byte b = bArr[0];
        if ((b & 1) != 0) {
            if (this.a >= 2) {
                location.setLatitude(((double) a(bArr, 1)) * 1.0E-7d);
            } else {
                location.setLatitude(this.d[0]);
            }
        }
        if ((b & 2) != 0) {
            if (this.a >= 2) {
                location.setLongitude(((double) a(bArr, 5)) * 1.0E-7d);
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
        location.setTime(java.lang.System.currentTimeMillis() - ((android.os.SystemClock.elapsedRealtimeNanos() - j) / 1000000));
        return location;
    }

    public final void c(int i) {
        int i2 = this.b;
        if (i2 != i) {
            throw new java.lang.UnsupportedOperationException(java.lang.String.format("Invalid sensor type: expected %d, got %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void e(defpackage.qsw qswVar) {
        c(2);
        if (qswVar == null) {
            qswVar = new defpackage.qsw();
        }
        float[] fArr = this.d;
        qswVar.a = fArr[0];
        if (this.a >= 3) {
            byte b = this.e[0];
            float f = fArr[1];
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void f(defpackage.qsx qsxVar) {
        c(6);
        if (qsxVar == null) {
            qsxVar = new defpackage.qsx();
        }
        qsxVar.a = this.e[0] == 1;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final ttc g() {
        c(11);
        ttc ttcVar = new ttc();
        ttcVar.a = this.e[0];
        return ttcVar;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void h(defpackage.mgr mgrVar) {
        c(7);
        if (mgrVar == null) {
            mgrVar = new defpackage.mgr(null);
        }
        mgrVar.a = this.e[0];
    }

    public final usc i() {
        c(22);
        usc uscVar = new usc();
        uscVar.a = this.e[0] == 1;
        return uscVar;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName());
        sb.append("[type:");
        sb.append(java.lang.Integer.toHexString(this.b));
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
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.b);
        parcel.writeInt(524290);
        parcel.writeLong(this.c);
        float[] fArr = this.d;
        if (fArr != null) {
            int iP2 = defpackage.sqs.p(parcel, 3);
            parcel.writeFloatArray(fArr);
            defpackage.sqs.q(parcel, iP2);
        }
        byte[] bArr = this.e;
        if (bArr != null) {
            int iP3 = defpackage.sqs.p(parcel, 4);
            parcel.writeByteArray(bArr);
            defpackage.sqs.q(parcel, iP3);
        }
        int i2 = this.a;
        parcel.writeInt(263144);
        parcel.writeInt(i2);
        defpackage.sqs.q(parcel, iP);
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
