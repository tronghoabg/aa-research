package com.google.android.gms.location.internal;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class LocationRequestUpdateData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.internal.LocationRequestUpdateData> CREATOR = new defpackage.ssd(2);
    public final int a;
    public final com.google.android.gms.location.internal.LocationRequestInternal b;
    public final android.app.PendingIntent c;
    public final java.lang.String d;
    private final defpackage.sua e;
    private final defpackage.stx f;
    private final defpackage.sui g;

    public LocationRequestUpdateData(int i, com.google.android.gms.location.internal.LocationRequestInternal locationRequestInternal, android.os.IBinder iBinder, android.os.IBinder iBinder2, android.app.PendingIntent pendingIntent, android.os.IBinder iBinder3, java.lang.String str) {
        defpackage.sua styVar;
        defpackage.stx stvVar;
        this.a = i;
        this.b = locationRequestInternal;
        defpackage.sui sugVar = null;
        if (iBinder != null) {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            styVar = iInterfaceQueryLocalInterface instanceof defpackage.sua ? (defpackage.sua) iInterfaceQueryLocalInterface : new defpackage.sty(iBinder);
        } else {
            styVar = null;
        }
        this.e = styVar;
        this.c = pendingIntent;
        if (iBinder2 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            stvVar = iInterfaceQueryLocalInterface2 instanceof defpackage.stx ? (defpackage.stx) iInterfaceQueryLocalInterface2 : new defpackage.stv(iBinder2);
        } else {
            stvVar = null;
        }
        this.f = stvVar;
        if (iBinder3 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            sugVar = iInterfaceQueryLocalInterface3 instanceof defpackage.sui ? (defpackage.sui) iInterfaceQueryLocalInterface3 : new defpackage.sug(iBinder3);
        }
        this.g = sugVar;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, i2);
        defpackage.sqs.I(parcel, 2, this.b, i);
        defpackage.sua suaVar = this.e;
        defpackage.sqs.C(parcel, 3, suaVar == null ? null : suaVar.asBinder());
        defpackage.sqs.I(parcel, 4, this.c, i);
        defpackage.stx stxVar = this.f;
        defpackage.sqs.C(parcel, 5, stxVar == null ? null : stxVar.asBinder());
        defpackage.sui suiVar = this.g;
        defpackage.sqs.C(parcel, 6, suiVar != null ? suiVar.asBinder() : null);
        defpackage.sqs.J(parcel, 8, this.d);
        defpackage.sqs.q(parcel, iP);
    }
}
