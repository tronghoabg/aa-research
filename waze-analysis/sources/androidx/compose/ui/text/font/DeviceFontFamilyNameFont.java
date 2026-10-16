package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DeviceFontFamilyNameFont extends AndroidFont {
    private final String familyName;
    private final int style;
    private final FontWeight weight;

    private DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i2, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m10654getOptionalLocalPKNRLFQ(), NamedFontLoader.INSTANCE, settings, null);
        this.familyName = str;
        this.weight = fontWeight;
        this.style = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceFontFamilyNameFont)) {
            return false;
        }
        DeviceFontFamilyNameFont deviceFontFamilyNameFont = (DeviceFontFamilyNameFont) obj;
        return DeviceFontFamilyName.m10626equalsimpl0(this.familyName, deviceFontFamilyNameFont.familyName) && x.n(getWeight(), deviceFontFamilyNameFont.getWeight()) && FontStyle.m10661equalsimpl0(mo10613getStyle_LCdwA(), deviceFontFamilyNameFont.mo10613getStyle_LCdwA()) && x.n(getVariationSettings(), deviceFontFamilyNameFont.getVariationSettings());
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo10613getStyle_LCdwA() {
        return this.style;
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((DeviceFontFamilyName.m10627hashCodeimpl(this.familyName) * 31) + getWeight().hashCode()) * 31) + mo10613getStyle_LCdwA()) * 31) + getVariationSettings().hashCode();
    }

    public final android.graphics.Typeface loadCached(Context context) {
        return PlatformTypefaces_androidKt.PlatformTypefaces().mo10691optionalOnDeviceFontFamilyByName78DK7lM(this.familyName, getWeight(), mo10613getStyle_LCdwA(), getVariationSettings(), context);
    }

    public String toString() {
        return "Font(familyName=\"" + ((Object) DeviceFontFamilyName.m10628toStringimpl(this.familyName)) + "\", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m10663toStringimpl(mo10613getStyle_LCdwA())) + ')';
    }

    public /* synthetic */ DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i2, FontVariation.Settings settings, o oVar) {
        this(str, fontWeight, i2, settings);
    }
}
