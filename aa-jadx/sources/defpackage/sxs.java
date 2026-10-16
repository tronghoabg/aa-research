package defpackage;

/* JADX INFO: loaded from: classes.dex */
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
            case 2:
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.usagereporting.UsageReportingOptInOptions usageReportingOptInOptions = (com.google.android.gms.usagereporting.UsageReportingOptInOptions) defpackage.ijx.a(parcel, com.google.android.gms.usagereporting.UsageReportingOptInOptions.CREATOR);
                defpackage.ijx.d(parcel);
                a(status, usageReportingOptInOptions);
                return true;
            case 3:
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 4:
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.ijx.d(parcel);
                b(status2);
                return true;
            case 5:
                com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.ijx.d(parcel);
                c(status3);
                return true;
            case 6:
                parcel.createStringArrayList();
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 7:
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 8:
                parcel.readInt();
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 9:
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented");
            case 10:
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented");
            case 11:
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 12:
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 13:
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 14:
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 15:
                defpackage.ijx.d(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            default:
                return false;
        }
    }
}
