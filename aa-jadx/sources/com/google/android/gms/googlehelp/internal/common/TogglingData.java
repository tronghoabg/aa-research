package com.google.android.gms.googlehelp.internal.common;

/* JADX INFO: loaded from: classes2.dex */
public class TogglingData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.googlehelp.internal.common.TogglingData> CREATOR = new defpackage.srw(11);
    java.lang.String a;
    java.lang.String b;
    public java.lang.String c;

    public TogglingData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.J(parcel, 2, this.a);
        defpackage.sqs.J(parcel, 3, this.b);
        defpackage.sqs.J(parcel, 4, this.c);
        defpackage.sqs.q(parcel, iP);
    }

    private TogglingData() {
    }
}
