package androidx.compose.foundation.internal;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class EncodeHelper {
    public static final int $stable = 8;
    private Parcel parcel = Parcel.obtain();

    public final void encode(SpanStyle spanStyle) {
        if (!Color.m8229equalsimpl0(spanStyle.m10487getColor0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m2391encode8_81llA(spanStyle.m10487getColor0d7_KjU());
        }
        if (!TextUnit.m11359equalsimpl0(spanStyle.m10488getFontSizeXSAIIZE(), TextUnit.Companion.m11373getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m2388encodeR2X_6o(spanStyle.m10488getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle fontStyleM10489getFontStyle4Lr2A7w = spanStyle.m10489getFontStyle4Lr2A7w();
        if (fontStyleM10489getFontStyle4Lr2A7w != null) {
            int iM10664unboximpl = fontStyleM10489getFontStyle4Lr2A7w.m10664unboximpl();
            encode((byte) 4);
            m2393encodenzbMABs(iM10664unboximpl);
        }
        FontSynthesis fontSynthesisM10490getFontSynthesisZQGJjVo = spanStyle.m10490getFontSynthesisZQGJjVo();
        if (fontSynthesisM10490getFontSynthesisZQGJjVo != null) {
            int iM10677unboximpl = fontSynthesisM10490getFontSynthesisZQGJjVo.m10677unboximpl();
            encode((byte) 5);
            m2390encode6p3vJLY(iM10677unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m11359equalsimpl0(spanStyle.m10491getLetterSpacingXSAIIZE(), TextUnit.Companion.m11373getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m2388encodeR2X_6o(spanStyle.m10491getLetterSpacingXSAIIZE());
        }
        BaselineShift baselineShiftM10486getBaselineShift5SSeXJ0 = spanStyle.m10486getBaselineShift5SSeXJ0();
        if (baselineShiftM10486getBaselineShift5SSeXJ0 != null) {
            float fM10879unboximpl = baselineShiftM10486getBaselineShift5SSeXJ0.m10879unboximpl();
            encode((byte) 8);
            m2389encode4Dl_Bck(fM10879unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m8229equalsimpl0(spanStyle.m10485getBackground0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m2391encode8_81llA(spanStyle.m10485getBackground0d7_KjU());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode(StylePropertiesKt.WidthFractionId);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode(StylePropertiesKt.HeightFractionId);
            encode(shadow);
        }
    }

    /* renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m2388encodeR2X_6o(long j2) {
        long jM11361getTypeUIouoOA = TextUnit.m11361getTypeUIouoOA(j2);
        byte b2 = 0;
        if (!TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11396getUnspecifiedUIouoOA())) {
            if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11395getSpUIouoOA())) {
                b2 = 1;
            } else if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11394getEmUIouoOA())) {
                b2 = 2;
            }
        }
        encode(b2);
        if (TextUnitType.m11390equalsimpl0(TextUnit.m11361getTypeUIouoOA(j2), TextUnitType.Companion.m11396getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m11362getValueimpl(j2));
    }

    /* renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m2389encode4Dl_Bck(float f2) {
        encode(f2);
    }

    /* renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m2390encode6p3vJLY(int i2) {
        byte b2 = 0;
        if (!FontSynthesis.m10672equalsimpl0(i2, FontSynthesis.Companion.m10679getNoneGVVA2EU())) {
            if (FontSynthesis.m10672equalsimpl0(i2, FontSynthesis.Companion.m10678getAllGVVA2EU())) {
                b2 = 1;
            } else if (FontSynthesis.m10672equalsimpl0(i2, FontSynthesis.Companion.m10681getWeightGVVA2EU())) {
                b2 = 2;
            } else if (FontSynthesis.m10672equalsimpl0(i2, FontSynthesis.Companion.m10680getStyleGVVA2EU())) {
                b2 = 3;
            }
        }
        encode(b2);
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public final void m2391encode8_81llA(long j2) {
        m2392encodeVKZWuLQ(j2);
    }

    /* renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m2392encodeVKZWuLQ(long j2) {
        this.parcel.writeLong(j2);
    }

    /* renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m2393encodenzbMABs(int i2) {
        byte b2 = 0;
        if (!FontStyle.m10661equalsimpl0(i2, FontStyle.Companion.m10668getNormal_LCdwA()) && FontStyle.m10661equalsimpl0(i2, FontStyle.Companion.m10667getItalic_LCdwA())) {
            b2 = 1;
        }
        encode(b2);
    }

    public final String encodedString() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void reset() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }

    public final void encode(float f2) {
        this.parcel.writeFloat(f2);
    }

    public final void encode(int i2) {
        this.parcel.writeInt(i2);
    }

    public final void encode(Shadow shadow) {
        m2391encode8_81llA(shadow.m8602getColor0d7_KjU());
        encode(Float.intBitsToFloat((int) (shadow.m8603getOffsetF1C5BW0() >> 32)));
        encode(Float.intBitsToFloat((int) (shadow.m8603getOffsetF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b2) {
        this.parcel.writeByte(b2);
    }

    public final void encode(FontWeight fontWeight) {
        encode(fontWeight.getWeight());
    }

    public final void encode(TextDecoration textDecoration) {
        encode(textDecoration.getMask());
    }

    public final void encode(TextGeometricTransform textGeometricTransform) {
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(String str) {
        this.parcel.writeString(str);
    }
}
