package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class z extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<z> CREATOR = new aa(0);

    /* renamed from: a, reason: collision with root package name */
    static final Scope[] f5105a = new Scope[0];

    /* renamed from: b, reason: collision with root package name */
    static final com.google.android.gms.common.f[] f5106b = new com.google.android.gms.common.f[0];

    /* renamed from: c, reason: collision with root package name */
    final int f5107c;

    /* renamed from: d, reason: collision with root package name */
    final int f5108d;

    /* renamed from: e, reason: collision with root package name */
    final int f5109e;

    /* renamed from: f, reason: collision with root package name */
    String f5110f;

    /* renamed from: g, reason: collision with root package name */
    IBinder f5111g;

    /* renamed from: h, reason: collision with root package name */
    Scope[] f5112h;

    /* renamed from: i, reason: collision with root package name */
    Bundle f5113i;

    /* renamed from: j, reason: collision with root package name */
    Account f5114j;

    /* renamed from: k, reason: collision with root package name */
    com.google.android.gms.common.f[] f5115k;

    /* renamed from: l, reason: collision with root package name */
    com.google.android.gms.common.f[] f5116l;
    boolean m;
    int n;
    boolean o;
    private String p;

    z(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, com.google.android.gms.common.f[] fVarArr, com.google.android.gms.common.f[] fVarArr2, boolean z, int i5, boolean z2, String str2) {
        scopeArr = scopeArr == null ? f5105a : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        fVarArr = fVarArr == null ? f5106b : fVarArr;
        fVarArr2 = fVarArr2 == null ? f5106b : fVarArr2;
        this.f5107c = i2;
        this.f5108d = i3;
        this.f5109e = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f5110f = "com.google.android.gms";
        } else {
            this.f5110f = str;
        }
        if (i2 < 2) {
            Account accountA = null;
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                ao aoVar = iInterfaceQueryLocalInterface instanceof ao ? (ao) iInterfaceQueryLocalInterface : new ao(iBinder);
                if (aoVar != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            accountA = aoVar.a();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                }
            }
            this.f5114j = accountA;
        } else {
            this.f5111g = iBinder;
            this.f5114j = account;
        }
        this.f5112h = scopeArr;
        this.f5113i = bundle;
        this.f5115k = fVarArr;
        this.f5116l = fVarArr2;
        this.m = z;
        this.n = i5;
        this.o = z2;
        this.p = str2;
    }

    public final String a() {
        return this.p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        aa.a(this, parcel, i2);
    }
}
