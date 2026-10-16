package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.IntentFilter;
import android.net.Network;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.telecom.GatewayInfo;
import android.telecom.PhoneAccountHandle;
import com.google.android.gms.auth.aang.AccountWithAppRestrictionState;
import com.google.android.gms.auth.aang.AppRestriction;
import com.google.android.gms.auth.aang.AppRestrictionInfo;
import com.google.android.gms.auth.aang.AppRestrictionState;
import com.google.android.gms.auth.aang.ErrorDetails;
import com.google.android.gms.auth.aang.GetAccountsRequest;
import com.google.android.gms.auth.aang.GetAccountsResponse;
import com.google.android.gms.auth.aang.GetTokenRequest;
import com.google.android.gms.auth.aang.GetTokenResponse;
import com.google.android.gms.auth.aang.GoogleAccount;
import com.google.android.gms.auth.aang.Oauth2TokenMetadata;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.car.AudioPolicyMixData;
import com.google.android.gms.car.BlackHoleParams;
import com.google.android.gms.car.CarCall;
import com.google.android.gms.car.CarFacet;
import com.google.android.gms.car.CarFrxEvent;
import com.google.android.gms.car.CarGalMessage;
import com.google.android.gms.car.CarPhoneStatus;
import com.google.android.gms.car.CrashInfoParcel;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qoj implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public qoj(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean zAf = false;
        int iN = 0;
        int iN2 = 0;
        int iN3 = 0;
        int iN4 = 0;
        int iN5 = 0;
        AppRestrictionState appRestrictionState = null;
        CarPhoneStatus.CarCall[] carCallArr = null;
        String strX = null;
        ArrayList arrayListAb = null;
        Long lW = null;
        String strX2 = null;
        String strX3 = null;
        ArrayList arrayListAb2 = null;
        switch (this.a) {
            case 0:
                int iP = spu.P(parcel);
                String strX4 = null;
                String strX5 = null;
                String strX6 = null;
                String strX7 = null;
                byte[] bArrAg = null;
                while (parcel.dataPosition() < iP) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        strX4 = spu.X(parcel, i);
                    } else if (c == 3) {
                        strX5 = spu.X(parcel, i);
                    } else if (c == 4) {
                        strX6 = spu.X(parcel, i);
                    } else if (c == 5) {
                        strX7 = spu.X(parcel, i);
                    } else if (c != 6) {
                        spu.ae(parcel, i);
                    } else {
                        bArrAg = spu.ag(parcel, i);
                    }
                }
                spu.ac(parcel, iP);
                return new AppRestrictionInfo(strX4, strX5, strX6, strX7, bArrAg);
            case 1:
                int iP2 = spu.P(parcel);
                AppRestrictionInfo appRestrictionInfo = null;
                while (parcel.dataPosition() < iP2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        appRestrictionState = (AppRestrictionState) spu.T(parcel, i2, AppRestrictionState.CREATOR);
                    } else if (c2 != 2) {
                        spu.ae(parcel, i2);
                    } else {
                        appRestrictionInfo = (AppRestrictionInfo) spu.T(parcel, i2, AppRestrictionInfo.CREATOR);
                    }
                }
                spu.ac(parcel, iP2);
                return new AppRestriction(appRestrictionState, appRestrictionInfo);
            case 2:
                int iP3 = spu.P(parcel);
                boolean zAf2 = false;
                while (parcel.dataPosition() < iP3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        zAf = spu.af(parcel, i3);
                    } else if (c3 != 2) {
                        spu.ae(parcel, i3);
                    } else {
                        zAf2 = spu.af(parcel, i3);
                    }
                }
                spu.ac(parcel, iP3);
                return new ErrorDetails(zAf, zAf2);
            case 3:
                int iP4 = spu.P(parcel);
                boolean zAf3 = false;
                boolean zAf4 = false;
                String strX8 = null;
                ArrayList arrayListAa = null;
                ArrayList arrayListAa2 = null;
                while (parcel.dataPosition() < iP4) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 1) {
                        strX8 = spu.X(parcel, i4);
                    } else if (c4 == 2) {
                        arrayListAa = spu.aa(parcel, i4);
                    } else if (c4 == 3) {
                        arrayListAa2 = spu.aa(parcel, i4);
                    } else if (c4 == 4) {
                        zAf3 = spu.af(parcel, i4);
                    } else if (c4 != 5) {
                        spu.ae(parcel, i4);
                    } else {
                        zAf4 = spu.af(parcel, i4);
                    }
                }
                spu.ac(parcel, iP4);
                return new GetAccountsRequest(strX8, arrayListAa, arrayListAa2, zAf3, zAf4);
            case 4:
                int iP5 = spu.P(parcel);
                ArrayList arrayListAb3 = null;
                while (parcel.dataPosition() < iP5) {
                    int i5 = parcel.readInt();
                    char c5 = (char) i5;
                    if (c5 == 1) {
                        arrayListAb2 = spu.ab(parcel, i5, GoogleAccount.CREATOR);
                    } else if (c5 != 2) {
                        spu.ae(parcel, i5);
                    } else {
                        arrayListAb3 = spu.ab(parcel, i5, AccountWithAppRestrictionState.CREATOR);
                    }
                }
                spu.ac(parcel, iP5);
                return new GetAccountsResponse(arrayListAb2, arrayListAb3);
            case 5:
                int iP6 = spu.P(parcel);
                int iN6 = 0;
                boolean zAf5 = false;
                boolean zAf6 = false;
                boolean zAf7 = false;
                int iN7 = 0;
                GoogleAccount googleAccount = null;
                String strX9 = null;
                ArrayList arrayListAa3 = null;
                ArrayList arrayListAa4 = null;
                ArrayList arrayListAa5 = null;
                ArrayList arrayListAa6 = null;
                String strX10 = null;
                byte[] bArrAg2 = null;
                String strX11 = null;
                Network network = null;
                while (parcel.dataPosition() < iP6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            googleAccount = (GoogleAccount) spu.T(parcel, i6, GoogleAccount.CREATOR);
                            break;
                        case 2:
                            strX9 = spu.X(parcel, i6);
                            break;
                        case 3:
                            arrayListAa3 = spu.aa(parcel, i6);
                            break;
                        case 4:
                            arrayListAa4 = spu.aa(parcel, i6);
                            break;
                        case 5:
                            arrayListAa5 = spu.aa(parcel, i6);
                            break;
                        case 6:
                            arrayListAa6 = spu.aa(parcel, i6);
                            break;
                        case 7:
                            iN6 = spu.N(parcel, i6);
                            break;
                        case '\b':
                            strX10 = spu.X(parcel, i6);
                            break;
                        case '\t':
                            zAf5 = spu.af(parcel, i6);
                            break;
                        case '\n':
                            bArrAg2 = spu.ag(parcel, i6);
                            break;
                        case 11:
                            strX11 = spu.X(parcel, i6);
                            break;
                        case '\f':
                            zAf6 = spu.af(parcel, i6);
                            break;
                        case '\r':
                            network = (Network) spu.T(parcel, i6, Network.CREATOR);
                            break;
                        case 14:
                            zAf7 = spu.af(parcel, i6);
                            break;
                        case 15:
                            iN7 = spu.N(parcel, i6);
                            break;
                        default:
                            spu.ae(parcel, i6);
                            break;
                    }
                }
                spu.ac(parcel, iP6);
                return new GetTokenRequest(googleAccount, strX9, arrayListAa3, arrayListAa4, arrayListAa5, arrayListAa6, iN6, strX10, zAf5, bArrAg2, strX11, zAf6, network, zAf7, iN7);
            case 6:
                int iP7 = spu.P(parcel);
                Oauth2TokenMetadata oauth2TokenMetadata = null;
                while (parcel.dataPosition() < iP7) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 1) {
                        strX3 = spu.X(parcel, i7);
                    } else if (c6 != 2) {
                        spu.ae(parcel, i7);
                    } else {
                        oauth2TokenMetadata = (Oauth2TokenMetadata) spu.T(parcel, i7, Oauth2TokenMetadata.CREATOR);
                    }
                }
                spu.ac(parcel, iP7);
                return new GetTokenResponse(strX3, oauth2TokenMetadata);
            case 7:
                int iP8 = spu.P(parcel);
                String strX12 = null;
                String strX13 = null;
                while (parcel.dataPosition() < iP8) {
                    int i8 = parcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 1) {
                        strX2 = spu.X(parcel, i8);
                    } else if (c7 == 2) {
                        strX12 = spu.X(parcel, i8);
                    } else if (c7 != 3) {
                        spu.ae(parcel, i8);
                    } else {
                        strX13 = spu.X(parcel, i8);
                    }
                }
                spu.ac(parcel, iP8);
                return new GoogleAccount(strX2, strX12, strX13);
            case 8:
                int iP9 = spu.P(parcel);
                ArrayList arrayListAa7 = null;
                while (parcel.dataPosition() < iP9) {
                    int i9 = parcel.readInt();
                    char c8 = (char) i9;
                    if (c8 == 1) {
                        lW = spu.W(parcel, i9);
                    } else if (c8 != 2) {
                        spu.ae(parcel, i9);
                    } else {
                        arrayListAa7 = spu.aa(parcel, i9);
                    }
                }
                spu.ac(parcel, iP9);
                return new Oauth2TokenMetadata(lW, arrayListAa7);
            case 9:
                int iP10 = spu.P(parcel);
                int iN8 = 0;
                int iN9 = 0;
                int iN10 = 0;
                PendingIntent pendingIntent = null;
                Bundle bundleR = null;
                byte[] bArrAg3 = null;
                while (parcel.dataPosition() < iP10) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 1) {
                        iN9 = spu.N(parcel, i10);
                    } else if (c9 == 2) {
                        pendingIntent = (PendingIntent) spu.T(parcel, i10, PendingIntent.CREATOR);
                    } else if (c9 == 3) {
                        iN10 = spu.N(parcel, i10);
                    } else if (c9 == 4) {
                        bundleR = spu.R(parcel, i10);
                    } else if (c9 == 5) {
                        bArrAg3 = spu.ag(parcel, i10);
                    } else if (c9 != 1000) {
                        spu.ae(parcel, i10);
                    } else {
                        iN8 = spu.N(parcel, i10);
                    }
                }
                spu.ac(parcel, iP10);
                return new ProxyResponse(iN8, iN9, pendingIntent, iN10, bundleR, bArrAg3);
            case 10:
                int iP11 = spu.P(parcel);
                long jQ = 0;
                String strX14 = null;
                String strX15 = null;
                String strX16 = null;
                String strX17 = null;
                Uri uri = null;
                String strX18 = null;
                String strX19 = null;
                ArrayList arrayListAb4 = null;
                String strX20 = null;
                String strX21 = null;
                while (parcel.dataPosition() < iP11) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            strX14 = spu.X(parcel, i11);
                            break;
                        case 3:
                            strX15 = spu.X(parcel, i11);
                            break;
                        case 4:
                            strX16 = spu.X(parcel, i11);
                            break;
                        case 5:
                            strX17 = spu.X(parcel, i11);
                            break;
                        case 6:
                            uri = (Uri) spu.T(parcel, i11, Uri.CREATOR);
                            break;
                        case 7:
                            strX18 = spu.X(parcel, i11);
                            break;
                        case '\b':
                            jQ = spu.Q(parcel, i11);
                            break;
                        case '\t':
                            strX19 = spu.X(parcel, i11);
                            break;
                        case '\n':
                            arrayListAb4 = spu.ab(parcel, i11, Scope.CREATOR);
                            break;
                        case 11:
                            strX20 = spu.X(parcel, i11);
                            break;
                        case '\f':
                            strX21 = spu.X(parcel, i11);
                            break;
                        default:
                            spu.ae(parcel, i11);
                            break;
                    }
                }
                spu.ac(parcel, iP11);
                return new GoogleSignInAccount(strX14, strX15, strX16, strX17, uri, strX18, jQ, strX19, arrayListAb4, strX20, strX21);
            case 11:
                int iP12 = spu.P(parcel);
                int iN11 = 0;
                int iN12 = 0;
                while (parcel.dataPosition() < iP12) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        iN5 = spu.N(parcel, i12);
                    } else if (c10 == 2) {
                        iN11 = spu.N(parcel, i12);
                    } else if (c10 != 3) {
                        spu.ae(parcel, i12);
                    } else {
                        iN12 = spu.N(parcel, i12);
                    }
                }
                spu.ac(parcel, iP12);
                return new AudioPolicyMixData(iN5, iN11, iN12);
            case 12:
                int iP13 = spu.P(parcel);
                ArrayList arrayListAb5 = null;
                while (parcel.dataPosition() < iP13) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        arrayListAb = spu.ab(parcel, i13, IntentFilter.CREATOR);
                    } else if (c11 == 2) {
                        iN4 = spu.N(parcel, i13);
                    } else if (c11 != 3) {
                        spu.ae(parcel, i13);
                    } else {
                        arrayListAb5 = spu.ab(parcel, i13, ComponentName.CREATOR);
                    }
                }
                spu.ac(parcel, iP13);
                return new BlackHoleParams(arrayListAb, iN4, arrayListAb5);
            case 13:
                int iP14 = spu.P(parcel);
                int iN13 = 0;
                int iN14 = 0;
                boolean zAf8 = false;
                CarCall carCall = null;
                ArrayList arrayListAa8 = null;
                String strX22 = null;
                CarCall.Details details = null;
                ArrayList arrayListAb6 = null;
                ArrayList arrayListAb7 = null;
                while (parcel.dataPosition() < iP14) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            iN13 = spu.N(parcel, i14);
                            break;
                        case 2:
                            carCall = (CarCall) spu.T(parcel, i14, CarCall.CREATOR);
                            break;
                        case 3:
                            arrayListAa8 = spu.aa(parcel, i14);
                            break;
                        case 4:
                            strX22 = spu.X(parcel, i14);
                            break;
                        case 5:
                            iN14 = spu.N(parcel, i14);
                            break;
                        case 6:
                            details = (CarCall.Details) spu.T(parcel, i14, CarCall.Details.CREATOR);
                            break;
                        case 7:
                            zAf8 = spu.af(parcel, i14);
                            break;
                        case '\b':
                            arrayListAb6 = spu.ab(parcel, i14, CarCall.CREATOR);
                            break;
                        case '\t':
                            arrayListAb7 = spu.ab(parcel, i14, CarCall.CREATOR);
                            break;
                        default:
                            spu.ae(parcel, i14);
                            break;
                    }
                }
                spu.ac(parcel, iP14);
                return new CarCall(iN13, carCall, arrayListAa8, strX22, iN14, details, zAf8, arrayListAb6, arrayListAb7);
            case 14:
                int iP15 = spu.P(parcel);
                long jQ2 = 0;
                int iN15 = 0;
                int iN16 = 0;
                int iN17 = 0;
                Uri uri2 = null;
                String strX23 = null;
                String strX24 = null;
                Uri uri3 = null;
                Uri uri4 = null;
                PhoneAccountHandle phoneAccountHandle = null;
                Bundle bundleR2 = null;
                Bundle bundleR3 = null;
                GatewayInfo gatewayInfo = null;
                while (parcel.dataPosition() < iP15) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            uri2 = (Uri) spu.T(parcel, i15, Uri.CREATOR);
                            break;
                        case 2:
                            strX23 = spu.X(parcel, i15);
                            break;
                        case 3:
                            strX24 = spu.X(parcel, i15);
                            break;
                        case 4:
                            jQ2 = spu.Q(parcel, i15);
                            break;
                        case 5:
                            uri3 = (Uri) spu.T(parcel, i15, Uri.CREATOR);
                            break;
                        case 6:
                            uri4 = (Uri) spu.T(parcel, i15, Uri.CREATOR);
                            break;
                        case 7:
                            iN15 = spu.N(parcel, i15);
                            break;
                        case '\b':
                            phoneAccountHandle = (PhoneAccountHandle) spu.T(parcel, i15, PhoneAccountHandle.CREATOR);
                            break;
                        case '\t':
                            iN16 = spu.N(parcel, i15);
                            break;
                        case '\n':
                            bundleR2 = spu.R(parcel, i15);
                            break;
                        case 11:
                            bundleR3 = spu.R(parcel, i15);
                            break;
                        case '\f':
                            iN17 = spu.N(parcel, i15);
                            break;
                        case '\r':
                            gatewayInfo = (GatewayInfo) spu.T(parcel, i15, GatewayInfo.CREATOR);
                            break;
                        default:
                            spu.ae(parcel, i15);
                            break;
                    }
                }
                spu.ac(parcel, iP15);
                return new CarCall.Details(uri2, strX23, strX24, jQ2, uri3, uri4, iN15, phoneAccountHandle, iN16, bundleR2, bundleR3, iN17, gatewayInfo);
            case 15:
                int iP16 = spu.P(parcel);
                while (parcel.dataPosition() < iP16) {
                    int i16 = parcel.readInt();
                    char c12 = (char) i16;
                    if (c12 == 1) {
                        iN3 = spu.N(parcel, i16);
                    } else if (c12 != 2) {
                        spu.ae(parcel, i16);
                    } else {
                        strX = spu.X(parcel, i16);
                    }
                }
                spu.ac(parcel, iP16);
                return new CarFacet(iN3, strX);
            case 16:
                int iP17 = spu.P(parcel);
                int iN18 = 0;
                int iN19 = 0;
                while (parcel.dataPosition() < iP17) {
                    int i17 = parcel.readInt();
                    char c13 = (char) i17;
                    if (c13 == 1) {
                        iN2 = spu.N(parcel, i17);
                    } else if (c13 == 2) {
                        iN18 = spu.N(parcel, i17);
                    } else if (c13 != 3) {
                        spu.ae(parcel, i17);
                    } else {
                        iN19 = spu.N(parcel, i17);
                    }
                }
                spu.ac(parcel, iP17);
                return new CarFrxEvent(iN2, iN18, iN19);
            case 17:
                return new CarGalMessage(parcel);
            case 18:
                int iP18 = spu.P(parcel);
                int iN20 = 0;
                int iN21 = 0;
                String strX25 = null;
                String strX26 = null;
                String strX27 = null;
                byte[] bArrAg4 = null;
                while (parcel.dataPosition() < iP18) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            iN20 = spu.N(parcel, i18);
                            break;
                        case 2:
                            iN21 = spu.N(parcel, i18);
                            break;
                        case 3:
                            strX25 = spu.X(parcel, i18);
                            break;
                        case 4:
                            strX26 = spu.X(parcel, i18);
                            break;
                        case 5:
                            strX27 = spu.X(parcel, i18);
                            break;
                        case 6:
                            bArrAg4 = spu.ag(parcel, i18);
                            break;
                        default:
                            spu.ae(parcel, i18);
                            break;
                    }
                }
                spu.ac(parcel, iP18);
                return new CarPhoneStatus.CarCall(iN20, iN21, strX25, strX26, strX27, bArrAg4);
            case 19:
                int iP19 = spu.P(parcel);
                while (parcel.dataPosition() < iP19) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 1) {
                        carCallArr = (CarPhoneStatus.CarCall[]) spu.ai(parcel, i19, CarPhoneStatus.CarCall.CREATOR);
                    } else if (c14 != 2) {
                        spu.ae(parcel, i19);
                    } else {
                        iN = spu.N(parcel, i19);
                    }
                }
                spu.ac(parcel, iP19);
                return new CarPhoneStatus(carCallArr, iN);
            default:
                return parcel.readByte() == 0 ? new CrashInfoParcel((Throwable) null) : new CrashInfoParcel(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AppRestrictionInfo[i];
            case 1:
                return new AppRestriction[i];
            case 2:
                return new ErrorDetails[i];
            case 3:
                return new GetAccountsRequest[i];
            case 4:
                return new GetAccountsResponse[i];
            case 5:
                return new GetTokenRequest[i];
            case 6:
                return new GetTokenResponse[i];
            case 7:
                return new GoogleAccount[i];
            case 8:
                return new Oauth2TokenMetadata[i];
            case 9:
                return new ProxyResponse[i];
            case 10:
                return new GoogleSignInAccount[i];
            case 11:
                return new AudioPolicyMixData[i];
            case 12:
                return new BlackHoleParams[i];
            case 13:
                return new CarCall[i];
            case 14:
                return new CarCall.Details[i];
            case 15:
                return new CarFacet[i];
            case 16:
                return new CarFrxEvent[i];
            case 17:
                return new CarGalMessage[i];
            case 18:
                return new CarPhoneStatus.CarCall[i];
            case 19:
                return new CarPhoneStatus[i];
            default:
                return new CrashInfoParcel[i];
        }
    }
}
