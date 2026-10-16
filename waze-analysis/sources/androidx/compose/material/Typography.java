package androidx.compose.material;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.unit.TextUnitKt;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Typography {
    public static final int $stable = 0;
    private final TextStyle body1;
    private final TextStyle body2;
    private final TextStyle button;
    private final TextStyle caption;
    private final TextStyle h1;
    private final TextStyle h2;
    private final TextStyle h3;
    private final TextStyle h4;
    private final TextStyle h5;
    private final TextStyle h6;
    private final TextStyle overline;
    private final TextStyle subtitle1;
    private final TextStyle subtitle2;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Typography(FontFamily fontFamily, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i2, o oVar) {
        TextStyle textStyleM10559copyp1EtxEg$default;
        TextStyle textStyleM10559copyp1EtxEg$default2;
        TextStyle textStyleM10559copyp1EtxEg$default3;
        TextStyle textStyleM10559copyp1EtxEg$default4;
        TextStyle textStyleM10559copyp1EtxEg$default5;
        TextStyle textStyleM10559copyp1EtxEg$default6;
        TextStyle textStyleM10559copyp1EtxEg$default7;
        TextStyle textStyleM10559copyp1EtxEg$default8;
        TextStyle textStyleM10559copyp1EtxEg$default9;
        TextStyle textStyleM10559copyp1EtxEg$default10;
        TextStyle textStyleM10559copyp1EtxEg$default11;
        TextStyle textStyleM10559copyp1EtxEg$default12;
        TextStyle textStyleM10559copyp1EtxEg$default13;
        SystemFontFamily systemFontFamily = (i2 & 1) != 0 ? FontFamily.Companion.getDefault() : fontFamily;
        if ((i2 & 2) != 0) {
            textStyleM10559copyp1EtxEg$default = TextStyle.m10559copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(96), FontWeight.Companion.getLight(), null, null, null, null, TextUnitKt.getSp(-1.5d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(112), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM10559copyp1EtxEg$default = textStyle;
        }
        if ((i2 & 4) != 0) {
            textStyleM10559copyp1EtxEg$default2 = TextStyle.m10559copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(60), FontWeight.Companion.getLight(), null, null, null, null, TextUnitKt.getSp(-0.5d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(72), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM10559copyp1EtxEg$default2 = textStyle2;
        }
        if ((i2 & 8) != 0) {
            textStyleM10559copyp1EtxEg$default3 = TextStyle.m10559copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(48), FontWeight.Companion.getNormal(), null, null, null, null, TextUnitKt.getSp(0), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(56), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM10559copyp1EtxEg$default3 = textStyle3;
        }
        if ((i2 & 16) != 0) {
            textStyleM10559copyp1EtxEg$default4 = TextStyle.m10559copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(34), FontWeight.Companion.getNormal(), null, null, null, null, TextUnitKt.getSp(0.25d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(36), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM10559copyp1EtxEg$default4 = textStyle4;
        }
        if ((i2 & 32) != 0) {
            textStyleM10559copyp1EtxEg$default5 = TextStyle.m10559copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(24), FontWeight.Companion.getNormal(), null, null, null, null, TextUnitKt.getSp(0), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM10559copyp1EtxEg$default5 = textStyle5;
        }
        if ((i2 & 64) != 0) {
            textStyleM10559copyp1EtxEg$default6 = TextStyle.m10559copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(20), FontWeight.Companion.getMedium(), null, null, null, null, TextUnitKt.getSp(0.15d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM10559copyp1EtxEg$default6 = textStyle6;
        }
        if ((i2 & 128) != 0) {
            textStyleM10559copyp1EtxEg$default7 = TextStyle.m10559copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(16), FontWeight.Companion.getNormal(), null, null, null, null, TextUnitKt.getSp(0.15d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM10559copyp1EtxEg$default7 = textStyle7;
        }
        if ((i2 & 256) != 0) {
            textStyleM10559copyp1EtxEg$default8 = TextStyle.m10559copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(14), FontWeight.Companion.getMedium(), null, null, null, null, TextUnitKt.getSp(0.1d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM10559copyp1EtxEg$default8 = textStyle8;
        }
        if ((i2 & 512) != 0) {
            textStyleM10559copyp1EtxEg$default9 = TextStyle.m10559copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(16), FontWeight.Companion.getNormal(), null, null, null, null, TextUnitKt.getSp(0.5d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM10559copyp1EtxEg$default9 = textStyle9;
        }
        if ((i2 & 1024) != 0) {
            textStyleM10559copyp1EtxEg$default10 = TextStyle.m10559copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(14), FontWeight.Companion.getNormal(), null, null, null, null, TextUnitKt.getSp(0.25d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(20), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM10559copyp1EtxEg$default10 = textStyle10;
        }
        if ((i2 & 2048) != 0) {
            textStyleM10559copyp1EtxEg$default11 = TextStyle.m10559copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(14), FontWeight.Companion.getMedium(), null, null, null, null, TextUnitKt.getSp(1.25d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM10559copyp1EtxEg$default11 = textStyle11;
        }
        if ((i2 & 4096) != 0) {
            textStyleM10559copyp1EtxEg$default12 = TextStyle.m10559copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(12), FontWeight.Companion.getNormal(), null, null, null, null, TextUnitKt.getSp(0.4d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM10559copyp1EtxEg$default12 = textStyle12;
        }
        if ((i2 & 8192) != 0) {
            textStyleM10559copyp1EtxEg$default13 = TextStyle.m10559copyp1EtxEg$default(TypographyKt.getDefaultTextStyle(), 0L, TextUnitKt.getSp(10), FontWeight.Companion.getNormal(), null, null, null, null, TextUnitKt.getSp(1.5d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleM10559copyp1EtxEg$default13 = textStyle13;
        }
        this(systemFontFamily, textStyleM10559copyp1EtxEg$default, textStyleM10559copyp1EtxEg$default2, textStyleM10559copyp1EtxEg$default3, textStyleM10559copyp1EtxEg$default4, textStyleM10559copyp1EtxEg$default5, textStyleM10559copyp1EtxEg$default6, textStyleM10559copyp1EtxEg$default7, textStyleM10559copyp1EtxEg$default8, textStyleM10559copyp1EtxEg$default9, textStyleM10559copyp1EtxEg$default10, textStyleM10559copyp1EtxEg$default11, textStyleM10559copyp1EtxEg$default12, textStyleM10559copyp1EtxEg$default13);
    }

    public static /* synthetic */ Typography copy$default(Typography typography, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textStyle = typography.h1;
        }
        return typography.copy(textStyle, (i2 & 2) != 0 ? typography.h2 : textStyle2, (i2 & 4) != 0 ? typography.h3 : textStyle3, (i2 & 8) != 0 ? typography.h4 : textStyle4, (i2 & 16) != 0 ? typography.h5 : textStyle5, (i2 & 32) != 0 ? typography.h6 : textStyle6, (i2 & 64) != 0 ? typography.subtitle1 : textStyle7, (i2 & 128) != 0 ? typography.subtitle2 : textStyle8, (i2 & 256) != 0 ? typography.body1 : textStyle9, (i2 & 512) != 0 ? typography.body2 : textStyle10, (i2 & 1024) != 0 ? typography.button : textStyle11, (i2 & 2048) != 0 ? typography.caption : textStyle12, (i2 & 4096) != 0 ? typography.overline : textStyle13);
    }

    public final Typography copy(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        return new Typography(textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        return x.n(this.h1, typography.h1) && x.n(this.h2, typography.h2) && x.n(this.h3, typography.h3) && x.n(this.h4, typography.h4) && x.n(this.h5, typography.h5) && x.n(this.h6, typography.h6) && x.n(this.subtitle1, typography.subtitle1) && x.n(this.subtitle2, typography.subtitle2) && x.n(this.body1, typography.body1) && x.n(this.body2, typography.body2) && x.n(this.button, typography.button) && x.n(this.caption, typography.caption) && x.n(this.overline, typography.overline);
    }

    public final TextStyle getBody1() {
        return this.body1;
    }

    public final TextStyle getBody2() {
        return this.body2;
    }

    public final TextStyle getButton() {
        return this.button;
    }

    public final TextStyle getCaption() {
        return this.caption;
    }

    public final TextStyle getH1() {
        return this.h1;
    }

    public final TextStyle getH2() {
        return this.h2;
    }

    public final TextStyle getH3() {
        return this.h3;
    }

    public final TextStyle getH4() {
        return this.h4;
    }

    public final TextStyle getH5() {
        return this.h5;
    }

    public final TextStyle getH6() {
        return this.h6;
    }

    public final TextStyle getOverline() {
        return this.overline;
    }

    public final TextStyle getSubtitle1() {
        return this.subtitle1;
    }

    public final TextStyle getSubtitle2() {
        return this.subtitle2;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.h1.hashCode() * 31) + this.h2.hashCode()) * 31) + this.h3.hashCode()) * 31) + this.h4.hashCode()) * 31) + this.h5.hashCode()) * 31) + this.h6.hashCode()) * 31) + this.subtitle1.hashCode()) * 31) + this.subtitle2.hashCode()) * 31) + this.body1.hashCode()) * 31) + this.body2.hashCode()) * 31) + this.button.hashCode()) * 31) + this.caption.hashCode()) * 31) + this.overline.hashCode();
    }

    public String toString() {
        return "Typography(h1=" + this.h1 + ", h2=" + this.h2 + ", h3=" + this.h3 + ", h4=" + this.h4 + ", h5=" + this.h5 + ", h6=" + this.h6 + ", subtitle1=" + this.subtitle1 + ", subtitle2=" + this.subtitle2 + ", body1=" + this.body1 + ", body2=" + this.body2 + ", button=" + this.button + ", caption=" + this.caption + ", overline=" + this.overline + ')';
    }

    public Typography(FontFamily fontFamily, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this(TypographyKt.withDefaultFontFamily(textStyle, fontFamily), TypographyKt.withDefaultFontFamily(textStyle2, fontFamily), TypographyKt.withDefaultFontFamily(textStyle3, fontFamily), TypographyKt.withDefaultFontFamily(textStyle4, fontFamily), TypographyKt.withDefaultFontFamily(textStyle5, fontFamily), TypographyKt.withDefaultFontFamily(textStyle6, fontFamily), TypographyKt.withDefaultFontFamily(textStyle7, fontFamily), TypographyKt.withDefaultFontFamily(textStyle8, fontFamily), TypographyKt.withDefaultFontFamily(textStyle9, fontFamily), TypographyKt.withDefaultFontFamily(textStyle10, fontFamily), TypographyKt.withDefaultFontFamily(textStyle11, fontFamily), TypographyKt.withDefaultFontFamily(textStyle12, fontFamily), TypographyKt.withDefaultFontFamily(textStyle13, fontFamily));
    }

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this.h1 = textStyle;
        this.h2 = textStyle2;
        this.h3 = textStyle3;
        this.h4 = textStyle4;
        this.h5 = textStyle5;
        this.h6 = textStyle6;
        this.subtitle1 = textStyle7;
        this.subtitle2 = textStyle8;
        this.body1 = textStyle9;
        this.body2 = textStyle10;
        this.button = textStyle11;
        this.caption = textStyle12;
        this.overline = textStyle13;
    }
}
