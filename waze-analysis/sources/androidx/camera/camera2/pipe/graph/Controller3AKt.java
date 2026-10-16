package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.Converge3ABehavior;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Controller3AKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean isNullOrIn(T t, Collection<? extends T> collection) {
        if (t != null) {
            return collection.contains(t);
        }
        return true;
    }

    /* renamed from: shouldUnlock-eBHfGHg, reason: not valid java name */
    public static final boolean m1152shouldUnlockeBHfGHg(Converge3ABehavior converge3ABehavior) {
        int iM628getAFTER_NEW_SCANDbbx7gI = Converge3ABehavior.Companion.m628getAFTER_NEW_SCANDbbx7gI();
        if (converge3ABehavior == null) {
            return false;
        }
        return Converge3ABehavior.m623equalsimpl0(converge3ABehavior.m626unboximpl(), iM628getAFTER_NEW_SCANDbbx7gI);
    }

    /* renamed from: shouldUnlockAe-t6FjEyI, reason: not valid java name */
    public static final boolean m1153shouldUnlockAet6FjEyI(Lock3ABehavior lock3ABehavior) {
        int iM728getAFTER_NEW_SCANhRqSH3k = Lock3ABehavior.Companion.m728getAFTER_NEW_SCANhRqSH3k();
        if (lock3ABehavior == null) {
            return false;
        }
        return Lock3ABehavior.m723equalsimpl0(lock3ABehavior.m726unboximpl(), iM728getAFTER_NEW_SCANhRqSH3k);
    }

    /* renamed from: shouldUnlockAf-t6FjEyI, reason: not valid java name */
    public static final boolean m1154shouldUnlockAft6FjEyI(Lock3ABehavior lock3ABehavior) {
        int iM728getAFTER_NEW_SCANhRqSH3k = Lock3ABehavior.Companion.m728getAFTER_NEW_SCANhRqSH3k();
        if (lock3ABehavior == null) {
            return false;
        }
        return Lock3ABehavior.m723equalsimpl0(lock3ABehavior.m726unboximpl(), iM728getAFTER_NEW_SCANhRqSH3k);
    }

    /* renamed from: shouldUnlockAwb-t6FjEyI, reason: not valid java name */
    public static final boolean m1155shouldUnlockAwbt6FjEyI(Lock3ABehavior lock3ABehavior) {
        int iM728getAFTER_NEW_SCANhRqSH3k = Lock3ABehavior.Companion.m728getAFTER_NEW_SCANhRqSH3k();
        if (lock3ABehavior == null) {
            return false;
        }
        return Lock3ABehavior.m723equalsimpl0(lock3ABehavior.m726unboximpl(), iM728getAFTER_NEW_SCANhRqSH3k);
    }

    /* renamed from: shouldWaitForAeToConverge-t6FjEyI, reason: not valid java name */
    public static final boolean m1156shouldWaitForAeToConverget6FjEyI(Lock3ABehavior lock3ABehavior) {
        if (lock3ABehavior != null) {
            return !Lock3ABehavior.m723equalsimpl0(lock3ABehavior.m726unboximpl(), Lock3ABehavior.Companion.m729getIMMEDIATEhRqSH3k());
        }
        return false;
    }

    /* renamed from: shouldWaitForAfToConverge-t6FjEyI, reason: not valid java name */
    public static final boolean m1157shouldWaitForAfToConverget6FjEyI(Lock3ABehavior lock3ABehavior) {
        if (lock3ABehavior != null) {
            return !Lock3ABehavior.m723equalsimpl0(lock3ABehavior.m726unboximpl(), Lock3ABehavior.Companion.m729getIMMEDIATEhRqSH3k());
        }
        return false;
    }

    /* renamed from: shouldWaitForAwbToConverge-t6FjEyI, reason: not valid java name */
    public static final boolean m1158shouldWaitForAwbToConverget6FjEyI(Lock3ABehavior lock3ABehavior) {
        if (lock3ABehavior != null) {
            return !Lock3ABehavior.m723equalsimpl0(lock3ABehavior.m726unboximpl(), Lock3ABehavior.Companion.m729getIMMEDIATEhRqSH3k());
        }
        return false;
    }
}
