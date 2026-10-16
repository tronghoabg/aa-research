package androidx.compose.ui.input.pointer;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PointerEvent_androidKt {
    public static final int EmptyPointerKeyboardModifiers() {
        return 0;
    }

    /* renamed from: getAreAnyPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m9565getAreAnyPressedaHzCxE(int i2) {
        return i2 != 0;
    }

    /* renamed from: indexOfFirstPressed-aHzCx-E, reason: not valid java name */
    public static final int m9566indexOfFirstPressedaHzCxE(int i2) {
        if (i2 == 0) {
            return -1;
        }
        int i3 = 0;
        for (int i4 = (i2 & (-97)) | ((i2 & 96) >>> 5); (i4 & 1) == 0; i4 >>>= 1) {
            i3++;
        }
        return i3;
    }

    /* renamed from: indexOfLastPressed-aHzCx-E, reason: not valid java name */
    public static final int m9567indexOfLastPressedaHzCxE(int i2) {
        int i3 = (i2 & (-97)) | ((i2 & 96) >>> 5);
        int i4 = -1;
        while (i3 != 0) {
            i3 >>>= 1;
            i4++;
        }
        return i4;
    }

    /* renamed from: isAltGraphPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m9568isAltGraphPressed5xRPYO0(int i2) {
        return false;
    }

    /* renamed from: isAltPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m9569isAltPressed5xRPYO0(int i2) {
        return (i2 & 2) != 0;
    }

    /* renamed from: isBackPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m9570isBackPressedaHzCxE(int i2) {
        return (i2 & 8) != 0;
    }

    /* renamed from: isCapsLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m9571isCapsLockOn5xRPYO0(int i2) {
        return (i2 & 1048576) != 0;
    }

    /* renamed from: isCtrlPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m9572isCtrlPressed5xRPYO0(int i2) {
        return (i2 & 4096) != 0;
    }

    /* renamed from: isForwardPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m9573isForwardPressedaHzCxE(int i2) {
        return (i2 & 16) != 0;
    }

    /* renamed from: isFunctionPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m9574isFunctionPressed5xRPYO0(int i2) {
        return (i2 & 8) != 0;
    }

    /* renamed from: isMetaPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m9575isMetaPressed5xRPYO0(int i2) {
        return (i2 & 65536) != 0;
    }

    /* renamed from: isNumLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m9576isNumLockOn5xRPYO0(int i2) {
        return (i2 & 2097152) != 0;
    }

    /* renamed from: isPressed-bNIWhpI, reason: not valid java name */
    public static final boolean m9577isPressedbNIWhpI(int i2, int i3) {
        return i3 != 0 ? i3 != 1 ? (i3 == 2 || i3 == 3 || i3 == 4) ? (i2 & (1 << i3)) != 0 : (i2 & (1 << (i3 + 2))) != 0 : m9580isSecondaryPressedaHzCxE(i2) : m9578isPrimaryPressedaHzCxE(i2);
    }

    /* renamed from: isPrimaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m9578isPrimaryPressedaHzCxE(int i2) {
        return (i2 & 33) != 0;
    }

    /* renamed from: isScrollLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m9579isScrollLockOn5xRPYO0(int i2) {
        return (i2 & 4194304) != 0;
    }

    /* renamed from: isSecondaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m9580isSecondaryPressedaHzCxE(int i2) {
        return (i2 & 66) != 0;
    }

    /* renamed from: isShiftPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m9581isShiftPressed5xRPYO0(int i2) {
        return (i2 & 1) != 0;
    }

    /* renamed from: isSymPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m9582isSymPressed5xRPYO0(int i2) {
        return (i2 & 4) != 0;
    }

    /* renamed from: isTertiaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m9583isTertiaryPressedaHzCxE(int i2) {
        return (i2 & 4) != 0;
    }
}
