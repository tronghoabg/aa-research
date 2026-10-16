package androidx.window.embedding;

import androidx.camera.video.AudioStats;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.window.core.SpecificationComputer;
import androidx.window.core.VerificationMode;
import androidx.window.embedding.EmbeddingAnimationParams;
import androidx.window.embedding.SplitAttributes;
import h.a.c;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SplitAttributes {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SplitAttributes";
    private final EmbeddingAnimationParams animationParams;
    private final DividerAttributes dividerAttributes;
    private final LayoutDirection layoutDirection;
    private final SplitType splitType;

    /* synthetic */ SplitAttributes(SplitType splitType, LayoutDirection layoutDirection, EmbeddingAnimationParams embeddingAnimationParams, DividerAttributes dividerAttributes, int i2, o oVar) {
        this((i2 & 1) != 0 ? SplitType.SPLIT_TYPE_EQUAL : splitType, (i2 & 2) != 0 ? LayoutDirection.LOCALE : layoutDirection, (i2 & 4) != 0 ? new EmbeddingAnimationParams.Builder().build() : embeddingAnimationParams, (i2 & 8) != 0 ? DividerAttributes.NO_DIVIDER : dividerAttributes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitAttributes)) {
            return false;
        }
        SplitAttributes splitAttributes = (SplitAttributes) obj;
        return x.n(this.splitType, splitAttributes.splitType) && x.n(this.layoutDirection, splitAttributes.layoutDirection) && x.n(this.animationParams, splitAttributes.animationParams) && x.n(this.dividerAttributes, splitAttributes.dividerAttributes);
    }

    public final EmbeddingAnimationParams getAnimationParams() {
        return this.animationParams;
    }

    public final DividerAttributes getDividerAttributes() {
        return this.dividerAttributes;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final SplitType getSplitType() {
        return this.splitType;
    }

    public int hashCode() {
        return (((((this.splitType.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.animationParams.hashCode()) * 31) + this.dividerAttributes.hashCode();
    }

    public String toString() {
        return "SplitAttributes:{splitType=" + this.splitType + ", layoutDir=" + this.layoutDirection + ", animationParams=" + this.animationParams + ", dividerAttributes=" + this.dividerAttributes + " }";
    }

    /* compiled from: WazeSource */
    public final class LayoutDirection {
        private final String description;
        private final int value;
        public static final Companion Companion = new Companion(null);
        public static final LayoutDirection LOCALE = new LayoutDirection("LOCALE", 0);
        public static final LayoutDirection LEFT_TO_RIGHT = new LayoutDirection("LEFT_TO_RIGHT", 1);
        public static final LayoutDirection RIGHT_TO_LEFT = new LayoutDirection("RIGHT_TO_LEFT", 2);
        public static final LayoutDirection TOP_TO_BOTTOM = new LayoutDirection("TOP_TO_BOTTOM", 3);
        public static final LayoutDirection BOTTOM_TO_TOP = new LayoutDirection("BOTTOM_TO_TOP", 4);

        private LayoutDirection(String str, int i2) {
            this.description = str;
            this.value = i2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LayoutDirection)) {
                return false;
            }
            LayoutDirection layoutDirection = (LayoutDirection) obj;
            return x.n(this.description, layoutDirection.description) && this.value == layoutDirection.value;
        }

        public final int getValue$window() {
            return this.value;
        }

        public int hashCode() {
            return (this.description.hashCode() * 31) + this.value;
        }

        public String toString() {
            return this.description;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final LayoutDirection getLayoutDirectionFromValue$window(int i2) {
                if (i2 == LayoutDirection.LEFT_TO_RIGHT.getValue$window()) {
                    return LayoutDirection.LEFT_TO_RIGHT;
                }
                if (i2 == LayoutDirection.RIGHT_TO_LEFT.getValue$window()) {
                    return LayoutDirection.RIGHT_TO_LEFT;
                }
                if (i2 == LayoutDirection.LOCALE.getValue$window()) {
                    return LayoutDirection.LOCALE;
                }
                if (i2 == LayoutDirection.TOP_TO_BOTTOM.getValue$window()) {
                    return LayoutDirection.TOP_TO_BOTTOM;
                }
                if (i2 == LayoutDirection.BOTTOM_TO_TOP.getValue$window()) {
                    return LayoutDirection.BOTTOM_TO_TOP;
                }
                throw new IllegalArgumentException("Undefined value:" + i2);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    /* compiled from: WazeSource */
    public final class SplitType {
        public static final Companion Companion;
        public static final SplitType SPLIT_TYPE_EQUAL;
        public static final SplitType SPLIT_TYPE_EXPAND;
        public static final SplitType SPLIT_TYPE_HINGE;
        private final String description;
        private final float value;

        static {
            Companion companion = new Companion(null);
            Companion = companion;
            SPLIT_TYPE_EXPAND = new SplitType("expandContainers", 0.0f);
            SPLIT_TYPE_EQUAL = companion.ratio(0.5f);
            SPLIT_TYPE_HINGE = new SplitType("hinge", -1.0f);
        }

        public SplitType(String str, float f2) {
            x.f(str, "description");
            this.description = str;
            this.value = f2;
        }

        public static final SplitType ratio(float f2) {
            return Companion.ratio(f2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SplitType)) {
                return false;
            }
            SplitType splitType = (SplitType) obj;
            return this.value == splitType.value && x.n(this.description, splitType.description);
        }

        public final String getDescription$window() {
            return this.description;
        }

        public final float getValue$window() {
            return this.value;
        }

        public int hashCode() {
            return this.description.hashCode() + (Float.floatToIntBits(this.value) * 31);
        }

        public String toString() {
            return this.description;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            static final boolean ratio$lambda$0(float f2, float f3) {
                double d2 = f2;
                return d2 >= AudioStats.AUDIO_AMPLITUDE_NONE && d2 <= 1.0d && !c.aj(new Float[]{Float.valueOf(0.0f), Float.valueOf(1.0f)}, Float.valueOf(f2));
            }

            public final SplitType buildSplitTypeFromValue$window(float f2) {
                return f2 == SplitType.SPLIT_TYPE_EXPAND.getValue$window() ? SplitType.SPLIT_TYPE_EXPAND : ratio(f2);
            }

            public final SplitType ratio(final float f2) {
                SpecificationComputer.Companion companion = SpecificationComputer.Companion;
                Float fValueOf = Float.valueOf(f2);
                String str = SplitAttributes.TAG;
                x.e(str, "access$getTAG$cp(...)");
                Object objCompute = SpecificationComputer.Companion.startSpecification$default(companion, fValueOf, str, VerificationMode.STRICT, null, 4, null).require("Ratio must be in range (0.0, 1.0). Use SplitType.expandContainers() instead of 0 or 1.", new l() { // from class: androidx.window.embedding.SplitAttributes$SplitType$Companion$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(SplitAttributes.SplitType.Companion.ratio$lambda$0(f2, ((Float) obj).floatValue()));
                    }
                }).compute();
                x.c(objCompute);
                float fFloatValue = ((Number) objCompute).floatValue();
                return new SplitType("ratio:" + fFloatValue, fFloatValue);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ SplitAttributes(SplitType splitType, LayoutDirection layoutDirection, EmbeddingAnimationParams embeddingAnimationParams, DividerAttributes dividerAttributes, o oVar) {
        this(splitType, layoutDirection, embeddingAnimationParams, dividerAttributes);
    }

    private SplitAttributes(SplitType splitType, LayoutDirection layoutDirection, EmbeddingAnimationParams embeddingAnimationParams, DividerAttributes dividerAttributes) {
        this.splitType = splitType;
        this.layoutDirection = layoutDirection;
        this.animationParams = embeddingAnimationParams;
        this.dividerAttributes = dividerAttributes;
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private EmbeddingAnimationParams animationParams;
        private DividerAttributes dividerAttributes;
        private LayoutDirection layoutDirection;
        private SplitType splitType;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(SplitAttributes splitAttributes) {
            this();
            x.f(splitAttributes, "original");
            setSplitType(splitAttributes.getSplitType()).setLayoutDirection(splitAttributes.getLayoutDirection()).setAnimationParams(splitAttributes.getAnimationParams()).setDividerAttributes(splitAttributes.getDividerAttributes());
        }

        public final SplitAttributes build() {
            return new SplitAttributes(this.splitType, this.layoutDirection, this.animationParams, this.dividerAttributes, null);
        }

        public final Builder setAnimationParams(EmbeddingAnimationParams embeddingAnimationParams) {
            x.f(embeddingAnimationParams, "params");
            this.animationParams = embeddingAnimationParams;
            return this;
        }

        public final Builder setDividerAttributes(DividerAttributes dividerAttributes) {
            x.f(dividerAttributes, "dividerAttributes");
            this.dividerAttributes = dividerAttributes;
            return this;
        }

        public final Builder setLayoutDirection(LayoutDirection layoutDirection) {
            x.f(layoutDirection, "layoutDirection");
            this.layoutDirection = layoutDirection;
            return this;
        }

        public final Builder setSplitType(SplitType splitType) {
            x.f(splitType, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            this.splitType = splitType;
            return this;
        }

        public Builder() {
            this.splitType = SplitType.SPLIT_TYPE_EQUAL;
            this.layoutDirection = LayoutDirection.LOCALE;
            this.animationParams = new EmbeddingAnimationParams.Builder().build();
            this.dividerAttributes = DividerAttributes.NO_DIVIDER;
        }
    }
}
