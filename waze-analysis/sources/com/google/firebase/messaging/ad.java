package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    private static ad f10119a;

    /* renamed from: b, reason: collision with root package name */
    private String f10120b = null;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f10121c = null;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f10122d = null;

    /* renamed from: e, reason: collision with root package name */
    private final Queue f10123e = new ArrayDeque();

    private ad() {
    }

    static synchronized ad c() {
        ad adVar;
        adVar = f10119a;
        if (adVar == null) {
            adVar = new ad();
            f10119a = adVar;
        }
        return adVar;
    }

    private final synchronized String f(Context context, Intent intent) {
        String strConcat;
        String str = this.f10120b;
        if (str != null) {
            return str;
        }
        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveInfoResolveService != null && resolveInfoResolveService.serviceInfo != null) {
            ServiceInfo serviceInfo = resolveInfoResolveService.serviceInfo;
            if (context.getPackageName().equals(serviceInfo.packageName) && serviceInfo.name != null) {
                if (serviceInfo.name.startsWith(".")) {
                    strConcat = String.valueOf(context.getPackageName()).concat(String.valueOf(serviceInfo.name));
                    this.f10120b = strConcat;
                } else {
                    strConcat = serviceInfo.name;
                    this.f10120b = strConcat;
                }
                return strConcat;
            }
            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + DomExceptionUtils.SEPARATOR + serviceInfo.name);
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    public final int a(Context context, Intent intent) {
        ComponentName componentNameStartService;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f10123e.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        String strF = f(context, intent2);
        if (strF != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(strF));
            }
            intent2.setClassName(context.getPackageName(), strF);
        }
        try {
            if (e(context)) {
                componentNameStartService = ar.a(context, intent2);
            } else {
                componentNameStartService = context.startService(intent2);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e2) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(e2.toString()));
            return 402;
        } catch (SecurityException e3) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e3);
            return 401;
        }
    }

    final Intent b() {
        return (Intent) this.f10123e.poll();
    }

    final boolean d(Context context) {
        if (this.f10122d == null) {
            this.f10122d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f10121c.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f10122d.booleanValue();
    }

    final boolean e(Context context) {
        Boolean boolValueOf = this.f10121c;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            this.f10121c = boolValueOf;
        }
        if (!boolValueOf.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f10121c.booleanValue();
    }
}
