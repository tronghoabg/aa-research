package com.waze.sdk;

import android.app.PendingIntent;
import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bp {

    /* renamed from: a, reason: collision with root package name */
    final PendingIntent f35361a;

    /* renamed from: b, reason: collision with root package name */
    final Integer f35362b;

    /* renamed from: c, reason: collision with root package name */
    final int f35363c;

    bp(Bundle bundle) {
        this.f35361a = (PendingIntent) bundle.getParcelable("openMeIntent");
        this.f35362b = bundle.containsKey("themeColor") ? Integer.valueOf(bundle.getInt("themeColor")) : null;
        this.f35363c = bundle.getInt("versionCode", 1);
    }

    bp(bo boVar) {
        this.f35361a = null;
        this.f35362b = boVar.f35360a;
        this.f35363c = 10;
    }
}
