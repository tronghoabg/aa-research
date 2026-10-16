package android.support.v7.app;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.core.os.LocaleListCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ad {
    static LocaleListCompat a(Configuration configuration) {
        return LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
    }

    static void b(Configuration configuration, LocaleListCompat localeListCompat) {
        configuration.setLocales(LocaleList.forLanguageTags(localeListCompat.toLanguageTags()));
    }
}
