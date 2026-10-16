package cl.coders.faketraveler;

import java.util.Locale;

/* loaded from: classes.dex */
public final class MapProviderUtil {
    private MapProviderUtil() {
        throw new UnsupportedOperationException();
    }

    public static String getDefaultMapProvider(Locale locale) {
        String language = locale.getLanguage();
        return language.equals("de") ? "OpenStreetMap.DE" : language.equals("fr") ? "OpenStreetMap.France" : "OpenStreetMap";
    }
}
