package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    final int b;
    public final int c;
    public final android.app.PendingIntent d;
    public final java.lang.String e;
    public final java.lang.Integer f;
    public static final com.google.android.gms.common.ConnectionResult a = new com.google.android.gms.common.ConnectionResult(1, 0, null, null, null);
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.ConnectionResult> CREATOR = new defpackage.rcy(18);

    public ConnectionResult(int i, int i2, android.app.PendingIntent pendingIntent, java.lang.String str, java.lang.Integer num) {
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
        this.f = num;
    }

    public static java.lang.String a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.SUCCESS;
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    case 26:
                        return "FEATURE_MISSING_OR_NEEDS_UPDATE";
                    default:
                        return defpackage.a.bm(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean b() {
        return (this.c == 0 || this.d == null) ? false : true;
    }

    public final boolean c() {
        return this.c == 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.ConnectionResult)) {
            return false;
        }
        com.google.android.gms.common.ConnectionResult connectionResult = (com.google.android.gms.common.ConnectionResult) obj;
        return this.c == connectionResult.c && j$.util.Objects.equals(this.d, connectionResult.d) && j$.util.Objects.equals(this.e, connectionResult.e) && j$.util.Objects.equals(this.f, connectionResult.f);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.c), this.d, this.e, this.f});
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.sqg.b("statusCode", a(this.c), arrayList);
        defpackage.sqg.b("resolution", this.d, arrayList);
        defpackage.sqg.b("message", this.e, arrayList);
        defpackage.sqg.b("clientMethodKey", this.f, arrayList);
        return defpackage.sqg.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.b);
        defpackage.sqs.v(parcel, 2, this.c);
        defpackage.sqs.I(parcel, 3, this.d, i);
        defpackage.sqs.J(parcel, 4, this.e);
        defpackage.sqs.F(parcel, 5, this.f);
        defpackage.sqs.q(parcel, iP);
    }
}
