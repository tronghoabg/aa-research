package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class tn extends com.google.v.du<tn, tm> implements com.google.v.fj {
    private static final tn DEFAULT_INSTANCE;
    public static final int ELECTRIC_VEHICLE_SLOTS_AVAILABLE_FIELD_NUMBER = 1;
    public static final int ELECTRIC_VEHICLE_SLOTS_CAPACITY_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<tn> PARSER;
    private int bitField0_;
    private long electricVehicleSlotsAvailable_;
    private long electricVehicleSlotsCapacity_;

    static {
        tn tnVar = new tn();
        DEFAULT_INSTANCE = tnVar;
        com.google.v.du.registerDefaultInstance(tn.class, tnVar);
    }

    private tn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElectricVehicleSlotsAvailable() {
        this.bitField0_ &= -2;
        this.electricVehicleSlotsAvailable_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElectricVehicleSlotsCapacity() {
        this.bitField0_ &= -3;
        this.electricVehicleSlotsCapacity_ = 0L;
    }

    public static tn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static tm newBuilder() {
        return (tm) DEFAULT_INSTANCE.createBuilder();
    }

    public static tn parseDelimitedFrom(InputStream inputStream) {
        return (tn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tn parseFrom(com.google.v.v vVar) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<tn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElectricVehicleSlotsAvailable(long j2) {
        this.bitField0_ |= 1;
        this.electricVehicleSlotsAvailable_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElectricVehicleSlotsCapacity(long j2) {
        this.bitField0_ |= 2;
        this.electricVehicleSlotsCapacity_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "electricVehicleSlotsAvailable_", "electricVehicleSlotsCapacity_"});
        }
        if (iOrdinal == 3) {
            return new tn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new tm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<tn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (tn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getElectricVehicleSlotsAvailable() {
        return this.electricVehicleSlotsAvailable_;
    }

    public long getElectricVehicleSlotsCapacity() {
        return this.electricVehicleSlotsCapacity_;
    }

    public boolean hasElectricVehicleSlotsAvailable() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasElectricVehicleSlotsCapacity() {
        return (this.bitField0_ & 2) != 0;
    }

    public static tm newBuilder(tn tnVar) {
        return (tm) DEFAULT_INSTANCE.createBuilder(tnVar);
    }

    public static tn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static tn parseFrom(com.google.v.z zVar) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static tn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static tn parseFrom(InputStream inputStream) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tn parseFrom(ByteBuffer byteBuffer) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static tn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static tn parseFrom(byte[] bArr) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static tn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
