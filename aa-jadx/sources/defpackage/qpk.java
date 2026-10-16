package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class qpk extends defpackage.ijw implements android.os.IInterface {
    public qpk() {
        super("com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks");
    }

    public void a(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.aang.GetAccountsResponse getAccountsResponse) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void b(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.aang.GetTokenResponse getTokenResponse) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void c(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.aang.GetTokenResponse getTokenResponse) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.auth.aang.GetAccountsResponse getAccountsResponse = (com.google.android.gms.auth.aang.GetAccountsResponse) defpackage.ijx.a(parcel, com.google.android.gms.auth.aang.GetAccountsResponse.CREATOR);
                defpackage.ijx.d(parcel);
                a(status, getAccountsResponse);
                return true;
            case 2:
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.auth.aang.GetTokenResponse getTokenResponse = (com.google.android.gms.auth.aang.GetTokenResponse) defpackage.ijx.a(parcel, com.google.android.gms.auth.aang.GetTokenResponse.CREATOR);
                defpackage.ijx.d(parcel);
                b(status2, getTokenResponse);
                return true;
            case 3:
                parcel.readInt();
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 4:
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 5:
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 6:
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 7:
                com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.auth.aang.GetTokenResponse getTokenResponse2 = (com.google.android.gms.auth.aang.GetTokenResponse) defpackage.ijx.a(parcel, com.google.android.gms.auth.aang.GetTokenResponse.CREATOR);
                defpackage.ijx.d(parcel);
                c(status3, getTokenResponse2);
                return true;
            case 8:
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            default:
                return false;
        }
    }
}
