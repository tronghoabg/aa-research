package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sjm implements android.os.Parcelable.Creator {
    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) throws spq {
        int iT = defpackage.sqs.T(parcel);
        com.google.android.gms.clearcut.internal.PlayLoggerContext playLoggerContext = null;
        byte[] bArrAk = null;
        int[] iArrAl = null;
        java.lang.String[] strArrAn = null;
        int[] iArrAl2 = null;
        byte[][] bArrAo = null;
        com.google.android.gms.phenotype.ExperimentTokens[] experimentTokensArr = null;
        com.google.android.gms.clearcut.internal.LogVerifierResultParcelable logVerifierResultParcelable = null;
        java.lang.String[] strArrAn2 = null;
        com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable dataCollectionIdentifierParcelable = null;
        com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable batchedLogErrorParcelable = null;
        byte[] bArrAk2 = null;
        java.lang.Long lAa = null;
        int iR = 0;
        boolean zAj = true;
        while (parcel.dataPosition() < iT) {
            int i = parcel.readInt();
            switch ((char) i) {
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    playLoggerContext = (com.google.android.gms.clearcut.internal.PlayLoggerContext) defpackage.sqs.X(parcel, i, com.google.android.gms.clearcut.internal.PlayLoggerContext.CREATOR);
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    bArrAk = defpackage.sqs.ak(parcel, i);
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    iArrAl = defpackage.sqs.al(parcel, i);
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    strArrAn = defpackage.sqs.an(parcel, i);
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    iArrAl2 = defpackage.sqs.al(parcel, i);
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    bArrAo = defpackage.sqs.ao(parcel, i);
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    zAj = defpackage.sqs.aj(parcel, i);
                    break;
                case '\t':
                    experimentTokensArr = (com.google.android.gms.phenotype.ExperimentTokens[]) defpackage.sqs.am(parcel, i, com.google.android.gms.phenotype.ExperimentTokens.CREATOR);
                    break;
                case '\n':
                default:
                    defpackage.sqs.ai(parcel, i);
                    break;
                case 11:
                    logVerifierResultParcelable = (com.google.android.gms.clearcut.internal.LogVerifierResultParcelable) defpackage.sqs.X(parcel, i, com.google.android.gms.clearcut.internal.LogVerifierResultParcelable.CREATOR);
                    break;
                case '\f':
                    strArrAn2 = defpackage.sqs.an(parcel, i);
                    break;
                case '\r':
                    iR = defpackage.sqs.R(parcel, i);
                    break;
                case 14:
                    dataCollectionIdentifierParcelable = (com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable) defpackage.sqs.X(parcel, i, com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable.CREATOR);
                    break;
                case 15:
                    batchedLogErrorParcelable = (com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable) defpackage.sqs.X(parcel, i, com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable.CREATOR);
                    break;
                case 16:
                    bArrAk2 = defpackage.sqs.ak(parcel, i);
                    break;
                case 17:
                    lAa = defpackage.sqs.aa(parcel, i);
                    break;
            }
        }
        defpackage.sqs.ag(parcel, iT);
        return new com.google.android.gms.clearcut.LogEventParcelable(playLoggerContext, bArrAk, iArrAl, strArrAn, iArrAl2, bArrAo, zAj, experimentTokensArr, logVerifierResultParcelable, strArrAn2, iR, dataCollectionIdentifierParcelable, batchedLogErrorParcelable, bArrAk2, lAa);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.clearcut.LogEventParcelable[i];
    }
}
