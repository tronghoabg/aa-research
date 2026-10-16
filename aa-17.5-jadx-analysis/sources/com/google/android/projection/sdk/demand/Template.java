package com.google.android.projection.sdk.demand;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.srg;

/* loaded from: classes3.dex */
public class Template implements Parcelable {
    public static final Parcelable.Creator<Template> CREATOR = new srg(6);
    private final int a;
    private final int b;
    private final Bundle c;

    public Template(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        Bundle bundle = parcel.readBundle();
        this.c = bundle;
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeBundle(this.c);
    }
}
