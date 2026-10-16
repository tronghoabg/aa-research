package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class eu extends com.google.v.du<eu, et> implements com.google.v.fj {
    private static final eu DEFAULT_INSTANCE;
    public static final int INCLUDE_AND_THEN_FIELD_NUMBER = 3;
    public static final int INCLUDE_AND_THEN_LANE_INSTRUCTION_FIELD_NUMBER = 6;
    public static final int INCLUDE_AND_THEN_STREET_NAME_FIELD_NUMBER = 5;
    public static final int INCLUDE_DISTANCE_FIELD_NUMBER = 4;
    public static final int INCLUDE_LANE_INSTRUCTION_FIELD_NUMBER = 2;
    public static final int INCLUDE_STREET_NAME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<eu> PARSER;
    private int bitField0_;
    private boolean includeAndThenLaneInstruction_;
    private boolean includeAndThenStreetName_;
    private boolean includeAndThen_;
    private boolean includeDistance_;
    private boolean includeLaneInstruction_;
    private boolean includeStreetName_;

    static {
        eu euVar = new eu();
        DEFAULT_INSTANCE = euVar;
        com.google.v.du.registerDefaultInstance(eu.class, euVar);
    }

    private eu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncludeAndThen() {
        this.bitField0_ &= -5;
        this.includeAndThen_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncludeAndThenLaneInstruction() {
        this.bitField0_ &= -33;
        this.includeAndThenLaneInstruction_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncludeAndThenStreetName() {
        this.bitField0_ &= -17;
        this.includeAndThenStreetName_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncludeDistance() {
        this.bitField0_ &= -9;
        this.includeDistance_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncludeLaneInstruction() {
        this.bitField0_ &= -3;
        this.includeLaneInstruction_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncludeStreetName() {
        this.bitField0_ &= -2;
        this.includeStreetName_ = false;
    }

    public static eu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static et newBuilder() {
        return (et) DEFAULT_INSTANCE.createBuilder();
    }

    public static eu parseDelimitedFrom(InputStream inputStream) {
        return (eu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eu parseFrom(com.google.v.v vVar) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<eu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncludeAndThen(boolean z) {
        this.bitField0_ |= 4;
        this.includeAndThen_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncludeAndThenLaneInstruction(boolean z) {
        this.bitField0_ |= 32;
        this.includeAndThenLaneInstruction_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncludeAndThenStreetName(boolean z) {
        this.bitField0_ |= 16;
        this.includeAndThenStreetName_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncludeDistance(boolean z) {
        this.bitField0_ |= 8;
        this.includeDistance_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncludeLaneInstruction(boolean z) {
        this.bitField0_ |= 2;
        this.includeLaneInstruction_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncludeStreetName(boolean z) {
        this.bitField0_ |= 1;
        this.includeStreetName_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "includeStreetName_", "includeLaneInstruction_", "includeAndThen_", "includeDistance_", "includeAndThenStreetName_", "includeAndThenLaneInstruction_"});
        }
        if (iOrdinal == 3) {
            return new eu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new et(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<eu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (eu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIncludeAndThen() {
        return this.includeAndThen_;
    }

    public boolean getIncludeAndThenLaneInstruction() {
        return this.includeAndThenLaneInstruction_;
    }

    public boolean getIncludeAndThenStreetName() {
        return this.includeAndThenStreetName_;
    }

    public boolean getIncludeDistance() {
        return this.includeDistance_;
    }

    public boolean getIncludeLaneInstruction() {
        return this.includeLaneInstruction_;
    }

    public boolean getIncludeStreetName() {
        return this.includeStreetName_;
    }

    public boolean hasIncludeAndThen() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIncludeAndThenLaneInstruction() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasIncludeAndThenStreetName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasIncludeDistance() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIncludeLaneInstruction() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIncludeStreetName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static et newBuilder(eu euVar) {
        return (et) DEFAULT_INSTANCE.createBuilder(euVar);
    }

    public static eu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static eu parseFrom(com.google.v.z zVar) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static eu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static eu parseFrom(InputStream inputStream) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eu parseFrom(ByteBuffer byteBuffer) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static eu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static eu parseFrom(byte[] bArr) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static eu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
