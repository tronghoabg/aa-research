package com.google.android.projection.sdk.demand;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.srg;

/* loaded from: classes3.dex */
public class TemplateArgument implements Parcelable {
    public static final Parcelable.Creator<TemplateArgument> CREATOR = new srg(7);
    private final String a;
    private final int b;
    private final int c;
    private final Bundle d;

    public TemplateArgument(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeBundle(this.d);
    }
}
