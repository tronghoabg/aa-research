package com.waze.jni.protos;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum BusinessStatus implements eg {
    BUSINESS_STATUS_UNSPECIFIED(0),
    OPERATIONAL(1),
    TEMPORARILY_CLOSED(2),
    PERMANENTLY_CLOSED(3),
    UNRECOGNIZED(-1);

    public static final int BUSINESS_STATUS_UNSPECIFIED_VALUE = 0;
    public static final int OPERATIONAL_VALUE = 1;
    public static final int PERMANENTLY_CLOSED_VALUE = 3;
    public static final int TEMPORARILY_CLOSED_VALUE = 2;
    private static final eh<BusinessStatus> internalValueMap = new eh<BusinessStatus>() { // from class: com.waze.jni.protos.BusinessStatus.1
        @Override // com.google.v.eh
        public BusinessStatus findValueByNumber(int i2) {
            return BusinessStatus.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class BusinessStatusVerifier implements ei {
        static final ei INSTANCE = new BusinessStatusVerifier();

        private BusinessStatusVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return BusinessStatus.forNumber(i2) != null;
        }
    }

    BusinessStatus(int i2) {
        this.value = i2;
    }

    public static BusinessStatus forNumber(int i2) {
        if (i2 == 0) {
            return BUSINESS_STATUS_UNSPECIFIED;
        }
        if (i2 == 1) {
            return OPERATIONAL;
        }
        if (i2 == 2) {
            return TEMPORARILY_CLOSED;
        }
        if (i2 != 3) {
            return null;
        }
        return PERMANENTLY_CLOSED;
    }

    public static eh<BusinessStatus> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return BusinessStatusVerifier.INSTANCE;
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
