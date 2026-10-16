package com.waze.sharedui.utils;

import com.waze.config.ConfigValues;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n extends HashMap {
    n() {
        put("android.permission.ACCESS_FINE_LOCATION", ConfigValues.CONFIG_VALUE_PERMISSIONS_LOCATION);
        put("android.permission.ACCESS_COARSE_LOCATION", ConfigValues.CONFIG_VALUE_PERMISSIONS_LOCATION);
        put("android.permission.READ_CONTACTS", ConfigValues.CONFIG_VALUE_PERMISSIONS_CONTACTS);
        put("android.permission.READ_CALENDAR", ConfigValues.CONFIG_VALUE_PERMISSIONS_CALENDAR);
        put("android.permission.RECORD_AUDIO", ConfigValues.CONFIG_VALUE_PERMISSIONS_MICROPHONE);
        put("android.permission.CAMERA", ConfigValues.CONFIG_VALUE_PERMISSIONS_CAMERA);
    }
}
