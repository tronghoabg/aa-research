package com.google.android.gms.carsetup.fsm.impl;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.carsetup.fsm.impl.ActivityResult> CREATOR = new defpackage.rsh(20);
    public final int a;
    public final android.content.Intent b;

    public ActivityResult(android.os.Parcel parcel) {
        this.a = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.b = null;
        } else {
            this.b = (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(parcel);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        android.content.Intent intent = this.b;
        if (intent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            intent.writeToParcel(parcel, i);
        }
    }

    public ActivityResult(int i, android.content.Intent intent) {
        this.a = i;
        this.b = intent;
    }
}
