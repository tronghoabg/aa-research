package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lgd {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CalendarIconProv");

    public static final int a(android.content.ComponentName componentName, android.os.Bundle bundle, android.content.res.Resources resources) {
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
            android.content.res.TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
            typedArrayObtainTypedArray.getClass();
            defpackage.ojm.a();
            int dayOfMonth = j$.time.Instant.now().atZone((j$.time.ZoneId) defpackage.ojm.a().a).toLocalDate().getDayOfMonth() - 1;
            if (dayOfMonth > typedArrayObtainTypedArray.length()) {
                a.l().B("Index %d out of bounds for array length %d", dayOfMonth, typedArrayObtainTypedArray.length());
                return 0;
            }
            int resourceId = typedArrayObtainTypedArray.getResourceId(dayOfMonth, 0);
            typedArrayObtainTypedArray.recycle();
            return resourceId;
        } catch (android.content.res.Resources.NotFoundException unused) {
            a.l().M("key %s defined but corresponding array not found for component %s", "com.google.android.calendar.dynamic_icons", componentName);
            return 0;
        }
    }
}
