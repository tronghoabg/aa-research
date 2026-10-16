package com.google.android.gms.car;

/* JADX INFO: loaded from: classes2.dex */
public class CarGalMessage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.CarGalMessage> CREATOR = new defpackage.qpf(17);
    public long a;
    public int b;
    public int c;
    public byte[] d;
    public int e;
    public int f;
    public boolean g;

    public CarGalMessage(android.os.Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.e = 0;
        int i = parcel.readInt();
        this.f = i;
        if (i > 0) {
            byte[] bArr = new byte[i];
            this.d = bArr;
            parcel.readByteArray(bArr);
        } else {
            this.d = null;
        }
        this.g = parcel.readInt() != 0;
    }

    public final void a(long j, int i, int i2, byte[] bArr, int i3, int i4, boolean z) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = bArr;
        this.e = i3;
        this.f = i4;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        if (this.d != null) {
            parcel.writeInt(this.f);
            int i2 = this.f;
            if (i2 > 0) {
                parcel.writeByteArray(this.d, this.e, i2);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.g ? 1 : 0);
    }

    public CarGalMessage() {
        a(0L, 0, 0, null, 0, 0, false);
    }
}
