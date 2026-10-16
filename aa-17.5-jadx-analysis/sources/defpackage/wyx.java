package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public enum wyx {
    SOFTWARE_UPDATE(3, R.string.companion_software_update_title, R.string.companion_software_update_body, R.string.companion_software_update_action, R.drawable.android_auto_icon_large, -1),
    PERMISSIONS_NEEDED(2, R.string.companion_permissions_needed_title, R.string.companion_permissions_needed_body, R.string.companion_permissions_needed_action, -1, -1),
    NOTIFICATION_ACCESS_NEEDED(2, R.string.companion_sensitive_permissions_needed_title, R.string.companion_sensitive_permissions_needed_body, R.string.companion_sensitive_permissions_needed_action, -1, -1),
    HANDWRITING_INPUT(2, R.string.companion_handwriting_input_title, R.string.companion_handwriting_input_body, R.string.companion_handwriting_input_action, -1, -1),
    ANDROID_APPS(4, R.string.companion_android_apps_title, R.string.companion_android_apps_body, R.string.companion_android_apps_action, -1, R.drawable.great_apps_illustration),
    COMPATIBLE_CARS(2, R.string.companion_compatible_cars_title, R.string.companion_compatible_cars_body, R.string.companion_compatible_cars_action, -1, -1);

    final int g;
    final int h;
    final int i;
    final int j;
    final int k;
    final int l;

    wyx(int i, int i2, int i3, int i4, int i5, int i6) {
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = i6;
    }
}
