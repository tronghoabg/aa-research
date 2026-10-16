package androidx.compose.ui.unit;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    /* renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m11374TextUnitanM5pPY(float f2, long j2) {
        return pack(j2, f2);
    }

    /* renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m11375checkArithmeticR2X_6o(long j2) {
        if (TextUnit.m11360getRawTypeimpl(j2) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    /* renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m11376checkArithmeticNB67dxo(long j2, long j3) {
        if (TextUnit.m11360getRawTypeimpl(j2) == 0 || TextUnit.m11360getRawTypeimpl(j3) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m11390equalsimpl0(TextUnit.m11361getTypeUIouoOA(j2), TextUnit.m11361getTypeUIouoOA(j3))) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m11392toStringimpl(TextUnit.m11361getTypeUIouoOA(j2))) + " and " + ((Object) TextUnitType.m11392toStringimpl(TextUnit.m11361getTypeUIouoOA(j3))));
    }

    /* renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m11377checkArithmeticvU0ePk(long j2, long j3, long j4) {
        if (TextUnit.m11360getRawTypeimpl(j2) == 0 || TextUnit.m11360getRawTypeimpl(j3) == 0 || TextUnit.m11360getRawTypeimpl(j4) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m11390equalsimpl0(TextUnit.m11361getTypeUIouoOA(j2), TextUnit.m11361getTypeUIouoOA(j3)) && TextUnitType.m11390equalsimpl0(TextUnit.m11361getTypeUIouoOA(j3), TextUnit.m11361getTypeUIouoOA(j4))) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m11392toStringimpl(TextUnit.m11361getTypeUIouoOA(j2))) + " and " + ((Object) TextUnitType.m11392toStringimpl(TextUnit.m11361getTypeUIouoOA(j3))));
    }

    public static final long getEm(double d2) {
        return pack(UNIT_TYPE_EM, (float) d2);
    }

    public static final long getSp(double d2) {
        return pack(UNIT_TYPE_SP, (float) d2);
    }

    /* renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m11378isSpecifiedR2X_6o(long j2) {
        return TextUnit.m11360getRawTypeimpl(j2) != 0;
    }

    /* renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m11380isUnspecifiedR2X_6o(long j2) {
        return TextUnit.m11360getRawTypeimpl(j2) == 0;
    }

    /* renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m11382lerpC3pnCVY(long j2, long j3, float f2) {
        m11376checkArithmeticNB67dxo(j2, j3);
        TextUnit.Companion companion = TextUnit.Companion;
        return pack(TextUnit.m11360getRawTypeimpl(j2), MathHelpersKt.lerp(TextUnit.m11362getValueimpl(j2), TextUnit.m11362getValueimpl(j3), f2));
    }

    public static final long pack(long j2, float f2) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        TextUnit.Companion companion = TextUnit.Companion;
        return j2 | (jFloatToRawIntBits & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m11383takeOrElseeAf_CNQ(long j2, a<TextUnit> aVar) {
        return TextUnit.m11360getRawTypeimpl(j2) == 0 ? aVar.invoke().m11371unboximpl() : j2;
    }

    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m11384timesmpE4wyQ(double d2, long j2) {
        m11375checkArithmeticR2X_6o(j2);
        TextUnit.Companion companion = TextUnit.Companion;
        return pack(TextUnit.m11360getRawTypeimpl(j2), ((float) d2) * TextUnit.m11362getValueimpl(j2));
    }

    public static /* synthetic */ void getEm$annotations(float f2) {
    }

    public static /* synthetic */ void getSp$annotations(float f2) {
    }

    public static /* synthetic */ void getEm$annotations(int i2) {
    }

    public static /* synthetic */ void getSp$annotations(int i2) {
    }

    public static final long getEm(float f2) {
        return pack(UNIT_TYPE_EM, f2);
    }

    public static final long getSp(float f2) {
        return pack(UNIT_TYPE_SP, f2);
    }

    public static final long getEm(int i2) {
        return pack(UNIT_TYPE_EM, i2);
    }

    public static final long getSp(int i2) {
        return pack(UNIT_TYPE_SP, i2);
    }

    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m11385timesmpE4wyQ(float f2, long j2) {
        m11375checkArithmeticR2X_6o(j2);
        TextUnit.Companion companion = TextUnit.Companion;
        return pack(TextUnit.m11360getRawTypeimpl(j2), f2 * TextUnit.m11362getValueimpl(j2));
    }

    public static /* synthetic */ void getEm$annotations(double d2) {
    }

    public static /* synthetic */ void getSp$annotations(double d2) {
    }

    /* renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m11379isSpecifiedR2X_6o$annotations(long j2) {
    }

    /* renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m11381isUnspecifiedR2X_6o$annotations(long j2) {
    }

    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m11386timesmpE4wyQ(int i2, long j2) {
        m11375checkArithmeticR2X_6o(j2);
        TextUnit.Companion companion = TextUnit.Companion;
        return pack(TextUnit.m11360getRawTypeimpl(j2), i2 * TextUnit.m11362getValueimpl(j2));
    }
}
