package T6;

import U8.v0;
import W9.t;
import X6.i;
import X6.j;
import X6.k;
import X6.l;
import X6.m;
import X6.o;
import X6.p;
import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import f7.C2615b;
import java.util.ArrayList;
import java.util.HashSet;
import ka.AbstractC3256n;
import v7.C4329x;

/* loaded from: classes3.dex */
public final class f implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11767a;

    public /* synthetic */ f(int i5) {
        this.f11767a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11767a) {
            case 0:
                int iO0 = v0.o0(parcel);
                String strY = null;
                int iF0 = 0;
                int iF02 = 0;
                Account account = null;
                while (parcel.dataPosition() < iO0) {
                    int i5 = parcel.readInt();
                    char c10 = (char) i5;
                    if (c10 == 1) {
                        iF0 = v0.f0(i5, parcel);
                    } else if (c10 == 2) {
                        iF02 = v0.f0(i5, parcel);
                    } else if (c10 == 3) {
                        strY = v0.y(i5, parcel);
                    } else if (c10 != 4) {
                        v0.m0(i5, parcel);
                    } else {
                        account = (Account) v0.x(parcel, i5, Account.CREATOR);
                    }
                }
                v0.D(iO0, parcel);
                return new b(iF0, iF02, strY, account);
            case 1:
                int iO02 = v0.o0(parcel);
                ArrayList arrayListC = null;
                int iF03 = 0;
                while (parcel.dataPosition() < iO02) {
                    int i10 = parcel.readInt();
                    char c11 = (char) i10;
                    if (c11 == 1) {
                        iF03 = v0.f0(i10, parcel);
                    } else if (c11 != 2) {
                        v0.m0(i10, parcel);
                    } else {
                        arrayListC = v0.C(parcel, i10, a.CREATOR);
                    }
                }
                v0.D(iO02, parcel);
                return new c(arrayListC, iF03);
            case 2:
                int iO03 = v0.o0(parcel);
                String strY2 = null;
                Long lI0 = null;
                ArrayList arrayListA = null;
                String strY3 = null;
                int iF04 = 0;
                boolean Z10 = false;
                boolean Z11 = false;
                while (parcel.dataPosition() < iO03) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iF04 = v0.f0(i11, parcel);
                            break;
                        case 2:
                            strY2 = v0.y(i11, parcel);
                            break;
                        case 3:
                            lI0 = v0.i0(i11, parcel);
                            break;
                        case 4:
                            Z10 = v0.Z(i11, parcel);
                            break;
                        case 5:
                            Z11 = v0.Z(i11, parcel);
                            break;
                        case 6:
                            arrayListA = v0.A(i11, parcel);
                            break;
                        case 7:
                            strY3 = v0.y(i11, parcel);
                            break;
                        default:
                            v0.m0(i11, parcel);
                            break;
                    }
                }
                v0.D(iO03, parcel);
                return new TokenData(iF04, strY2, lI0, Z10, Z11, arrayListA, strY3);
            case 3:
                int iO04 = v0.o0(parcel);
                HashSet hashSet = new HashSet();
                int iF05 = 0;
                ArrayList arrayListC2 = null;
                W6.d dVar = null;
                int iF06 = 0;
                while (parcel.dataPosition() < iO04) {
                    int i12 = parcel.readInt();
                    char c12 = (char) i12;
                    if (c12 == 1) {
                        iF05 = v0.f0(i12, parcel);
                        hashSet.add(1);
                    } else if (c12 == 2) {
                        arrayListC2 = v0.C(parcel, i12, W6.e.CREATOR);
                        hashSet.add(2);
                    } else if (c12 == 3) {
                        iF06 = v0.f0(i12, parcel);
                        hashSet.add(3);
                    } else if (c12 != 4) {
                        v0.m0(i12, parcel);
                    } else {
                        dVar = (W6.d) v0.x(parcel, i12, W6.d.CREATOR);
                        hashSet.add(4);
                    }
                }
                if (parcel.dataPosition() == iO04) {
                    return new W6.b(hashSet, iF05, arrayListC2, iF06, dVar);
                }
                throw new C2615b(AbstractC3256n.g(iO04, "Overread allowed size end="), parcel);
            case 4:
                int iO05 = v0.o0(parcel);
                ArrayList arrayListA2 = null;
                ArrayList arrayListA3 = null;
                ArrayList arrayListA4 = null;
                ArrayList arrayListA5 = null;
                ArrayList arrayListA6 = null;
                int iF07 = 0;
                while (parcel.dataPosition() < iO05) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            iF07 = v0.f0(i13, parcel);
                            break;
                        case 2:
                            arrayListA2 = v0.A(i13, parcel);
                            break;
                        case 3:
                            arrayListA3 = v0.A(i13, parcel);
                            break;
                        case 4:
                            arrayListA4 = v0.A(i13, parcel);
                            break;
                        case 5:
                            arrayListA5 = v0.A(i13, parcel);
                            break;
                        case 6:
                            arrayListA6 = v0.A(i13, parcel);
                            break;
                        default:
                            v0.m0(i13, parcel);
                            break;
                    }
                }
                v0.D(iO05, parcel);
                return new W6.d(iF07, arrayListA2, arrayListA3, arrayListA4, arrayListA5, arrayListA6);
            case 5:
                int iO06 = v0.o0(parcel);
                HashSet hashSet2 = new HashSet();
                int iF08 = 0;
                W6.f fVar = null;
                String strY4 = null;
                String strY5 = null;
                String strY6 = null;
                while (parcel.dataPosition() < iO06) {
                    int i14 = parcel.readInt();
                    char c13 = (char) i14;
                    if (c13 == 1) {
                        iF08 = v0.f0(i14, parcel);
                        hashSet2.add(1);
                    } else if (c13 == 2) {
                        fVar = (W6.f) v0.x(parcel, i14, W6.f.CREATOR);
                        hashSet2.add(2);
                    } else if (c13 == 3) {
                        strY4 = v0.y(i14, parcel);
                        hashSet2.add(3);
                    } else if (c13 == 4) {
                        strY5 = v0.y(i14, parcel);
                        hashSet2.add(4);
                    } else if (c13 != 5) {
                        v0.m0(i14, parcel);
                    } else {
                        strY6 = v0.y(i14, parcel);
                        hashSet2.add(5);
                    }
                }
                if (parcel.dataPosition() == iO06) {
                    return new W6.e(hashSet2, iF08, fVar, strY4, strY5, strY6);
                }
                throw new C2615b(AbstractC3256n.g(iO06, "Overread allowed size end="), parcel);
            case 6:
                int iO07 = v0.o0(parcel);
                HashSet hashSet3 = new HashSet();
                int iF09 = 0;
                String strY7 = null;
                byte[] bArrR = null;
                PendingIntent pendingIntent = null;
                W6.a aVar = null;
                int iF010 = 0;
                while (parcel.dataPosition() < iO07) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            iF09 = v0.f0(i15, parcel);
                            hashSet3.add(1);
                            break;
                        case 2:
                            strY7 = v0.y(i15, parcel);
                            hashSet3.add(2);
                            break;
                        case 3:
                            iF010 = v0.f0(i15, parcel);
                            hashSet3.add(3);
                            break;
                        case 4:
                            bArrR = v0.r(i15, parcel);
                            hashSet3.add(4);
                            break;
                        case 5:
                            pendingIntent = (PendingIntent) v0.x(parcel, i15, PendingIntent.CREATOR);
                            hashSet3.add(5);
                            break;
                        case 6:
                            aVar = (W6.a) v0.x(parcel, i15, W6.a.CREATOR);
                            hashSet3.add(6);
                            break;
                        default:
                            v0.m0(i15, parcel);
                            break;
                    }
                }
                if (parcel.dataPosition() == iO07) {
                    return new W6.f(hashSet3, iF09, strY7, iF010, bArrR, pendingIntent, aVar);
                }
                throw new C2615b(AbstractC3256n.g(iO07, "Overread allowed size end="), parcel);
            case 7:
                int iO08 = v0.o0(parcel);
                int iF011 = 0;
                boolean Z12 = false;
                boolean Z13 = false;
                long jH0 = 0;
                while (parcel.dataPosition() < iO08) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 1) {
                        iF011 = v0.f0(i16, parcel);
                    } else if (c14 == 2) {
                        Z12 = v0.Z(i16, parcel);
                    } else if (c14 == 3) {
                        jH0 = v0.h0(i16, parcel);
                    } else if (c14 != 4) {
                        v0.m0(i16, parcel);
                    } else {
                        Z13 = v0.Z(i16, parcel);
                    }
                }
                v0.D(iO08, parcel);
                return new W6.a(iF011, Z12, Z13, jH0);
            case 8:
                int iO09 = v0.o0(parcel);
                Bundle bundleQ = null;
                while (parcel.dataPosition() < iO09) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 2) {
                        v0.m0(i17, parcel);
                    } else {
                        bundleQ = v0.q(i17, parcel);
                    }
                }
                v0.D(iO09, parcel);
                return new t(bundleQ);
            case 9:
                String string = parcel.readString();
                string.getClass();
                return new X5.a(parcel.readInt(), string);
            case 10:
                int iO010 = v0.o0(parcel);
                boolean Z14 = false;
                boolean Z15 = false;
                boolean Z16 = false;
                ArrayList arrayListC3 = null;
                String strY8 = null;
                Account account2 = null;
                String strY9 = null;
                String strY10 = null;
                while (parcel.dataPosition() < iO010) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            arrayListC3 = v0.C(parcel, i18, Scope.CREATOR);
                            break;
                        case 2:
                            strY8 = v0.y(i18, parcel);
                            break;
                        case 3:
                            Z14 = v0.Z(i18, parcel);
                            break;
                        case 4:
                            Z15 = v0.Z(i18, parcel);
                            break;
                        case 5:
                            account2 = (Account) v0.x(parcel, i18, Account.CREATOR);
                            break;
                        case 6:
                            strY9 = v0.y(i18, parcel);
                            break;
                        case 7:
                            strY10 = v0.y(i18, parcel);
                            break;
                        case '\b':
                            Z16 = v0.Z(i18, parcel);
                            break;
                        default:
                            v0.m0(i18, parcel);
                            break;
                    }
                }
                v0.D(iO010, parcel);
                return new AuthorizationRequest(arrayListC3, strY8, Z14, Z15, account2, strY9, strY10, Z16);
            case 11:
                int iO011 = v0.o0(parcel);
                String strY11 = null;
                String strY12 = null;
                String strY13 = null;
                ArrayList arrayListA7 = null;
                GoogleSignInAccount googleSignInAccount = null;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iO011) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            strY11 = v0.y(i19, parcel);
                            break;
                        case 2:
                            strY12 = v0.y(i19, parcel);
                            break;
                        case 3:
                            strY13 = v0.y(i19, parcel);
                            break;
                        case 4:
                            arrayListA7 = v0.A(i19, parcel);
                            break;
                        case 5:
                            googleSignInAccount = (GoogleSignInAccount) v0.x(parcel, i19, GoogleSignInAccount.CREATOR);
                            break;
                        case 6:
                            pendingIntent2 = (PendingIntent) v0.x(parcel, i19, PendingIntent.CREATOR);
                            break;
                        default:
                            v0.m0(i19, parcel);
                            break;
                    }
                }
                v0.D(iO011, parcel);
                return new X6.a(strY11, strY12, strY13, arrayListA7, googleSignInAccount, pendingIntent2);
            case 12:
                int iO012 = v0.o0(parcel);
                X6.e eVar = null;
                X6.b bVar = null;
                String strY14 = null;
                X6.d dVar2 = null;
                X6.c cVar = null;
                boolean Z17 = false;
                int iF012 = 0;
                while (parcel.dataPosition() < iO012) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            eVar = (X6.e) v0.x(parcel, i20, X6.e.CREATOR);
                            break;
                        case 2:
                            bVar = (X6.b) v0.x(parcel, i20, X6.b.CREATOR);
                            break;
                        case 3:
                            strY14 = v0.y(i20, parcel);
                            break;
                        case 4:
                            Z17 = v0.Z(i20, parcel);
                            break;
                        case 5:
                            iF012 = v0.f0(i20, parcel);
                            break;
                        case 6:
                            dVar2 = (X6.d) v0.x(parcel, i20, X6.d.CREATOR);
                            break;
                        case 7:
                            cVar = (X6.c) v0.x(parcel, i20, X6.c.CREATOR);
                            break;
                        default:
                            v0.m0(i20, parcel);
                            break;
                    }
                }
                v0.D(iO012, parcel);
                return new X6.f(eVar, bVar, strY14, Z17, iF012, dVar2, cVar);
            case 13:
                int iO013 = v0.o0(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < iO013) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        v0.m0(i21, parcel);
                    } else {
                        pendingIntent3 = (PendingIntent) v0.x(parcel, i21, PendingIntent.CREATOR);
                    }
                }
                v0.D(iO013, parcel);
                return new X6.g(pendingIntent3);
            case 14:
                int iO014 = v0.o0(parcel);
                int iF013 = 0;
                while (parcel.dataPosition() < iO014) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 1) {
                        v0.m0(i22, parcel);
                    } else {
                        iF013 = v0.f0(i22, parcel);
                    }
                }
                v0.D(iO014, parcel);
                return new i(iF013);
            case 15:
                int iO015 = v0.o0(parcel);
                boolean Z18 = false;
                int iF014 = 0;
                String strY15 = null;
                String strY16 = null;
                String strY17 = null;
                String strY18 = null;
                while (parcel.dataPosition() < iO015) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            strY15 = v0.y(i23, parcel);
                            break;
                        case 2:
                            strY16 = v0.y(i23, parcel);
                            break;
                        case 3:
                            strY17 = v0.y(i23, parcel);
                            break;
                        case 4:
                            strY18 = v0.y(i23, parcel);
                            break;
                        case 5:
                            Z18 = v0.Z(i23, parcel);
                            break;
                        case 6:
                            iF014 = v0.f0(i23, parcel);
                            break;
                        default:
                            v0.m0(i23, parcel);
                            break;
                    }
                }
                v0.D(iO015, parcel);
                return new j(Z18, strY15, strY16, strY17, strY18, iF014);
            case 16:
                int iO016 = v0.o0(parcel);
                boolean Z19 = false;
                boolean Z20 = false;
                boolean Z21 = false;
                String strY19 = null;
                String strY20 = null;
                String strY21 = null;
                ArrayList arrayListA8 = null;
                while (parcel.dataPosition() < iO016) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            Z19 = v0.Z(i24, parcel);
                            break;
                        case 2:
                            strY19 = v0.y(i24, parcel);
                            break;
                        case 3:
                            strY20 = v0.y(i24, parcel);
                            break;
                        case 4:
                            Z20 = v0.Z(i24, parcel);
                            break;
                        case 5:
                            strY21 = v0.y(i24, parcel);
                            break;
                        case 6:
                            arrayListA8 = v0.A(i24, parcel);
                            break;
                        case 7:
                            Z21 = v0.Z(i24, parcel);
                            break;
                        default:
                            v0.m0(i24, parcel);
                            break;
                    }
                }
                v0.D(iO016, parcel);
                return new X6.b(Z19, strY19, strY20, Z20, strY21, arrayListA8, Z21);
            case 17:
                int iO017 = v0.o0(parcel);
                String strY22 = null;
                boolean Z22 = false;
                while (parcel.dataPosition() < iO017) {
                    int i25 = parcel.readInt();
                    char c15 = (char) i25;
                    if (c15 == 1) {
                        Z22 = v0.Z(i25, parcel);
                    } else if (c15 != 2) {
                        v0.m0(i25, parcel);
                    } else {
                        strY22 = v0.y(i25, parcel);
                    }
                }
                v0.D(iO017, parcel);
                return new X6.c(Z22, strY22);
            case 18:
                int iO018 = v0.o0(parcel);
                byte[] bArrR2 = null;
                boolean Z23 = false;
                String strY23 = null;
                while (parcel.dataPosition() < iO018) {
                    int i26 = parcel.readInt();
                    char c16 = (char) i26;
                    if (c16 == 1) {
                        Z23 = v0.Z(i26, parcel);
                    } else if (c16 == 2) {
                        bArrR2 = v0.r(i26, parcel);
                    } else if (c16 != 3) {
                        v0.m0(i26, parcel);
                    } else {
                        strY23 = v0.y(i26, parcel);
                    }
                }
                v0.D(iO018, parcel);
                return new X6.d(bArrR2, strY23, Z23);
            case 19:
                int iO019 = v0.o0(parcel);
                boolean Z24 = false;
                while (parcel.dataPosition() < iO019) {
                    int i27 = parcel.readInt();
                    if (((char) i27) != 1) {
                        v0.m0(i27, parcel);
                    } else {
                        Z24 = v0.Z(i27, parcel);
                    }
                }
                v0.D(iO019, parcel);
                return new X6.e(Z24);
            case 20:
                int iO020 = v0.o0(parcel);
                int iF015 = 0;
                PendingIntent pendingIntent4 = null;
                String strY24 = null;
                String strY25 = null;
                ArrayList arrayListA9 = null;
                String strY26 = null;
                while (parcel.dataPosition() < iO020) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 1:
                            pendingIntent4 = (PendingIntent) v0.x(parcel, i28, PendingIntent.CREATOR);
                            break;
                        case 2:
                            strY24 = v0.y(i28, parcel);
                            break;
                        case 3:
                            strY25 = v0.y(i28, parcel);
                            break;
                        case 4:
                            arrayListA9 = v0.A(i28, parcel);
                            break;
                        case 5:
                            strY26 = v0.y(i28, parcel);
                            break;
                        case 6:
                            iF015 = v0.f0(i28, parcel);
                            break;
                        default:
                            v0.m0(i28, parcel);
                            break;
                    }
                }
                v0.D(iO020, parcel);
                return new SaveAccountLinkingTokenRequest(pendingIntent4, strY24, strY25, arrayListA9, strY26, iF015);
            case 21:
                int iO021 = v0.o0(parcel);
                PendingIntent pendingIntent5 = null;
                while (parcel.dataPosition() < iO021) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 1) {
                        v0.m0(i29, parcel);
                    } else {
                        pendingIntent5 = (PendingIntent) v0.x(parcel, i29, PendingIntent.CREATOR);
                    }
                }
                v0.D(iO021, parcel);
                return new k(pendingIntent5);
            case 22:
                int iO022 = v0.o0(parcel);
                int iF016 = 0;
                p pVar = null;
                String strY27 = null;
                while (parcel.dataPosition() < iO022) {
                    int i30 = parcel.readInt();
                    char c17 = (char) i30;
                    if (c17 == 1) {
                        pVar = (p) v0.x(parcel, i30, p.CREATOR);
                    } else if (c17 == 2) {
                        strY27 = v0.y(i30, parcel);
                    } else if (c17 != 3) {
                        v0.m0(i30, parcel);
                    } else {
                        iF016 = v0.f0(i30, parcel);
                    }
                }
                v0.D(iO022, parcel);
                return new l(pVar, strY27, iF016);
            case 23:
                int iO023 = v0.o0(parcel);
                PendingIntent pendingIntent6 = null;
                while (parcel.dataPosition() < iO023) {
                    int i31 = parcel.readInt();
                    if (((char) i31) != 1) {
                        v0.m0(i31, parcel);
                    } else {
                        pendingIntent6 = (PendingIntent) v0.x(parcel, i31, PendingIntent.CREATOR);
                    }
                }
                v0.D(iO023, parcel);
                return new m(pendingIntent6);
            case 24:
                int iO024 = v0.o0(parcel);
                String strY28 = null;
                String strY29 = null;
                String strY30 = null;
                String strY31 = null;
                Uri uri = null;
                String strY32 = null;
                String strY33 = null;
                String strY34 = null;
                C4329x c4329x = null;
                while (parcel.dataPosition() < iO024) {
                    int i32 = parcel.readInt();
                    switch ((char) i32) {
                        case 1:
                            strY28 = v0.y(i32, parcel);
                            break;
                        case 2:
                            strY29 = v0.y(i32, parcel);
                            break;
                        case 3:
                            strY30 = v0.y(i32, parcel);
                            break;
                        case 4:
                            strY31 = v0.y(i32, parcel);
                            break;
                        case 5:
                            uri = (Uri) v0.x(parcel, i32, Uri.CREATOR);
                            break;
                        case 6:
                            strY32 = v0.y(i32, parcel);
                            break;
                        case 7:
                            strY33 = v0.y(i32, parcel);
                            break;
                        case '\b':
                            strY34 = v0.y(i32, parcel);
                            break;
                        case '\t':
                            c4329x = (C4329x) v0.x(parcel, i32, C4329x.CREATOR);
                            break;
                        default:
                            v0.m0(i32, parcel);
                            break;
                    }
                }
                v0.D(iO024, parcel);
                return new o(strY28, strY29, strY30, strY31, uri, strY32, strY33, strY34, c4329x);
            case 25:
                int iO025 = v0.o0(parcel);
                String strY35 = null;
                String strY36 = null;
                while (parcel.dataPosition() < iO025) {
                    int i33 = parcel.readInt();
                    char c18 = (char) i33;
                    if (c18 == 1) {
                        strY35 = v0.y(i33, parcel);
                    } else if (c18 != 2) {
                        v0.m0(i33, parcel);
                    } else {
                        strY36 = v0.y(i33, parcel);
                    }
                }
                v0.D(iO025, parcel);
                return new p(strY35, strY36);
            case 26:
                return new Y5.a(parcel);
            case 27:
                return new Z5.a(parcel);
            case 28:
                return new Z5.b(parcel);
            default:
                int iO026 = v0.o0(parcel);
                String strY37 = null;
                byte[] bArrR3 = null;
                Bundle bundleQ2 = null;
                long jH02 = 0;
                int iF017 = 0;
                int iF018 = 0;
                while (parcel.dataPosition() < iO026) {
                    int i34 = parcel.readInt();
                    char c19 = (char) i34;
                    if (c19 == 1) {
                        strY37 = v0.y(i34, parcel);
                    } else if (c19 == 2) {
                        iF018 = v0.f0(i34, parcel);
                    } else if (c19 == 3) {
                        jH02 = v0.h0(i34, parcel);
                    } else if (c19 == 4) {
                        bArrR3 = v0.r(i34, parcel);
                    } else if (c19 == 5) {
                        bundleQ2 = v0.q(i34, parcel);
                    } else if (c19 != 1000) {
                        v0.m0(i34, parcel);
                    } else {
                        iF017 = v0.f0(i34, parcel);
                    }
                }
                v0.D(iO026, parcel);
                return new Z6.a(iF017, strY37, iF018, jH02, bArrR3, bundleQ2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f11767a) {
            case 0:
                return new b[i5];
            case 1:
                return new c[i5];
            case 2:
                return new TokenData[i5];
            case 3:
                return new W6.b[i5];
            case 4:
                return new W6.d[i5];
            case 5:
                return new W6.e[i5];
            case 6:
                return new W6.f[i5];
            case 7:
                return new W6.a[i5];
            case 8:
                return new t[i5];
            case 9:
                return new X5.a[i5];
            case 10:
                return new AuthorizationRequest[i5];
            case 11:
                return new X6.a[i5];
            case 12:
                return new X6.f[i5];
            case 13:
                return new X6.g[i5];
            case 14:
                return new i[i5];
            case 15:
                return new j[i5];
            case 16:
                return new X6.b[i5];
            case 17:
                return new X6.c[i5];
            case 18:
                return new X6.d[i5];
            case 19:
                return new X6.e[i5];
            case 20:
                return new SaveAccountLinkingTokenRequest[i5];
            case 21:
                return new k[i5];
            case 22:
                return new l[i5];
            case 23:
                return new m[i5];
            case 24:
                return new o[i5];
            case 25:
                return new p[i5];
            case 26:
                return new Y5.a[i5];
            case 27:
                return new Z5.a[i5];
            case 28:
                return new Z5.b[i5];
            default:
                return new Z6.a[i5];
        }
    }
}
