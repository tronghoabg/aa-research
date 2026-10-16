package defpackage;

import android.accounts.Account;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.carsetup.fsm.impl.FsmController;
import com.google.android.gms.clearcut.BatchedLogEventParcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.clearcut.sampler.SamplerConfigParcelable;
import com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.ClientNotificationEvent;
import com.google.android.gms.common.internal.ClientThrottlingTelemetryData;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.ConnectionThrottlingConfig;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.libs.throttling.ThrottlingLimits;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class sht implements Parcelable.Creator {
    public static final sht a = new sht(7);
    private final /* synthetic */ int b;

    public sht(int i) {
        this.b = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long jQ = 0;
        ArrayList arrayListAb = null;
        ArrayList arrayListAb2 = null;
        Account account = null;
        ArrayList arrayListAb3 = null;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        ComplianceOptions complianceOptions = null;
        String strX4 = null;
        int iN = 0;
        int iN2 = 0;
        int iN3 = 0;
        int iN4 = 0;
        int iN5 = 0;
        int iN6 = 0;
        int iN7 = 0;
        boolean zAf = false;
        boolean zAf2 = false;
        boolean zAf3 = false;
        boolean zAf4 = false;
        switch (this.b) {
            case 0:
                int iP = spu.P(parcel);
                BatchedLogErrorParcelable batchedLogErrorParcelable = null;
                while (parcel.dataPosition() < iP) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        arrayListAb = spu.ab(parcel, i, LogEventParcelable.CREATOR);
                    } else if (c != 2) {
                        spu.ae(parcel, i);
                    } else {
                        batchedLogErrorParcelable = (BatchedLogErrorParcelable) spu.T(parcel, i, BatchedLogErrorParcelable.CREATOR);
                    }
                }
                spu.ac(parcel, iP);
                return new BatchedLogEventParcelable(arrayListAb, batchedLogErrorParcelable);
            case 1:
                return new FsmController.StackEntry(parcel);
            case 2:
                int iP2 = spu.P(parcel);
                int iN8 = 0;
                int iN9 = 0;
                while (parcel.dataPosition() < iP2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        iN = spu.N(parcel, i2);
                    } else if (c2 == 2) {
                        iN8 = spu.N(parcel, i2);
                    } else if (c2 != 3) {
                        spu.ae(parcel, i2);
                    } else {
                        iN9 = spu.N(parcel, i2);
                    }
                }
                spu.ac(parcel, iP2);
                return new DataCollectionIdentifierParcelable(iN, iN8, iN9);
            case 3:
                int iP3 = spu.P(parcel);
                while (parcel.dataPosition() < iP3) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        spu.ae(parcel, i3);
                    } else {
                        zAf4 = spu.af(parcel, i3);
                    }
                }
                spu.ac(parcel, iP3);
                return new LogVerifierResultParcelable(zAf4);
            case 4:
                int iP4 = spu.P(parcel);
                double dL = 0.0d;
                String strX5 = null;
                int iN10 = 0;
                int iN11 = 0;
                int iN12 = 0;
                while (parcel.dataPosition() < iP4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        iN10 = spu.N(parcel, i4);
                    } else if (c3 == 2) {
                        dL = spu.L(parcel, i4);
                    } else if (c3 == 3) {
                        iN11 = spu.N(parcel, i4);
                    } else if (c3 == 4) {
                        iN12 = spu.N(parcel, i4);
                    } else if (c3 != 5) {
                        spu.ae(parcel, i4);
                    } else {
                        strX5 = spu.X(parcel, i4);
                    }
                }
                spu.ac(parcel, iP4);
                return new SamplerConfigParcelable(iN10, dL, iN11, iN12, strX5);
            case 5:
                int iP5 = spu.P(parcel);
                while (parcel.dataPosition() < iP5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        zAf3 = spu.af(parcel, i5);
                    } else if (c4 != 2) {
                        spu.ae(parcel, i5);
                    } else {
                        jQ = spu.Q(parcel, i5);
                    }
                }
                spu.ac(parcel, iP5);
                return new SamplerDecisionParcelable(zAf3, jQ);
            case 6:
                int iP6 = spu.P(parcel);
                IBinder iBinderS = null;
                boolean zAf5 = false;
                while (parcel.dataPosition() < iP6) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 1) {
                        strX4 = spu.X(parcel, i6);
                    } else if (c5 == 2) {
                        iBinderS = spu.S(parcel, i6);
                    } else if (c5 == 3) {
                        zAf2 = spu.af(parcel, i6);
                    } else if (c5 != 4) {
                        spu.ae(parcel, i6);
                    } else {
                        zAf5 = spu.af(parcel, i6);
                    }
                }
                spu.ac(parcel, iP6);
                return new GoogleCertificatesQuery(strX4, iBinderS, zAf2, zAf5);
            case 7:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(iDataPosition - 4);
                    return ApiMetadata.a;
                }
                int iP7 = spu.P(parcel);
                while (parcel.dataPosition() < iP7) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 1) {
                        complianceOptions = (ComplianceOptions) spu.T(parcel, i7, ComplianceOptions.CREATOR);
                    } else if (c6 != 2) {
                        spu.ae(parcel, i7);
                    } else {
                        zAf = spu.af(parcel, i7);
                    }
                }
                spu.ac(parcel, iP7);
                return new ApiMetadata(complianceOptions, zAf);
            case 8:
                int iP8 = spu.P(parcel);
                boolean zAf6 = true;
                int iN13 = 0;
                int iN14 = 0;
                while (parcel.dataPosition() < iP8) {
                    int i8 = parcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 1) {
                        iN7 = spu.N(parcel, i8);
                    } else if (c7 == 2) {
                        iN13 = spu.N(parcel, i8);
                    } else if (c7 == 3) {
                        iN14 = spu.N(parcel, i8);
                    } else if (c7 != 4) {
                        spu.ae(parcel, i8);
                    } else {
                        zAf6 = spu.af(parcel, i8);
                    }
                }
                spu.ac(parcel, iP8);
                return new ComplianceOptions(iN7, iN13, iN14, zAf6);
            case 9:
                int iP9 = spu.P(parcel);
                while (parcel.dataPosition() < iP9) {
                    int i9 = parcel.readInt();
                    char c8 = (char) i9;
                    if (c8 == 1) {
                        iN6 = spu.N(parcel, i9);
                    } else if (c8 != 2) {
                        spu.ae(parcel, i9);
                    } else {
                        strX3 = spu.X(parcel, i9);
                    }
                }
                spu.ac(parcel, iP9);
                return new Scope(iN6, strX3);
            case 10:
                int iP10 = spu.P(parcel);
                String[] strArrAj = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleR = null;
                int iN15 = 0;
                int iN16 = 0;
                while (parcel.dataPosition() < iP10) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 1) {
                        strArrAj = spu.aj(parcel, i10);
                    } else if (c9 == 2) {
                        cursorWindowArr = (CursorWindow[]) spu.ai(parcel, i10, CursorWindow.CREATOR);
                    } else if (c9 == 3) {
                        iN16 = spu.N(parcel, i10);
                    } else if (c9 == 4) {
                        bundleR = spu.R(parcel, i10);
                    } else if (c9 != 1000) {
                        spu.ae(parcel, i10);
                    } else {
                        iN15 = spu.N(parcel, i10);
                    }
                }
                spu.ac(parcel, iP10);
                DataHolder dataHolder = new DataHolder(iN15, strArrAj, cursorWindowArr, iN16, bundleR);
                dataHolder.c = new Bundle();
                int i11 = 0;
                while (true) {
                    String[] strArr = dataHolder.b;
                    if (i11 >= strArr.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.d;
                        dataHolder.g = new int[cursorWindowArr2.length];
                        int numRows = 0;
                        for (int i12 = 0; i12 < cursorWindowArr2.length; i12++) {
                            dataHolder.g[i12] = numRows;
                            numRows += cursorWindowArr2[i12].getNumRows() - (numRows - cursorWindowArr2[i12].getStartPosition());
                        }
                        return dataHolder;
                    }
                    dataHolder.c.putInt(strArr[i11], i11);
                    i11++;
                }
            case 11:
                int iP11 = spu.P(parcel);
                while (parcel.dataPosition() < iP11) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        iN5 = spu.N(parcel, i13);
                    } else if (c10 != 2) {
                        spu.ae(parcel, i13);
                    } else {
                        strX2 = spu.X(parcel, i13);
                    }
                }
                spu.ac(parcel, iP11);
                return new ClientIdentity(iN5, strX2);
            case 12:
                int iP12 = spu.P(parcel);
                long jQ2 = 0;
                String strX6 = null;
                int iN17 = 0;
                int iN18 = 0;
                boolean zAf7 = false;
                while (parcel.dataPosition() < iP12) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        iN17 = spu.N(parcel, i14);
                    } else if (c11 == 2) {
                        strX6 = spu.X(parcel, i14);
                    } else if (c11 == 3) {
                        jQ2 = spu.Q(parcel, i14);
                    } else if (c11 == 4) {
                        iN18 = spu.N(parcel, i14);
                    } else if (c11 != 5) {
                        spu.ae(parcel, i14);
                    } else {
                        zAf7 = spu.af(parcel, i14);
                    }
                }
                spu.ac(parcel, iP12);
                return new ClientNotificationEvent(iN17, strX6, jQ2, iN18, zAf7);
            case 13:
                int iP13 = spu.P(parcel);
                int iN19 = 0;
                while (parcel.dataPosition() < iP13) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 1) {
                        iN4 = spu.N(parcel, i15);
                    } else if (c12 == 2) {
                        strX = spu.X(parcel, i15);
                    } else if (c12 != 3) {
                        spu.ae(parcel, i15);
                    } else {
                        iN19 = spu.N(parcel, i15);
                    }
                }
                spu.ac(parcel, iP13);
                return new ClientThrottlingTelemetryData.ClientThrottlingEventData(iN4, strX, iN19);
            case 14:
                int iP14 = spu.P(parcel);
                while (parcel.dataPosition() < iP14) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        spu.ae(parcel, i16);
                    } else {
                        arrayListAb3 = spu.ab(parcel, i16, ClientThrottlingTelemetryData.ClientThrottlingEventData.CREATOR);
                    }
                }
                spu.ac(parcel, iP14);
                return new ClientThrottlingTelemetryData(arrayListAb3);
            case 15:
                int iP15 = spu.P(parcel);
                RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArrAh = null;
                int[] iArrAh2 = null;
                boolean zAf8 = false;
                boolean zAf9 = false;
                int iN20 = 0;
                while (parcel.dataPosition() < iP15) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            rootTelemetryConfiguration = (RootTelemetryConfiguration) spu.T(parcel, i17, RootTelemetryConfiguration.CREATOR);
                            break;
                        case 2:
                            zAf8 = spu.af(parcel, i17);
                            break;
                        case 3:
                            zAf9 = spu.af(parcel, i17);
                            break;
                        case 4:
                            iArrAh = spu.ah(parcel, i17);
                            break;
                        case 5:
                            iN20 = spu.N(parcel, i17);
                            break;
                        case 6:
                            iArrAh2 = spu.ah(parcel, i17);
                            break;
                        default:
                            spu.ae(parcel, i17);
                            break;
                    }
                }
                spu.ac(parcel, iP15);
                return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zAf8, zAf9, iArrAh, iN20, iArrAh2);
            case 16:
                int iP16 = spu.P(parcel);
                while (true) {
                    SparseArray sparseArray = null;
                    while (parcel.dataPosition() < iP16) {
                        int i18 = parcel.readInt();
                        if (((char) i18) != 1) {
                            spu.ae(parcel, i18);
                        } else {
                            Parcelable.Creator<ThrottlingLimits> creator = ThrottlingLimits.CREATOR;
                            int iO = spu.O(parcel, i18);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iO == 0) {
                                break;
                            }
                            int i19 = parcel.readInt();
                            SparseArray sparseArray2 = new SparseArray();
                            for (int i20 = 0; i20 < i19; i20++) {
                                sparseArray2.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
                            }
                            parcel.setDataPosition(iDataPosition2 + iO);
                            sparseArray = sparseArray2;
                        }
                    }
                    spu.ac(parcel, iP16);
                    return new ConnectionThrottlingConfig(sparseArray);
                    break;
                }
            case 17:
                int iP17 = spu.P(parcel);
                int iN21 = -1;
                long jQ3 = 0;
                long jQ4 = 0;
                String strX7 = null;
                String strX8 = null;
                int iN22 = 0;
                int iN23 = 0;
                int iN24 = 0;
                int iN25 = 0;
                while (parcel.dataPosition() < iP17) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            iN22 = spu.N(parcel, i21);
                            break;
                        case 2:
                            iN23 = spu.N(parcel, i21);
                            break;
                        case 3:
                            iN24 = spu.N(parcel, i21);
                            break;
                        case 4:
                            jQ3 = spu.Q(parcel, i21);
                            break;
                        case 5:
                            jQ4 = spu.Q(parcel, i21);
                            break;
                        case 6:
                            strX7 = spu.X(parcel, i21);
                            break;
                        case 7:
                            strX8 = spu.X(parcel, i21);
                            break;
                        case '\b':
                            iN25 = spu.N(parcel, i21);
                            break;
                        case '\t':
                            iN21 = spu.N(parcel, i21);
                            break;
                        default:
                            spu.ae(parcel, i21);
                            break;
                    }
                }
                spu.ac(parcel, iP17);
                return new MethodInvocation(iN22, iN23, iN24, jQ3, jQ4, strX7, strX8, iN25, iN21);
            case 18:
                int iP18 = spu.P(parcel);
                GoogleSignInAccount googleSignInAccount = null;
                int iN26 = 0;
                while (parcel.dataPosition() < iP18) {
                    int i22 = parcel.readInt();
                    char c13 = (char) i22;
                    if (c13 == 1) {
                        iN3 = spu.N(parcel, i22);
                    } else if (c13 == 2) {
                        account = (Account) spu.T(parcel, i22, Account.CREATOR);
                    } else if (c13 == 3) {
                        iN26 = spu.N(parcel, i22);
                    } else if (c13 != 4) {
                        spu.ae(parcel, i22);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) spu.T(parcel, i22, GoogleSignInAccount.CREATOR);
                    }
                }
                spu.ac(parcel, iP18);
                return new ResolveAccountRequest(iN3, account, iN26, googleSignInAccount);
            case 19:
                int iP19 = spu.P(parcel);
                IBinder iBinderS2 = null;
                ConnectionResult connectionResult = null;
                int iN27 = 0;
                boolean zAf10 = false;
                boolean zAf11 = false;
                while (parcel.dataPosition() < iP19) {
                    int i23 = parcel.readInt();
                    char c14 = (char) i23;
                    if (c14 == 1) {
                        iN27 = spu.N(parcel, i23);
                    } else if (c14 == 2) {
                        iBinderS2 = spu.S(parcel, i23);
                    } else if (c14 == 3) {
                        connectionResult = (ConnectionResult) spu.T(parcel, i23, ConnectionResult.CREATOR);
                    } else if (c14 == 4) {
                        zAf10 = spu.af(parcel, i23);
                    } else if (c14 != 5) {
                        spu.ae(parcel, i23);
                    } else {
                        zAf11 = spu.af(parcel, i23);
                    }
                }
                spu.ac(parcel, iP19);
                return new ResolveAccountResponse(iN27, iBinderS2, connectionResult, zAf10, zAf11);
            default:
                int iP20 = spu.P(parcel);
                while (parcel.dataPosition() < iP20) {
                    int i24 = parcel.readInt();
                    char c15 = (char) i24;
                    if (c15 == 1) {
                        iN2 = spu.N(parcel, i24);
                    } else if (c15 != 2) {
                        spu.ae(parcel, i24);
                    } else {
                        arrayListAb2 = spu.ab(parcel, i24, MethodInvocation.CREATOR);
                    }
                }
                spu.ac(parcel, iP20);
                return new TelemetryData(iN2, arrayListAb2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.b) {
            case 0:
                return new BatchedLogEventParcelable[i];
            case 1:
                return new FsmController.StackEntry[i];
            case 2:
                return new DataCollectionIdentifierParcelable[i];
            case 3:
                return new LogVerifierResultParcelable[i];
            case 4:
                return new SamplerConfigParcelable[i];
            case 5:
                return new SamplerDecisionParcelable[i];
            case 6:
                return new GoogleCertificatesQuery[i];
            case 7:
                return new ApiMetadata[i];
            case 8:
                return new ComplianceOptions[i];
            case 9:
                return new Scope[i];
            case 10:
                return new DataHolder[i];
            case 11:
                return new ClientIdentity[i];
            case 12:
                return new ClientNotificationEvent[i];
            case 13:
                return new ClientThrottlingTelemetryData.ClientThrottlingEventData[i];
            case 14:
                return new ClientThrottlingTelemetryData[i];
            case 15:
                return new ConnectionTelemetryConfiguration[i];
            case 16:
                return new ConnectionThrottlingConfig[i];
            case 17:
                return new MethodInvocation[i];
            case 18:
                return new ResolveAccountRequest[i];
            case 19:
                return new ResolveAccountResponse[i];
            default:
                return new TelemetryData[i];
        }
    }
}
