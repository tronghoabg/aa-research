package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PlatformTypefaces {
    /* renamed from: createDefault-FO1MlWM, reason: not valid java name */
    android.graphics.Typeface mo10689createDefaultFO1MlWM(FontWeight fontWeight, int i2);

    /* renamed from: createNamed-RetOiIg, reason: not valid java name */
    android.graphics.Typeface mo10690createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i2);

    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM, reason: not valid java name */
    android.graphics.Typeface mo10691optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i2, FontVariation.Settings settings, Context context);
}
