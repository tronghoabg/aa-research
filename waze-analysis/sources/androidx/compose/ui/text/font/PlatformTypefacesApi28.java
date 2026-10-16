package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PlatformTypefacesApi28 implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceApi28-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m10695createAndroidTypefaceApi28RetOiIg(String str, FontWeight fontWeight, int i2) {
        String str2;
        if (FontStyle.m10661equalsimpl0(i2, FontStyle.Companion.m10668getNormal_LCdwA()) && x.n(fontWeight, FontWeight.Companion.getNormal()) && ((str2 = str) == null || str2.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        return android.graphics.Typeface.create(str == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(str, 0), fontWeight.getWeight(), FontStyle.m10661equalsimpl0(i2, FontStyle.Companion.m10667getItalic_LCdwA()));
    }

    /* renamed from: createAndroidTypefaceApi28-RetOiIg$default, reason: not valid java name */
    static /* synthetic */ android.graphics.Typeface m10696createAndroidTypefaceApi28RetOiIg$default(PlatformTypefacesApi28 platformTypefacesApi28, String str, FontWeight fontWeight, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            str = null;
        }
        return platformTypefacesApi28.m10695createAndroidTypefaceApi28RetOiIg(str, fontWeight, i2);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m10697loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i2) {
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Typeface typefaceM10695createAndroidTypefaceApi28RetOiIg = m10695createAndroidTypefaceApi28RetOiIg(str, fontWeight, i2);
        if (x.n(typefaceM10695createAndroidTypefaceApi28RetOiIg, TypefaceHelperMethodsApi28.INSTANCE.create(android.graphics.Typeface.DEFAULT, fontWeight.getWeight(), FontStyle.m10661equalsimpl0(i2, FontStyle.Companion.m10667getItalic_LCdwA()))) || x.n(typefaceM10695createAndroidTypefaceApi28RetOiIg, m10695createAndroidTypefaceApi28RetOiIg(null, fontWeight, i2))) {
            return null;
        }
        return typefaceM10695createAndroidTypefaceApi28RetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo10689createDefaultFO1MlWM(FontWeight fontWeight, int i2) {
        return m10695createAndroidTypefaceApi28RetOiIg(null, fontWeight, i2);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo10690createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i2) {
        return m10695createAndroidTypefaceApi28RetOiIg(genericFontFamily.getName(), fontWeight, i2);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public android.graphics.Typeface mo10691optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i2, FontVariation.Settings settings, Context context) {
        return PlatformTypefaces_androidKt.setFontVariationSettings(x.n(str, FontFamily.Companion.getSansSerif().getName()) ? mo10690createNamedRetOiIg(FontFamily.Companion.getSansSerif(), fontWeight, i2) : x.n(str, FontFamily.Companion.getSerif().getName()) ? mo10690createNamedRetOiIg(FontFamily.Companion.getSerif(), fontWeight, i2) : x.n(str, FontFamily.Companion.getMonospace().getName()) ? mo10690createNamedRetOiIg(FontFamily.Companion.getMonospace(), fontWeight, i2) : x.n(str, FontFamily.Companion.getCursive().getName()) ? mo10690createNamedRetOiIg(FontFamily.Companion.getCursive(), fontWeight, i2) : m10697loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i2), settings, context);
    }
}
