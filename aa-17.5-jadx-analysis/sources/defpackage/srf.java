package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.feedback.ServiceDump;
import com.google.android.gms.feedback.ServiceDumpRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverride;
import com.google.android.gms.phenotype.FlagOverrides;
import com.google.android.gms.phenotype.GenericDimension;
import com.google.android.gms.pseudonymous.DeviceWideZwiebackToken;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.android.gms.pseudonymous.SessionZwiebackToken;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.ElCapitanOptions;
import com.google.android.gms.usagereporting.SafetyOptions;
import com.google.android.libraries.social.licenses.License;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class srf implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public srf(int i) {
        this.a = i;
    }

    public static boolean a(int i) {
        return i == 0;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iN = 0;
        boolean zAf = false;
        boolean zAf2 = false;
        boolean zAf3 = false;
        int iN2 = 0;
        int iN3 = 0;
        int iN4 = 0;
        int iN5 = 0;
        boolean zAf4 = false;
        ServiceDumpRequest serviceDumpRequest = null;
        ArrayList arrayListAb = null;
        String strX = null;
        ConnectionResult connectionResult = null;
        ResolveAccountRequest resolveAccountRequest = null;
        ArrayList arrayListAa = null;
        Intent intent = null;
        String strX2 = null;
        byte[] bArrAg = null;
        ArrayList arrayListAb2 = null;
        String strX3 = null;
        byte[] bArrAg2 = null;
        Flag[] flagArr = null;
        switch (this.a) {
            case 0:
                int iP = spu.P(parcel);
                byte[] bArrAg3 = null;
                while (parcel.dataPosition() < iP) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        serviceDumpRequest = (ServiceDumpRequest) spu.T(parcel, i, ServiceDumpRequest.CREATOR);
                    } else if (c != 3) {
                        spu.ae(parcel, i);
                    } else {
                        bArrAg3 = spu.ag(parcel, i);
                    }
                }
                spu.ac(parcel, iP);
                return new ServiceDump(serviceDumpRequest, bArrAg3);
            case 1:
                int iP2 = spu.P(parcel);
                int iN6 = 1;
                LocationRequestInternal locationRequestInternal = null;
                IBinder iBinderS = null;
                IBinder iBinderS2 = null;
                PendingIntent pendingIntent = null;
                IBinder iBinderS3 = null;
                String strX4 = null;
                while (parcel.dataPosition() < iP2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            iN6 = spu.N(parcel, i2);
                            break;
                        case 2:
                            locationRequestInternal = (LocationRequestInternal) spu.T(parcel, i2, LocationRequestInternal.CREATOR);
                            break;
                        case 3:
                            iBinderS = spu.S(parcel, i2);
                            break;
                        case 4:
                            pendingIntent = (PendingIntent) spu.T(parcel, i2, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinderS2 = spu.S(parcel, i2);
                            break;
                        case 6:
                            iBinderS3 = spu.S(parcel, i2);
                            break;
                        case 7:
                        default:
                            spu.ae(parcel, i2);
                            break;
                        case '\b':
                            strX4 = spu.X(parcel, i2);
                            break;
                    }
                }
                spu.ac(parcel, iP2);
                return new LocationRequestUpdateData(iN6, locationRequestInternal, iBinderS, iBinderS2, pendingIntent, iBinderS3, strX4);
            case 2:
                int iP3 = spu.P(parcel);
                String[] strArrAj = null;
                while (parcel.dataPosition() < iP3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 2) {
                        iN = spu.N(parcel, i3);
                    } else if (c2 == 3) {
                        flagArr = (Flag[]) spu.ai(parcel, i3, Flag.CREATOR);
                    } else if (c2 != 4) {
                        spu.ae(parcel, i3);
                    } else {
                        strArrAj = spu.aj(parcel, i3);
                    }
                }
                spu.ac(parcel, iP3);
                return new Configuration(iN, flagArr, strArrAj);
            case 3:
                int iP4 = spu.P(parcel);
                long jQ = 0;
                boolean zAf5 = false;
                String strX5 = null;
                String strX6 = null;
                Configuration[] configurationArr = null;
                byte[] bArrAg4 = null;
                while (parcel.dataPosition() < iP4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 2:
                            strX5 = spu.X(parcel, i4);
                            break;
                        case 3:
                            strX6 = spu.X(parcel, i4);
                            break;
                        case 4:
                            configurationArr = (Configuration[]) spu.ai(parcel, i4, Configuration.CREATOR);
                            break;
                        case 5:
                            zAf5 = spu.af(parcel, i4);
                            break;
                        case 6:
                            bArrAg4 = spu.ag(parcel, i4);
                            break;
                        case 7:
                            jQ = spu.Q(parcel, i4);
                            break;
                        default:
                            spu.ae(parcel, i4);
                            break;
                    }
                }
                spu.ac(parcel, iP4);
                return new Configurations(strX5, strX6, configurationArr, zAf5, bArrAg4, jQ);
            case 4:
                int iP5 = spu.P(parcel);
                while (parcel.dataPosition() < iP5) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 2) {
                        spu.ae(parcel, i5);
                    } else {
                        bArrAg2 = spu.ag(parcel, i5);
                    }
                }
                spu.ac(parcel, iP5);
                return new DogfoodsToken(bArrAg2);
            case 5:
                int iP6 = spu.P(parcel);
                long jQ2 = 0;
                double dL = 0.0d;
                boolean zAf6 = false;
                int iN7 = 0;
                int iN8 = 0;
                int iN9 = 0;
                String strX7 = null;
                String strX8 = null;
                byte[] bArrAg5 = null;
                while (parcel.dataPosition() < iP6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 2:
                            strX7 = spu.X(parcel, i6);
                            break;
                        case 3:
                            jQ2 = spu.Q(parcel, i6);
                            break;
                        case 4:
                            zAf6 = spu.af(parcel, i6);
                            break;
                        case 5:
                            dL = spu.L(parcel, i6);
                            break;
                        case 6:
                            strX8 = spu.X(parcel, i6);
                            break;
                        case 7:
                            bArrAg5 = spu.ag(parcel, i6);
                            break;
                        case '\b':
                            iN7 = spu.N(parcel, i6);
                            break;
                        case '\t':
                            iN8 = spu.N(parcel, i6);
                            break;
                        case '\n':
                            iN9 = spu.N(parcel, i6);
                            break;
                        default:
                            spu.ae(parcel, i6);
                            break;
                    }
                }
                spu.ac(parcel, iP6);
                return new Flag(strX7, jQ2, zAf6, dL, strX8, bArrAg5, iN7, iN8, iN9);
            case 6:
                int iP7 = spu.P(parcel);
                String strX9 = null;
                Flag flag = null;
                while (parcel.dataPosition() < iP7) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 2) {
                        strX3 = spu.X(parcel, i7);
                    } else if (c3 == 3) {
                        strX9 = spu.X(parcel, i7);
                    } else if (c3 == 4) {
                        flag = (Flag) spu.T(parcel, i7, Flag.CREATOR);
                    } else if (c3 != 5) {
                        spu.ae(parcel, i7);
                    } else {
                        zAf4 = spu.af(parcel, i7);
                    }
                }
                spu.ac(parcel, iP7);
                return new FlagOverride(strX3, strX9, flag, zAf4);
            case 7:
                int iP8 = spu.P(parcel);
                while (parcel.dataPosition() < iP8) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 2) {
                        spu.ae(parcel, i8);
                    } else {
                        arrayListAb2 = spu.ab(parcel, i8, FlagOverride.CREATOR);
                    }
                }
                spu.ac(parcel, iP8);
                return new FlagOverrides(arrayListAb2);
            case 8:
                int iP9 = spu.P(parcel);
                int iN10 = 0;
                while (parcel.dataPosition() < iP9) {
                    int i9 = parcel.readInt();
                    char c4 = (char) i9;
                    if (c4 == 1) {
                        iN5 = spu.N(parcel, i9);
                    } else if (c4 != 2) {
                        spu.ae(parcel, i9);
                    } else {
                        iN10 = spu.N(parcel, i9);
                    }
                }
                spu.ac(parcel, iP9);
                return new GenericDimension(iN5, iN10);
            case 9:
                int iP10 = spu.P(parcel);
                while (parcel.dataPosition() < iP10) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        spu.ae(parcel, i10);
                    } else {
                        bArrAg = spu.ag(parcel, i10);
                    }
                }
                spu.ac(parcel, iP10);
                return new DeviceWideZwiebackToken(bArrAg);
            case 10:
                int iP11 = spu.P(parcel);
                while (parcel.dataPosition() < iP11) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 2) {
                        spu.ae(parcel, i11);
                    } else {
                        strX2 = spu.X(parcel, i11);
                    }
                }
                spu.ac(parcel, iP11);
                return new PseudonymousIdToken(strX2);
            case 11:
                return new SessionZwiebackToken(parcel);
            case 12:
                int iP12 = spu.P(parcel);
                int iN11 = 0;
                while (parcel.dataPosition() < iP12) {
                    int i12 = parcel.readInt();
                    char c5 = (char) i12;
                    if (c5 == 1) {
                        iN4 = spu.N(parcel, i12);
                    } else if (c5 == 2) {
                        iN11 = spu.N(parcel, i12);
                    } else if (c5 != 3) {
                        spu.ae(parcel, i12);
                    } else {
                        intent = (Intent) spu.T(parcel, i12, Intent.CREATOR);
                    }
                }
                spu.ac(parcel, iP12);
                return new AuthAccountResult(iN4, iN11, intent);
            case 13:
                int iP13 = spu.P(parcel);
                String strX10 = null;
                while (parcel.dataPosition() < iP13) {
                    int i13 = parcel.readInt();
                    char c6 = (char) i13;
                    if (c6 == 1) {
                        arrayListAa = spu.aa(parcel, i13);
                    } else if (c6 != 2) {
                        spu.ae(parcel, i13);
                    } else {
                        strX10 = spu.X(parcel, i13);
                    }
                }
                spu.ac(parcel, iP13);
                return new RecordConsentByConsentResultResponse(arrayListAa, strX10);
            case 14:
                int iP14 = spu.P(parcel);
                while (parcel.dataPosition() < iP14) {
                    int i14 = parcel.readInt();
                    char c7 = (char) i14;
                    if (c7 == 1) {
                        iN3 = spu.N(parcel, i14);
                    } else if (c7 != 2) {
                        spu.ae(parcel, i14);
                    } else {
                        resolveAccountRequest = (ResolveAccountRequest) spu.T(parcel, i14, ResolveAccountRequest.CREATOR);
                    }
                }
                spu.ac(parcel, iP14);
                return new SignInRequest(iN3, resolveAccountRequest);
            case 15:
                int iP15 = spu.P(parcel);
                ResolveAccountResponse resolveAccountResponse = null;
                while (parcel.dataPosition() < iP15) {
                    int i15 = parcel.readInt();
                    char c8 = (char) i15;
                    if (c8 == 1) {
                        iN2 = spu.N(parcel, i15);
                    } else if (c8 == 2) {
                        connectionResult = (ConnectionResult) spu.T(parcel, i15, ConnectionResult.CREATOR);
                    } else if (c8 != 3) {
                        spu.ae(parcel, i15);
                    } else {
                        resolveAccountResponse = (ResolveAccountResponse) spu.T(parcel, i15, ResolveAccountResponse.CREATOR);
                    }
                }
                spu.ac(parcel, iP15);
                return new SignInResponse(iN2, connectionResult, resolveAccountResponse);
            case 16:
                int iP16 = spu.P(parcel);
                byte[] bArrAg6 = null;
                ArrayList arrayListY = null;
                while (parcel.dataPosition() < iP16) {
                    int i16 = parcel.readInt();
                    char c9 = (char) i16;
                    if (c9 == 1) {
                        strX = spu.X(parcel, i16);
                    } else if (c9 == 2) {
                        bArrAg6 = spu.ag(parcel, i16);
                    } else if (c9 != 3) {
                        spu.ae(parcel, i16);
                    } else {
                        arrayListY = spu.Y(parcel, i16);
                    }
                }
                spu.ac(parcel, iP16);
                return new ConsentInformation.AccountConsentInformation(strX, bArrAg6, arrayListY);
            case 17:
                int iP17 = spu.P(parcel);
                boolean zAf7 = false;
                while (parcel.dataPosition() < iP17) {
                    int i17 = parcel.readInt();
                    char c10 = (char) i17;
                    if (c10 == 1) {
                        arrayListAb = spu.ab(parcel, i17, ConsentInformation.AccountConsentInformation.CREATOR);
                    } else if (c10 == 2) {
                        zAf3 = spu.af(parcel, i17);
                    } else if (c10 != 3) {
                        spu.ae(parcel, i17);
                    } else {
                        zAf7 = spu.af(parcel, i17);
                    }
                }
                spu.ac(parcel, iP17);
                return new ConsentInformation(arrayListAb, zAf3, zAf7);
            case 18:
                int iP18 = spu.P(parcel);
                int iN12 = 0;
                while (parcel.dataPosition() < iP18) {
                    int i18 = parcel.readInt();
                    char c11 = (char) i18;
                    if (c11 == 2) {
                        zAf2 = spu.af(parcel, i18);
                    } else if (c11 != 3) {
                        spu.ae(parcel, i18);
                    } else {
                        iN12 = spu.N(parcel, i18);
                    }
                }
                spu.ac(parcel, iP18);
                return new ElCapitanOptions(zAf2, iN12);
            case 19:
                int iP19 = spu.P(parcel);
                boolean zAf8 = false;
                int iN13 = 0;
                while (parcel.dataPosition() < iP19) {
                    int i19 = parcel.readInt();
                    char c12 = (char) i19;
                    if (c12 == 2) {
                        zAf = spu.af(parcel, i19);
                    } else if (c12 == 3) {
                        zAf8 = spu.af(parcel, i19);
                    } else if (c12 != 4) {
                        spu.ae(parcel, i19);
                    } else {
                        iN13 = spu.N(parcel, i19);
                    }
                }
                spu.ac(parcel, iP19);
                return new SafetyOptions(zAf, zAf8, iN13);
            default:
                return new License(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ServiceDump[i];
            case 1:
                return new LocationRequestUpdateData[i];
            case 2:
                return new Configuration[i];
            case 3:
                return new Configurations[i];
            case 4:
                return new DogfoodsToken[i];
            case 5:
                return new Flag[i];
            case 6:
                return new FlagOverride[i];
            case 7:
                return new FlagOverrides[i];
            case 8:
                return new GenericDimension[i];
            case 9:
                return new DeviceWideZwiebackToken[i];
            case 10:
                return new PseudonymousIdToken[i];
            case 11:
                return new SessionZwiebackToken[i];
            case 12:
                return new AuthAccountResult[i];
            case 13:
                return new RecordConsentByConsentResultResponse[i];
            case 14:
                return new SignInRequest[i];
            case 15:
                return new SignInResponse[i];
            case 16:
                return new ConsentInformation.AccountConsentInformation[i];
            case 17:
                return new ConsentInformation[i];
            case 18:
                return new ElCapitanOptions[i];
            case 19:
                return new SafetyOptions[i];
            default:
                return new License[i];
        }
    }
}
