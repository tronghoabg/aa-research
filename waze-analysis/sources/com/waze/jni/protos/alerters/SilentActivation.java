package com.waze.jni.protos.alerters;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum SilentActivation implements eg {
    Experiment(0),
    Familiar(1),
    Grouped(2),
    UNRECOGNIZED(-1);

    public static final int Experiment_VALUE = 0;
    public static final int Familiar_VALUE = 1;
    public static final int Grouped_VALUE = 2;
    private static final eh<SilentActivation> internalValueMap = new eh<SilentActivation>() { // from class: com.waze.jni.protos.alerters.SilentActivation.1
        @Override // com.google.v.eh
        public SilentActivation findValueByNumber(int i2) {
            return SilentActivation.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class SilentActivationVerifier implements ei {
        static final ei INSTANCE = new SilentActivationVerifier();

        private SilentActivationVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return SilentActivation.forNumber(i2) != null;
        }
    }

    SilentActivation(int i2) {
        this.value = i2;
    }

    public static SilentActivation forNumber(int i2) {
        if (i2 == 0) {
            return Experiment;
        }
        if (i2 == 1) {
            return Familiar;
        }
        if (i2 != 2) {
            return null;
        }
        return Grouped;
    }

    public static eh<SilentActivation> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return SilentActivationVerifier.INSTANCE;
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
