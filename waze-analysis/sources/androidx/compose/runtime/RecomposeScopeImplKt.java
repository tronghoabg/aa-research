package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RecomposeScopeImplKt {
    private static final int DefaultsInScopeFlag = 2;
    private static final int DefaultsInvalidFlag = 4;
    private static final int ForceReusing = 128;
    private static final int ForcedRecomposeFlag = 64;
    private static final int Paused = 256;
    private static final int RequiresRecomposeFlag = 8;
    private static final int RereadingFlag = 32;
    private static final int ResetReusing = 1024;
    private static final int Resuming = 512;
    private static final int SkippedFlag = 16;
    private static final int UsedFlag = 1;
    private static final int changedHighBitMask = 613566756;
    private static final int changedLowBitMask = 306783378;
    private static final int changedMask = -920350135;

    public static final int updateChangedFlags(int i2) {
        int i3 = changedLowBitMask & i2;
        int i4 = i3 + i3;
        int i5 = changedHighBitMask & i2;
        return (i2 & changedMask) | i3 | (i5 >> 1) | (i4 & i5);
    }
}
