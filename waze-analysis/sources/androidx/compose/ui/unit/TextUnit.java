package androidx.compose.ui.unit;

import androidx.media3.muxer.MuxerUtil;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class TextUnit {
    public static final Companion Companion = new Companion(null);
    private static final TextUnitType[] TextUnitTypes = {TextUnitType.m11387boximpl(TextUnitType.Companion.m11396getUnspecifiedUIouoOA()), TextUnitType.m11387boximpl(TextUnitType.Companion.m11395getSpUIouoOA()), TextUnitType.m11387boximpl(TextUnitType.Companion.m11394getEmUIouoOA())};
    private static final long Unspecified = TextUnitKt.pack(0, Float.NaN);
    private final long packedValue;

    private /* synthetic */ TextUnit(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m11352boximpl(long j2) {
        return new TextUnit(j2);
    }

    /* renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m11353compareToR2X_6o(long j2, long j3) {
        TextUnitKt.m11376checkArithmeticNB67dxo(j2, j3);
        return Float.compare(m11362getValueimpl(j2), m11362getValueimpl(j3));
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m11355divkPz2Gy4(long j2, double d2) {
        TextUnitKt.m11375checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m11360getRawTypeimpl(j2), (float) (m11362getValueimpl(j2) / d2));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11358equalsimpl(long j2, Object obj) {
        return (obj instanceof TextUnit) && j2 == ((TextUnit) obj).m11371unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11359equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getRawType-impl, reason: not valid java name */
    public static final long m11360getRawTypeimpl(long j2) {
        return j2 & 1095216660480L;
    }

    /* renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m11361getTypeUIouoOA(long j2) {
        return TextUnitTypes[(int) (m11360getRawTypeimpl(j2) >>> 32)].m11393unboximpl();
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m11362getValueimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11363hashCodeimpl(long j2) {
        return TextUnit$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m11364isEmimpl(long j2) {
        return m11360getRawTypeimpl(j2) == 8589934592L;
    }

    /* renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m11365isSpimpl(long j2) {
        return m11360getRawTypeimpl(j2) == 4294967296L;
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m11366timeskPz2Gy4(long j2, double d2) {
        TextUnitKt.m11375checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m11360getRawTypeimpl(j2), (float) (m11362getValueimpl(j2) * d2));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11369toStringimpl(long j2) {
        long jM11361getTypeUIouoOA = m11361getTypeUIouoOA(j2);
        if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11396getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11395getSpUIouoOA())) {
            return m11362getValueimpl(j2) + ".sp";
        }
        if (!TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11394getEmUIouoOA())) {
            return "Invalid";
        }
        return m11362getValueimpl(j2) + ".em";
    }

    /* renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m11370unaryMinusXSAIIZE(long j2) {
        TextUnitKt.m11375checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m11360getRawTypeimpl(j2), -m11362getValueimpl(j2));
    }

    public boolean equals(Object obj) {
        return m11358equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m11363hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m11369toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m11371unboximpl() {
        return this.packedValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final TextUnitType[] getTextUnitTypes$ui_unit() {
            return TextUnit.TextUnitTypes;
        }

        /* renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m11373getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m11372getUnspecifiedXSAIIZE$annotations() {
        }
    }

    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m11356divkPz2Gy4(long j2, float f2) {
        TextUnitKt.m11375checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m11360getRawTypeimpl(j2), m11362getValueimpl(j2) / f2);
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m11367timeskPz2Gy4(long j2, float f2) {
        TextUnitKt.m11375checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m11360getRawTypeimpl(j2), m11362getValueimpl(j2) * f2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m11354constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m11357divkPz2Gy4(long j2, int i2) {
        TextUnitKt.m11375checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m11360getRawTypeimpl(j2), m11362getValueimpl(j2) / i2);
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m11368timeskPz2Gy4(long j2, int i2) {
        TextUnitKt.m11375checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m11360getRawTypeimpl(j2), m11362getValueimpl(j2) * i2);
    }
}
