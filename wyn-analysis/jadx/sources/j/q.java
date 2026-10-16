package j;

import android.content.res.Configuration;
import android.os.LocaleList;
import g1.C2668d;

/* loaded from: classes.dex */
public abstract class q {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static C2668d b(Configuration configuration) {
        return C2668d.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(C2668d c2668d) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c2668d.f35497a.a()));
    }

    public static void d(Configuration configuration, C2668d c2668d) {
        configuration.setLocales(LocaleList.forLanguageTags(c2668d.f35497a.a()));
    }
}
