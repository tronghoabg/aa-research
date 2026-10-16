package com.google.android.gms.a.b.b;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.auth.a.b.c;
import com.google.android.gms.auth.a.b.e;
import com.google.android.gms.auth.api.identity.d;
import com.google.android.gms.auth.api.identity.o;
import com.google.android.gms.auth.api.identity.p;
import com.google.android.gms.auth.api.identity.v;
import com.google.android.gms.auth.api.identity.y;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.f;
import com.google.android.gms.common.internal.az;
import com.google.android.gms.common.internal.bb;
import com.google.android.gms.common.internal.bg;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.u;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f4397a;

    public b(int i2) {
        this.f4397a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = 0;
        int iD2 = 0;
        boolean zT = false;
        String strN = null;
        ArrayList arrayListP = null;
        String strN2 = null;
        Intent intent = null;
        Bundle bundleH = null;
        Bundle bundleH2 = null;
        Bundle bundleH3 = null;
        Bundle bundleH4 = null;
        Bundle bundleH5 = null;
        String strN3 = null;
        String strN4 = null;
        PendingIntent pendingIntent = null;
        String strN5 = null;
        PendingIntent pendingIntent2 = null;
        String strN6 = null;
        switch (this.f4397a) {
            case 0:
                int iF = bb.F(parcel);
                while (parcel.dataPosition() < iF) {
                    int i2 = parcel.readInt();
                    int iC = bb.C(i2);
                    if (iC == 1) {
                        strN = bb.N(parcel, i2);
                    } else if (iC != 2) {
                        bb.S(parcel, i2);
                    } else {
                        iD = bb.D(parcel, i2);
                    }
                }
                bb.R(parcel, iF);
                return new a(strN, iD);
            case 1:
                int iF2 = bb.F(parcel);
                while (parcel.dataPosition() < iF2) {
                    int i3 = parcel.readInt();
                    if (bb.C(i3) != 1) {
                        bb.S(parcel, i3);
                    } else {
                        strN6 = bb.N(parcel, i3);
                    }
                }
                bb.R(parcel, iF2);
                return new com.google.android.gms.a.b.a.a(strN6);
            case 2:
                int iF3 = bb.F(parcel);
                String strN7 = null;
                String strN8 = null;
                String strN9 = null;
                ArrayList arrayListO = null;
                GoogleSignInAccount googleSignInAccount = null;
                PendingIntent pendingIntent3 = null;
                Bundle bundleH6 = null;
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
                            arrayListO = bb.O(parcel, i4);
                            break;
                        case 5:
                            googleSignInAccount = (GoogleSignInAccount) bb.J(parcel, i4, GoogleSignInAccount.CREATOR);
                            break;
                        case 6:
                            pendingIntent3 = (PendingIntent) bb.J(parcel, i4, PendingIntent.CREATOR);
                            break;
                        case 7:
                            bundleH6 = bb.H(parcel, i4);
                            break;
                        default:
                            bb.S(parcel, i4);
                            break;
                    }
                }
                bb.R(parcel, iF3);
                return new d(strN7, strN8, strN9, arrayListO, googleSignInAccount, pendingIntent3, bundleH6);
            case 3:
                int iF4 = bb.F(parcel);
                while (parcel.dataPosition() < iF4) {
                    int i5 = parcel.readInt();
                    if (bb.C(i5) != 1) {
                        bb.S(parcel, i5);
                    } else {
                        pendingIntent2 = (PendingIntent) bb.J(parcel, i5, PendingIntent.CREATOR);
                    }
                }
                bb.R(parcel, iF4);
                return new o(pendingIntent2);
            case 4:
                int iF5 = bb.F(parcel);
                while (parcel.dataPosition() < iF5) {
                    int i6 = parcel.readInt();
                    int iC2 = bb.C(i6);
                    if (iC2 == 1) {
                        strN5 = bb.N(parcel, i6);
                    } else if (iC2 != 2) {
                        bb.S(parcel, i6);
                    } else {
                        zT = bb.T(parcel, i6);
                    }
                }
                bb.R(parcel, iF5);
                return new p(strN5, zT);
            case 5:
                int iF6 = bb.F(parcel);
                while (parcel.dataPosition() < iF6) {
                    int i7 = parcel.readInt();
                    if (bb.C(i7) != 1) {
                        bb.S(parcel, i7);
                    } else {
                        pendingIntent = (PendingIntent) bb.J(parcel, i7, PendingIntent.CREATOR);
                    }
                }
                bb.R(parcel, iF6);
                return new v(pendingIntent);
            case 6:
                int iF7 = bb.F(parcel);
                String strN10 = null;
                while (parcel.dataPosition() < iF7) {
                    int i8 = parcel.readInt();
                    int iC3 = bb.C(i8);
                    if (iC3 == 1) {
                        strN4 = bb.N(parcel, i8);
                    } else if (iC3 != 2) {
                        bb.S(parcel, i8);
                    } else {
                        strN10 = bb.N(parcel, i8);
                    }
                }
                bb.R(parcel, iF7);
                return new y(strN4, strN10);
            case 7:
                int iF8 = bb.F(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iF8) {
                    int i9 = parcel.readInt();
                    int iC4 = bb.C(i9);
                    if (iC4 == 2) {
                        strN3 = bb.N(parcel, i9);
                    } else if (iC4 != 5) {
                        bb.S(parcel, i9);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) bb.J(parcel, i9, GoogleSignInOptions.CREATOR);
                    }
                }
                bb.R(parcel, iF8);
                return new SignInConfiguration(strN3, googleSignInOptions);
            case 8:
                int iF9 = bb.F(parcel);
                while (parcel.dataPosition() < iF9) {
                    int i10 = parcel.readInt();
                    if (bb.C(i10) != 1) {
                        bb.S(parcel, i10);
                    } else {
                        bundleH5 = bb.H(parcel, i10);
                    }
                }
                bb.R(parcel, iF9);
                return new com.google.android.gms.auth.a.b.a(bundleH5);
            case 9:
                int iF10 = bb.F(parcel);
                while (parcel.dataPosition() < iF10) {
                    int i11 = parcel.readInt();
                    if (bb.C(i11) != 1) {
                        bb.S(parcel, i11);
                    } else {
                        bundleH4 = bb.H(parcel, i11);
                    }
                }
                bb.R(parcel, iF10);
                return new com.google.android.gms.auth.a.b.b(bundleH4);
            case 10:
                int iF11 = bb.F(parcel);
                while (parcel.dataPosition() < iF11) {
                    int i12 = parcel.readInt();
                    if (bb.C(i12) != 1) {
                        bb.S(parcel, i12);
                    } else {
                        bundleH3 = bb.H(parcel, i12);
                    }
                }
                bb.R(parcel, iF11);
                return new c(bundleH3);
            case 11:
                int iF12 = bb.F(parcel);
                while (parcel.dataPosition() < iF12) {
                    int i13 = parcel.readInt();
                    if (bb.C(i13) != 1) {
                        bb.S(parcel, i13);
                    } else {
                        bundleH2 = bb.H(parcel, i13);
                    }
                }
                bb.R(parcel, iF12);
                return new com.google.android.gms.auth.a.b.d(bundleH2);
            case 12:
                int iF13 = bb.F(parcel);
                while (parcel.dataPosition() < iF13) {
                    int i14 = parcel.readInt();
                    if (bb.C(i14) != 1) {
                        bb.S(parcel, i14);
                    } else {
                        bundleH = bb.H(parcel, i14);
                    }
                }
                bb.R(parcel, iF13);
                return new e(bundleH);
            case 13:
                int iF14 = bb.F(parcel);
                while (parcel.dataPosition() < iF14) {
                    int i15 = parcel.readInt();
                    if (bb.C(i15) != 1) {
                        bb.S(parcel, i15);
                    } else {
                        intent = (Intent) bb.J(parcel, i15, Intent.CREATOR);
                    }
                }
                bb.R(parcel, iF14);
                return new com.google.android.gms.f.a(intent);
            case 14:
                int iF15 = bb.F(parcel);
                long jG = -1;
                int iD3 = 0;
                boolean zT2 = false;
                String strN11 = null;
                while (parcel.dataPosition() < iF15) {
                    int i16 = parcel.readInt();
                    int iC5 = bb.C(i16);
                    if (iC5 == 1) {
                        strN11 = bb.N(parcel, i16);
                    } else if (iC5 == 2) {
                        iD3 = bb.D(parcel, i16);
                    } else if (iC5 == 3) {
                        jG = bb.G(parcel, i16);
                    } else if (iC5 != 4) {
                        bb.S(parcel, i16);
                    } else {
                        zT2 = bb.T(parcel, i16);
                    }
                }
                bb.R(parcel, iF15);
                return new f(strN11, iD3, jG, zT2);
            case 15:
                int iF16 = bb.F(parcel);
                long jG2 = 0;
                int iD4 = 0;
                int iD5 = 0;
                boolean zT3 = false;
                String strN12 = null;
                while (parcel.dataPosition() < iF16) {
                    int i17 = parcel.readInt();
                    int iC6 = bb.C(i17);
                    if (iC6 == 1) {
                        iD4 = bb.D(parcel, i17);
                    } else if (iC6 == 2) {
                        strN12 = bb.N(parcel, i17);
                    } else if (iC6 == 3) {
                        jG2 = bb.G(parcel, i17);
                    } else if (iC6 == 4) {
                        iD5 = bb.D(parcel, i17);
                    } else if (iC6 != 5) {
                        bb.S(parcel, i17);
                    } else {
                        zT3 = bb.T(parcel, i17);
                    }
                }
                bb.R(parcel, iF16);
                return new n(iD4, strN12, jG2, iD5, zT3);
            case 16:
                int iF17 = bb.F(parcel);
                int iD6 = 0;
                while (parcel.dataPosition() < iF17) {
                    int i18 = parcel.readInt();
                    int iC7 = bb.C(i18);
                    if (iC7 == 1) {
                        iD2 = bb.D(parcel, i18);
                    } else if (iC7 == 2) {
                        strN2 = bb.N(parcel, i18);
                    } else if (iC7 != 3) {
                        bb.S(parcel, i18);
                    } else {
                        iD6 = bb.D(parcel, i18);
                    }
                }
                bb.R(parcel, iF17);
                return new q(iD2, strN2, iD6);
            case 17:
                int iF18 = bb.F(parcel);
                while (parcel.dataPosition() < iF18) {
                    int i19 = parcel.readInt();
                    if (bb.C(i19) != 1) {
                        bb.S(parcel, i19);
                    } else {
                        arrayListP = bb.P(parcel, i19, q.CREATOR);
                    }
                }
                bb.R(parcel, iF18);
                return new r(arrayListP);
            case 18:
                int iF19 = bb.F(parcel);
                boolean zT4 = false;
                boolean zT5 = false;
                int iD7 = 0;
                bg bgVar = null;
                int[] iArrV = null;
                int[] iArrV2 = null;
                while (parcel.dataPosition() < iF19) {
                    int i20 = parcel.readInt();
                    switch (bb.C(i20)) {
                        case 1:
                            bgVar = (bg) bb.J(parcel, i20, bg.CREATOR);
                            break;
                        case 2:
                            zT4 = bb.T(parcel, i20);
                            break;
                        case 3:
                            zT5 = bb.T(parcel, i20);
                            break;
                        case 4:
                            iArrV = bb.V(parcel, i20);
                            break;
                        case 5:
                            iD7 = bb.D(parcel, i20);
                            break;
                        case 6:
                            iArrV2 = bb.V(parcel, i20);
                            break;
                        default:
                            bb.S(parcel, i20);
                            break;
                    }
                }
                bb.R(parcel, iF19);
                return new u(bgVar, zT4, zT5, iArrV, iD7, iArrV2);
            case 19:
                int iF20 = bb.F(parcel);
                while (true) {
                    SparseArray sparseArray = null;
                    while (parcel.dataPosition() < iF20) {
                        int i21 = parcel.readInt();
                        if (bb.C(i21) != 1) {
                            bb.S(parcel, i21);
                        } else {
                            Parcelable.Creator<com.google.android.gms.k.f.c> creator = com.google.android.gms.k.f.c.CREATOR;
                            int iE = bb.E(parcel, i21);
                            int iDataPosition = parcel.dataPosition();
                            if (iE == 0) {
                                break;
                            }
                            int i22 = parcel.readInt();
                            SparseArray sparseArray2 = new SparseArray();
                            for (int i23 = 0; i23 < i22; i23++) {
                                sparseArray2.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
                            }
                            parcel.setDataPosition(iDataPosition + iE);
                            sparseArray = sparseArray2;
                        }
                    }
                    bb.R(parcel, iF20);
                    return new com.google.android.gms.common.internal.v(sparseArray);
                    break;
                }
            default:
                int iF21 = bb.F(parcel);
                int iD8 = -1;
                long jG3 = 0;
                long jG4 = 0;
                int iD9 = 0;
                int iD10 = 0;
                int iD11 = 0;
                int iD12 = 0;
                String strN13 = null;
                String strN14 = null;
                while (parcel.dataPosition() < iF21) {
                    int i24 = parcel.readInt();
                    switch (bb.C(i24)) {
                        case 1:
                            iD9 = bb.D(parcel, i24);
                            break;
                        case 2:
                            iD10 = bb.D(parcel, i24);
                            break;
                        case 3:
                            iD11 = bb.D(parcel, i24);
                            break;
                        case 4:
                            jG3 = bb.G(parcel, i24);
                            break;
                        case 5:
                            jG4 = bb.G(parcel, i24);
                            break;
                        case 6:
                            strN13 = bb.N(parcel, i24);
                            break;
                        case 7:
                            strN14 = bb.N(parcel, i24);
                            break;
                        case 8:
                            iD12 = bb.D(parcel, i24);
                            break;
                        case 9:
                            iD8 = bb.D(parcel, i24);
                            break;
                        default:
                            bb.S(parcel, i24);
                            break;
                    }
                }
                bb.R(parcel, iF21);
                return new az(iD9, iD10, iD11, jG3, jG4, strN13, strN14, iD12, iD8);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        switch (this.f4397a) {
            case 0:
                return new a[i2];
            case 1:
                return new com.google.android.gms.a.b.a.a[i2];
            case 2:
                return new d[i2];
            case 3:
                return new o[i2];
            case 4:
                return new p[i2];
            case 5:
                return new v[i2];
            case 6:
                return new y[i2];
            case 7:
                return new SignInConfiguration[i2];
            case 8:
                return new com.google.android.gms.auth.a.b.a[i2];
            case 9:
                return new com.google.android.gms.auth.a.b.b[i2];
            case 10:
                return new c[i2];
            case 11:
                return new com.google.android.gms.auth.a.b.d[i2];
            case 12:
                return new e[i2];
            case 13:
                return new com.google.android.gms.f.a[i2];
            case 14:
                return new f[i2];
            case 15:
                return new n[i2];
            case 16:
                return new q[i2];
            case 17:
                return new r[i2];
            case 18:
                return new u[i2];
            case 19:
                return new com.google.android.gms.common.internal.v[i2];
            default:
                return new az[i2];
        }
    }
}
