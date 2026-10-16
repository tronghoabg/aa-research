package com.waze.jni.protos.places;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum FavoritePlaceType implements eg {
    FAVORITE_PLACE_TYPE_DEFAULT(0),
    FAVORITE_PLACE_TYPE_HOME(1),
    FAVORITE_PLACE_TYPE_WORK(2),
    FAVORITE_PLACE_TYPE_OTHER(3),
    UNRECOGNIZED(-1);

    public static final int FAVORITE_PLACE_TYPE_DEFAULT_VALUE = 0;
    public static final int FAVORITE_PLACE_TYPE_HOME_VALUE = 1;
    public static final int FAVORITE_PLACE_TYPE_OTHER_VALUE = 3;
    public static final int FAVORITE_PLACE_TYPE_WORK_VALUE = 2;
    private static final eh<FavoritePlaceType> internalValueMap = new eh<FavoritePlaceType>() { // from class: com.waze.jni.protos.places.FavoritePlaceType.1
        @Override // com.google.v.eh
        public FavoritePlaceType findValueByNumber(int i2) {
            return FavoritePlaceType.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class FavoritePlaceTypeVerifier implements ei {
        static final ei INSTANCE = new FavoritePlaceTypeVerifier();

        private FavoritePlaceTypeVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return FavoritePlaceType.forNumber(i2) != null;
        }
    }

    FavoritePlaceType(int i2) {
        this.value = i2;
    }

    public static FavoritePlaceType forNumber(int i2) {
        if (i2 == 0) {
            return FAVORITE_PLACE_TYPE_DEFAULT;
        }
        if (i2 == 1) {
            return FAVORITE_PLACE_TYPE_HOME;
        }
        if (i2 == 2) {
            return FAVORITE_PLACE_TYPE_WORK;
        }
        if (i2 != 3) {
            return null;
        }
        return FAVORITE_PLACE_TYPE_OTHER;
    }

    public static eh<FavoritePlaceType> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return FavoritePlaceTypeVerifier.INSTANCE;
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
