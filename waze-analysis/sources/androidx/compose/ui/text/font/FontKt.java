package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FontKt {
    /* renamed from: Font-F3nL8kk, reason: not valid java name */
    public static final Font m10637FontF3nL8kk(int i2, FontWeight fontWeight, int i3, int i4, FontVariation.Settings settings) {
        return new ResourceFont(i2, fontWeight, i3, settings, i4, null);
    }

    /* renamed from: Font-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ Font m10638FontF3nL8kk$default(int i2, FontWeight fontWeight, int i3, int i4, FontVariation.Settings settings, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i5 & 4) != 0) {
            i3 = FontStyle.Companion.m10668getNormal_LCdwA();
        }
        if ((i5 & 8) != 0) {
            i4 = FontLoadingStrategy.Companion.m10653getBlockingPKNRLFQ();
        }
        if ((i5 & 16) != 0) {
            settings = FontVariation.INSTANCE.m10684Settings6EWAqTQ(fontWeight, i3, new FontVariation.Setting[0]);
        }
        return m10637FontF3nL8kk(i2, fontWeight, i3, i4, settings);
    }

    /* renamed from: Font-RetOiIg, reason: not valid java name */
    public static final /* synthetic */ Font m10639FontRetOiIg(int i2, FontWeight fontWeight, int i3) {
        return new ResourceFont(i2, fontWeight, i3, null, FontLoadingStrategy.Companion.m10653getBlockingPKNRLFQ(), 8, null);
    }

    /* renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Font m10640FontRetOiIg$default(int i2, FontWeight fontWeight, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i4 & 4) != 0) {
            i3 = FontStyle.Companion.m10668getNormal_LCdwA();
        }
        return m10639FontRetOiIg(i2, fontWeight, i3);
    }

    /* renamed from: Font-YpTlLL0, reason: not valid java name */
    public static final Font m10641FontYpTlLL0(int i2, FontWeight fontWeight, int i3, int i4) {
        return new ResourceFont(i2, fontWeight, i3, new FontVariation.Settings(new FontVariation.Setting[0]), i4, null);
    }

    /* renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ Font m10642FontYpTlLL0$default(int i2, FontWeight fontWeight, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i5 & 4) != 0) {
            i3 = FontStyle.Companion.m10668getNormal_LCdwA();
        }
        if ((i5 & 8) != 0) {
            i4 = FontLoadingStrategy.Companion.m10653getBlockingPKNRLFQ();
        }
        return m10641FontYpTlLL0(i2, fontWeight, i3, i4);
    }

    public static final FontFamily toFontFamily(Font font) {
        return FontFamilyKt.FontFamily(font);
    }
}
