package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ay extends com.google.v.du<ay, ax> implements az {
    public static final int AVAILABLE_COUNT_FIELD_NUMBER = 4;
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final ay DEFAULT_INSTANCE;
    public static final int EV_CONNECTOR_FIELD_NUMBER = 1;
    public static final int MAX_POWER_KW_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ay> PARSER;
    private int availableCount_;
    private int bitField0_;
    private int count_;
    private aw evConnector_;
    private float maxPowerKw_;

    static {
        ay ayVar = new ay();
        DEFAULT_INSTANCE = ayVar;
        com.google.v.du.registerDefaultInstance(ay.class, ayVar);
    }

    private ay() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailableCount() {
        this.bitField0_ &= -9;
        this.availableCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.bitField0_ &= -3;
        this.count_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvConnector() {
        this.evConnector_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxPowerKw() {
        this.bitField0_ &= -5;
        this.maxPowerKw_ = 0.0f;
    }

    public static ay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvConnector(aw awVar) {
        Objects.requireNonNull(awVar);
        aw awVar2 = this.evConnector_;
        if (awVar2 != null && awVar2 != aw.getDefaultInstance()) {
            av avVarNewBuilder = aw.newBuilder(awVar2);
            avVarNewBuilder.mergeFrom((av) awVar);
            awVar = avVarNewBuilder.buildPartial();
        }
        this.evConnector_ = awVar;
        this.bitField0_ |= 1;
    }

    public static ax newBuilder() {
        return (ax) DEFAULT_INSTANCE.createBuilder();
    }

    public static ay parseDelimitedFrom(InputStream inputStream) {
        return (ay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ay parseFrom(com.google.v.v vVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ay> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableCount(int i2) {
        this.bitField0_ |= 8;
        this.availableCount_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(int i2) {
        this.bitField0_ |= 2;
        this.count_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvConnector(aw awVar) {
        Objects.requireNonNull(awVar);
        this.evConnector_ = awVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxPowerKw(float f2) {
        this.bitField0_ |= 4;
        this.maxPowerKw_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ခ\u0002\u0004င\u0003", new Object[]{"bitField0_", "evConnector_", "count_", "maxPowerKw_", "availableCount_"});
        }
        if (iOrdinal == 3) {
            return new ay();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ax(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ay> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ay.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getAvailableCount() {
        return this.availableCount_;
    }

    public int getCount() {
        return this.count_;
    }

    public aw getEvConnector() {
        aw awVar = this.evConnector_;
        return awVar == null ? aw.getDefaultInstance() : awVar;
    }

    public float getMaxPowerKw() {
        return this.maxPowerKw_;
    }

    public boolean hasAvailableCount() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasEvConnector() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMaxPowerKw() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ax newBuilder(ay ayVar) {
        return (ax) DEFAULT_INSTANCE.createBuilder(ayVar);
    }

    public static ay parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ay parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ay parseFrom(com.google.v.z zVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ay parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ay parseFrom(InputStream inputStream) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ay parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ay parseFrom(ByteBuffer byteBuffer) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ay parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ay parseFrom(byte[] bArr) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ay parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
