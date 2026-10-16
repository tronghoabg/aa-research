package com.google.android.gms.usagereporting;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class UsageReportingOptInOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.usagereporting.UsageReportingOptInOptions> CREATOR = new defpackage.smf(6);
    public final int a;
    public final boolean b;
    public final java.util.List c;
    public final int d;
    public final java.lang.String e;
    public final boolean f;

    public UsageReportingOptInOptions(int i, boolean z, java.util.List list, int i2, java.lang.String str, boolean z2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.c = arrayList;
        this.a = i;
        this.b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 2, this.a);
        defpackage.sqs.r(parcel, 3, this.b);
        defpackage.sqs.L(parcel, 4, this.c);
        defpackage.sqs.v(parcel, 5, this.d);
        defpackage.sqs.J(parcel, 6, this.e);
        defpackage.sqs.r(parcel, 7, this.f);
        defpackage.sqs.q(parcel, iP);
    }
}
