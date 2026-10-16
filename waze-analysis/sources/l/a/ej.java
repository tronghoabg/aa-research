package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ej extends com.google.v.du<ej, ei> implements com.google.v.fj {
    private static final ej DEFAULT_INSTANCE;
    public static final int NEXT_GROUP_CROSS_TIME_SECONDS_FIELD_NUMBER = 2;
    public static final int NEXT_GROUP_DISTANCE_METERS_FIELD_NUMBER = 3;
    public static final int NEXT_INSTRUCTION_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ej> PARSER;
    private int bitField0_;
    private int nextGroupCrossTimeSeconds_;
    private int nextGroupDistanceMeters_;
    private aev nextInstruction_;

    static {
        ej ejVar = new ej();
        DEFAULT_INSTANCE = ejVar;
        com.google.v.du.registerDefaultInstance(ej.class, ejVar);
    }

    private ej() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextGroupCrossTimeSeconds() {
        this.nextGroupCrossTimeSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextGroupDistanceMeters() {
        this.nextGroupDistanceMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextInstruction() {
        this.nextInstruction_ = null;
        this.bitField0_ &= -2;
    }

    public static ej getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNextInstruction(aev aevVar) {
        Objects.requireNonNull(aevVar);
        aev aevVar2 = this.nextInstruction_;
        if (aevVar2 != null && aevVar2 != aev.getDefaultInstance()) {
            aeu aeuVarNewBuilder = aev.newBuilder(aevVar2);
            aeuVarNewBuilder.mergeFrom((aeu) aevVar);
            aevVar = aeuVarNewBuilder.buildPartial();
        }
        this.nextInstruction_ = aevVar;
        this.bitField0_ |= 1;
    }

    public static ei newBuilder() {
        return (ei) DEFAULT_INSTANCE.createBuilder();
    }

    public static ej parseDelimitedFrom(InputStream inputStream) {
        return (ej) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ej parseFrom(com.google.v.v vVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ej> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextGroupCrossTimeSeconds(int i2) {
        this.nextGroupCrossTimeSeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextGroupDistanceMeters(int i2) {
        this.nextGroupDistanceMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextInstruction(aev aevVar) {
        Objects.requireNonNull(aevVar);
        this.nextInstruction_ = aevVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004\u0003\u0004", new Object[]{"bitField0_", "nextInstruction_", "nextGroupCrossTimeSeconds_", "nextGroupDistanceMeters_"});
        }
        if (iOrdinal == 3) {
            return new ej();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ei(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ej> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ej.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getNextGroupCrossTimeSeconds() {
        return this.nextGroupCrossTimeSeconds_;
    }

    public int getNextGroupDistanceMeters() {
        return this.nextGroupDistanceMeters_;
    }

    public aev getNextInstruction() {
        aev aevVar = this.nextInstruction_;
        return aevVar == null ? aev.getDefaultInstance() : aevVar;
    }

    public boolean hasNextInstruction() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ei newBuilder(ej ejVar) {
        return (ei) DEFAULT_INSTANCE.createBuilder(ejVar);
    }

    public static ej parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ej) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ej parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ej parseFrom(com.google.v.z zVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ej parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ej parseFrom(InputStream inputStream) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ej parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ej parseFrom(ByteBuffer byteBuffer) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ej parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ej parseFrom(byte[] bArr) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ej parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
