package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DeviceFontFamilyNameFontKt {
    /* renamed from: Font-vxs03AY, reason: not valid java name */
    public static final Font m10630Fontvxs03AY(String str, FontWeight fontWeight, int i2, FontVariation.Settings settings) {
        return new DeviceFontFamilyNameFont(str, fontWeight, i2, settings, null);
    }

    /* renamed from: Font-vxs03AY$default, reason: not valid java name */
    public static /* synthetic */ Font m10631Fontvxs03AY$default(String str, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 & 4) != 0) {
            i2 = FontStyle.Companion.m10668getNormal_LCdwA();
        }
        if ((i3 & 8) != 0) {
            settings = new FontVariation.Settings(new FontVariation.Setting[0]);
        }
        return m10630Fontvxs03AY(str, fontWeight, i2, settings);
    }
}
