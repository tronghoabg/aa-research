package androidx.compose.ui.text.intl;

import androidx.media3.common.C;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Locale_jvmAndAndroidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Locale parseLanguageTag(String str) {
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str);
        if (x.n(localeForLanguageTag.toLanguageTag(), C.LANGUAGE_UNDETERMINED)) {
            System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }

    public static /* synthetic */ void PlatformLocale$annotations() {
    }
}
