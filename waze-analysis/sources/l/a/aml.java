package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aml extends com.google.v.du<aml, amk> implements amm {
    private static final aml DEFAULT_INSTANCE;
    public static final int INSTRUCTION_FIELD_NUMBER = 1;
    public static final int INSTRUCTION_LANES_COUNT_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<aml> PARSER = null;
    public static final int TOTAL_LANES_COUNT_FIELD_NUMBER = 2;
    private int bitField0_;
    private long instructionLanesCount_;
    private int instruction_;
    private long totalLanesCount_;

    static {
        aml amlVar = new aml();
        DEFAULT_INSTANCE = amlVar;
        com.google.v.du.registerDefaultInstance(aml.class, amlVar);
    }

    private aml() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstruction() {
        this.instruction_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstructionLanesCount() {
        this.bitField0_ &= -3;
        this.instructionLanesCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalLanesCount() {
        this.bitField0_ &= -2;
        this.totalLanesCount_ = 0L;
    }

    public static aml getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static amk newBuilder() {
        return (amk) DEFAULT_INSTANCE.createBuilder();
    }

    public static aml parseDelimitedFrom(InputStream inputStream) {
        return (aml) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aml parseFrom(com.google.v.v vVar) {
        return (aml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aml> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstruction(baf bafVar) {
        this.instruction_ = bafVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstructionLanesCount(long j2) {
        this.bitField0_ |= 2;
        this.instructionLanesCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstructionValue(int i2) {
        this.instruction_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalLanesCount(long j2) {
        this.bitField0_ |= 1;
        this.totalLanesCount_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဂ\u0000\u0003ဂ\u0001", new Object[]{"bitField0_", "instruction_", "totalLanesCount_", "instructionLanesCount_"});
        }
        if (iOrdinal == 3) {
            return new aml();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new amk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aml> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aml.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public baf getInstruction() {
        baf bafVarA = baf.a(this.instruction_);
        return bafVarA == null ? baf.UNRECOGNIZED : bafVarA;
    }

    public long getInstructionLanesCount() {
        return this.instructionLanesCount_;
    }

    public int getInstructionValue() {
        return this.instruction_;
    }

    public long getTotalLanesCount() {
        return this.totalLanesCount_;
    }

    public boolean hasInstructionLanesCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTotalLanesCount() {
        return (this.bitField0_ & 1) != 0;
    }

    public static amk newBuilder(aml amlVar) {
        return (amk) DEFAULT_INSTANCE.createBuilder(amlVar);
    }

    public static aml parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aml) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aml parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aml parseFrom(com.google.v.z zVar) {
        return (aml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aml parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aml parseFrom(InputStream inputStream) {
        return (aml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aml parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aml parseFrom(ByteBuffer byteBuffer) {
        return (aml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aml parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aml parseFrom(byte[] bArr) {
        return (aml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aml parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
