package com.google.android.gms.car;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class CarAudioConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.CarAudioConfiguration> CREATOR = new defpackage.ea(11);
    public final int a;
    public final int b;
    public final int c;

    public CarAudioConfiguration(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final java.lang.String toString() {
        return getClass().getName() + "[sampleRate=" + this.a + ",channelConfig=" + this.b + ",audioFormat=" + this.c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.a);
        defpackage.sqs.v(parcel, 2, this.b);
        defpackage.sqs.v(parcel, 3, this.c);
        defpackage.sqs.q(parcel, iP);
    }
}
