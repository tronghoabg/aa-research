package defpackage;

import android.content.ComponentName;
import android.provider.Settings;
import com.carstream.tech.core.gofa.GofaTap;
import com.carstream.tech.phone.MainActivity;
import java.util.ArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class r4 {
    public static volatile boolean a = false;
    public static int b = Integer.MIN_VALUE;
    public static long c;
    public static final ArrayList d = new ArrayList();

    public static boolean a(MainActivity mainActivity) {
        String string = Settings.Secure.getString(mainActivity.getContentResolver(), "enabled_accessibility_services");
        if (string == null || string.isEmpty()) {
            return false;
        }
        return string.contains(new ComponentName(mainActivity, (Class<?>) GofaTap.class).flattenToString()) || string.contains(new ComponentName(mainActivity, (Class<?>) GofaTap.class).flattenToShortString());
    }
}
