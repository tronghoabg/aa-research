package defpackage;

import android.content.ComponentName;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import j$.time.Instant;
import j$.time.ZoneId;

/* loaded from: classes.dex */
public final class lfx {
    public static final yph a = yph.c("GH.CalendarIconProv");

    public static final int a(ComponentName componentName, Bundle bundle, Resources resources) throws Resources.NotFoundException {
        if (bundle == null) {
            a.l().y("metadata was null for activity %s", componentName);
            return 0;
        }
        int i = bundle.getInt("com.google.android.calendar.dynamic_icons", 0);
        if (i == 0) {
            a.l().M("key %s not found in calendar app metadata for component %s", "com.google.android.calendar.dynamic_icons", componentName);
            return 0;
        }
        try {
            TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
            typedArrayObtainTypedArray.getClass();
            oit.a();
            int dayOfMonth = Instant.now().atZone((ZoneId) oit.a().a).toLocalDate().getDayOfMonth() - 1;
            if (dayOfMonth > typedArrayObtainTypedArray.length()) {
                a.l().B("Index %d out of bounds for array length %d", dayOfMonth, typedArrayObtainTypedArray.length());
                return 0;
            }
            int resourceId = typedArrayObtainTypedArray.getResourceId(dayOfMonth, 0);
            typedArrayObtainTypedArray.recycle();
            return resourceId;
        } catch (Resources.NotFoundException unused) {
            a.l().M("key %s defined but corresponding array not found for component %s", "com.google.android.calendar.dynamic_icons", componentName);
            return 0;
        }
    }
}
