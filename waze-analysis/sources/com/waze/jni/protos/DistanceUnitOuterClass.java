package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DistanceUnitOuterClass {

    /* compiled from: WazeSource */
    public enum DistanceUnit implements eg {
        Meters(0),
        Kilometers(1),
        Feet(2),
        Miles(3),
        UNRECOGNIZED(-1);

        public static final int Feet_VALUE = 2;
        public static final int Kilometers_VALUE = 1;
        public static final int Meters_VALUE = 0;
        public static final int Miles_VALUE = 3;
        private static final eh<DistanceUnit> internalValueMap = new eh<DistanceUnit>() { // from class: com.waze.jni.protos.DistanceUnitOuterClass.DistanceUnit.1
            @Override // com.google.v.eh
            public DistanceUnit findValueByNumber(int i2) {
                return DistanceUnit.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class DistanceUnitVerifier implements ei {
            static final ei INSTANCE = new DistanceUnitVerifier();

            private DistanceUnitVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return DistanceUnit.forNumber(i2) != null;
            }
        }

        DistanceUnit(int i2) {
            this.value = i2;
        }

        public static DistanceUnit forNumber(int i2) {
            if (i2 == 0) {
                return Meters;
            }
            if (i2 == 1) {
                return Kilometers;
            }
            if (i2 == 2) {
                return Feet;
            }
            if (i2 != 3) {
                return null;
            }
            return Miles;
        }

        public static eh<DistanceUnit> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return DistanceUnitVerifier.INSTANCE;
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

    private DistanceUnitOuterClass() {
    }

    public static void registerAllExtensions(de deVar) {
    }
}
