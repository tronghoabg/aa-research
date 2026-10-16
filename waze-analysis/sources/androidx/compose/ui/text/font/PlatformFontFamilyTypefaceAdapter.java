package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.AndroidTypeface;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    public static final int $stable = 8;
    private final PlatformTypefaces platformTypefaceResolver = PlatformTypefaces_androidKt.PlatformTypefaces();

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, l<? super TypefaceResult.Immutable, ab> lVar, l<? super TypefaceRequest, ? extends Object> lVar2) {
        android.graphics.Typeface typefaceMo10689createDefaultFO1MlWM;
        FontFamily fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null || (fontFamily instanceof DefaultFontFamily)) {
            typefaceMo10689createDefaultFO1MlWM = this.platformTypefaceResolver.mo10689createDefaultFO1MlWM(typefaceRequest.getFontWeight(), typefaceRequest.m10707getFontStyle_LCdwA());
        } else if (fontFamily instanceof GenericFontFamily) {
            typefaceMo10689createDefaultFO1MlWM = this.platformTypefaceResolver.mo10690createNamedRetOiIg((GenericFontFamily) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.m10707getFontStyle_LCdwA());
        } else {
            if (!(fontFamily instanceof LoadedFontFamily)) {
                return null;
            }
            Typeface typeface = ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
            x.d(typeface, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typefaceMo10689createDefaultFO1MlWM = ((AndroidTypeface) typeface).mo10834getNativeTypefacePYhJU0U(typefaceRequest.getFontWeight(), typefaceRequest.m10707getFontStyle_LCdwA(), typefaceRequest.m10708getFontSynthesisGVVA2EU());
        }
        return new TypefaceResult.Immutable(typefaceMo10689createDefaultFO1MlWM, false, 2, null);
    }
}
