package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class sxs extends defpackage.ijw implements android.os.IInterface {
    public sxs() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    public void a(com.google.android.gms.common.api.Status status, com.google.android.gms.usagereporting.UsageReportingOptInOptions usageReportingOptInOptions) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Not implemented.");
    }

    public void b(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Not implemented.");
    }

    public void c(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Not implemented.");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        switch (i) {
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.usagereporting.UsageReportingOptInOptions usageReportingOptInOptions = (com.google.android.gms.usagereporting.UsageReportingOptInOptions) defpackage.ijx.a(parcel, com.google.android.gms.usagereporting.UsageReportingOptInOptions.CREATOR);
                defpackage.ijx.d(parcel);
                a(status, usageReportingOptInOptions);
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.ijx.d(parcel);
                b(status2);
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.ijx.d(parcel);
                c(status3);
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                parcel.createStringArrayList();
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                parcel.readInt();
                defpackage.ijx.a(parcel, com.google.android.gms.usagereporting.ConsentInformation.CREATOR);
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 9:
                defpackage.ijx.a(parcel, com.google.android.gms.usagereporting.ConsentInformation.CREATOR);
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented");
            case 10:
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented");
            case 11:
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 12:
                defpackage.ijx.a(parcel, com.google.android.gms.usagereporting.ElCapitanOptions.CREATOR);
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 13:
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 14:
                defpackage.ijx.a(parcel, com.google.android.gms.usagereporting.SafetyOptions.CREATOR);
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 15:
                defpackage.ijx.a(parcel, com.google.android.gms.usagereporting.ConsentInformation.CREATOR);
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            default:
                return false;
        }
    }
}
