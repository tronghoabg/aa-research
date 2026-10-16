package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aev extends com.google.v.du<aev, aeu> implements com.google.v.fj {
    private static final aev DEFAULT_INSTANCE;
    public static final int EXIT_NUMBER_FIELD_NUMBER = 7;
    public static final int LANE_INSTRUCTION_FIELD_NUMBER = 2;
    public static final int LANE_LOCATION_FIELD_NUMBER = 4;
    public static final int LANE_TYPE_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<aev> PARSER = null;
    public static final int ROAD_TYPE_FIELD_NUMBER = 6;
    public static final int STREET_NAME_FIELD_NUMBER = 3;
    public static final int TURN_INSTRUCTION_FIELD_NUMBER = 1;
    private int bitField0_;
    private int exitNumber_;
    private String turnInstruction_ = "";
    private String laneInstruction_ = "";
    private String streetName_ = "";
    private String laneLocation_ = "";
    private String laneType_ = "";
    private String roadType_ = "";

    static {
        aev aevVar = new aev();
        DEFAULT_INSTANCE = aevVar;
        com.google.v.du.registerDefaultInstance(aev.class, aevVar);
    }

    private aev() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExitNumber() {
        this.bitField0_ &= -9;
        this.exitNumber_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneInstruction() {
        this.laneInstruction_ = getDefaultInstance().getLaneInstruction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneLocation() {
        this.bitField0_ &= -2;
        this.laneLocation_ = getDefaultInstance().getLaneLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneType() {
        this.bitField0_ &= -3;
        this.laneType_ = getDefaultInstance().getLaneType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadType() {
        this.bitField0_ &= -5;
        this.roadType_ = getDefaultInstance().getRoadType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreetName() {
        this.streetName_ = getDefaultInstance().getStreetName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTurnInstruction() {
        this.turnInstruction_ = getDefaultInstance().getTurnInstruction();
    }

    public static aev getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aeu newBuilder() {
        return (aeu) DEFAULT_INSTANCE.createBuilder();
    }

    public static aev parseDelimitedFrom(InputStream inputStream) {
        return (aev) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aev parseFrom(com.google.v.v vVar) {
        return (aev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aev> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExitNumber(int i2) {
        this.bitField0_ |= 8;
        this.exitNumber_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneInstruction(String str) {
        Objects.requireNonNull(str);
        this.laneInstruction_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneInstructionBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.laneInstruction_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneLocation(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.laneLocation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneLocationBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.laneLocation_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.laneType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneTypeBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.laneType_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.roadType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadTypeBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.roadType_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetName(String str) {
        Objects.requireNonNull(str);
        this.streetName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.streetName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTurnInstruction(String str) {
        Objects.requireNonNull(str);
        this.turnInstruction_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTurnInstructionBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.turnInstruction_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ለ\u0000\u0005ለ\u0001\u0006ለ\u0002\u0007င\u0003", new Object[]{"bitField0_", "turnInstruction_", "laneInstruction_", "streetName_", "laneLocation_", "laneType_", "roadType_", "exitNumber_"});
        }
        if (iOrdinal == 3) {
            return new aev();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aeu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aev> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aev.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getExitNumber() {
        return this.exitNumber_;
    }

    public String getLaneInstruction() {
        return this.laneInstruction_;
    }

    public com.google.v.v getLaneInstructionBytes() {
        return com.google.v.v.s(this.laneInstruction_);
    }

    public String getLaneLocation() {
        return this.laneLocation_;
    }

    public com.google.v.v getLaneLocationBytes() {
        return com.google.v.v.s(this.laneLocation_);
    }

    public String getLaneType() {
        return this.laneType_;
    }

    public com.google.v.v getLaneTypeBytes() {
        return com.google.v.v.s(this.laneType_);
    }

    public String getRoadType() {
        return this.roadType_;
    }

    public com.google.v.v getRoadTypeBytes() {
        return com.google.v.v.s(this.roadType_);
    }

    public String getStreetName() {
        return this.streetName_;
    }

    public com.google.v.v getStreetNameBytes() {
        return com.google.v.v.s(this.streetName_);
    }

    public String getTurnInstruction() {
        return this.turnInstruction_;
    }

    public com.google.v.v getTurnInstructionBytes() {
        return com.google.v.v.s(this.turnInstruction_);
    }

    public boolean hasExitNumber() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLaneLocation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLaneType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRoadType() {
        return (this.bitField0_ & 4) != 0;
    }

    public static aeu newBuilder(aev aevVar) {
        return (aeu) DEFAULT_INSTANCE.createBuilder(aevVar);
    }

    public static aev parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aev) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aev parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aev parseFrom(com.google.v.z zVar) {
        return (aev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aev parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aev parseFrom(InputStream inputStream) {
        return (aev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aev parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aev parseFrom(ByteBuffer byteBuffer) {
        return (aev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aev parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aev parseFrom(byte[] bArr) {
        return (aev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aev parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
