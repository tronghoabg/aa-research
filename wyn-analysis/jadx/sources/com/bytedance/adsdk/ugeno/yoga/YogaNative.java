package com.bytedance.adsdk.ugeno.yoga;

@com.bytedance.adsdk.ugeno.yoga.uef.uef
/* loaded from: classes.dex */
public class YogaNative {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24783a = 0;

    static {
        System.loadLibrary("tt_ugen_layout");
    }

    public static native void jni_YGConfigFreeJNI(long j8);

    public static native int jni_YGConfigGetErrataJNI(long j8);

    public static native long jni_YGConfigNewJNI();

    public static native void jni_YGConfigSetErrataJNI(long j8, int i5);

    public static native void jni_YGConfigSetExperimentalFeatureEnabledJNI(long j8, int i5, boolean z2);

    public static native void jni_YGConfigSetLoggerJNI(long j8, YogaLogger yogaLogger);

    public static native void jni_YGConfigSetPointScaleFactorJNI(long j8, float f10);

    public static native void jni_YGConfigSetUseWebDefaultsJNI(long j8, boolean z2);

    public static native void jni_YGNodeCalculateLayoutJNI(long j8, float f10, float f11, long[] jArr, YogaNodeJNIBase[] yogaNodeJNIBaseArr);

    public static native long jni_YGNodeCloneJNI(long j8);

    public static native void jni_YGNodeCopyStyleJNI(long j8, long j10);

    public static native void jni_YGNodeFinalizeJNI(long j8);

    public static native void jni_YGNodeInsertChildJNI(long j8, long j10, int i5);

    public static native boolean jni_YGNodeIsDirtyJNI(long j8);

    public static native boolean jni_YGNodeIsReferenceBaselineJNI(long j8);

    public static native void jni_YGNodeMarkDirtyJNI(long j8);

    public static native long jni_YGNodeNewJNI();

    public static native long jni_YGNodeNewWithConfigJNI(long j8);

    public static native void jni_YGNodeRemoveAllChildrenJNI(long j8);

    public static native void jni_YGNodeRemoveChildJNI(long j8, long j10);

    public static native void jni_YGNodeResetJNI(long j8);

    public static native void jni_YGNodeSetAlwaysFormsContainingBlockJNI(long j8, boolean z2);

    public static native void jni_YGNodeSetHasBaselineFuncJNI(long j8, boolean z2);

    public static native void jni_YGNodeSetHasMeasureFuncJNI(long j8, boolean z2);

    public static native void jni_YGNodeSetIsReferenceBaselineJNI(long j8, boolean z2);

    public static native void jni_YGNodeSetStyleInputsJNI(long j8, float[] fArr, int i5);

    public static native int jni_YGNodeStyleGetAlignContentJNI(long j8);

    public static native int jni_YGNodeStyleGetAlignItemsJNI(long j8);

    public static native int jni_YGNodeStyleGetAlignSelfJNI(long j8);

    public static native float jni_YGNodeStyleGetAspectRatioJNI(long j8);

    public static native float jni_YGNodeStyleGetBorderJNI(long j8, int i5);

    public static native int jni_YGNodeStyleGetBoxSizingJNI(long j8);

    public static native int jni_YGNodeStyleGetDirectionJNI(long j8);

    public static native int jni_YGNodeStyleGetDisplayJNI(long j8);

    public static native long jni_YGNodeStyleGetFlexBasisJNI(long j8);

    public static native int jni_YGNodeStyleGetFlexDirectionJNI(long j8);

    public static native float jni_YGNodeStyleGetFlexGrowJNI(long j8);

    public static native float jni_YGNodeStyleGetFlexJNI(long j8);

    public static native float jni_YGNodeStyleGetFlexShrinkJNI(long j8);

    public static native int jni_YGNodeStyleGetFlexWrapJNI(long j8);

    public static native float jni_YGNodeStyleGetGapJNI(long j8, int i5);

    public static native long jni_YGNodeStyleGetHeightJNI(long j8);

    public static native int jni_YGNodeStyleGetJustifyContentJNI(long j8);

    public static native long jni_YGNodeStyleGetMarginJNI(long j8, int i5);

    public static native long jni_YGNodeStyleGetMaxHeightJNI(long j8);

    public static native long jni_YGNodeStyleGetMaxWidthJNI(long j8);

    public static native long jni_YGNodeStyleGetMinHeightJNI(long j8);

    public static native long jni_YGNodeStyleGetMinWidthJNI(long j8);

