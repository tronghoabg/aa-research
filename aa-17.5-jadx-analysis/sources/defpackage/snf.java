package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.ConnectionThrottlingConfig;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class snf implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public snf(int i) {
        this.a = i;
    }

    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(getServiceRequest.c);
        parcel.writeInt(262146);
        parcel.writeInt(getServiceRequest.d);
        parcel.writeInt(262147);
        parcel.writeInt(getServiceRequest.e);
        String str = getServiceRequest.f;
        if (str != null) {
            int iL2 = spu.l(parcel, 4);
            parcel.writeString(str);
            spu.m(parcel, iL2);
        }
        IBinder iBinder = getServiceRequest.g;
        if (iBinder != null) {
            int iL3 = spu.l(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            spu.m(parcel, iL3);
        }
        spu.I(parcel, 6, getServiceRequest.h, i);
        Bundle bundle = getServiceRequest.i;
        if (bundle != null) {
            int iL4 = spu.l(parcel, 7);
            parcel.writeBundle(bundle);
            spu.m(parcel, iL4);
        }
        spu.E(parcel, 8, getServiceRequest.j, i);
        spu.I(parcel, 10, getServiceRequest.k, i);
        spu.I(parcel, 11, getServiceRequest.l, i);
        boolean z = getServiceRequest.m;
        parcel.writeInt(262156);
        parcel.writeInt(z ? 1 : 0);
        int i2 = getServiceRequest.n;
        parcel.writeInt(262157);
        parcel.writeInt(i2);
        boolean z2 = getServiceRequest.o;
        parcel.writeInt(262158);
        parcel.writeInt(z2 ? 1 : 0);
        String str2 = getServiceRequest.p;
        if (str2 != null) {
            int iL5 = spu.l(parcel, 15);
            parcel.writeString(str2);
            spu.m(parcel, iL5);
        }
        spu.m(parcel, iL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        int iN = 0;
        String strX = null;
        if (i == 0) {
            int iP = spu.P(parcel);
            ParcelFileDescriptor parcelFileDescriptor = null;
            int iN2 = 0;
            while (parcel.dataPosition() < iP) {
                int i2 = parcel.readInt();
                char c = (char) i2;
                if (c == 1) {
                    iN = spu.N(parcel, i2);
                } else if (c == 2) {
                    parcelFileDescriptor = (ParcelFileDescriptor) spu.T(parcel, i2, ParcelFileDescriptor.CREATOR);
                } else if (c != 3) {
                    spu.ae(parcel, i2);
                } else {
                    iN2 = spu.N(parcel, i2);
                }
            }
            spu.ac(parcel, iP);
            return new BitmapTeleporter(iN, parcelFileDescriptor, iN2);
        }
        if (i == 1) {
            int iP2 = spu.P(parcel);
            PendingIntent pendingIntent = null;
            ConnectionResult connectionResult = null;
            while (parcel.dataPosition() < iP2) {
                int i3 = parcel.readInt();
                char c2 = (char) i3;
                if (c2 == 1) {
                    spu.ad(parcel, i3, 4);
                    iN = parcel.readInt();
                } else if (c2 == 2) {
                    strX = spu.X(parcel, i3);
                } else if (c2 == 3) {
                    pendingIntent = (PendingIntent) spu.T(parcel, i3, PendingIntent.CREATOR);
                } else if (c2 != 4) {
                    spu.ae(parcel, i3);
                } else {
                    connectionResult = (ConnectionResult) spu.T(parcel, i3, ConnectionResult.CREATOR);
                }
            }
            spu.ac(parcel, iP2);
            return new Status(iN, strX, pendingIntent, connectionResult);
        }
        if (i == 2) {
            int iP3 = spu.P(parcel);
            int i4 = 0;
            Bundle bundleR = null;
            Feature[] featureArr = null;
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
            ConnectionThrottlingConfig connectionThrottlingConfig = null;
            while (parcel.dataPosition() < iP3) {
                int i5 = parcel.readInt();
                char c3 = (char) i5;
                if (c3 == 1) {
                    bundleR = spu.R(parcel, i5);
                } else if (c3 == 2) {
                    featureArr = (Feature[]) spu.ai(parcel, i5, Feature.CREATOR);
                } else if (c3 == 3) {
                    spu.ad(parcel, i5, 4);
                    i4 = parcel.readInt();
                } else if (c3 == 4) {
                    connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) spu.T(parcel, i5, ConnectionTelemetryConfiguration.CREATOR);
                } else if (c3 != 5) {
                    spu.ae(parcel, i5);
                } else {
                    connectionThrottlingConfig = (ConnectionThrottlingConfig) spu.T(parcel, i5, ConnectionThrottlingConfig.CREATOR);
                }
            }
            spu.ac(parcel, iP3);
            return new ConnectionInfo(bundleR, featureArr, i4, connectionTelemetryConfiguration, connectionThrottlingConfig);
        }
        if (i == 3) {
            int iP4 = spu.P(parcel);
            Scope[] scopeArr = GetServiceRequest.a;
            Bundle bundle = new Bundle();
            Feature[] featureArr2 = GetServiceRequest.b;
            Feature[] featureArr3 = featureArr2;
            int iN3 = 0;
            int iN4 = 0;
            int iN5 = 0;
            boolean zAf = false;
            int iN6 = 0;
            boolean zAf2 = false;
            String strX2 = null;
            IBinder iBinderS = null;
            Account account = null;
            String strX3 = null;
            while (parcel.dataPosition() < iP4) {
                int i6 = parcel.readInt();
                switch ((char) i6) {
                    case 1:
                        iN3 = spu.N(parcel, i6);
                        break;
                    case 2:
                        iN4 = spu.N(parcel, i6);
                        break;
                    case 3:
                        iN5 = spu.N(parcel, i6);
                        break;
                    case 4:
                        strX2 = spu.X(parcel, i6);
                        break;
                    case 5:
                        iBinderS = spu.S(parcel, i6);
                        break;
                    case 6:
                        scopeArr = (Scope[]) spu.ai(parcel, i6, Scope.CREATOR);
                        break;
                    case 7:
                        bundle = spu.R(parcel, i6);
                        break;
                    case '\b':
                        account = (Account) spu.T(parcel, i6, Account.CREATOR);
                        break;
                    case '\t':
                    default:
                        spu.ae(parcel, i6);
                        break;
                    case '\n':
                        featureArr2 = (Feature[]) spu.ai(parcel, i6, Feature.CREATOR);
                        break;
                    case 11:
                        featureArr3 = (Feature[]) spu.ai(parcel, i6, Feature.CREATOR);
                        break;
                    case '\f':
                        zAf = spu.af(parcel, i6);
                        break;
                    case '\r':
                        iN6 = spu.N(parcel, i6);
                        break;
                    case 14:
                        zAf2 = spu.af(parcel, i6);
                        break;
                    case 15:
                        strX3 = spu.X(parcel, i6);
                        break;
                }
            }
            spu.ac(parcel, iP4);
            return new GetServiceRequest(iN3, iN4, iN5, strX2, iBinderS, scopeArr, bundle, account, featureArr2, featureArr3, zAf, iN6, zAf2, strX3);
        }
        if (i == 4) {
            int iP5 = spu.P(parcel);
            int iN7 = 0;
            boolean zAf3 = false;
            boolean zAf4 = false;
            int iN8 = 0;
            int iN9 = 0;
            while (parcel.dataPosition() < iP5) {
                int i7 = parcel.readInt();
                char c4 = (char) i7;
                if (c4 == 1) {
                    iN7 = spu.N(parcel, i7);
                } else if (c4 == 2) {
                    zAf3 = spu.af(parcel, i7);
                } else if (c4 == 3) {
                    zAf4 = spu.af(parcel, i7);
                } else if (c4 == 4) {
                    iN8 = spu.N(parcel, i7);
                } else if (c4 != 5) {
                    spu.ae(parcel, i7);
                } else {
                    iN9 = spu.N(parcel, i7);
                }
            }
            spu.ac(parcel, iP5);
            return new RootTelemetryConfiguration(iN7, zAf3, zAf4, iN8, iN9);
        }
        if (i != 5) {
            int iP6 = spu.P(parcel);
            int i8 = 0;
            boolean zAf5 = false;
            int i9 = 0;
            boolean zAf6 = false;
            ArrayList arrayListAa = null;
            String strX4 = null;
            while (parcel.dataPosition() < iP6) {
                int i10 = parcel.readInt();
                switch ((char) i10) {
                    case 2:
                        spu.ad(parcel, i10, 4);
                        i8 = parcel.readInt();
                        break;
                    case 3:
                        zAf5 = spu.af(parcel, i10);
                        break;
                    case 4:
                        arrayListAa = spu.aa(parcel, i10);
                        break;
                    case 5:
                        spu.ad(parcel, i10, 4);
                        i9 = parcel.readInt();
                        break;
                    case 6:
                        strX4 = spu.X(parcel, i10);
                        break;
                    case 7:
                        zAf6 = spu.af(parcel, i10);
                        break;
                    default:
                        spu.ae(parcel, i10);
                        break;
                }
            }
            spu.ac(parcel, iP6);
            return new UsageReportingOptInOptions(i8, zAf5, arrayListAa, i9, strX4, zAf6);
        }
        int iP7 = spu.P(parcel);
        String strX5 = null;
        byte[] bArrAg = null;
        byte[][] bArrAk = null;
        byte[][] bArrAk2 = null;
        byte[][] bArrAk3 = null;
        byte[][] bArrAk4 = null;
        int[] iArrAh = null;
        byte[][] bArrAk5 = null;
        int[] iArrAh2 = null;
        byte[][] bArrAk6 = null;
        while (parcel.dataPosition() < iP7) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 2:
                    strX5 = spu.X(parcel, i11);
                    break;
                case 3:
                    bArrAg = spu.ag(parcel, i11);
                    break;
                case 4:
                    bArrAk = spu.ak(parcel, i11);
                    break;
                case 5:
                    bArrAk2 = spu.ak(parcel, i11);
                    break;
                case 6:
                    bArrAk3 = spu.ak(parcel, i11);
                    break;
                case 7:
                    bArrAk4 = spu.ak(parcel, i11);
                    break;
                case '\b':
                    iArrAh = spu.ah(parcel, i11);
                    break;
                case '\t':
                    bArrAk5 = spu.ak(parcel, i11);
                    break;
                case '\n':
                    iArrAh2 = spu.ah(parcel, i11);
                    break;
                case 11:
                    bArrAk6 = spu.ak(parcel, i11);
                    break;
                default:
                    spu.ae(parcel, i11);
                    break;
            }
        }
        spu.ac(parcel, iP7);
        return new ExperimentTokens(strX5, bArrAg, bArrAk, bArrAk2, bArrAk3, bArrAk4, iArrAh, bArrAk5, iArrAh2, bArrAk6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? new UsageReportingOptInOptions[i] : new ExperimentTokens[i] : new RootTelemetryConfiguration[i] : new GetServiceRequest[i] : new ConnectionInfo[i] : new Status[i] : new BitmapTeleporter[i];
    }
}
