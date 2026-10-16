package com.waze.location;

import android.location.Location;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface o extends com.waze.ifs.ui.y {
    Location getLastLocation();

    void init();

    boolean isGpsEnabled();

    com.waze.shared_infra.h.c lastCoordinate();

    void onLogin();

    void registerLocListener(Runnable runnable);

    void setCarCompass(int i2);

    ch<com.waze.bv.n> speedometerData();

    void start();

    void stop();

    void unregisterLocListener(Runnable runnable);
}
