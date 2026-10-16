package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class smf implements android.os.Parcelable.Creator {
    private final /* synthetic */ int a;

    public smf(int i) {
        this.a = i;
    }

    public static void a(com.google.android.gms.common.internal.GetServiceRequest getServiceRequest, android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(getServiceRequest.c);
        parcel.writeInt(262146);
        parcel.writeInt(getServiceRequest.d);
        parcel.writeInt(262147);
        parcel.writeInt(getServiceRequest.e);
        java.lang.String str = getServiceRequest.f;
        if (str != null) {
            int iP2 = defpackage.sqs.p(parcel, 4);
            parcel.writeString(str);
            defpackage.sqs.q(parcel, iP2);
        }
        android.os.IBinder iBinder = getServiceRequest.g;
        if (iBinder != null) {
            int iP3 = defpackage.sqs.p(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            defpackage.sqs.q(parcel, iP3);
        }
        defpackage.sqs.M(parcel, 6, getServiceRequest.h, i);
        android.os.Bundle bundle = getServiceRequest.i;
        if (bundle != null) {
            int iP4 = defpackage.sqs.p(parcel, 7);
            parcel.writeBundle(bundle);
            defpackage.sqs.q(parcel, iP4);
        }
        defpackage.sqs.I(parcel, 8, getServiceRequest.j, i);
        defpackage.sqs.M(parcel, 10, getServiceRequest.k, i);
        defpackage.sqs.M(parcel, 11, getServiceRequest.l, i);
        boolean z = getServiceRequest.m;
        parcel.writeInt(262156);
        parcel.writeInt(z ? 1 : 0);
        int i2 = getServiceRequest.n;
        parcel.writeInt(262157);
        parcel.writeInt(i2);
        boolean z2 = getServiceRequest.o;
        parcel.writeInt(262158);
        parcel.writeInt(z2 ? 1 : 0);
        java.lang.String str2 = getServiceRequest.p;
        if (str2 != null) {
            int iP5 = defpackage.sqs.p(parcel, 15);
            parcel.writeString(str2);
            defpackage.sqs.q(parcel, iP5);
        }
        defpackage.sqs.q(parcel, iP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int i = this.a;
        int i2 = 0;
        java.lang.String strAb = null;
        if (i == 0) {
            int iT = defpackage.sqs.T(parcel);
            android.app.PendingIntent pendingIntent = null;
            com.google.android.gms.common.ConnectionResult connectionResult = null;
            while (parcel.dataPosition() < iT) {
                int i3 = parcel.readInt();
                char c = (char) i3;
                if (c == 1) {
                    defpackage.sqs.ah(parcel, i3, 4);
                    i2 = parcel.readInt();
                } else if (c == 2) {
                    strAb = defpackage.sqs.ab(parcel, i3);
                } else if (c == 3) {
                    pendingIntent = (android.app.PendingIntent) defpackage.sqs.X(parcel, i3, android.app.PendingIntent.CREATOR);
                } else if (c != 4) {
                    defpackage.sqs.ai(parcel, i3);
                } else {
                    connectionResult = (com.google.android.gms.common.ConnectionResult) defpackage.sqs.X(parcel, i3, com.google.android.gms.common.ConnectionResult.CREATOR);
                }
            }
            defpackage.sqs.ag(parcel, iT);
            return new com.google.android.gms.common.api.Status(i2, strAb, pendingIntent, connectionResult);
        }
        if (i == 1) {
            int iT2 = defpackage.sqs.T(parcel);
            boolean zAj = false;
            int i4 = 0;
            int i5 = 0;
            java.lang.String strAb2 = null;
            long j = -1;
            while (parcel.dataPosition() < iT2) {
                int i6 = parcel.readInt();
                char c2 = (char) i6;
                if (c2 == 1) {
                    zAj = defpackage.sqs.aj(parcel, i6);
                } else if (c2 == 2) {
                    strAb2 = defpackage.sqs.ab(parcel, i6);
                } else if (c2 == 3) {
                    defpackage.sqs.ah(parcel, i6, 4);
                    i4 = parcel.readInt();
                } else if (c2 == 4) {
                    defpackage.sqs.ah(parcel, i6, 4);
                    i5 = parcel.readInt();
                } else if (c2 != 5) {
                    defpackage.sqs.ai(parcel, i6);
                } else {
                    defpackage.sqs.ah(parcel, i6, 8);
                    j = parcel.readLong();
                }
            }
            defpackage.sqs.ag(parcel, iT2);
            return new com.google.android.gms.common.GoogleCertificatesLookupResponse(zAj, strAb2, i4, i5, j);
        }
        if (i == 2) {
            int iT3 = defpackage.sqs.T(parcel);
            int i7 = 0;
            android.os.Bundle bundleV = null;
            com.google.android.gms.common.Feature[] featureArr = null;
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
            com.google.android.gms.common.internal.ConnectionThrottlingConfig connectionThrottlingConfig = null;
            while (parcel.dataPosition() < iT3) {
                int i8 = parcel.readInt();
                char c3 = (char) i8;
                if (c3 == 1) {
                    bundleV = defpackage.sqs.V(parcel, i8);
                } else if (c3 == 2) {
                    featureArr = (com.google.android.gms.common.Feature[]) defpackage.sqs.am(parcel, i8, com.google.android.gms.common.Feature.CREATOR);
                } else if (c3 == 3) {
                    defpackage.sqs.ah(parcel, i8, 4);
                    i7 = parcel.readInt();
                } else if (c3 == 4) {
                    connectionTelemetryConfiguration = (com.google.android.gms.common.internal.ConnectionTelemetryConfiguration) defpackage.sqs.X(parcel, i8, com.google.android.gms.common.internal.ConnectionTelemetryConfiguration.CREATOR);
                } else if (c3 != 5) {
                    defpackage.sqs.ai(parcel, i8);
                } else {
                    connectionThrottlingConfig = (com.google.android.gms.common.internal.ConnectionThrottlingConfig) defpackage.sqs.X(parcel, i8, com.google.android.gms.common.internal.ConnectionThrottlingConfig.CREATOR);
                }
            }
            defpackage.sqs.ag(parcel, iT3);
            return new com.google.android.gms.common.internal.ConnectionInfo(bundleV, featureArr, i7, connectionTelemetryConfiguration, connectionThrottlingConfig);
        }
        if (i == 3) {
            int iT4 = defpackage.sqs.T(parcel);
            com.google.android.gms.common.api.Scope[] scopeArr = com.google.android.gms.common.internal.GetServiceRequest.a;
            android.os.Bundle bundle = new android.os.Bundle();
            com.google.android.gms.common.Feature[] featureArr2 = com.google.android.gms.common.internal.GetServiceRequest.b;
            com.google.android.gms.common.Feature[] featureArr3 = featureArr2;
            int iR = 0;
            int iR2 = 0;
            int iR3 = 0;
            boolean zAj2 = false;
            int iR4 = 0;
            boolean zAj3 = false;
            java.lang.String strAb3 = null;
            android.os.IBinder iBinderW = null;
            android.accounts.Account account = null;
            java.lang.String strAb4 = null;
            while (parcel.dataPosition() < iT4) {
                int i9 = parcel.readInt();
                switch ((char) i9) {
                    case 1:
                        iR = defpackage.sqs.R(parcel, i9);
                        break;
                    case 2:
                        iR2 = defpackage.sqs.R(parcel, i9);
                        break;
                    case 3:
                        iR3 = defpackage.sqs.R(parcel, i9);
                        break;
                    case 4:
                        strAb3 = defpackage.sqs.ab(parcel, i9);
                        break;
                    case 5:
                        iBinderW = defpackage.sqs.W(parcel, i9);
                        break;
                    case 6:
                        scopeArr = (com.google.android.gms.common.api.Scope[]) defpackage.sqs.am(parcel, i9, com.google.android.gms.common.api.Scope.CREATOR);
                        break;
                    case 7:
                        bundle = defpackage.sqs.V(parcel, i9);
                        break;
                    case '\b':
                        account = (android.accounts.Account) defpackage.sqs.X(parcel, i9, android.accounts.Account.CREATOR);
                        break;
                    case '\t':
                    default:
                        defpackage.sqs.ai(parcel, i9);
                        break;
                    case '\n':
                        featureArr2 = (com.google.android.gms.common.Feature[]) defpackage.sqs.am(parcel, i9, com.google.android.gms.common.Feature.CREATOR);
                        break;
                    case 11:
                        featureArr3 = (com.google.android.gms.common.Feature[]) defpackage.sqs.am(parcel, i9, com.google.android.gms.common.Feature.CREATOR);
                        break;
                    case '\f':
                        zAj2 = defpackage.sqs.aj(parcel, i9);
                        break;
                    case '\r':
                        iR4 = defpackage.sqs.R(parcel, i9);
                        break;
                    case 14:
                        zAj3 = defpackage.sqs.aj(parcel, i9);
                        break;
                    case 15:
                        strAb4 = defpackage.sqs.ab(parcel, i9);
                        break;
                }
            }
            defpackage.sqs.ag(parcel, iT4);
            return new com.google.android.gms.common.internal.GetServiceRequest(iR, iR2, iR3, strAb3, iBinderW, scopeArr, bundle, account, featureArr2, featureArr3, zAj2, iR4, zAj3, strAb4);
        }
        if (i == 4) {
            int iT5 = defpackage.sqs.T(parcel);
            int iR5 = 0;
            boolean zAj4 = false;
            boolean zAj5 = false;
            int iR6 = 0;
            int iR7 = 0;
            while (parcel.dataPosition() < iT5) {
                int i10 = parcel.readInt();
                char c4 = (char) i10;
                if (c4 == 1) {
                    iR5 = defpackage.sqs.R(parcel, i10);
                } else if (c4 == 2) {
                    zAj4 = defpackage.sqs.aj(parcel, i10);
                } else if (c4 == 3) {
                    zAj5 = defpackage.sqs.aj(parcel, i10);
                } else if (c4 == 4) {
                    iR6 = defpackage.sqs.R(parcel, i10);
                } else if (c4 != 5) {
                    defpackage.sqs.ai(parcel, i10);
                } else {
                    iR7 = defpackage.sqs.R(parcel, i10);
                }
            }
            defpackage.sqs.ag(parcel, iT5);
            return new com.google.android.gms.common.internal.RootTelemetryConfiguration(iR5, zAj4, zAj5, iR6, iR7);
        }
        if (i != 5) {
            int iT6 = defpackage.sqs.T(parcel);
            int i11 = 0;
            boolean zAj6 = false;
            int i12 = 0;
            boolean zAj7 = false;
            java.util.ArrayList arrayListAe = null;
            java.lang.String strAb5 = null;
            while (parcel.dataPosition() < iT6) {
                int i13 = parcel.readInt();
                switch ((char) i13) {
                    case 2:
                        defpackage.sqs.ah(parcel, i13, 4);
                        i11 = parcel.readInt();
                        break;
                    case 3:
                        zAj6 = defpackage.sqs.aj(parcel, i13);
                        break;
                    case 4:
                        arrayListAe = defpackage.sqs.ae(parcel, i13);
                        break;
                    case 5:
                        defpackage.sqs.ah(parcel, i13, 4);
                        i12 = parcel.readInt();
                        break;
                    case 6:
                        strAb5 = defpackage.sqs.ab(parcel, i13);
                        break;
                    case 7:
                        zAj7 = defpackage.sqs.aj(parcel, i13);
                        break;
                    default:
                        defpackage.sqs.ai(parcel, i13);
                        break;
                }
            }
            defpackage.sqs.ag(parcel, iT6);
            return new com.google.android.gms.usagereporting.UsageReportingOptInOptions(i11, zAj6, arrayListAe, i12, strAb5, zAj7);
        }
        int iT7 = defpackage.sqs.T(parcel);
        java.lang.String strAb6 = null;
        byte[] bArrAk = null;
        byte[][] bArrAo = null;
        byte[][] bArrAo2 = null;
        byte[][] bArrAo3 = null;
        byte[][] bArrAo4 = null;
        int[] iArrAl = null;
        byte[][] bArrAo5 = null;
        int[] iArrAl2 = null;
        byte[][] bArrAo6 = null;
        while (parcel.dataPosition() < iT7) {
            int i14 = parcel.readInt();
            switch ((char) i14) {
                case 2:
                    strAb6 = defpackage.sqs.ab(parcel, i14);
                    break;
                case 3:
                    bArrAk = defpackage.sqs.ak(parcel, i14);
                    break;
                case 4:
                    bArrAo = defpackage.sqs.ao(parcel, i14);
                    break;
                case 5:
                    bArrAo2 = defpackage.sqs.ao(parcel, i14);
                    break;
                case 6:
                    bArrAo3 = defpackage.sqs.ao(parcel, i14);
                    break;
                case 7:
                    bArrAo4 = defpackage.sqs.ao(parcel, i14);
                    break;
                case '\b':
                    iArrAl = defpackage.sqs.al(parcel, i14);
                    break;
                case '\t':
                    bArrAo5 = defpackage.sqs.ao(parcel, i14);
                    break;
                case '\n':
                    iArrAl2 = defpackage.sqs.al(parcel, i14);
                    break;
                case 11:
                    bArrAo6 = defpackage.sqs.ao(parcel, i14);
                    break;
                default:
                    defpackage.sqs.ai(parcel, i14);
                    break;
            }
        }
        defpackage.sqs.ag(parcel, iT7);
        return new com.google.android.gms.phenotype.ExperimentTokens(strAb6, bArrAk, bArrAo, bArrAo2, bArrAo3, bArrAo4, iArrAl, bArrAo5, iArrAl2, bArrAo6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        int i2 = this.a;
        if (i2 == 0) {
            return new com.google.android.gms.common.api.Status[i];
        }
        if (i2 == 1) {
            return new com.google.android.gms.common.GoogleCertificatesLookupResponse[i];
        }
        if (i2 == 2) {
            return new com.google.android.gms.common.internal.ConnectionInfo[i];
        }
        if (i2 == 3) {
            return new com.google.android.gms.common.internal.GetServiceRequest[i];
        }
        if (i2 != 4) {
            return i2 != 5 ? new com.google.android.gms.usagereporting.UsageReportingOptInOptions[i] : new com.google.android.gms.phenotype.ExperimentTokens[i];
        }
        return new com.google.android.gms.common.internal.RootTelemetryConfiguration[i];
    }
}
