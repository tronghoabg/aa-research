package com.waze.jni.protos.places;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum EventPlaceType implements eg {
    EVENT_PLACE_TYPE_NONE(0),
    EVENT_PLACE_TYPE_WAZE(1),
    EVENT_PLACE_TYPE_CALENDAR(2),
    EVENT_PLACE_TYPE_FUTURE_DRIVE(3),
    UNRECOGNIZED(-1);

    public static final int EVENT_PLACE_TYPE_CALENDAR_VALUE = 2;
    public static final int EVENT_PLACE_TYPE_FUTURE_DRIVE_VALUE = 3;
    public static final int EVENT_PLACE_TYPE_NONE_VALUE = 0;
    public static final int EVENT_PLACE_TYPE_WAZE_VALUE = 1;
    private static final eh<EventPlaceType> internalValueMap = new eh<EventPlaceType>() { // from class: com.waze.jni.protos.places.EventPlaceType.1
        @Override // com.google.v.eh
        public EventPlaceType findValueByNumber(int i2) {
            return EventPlaceType.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class EventPlaceTypeVerifier implements ei {
        static final ei INSTANCE = new EventPlaceTypeVerifier();

        private EventPlaceTypeVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return EventPlaceType.forNumber(i2) != null;
        }
    }

    EventPlaceType(int i2) {
        this.value = i2;
    }

    public static EventPlaceType forNumber(int i2) {
        if (i2 == 0) {
            return EVENT_PLACE_TYPE_NONE;
        }
        if (i2 == 1) {
            return EVENT_PLACE_TYPE_WAZE;
        }
        if (i2 == 2) {
            return EVENT_PLACE_TYPE_CALENDAR;
        }
        if (i2 != 3) {
            return null;
        }
        return EVENT_PLACE_TYPE_FUTURE_DRIVE;
    }

    public static eh<EventPlaceType> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return EventPlaceTypeVerifier.INSTANCE;
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
