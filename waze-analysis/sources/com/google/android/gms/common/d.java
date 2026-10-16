package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends com.google.android.gms.common.internal.a.a {

    /* renamed from: b, reason: collision with root package name */
    final int f4927b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4928c;

    /* renamed from: d, reason: collision with root package name */
    private final PendingIntent f4929d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4930e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f4931f;

    /* renamed from: a, reason: collision with root package name */
    public static final d f4926a = new d(0);
    public static final Parcelable.Creator<d> CREATOR = new w(1);

    d(int i2, int i3, PendingIntent pendingIntent, String str, Integer num) {
        this.f4927b = i2;
        this.f4928c = i3;
        this.f4929d = pendingIntent;
        this.f4930e = str;
        this.f4931f = num;
    }

    static String e(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
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
                switch (i2) {
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
                        return "UNKNOWN_ERROR_CODE(" + i2 + ")";
                }
        }
    }

    public final int a() {
        return this.f4928c;
    }

    public final PendingIntent b() {
        return this.f4929d;
    }

    public final Integer c() {
        return this.f4931f;
    }

    public final String d() {
        return this.f4930e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f4928c == dVar.f4928c && Objects.equals(this.f4929d, dVar.f4929d) && Objects.equals(this.f4930e, dVar.f4930e) && Objects.equals(this.f4931f, dVar.f4931f);
    }

    public final boolean f() {
        return (this.f4928c == 0 || this.f4929d == null) ? false : true;
    }

    public final boolean g() {
        return this.f4928c == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4928c), this.f4929d, this.f4930e, this.f4931f});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        bb.c("statusCode", e(this.f4928c), arrayList);
        bb.c("resolution", this.f4929d, arrayList);
        bb.c("message", this.f4930e, arrayList);
        bb.c("clientMethodKey", this.f4931f, arrayList);
        return bb.b(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.g(parcel, 1, this.f4927b);
        bb.g(parcel, 2, this.f4928c);
        bb.t(parcel, 3, this.f4929d, i2);
        bb.u(parcel, 4, this.f4930e);
        bb.s(parcel, 5, this.f4931f);
        bb.e(parcel, iD);
    }

    public d(int i2) {
        this(i2, null, null);
    }

    public d(int i2, PendingIntent pendingIntent) {
        this(i2, pendingIntent, null);
    }

    public d(int i2, PendingIntent pendingIntent, String str) {
        this(1, i2, pendingIntent, str, null);
    }

    public d(int i2, PendingIntent pendingIntent, String str, Integer num) {
        this(1, i2, pendingIntent, str, num);
    }
}
