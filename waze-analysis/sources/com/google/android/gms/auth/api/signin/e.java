package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.auth.api.signin.internal.k;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.bb;
import com.google.android.gms.fido.a.a.a.af;
import com.google.android.gms.fido.a.a.a.ah;
import com.google.android.gms.fido.a.a.a.ai;
import com.google.android.gms.fido.a.a.a.an;
import com.google.android.gms.fido.a.a.a.ao;
import com.google.android.gms.fido.a.a.a.ap;
import com.google.android.gms.fido.a.a.a.aq;
import com.google.android.gms.fido.a.a.a.at;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.identitycredentials.f;
import com.google.android.gms.identitycredentials.g;
import com.google.android.gms.identitycredentials.h;
import com.google.android.gms.identitycredentials.i;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f4606a;

    public e(int i2) {
        this.f4606a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean zT = false;
        GoogleSignInAccount googleSignInAccount = null;
        String strN = null;
        String strN2 = null;
        PendingIntent pendingIntent = null;
        byte[] bArrU = null;
        String strN3 = null;
        String strN4 = null;
        String strN5 = null;
        String strN6 = null;
        byte[][] bArrY = null;
        String strN7 = null;
        switch (this.f4606a) {
            case 0:
                int iF = bb.F(parcel);
                int iD = 0;
                boolean zT2 = false;
                boolean zT3 = false;
                boolean zT4 = false;
                ArrayList arrayListP = null;
                Account account = null;
                String strN8 = null;
                String strN9 = null;
                ArrayList arrayListP2 = null;
                String strN10 = null;
                while (parcel.dataPosition() < iF) {
                    int i2 = parcel.readInt();
                    switch (bb.C(i2)) {
                        case 1:
                            iD = bb.D(parcel, i2);
                            break;
                        case 2:
                            arrayListP = bb.P(parcel, i2, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) bb.J(parcel, i2, Account.CREATOR);
                            break;
                        case 4:
                            zT2 = bb.T(parcel, i2);
                            break;
                        case 5:
                            zT3 = bb.T(parcel, i2);
                            break;
                        case 6:
                            zT4 = bb.T(parcel, i2);
                            break;
                        case 7:
                            strN8 = bb.N(parcel, i2);
                            break;
                        case 8:
                            strN9 = bb.N(parcel, i2);
                            break;
                        case 9:
                            arrayListP2 = bb.P(parcel, i2, k.CREATOR);
                            break;
                        case 10:
                            strN10 = bb.N(parcel, i2);
                            break;
                        default:
                            bb.S(parcel, i2);
                            break;
                    }
                }
                bb.R(parcel, iF);
                return new GoogleSignInOptions(iD, arrayListP, account, zT2, zT3, zT4, strN8, strN9, arrayListP2, strN10);
            case 1:
                int iF2 = bb.F(parcel);
                long jG = 0;
                String strN11 = null;
                String strN12 = null;
                String strN13 = null;
                String strN14 = null;
                Uri uri = null;
                String strN15 = null;
                String strN16 = null;
                ArrayList arrayListP3 = null;
                String strN17 = null;
                String strN18 = null;
                while (parcel.dataPosition() < iF2) {
                    int i3 = parcel.readInt();
                    switch (bb.C(i3)) {
                        case 2:
                            strN11 = bb.N(parcel, i3);
                            break;
                        case 3:
                            strN12 = bb.N(parcel, i3);
                            break;
                        case 4:
                            strN13 = bb.N(parcel, i3);
                            break;
                        case 5:
                            strN14 = bb.N(parcel, i3);
                            break;
                        case 6:
                            uri = (Uri) bb.J(parcel, i3, Uri.CREATOR);
                            break;
                        case 7:
                            strN15 = bb.N(parcel, i3);
                            break;
                        case 8:
                            jG = bb.G(parcel, i3);
                            break;
                        case 9:
                            strN16 = bb.N(parcel, i3);
                            break;
                        case 10:
                            arrayListP3 = bb.P(parcel, i3, Scope.CREATOR);
                            break;
                        case 11:
                            strN17 = bb.N(parcel, i3);
                            break;
                        case 12:
                            strN18 = bb.N(parcel, i3);
                            break;
                        default:
                            bb.S(parcel, i3);
                            break;
                    }
                }
                bb.R(parcel, iF2);
                return new GoogleSignInAccount(strN11, strN12, strN13, strN14, uri, strN15, jG, strN16, arrayListP3, strN17, strN18);
            case 2:
                int iF3 = bb.F(parcel);
                String strN19 = "";
                String strN20 = "";
                while (parcel.dataPosition() < iF3) {
                    int i4 = parcel.readInt();
                    int iC = bb.C(i4);
                    if (iC == 4) {
                        strN19 = bb.N(parcel, i4);
                    } else if (iC == 7) {
                        googleSignInAccount = (GoogleSignInAccount) bb.J(parcel, i4, GoogleSignInAccount.CREATOR);
                    } else if (iC != 8) {
                        bb.S(parcel, i4);
                    } else {
                        strN20 = bb.N(parcel, i4);
                    }
                }
                bb.R(parcel, iF3);
                return new SignInAccount(strN19, googleSignInAccount, strN20);
            case 3:
                int iF4 = bb.F(parcel);
                while (parcel.dataPosition() < iF4) {
                    int i5 = parcel.readInt();
                    if (bb.C(i5) != 1) {
                        bb.S(parcel, i5);
                    } else {
                        strN7 = bb.N(parcel, i5);
                    }
                }
                bb.R(parcel, iF4);
                return new af(strN7);
            case 4:
                int iF5 = bb.F(parcel);
                while (parcel.dataPosition() < iF5) {
                    int i6 = parcel.readInt();
                    if (bb.C(i6) != 1) {
                        bb.S(parcel, i6);
                    } else {
                        zT = bb.T(parcel, i6);
                    }
                }
                bb.R(parcel, iF5);
                return new ah(zT);
            case 5:
                int iF6 = bb.F(parcel);
                while (parcel.dataPosition() < iF6) {
                    int i7 = parcel.readInt();
                    if (bb.C(i7) != 1) {
                        bb.S(parcel, i7);
                    } else {
                        bArrY = bb.Y(parcel, i7);
                    }
                }
                bb.R(parcel, iF6);
                return new ai(bArrY);
            case 6:
                int iF7 = bb.F(parcel);
                byte[] bArrU2 = null;
                ArrayList arrayListP4 = null;
                while (parcel.dataPosition() < iF7) {
                    int i8 = parcel.readInt();
                    int iC2 = bb.C(i8);
                    if (iC2 == 2) {
                        strN6 = bb.N(parcel, i8);
                    } else if (iC2 == 3) {
                        bArrU2 = bb.U(parcel, i8);
                    } else if (iC2 != 4) {
                        bb.S(parcel, i8);
                    } else {
                        arrayListP4 = bb.P(parcel, i8, Transport.CREATOR);
                    }
                }
                bb.R(parcel, iF7);
                return new an(strN6, bArrU2, arrayListP4);
            case 7:
                int iF8 = bb.F(parcel);
                while (parcel.dataPosition() < iF8) {
                    int i9 = parcel.readInt();
                    if (bb.C(i9) != 1) {
                        bb.S(parcel, i9);
                    } else {
                        strN5 = bb.N(parcel, i9);
                    }
                }
                bb.R(parcel, iF8);
                return new ao(strN5);
            case 8:
                int iF9 = bb.F(parcel);
                Integer numM = null;
                while (parcel.dataPosition() < iF9) {
                    int i10 = parcel.readInt();
                    int iC3 = bb.C(i10);
                    if (iC3 == 2) {
                        strN4 = bb.N(parcel, i10);
                    } else if (iC3 != 3) {
                        bb.S(parcel, i10);
                    } else {
                        numM = bb.M(parcel, i10);
                    }
                }
                bb.R(parcel, iF9);
                return new ap(strN4, numM.intValue());
            case 9:
                int iF10 = bb.F(parcel);
                String strN21 = null;
                String strN22 = null;
                while (parcel.dataPosition() < iF10) {
                    int i11 = parcel.readInt();
                    int iC4 = bb.C(i11);
                    if (iC4 == 2) {
                        strN3 = bb.N(parcel, i11);
                    } else if (iC4 == 3) {
                        strN21 = bb.N(parcel, i11);
                    } else if (iC4 != 4) {
                        bb.S(parcel, i11);
                    } else {
                        strN22 = bb.N(parcel, i11);
                    }
                }
                bb.R(parcel, iF10);
                return new aq(strN3, strN21, strN22);
            case 10:
                int iF11 = bb.F(parcel);
                String strN23 = null;
                String strN24 = null;
                String strN25 = null;
                while (parcel.dataPosition() < iF11) {
                    int i12 = parcel.readInt();
                    int iC5 = bb.C(i12);
                    if (iC5 == 2) {
                        bArrU = bb.U(parcel, i12);
                    } else if (iC5 == 3) {
                        strN23 = bb.N(parcel, i12);
                    } else if (iC5 == 4) {
                        strN24 = bb.N(parcel, i12);
                    } else if (iC5 != 5) {
                        bb.S(parcel, i12);
                    } else {
                        strN25 = bb.N(parcel, i12);
                    }
                }
                bb.R(parcel, iF11);
                return new at(bArrU, strN23, strN24, strN25);
            case 11:
                int iF12 = bb.F(parcel);
                while (parcel.dataPosition() < iF12) {
                    int i13 = parcel.readInt();
                    if (bb.C(i13) != 1) {
                        bb.S(parcel, i13);
                    } else {
                        zT = bb.T(parcel, i13);
                    }
                }
                bb.R(parcel, iF12);
                return new com.google.android.gms.fido.a.a.a.bb(zT);
            case 12:
                int iF13 = bb.F(parcel);
                while (parcel.dataPosition() < iF13) {
                    int i14 = parcel.readInt();
                    if (bb.C(i14) != 1) {
                        bb.S(parcel, i14);
                    } else {
                        zT = bb.T(parcel, i14);
                    }
                }
                bb.R(parcel, iF13);
                return new com.google.android.gms.identitycredentials.a(zT);
            case 13:
                int iF14 = bb.F(parcel);
                while (parcel.dataPosition() < iF14) {
                    bb.S(parcel, parcel.readInt());
                }
                bb.R(parcel, iF14);
                return new com.google.android.gms.identitycredentials.b();
            case 14:
                int iF15 = bb.F(parcel);
                while (parcel.dataPosition() < iF15) {
                    bb.S(parcel, parcel.readInt());
                }
                bb.R(parcel, iF15);
                return new com.google.android.gms.identitycredentials.c();
            case 15:
                int iF16 = bb.F(parcel);
                while (parcel.dataPosition() < iF16) {
                    int i15 = parcel.readInt();
                    if (bb.C(i15) != 1) {
                        bb.S(parcel, i15);
                    } else {
                        zT = bb.T(parcel, i15);
                    }
                }
                bb.R(parcel, iF16);
                return new com.google.android.gms.identitycredentials.d(zT);
            case 16:
                int iF17 = bb.F(parcel);
                while (parcel.dataPosition() < iF17) {
                    int i16 = parcel.readInt();
                    if (bb.C(i16) != 1) {
                        bb.S(parcel, i16);
                    } else {
                        zT = bb.T(parcel, i16);
                    }
                }
                bb.R(parcel, iF17);
                return new com.google.android.gms.identitycredentials.e(zT);
            case 17:
                int iF18 = bb.F(parcel);
                h hVar = null;
                while (parcel.dataPosition() < iF18) {
                    int i17 = parcel.readInt();
                    int iC6 = bb.C(i17);
                    if (iC6 == 1) {
                        pendingIntent = (PendingIntent) bb.J(parcel, i17, PendingIntent.CREATOR);
                    } else if (iC6 != 2) {
                        bb.S(parcel, i17);
                    } else {
                        hVar = (h) bb.J(parcel, i17, h.CREATOR);
                    }
                }
                bb.R(parcel, iF18);
                return new f(pendingIntent, hVar);
            case 18:
                int iF19 = bb.F(parcel);
                String strN26 = null;
                Bundle bundleH = null;
                Bundle bundleH2 = null;
                String strN27 = null;
                String strN28 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iF19) {
                    int i18 = parcel.readInt();
                    switch (bb.C(i18)) {
                        case 1:
                            strN26 = bb.N(parcel, i18);
                            break;
                        case 2:
                            bundleH = bb.H(parcel, i18);
                            break;
                        case 3:
                            bundleH2 = bb.H(parcel, i18);
                            break;
                        case 4:
                            strN27 = bb.N(parcel, i18);
                            break;
                        case 5:
                            strN28 = bb.N(parcel, i18);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) bb.J(parcel, i18, ResultReceiver.CREATOR);
                            break;
                        default:
                            bb.S(parcel, i18);
                            break;
                    }
                }
                bb.R(parcel, iF19);
                return new g(strN26, bundleH, bundleH2, strN27, strN28, resultReceiver);
            case 19:
                int iF20 = bb.F(parcel);
                Bundle bundleH3 = null;
                while (parcel.dataPosition() < iF20) {
                    int i19 = parcel.readInt();
                    int iC7 = bb.C(i19);
                    if (iC7 == 1) {
                        strN2 = bb.N(parcel, i19);
                    } else if (iC7 != 2) {
                        bb.S(parcel, i19);
                    } else {
                        bundleH3 = bb.H(parcel, i19);
                    }
                }
                bb.R(parcel, iF20);
                return new h(strN2, bundleH3);
            default:
                int iF21 = bb.F(parcel);
                Bundle bundleH4 = null;
                while (parcel.dataPosition() < iF21) {
                    int i20 = parcel.readInt();
                    int iC8 = bb.C(i20);
                    if (iC8 == 1) {
                        strN = bb.N(parcel, i20);
                    } else if (iC8 != 2) {
                        bb.S(parcel, i20);
                    } else {
                        bundleH4 = bb.H(parcel, i20);
                    }
                }
                bb.R(parcel, iF21);
                return new i(strN, bundleH4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        switch (this.f4606a) {
            case 0:
                return new GoogleSignInOptions[i2];
            case 1:
                return new GoogleSignInAccount[i2];
            case 2:
                return new SignInAccount[i2];
            case 3:
                return new af[i2];
            case 4:
                return new ah[i2];
            case 5:
                return new ai[i2];
            case 6:
                return new an[i2];
            case 7:
                return new ao[i2];
            case 8:
                return new ap[i2];
            case 9:
                return new aq[i2];
            case 10:
                return new at[i2];
            case 11:
                return new com.google.android.gms.fido.a.a.a.bb[i2];
            case 12:
                return new com.google.android.gms.identitycredentials.a[i2];
            case 13:
                return new com.google.android.gms.identitycredentials.b[i2];
            case 14:
                return new com.google.android.gms.identitycredentials.c[i2];
            case 15:
                return new com.google.android.gms.identitycredentials.d[i2];
            case 16:
                return new com.google.android.gms.identitycredentials.e[i2];
            case 17:
                return new f[i2];
            case 18:
                return new g[i2];
            case 19:
                return new h[i2];
            default:
                return new i[i2];
        }
    }
}
