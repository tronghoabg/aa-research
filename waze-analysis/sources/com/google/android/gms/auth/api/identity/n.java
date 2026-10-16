package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.az;
import com.google.android.gms.common.internal.bb;
import com.google.android.gms.common.internal.bg;
import com.google.android.gms.common.internal.bi;
import com.google.android.gms.fido.a.a.a.aa;
import com.google.android.gms.fido.a.a.a.ab;
import com.google.android.gms.fido.a.a.a.ac;
import com.google.android.gms.fido.a.a.a.ad;
import com.google.android.gms.fido.a.a.a.ae;
import com.google.android.gms.fido.a.a.a.aj;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f4534a;

    public n(int i2) {
        this.f4534a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean zT = false;
        boolean zT2 = false;
        boolean zT3 = false;
        boolean zT4 = false;
        boolean zT5 = false;
        boolean zT6 = false;
        int iD = 0;
        int iD2 = 0;
        boolean zT7 = false;
        boolean zT8 = false;
        String strN = null;
        String strN2 = null;
        ArrayList arrayListP = null;
        ArrayList arrayListP2 = null;
        y yVar = null;
        byte[] bArrU = null;
        switch (this.f4534a) {
            case 0:
                int iF = bb.F(parcel);
                boolean zT9 = false;
                int iD3 = 0;
                boolean zT10 = false;
                l lVar = null;
                f fVar = null;
                String strN3 = null;
                j jVar = null;
                h hVar = null;
                while (parcel.dataPosition() < iF) {
                    int i2 = parcel.readInt();
                    switch (bb.C(i2)) {
                        case 1:
                            lVar = (l) bb.J(parcel, i2, l.CREATOR);
                            break;
                        case 2:
                            fVar = (f) bb.J(parcel, i2, f.CREATOR);
                            break;
                        case 3:
                            strN3 = bb.N(parcel, i2);
                            break;
                        case 4:
                            zT9 = bb.T(parcel, i2);
                            break;
                        case 5:
                            iD3 = bb.D(parcel, i2);
                            break;
                        case 6:
                            jVar = (j) bb.J(parcel, i2, j.CREATOR);
                            break;
                        case 7:
                            hVar = (h) bb.J(parcel, i2, h.CREATOR);
                            break;
                        case 8:
                            zT10 = bb.T(parcel, i2);
                            break;
                        default:
                            bb.S(parcel, i2);
                            break;
                    }
                }
                bb.R(parcel, iF);
                return new m(lVar, fVar, strN3, zT9, iD3, jVar, hVar, zT10);
            case 1:
                int iF2 = bb.F(parcel);
                boolean zT11 = false;
                boolean zT12 = false;
                boolean zT13 = false;
                boolean zT14 = false;
                int iD4 = 0;
                ArrayList arrayListP3 = null;
                String strN4 = null;
                Account account = null;
                String strN5 = null;
                String strN6 = null;
                Bundle bundleH = null;
                while (parcel.dataPosition() < iF2) {
                    int i3 = parcel.readInt();
                    switch (bb.C(i3)) {
                        case 1:
                            arrayListP3 = bb.P(parcel, i3, Scope.CREATOR);
                            break;
                        case 2:
                            strN4 = bb.N(parcel, i3);
                            break;
                        case 3:
                            zT11 = bb.T(parcel, i3);
                            break;
                        case 4:
                            zT12 = bb.T(parcel, i3);
                            break;
                        case 5:
                            account = (Account) bb.J(parcel, i3, Account.CREATOR);
                            break;
                        case 6:
                            strN5 = bb.N(parcel, i3);
                            break;
                        case 7:
                            strN6 = bb.N(parcel, i3);
                            break;
                        case 8:
                            zT13 = bb.T(parcel, i3);
                            break;
                        case 9:
                            bundleH = bb.H(parcel, i3);
                            break;
                        case 10:
                            zT14 = bb.T(parcel, i3);
                            break;
                        case 11:
                            iD4 = bb.D(parcel, i3);
                            break;
                        default:
                            bb.S(parcel, i3);
                            break;
                    }
                }
                bb.R(parcel, iF2);
                return new AuthorizationRequest(arrayListP3, strN4, zT11, zT12, account, strN5, strN6, zT13, bundleH, zT14, iD4);
            case 2:
                int iF3 = bb.F(parcel);
                boolean zT15 = false;
                int iD5 = 0;
                String strN7 = null;
                String strN8 = null;
                String strN9 = null;
                String strN10 = null;
                ArrayList arrayListP4 = null;
                while (parcel.dataPosition() < iF3) {
                    int i4 = parcel.readInt();
                    switch (bb.C(i4)) {
                        case 1:
                            strN7 = bb.N(parcel, i4);
                            break;
                        case 2:
                            strN8 = bb.N(parcel, i4);
                            break;
                        case 3:
                            strN9 = bb.N(parcel, i4);
                            break;
                        case 4:
                            strN10 = bb.N(parcel, i4);
                            break;
                        case 5:
                            zT15 = bb.T(parcel, i4);
                            break;
                        case 6:
                            iD5 = bb.D(parcel, i4);
                            break;
                        case 7:
                            arrayListP4 = bb.P(parcel, i4, p.CREATOR);
                            break;
                        default:
                            bb.S(parcel, i4);
                            break;
                    }
                }
                bb.R(parcel, iF3);
                return new s(strN7, strN8, strN9, strN10, zT15, iD5, arrayListP4);
            case 3:
                int iF4 = bb.F(parcel);
                boolean zT16 = false;
                boolean zT17 = false;
                boolean zT18 = false;
                String strN11 = null;
                String strN12 = null;
                String strN13 = null;
                ArrayList arrayListO = null;
                ArrayList arrayListP5 = null;
                String strN14 = null;
                while (parcel.dataPosition() < iF4) {
                    int i5 = parcel.readInt();
                    switch (bb.C(i5)) {
                        case 1:
                            zT16 = bb.T(parcel, i5);
                            break;
                        case 2:
                            strN11 = bb.N(parcel, i5);
                            break;
                        case 3:
                            strN12 = bb.N(parcel, i5);
                            break;
                        case 4:
                            zT17 = bb.T(parcel, i5);
                            break;
                        case 5:
                            strN13 = bb.N(parcel, i5);
                            break;
                        case 6:
                            arrayListO = bb.O(parcel, i5);
                            break;
                        case 7:
                            zT18 = bb.T(parcel, i5);
                            break;
                        case 8:
                            arrayListP5 = bb.P(parcel, i5, p.CREATOR);
                            break;
                        case 9:
                            strN14 = bb.N(parcel, i5);
                            break;
                        default:
                            bb.S(parcel, i5);
                            break;
                    }
                }
                bb.R(parcel, iF4);
                return new f(zT16, strN11, strN12, zT17, strN13, arrayListO, zT18, arrayListP5, strN14);
            case 4:
                int iF5 = bb.F(parcel);
                while (parcel.dataPosition() < iF5) {
                    int i6 = parcel.readInt();
                    int iC = bb.C(i6);
                    if (iC == 1) {
                        zT = bb.T(parcel, i6);
                    } else if (iC != 2) {
                        bb.S(parcel, i6);
                    } else {
                        strN = bb.N(parcel, i6);
                    }
                }
                bb.R(parcel, iF5);
                return new h(zT, strN);
            case 5:
                int iF6 = bb.F(parcel);
                String strN15 = null;
                while (parcel.dataPosition() < iF6) {
                    int i7 = parcel.readInt();
                    int iC2 = bb.C(i7);
                    if (iC2 == 1) {
                        zT8 = bb.T(parcel, i7);
                    } else if (iC2 == 2) {
                        bArrU = bb.U(parcel, i7);
                    } else if (iC2 != 3) {
                        bb.S(parcel, i7);
                    } else {
                        strN15 = bb.N(parcel, i7);
                    }
                }
                bb.R(parcel, iF6);
                return new j(zT8, bArrU, strN15);
            case 6:
                int iF7 = bb.F(parcel);
                while (parcel.dataPosition() < iF7) {
                    int i8 = parcel.readInt();
                    if (bb.C(i8) != 1) {
                        bb.S(parcel, i8);
                    } else {
                        zT7 = bb.T(parcel, i8);
                    }
                }
                bb.R(parcel, iF7);
                return new l(zT7);
            case 7:
                int iF8 = bb.F(parcel);
                String strN16 = null;
                while (parcel.dataPosition() < iF8) {
                    int i9 = parcel.readInt();
                    int iC3 = bb.C(i9);
                    if (iC3 == 1) {
                        yVar = (y) bb.J(parcel, i9, y.CREATOR);
                    } else if (iC3 == 2) {
                        strN16 = bb.N(parcel, i9);
                    } else if (iC3 != 3) {
                        bb.S(parcel, i9);
                    } else {
                        iD2 = bb.D(parcel, i9);
                    }
                }
                bb.R(parcel, iF8);
                return new u(yVar, strN16, iD2);
            case 8:
                int iF9 = bb.F(parcel);
                String strN17 = null;
                String strN18 = null;
                String strN19 = null;
                String strN20 = null;
                Uri uri = null;
                String strN21 = null;
                String strN22 = null;
                String strN23 = null;
                aj ajVar = null;
                while (parcel.dataPosition() < iF9) {
                    int i10 = parcel.readInt();
                    switch (bb.C(i10)) {
                        case 1:
                            strN17 = bb.N(parcel, i10);
                            break;
                        case 2:
                            strN18 = bb.N(parcel, i10);
                            break;
                        case 3:
                            strN19 = bb.N(parcel, i10);
                            break;
                        case 4:
                            strN20 = bb.N(parcel, i10);
                            break;
                        case 5:
                            uri = (Uri) bb.J(parcel, i10, Uri.CREATOR);
                            break;
                        case 6:
                            strN21 = bb.N(parcel, i10);
                            break;
                        case 7:
                            strN22 = bb.N(parcel, i10);
                            break;
                        case 8:
                            strN23 = bb.N(parcel, i10);
                            break;
                        case 9:
                            ajVar = (aj) bb.J(parcel, i10, aj.CREATOR);
                            break;
                        default:
                            bb.S(parcel, i10);
                            break;
                    }
                }
                bb.R(parcel, iF9);
                return new w(strN17, strN18, strN19, strN20, uri, strN21, strN22, strN23, ajVar);
            case 9:
                int iF10 = bb.F(parcel);
                int iD6 = 0;
                boolean zT19 = false;
                boolean zT20 = false;
                int iD7 = 0;
                int iD8 = 0;
                while (parcel.dataPosition() < iF10) {
                    int i11 = parcel.readInt();
                    int iC4 = bb.C(i11);
                    if (iC4 == 1) {
                        iD6 = bb.D(parcel, i11);
                    } else if (iC4 == 2) {
                        zT19 = bb.T(parcel, i11);
                    } else if (iC4 == 3) {
                        zT20 = bb.T(parcel, i11);
                    } else if (iC4 == 4) {
                        iD7 = bb.D(parcel, i11);
                    } else if (iC4 != 5) {
                        bb.S(parcel, i11);
                    } else {
                        iD8 = bb.D(parcel, i11);
                    }
                }
                bb.R(parcel, iF10);
                return new bg(iD6, zT19, zT20, iD7, iD8);
            case 10:
                int iF11 = bb.F(parcel);
                while (parcel.dataPosition() < iF11) {
                    int i12 = parcel.readInt();
                    int iC5 = bb.C(i12);
                    if (iC5 == 1) {
                        iD = bb.D(parcel, i12);
                    } else if (iC5 != 2) {
                        bb.S(parcel, i12);
                    } else {
                        arrayListP2 = bb.P(parcel, i12, az.CREATOR);
                    }
                }
                bb.R(parcel, iF11);
                return new bi(iD, arrayListP2);
            case 11:
                int iF12 = bb.F(parcel);
                while (parcel.dataPosition() < iF12) {
                    int i13 = parcel.readInt();
                    if (bb.C(i13) != 1) {
                        bb.S(parcel, i13);
                    } else {
                        zT6 = bb.T(parcel, i13);
                    }
                }
                bb.R(parcel, iF12);
                return new com.google.android.gms.fido.a.a.a.k(zT6);
            case 12:
                int iF13 = bb.F(parcel);
                byte[] bArrU2 = null;
                byte[] bArrU3 = null;
                while (parcel.dataPosition() < iF13) {
                    int i14 = parcel.readInt();
                    int iC6 = bb.C(i14);
                    if (iC6 == 1) {
                        bArrU2 = bb.U(parcel, i14);
                    } else if (iC6 != 2) {
                        bb.S(parcel, i14);
                    } else {
                        bArrU3 = bb.U(parcel, i14);
                    }
                }
                bb.R(parcel, iF13);
                return new com.google.android.gms.fido.a.a.a.l(bArrU2 == null ? null : com.google.v.v.q(bArrU2), bArrU3 != null ? com.google.v.v.q(bArrU3) : null);
            case 13:
                int iF14 = bb.F(parcel);
                byte[] bArrU4 = null;
                while (parcel.dataPosition() < iF14) {
                    int i15 = parcel.readInt();
                    int iC7 = bb.C(i15);
                    if (iC7 == 1) {
                        zT5 = bb.T(parcel, i15);
                    } else if (iC7 != 2) {
                        bb.S(parcel, i15);
                    } else {
                        bArrU4 = bb.U(parcel, i15);
                    }
                }
                bb.R(parcel, iF14);
                return new com.google.android.gms.fido.a.a.a.m(zT5, bArrU4 != null ? com.google.v.v.q(bArrU4) : null);
            case 14:
                int iF15 = bb.F(parcel);
                while (parcel.dataPosition() < iF15) {
                    int i16 = parcel.readInt();
                    if (bb.C(i16) != 1) {
                        bb.S(parcel, i16);
                    } else {
                        arrayListP = bb.P(parcel, i16, com.google.android.gms.fido.a.a.a.u.CREATOR);
                    }
                }
                bb.R(parcel, iF15);
                return new com.google.android.gms.fido.a.a.a.v(arrayListP);
            case 15:
                int iF16 = bb.F(parcel);
                while (parcel.dataPosition() < iF16) {
                    int i17 = parcel.readInt();
                    if (bb.C(i17) != 1) {
                        bb.S(parcel, i17);
                    } else {
                        bb.T(parcel, i17);
                    }
                }
                bb.R(parcel, iF16);
                return new com.google.android.gms.fido.a.a.a.w();
            case 16:
                int iF17 = bb.F(parcel);
                while (parcel.dataPosition() < iF17) {
                    int i18 = parcel.readInt();
                    if (bb.C(i18) != 2) {
                        bb.S(parcel, i18);
                    } else {
                        strN2 = bb.N(parcel, i18);
                    }
                }
                bb.R(parcel, iF17);
                return new aa(strN2);
            case 17:
                int iF18 = bb.F(parcel);
                while (parcel.dataPosition() < iF18) {
                    int i19 = parcel.readInt();
                    if (bb.C(i19) != 1) {
                        bb.S(parcel, i19);
                    } else {
                        zT4 = bb.T(parcel, i19);
                    }
                }
                bb.R(parcel, iF18);
                return new ab(zT4);
            case 18:
                int iF19 = bb.F(parcel);
                long jG = 0;
                while (parcel.dataPosition() < iF19) {
                    int i20 = parcel.readInt();
                    if (bb.C(i20) != 1) {
                        bb.S(parcel, i20);
                    } else {
                        jG = bb.G(parcel, i20);
                    }
                }
                bb.R(parcel, iF19);
                return new ac(jG);
            case 19:
                int iF20 = bb.F(parcel);
                while (parcel.dataPosition() < iF20) {
                    int i21 = parcel.readInt();
                    if (bb.C(i21) != 1) {
                        bb.S(parcel, i21);
                    } else {
                        zT3 = bb.T(parcel, i21);
                    }
                }
                bb.R(parcel, iF20);
                return new ad(zT3);
            default:
                int iF21 = bb.F(parcel);
                while (parcel.dataPosition() < iF21) {
                    int i22 = parcel.readInt();
                    if (bb.C(i22) != 1) {
                        bb.S(parcel, i22);
                    } else {
                        zT2 = bb.T(parcel, i22);
                    }
                }
                bb.R(parcel, iF21);
                return new ae(zT2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        switch (this.f4534a) {
            case 0:
                return new m[i2];
            case 1:
                return new AuthorizationRequest[i2];
            case 2:
                return new s[i2];
            case 3:
                return new f[i2];
            case 4:
                return new h[i2];
            case 5:
                return new j[i2];
            case 6:
                return new l[i2];
            case 7:
                return new u[i2];
            case 8:
                return new w[i2];
            case 9:
                return new bg[i2];
            case 10:
                return new bi[i2];
            case 11:
                return new com.google.android.gms.fido.a.a.a.k[i2];
            case 12:
                return new com.google.android.gms.fido.a.a.a.l[i2];
            case 13:
                return new com.google.android.gms.fido.a.a.a.m[i2];
            case 14:
                return new com.google.android.gms.fido.a.a.a.v[i2];
            case 15:
                return new com.google.android.gms.fido.a.a.a.w[i2];
            case 16:
                return new aa[i2];
            case 17:
                return new ab[i2];
            case 18:
                return new ac[i2];
            case 19:
                return new ad[i2];
            default:
                return new ae[i2];
        }
    }
}
