package com.google.firebase.perf.metrics.a;

import com.google.firebase.perf.f.h;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends e {

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10508b = com.google.firebase.perf.c.a.a();

    /* renamed from: c, reason: collision with root package name */
    private final h f10509c;

    a(h hVar) {
        this.f10509c = hVar;
    }

    @Override // com.google.firebase.perf.metrics.a.e
    public final boolean a() {
        com.google.firebase.perf.c.a aVar;
        h hVar = this.f10509c;
        if (hVar == null) {
            aVar = f10508b;
            aVar.i("ApplicationInfo is null");
        } else if (!hVar.hasGoogleAppId()) {
            aVar = f10508b;
            aVar.i("GoogleAppId is null");
        } else if (!hVar.hasAppInstanceId()) {
            aVar = f10508b;
            aVar.i("AppInstanceId is null");
        } else if (!hVar.hasApplicationProcessState()) {
            aVar = f10508b;
            aVar.i("ApplicationProcessState is null");
        } else {
            if (!hVar.hasAndroidAppInfo()) {
                return true;
            }
            if (!hVar.getAndroidAppInfo().hasPackageName()) {
                aVar = f10508b;
                aVar.i("AndroidAppInfo.packageName is null");
            } else {
                if (hVar.getAndroidAppInfo().hasSdkVersion()) {
                    return true;
                }
                aVar = f10508b;
                aVar.i("AndroidAppInfo.sdkVersion is null");
            }
        }
        aVar.i("ApplicationInfo is invalid");
        return false;
    }
}
