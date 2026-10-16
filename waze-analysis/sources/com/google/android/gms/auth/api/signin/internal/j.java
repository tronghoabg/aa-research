package com.google.android.gms.auth.api.signin.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.bb;
import com.google.android.gms.identitycredentials.CredentialInformation;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.r;
import com.google.android.gms.identitycredentials.s;
import com.google.android.gms.identitycredentials.t;
import com.google.android.gms.identitycredentials.u;
import com.google.android.gms.identitycredentials.v;
import com.google.android.gms.identitycredentials.w;
import com.google.android.gms.identitycredentials.x;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f4624a;

    public j(int i2) {
        this.f4624a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = 0;
        Bundle bundleH = null;
        com.google.android.gms.l.f[] fVarArr = null;
        Status status = null;
        String strN = null;
        PendingIntent pendingIntent = null;
        PendingIntent pendingIntent2 = null;
        Bundle bundleH2 = null;
        com.google.android.gms.identitycredentials.i iVar = null;
        ArrayList arrayListP = null;
        Bundle bundleH3 = null;
        Bundle bundleH4 = null;
        ArrayList arrayListP2 = null;
        switch (this.f4624a) {
            case 0:
                int iF = bb.F(parcel);
                int iD2 = 0;
                while (parcel.dataPosition() < iF) {
                    int i2 = parcel.readInt();
                    int iC = bb.C(i2);
                    if (iC == 1) {
                        iD = bb.D(parcel, i2);
                    } else if (iC == 2) {
                        iD2 = bb.D(parcel, i2);
                    } else if (iC != 3) {
                        bb.S(parcel, i2);
                    } else {
                        bundleH = bb.H(parcel, i2);
                    }
                }
                bb.R(parcel, iF);
                return new k(iD, iD2, bundleH);
            case 1:
                int iF2 = bb.F(parcel);
                int iD3 = 0;
                int iD4 = 0;
                int iD5 = 0;
                int iD6 = 0;
                String strN2 = null;
                while (parcel.dataPosition() < iF2) {
                    int i3 = parcel.readInt();
                    int iC2 = bb.C(i3);
                    if (iC2 == 1) {
                        strN2 = bb.N(parcel, i3);
                    } else if (iC2 == 2) {
                        iD3 = bb.D(parcel, i3);
                    } else if (iC2 == 3) {
                        iD4 = bb.D(parcel, i3);
                    } else if (iC2 == 4) {
                        iD5 = bb.D(parcel, i3);
                    } else if (iC2 != 5) {
                        bb.S(parcel, i3);
                    } else {
                        iD6 = bb.D(parcel, i3);
                    }
                }
                bb.R(parcel, iF2);
                return new CredentialInformation(strN2, iD3, iD4, iD5, iD6);
            case 2:
                int iF3 = bb.F(parcel);
                while (parcel.dataPosition() < iF3) {
                    int i4 = parcel.readInt();
                    if (bb.C(i4) != 1) {
                        bb.S(parcel, i4);
                    } else {
                        arrayListP2 = bb.P(parcel, i4, CredentialInformation.CREATOR);
                    }
                }
                bb.R(parcel, iF3);
                return new com.google.android.gms.identitycredentials.j(arrayListP2);
            case 3:
                int iF4 = bb.F(parcel);
                String strN3 = "";
                String strN4 = strN3;
                String strN5 = strN4;
                Bundle bundleH5 = null;
                Bundle bundleH6 = null;
                String strN6 = null;
                while (parcel.dataPosition() < iF4) {
                    int i5 = parcel.readInt();
                    switch (bb.C(i5)) {
                        case 1:
                            strN3 = bb.N(parcel, i5);
                            break;
                        case 2:
                            bundleH5 = bb.H(parcel, i5);
                            break;
                        case 3:
                            bundleH6 = bb.H(parcel, i5);
                            break;
                        case 4:
                            strN6 = bb.N(parcel, i5);
                            break;
                        case 5:
                            strN4 = bb.N(parcel, i5);
                            break;
                        case 6:
                            strN5 = bb.N(parcel, i5);
                            break;
                        default:
                            bb.S(parcel, i5);
                            break;
                    }
                }
                bb.R(parcel, iF4);
                return new com.google.android.gms.identitycredentials.k(strN3, bundleH5, bundleH6, strN6, strN4, strN5);
            case 4:
                int iF5 = bb.F(parcel);
                while (parcel.dataPosition() < iF5) {
                    int i6 = parcel.readInt();
                    if (bb.C(i6) != 1) {
                        bb.S(parcel, i6);
                    } else {
                        bundleH4 = bb.H(parcel, i6);
                    }
                }
                bb.R(parcel, iF5);
                return new com.google.android.gms.identitycredentials.l(bundleH4);
            case 5:
                int iF6 = bb.F(parcel);
                while (parcel.dataPosition() < iF6) {
                    int i7 = parcel.readInt();
                    if (bb.C(i7) != 1) {
                        bb.S(parcel, i7);
                    } else {
                        bundleH3 = bb.H(parcel, i7);
                    }
                }
                bb.R(parcel, iF6);
                return new com.google.android.gms.identitycredentials.m(bundleH3);
            case 6:
                int iF7 = bb.F(parcel);
                Bundle bundleH7 = null;
                String strN7 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iF7) {
                    int i8 = parcel.readInt();
                    int iC3 = bb.C(i8);
                    if (iC3 == 1) {
                        arrayListP = bb.P(parcel, i8, com.google.android.gms.identitycredentials.k.CREATOR);
                    } else if (iC3 == 2) {
                        bundleH7 = bb.H(parcel, i8);
                    } else if (iC3 == 3) {
                        strN7 = bb.N(parcel, i8);
                    } else if (iC3 != 4) {
                        bb.S(parcel, i8);
                    } else {
                        resultReceiver = (ResultReceiver) bb.J(parcel, i8, ResultReceiver.CREATOR);
                    }
                }
                bb.R(parcel, iF7);
                return new GetCredentialRequest(arrayListP, bundleH7, strN7, resultReceiver);
            case 7:
                int iF8 = bb.F(parcel);
                ArrayList arrayListP3 = null;
                while (parcel.dataPosition() < iF8) {
                    int i9 = parcel.readInt();
                    int iC4 = bb.C(i9);
                    if (iC4 == 1) {
                        iVar = (com.google.android.gms.identitycredentials.i) bb.J(parcel, i9, com.google.android.gms.identitycredentials.i.CREATOR);
                    } else if (iC4 != 2) {
                        bb.S(parcel, i9);
                    } else {
                        arrayListP3 = bb.P(parcel, i9, com.google.android.gms.identitycredentials.i.CREATOR);
                    }
                }
                bb.R(parcel, iF8);
                return new com.google.android.gms.identitycredentials.o(iVar, arrayListP3);
            case 8:
                int iF9 = bb.F(parcel);
                while (parcel.dataPosition() < iF9) {
                    int i10 = parcel.readInt();
                    if (bb.C(i10) != 1) {
                        bb.S(parcel, i10);
                    } else {
                        bundleH2 = bb.H(parcel, i10);
                    }
                }
                bb.R(parcel, iF9);
                return new com.google.android.gms.identitycredentials.q(bundleH2);
            case 9:
                int iF10 = bb.F(parcel);
                while (parcel.dataPosition() < iF10) {
                    int i11 = parcel.readInt();
                    if (bb.C(i11) != 1) {
                        bb.S(parcel, i11);
                    } else {
                        pendingIntent2 = (PendingIntent) bb.J(parcel, i11, PendingIntent.CREATOR);
                    }
                }
                bb.R(parcel, iF10);
                return new r(pendingIntent2);
            case 10:
                int iF11 = bb.F(parcel);
                while (parcel.dataPosition() < iF11) {
                    int i12 = parcel.readInt();
                    if (bb.C(i12) != 1) {
                        bb.S(parcel, i12);
                    } else {
                        pendingIntent = (PendingIntent) bb.J(parcel, i12, PendingIntent.CREATOR);
                    }
                }
                bb.R(parcel, iF11);
                return new s(pendingIntent);
            case 11:
                int iF12 = bb.F(parcel);
                while (parcel.dataPosition() < iF12) {
                    bb.S(parcel, parcel.readInt());
                }
                bb.R(parcel, iF12);
                return new t();
            case 12:
                int iF13 = bb.F(parcel);
                while (parcel.dataPosition() < iF13) {
                    bb.S(parcel, parcel.readInt());
                }
                bb.R(parcel, iF13);
                return new u();
            case 13:
                int iF14 = bb.F(parcel);
                while (parcel.dataPosition() < iF14) {
                    bb.S(parcel, parcel.readInt());
                }
                bb.R(parcel, iF14);
                return new v();
            case 14:
                int iF15 = bb.F(parcel);
                String strN8 = null;
                Bundle bundleH8 = null;
                while (parcel.dataPosition() < iF15) {
                    int i13 = parcel.readInt();
                    int iC5 = bb.C(i13);
                    if (iC5 == 1) {
                        strN = bb.N(parcel, i13);
                    } else if (iC5 == 2) {
                        strN8 = bb.N(parcel, i13);
                    } else if (iC5 != 3) {
                        bb.S(parcel, i13);
                    } else {
                        bundleH8 = bb.H(parcel, i13);
                    }
                }
                bb.R(parcel, iF15);
                return new w(strN, strN8, bundleH8);
            case 15:
                int iF16 = bb.F(parcel);
                while (parcel.dataPosition() < iF16) {
                    bb.S(parcel, parcel.readInt());
                }
                bb.R(parcel, iF16);
                return new x();
            case 16:
                int iF17 = bb.F(parcel);
                int iD7 = 0;
                String strN9 = null;
                String strN10 = null;
                String strN11 = null;
                ArrayList arrayListP4 = null;
                com.google.android.gms.k.b.a aVar = null;
                while (parcel.dataPosition() < iF17) {
                    int i14 = parcel.readInt();
                    int iC6 = bb.C(i14);
                    if (iC6 == 1) {
                        iD7 = bb.D(parcel, i14);
                    } else if (iC6 == 3) {
                        strN9 = bb.N(parcel, i14);
                    } else if (iC6 == 4) {
                        strN10 = bb.N(parcel, i14);
                    } else if (iC6 == 6) {
                        strN11 = bb.N(parcel, i14);
                    } else if (iC6 == 7) {
                        aVar = (com.google.android.gms.k.b.a) bb.J(parcel, i14, com.google.android.gms.k.b.a.CREATOR);
                    } else if (iC6 != 8) {
                        bb.S(parcel, i14);
                    } else {
                        arrayListP4 = bb.P(parcel, i14, com.google.android.gms.common.f.CREATOR);
                    }
                }
                bb.R(parcel, iF17);
                return new com.google.android.gms.k.b.a(iD7, strN9, strN10, strN11, arrayListP4, aVar);
            case 17:
                int iF18 = bb.F(parcel);
                com.google.android.gms.location.i iVar2 = null;
                while (parcel.dataPosition() < iF18) {
                    int i15 = parcel.readInt();
                    int iC7 = bb.C(i15);
                    if (iC7 == 1) {
                        status = (Status) bb.J(parcel, i15, Status.CREATOR);
                    } else if (iC7 != 2) {
                        bb.S(parcel, i15);
                    } else {
                        iVar2 = (com.google.android.gms.location.i) bb.J(parcel, i15, com.google.android.gms.location.i.CREATOR);
                    }
                }
                bb.R(parcel, iF18);
                return new com.google.android.gms.location.h(status, iVar2);
            case 18:
                int iF19 = bb.F(parcel);
                boolean zT = false;
                boolean zT2 = false;
                boolean zT3 = false;
                boolean zT4 = false;
                boolean zT5 = false;
                boolean zT6 = false;
                while (parcel.dataPosition() < iF19) {
                    int i16 = parcel.readInt();
                    switch (bb.C(i16)) {
                        case 1:
                            zT = bb.T(parcel, i16);
                            break;
                        case 2:
                            zT2 = bb.T(parcel, i16);
                            break;
                        case 3:
                            zT3 = bb.T(parcel, i16);
                            break;
                        case 4:
                            zT4 = bb.T(parcel, i16);
                            break;
                        case 5:
                            zT5 = bb.T(parcel, i16);
                            break;
                        case 6:
                            zT6 = bb.T(parcel, i16);
                            break;
                        default:
                            bb.S(parcel, i16);
                            break;
                    }
                }
                bb.R(parcel, iF19);
                return new com.google.android.gms.location.i(zT, zT2, zT3, zT4, zT5, zT6);
            case 19:
                int iF20 = bb.F(parcel);
                String[] strArrX = null;
                while (parcel.dataPosition() < iF20) {
                    int i17 = parcel.readInt();
                    int iC8 = bb.C(i17);
                    if (iC8 == 2) {
                        iD = bb.D(parcel, i17);
                    } else if (iC8 == 3) {
                        fVarArr = (com.google.android.gms.l.f[]) bb.W(parcel, i17, com.google.android.gms.l.f.CREATOR);
                    } else if (iC8 != 4) {
                        bb.S(parcel, i17);
                    } else {
                        strArrX = bb.X(parcel, i17);
                    }
                }
                bb.R(parcel, iF20);
                return new com.google.android.gms.l.a(iD, fVarArr, strArrX);
            default:
                int iF21 = bb.F(parcel);
                long jG = 0;
                boolean zT7 = false;
                String strN12 = null;
                String strN13 = null;
                com.google.android.gms.l.a[] aVarArr = null;
                byte[] bArrU = null;
                while (parcel.dataPosition() < iF21) {
                    int i18 = parcel.readInt();
                    switch (bb.C(i18)) {
                        case 2:
                            strN12 = bb.N(parcel, i18);
                            break;
                        case 3:
                            strN13 = bb.N(parcel, i18);
                            break;
                        case 4:
                            aVarArr = (com.google.android.gms.l.a[]) bb.W(parcel, i18, com.google.android.gms.l.a.CREATOR);
                            break;
                        case 5:
                            zT7 = bb.T(parcel, i18);
                            break;
                        case 6:
                            bArrU = bb.U(parcel, i18);
                            break;
                        case 7:
                            jG = bb.G(parcel, i18);
                            break;
                        default:
                            bb.S(parcel, i18);
                            break;
                    }
                }
                bb.R(parcel, iF21);
                return new com.google.android.gms.l.b(strN12, strN13, aVarArr, zT7, bArrU, jG);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        switch (this.f4624a) {
            case 0:
                return new k[i2];
            case 1:
                return new CredentialInformation[i2];
            case 2:
                return new com.google.android.gms.identitycredentials.j[i2];
            case 3:
                return new com.google.android.gms.identitycredentials.k[i2];
            case 4:
                return new com.google.android.gms.identitycredentials.l[i2];
            case 5:
                return new com.google.android.gms.identitycredentials.m[i2];
            case 6:
                return new GetCredentialRequest[i2];
            case 7:
                return new com.google.android.gms.identitycredentials.o[i2];
            case 8:
                return new com.google.android.gms.identitycredentials.q[i2];
            case 9:
                return new r[i2];
            case 10:
                return new s[i2];
            case 11:
                return new t[i2];
            case 12:
                return new u[i2];
            case 13:
                return new v[i2];
            case 14:
                return new w[i2];
            case 15:
                return new x[i2];
            case 16:
                return new com.google.android.gms.k.b.a[i2];
            case 17:
                return new com.google.android.gms.location.h[i2];
            case 18:
                return new com.google.android.gms.location.i[i2];
            case 19:
                return new com.google.android.gms.l.a[i2];
            default:
                return new com.google.android.gms.l.b[i2];
        }
    }
}
