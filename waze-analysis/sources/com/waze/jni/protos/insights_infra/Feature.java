package com.waze.jni.protos.insights_infra;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum Feature implements eg {
    FEATURE_UNSPECIFIED(0),
    FEATURE_CYCLISTS(1),
    UNRECOGNIZED(-1);

    public static final int FEATURE_CYCLISTS_VALUE = 1;
    public static final int FEATURE_UNSPECIFIED_VALUE = 0;
    private static final eh<Feature> internalValueMap = new eh<Feature>() { // from class: com.waze.jni.protos.insights_infra.Feature.1
        @Override // com.google.v.eh
        public Feature findValueByNumber(int i2) {
            return Feature.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class FeatureVerifier implements ei {
        static final ei INSTANCE = new FeatureVerifier();

        private FeatureVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return Feature.forNumber(i2) != null;
        }
    }

    Feature(int i2) {
        this.value = i2;
    }

    public static Feature forNumber(int i2) {
        if (i2 == 0) {
            return FEATURE_UNSPECIFIED;
        }
        if (i2 != 1) {
            return null;
        }
        return FEATURE_CYCLISTS;
    }

    public static eh<Feature> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return FeatureVerifier.INSTANCE;
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
