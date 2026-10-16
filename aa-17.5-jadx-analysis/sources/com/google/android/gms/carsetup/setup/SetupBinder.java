package com.google.android.gms.carsetup.setup;

import android.content.Intent;
import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.rcd;
import defpackage.sky;

/* loaded from: classes.dex */
public class SetupBinder extends Binder implements Parcelable {
    public static final Parcelable.Creator<SetupBinder> CREATOR = new rcd(12);
    public Intent a;
    private boolean b = false;
    private sky c;

    public SetupBinder(sky skyVar) {
        this.c = skyVar;
    }

    public void a() {
        this.b = false;
    }

    public boolean b() {
        return this.b;
    }

    @ResultIgnorabilityUnspecified
    public final sky c() {
        sky skyVar = this.c;
        this.c = null;
        return skyVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this);
    }

    public SetupBinder() {
    }
}
