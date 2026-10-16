package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aa implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f4954a;

    public aa(int i2) {
        this.f4954a = i2;
    }

    static void a(z zVar, Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.g(parcel, 1, zVar.f5107c);
        bb.g(parcel, 2, zVar.f5108d);
        bb.g(parcel, 3, zVar.f5109e);
        bb.u(parcel, 4, zVar.f5110f);
        bb.q(parcel, 5, zVar.f5111g);
        bb.x(parcel, 6, zVar.f5112h, i2);
        bb.k(parcel, 7, zVar.f5113i);
        bb.t(parcel, 8, zVar.f5114j, i2);
        bb.x(parcel, 10, zVar.f5115k, i2);
        bb.x(parcel, 11, zVar.f5116l, i2);
        bb.f(parcel, 12, zVar.m);
        bb.g(parcel, 13, zVar.n);
        bb.f(parcel, 14, zVar.o);
        bb.u(parcel, 15, zVar.a());
        bb.e(parcel, iD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i2 = this.f4954a;
        int iD = 0;
        if (i2 == 0) {
            int iF = bb.F(parcel);
            int iD2 = 0;
            int iD3 = 0;
            int iD4 = 0;
            boolean zT = false;
            int iD5 = 0;
            boolean zT2 = false;
            String strN = null;
            IBinder iBinderI = null;
            Account account = null;
            String strN2 = null;
            Scope[] scopeArr = z.f5105a;
            Bundle bundle = new Bundle();
            com.google.android.gms.common.f[] fVarArr = z.f5106b;
            com.google.android.gms.common.f[] fVarArr2 = fVarArr;
            while (parcel.dataPosition() < iF) {
                int i3 = parcel.readInt();
                switch (bb.C(i3)) {
                    case 1:
                        iD2 = bb.D(parcel, i3);
                        break;
                    case 2:
                        iD3 = bb.D(parcel, i3);
                        break;
                    case 3:
                        iD4 = bb.D(parcel, i3);
                        break;
                    case 4:
                        strN = bb.N(parcel, i3);
                        break;
                    case 5:
                        iBinderI = bb.I(parcel, i3);
                        break;
                    case 6:
                        scopeArr = (Scope[]) bb.W(parcel, i3, Scope.CREATOR);
                        break;
                    case 7:
                        bundle = bb.H(parcel, i3);
                        break;
                    case 8:
                        account = (Account) bb.J(parcel, i3, Account.CREATOR);
                        break;
                    case 9:
                    default:
                        bb.S(parcel, i3);
                        break;
                    case 10:
                        fVarArr = (com.google.android.gms.common.f[]) bb.W(parcel, i3, com.google.android.gms.common.f.CREATOR);
                        break;
                    case 11:
                        fVarArr2 = (com.google.android.gms.common.f[]) bb.W(parcel, i3, com.google.android.gms.common.f.CREATOR);
                        break;
                    case 12:
                        zT = bb.T(parcel, i3);
                        break;
                    case 13:
                        iD5 = bb.D(parcel, i3);
                        break;
                    case 14:
                        zT2 = bb.T(parcel, i3);
                        break;
                    case 15:
                        strN2 = bb.N(parcel, i3);
                        break;
                }
            }
            bb.R(parcel, iF);
            return new z(iD2, iD3, iD4, strN, iBinderI, scopeArr, bundle, account, fVarArr, fVarArr2, zT, iD5, zT2, strN2);
        }
        if (i2 == 1) {
            int iF2 = bb.F(parcel);
            int iD6 = 0;
            Bundle bundleH = null;
            com.google.android.gms.common.f[] fVarArr3 = null;
            u uVar = null;
            v vVar = null;
            while (parcel.dataPosition() < iF2) {
                int i4 = parcel.readInt();
                int iC = bb.C(i4);
                if (iC == 1) {
                    bundleH = bb.H(parcel, i4);
                } else if (iC == 2) {
                    fVarArr3 = (com.google.android.gms.common.f[]) bb.W(parcel, i4, com.google.android.gms.common.f.CREATOR);
                } else if (iC == 3) {
                    iD6 = bb.D(parcel, i4);
                } else if (iC == 4) {
                    uVar = (u) bb.J(parcel, i4, u.CREATOR);
                } else if (iC != 5) {
                    bb.S(parcel, i4);
                } else {
                    vVar = (v) bb.J(parcel, i4, v.CREATOR);
                }
            }
            bb.R(parcel, iF2);
            return new t(bundleH, fVarArr3, iD6, uVar, vVar);
        }
        if (i2 == 2) {
            int iF3 = bb.F(parcel);
            Account account2 = null;
            GoogleSignInAccount googleSignInAccount = null;
            int iD7 = 0;
            while (parcel.dataPosition() < iF3) {
                int i5 = parcel.readInt();
                int iC2 = bb.C(i5);
                if (iC2 == 1) {
                    iD = bb.D(parcel, i5);
                } else if (iC2 == 2) {
                    account2 = (Account) bb.J(parcel, i5, Account.CREATOR);
                } else if (iC2 == 3) {
                    iD7 = bb.D(parcel, i5);
                } else if (iC2 != 4) {
                    bb.S(parcel, i5);
                } else {
                    googleSignInAccount = (GoogleSignInAccount) bb.J(parcel, i5, GoogleSignInAccount.CREATOR);
                }
            }
            bb.R(parcel, iF3);
            return new bd(iD, account2, iD7, googleSignInAccount);
        }
        int iF4 = bb.F(parcel);
        int iD8 = 0;
        boolean zT3 = false;
        boolean zT4 = false;
        IBinder iBinderI2 = null;
        com.google.android.gms.common.d dVar = null;
        while (parcel.dataPosition() < iF4) {
            int i6 = parcel.readInt();
            int iC3 = bb.C(i6);
            if (iC3 == 1) {
                iD8 = bb.D(parcel, i6);
            } else if (iC3 == 2) {
                iBinderI2 = bb.I(parcel, i6);
            } else if (iC3 == 3) {
                dVar = (com.google.android.gms.common.d) bb.J(parcel, i6, com.google.android.gms.common.d.CREATOR);
            } else if (iC3 == 4) {
                zT3 = bb.T(parcel, i6);
            } else if (iC3 != 5) {
                bb.S(parcel, i6);
            } else {
                zT4 = bb.T(parcel, i6);
            }
        }
        bb.R(parcel, iF4);
        return new be(iD8, iBinderI2, dVar, zT3, zT4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        int i3 = this.f4954a;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? new be[i2] : new bd[i2] : new t[i2] : new z[i2];
    }
}
