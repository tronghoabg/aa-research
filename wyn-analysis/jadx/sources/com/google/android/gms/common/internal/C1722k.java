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
import c6.C1559a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.common.zzc;
import f7.AbstractC2614a;

/* renamed from: com.google.android.gms.common.internal.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1722k extends AbstractC2614a {
    public static final Parcelable.Creator<C1722k> CREATOR = new C1559a(13);

    /* renamed from: o, reason: collision with root package name */
    public static final Scope[] f26658o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    public static final d7.d[] f26659p = new d7.d[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f26660a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26661b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26662c;

    /* renamed from: d, reason: collision with root package name */
    public String f26663d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f26664e;

    /* renamed from: f, reason: collision with root package name */
    public Scope[] f26665f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f26666g;

    /* renamed from: h, reason: collision with root package name */
    public Account f26667h;

    /* renamed from: i, reason: collision with root package name */
    public d7.d[] f26668i;

    /* renamed from: j, reason: collision with root package name */
    public d7.d[] f26669j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final int f26670l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26671m;

    /* renamed from: n, reason: collision with root package name */
    public final String f26672n;

    public C1722k(int i5, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d7.d[] dVarArr, d7.d[] dVarArr2, boolean z2, int i12, boolean z10, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f26658o : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        d7.d[] dVarArr3 = f26659p;
        d7.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f26660a = i5;
        this.f26661b = i10;
        this.f26662c = i11;
        if ("com.google.android.gms".equals(str)) {
            this.f26663d = "com.google.android.gms";
        } else {
            this.f26663d = str;
        }
        if (i5 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = AbstractBinderC1712a.f26639a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface z11 = iInterfaceQueryLocalInterface instanceof InterfaceC1726o ? (InterfaceC1726o) iInterfaceQueryLocalInterface : new Z(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                if (z11 != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            Z z12 = (Z) z11;
                            Parcel parcelZzB = z12.zzB(2, z12.zza());
                            Account account3 = (Account) zzc.zzb(parcelZzB, Account.CREATOR);
                            parcelZzB.recycle();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f26667h = account2;
        } else {
            this.f26664e = iBinder;
            this.f26667h = account;
        }
        this.f26665f = scopeArr2;
        this.f26666g = bundle2;
        this.f26668i = dVarArr4;
        this.f26669j = dVarArr3;
        this.k = z2;
        this.f26670l = i12;
        this.f26671m = z10;
        this.f26672n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        C1559a.a(this, parcel, i5);
    }
}
