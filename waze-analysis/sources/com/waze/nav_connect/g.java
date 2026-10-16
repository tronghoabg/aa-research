package com.waze.nav_connect;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.core.content.IntentCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.nav_connect.a.f f30866a;

    public g(a aVar, com.waze.nav_connect.a.f fVar) {
        x.f(aVar, "config");
        x.f(fVar, "navConnectRepository");
        this.f30866a = fVar;
    }

    public final boolean a(Intent intent) {
        x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        if (!a.e()) {
            return false;
        }
        Uri data = intent.getData();
        String queryParameter = null;
        if (data != null && data.isHierarchical()) {
            queryParameter = data.getQueryParameter("external_trip_token");
        }
        if (queryParameter == null) {
            return false;
        }
        this.f30866a.d(queryParameter, (PendingIntent) ((Parcelable) IntentCompat.getParcelableExtra(intent, "pendingIntent", PendingIntent.class)));
        return true;
    }
}
