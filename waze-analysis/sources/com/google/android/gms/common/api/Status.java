package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.bb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Status extends com.google.android.gms.common.internal.a.a implements ReflectedParcelable, aa {

    /* renamed from: f, reason: collision with root package name */
    private final int f4691f;

    /* renamed from: g, reason: collision with root package name */
    private final String f4692g;

    /* renamed from: h, reason: collision with root package name */
    private final PendingIntent f4693h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.common.d f4694i;

    /* renamed from: a, reason: collision with root package name */
    public static final Status f4686a = new Status(0);

    /* renamed from: b, reason: collision with root package name */
    public static final Status f4687b = new Status(14);

    /* renamed from: c, reason: collision with root package name */
    public static final Status f4688c = new Status(8);

    /* renamed from: d, reason: collision with root package name */
    public static final Status f4689d = new Status(15);

    /* renamed from: e, reason: collision with root package name */
    public static final Status f4690e = new Status(16);
    public static final Parcelable.Creator<Status> CREATOR = new n(3);

    Status(int i2, String str, PendingIntent pendingIntent, com.google.android.gms.common.d dVar) {
        this.f4691f = i2;
        this.f4692g = str;
        this.f4693h = pendingIntent;
        this.f4694i = dVar;
    }

    public final int a() {
        return this.f4691f;
    }

    public final com.google.android.gms.common.d b() {
        return this.f4694i;
    }

    public final String c() {
        return this.f4692g;
    }

    public final boolean d() {
        return this.f4693h != null;
    }

    public final boolean e() {
        return this.f4691f == 16;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4691f == status.f4691f && Objects.equals(this.f4692g, status.f4692g) && Objects.equals(this.f4693h, status.f4693h) && Objects.equals(this.f4694i, status.f4694i);
    }

    public final boolean f() {
        return this.f4691f <= 0;
    }

    public final void g(Activity activity) throws IntentSender.SendIntentException {
        if (d()) {
            Bundle bundle = Build.VERSION.SDK_INT >= 34 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
            PendingIntent pendingIntent = this.f4693h;
            av.m(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1003, null, 0, 0, 0, bundle);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4691f), this.f4692g, this.f4693h, this.f4694i});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.f4692g;
        if (str == null) {
            int i2 = this.f4691f;
            switch (i2) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = "unknown status code: " + i2;
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
                case 23:
                    str = "RATE_LIMIT_EXCEEDED";
                    break;
            }
        }
        bb.c("statusCode", str, arrayList);
        bb.c("resolution", this.f4693h, arrayList);
        return bb.b(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.g(parcel, 1, this.f4691f);
        bb.u(parcel, 2, this.f4692g);
        bb.t(parcel, 3, this.f4693h, i2);
        bb.t(parcel, 4, this.f4694i, i2);
        bb.e(parcel, iD);
    }

    public Status(int i2) {
        this(i2, (String) null);
    }

    public Status(com.google.android.gms.common.d dVar, String str) {
        this(17, str, dVar.b(), dVar);
    }

    public Status(int i2, String str) {
        this(i2, str, null);
    }

    public Status(int i2, String str, byte[] bArr) {
        this(i2, str, null, null);
    }
}
