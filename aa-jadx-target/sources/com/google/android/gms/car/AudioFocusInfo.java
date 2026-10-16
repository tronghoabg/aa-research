package com.google.android.gms.car;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class AudioFocusInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.AudioFocusInfo> CREATOR = new defpackage.ea(9);
    public final android.media.AudioAttributes a;
    public final int b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final int e;
    public final int f;
    public final int g;

    public AudioFocusInfo(android.media.AudioAttributes audioAttributes, int i, java.lang.String str, java.lang.String str2, int i2, int i3, int i4) {
        this.a = audioAttributes;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.media.AudioAttributes audioAttributes = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 1, audioAttributes, i);
        defpackage.sqs.v(parcel, 2, this.b);
        defpackage.sqs.J(parcel, 3, this.c);
        defpackage.sqs.J(parcel, 4, this.d);
        defpackage.sqs.v(parcel, 5, this.e);
        defpackage.sqs.v(parcel, 6, this.f);
        defpackage.sqs.v(parcel, 7, this.g);
        defpackage.sqs.q(parcel, iP);
    }
}
