package com.bumptech.glide.f;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bumptech.glide.load.o;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap f2880a = new ConcurrentHashMap();

    public static o a(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        String packageName = context.getPackageName();
        o oVar = (o) f2880a.get(packageName);
        if (oVar != null) {
            return oVar;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("AppVersionSignature", "Cannot resolve info for".concat(String.valueOf(context.getPackageName())), e2);
            packageInfo = null;
        }
        d dVar = new d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
        o oVar2 = (o) f2880a.putIfAbsent(packageName, dVar);
        return oVar2 == null ? dVar : oVar2;
    }
}
