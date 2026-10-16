package com.google.firebase.iid;

import android.content.Context;
import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static l f9955a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f9956b = null;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f9957c = null;

    private l() {
    }

    public static synchronized l a() {
        l lVar;
        lVar = f9955a;
        if (lVar == null) {
            lVar = new l();
            f9955a = lVar;
        }
        return lVar;
    }

    final boolean b(Context context) {
        if (this.f9957c == null) {
            this.f9957c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f9956b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f9957c.booleanValue();
    }

    final boolean c(Context context) {
        Boolean boolValueOf = this.f9956b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            this.f9956b = boolValueOf;
        }
        if (!boolValueOf.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f9956b.booleanValue();
    }
}
