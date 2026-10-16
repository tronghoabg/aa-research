package com.waze.navigate;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.waze.config.ConfigValues;
import com.waze.jni.protos.navigate.NavigationLaneList;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class di {

    /* renamed from: a, reason: collision with root package name */
    public final Object f31238a;

    public di(String str) {
        this.f31238a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    private static String j(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e2) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.config.dh, java.lang.Object] */
    public final int a() {
        com.waze.config.c cVar = ConfigValues.CONFIG_VALUE_NETWORK_GRPC_SERVER_PORT;
        h.g.b.x.e(cVar, "CONFIG_VALUE_NETWORK_GRPC_SERVER_PORT");
        return (int) this.f31238a.a(cVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.config.dh, java.lang.Object] */
    public final long b() {
        com.waze.config.c cVar = ConfigValues.CONFIG_VALUE_NETWORK_GRPC_DEFAULT_REQUEST_TIMEOUT_SECONDS;
        h.g.b.x.e(cVar, "CONFIG_VALUE_NETWORK_GRP…T_REQUEST_TIMEOUT_SECONDS");
        return this.f31238a.a(cVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.config.dh, java.lang.Object] */
    public final long c() {
        com.waze.config.c cVar = ConfigValues.CONFIG_VALUE_NETWORK_ANDROID_GRPC_KEEPALIVE_TIME_SECONDS;
        h.g.b.x.e(cVar, "CONFIG_VALUE_NETWORK_AND…PC_KEEPALIVE_TIME_SECONDS");
        return this.f31238a.a(cVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.config.dh, java.lang.Object] */
    public final long d() {
        com.waze.config.c cVar = ConfigValues.CONFIG_VALUE_NETWORK_ANDROID_GRPC_KEEPALIVE_TIMEOUT_SECONDS;
        h.g.b.x.e(cVar, "CONFIG_VALUE_NETWORK_AND…KEEPALIVE_TIMEOUT_SECONDS");
        return this.f31238a.a(cVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.config.dh, java.lang.Object] */
    public final String e() {
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_NETWORK_GRPC_SERVER_HOST;
        h.g.b.x.e(dVar, "CONFIG_VALUE_NETWORK_GRPC_SERVER_HOST");
        return this.f31238a.b(dVar);
    }

    public final void f(Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", j((String) this.f31238a, "Phonesky is not installed.", objArr));
        }
    }

    public final void g(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", j((String) this.f31238a, str, objArr), th);
        }
    }

    public final void h(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", j((String) this.f31238a, str, objArr));
        }
    }

    public final void i(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", j((String) this.f31238a, str, objArr));
        }
    }

    public di(NavigationInfoNativeManager navigationInfoNativeManager, NavigationLaneList navigationLaneList) {
        Objects.requireNonNull(navigationInfoNativeManager);
        ArrayList arrayList = new ArrayList(navigationLaneList.getNavigationLaneList());
        Collections.sort(arrayList, new com.google.firebase.crashlytics.a.c.h(19));
        this.f31238a = arrayList;
    }

    public di(com.waze.config.dh dhVar) {
        h.g.b.x.f(dhVar, "offlineConfigManager");
        this.f31238a = dhVar;
    }
}
