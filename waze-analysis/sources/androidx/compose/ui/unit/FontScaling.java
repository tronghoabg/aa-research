package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface FontScaling {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.unit.FontScaling$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: $default$toDp-GaN1DYA, reason: not valid java name */
        public static float m11273$default$toDpGaN1DYA(FontScaling fontScaling, long j2) {
            FontScaleConverter fontScaleConverterForScale;
            if (!TextUnitType.m11390equalsimpl0(TextUnit.m11361getTypeUIouoOA(j2), TextUnitType.Companion.m11395getSpUIouoOA())) {
                InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
            }
            if (FontScaleConverterFactory.INSTANCE.isNonLinearFontScalingActive(fontScaling.getFontScale()) && (fontScaleConverterForScale = FontScaleConverterFactory.INSTANCE.forScale(fontScaling.getFontScale())) != null) {
                return fontScaleConverterForScale.convertSpToDp(TextUnit.m11362getValueimpl(j2));
            }
            float fM11362getValueimpl = TextUnit.m11362getValueimpl(j2);
            float fontScale = fontScaling.getFontScale();
            return fM11362getValueimpl * fontScale;
        }

        /* renamed from: $default$toSp-0xMU5do, reason: not valid java name */
        public static long m11274$default$toSp0xMU5do(FontScaling fontScaling, float f2) {
            if (!FontScaleConverterFactory.INSTANCE.isNonLinearFontScalingActive(fontScaling.getFontScale())) {
                return TextUnitKt.getSp(f2 / fontScaling.getFontScale());
            }
            FontScaleConverter fontScaleConverterForScale = FontScaleConverterFactory.INSTANCE.forScale(fontScaling.getFontScale());
            return TextUnitKt.getSp(fontScaleConverterForScale != null ? fontScaleConverterForScale.convertDpToSp(f2) : f2 / fontScaling.getFontScale());
        }
    }

    float getFontScale();

    /* renamed from: toDp-GaN1DYA */
    float mo2122toDpGaN1DYA(long j2);

    /* renamed from: toSp-0xMU5do */
    long mo2129toSp0xMU5do(float f2);

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m11277toDpGaN1DYA(FontScaling fontScaling, long j2) {
            return CC.m11273$default$toDpGaN1DYA(fontScaling, j2);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m11278toSp0xMU5do(FontScaling fontScaling, float f2) {
            return CC.m11274$default$toSp0xMU5do(fontScaling, f2);
        }

        public static /* synthetic */ void getFontScale$annotations() {
        }
    }
}
