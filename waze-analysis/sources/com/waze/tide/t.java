package com.waze.tide;

import android.content.Context;
import android.os.Build;
import android.os.DeadSystemException;
import androidx.core.content.ContextCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t {
    public static final u a(Context context) {
        h.g.b.x.f(context, "context");
        try {
            return ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") != 0 ? u.f40962d : ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION") != 0 ? u.f40961c : u.f40960b;
        } catch (DeadSystemException e2) {
            com.waze.shared_infra.i.h.f("TidePermissionsHelper", "Failed to get location permission state", e2);
            return u.f40959a;
        }
    }

    public static final boolean b(Context context) {
        h.g.b.x.f(context, "context");
        return Build.VERSION.SDK_INT < 31 || ContextCompat.checkSelfPermission(context, "android.permission.BLUETOOTH_CONNECT") == 0;
    }
}
