package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.srf;
import defpackage.ssx;
import defpackage.ssz;
import defpackage.sta;
import defpackage.stc;
import defpackage.sti;
import defpackage.stk;

@Deprecated
/* loaded from: classes2.dex */
public class LocationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationRequestUpdateData> CREATOR = new srf(1);
    public final int a;
    public final LocationRequestInternal b;
    public final PendingIntent c;
    public final String d;
    private final stc e;
    private final ssz f;
    private final stk g;

    public LocationRequestUpdateData(int i, LocationRequestInternal locationRequestInternal, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        stc staVar;
        ssz ssxVar;
        this.a = i;
        this.b = locationRequestInternal;
        stk stiVar = null;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            staVar = iInterfaceQueryLocalInterface instanceof stc ? (stc) iInterfaceQueryLocalInterface : new sta(iBinder);
        } else {
            staVar = null;
        }
        this.e = staVar;
        this.c = pendingIntent;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            ssxVar = iInterfaceQueryLocalInterface2 instanceof ssz ? (ssz) iInterfaceQueryLocalInterface2 : new ssx(iBinder2);
        } else {
            ssxVar = null;
        }
        this.f = ssxVar;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            stiVar = iInterfaceQueryLocalInterface3 instanceof stk ? (stk) iInterfaceQueryLocalInterface3 : new sti(iBinder3);
        }
        this.g = stiVar;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, i2);
        spu.E(parcel, 2, this.b, i);
        stc stcVar = this.e;
        spu.y(parcel, 3, stcVar == null ? null : stcVar.asBinder());
        spu.E(parcel, 4, this.c, i);
        ssz sszVar = this.f;
        spu.y(parcel, 5, sszVar == null ? null : sszVar.asBinder());
        stk stkVar = this.g;
        spu.y(parcel, 6, stkVar != null ? stkVar.asBinder() : null);
        spu.F(parcel, 8, this.d);
        spu.m(parcel, iL);
    }
}
