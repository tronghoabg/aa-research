package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PlatformTypefacesApi implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m10692createAndroidTypefaceUsingTypefaceStyleRetOiIg(String str, FontWeight fontWeight, int i2) {
        String str2;
        if (FontStyle.m10661equalsimpl0(i2, FontStyle.Companion.m10668getNormal_LCdwA()) && x.n(fontWeight, FontWeight.Companion.getNormal()) && ((str2 = str) == null || str2.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        int iM10612getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m10612getAndroidTypefaceStyleFO1MlWM(fontWeight, i2);
        String str3 = str;
        return (str3 == null || str3.length() == 0) ? android.graphics.Typeface.defaultFromStyle(iM10612getAndroidTypefaceStyleFO1MlWM) : android.graphics.Typeface.create(str, iM10612getAndroidTypefaceStyleFO1MlWM);
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default, reason: not valid java name */
    static /* synthetic */ android.graphics.Typeface m10693createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(PlatformTypefacesApi platformTypefacesApi, String str, FontWeight fontWeight, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 & 4) != 0) {
            i2 = FontStyle.Companion.m10668getNormal_LCdwA();
        }
        if (1 == (i3 & 1)) {
            str = null;
        }
        return platformTypefacesApi.m10692createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i2);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m10694loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i2) {
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Typeface typefaceM10692createAndroidTypefaceUsingTypefaceStyleRetOiIg = m10692createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i2);
        if (x.n(typefaceM10692createAndroidTypefaceUsingTypefaceStyleRetOiIg, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, AndroidFontUtils_androidKt.m10612getAndroidTypefaceStyleFO1MlWM(fontWeight, i2))) || x.n(typefaceM10692createAndroidTypefaceUsingTypefaceStyleRetOiIg, m10692createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i2))) {
            return null;
        }
        return typefaceM10692createAndroidTypefaceUsingTypefaceStyleRetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo10689createDefaultFO1MlWM(FontWeight fontWeight, int i2) {
        return m10692createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i2);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo10690createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i2) {
        android.graphics.Typeface typefaceM10694loadNamedFromTypefaceCacheOrNullRetOiIg = m10694loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefaces_androidKt.getWeightSuffixForFallbackFamilyName(genericFontFamily.getName(), fontWeight), fontWeight, i2);
        return typefaceM10694loadNamedFromTypefaceCacheOrNullRetOiIg == null ? m10692createAndroidTypefaceUsingTypefaceStyleRetOiIg(genericFontFamily.getName(), fontWeight, i2) : typefaceM10694loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public android.graphics.Typeface mo10691optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i2, FontVariation.Settings settings, Context context) {
        return PlatformTypefaces_androidKt.setFontVariationSettings(x.n(str, FontFamily.Companion.getSansSerif().getName()) ? mo10690createNamedRetOiIg(FontFamily.Companion.getSansSerif(), fontWeight, i2) : x.n(str, FontFamily.Companion.getSerif().getName()) ? mo10690createNamedRetOiIg(FontFamily.Companion.getSerif(), fontWeight, i2) : x.n(str, FontFamily.Companion.getMonospace().getName()) ? mo10690createNamedRetOiIg(FontFamily.Companion.getMonospace(), fontWeight, i2) : x.n(str, FontFamily.Companion.getCursive().getName()) ? mo10690createNamedRetOiIg(FontFamily.Companion.getCursive(), fontWeight, i2) : m10694loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i2), settings, context);
    }
}
