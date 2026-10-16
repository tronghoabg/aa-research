package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.sli;
import defpackage.snf;
import defpackage.spu;
import defpackage.thg;
import defpackage.uqw;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable, sli {
    public final int f;
    public final String g;
    public final PendingIntent h;
    public final ConnectionResult i;
    public static final Status a = new Status(0, null, null, null);
    public static final Status b = new Status(14, null, null, null);
    public static final Status c = new Status(8, null, null, null);
    public static final Status d = new Status(15, null, null, null);
    public static final Status e = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new snf(1);

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f = i;
        this.g = str;
        this.h = pendingIntent;
        this.i = connectionResult;
    }

    public final String a() {
        String str = this.g;
        return str != null ? str : uqw.I(this.f);
    }

    public final boolean c() {
        return this.f <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f == status.f && Objects.equals(this.g, status.g) && Objects.equals(this.h, status.h) && Objects.equals(this.i, status.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), this.g, this.h, this.i});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        thg.w("statusCode", a(), arrayList);
        thg.w("resolution", this.h, arrayList);
        return thg.v(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f;
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, i2);
        spu.F(parcel, 2, this.g);
        spu.E(parcel, 3, this.h, i);
        spu.E(parcel, 4, this.i, i);
        spu.m(parcel, iL);
    }

    @Deprecated
    public Status(ConnectionResult connectionResult, String str) {
        this(17, str, connectionResult.d, connectionResult);
    }

    @Override // defpackage.sli
    public final Status b() {
        return this;
    }
}