    public static native int jni_YGNodeStyleGetOverflowJNI(long j8);

    public static native long jni_YGNodeStyleGetPaddingJNI(long j8, int i5);

    public static native long jni_YGNodeStyleGetPositionJNI(long j8, int i5);

    public static native int jni_YGNodeStyleGetPositionTypeJNI(long j8);

    public static native long jni_YGNodeStyleGetWidthJNI(long j8);

    public static native void jni_YGNodeStyleSetAlignContentJNI(long j8, int i5);

    public static native void jni_YGNodeStyleSetAlignItemsJNI(long j8, int i5);

    public static native void jni_YGNodeStyleSetAlignSelfJNI(long j8, int i5);

    public static native void jni_YGNodeStyleSetAspectRatioJNI(long j8, float f10);

    public static native void jni_YGNodeStyleSetBorderJNI(long j8, int i5, float f10);

    public static native void jni_YGNodeStyleSetBoxSizingJNI(long j8, int i5);

    public static native void jni_YGNodeStyleSetDirectionJNI(long j8, int i5);

    public static native void jni_YGNodeStyleSetDisplayJNI(long j8, int i5);

    public static native void jni_YGNodeStyleSetFlexBasisAutoJNI(long j8);

    public static native void jni_YGNodeStyleSetFlexBasisJNI(long j8, float f10);

    public static native void jni_YGNodeStyleSetFlexBasisPercentJNI(long j8, float f10);

    public static native void jni_YGNodeStyleSetFlexDirectionJNI(long j8, int i5);

    public static native void jni_YGNodeStyleSetFlexGrowJNI(long j8, float f10);

    public static native void jni_YGNodeStyleSetFlexJNI(long j8, float f10);

    public static native void jni_YGNodeStyleSetFlexShrinkJNI(long j8, float f10);

    public static native void jni_YGNodeStyleSetFlexWrapJNI(long j8, int i5);

    public static native void jni_YGNodeStyleSetGapJNI(long j8, int i5, float f10);

    public static native void jni_YGNodeStyleSetGapPercentJNI(long j8, int i5, float f10);

    public static native void jni_YGNodeStyleSetHeightAutoJNI(long j8);

    public static native void jni_YGNodeStyleSetHeightJNI(long j8, float f10);

    public static native void jni_YGNodeStyleSetHeightPercentJNI(long j8, float f10);

    public static native void jni_YGNodeStyleSetJustifyContentJNI(long j8, int i5);

    public static native void jni_YGNodeStyleSetMarginAutoJNI(long j8, int i5);

    public static native void jni_YGNodeStyleSetMarginJNI(long j8, int i5, float f10);

    public static native void jni_YGNodeStyleSetMarginPercentJNI(long j8, int i5, float f10);

    public static native void jni_YGNodeStyleSetMaxHeightJNI(long j8, float f10);

    public static native void jni_YGNodeStyleSetMaxHeightPercentJNI(long j8, float f10);

    public static native void jni_YGNodeStyleSetMaxWidthJNI(long j8, float f10);

    public static native void jni_YGNodeStyleSetMaxWidthPercentJNI(long j8, float f10);

    public static native void jni_YGNodeStyleSetMinHeightJNI(long j8, float f10);

    public static native void jni_YGNodeStyleSetMinHeightPercentJNI(long j8, float f10);

    public static native void jni_YGNodeStyleSetMinWidthJNI(long j8, float f10);

    public static native void jni_YGNodeStyleSetMinWidthPercentJNI(long j8, float f10);

    public static native void jni_YGNodeStyleSetOverflowJNI(long j8, int i5);

    public static native void jni_YGNodeStyleSetPaddingJNI(long j8, int i5, float f10);

    public static native void jni_YGNodeStyleSetPaddingPercentJNI(long j8, int i5, float f10);

    public static native void jni_YGNodeStyleSetPositionAutoJNI(long j8, int i5);

    public static native void jni_YGNodeStyleSetPositionJNI(long j8, int i5, float f10);

    public static native void jni_YGNodeStyleSetPositionPercentJNI(long j8, int i5, float f10);

    public static native void jni_YGNodeStyleSetPositionTypeJNI(long j8, int i5);

    public static native void jni_YGNodeStyleSetWidthAutoJNI(long j8);

    public static native void jni_YGNodeStyleSetWidthJNI(long j8, float f10);

    public static native void jni_YGNodeStyleSetWidthPercentJNI(long j8, float f10);

    public static native void jni_YGNodeSwapChildJNI(long j8, long j10, int i5);
}
