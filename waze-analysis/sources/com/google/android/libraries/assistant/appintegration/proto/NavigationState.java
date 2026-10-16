package com.google.android.libraries.assistant.appintegration.proto;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum NavigationState implements eg {
    UNKNOWN(0),
    STOPPED(1),
    RUNNING_IN_BACKGROUND(3),
    GUIDED_NAVIGATION_IN_FOREGROUND(4),
    FREE_NAVIGATION_IN_FOREGROUND(5);

    public static final int FREE_NAVIGATION_IN_FOREGROUND_VALUE = 5;
    public static final int GUIDED_NAVIGATION_IN_FOREGROUND_VALUE = 4;
    public static final int RUNNING_IN_BACKGROUND_VALUE = 3;
    public static final int STOPPED_VALUE = 1;
    public static final int UNKNOWN_VALUE = 0;
    private static final eh<NavigationState> internalValueMap = new eh<NavigationState>() { // from class: com.google.android.libraries.assistant.appintegration.proto.NavigationState.1
        @Override // com.google.v.eh
        public NavigationState findValueByNumber(int i2) {
            return NavigationState.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class NavigationStateVerifier implements ei {
        static final ei INSTANCE = new NavigationStateVerifier();

        private NavigationStateVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return NavigationState.forNumber(i2) != null;
        }
    }

    NavigationState(int i2) {
        this.value = i2;
    }

    public static NavigationState forNumber(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return STOPPED;
        }
        if (i2 == 3) {
            return RUNNING_IN_BACKGROUND;
        }
        if (i2 == 4) {
            return GUIDED_NAVIGATION_IN_FOREGROUND;
        }
        if (i2 != 5) {
            return null;
        }
        return FREE_NAVIGATION_IN_FOREGROUND;
    }

    public static eh<NavigationState> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return NavigationStateVerifier.INSTANCE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.value);
    }
}
