package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public class GetServiceRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.GetServiceRequest> CREATOR = new defpackage.smf(3);
    public static final com.google.android.gms.common.api.Scope[] a = new com.google.android.gms.common.api.Scope[0];
    public static final com.google.android.gms.common.Feature[] b = new com.google.android.gms.common.Feature[0];
    public final int c;
    public final int d;
    public final int e;
    public java.lang.String f;
    public android.os.IBinder g;
    public com.google.android.gms.common.api.Scope[] h;
    public android.os.Bundle i;
    public android.accounts.Account j;
    public com.google.android.gms.common.Feature[] k;
    public com.google.android.gms.common.Feature[] l;
    public boolean m;
    public int n;
    public boolean o;
    public java.lang.String p;

    public GetServiceRequest(int i, int i2, int i3, java.lang.String str, android.os.IBinder iBinder, com.google.android.gms.common.api.Scope[] scopeArr, android.os.Bundle bundle, android.accounts.Account account, com.google.android.gms.common.Feature[] featureArr, com.google.android.gms.common.Feature[] featureArr2, boolean z, int i4, boolean z2, java.lang.String str2) {
        scopeArr = scopeArr == null ? a : scopeArr;
        bundle = bundle == null ? new android.os.Bundle() : bundle;
        featureArr = featureArr == null ? b : featureArr;
        featureArr2 = featureArr2 == null ? b : featureArr2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f = "com.google.android.gms";
        } else {
            this.f = str;
        }
        if (i < 2) {
            android.accounts.Account account2 = null;
            if (iBinder != null) {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                defpackage.spc spcVar = iInterfaceQueryLocalInterface instanceof defpackage.spc ? (defpackage.spc) iInterfaceQueryLocalInterface : new defpackage.spc(iBinder);
                if (spcVar != null) {
                    long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
                    try {
                        try {
                            android.os.Parcel parcelFq = spcVar.fq(2, spcVar.fp());
                            android.accounts.Account account3 = (android.accounts.Account) defpackage.ijx.a(parcelFq, android.accounts.Account.CREATOR);
                            parcelFq.recycle();
                            android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (android.os.RemoteException unused) {
                            android.util.Log.w("AccountAccessor", "Remote account accessor probably died");
                            android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (java.lang.Throwable th) {
                        android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.j = account2;
        } else {
            this.g = iBinder;
            this.j = account;
        }
        this.h = scopeArr;
        this.i = bundle;
        this.k = featureArr;
        this.l = featureArr2;
        this.m = z;
        this.n = i4;
        this.o = z2;
        this.p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        defpackage.smf.a(this, parcel, i);
    }
}
