package com.waze.jni.protos.network;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum TransactionQueueId implements eg {
    General(0),
    Routing(1),
    Background(2),
    Register(3),
    DriveSuggestions(4),
    GeoConfig(5),
    Username(6),
    RoutingUpdate(7),
    UNRECOGNIZED(-1);

    public static final int Background_VALUE = 2;
    public static final int DriveSuggestions_VALUE = 4;
    public static final int General_VALUE = 0;
    public static final int GeoConfig_VALUE = 5;
    public static final int Register_VALUE = 3;
    public static final int RoutingUpdate_VALUE = 7;
    public static final int Routing_VALUE = 1;
    public static final int Username_VALUE = 6;
    private static final eh<TransactionQueueId> internalValueMap = new eh<TransactionQueueId>() { // from class: com.waze.jni.protos.network.TransactionQueueId.1
        @Override // com.google.v.eh
        public TransactionQueueId findValueByNumber(int i2) {
            return TransactionQueueId.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class TransactionQueueIdVerifier implements ei {
        static final ei INSTANCE = new TransactionQueueIdVerifier();

        private TransactionQueueIdVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return TransactionQueueId.forNumber(i2) != null;
        }
    }

    TransactionQueueId(int i2) {
        this.value = i2;
    }

    public static TransactionQueueId forNumber(int i2) {
        switch (i2) {
            case 0:
                return General;
            case 1:
                return Routing;
            case 2:
                return Background;
            case 3:
                return Register;
            case 4:
                return DriveSuggestions;
            case 5:
                return GeoConfig;
            case 6:
                return Username;
            case 7:
                return RoutingUpdate;
            default:
                return null;
        }
    }

    public static eh<TransactionQueueId> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return TransactionQueueIdVerifier.INSTANCE;
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
