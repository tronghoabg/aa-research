package com.google.android.gms.common;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class GoogleCertificatesLookupQuery extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.GoogleCertificatesLookupQuery> CREATOR = new defpackage.rcy(20);
    public final java.lang.String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    private final android.content.Context g;

    public GoogleCertificatesLookupQuery(java.lang.String str, boolean z, boolean z2, android.os.IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        defpackage.srh srfVar;
        this.a = str;
        this.b = z;
        this.c = z2;
        if (iBinder == null) {
            srfVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(iBinder);
        }
        this.g = (android.content.Context) defpackage.srg.a(srfVar);
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        if (str != null) {
            int iP2 = defpackage.sqs.p(parcel, 1);
            parcel.writeString(str);
            defpackage.sqs.q(parcel, iP2);
        }
        boolean z = this.b;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.c;
        parcel.writeInt(262147);
        parcel.writeInt(z2 ? 1 : 0);
        defpackage.srg srgVar = new defpackage.srg(this.g);
        int iP3 = defpackage.sqs.p(parcel, 4);
        parcel.writeStrongBinder(srgVar);
        defpackage.sqs.q(parcel, iP3);
        boolean z3 = this.d;
        parcel.writeInt(262149);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.e;
        parcel.writeInt(262150);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.f;
        parcel.writeInt(262152);
        parcel.writeInt(z5 ? 1 : 0);
        defpackage.sqs.q(parcel, iP);
    }
}
