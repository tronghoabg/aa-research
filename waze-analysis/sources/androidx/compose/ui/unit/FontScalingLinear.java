package androidx.compose.ui.unit;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface FontScalingLinear {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.unit.FontScalingLinear$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: $default$toDp-GaN1DYA, reason: not valid java name */
        public static float m11281$default$toDpGaN1DYA(FontScalingLinear fontScalingLinear, long j2) {
            if (TextUnitType.m11390equalsimpl0(TextUnit.m11361getTypeUIouoOA(j2), TextUnitType.Companion.m11395getSpUIouoOA())) {
                return TextUnit.m11362getValueimpl(j2) * fontScalingLinear.getFontScale();
            }
            throw new IllegalStateException("Only Sp can convert to Px");
        }

        /* renamed from: $default$toSp-0xMU5do, reason: not valid java name */
        public static long m11282$default$toSp0xMU5do(FontScalingLinear fontScalingLinear, float f2) {
            return TextUnitKt.getSp(f2 / fontScalingLinear.getFontScale());
        }
    }

    float getFontScale();

    /* renamed from: toDp-GaN1DYA, reason: not valid java name */
    float m11279toDpGaN1DYA(long j2);

    /* renamed from: toSp-0xMU5do, reason: not valid java name */
    long m11280toSp0xMU5do(float f2);

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m11285toDpGaN1DYA(FontScalingLinear fontScalingLinear, long j2) {
            return CC.m11281$default$toDpGaN1DYA(fontScalingLinear, j2);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m11286toSp0xMU5do(FontScalingLinear fontScalingLinear, float f2) {
            return CC.m11282$default$toSp0xMU5do(fontScalingLinear, f2);
        }

        public static /* synthetic */ void getFontScale$annotations() {
        }
    }
}
