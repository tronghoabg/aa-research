package Y0;

import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.DecimalFormatSymbols;
import android.os.LocaleList;
import android.os.UserManager;
import g1.C2668d;
import java.io.File;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class a {
    public static Context a(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static LocaleList b(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static File c(Context context) {
        return context.getDataDir();
    }

    public static DecimalFormatSymbols d(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static LocaleList e(Configuration configuration) {
        return configuration.getLocales();
    }

    public static boolean f(Context context) {
        return context.isDeviceProtectedStorage();
    }

    public static boolean g(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static void h(Configuration configuration, C2668d c2668d) {
        configuration.setLocales((LocaleList) c2668d.f35497a.getLocaleList());
    }
}
