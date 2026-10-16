package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.core.content.ContextCompat;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {
    public static final c a(Context context, b bVar) {
        int iCheckSelfPermission = ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE");
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", iCheckSelfPermission == 0 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return iCheckSelfPermission == 0 ? new d(context, bVar) : new k();
    }
}
