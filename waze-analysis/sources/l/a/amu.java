package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class amu extends com.google.v.du<amu, amt> implements com.google.v.fj {
    private static final amu DEFAULT_INSTANCE;
    public static final int NUMBER_OF_INSTRUCTION_LANES_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<amu> PARSER = null;
    public static final int ROUNDABOUT_TOTAL_LANES_FIELD_NUMBER = 2;
    public static final int SEGMENT_INSTRUCTION_FIELD_NUMBER = 1;
    private int bitField0_;
    private long numberOfInstructionLanes_;
    private long roundaboutTotalLanes_;
    private int segmentInstruction_;

    static {
        amu amuVar = new amu();
        DEFAULT_INSTANCE = amuVar;
        com.google.v.du.registerDefaultInstance(amu.class, amuVar);
    }

    private amu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumberOfInstructionLanes() {
        this.bitField0_ &= -3;
        this.numberOfInstructionLanes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoundaboutTotalLanes() {
        this.bitField0_ &= -2;
        this.roundaboutTotalLanes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentInstruction() {
        this.segmentInstruction_ = 0;
    }

    public static amu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static amt newBuilder() {
        return (amt) DEFAULT_INSTANCE.createBuilder();
    }

    public static amu parseDelimitedFrom(InputStream inputStream) {
        return (amu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static amu parseFrom(com.google.v.v vVar) {
        return (amu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<amu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberOfInstructionLanes(long j2) {
        this.bitField0_ |= 2;
        this.numberOfInstructionLanes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoundaboutTotalLanes(long j2) {
        this.bitField0_ |= 1;
        this.roundaboutTotalLanes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentInstruction(baf bafVar) {
        this.segmentInstruction_ = bafVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentInstructionValue(int i2) {
        this.segmentInstruction_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဂ\u0000\u0003ဂ\u0001", new Object[]{"bitField0_", "segmentInstruction_", "roundaboutTotalLanes_", "numberOfInstructionLanes_"});
        }
        if (iOrdinal == 3) {
            return new amu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new amt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<amu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (amu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getNumberOfInstructionLanes() {
        return this.numberOfInstructionLanes_;
    }

    public long getRoundaboutTotalLanes() {
        return this.roundaboutTotalLanes_;
    }

    public baf getSegmentInstruction() {
        baf bafVarA = baf.a(this.segmentInstruction_);
        return bafVarA == null ? baf.UNRECOGNIZED : bafVarA;
    }

    public int getSegmentInstructionValue() {
        return this.segmentInstruction_;
    }

    public boolean hasNumberOfInstructionLanes() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRoundaboutTotalLanes() {
        return (this.bitField0_ & 1) != 0;
    }

    public static amt newBuilder(amu amuVar) {
        return (amt) DEFAULT_INSTANCE.createBuilder(amuVar);
    }

    public static amu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (amu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static amu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (amu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static amu parseFrom(com.google.v.z zVar) {
        return (amu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static amu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (amu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static amu parseFrom(InputStream inputStream) {
        return (amu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static amu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (amu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static amu parseFrom(ByteBuffer byteBuffer) {
        return (amu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static amu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (amu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static amu parseFrom(byte[] bArr) {
        return (amu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static amu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (amu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
