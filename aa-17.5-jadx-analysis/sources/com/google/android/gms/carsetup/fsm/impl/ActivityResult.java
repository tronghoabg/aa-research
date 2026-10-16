package com.google.android.gms.carsetup.fsm.impl;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rrn;

/* loaded from: classes2.dex */
public class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new rrn(20);
    public final int a;
    public final Intent b;

    public ActivityResult(Parcel parcel) {
        this.a = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.b = null;
        } else {
            this.b = (Intent) Intent.CREATOR.createFromParcel(parcel);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        Intent intent = this.b;
        if (intent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            intent.writeToParcel(parcel, i);
        }
    }

    public ActivityResult(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }
}
