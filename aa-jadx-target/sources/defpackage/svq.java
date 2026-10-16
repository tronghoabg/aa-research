package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class svq extends defpackage.ijw implements android.os.IInterface {
    private final defpackage.lhe a;

    public svq(defpackage.lhe lheVar) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.a = lheVar;
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.sqs.aE(status, null, this.a);
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.sqs.aE(status2, null, this.a);
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.sqs.aE(status3, null, this.a);
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                com.google.android.gms.common.api.Status status4 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.phenotype.Configurations configurationsA = defpackage.ijx.a(parcel, com.google.android.gms.phenotype.Configurations.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.sqs.aE(status4, configurationsA, this.a);
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                com.google.android.gms.common.api.Status status5 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.sqs.aE(status5, null, this.a);
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.android.gms.common.api.Status status6 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.phenotype.ExperimentTokens experimentTokens = (com.google.android.gms.phenotype.ExperimentTokens) defpackage.ijx.a(parcel, com.google.android.gms.phenotype.ExperimentTokens.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.sqs.aE(status6, experimentTokens, this.a);
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                com.google.android.gms.common.api.Status status7 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.phenotype.DogfoodsToken dogfoodsTokenA = defpackage.ijx.a(parcel, com.google.android.gms.phenotype.DogfoodsToken.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.sqs.aE(status7, dogfoodsTokenA, this.a);
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                com.google.android.gms.common.api.Status status8 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.sqs.aE(status8, null, this.a);
                return true;
            case 9:
                com.google.android.gms.common.api.Status status9 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.phenotype.Flag flagA = defpackage.ijx.a(parcel, com.google.android.gms.phenotype.Flag.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.sqs.aE(status9, flagA, this.a);
                return true;
            case 10:
                com.google.android.gms.common.api.Status status10 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.phenotype.Configurations configurationsA2 = defpackage.ijx.a(parcel, com.google.android.gms.phenotype.Configurations.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.sqs.aE(status10, configurationsA2, this.a);
                return true;
            case 11:
                com.google.android.gms.common.api.Status status11 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                parcel.readLong();
                defpackage.ijx.d(parcel);
                defpackage.sqs.aE(status11, null, this.a);
                return true;
            case 12:
                com.google.android.gms.common.api.Status status12 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.sqs.aE(status12, null, this.a);
                return true;
            case 13:
                com.google.android.gms.common.api.Status status13 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.phenotype.FlagOverrides flagOverridesA = defpackage.ijx.a(parcel, com.google.android.gms.phenotype.FlagOverrides.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.sqs.aE(status13, flagOverridesA, this.a);
                return true;
            case 14:
                com.google.android.gms.common.api.Status status14 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.sqs.aE(status14, null, this.a);
                return true;
            case 15:
                com.google.android.gms.common.api.Status status15 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.sqs.aE(status15, null, this.a);
                return true;
            case 16:
                com.google.android.gms.common.api.Status status16 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                long j = parcel.readLong();
                defpackage.ijx.d(parcel);
                defpackage.sqs.aE(status16, java.lang.Long.valueOf(j), this.a);
                return true;
            default:
                return false;
        }
    }
}
