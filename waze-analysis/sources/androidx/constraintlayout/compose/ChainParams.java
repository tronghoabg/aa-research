package androidx.constraintlayout.compose;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ChainParams implements HelperParams {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ChainParams Default = new ChainParams(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, Float.NaN, null);
    private final float bottomGoneMargin;
    private final float bottomMargin;
    private final float endGoneMargin;
    private final float endMargin;
    private final float startGoneMargin;
    private final float startMargin;
    private final float topGoneMargin;
    private final float topMargin;
    private final float weight;

    private ChainParams(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.startMargin = f2;
        this.topMargin = f3;
        this.endMargin = f4;
        this.bottomMargin = f5;
        this.startGoneMargin = f6;
        this.topGoneMargin = f7;
        this.endGoneMargin = f8;
        this.bottomGoneMargin = f9;
        this.weight = f10;
    }

    /* renamed from: getBottomGoneMargin-D9Ej5fM, reason: not valid java name */
    public final float m11434getBottomGoneMarginD9Ej5fM() {
        return this.bottomGoneMargin;
    }

    /* renamed from: getBottomMargin-D9Ej5fM, reason: not valid java name */
    public final float m11435getBottomMarginD9Ej5fM() {
        return this.bottomMargin;
    }

    /* renamed from: getEndGoneMargin-D9Ej5fM, reason: not valid java name */
    public final float m11436getEndGoneMarginD9Ej5fM() {
        return this.endGoneMargin;
    }

    /* renamed from: getEndMargin-D9Ej5fM, reason: not valid java name */
    public final float m11437getEndMarginD9Ej5fM() {
        return this.endMargin;
    }

    /* renamed from: getStartGoneMargin-D9Ej5fM, reason: not valid java name */
    public final float m11438getStartGoneMarginD9Ej5fM() {
        return this.startGoneMargin;
    }

    /* renamed from: getStartMargin-D9Ej5fM, reason: not valid java name */
    public final float m11439getStartMarginD9Ej5fM() {
        return this.startMargin;
    }

    /* renamed from: getTopGoneMargin-D9Ej5fM, reason: not valid java name */
    public final float m11440getTopGoneMarginD9Ej5fM() {
        return this.topGoneMargin;
    }

    /* renamed from: getTopMargin-D9Ej5fM, reason: not valid java name */
    public final float m11441getTopMarginD9Ej5fM() {
        return this.topMargin;
    }

    public final float getWeight() {
        return this.weight;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final ChainParams getDefault$constraintlayout_compose() {
            return ChainParams.Default;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ ChainParams(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, o oVar) {
        this(f2, f3, f4, f5, f6, f7, f8, f9, f10);
    }
}
