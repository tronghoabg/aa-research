package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class on extends com.google.v.du<on, om> implements com.google.v.fj {
    private static final on DEFAULT_INSTANCE;
    public static final int IS_ELECTRIC_VEHICLE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<on> PARSER;
    private int bitField0_;
    private boolean isElectricVehicle_;

    static {
        on onVar = new on();
        DEFAULT_INSTANCE = onVar;
        com.google.v.du.registerDefaultInstance(on.class, onVar);
    }

    private on() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsElectricVehicle() {
        this.bitField0_ &= -2;
        this.isElectricVehicle_ = false;
    }

    public static on getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static om newBuilder() {
        return (om) DEFAULT_INSTANCE.createBuilder();
    }

    public static on parseDelimitedFrom(InputStream inputStream) {
        return (on) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static on parseFrom(com.google.v.v vVar) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<on> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsElectricVehicle(boolean z) {
        this.bitField0_ |= 1;
        this.isElectricVehicle_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "isElectricVehicle_"});
        }
        if (iOrdinal == 3) {
            return new on();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new om(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<on> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (on.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsElectricVehicle() {
        return this.isElectricVehicle_;
    }

    public boolean hasIsElectricVehicle() {
        return (this.bitField0_ & 1) != 0;
    }

    public static om newBuilder(on onVar) {
        return (om) DEFAULT_INSTANCE.createBuilder(onVar);
    }

    public static on parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (on) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static on parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static on parseFrom(com.google.v.z zVar) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static on parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static on parseFrom(InputStream inputStream) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static on parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static on parseFrom(ByteBuffer byteBuffer) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static on parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static on parseFrom(byte[] bArr) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static on parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (on) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
