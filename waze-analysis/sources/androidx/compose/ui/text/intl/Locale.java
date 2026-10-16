package androidx.compose.ui.text.intl;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Locale {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final java.util.Locale platformLocale;

    public Locale(String str) {
        this(Locale_jvmAndAndroidKt.parseLanguageTag(str));
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Locale)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return x.n(toLanguageTag(), ((Locale) obj).toLanguageTag());
    }

    public final String getLanguage() {
        return this.platformLocale.getLanguage();
    }

    public final java.util.Locale getPlatformLocale() {
        return this.platformLocale;
    }

    public final String getRegion() {
        return this.platformLocale.getCountry();
    }

    public final String getScript() {
        return this.platformLocale.getScript();
    }

    public int hashCode() {
        return toLanguageTag().hashCode();
    }

    public final String toLanguageTag() {
        return this.platformLocale.toLanguageTag();
    }

    public String toString() {
        return toLanguageTag();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Locale getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent().get(0);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public Locale(java.util.Locale locale) {
        this.platformLocale = locale;
    }
}
