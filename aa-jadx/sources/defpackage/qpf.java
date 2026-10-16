package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qpf implements android.os.Parcelable.Creator {
    private final /* synthetic */ int a;

    public qpf(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        boolean zAj = false;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        int iR5 = 0;
        com.google.android.gms.auth.aang.AppRestrictionState appRestrictionState = null;
        com.google.android.gms.car.CarPhoneStatus.CarCall[] carCallArr = null;
        java.lang.String strAb = null;
        java.util.ArrayList arrayListAf = null;
        java.lang.Long lAa = null;
        java.lang.String strAb2 = null;
        java.lang.String strAb3 = null;
        java.util.ArrayList arrayListAf2 = null;
        switch (this.a) {
            case 0:
                int iT = defpackage.sqs.T(parcel);
                java.lang.String strAb4 = null;
                java.lang.String strAb5 = null;
                java.lang.String strAb6 = null;
                java.lang.String strAb7 = null;
                byte[] bArrAk = null;
                while (parcel.dataPosition() < iT) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        strAb4 = defpackage.sqs.ab(parcel, i);
                    } else if (c == 3) {
                        strAb5 = defpackage.sqs.ab(parcel, i);
                    } else if (c == 4) {
                        strAb6 = defpackage.sqs.ab(parcel, i);
                    } else if (c == 5) {
                        strAb7 = defpackage.sqs.ab(parcel, i);
                    } else if (c != 6) {
                        defpackage.sqs.ai(parcel, i);
                    } else {
                        bArrAk = defpackage.sqs.ak(parcel, i);
                    }
                }
                defpackage.sqs.ag(parcel, iT);
                return new com.google.android.gms.auth.aang.AppRestrictionInfo(strAb4, strAb5, strAb6, strAb7, bArrAk);
            case 1:
                int iT2 = defpackage.sqs.T(parcel);
                com.google.android.gms.auth.aang.AppRestrictionInfo appRestrictionInfo = null;
                while (parcel.dataPosition() < iT2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        appRestrictionState = (com.google.android.gms.auth.aang.AppRestrictionState) defpackage.sqs.X(parcel, i2, com.google.android.gms.auth.aang.AppRestrictionState.CREATOR);
                    } else if (c2 != 2) {
                        defpackage.sqs.ai(parcel, i2);
                    } else {
                        appRestrictionInfo = (com.google.android.gms.auth.aang.AppRestrictionInfo) defpackage.sqs.X(parcel, i2, com.google.android.gms.auth.aang.AppRestrictionInfo.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT2);
                return new com.google.android.gms.auth.aang.AppRestriction(appRestrictionState, appRestrictionInfo);
            case 2:
                int iT3 = defpackage.sqs.T(parcel);
                boolean zAj2 = false;
                while (parcel.dataPosition() < iT3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        zAj = defpackage.sqs.aj(parcel, i3);
                    } else if (c3 != 2) {
                        defpackage.sqs.ai(parcel, i3);
                    } else {
                        zAj2 = defpackage.sqs.aj(parcel, i3);
                    }
                }
                defpackage.sqs.ag(parcel, iT3);
                return new com.google.android.gms.auth.aang.ErrorDetails(zAj, zAj2);
            case 3:
                int iT4 = defpackage.sqs.T(parcel);
                boolean zAj3 = false;
                boolean zAj4 = false;
                java.lang.String strAb8 = null;
                java.util.ArrayList arrayListAe = null;
                java.util.ArrayList arrayListAe2 = null;
                while (parcel.dataPosition() < iT4) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 1) {
                        strAb8 = defpackage.sqs.ab(parcel, i4);
                    } else if (c4 == 2) {
                        arrayListAe = defpackage.sqs.ae(parcel, i4);
                    } else if (c4 == 3) {
                        arrayListAe2 = defpackage.sqs.ae(parcel, i4);
                    } else if (c4 == 4) {
                        zAj3 = defpackage.sqs.aj(parcel, i4);
                    } else if (c4 != 5) {
                        defpackage.sqs.ai(parcel, i4);
                    } else {
                        zAj4 = defpackage.sqs.aj(parcel, i4);
                    }
                }
                defpackage.sqs.ag(parcel, iT4);
                return new com.google.android.gms.auth.aang.GetAccountsRequest(strAb8, arrayListAe, arrayListAe2, zAj3, zAj4);
            case 4:
                int iT5 = defpackage.sqs.T(parcel);
                java.util.ArrayList arrayListAf3 = null;
                while (parcel.dataPosition() < iT5) {
                    int i5 = parcel.readInt();
                    char c5 = (char) i5;
                    if (c5 == 1) {
                        arrayListAf2 = defpackage.sqs.af(parcel, i5, com.google.android.gms.auth.aang.GoogleAccount.CREATOR);
                    } else if (c5 != 2) {
                        defpackage.sqs.ai(parcel, i5);
                    } else {
                        arrayListAf3 = defpackage.sqs.af(parcel, i5, com.google.android.gms.auth.aang.AccountWithAppRestrictionState.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT5);
                return new com.google.android.gms.auth.aang.GetAccountsResponse(arrayListAf2, arrayListAf3);
            case 5:
                int iT6 = defpackage.sqs.T(parcel);
                int iR6 = 0;
                boolean zAj5 = false;
                boolean zAj6 = false;
                boolean zAj7 = false;
                int iR7 = 0;
                com.google.android.gms.auth.aang.GoogleAccount googleAccount = null;
                java.lang.String strAb9 = null;
                java.util.ArrayList arrayListAe3 = null;
                java.util.ArrayList arrayListAe4 = null;
                java.util.ArrayList arrayListAe5 = null;
                java.util.ArrayList arrayListAe6 = null;
                java.lang.String strAb10 = null;
                byte[] bArrAk2 = null;
                java.lang.String strAb11 = null;
                android.net.Network network = null;
                while (parcel.dataPosition() < iT6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            googleAccount = (com.google.android.gms.auth.aang.GoogleAccount) defpackage.sqs.X(parcel, i6, com.google.android.gms.auth.aang.GoogleAccount.CREATOR);
                            break;
                        case 2:
                            strAb9 = defpackage.sqs.ab(parcel, i6);
                            break;
                        case 3:
                            arrayListAe3 = defpackage.sqs.ae(parcel, i6);
                            break;
                        case 4:
                            arrayListAe4 = defpackage.sqs.ae(parcel, i6);
                            break;
                        case 5:
                            arrayListAe5 = defpackage.sqs.ae(parcel, i6);
                            break;
                        case 6:
                            arrayListAe6 = defpackage.sqs.ae(parcel, i6);
                            break;
                        case 7:
                            iR6 = defpackage.sqs.R(parcel, i6);
                            break;
                        case '\b':
                            strAb10 = defpackage.sqs.ab(parcel, i6);
                            break;
                        case '\t':
                            zAj5 = defpackage.sqs.aj(parcel, i6);
                            break;
                        case '\n':
                            bArrAk2 = defpackage.sqs.ak(parcel, i6);
                            break;
                        case 11:
                            strAb11 = defpackage.sqs.ab(parcel, i6);
                            break;
                        case '\f':
                            zAj6 = defpackage.sqs.aj(parcel, i6);
                            break;
                        case '\r':
                            network = (android.net.Network) defpackage.sqs.X(parcel, i6, android.net.Network.CREATOR);
                            break;
                        case 14:
                            zAj7 = defpackage.sqs.aj(parcel, i6);
                            break;
                        case 15:
                            iR7 = defpackage.sqs.R(parcel, i6);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i6);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT6);
                return new com.google.android.gms.auth.aang.GetTokenRequest(googleAccount, strAb9, arrayListAe3, arrayListAe4, arrayListAe5, arrayListAe6, iR6, strAb10, zAj5, bArrAk2, strAb11, zAj6, network, zAj7, iR7);
            case 6:
                int iT7 = defpackage.sqs.T(parcel);
                com.google.android.gms.auth.aang.Oauth2TokenMetadata oauth2TokenMetadata = null;
                while (parcel.dataPosition() < iT7) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 1) {
                        strAb3 = defpackage.sqs.ab(parcel, i7);
                    } else if (c6 != 2) {
                        defpackage.sqs.ai(parcel, i7);
                    } else {
                        oauth2TokenMetadata = (com.google.android.gms.auth.aang.Oauth2TokenMetadata) defpackage.sqs.X(parcel, i7, com.google.android.gms.auth.aang.Oauth2TokenMetadata.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT7);
                return new com.google.android.gms.auth.aang.GetTokenResponse(strAb3, oauth2TokenMetadata);
            case 7:
                int iT8 = defpackage.sqs.T(parcel);
                java.lang.String strAb12 = null;
                java.lang.String strAb13 = null;
                while (parcel.dataPosition() < iT8) {
                    int i8 = parcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 1) {
                        strAb2 = defpackage.sqs.ab(parcel, i8);
                    } else if (c7 == 2) {
                        strAb12 = defpackage.sqs.ab(parcel, i8);
                    } else if (c7 != 3) {
                        defpackage.sqs.ai(parcel, i8);
                    } else {
                        strAb13 = defpackage.sqs.ab(parcel, i8);
                    }
                }
                defpackage.sqs.ag(parcel, iT8);
                return new com.google.android.gms.auth.aang.GoogleAccount(strAb2, strAb12, strAb13);
            case 8:
                int iT9 = defpackage.sqs.T(parcel);
                java.util.ArrayList arrayListAe7 = null;
                while (parcel.dataPosition() < iT9) {
                    int i9 = parcel.readInt();
                    char c8 = (char) i9;
                    if (c8 == 1) {
                        lAa = defpackage.sqs.aa(parcel, i9);
                    } else if (c8 != 2) {
                        defpackage.sqs.ai(parcel, i9);
                    } else {
                        arrayListAe7 = defpackage.sqs.ae(parcel, i9);
                    }
                }
                defpackage.sqs.ag(parcel, iT9);
                return new com.google.android.gms.auth.aang.Oauth2TokenMetadata(lAa, arrayListAe7);
            case 9:
                int iT10 = defpackage.sqs.T(parcel);
                int iR8 = 0;
                int iR9 = 0;
                int iR10 = 0;
                android.app.PendingIntent pendingIntent = null;
                android.os.Bundle bundleV = null;
                byte[] bArrAk3 = null;
                while (parcel.dataPosition() < iT10) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 1) {
                        iR9 = defpackage.sqs.R(parcel, i10);
                    } else if (c9 == 2) {
                        pendingIntent = (android.app.PendingIntent) defpackage.sqs.X(parcel, i10, android.app.PendingIntent.CREATOR);
                    } else if (c9 == 3) {
                        iR10 = defpackage.sqs.R(parcel, i10);
                    } else if (c9 == 4) {
                        bundleV = defpackage.sqs.V(parcel, i10);
                    } else if (c9 == 5) {
                        bArrAk3 = defpackage.sqs.ak(parcel, i10);
                    } else if (c9 != 1000) {
                        defpackage.sqs.ai(parcel, i10);
                    } else {
                        iR8 = defpackage.sqs.R(parcel, i10);
                    }
                }
                defpackage.sqs.ag(parcel, iT10);
                return new com.google.android.gms.auth.api.proxy.ProxyResponse(iR8, iR9, pendingIntent, iR10, bundleV, bArrAk3);
            case 10:
                int iT11 = defpackage.sqs.T(parcel);
                long jU = 0;
                java.lang.String strAb14 = null;
                java.lang.String strAb15 = null;
                java.lang.String strAb16 = null;
                java.lang.String strAb17 = null;
                android.net.Uri uri = null;
                java.lang.String strAb18 = null;
                java.lang.String strAb19 = null;
                java.util.ArrayList arrayListAf4 = null;
                java.lang.String strAb20 = null;
                java.lang.String strAb21 = null;
                while (parcel.dataPosition() < iT11) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            strAb14 = defpackage.sqs.ab(parcel, i11);
                            break;
                        case 3:
                            strAb15 = defpackage.sqs.ab(parcel, i11);
                            break;
                        case 4:
                            strAb16 = defpackage.sqs.ab(parcel, i11);
                            break;
                        case 5:
                            strAb17 = defpackage.sqs.ab(parcel, i11);
                            break;
                        case 6:
                            uri = (android.net.Uri) defpackage.sqs.X(parcel, i11, android.net.Uri.CREATOR);
                            break;
                        case 7:
                            strAb18 = defpackage.sqs.ab(parcel, i11);
                            break;
                        case '\b':
                            jU = defpackage.sqs.U(parcel, i11);
                            break;
                        case '\t':
                            strAb19 = defpackage.sqs.ab(parcel, i11);
                            break;
                        case '\n':
                            arrayListAf4 = defpackage.sqs.af(parcel, i11, com.google.android.gms.common.api.Scope.CREATOR);
                            break;
                        case 11:
                            strAb20 = defpackage.sqs.ab(parcel, i11);
                            break;
                        case '\f':
                            strAb21 = defpackage.sqs.ab(parcel, i11);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i11);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT11);
                return new com.google.android.gms.auth.api.signin.GoogleSignInAccount(strAb14, strAb15, strAb16, strAb17, uri, strAb18, jU, strAb19, arrayListAf4, strAb20, strAb21);
            case 11:
                int iT12 = defpackage.sqs.T(parcel);
                int iR11 = 0;
                int iR12 = 0;
                while (parcel.dataPosition() < iT12) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        iR5 = defpackage.sqs.R(parcel, i12);
                    } else if (c10 == 2) {
                        iR11 = defpackage.sqs.R(parcel, i12);
                    } else if (c10 != 3) {
                        defpackage.sqs.ai(parcel, i12);
                    } else {
                        iR12 = defpackage.sqs.R(parcel, i12);
                    }
                }
                defpackage.sqs.ag(parcel, iT12);
                return new com.google.android.gms.car.AudioPolicyMixData(iR5, iR11, iR12);
            case 12:
                int iT13 = defpackage.sqs.T(parcel);
                java.util.ArrayList arrayListAf5 = null;
                while (parcel.dataPosition() < iT13) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        arrayListAf = defpackage.sqs.af(parcel, i13, android.content.IntentFilter.CREATOR);
                    } else if (c11 == 2) {
                        iR4 = defpackage.sqs.R(parcel, i13);
                    } else if (c11 != 3) {
                        defpackage.sqs.ai(parcel, i13);
                    } else {
                        arrayListAf5 = defpackage.sqs.af(parcel, i13, android.content.ComponentName.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT13);
                return new com.google.android.gms.car.BlackHoleParams(arrayListAf, iR4, arrayListAf5);
            case 13:
                int iT14 = defpackage.sqs.T(parcel);
                int iR13 = 0;
                int iR14 = 0;
                boolean zAj8 = false;
                com.google.android.gms.car.CarCall carCall = null;
                java.util.ArrayList arrayListAe8 = null;
                java.lang.String strAb22 = null;
                com.google.android.gms.car.CarCall.Details details = null;
                java.util.ArrayList arrayListAf6 = null;
                java.util.ArrayList arrayListAf7 = null;
                while (parcel.dataPosition() < iT14) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            iR13 = defpackage.sqs.R(parcel, i14);
                            break;
                        case 2:
                            carCall = (com.google.android.gms.car.CarCall) defpackage.sqs.X(parcel, i14, com.google.android.gms.car.CarCall.CREATOR);
                            break;
                        case 3:
                            arrayListAe8 = defpackage.sqs.ae(parcel, i14);
                            break;
                        case 4:
                            strAb22 = defpackage.sqs.ab(parcel, i14);
                            break;
                        case 5:
                            iR14 = defpackage.sqs.R(parcel, i14);
                            break;
                        case 6:
                            details = (com.google.android.gms.car.CarCall.Details) defpackage.sqs.X(parcel, i14, com.google.android.gms.car.CarCall.Details.CREATOR);
                            break;
                        case 7:
                            zAj8 = defpackage.sqs.aj(parcel, i14);
                            break;
                        case '\b':
                            arrayListAf6 = defpackage.sqs.af(parcel, i14, com.google.android.gms.car.CarCall.CREATOR);
                            break;
                        case '\t':
                            arrayListAf7 = defpackage.sqs.af(parcel, i14, com.google.android.gms.car.CarCall.CREATOR);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i14);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT14);
                return new com.google.android.gms.car.CarCall(iR13, carCall, arrayListAe8, strAb22, iR14, details, zAj8, arrayListAf6, arrayListAf7);
            case 14:
                int iT15 = defpackage.sqs.T(parcel);
                long jU2 = 0;
                int iR15 = 0;
                int iR16 = 0;
                int iR17 = 0;
                android.net.Uri uri2 = null;
                java.lang.String strAb23 = null;
                java.lang.String strAb24 = null;
                android.net.Uri uri3 = null;
                android.net.Uri uri4 = null;
                android.telecom.PhoneAccountHandle phoneAccountHandle = null;
                android.os.Bundle bundleV2 = null;
                android.os.Bundle bundleV3 = null;
                android.telecom.GatewayInfo gatewayInfo = null;
                while (parcel.dataPosition() < iT15) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            uri2 = (android.net.Uri) defpackage.sqs.X(parcel, i15, android.net.Uri.CREATOR);
                            break;
                        case 2:
                            strAb23 = defpackage.sqs.ab(parcel, i15);
                            break;
                        case 3:
                            strAb24 = defpackage.sqs.ab(parcel, i15);
                            break;
                        case 4:
                            jU2 = defpackage.sqs.U(parcel, i15);
                            break;
                        case 5:
                            uri3 = (android.net.Uri) defpackage.sqs.X(parcel, i15, android.net.Uri.CREATOR);
                            break;
                        case 6:
                            uri4 = (android.net.Uri) defpackage.sqs.X(parcel, i15, android.net.Uri.CREATOR);
                            break;
                        case 7:
                            iR15 = defpackage.sqs.R(parcel, i15);
                            break;
                        case '\b':
                            phoneAccountHandle = (android.telecom.PhoneAccountHandle) defpackage.sqs.X(parcel, i15, android.telecom.PhoneAccountHandle.CREATOR);
                            break;
                        case '\t':
                            iR16 = defpackage.sqs.R(parcel, i15);
                            break;
                        case '\n':
                            bundleV2 = defpackage.sqs.V(parcel, i15);
                            break;
                        case 11:
                            bundleV3 = defpackage.sqs.V(parcel, i15);
                            break;
                        case '\f':
                            iR17 = defpackage.sqs.R(parcel, i15);
                            break;
                        case '\r':
                            gatewayInfo = (android.telecom.GatewayInfo) defpackage.sqs.X(parcel, i15, android.telecom.GatewayInfo.CREATOR);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i15);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT15);
                return new com.google.android.gms.car.CarCall.Details(uri2, strAb23, strAb24, jU2, uri3, uri4, iR15, phoneAccountHandle, iR16, bundleV2, bundleV3, iR17, gatewayInfo);
            case 15:
                int iT16 = defpackage.sqs.T(parcel);
                while (parcel.dataPosition() < iT16) {
                    int i16 = parcel.readInt();
                    char c12 = (char) i16;
                    if (c12 == 1) {
                        iR3 = defpackage.sqs.R(parcel, i16);
                    } else if (c12 != 2) {
                        defpackage.sqs.ai(parcel, i16);
                    } else {
                        strAb = defpackage.sqs.ab(parcel, i16);
                    }
                }
                defpackage.sqs.ag(parcel, iT16);
                return new com.google.android.gms.car.CarFacet(iR3, strAb);
            case 16:
                int iT17 = defpackage.sqs.T(parcel);
                int iR18 = 0;
                int iR19 = 0;
                while (parcel.dataPosition() < iT17) {
                    int i17 = parcel.readInt();
                    char c13 = (char) i17;
                    if (c13 == 1) {
                        iR2 = defpackage.sqs.R(parcel, i17);
                    } else if (c13 == 2) {
                        iR18 = defpackage.sqs.R(parcel, i17);
                    } else if (c13 != 3) {
                        defpackage.sqs.ai(parcel, i17);
                    } else {
                        iR19 = defpackage.sqs.R(parcel, i17);
                    }
                }
                defpackage.sqs.ag(parcel, iT17);
                return new com.google.android.gms.car.CarFrxEvent(iR2, iR18, iR19);
            case 17:
                return new com.google.android.gms.car.CarGalMessage(parcel);
            case 18:
                int iT18 = defpackage.sqs.T(parcel);
                int iR20 = 0;
                int iR21 = 0;
                java.lang.String strAb25 = null;
                java.lang.String strAb26 = null;
                java.lang.String strAb27 = null;
                byte[] bArrAk4 = null;
                while (parcel.dataPosition() < iT18) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            iR20 = defpackage.sqs.R(parcel, i18);
                            break;
                        case 2:
                            iR21 = defpackage.sqs.R(parcel, i18);
                            break;
                        case 3:
                            strAb25 = defpackage.sqs.ab(parcel, i18);
                            break;
                        case 4:
                            strAb26 = defpackage.sqs.ab(parcel, i18);
                            break;
                        case 5:
                            strAb27 = defpackage.sqs.ab(parcel, i18);
                            break;
                        case 6:
                            bArrAk4 = defpackage.sqs.ak(parcel, i18);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i18);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT18);
                return new com.google.android.gms.car.CarPhoneStatus.CarCall(iR20, iR21, strAb25, strAb26, strAb27, bArrAk4);
            case 19:
                int iT19 = defpackage.sqs.T(parcel);
                while (parcel.dataPosition() < iT19) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 1) {
                        carCallArr = (com.google.android.gms.car.CarPhoneStatus.CarCall[]) defpackage.sqs.am(parcel, i19, com.google.android.gms.car.CarPhoneStatus.CarCall.CREATOR);
                    } else if (c14 != 2) {
                        defpackage.sqs.ai(parcel, i19);
                    } else {
                        iR = defpackage.sqs.R(parcel, i19);
                    }
                }
                defpackage.sqs.ag(parcel, iT19);
                return new com.google.android.gms.car.CarPhoneStatus(carCallArr, iR);
            default:
                return parcel.readByte() == 0 ? new com.google.android.gms.car.CrashInfoParcel((java.lang.Throwable) null) : new com.google.android.gms.car.CrashInfoParcel(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new com.google.android.gms.auth.aang.AppRestrictionInfo[i];
            case 1:
                return new com.google.android.gms.auth.aang.AppRestriction[i];
            case 2:
                return new com.google.android.gms.auth.aang.ErrorDetails[i];
            case 3:
                return new com.google.android.gms.auth.aang.GetAccountsRequest[i];
            case 4:
                return new com.google.android.gms.auth.aang.GetAccountsResponse[i];
            case 5:
                return new com.google.android.gms.auth.aang.GetTokenRequest[i];
            case 6:
                return new com.google.android.gms.auth.aang.GetTokenResponse[i];
            case 7:
                return new com.google.android.gms.auth.aang.GoogleAccount[i];
            case 8:
                return new com.google.android.gms.auth.aang.Oauth2TokenMetadata[i];
            case 9:
                return new com.google.android.gms.auth.api.proxy.ProxyResponse[i];
            case 10:
                return new com.google.android.gms.auth.api.signin.GoogleSignInAccount[i];
            case 11:
                return new com.google.android.gms.car.AudioPolicyMixData[i];
            case 12:
                return new com.google.android.gms.car.BlackHoleParams[i];
            case 13:
                return new com.google.android.gms.car.CarCall[i];
            case 14:
                return new com.google.android.gms.car.CarCall.Details[i];
            case 15:
                return new com.google.android.gms.car.CarFacet[i];
            case 16:
                return new com.google.android.gms.car.CarFrxEvent[i];
            case 17:
                return new com.google.android.gms.car.CarGalMessage[i];
            case 18:
                return new com.google.android.gms.car.CarPhoneStatus.CarCall[i];
            case 19:
                return new com.google.android.gms.car.CarPhoneStatus[i];
            default:
                return new com.google.android.gms.car.CrashInfoParcel[i];
        }
    }
}
