package com.google.android.gms.car.senderprotocol;

/* JADX INFO: loaded from: classes2.dex */
public class ChannelMessage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.senderprotocol.ChannelMessage> CREATOR = new defpackage.rsh(19);
    public final int a;
    public final int b;
    public final java.nio.ByteBuffer c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public long j = 0;

    public ChannelMessage(int i, java.nio.ByteBuffer byteBuffer, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, int i4) {
        this.b = i;
        this.c = byteBuffer;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = i3;
        this.d = i2;
        this.a = i4;
    }

    public final void a(long j) {
        defpackage.ysr.bj(j > 0);
        this.j = j;
    }

    public final boolean b() {
        return this.j != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.b);
        defpackage.yqk yqkVar = defpackage.rvp.a;
        parcel.writeStrongBinder(new defpackage.ruv(this.c));
        parcel.writeInt(this.d);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.i);
        parcel.writeInt(this.a);
    }
}
