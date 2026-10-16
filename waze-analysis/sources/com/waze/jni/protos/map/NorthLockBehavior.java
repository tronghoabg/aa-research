package com.waze.jni.protos.map;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum NorthLockBehavior implements eg {
    UNLOCKED(0),
    STRONG_LOCK(1),
    WEAK_LOCK_WITH_AUTOMATIC_UNLOCK(2),
    UNRECOGNIZED(-1);

    public static final int STRONG_LOCK_VALUE = 1;
    public static final int UNLOCKED_VALUE = 0;
    public static final int WEAK_LOCK_WITH_AUTOMATIC_UNLOCK_VALUE = 2;
    private static final eh<NorthLockBehavior> internalValueMap = new eh<NorthLockBehavior>() { // from class: com.waze.jni.protos.map.NorthLockBehavior.1
        @Override // com.google.v.eh
        public NorthLockBehavior findValueByNumber(int i2) {
            return NorthLockBehavior.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class NorthLockBehaviorVerifier implements ei {
        static final ei INSTANCE = new NorthLockBehaviorVerifier();

        private NorthLockBehaviorVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return NorthLockBehavior.forNumber(i2) != null;
        }
    }

    NorthLockBehavior(int i2) {
        this.value = i2;
    }

    public static NorthLockBehavior forNumber(int i2) {
        if (i2 == 0) {
            return UNLOCKED;
        }
        if (i2 == 1) {
            return STRONG_LOCK;
        }
        if (i2 != 2) {
            return null;
        }
        return WEAK_LOCK_WITH_AUTOMATIC_UNLOCK;
    }

    public static eh<NorthLockBehavior> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return NorthLockBehaviorVerifier.INSTANCE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.value);
    }
}
