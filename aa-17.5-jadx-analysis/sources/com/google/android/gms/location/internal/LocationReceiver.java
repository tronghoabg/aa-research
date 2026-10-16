package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.sqy;
import defpackage.ssz;
import defpackage.stc;

/* loaded from: classes2.dex */
public final class LocationReceiver extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationReceiver> CREATOR = new sqy(19);
    public final int a;
    public final IBinder b;
    public final IBinder c;
    public final PendingIntent d;
    public final String e;

    public LocationReceiver(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.a = i;
        this.b = iBinder;
        this.c = iBinder2;
        this.d = pendingIntent;
        this.e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, ssz] */
    public static LocationReceiver a(IInterface iInterface, ssz sszVar, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new LocationReceiver(2, iInterface, sszVar, null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, stc] */
    public static LocationReceiver b(IInterface iInterface, stc stcVar, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new LocationReceiver(1, iInterface, stcVar, null, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, i2);
        spu.y(parcel, 2, this.b);
        spu.y(parcel, 3, this.c);
        spu.E(parcel, 4, this.d, i);
        spu.F(parcel, 6, this.e);
        spu.m(parcel, iL);
    }
}
